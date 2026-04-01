package org.example.cloud.azure;

import org.example.cloud.ICloudModuleFactory;
import org.example.cloud.IComputeInstance;
import org.example.cloud.IStorageService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class AzureServiceFactoryTest {

    @Test
    void shouldReturnAzureFamilyProducts() {
        ICloudModuleFactory factory = new AzureServiceFactory();

        IStorageService storage = factory.createStorage();
        assertInstanceOf(BlobStorage.class, storage, "A fábrica AWS deve retornar um S3Storage");

        IComputeInstance compute = factory.createCompute();
        assertInstanceOf(VMInstance.class, compute, "A fábrica AWS deve retornar um Ec2Instance");
    }

}