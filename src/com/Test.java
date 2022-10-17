package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @title
 * @ClassName Test
 * @Date 2022/8/1 22:20
 */

public class Test {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D://test/kobe.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("demo-1/test/aaa.jpg");

        byte[] bytes = new byte[1024];

        int len = 1;

        while ((len = fileInputStream.read(bytes))!= -1){
            fileOutputStream.write(bytes, 0, len);
        }


    }
}
