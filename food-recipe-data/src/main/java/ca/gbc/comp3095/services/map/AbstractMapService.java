/*
 * Project: food recipe
 * Assignment:  assignment 1
 * Author(s):   Armen Levon Armen
 * Student Number: 101281931
 * Date: 11/7/2021 - mm/dd/yy
 * Description: In this file I implemented the methods' body
 */

package ca.gbc.comp3095.services.map;

import ca.gbc.comp3095.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T object){

        if(object != null){
            if(object.getId() == null){
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        }else{
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    T findByEventName(ID id) { return map.get(id); }

    private Long getNextId(){
        Long nextId = null;
        try{
            nextId = Collections.max(map.keySet()) + 1;
        }catch(NoSuchElementException e){
            nextId = 1L;
        }
        return nextId;

    }
    // jpa queries
}
