package org.example.cloud.azure;

import org.example.cloud.IStorageService;

public class BlobStorage implements IStorageService {

    @Override
    public void uploadFile(String fileName) {
        System.out.println("Blob Storage Service: Successfully uploaded file \""+fileName+"\".");
    }

}
