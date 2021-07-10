package ueirt.learing.springcache.services;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MainService {
    @Cacheable(value = "myCache")
    public String demoCache() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Date().toString();
    }
}
