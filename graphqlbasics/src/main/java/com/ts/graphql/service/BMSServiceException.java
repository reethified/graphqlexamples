package com.ts.graphql.service;

public class BMSServiceException extends Exception {
    public BMSServiceException(Exception e){
        super(e);
    }
    public BMSServiceException(String msg){
        super(msg);
    }
    public BMSServiceException(String msg , Exception e){
        super(msg,e);
    }
}
