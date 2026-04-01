package org.example.cloud.azure;

import org.example.cloud.ICloudModuleFactory;
import org.example.cloud.IComputeInstance;
import org.example.cloud.IStorageService;

public class AzureServiceFactory implements ICloudModuleFactory {
    @Override
    public IStorageService createStorage() {
        return new BlobStorage();
    }

    @Override
    public IComputeInstance createCompute() {
        return new VMInstance();
    }
}
