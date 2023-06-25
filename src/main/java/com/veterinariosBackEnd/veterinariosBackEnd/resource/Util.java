package com.veterinariosBackEnd.veterinariosBackEnd.resource;

import com.veterinariosBackEnd.veterinariosBackEnd.model.Veterinary;

import javax.net.ssl.SSLEngineResult;
import java.util.HashMap;
import java.util.List;

public class Util {

    private static final HashMap<Integer, List<Veterinary>> map = new HashMap<>();

    private static Util instance;

    public static synchronized Util getInstance(){
        if(instance == null){
            instance = new Util();
        }
        return instance;
    }

    public List<Veterinary> getValue(int key){
        return map.get(key);
    }

    public void add(int key,List<Veterinary> vet){
        map.put(key,vet);
    }

}
