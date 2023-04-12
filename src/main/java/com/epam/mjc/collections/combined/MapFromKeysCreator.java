package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();
        for (Map.Entry<String, Integer> element : sourceMap.entrySet()) {
            if (result.containsKey(element.getKey().length())) {
                result.get(element.getKey().length()).add(element.getKey());
            } else {
                Set<String> set = new HashSet<>();
                set.add(element.getKey());
                result.put(element.getKey().length(), set);
            }
        }
        return result;
    }
}
