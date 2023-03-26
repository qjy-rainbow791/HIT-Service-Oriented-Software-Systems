package com.hit;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;
@WebService
public interface IReaderService {
    public Reader getReader(@WebParam(name="name") String name, @WebParam(name="password") String password);
    public List<Reader> getReaders();
}
