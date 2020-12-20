package com.wangcheng.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;

/**
 * description:
 *
 * @author WangCheng
 * create in 2020-09-03 18:24
 */
public class NioServer {

    public static void main(String[] args) throws IOException {
        ServerSocketChannel ssc = ServerSocketChannel.open();
        ssc.socket().bind(new InetSocketAddress(8080));
        //设置为非阻塞模式
        ssc.configureBlocking(false);

        Selector selector = Selector.open();
        ssc.register(selector, SelectionKey.OP_ACCEPT);

        while (true) {
            if (selector.select(3000) == 0) {
                System.out.println("等待请求超时...");
                continue;
            }

            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();

                if (key.isAcceptable()) {
                    SocketChannel sc = ((ServerSocketChannel) key.channel()).accept();
                    sc.configureBlocking(false);
                    sc.register(key.selector(), SelectionKey.OP_READ, ByteBuffer.allocate(1024));
                }

                if (key.isReadable()) {
                    SocketChannel sc = ((ServerSocketChannel) key.channel()).accept();
                    ByteBuffer buffer = (ByteBuffer) key.attachment();
                    buffer.clear();

                    if (sc.read(buffer) == -1) {
                        sc.close();
                    } else {
                        buffer.flip();
                        String receivedString = StandardCharsets.UTF_8.newDecoder().decode(buffer).toString();
                        System.out.println("received from client:" + receivedString);

                        String sendData = "received data:" + receivedString;
                        buffer = ByteBuffer.wrap(sendData.getBytes(StandardCharsets.UTF_8));
                        sc.write(buffer);
                        sc.close();
                    }
                }

                iterator.remove();

            }

        }

    }

}
