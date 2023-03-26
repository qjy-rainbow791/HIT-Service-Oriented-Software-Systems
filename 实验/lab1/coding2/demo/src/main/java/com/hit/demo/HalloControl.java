package com.hit.demo;

import org.springframework.web.bind.annotation.*;
import test.testEntity;

@RestController
public class HalloControl {
    @RequestMapping(value="/hallo", method=RequestMethod.GET)
    public String say(){return "hello!";}

    @RequestMapping(value="/hallo/{id}", method=RequestMethod.GET)
    public testEntity say1(@RequestParam(value = "qid", required = true) String qid, @PathVariable("id") String id){
        testEntity t = new testEntity(id,qid);
        return t;
    }
}
