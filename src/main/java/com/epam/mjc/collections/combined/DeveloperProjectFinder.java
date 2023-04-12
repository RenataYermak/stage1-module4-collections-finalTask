package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                result.add(entry.getKey());
            }
        }
        result.sort(new StringComparator());
        return result;
    }

    private static class StringComparator implements Comparator<String> {
        public int compare(String a, String b) {
            if (a.length() != b.length())
                return b.length() - a.length();
            else
                return b.compareTo(a);
        }
    }
}
