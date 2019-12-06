package com.mikeingley.awsimageuploader.bucket;

public enum BucketName {

    PROFILE_IMAGE("img-uploader-project");

    private final String bucketName;

    BucketName(String bucketName){
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
