package com.stackroute.keywords.files;
// NIO provides high-speed, block-oriented I/O in standard Java code.
// By defining classes to hold data, and by processing that data in blocks,
// NIO takes advantage of low-level optimizations in a way that the original I/O package could not,
// without using native code.
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

public class FileHandelingNIO {
    public static void main(String[] args) throws IOException
    {
        RandomAccessFile aFile = new RandomAccessFile
                ("/home/cgi/Desktop/test.txt", "r");
        FileChannel inChannel = aFile.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        while(inChannel.read(buffer) > 0)
        {
            buffer.flip();
            for (int i = 0; i < buffer.limit(); i++)
            {
                System.out.print((char) buffer.get());
            }
            // do something with the data and clear/compact it.
            buffer.clear();
        }
        inChannel.close();
        aFile.close();
    }
}

