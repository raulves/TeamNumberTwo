package com.tieto.geekoff.warmup.test;

import com.tieto.geekoff.warmup.Config;
import com.tieto.geekoff.warmup.FileDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.io.IOException;

import static org.junit.Assert.*;

public class FileDriverTest {

    @BeforeClass
    public static void setup() {
        try {
            FileDriver.writeToFile("", Config.TEXT_FILE_PATH,false);
        }catch (Exception e){

        }
    }

    @org.junit.Test
    public void writeToFile() {
        try {
            FileDriver.writeToFile(Config.TEXT_FILE_PATH, Config.TEXT_FILE_PATH,false);
        }catch (Exception e){

        }
    }

    @org.junit.Test
    public void readFromFile() {
       try {
           assertEquals(Config.TEXT_FILE_PATH, FileDriver.readFromFile(Config.TEXT_FILE_PATH));
       }catch (Exception e){

       }
    }

    @AfterClass
    public static void tearDown() {
        try {
            FileDriver.writeToFile("", Config.TEXT_FILE_PATH,false);
        }catch (Exception e){

        }
    }
}