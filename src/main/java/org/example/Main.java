package org.example;

import org.example.cloud.ICloudModuleFactory;
import org.example.cloud.IComputeInstance;
import org.example.cloud.IStorageService;
import org.example.cloud.aws.AwsServiceFactory;
import org.example.cloud.azure.AzureServiceFactory;

public class Main {
    public static void main(String[] args) {

        ICloudModuleFactory factory = new AzureServiceFactory();
        IStorageService storageService;
        IComputeInstance computeInstance;

        storageService = factory.createStorage();
        storageService.uploadFile("files/data.csv");

        computeInstance = factory.createCompute();
        computeInstance.startInstance();


        // somente o construtor do factory é alterado, e os serviços serão todos alterados por consequência.
        factory = new AwsServiceFactory();

        storageService = factory.createStorage();
        storageService.uploadFile("files/data.csv");

        computeInstance = factory.createCompute();
        computeInstance.startInstance();


    }
}