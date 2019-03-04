package com.springproject.animalhealthcenter.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {
    //define the hashmap
    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }
    T findById(ID id){
        return map.get(id);
    }
    //since we dont know the type of object returned, we use id and obj
    T save(ID id, T object){
        map.put(id, object);
        return object;
    }
    void deleteBYId(ID id){
        map.remove(id);
    }
    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

}
