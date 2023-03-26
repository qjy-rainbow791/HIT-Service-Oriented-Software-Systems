package com.hit;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface= "com.hit.IReaderService" ,serviceName="readerService")
public class ReaderService implements IReaderService{
    public Reader getReader(@WebParam(name = "name") String name, @WebParam(name = "password") String password) {
        return new Reader(name, password);
    }

    public List<Reader> getReaders() {
        List<Reader> readerList = new ArrayList<Reader>();
        readerList.add(new Reader("shun1", "123"));
        readerList.add(new Reader("shun2", "123"));
        return readerList;
    }
}
