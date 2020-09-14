package by.epamlab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperations {

    public static <E> HashSet<E> unionSets(Set<E> set1, Set<E> set2){
        List<E> resultList = new ArrayList<>(set1);
        boolean isExist;
        for (E el2:set2) {
            isExist = false;
            for (E el1:set1) {
                if (el2.equals(el1)){
                    isExist = true;
                    break;
                }
            }
            if (!isExist){
                resultList.add(el2);
            }
        }
        return new HashSet<>(resultList);
    }

    public static <E> HashSet<E> intersectionSets(Set<E> set1, Set<E> set2){
        List<E> resultList = new ArrayList<>();
        boolean isExist;
        for (E el1:set1) {
            isExist = false;
            for (E el2:set2) {
                if (el1.equals(el2)) {
                    isExist = true;
                    break;
                }
            }
            if (isExist){
                resultList.add(el1);
            }
        }
        return new HashSet<>(resultList);
    }

    public static <E> HashSet<E> differenceSets(Set<E> set1, Set<E> set2){
        List<E> resultList = new ArrayList<>(set1);
        boolean isExist;
        for (E el1:set1) {
            isExist = false;
            for (E el2:set2) {
                if (el1.equals(el2)) {
                    isExist = true;
                    break;
                }
            }
            if (isExist){
                resultList.remove(el1);
            }
        }
        return new HashSet<>(resultList);
    }

    public static <E> HashSet<E> symmetricDifferenceSets(Set<E> set1, Set<E> set2){
        HashSet<E> difSet1Set2 = differenceSets(set1, set2);
        HashSet<E> difSet2Set1 = differenceSets(set2, set1);
        return unionSets(difSet1Set2, difSet2Set1);
    }


}
