package com.tieto.geekoff.warmup.test;

import com.tieto.geekoff.warmup.Config;
import com.tieto.geekoff.warmup.FileDriver;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Before
    public void setUp() throws Exception {
    }

    @org.junit.Test
    public void readFromFileWhenFileIsEmpty() {
        try {
            FileDriver.writeToFile(Config.TEXT_FILE_PATH, Config.TEXT_FILE_PATH,false);
        }catch (Exception e){

        }
    }


    @After
    public void tearDown() throws Exception {
    }
}