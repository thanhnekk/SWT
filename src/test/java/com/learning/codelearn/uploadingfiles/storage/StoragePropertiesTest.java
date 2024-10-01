package com.learning.codelearn.uploadingfiles.storage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoragePropertiesTest {

   
    @Test
    void getLocation() {
        StorageProperties storageProperties = new StorageProperties();
        String expectedLocation = "some/location"; 
        storageProperties.setLocation(expectedLocation); 
        assertEquals(expectedLocation, storageProperties.getLocation(), "The location should match the expected value.");
    }

    @Test
    void setLocation() {
        StorageProperties storageProperties = new StorageProperties();
        String location = "another/location";
        storageProperties.setLocation(location);
        
        assertEquals(location, storageProperties.getLocation(), "The location should match the set value.");
    }
}
