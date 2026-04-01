package org.example.cloud.azure;

import org.example.cloud.IStorageService;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class BlobStorageTest {

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
        IStorageService instance = new BlobStorage();
        instance.uploadFile("files/data.csv");

        Assertions.assertEquals("Blob Storage Service: Successfully uploaded file \"files/data.csv\".\n", outputStreamCaptor.toString());
    }

}