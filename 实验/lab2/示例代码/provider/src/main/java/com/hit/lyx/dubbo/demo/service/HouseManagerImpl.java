package com.hit.lyx.dubbo.demo.service;

import com.hit.lyx.dubbo.demo.api.service.HouseManager;

import javax.mail.internet.InternetAddress;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class HouseManagerImpl implements HouseManager {
    public String ip(){
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return null;
    }
}
