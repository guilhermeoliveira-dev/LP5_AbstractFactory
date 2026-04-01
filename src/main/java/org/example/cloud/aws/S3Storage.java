package org.example.cloud.aws;

import org.example.cloud.IStorageService;

public class S3Storage implements IStorageService {

    @Override
    public void uploadFile(String fileName) {
        System.out.println("S3 Storage Service: Successfully uploaded file \""+fileName+"\".");
    }
}
