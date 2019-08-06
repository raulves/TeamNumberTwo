package com.tieto.geekoff.warmup;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;

public class FileDriver {

    public static void writeToFile(String data,String filePath,boolean appendToFile) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath,appendToFile);
        fileWriter.write(data);
        fileWriter.close();
    }

    public static String readFromFile(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        CharBuffer charBuffer = CharBuffer.allocate(50);
        fileReader.read(charBuffer);
        //flip char buffer
        charBuffer.flip();
        fileReader.close();
        return charBuffer.toString();
    }

}
