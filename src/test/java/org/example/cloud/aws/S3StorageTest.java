package org.example.cloud.aws;

import org.example.cloud.IComputeInstance;
import org.example.cloud.IStorageService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;



class S3StorageTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }


    @Test
    void uploadFile(){
        IStorageService instance = new S3Storage();
        instance.uploadFile("files/data.csv");

        Assertions.assertEquals("S3 Storage Service: Successfully uploaded file \"files/data.csv\".\n", outputStreamCaptor.toString());
    }

}