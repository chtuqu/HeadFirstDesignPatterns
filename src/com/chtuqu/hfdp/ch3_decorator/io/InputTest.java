package com.chtuqu.hfdp.ch3_decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream is =
                    new LowerCaseInputStream(
                            new BufferedInputStream(new FileInputStream("test.txt")));

            while ((c = is.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
