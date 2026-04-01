package org.example.cloud.aws;

import org.example.cloud.ICloudModuleFactory;
import org.example.cloud.IComputeInstance;
import org.example.cloud.IStorageService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class AwsServiceFactoryTest {

    @Test
    void shouldReturnAwsFamilyProducts() {
        ICloudModuleFactory factory = new AwsServiceFactory();

        IStorageService storage = factory.createStorage();
        assertInstanceOf(S3Storage.class, storage, "A fábrica AWS deve retornar um S3Storage");

        IComputeInstance compute = factory.createCompute();
        assertInstanceOf(Ec2Instance.class, compute, "A fábrica AWS deve retornar um Ec2Instance");
    }

}