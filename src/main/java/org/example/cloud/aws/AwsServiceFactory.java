package org.example.cloud.aws;

import org.example.cloud.ICloudModuleFactory;
import org.example.cloud.IComputeInstance;
import org.example.cloud.IStorageService;

public class AwsServiceFactory implements ICloudModuleFactory {


    @Override
    public IStorageService createStorage() {
        return new S3Storage();
    }

    @Override
    public IComputeInstance createCompute() {
        return new Ec2Instance();
    }
}
