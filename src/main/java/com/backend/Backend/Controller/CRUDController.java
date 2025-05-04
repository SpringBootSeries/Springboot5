package com.backend.Backend.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

public class CRUDController {
    private Map<K, T> objects = new HashMap<K, T>();

    public Map<K, T> getMap() {
        return objects;
    }

    @GetMapping("/")
    public Map<K, T> getAll() {
        return objects;
    }

    @GetMapping("/{id}")
    public T get(@PathVariable("id") K id) {
        return objects.get(id);
    }

    //add new
    @PostMapping("/add")
    public T addNew(@RequestBody T objectnew, K id) {
        return objects.put(id, objectnew);
        // return "Add New Object.";
    }


    //update
    @PutMapping("/update/{id}")
    public String updateOne(@PathVariable("id") K id, T objectNew) {
        if (objects.get(id) != null) {
            objects.put(id, objectNew);
            return "Update Object details.";
        }
        return "404 couldn't find the student";
    }

    //delete
    @DeleteMapping("/delete/{id}")
    public String deleteOne(@PathVariable("id") K id) {
        if (objects.get(id) != null) {
            objects.remove(id);
            return "The Object Deleted Sucessfully.";
        }

        return "404 couldn't find the student";
    }
}