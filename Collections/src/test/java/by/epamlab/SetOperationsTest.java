package by.epamlab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SetOperationsTest {

    private Set<Integer> setInt1;
    private Set<Integer> setInt2;
    private Set<String> setStr1;
    private Set<String> setStr2;

    @Before
    public void setUp() throws Exception {

        setInt1 = new HashSet<>();
        setInt1.add(1);
        setInt1.add(2);
        setInt1.add(3);
        setInt1.add(4);

        setInt2 = new HashSet<>();
        setInt2.add(4);
        setInt2.add(5);
        setInt2.add(6);
        setInt2.add(7);

        setStr1 = new HashSet<>();
        setStr1.add("table");
        setStr1.add("pen");
        setStr1.add("paper");
        setStr1.add("book");

        setStr2 = new HashSet<>();
        setStr2.add("copybook");
        setStr2.add("pen");
        setStr2.add("computer");
        setStr2.add("eraser");
    }

    @Test
    public void unionSetsInt() {

        HashSet<Integer> expectedInt = SetOperations.unionSets(setInt1, setInt2);

        Set<Integer> actualInt = new HashSet<>();
        actualInt.add(1);
        actualInt.add(2);
        actualInt.add(3);
        actualInt.add(4);
        actualInt.add(5);
        actualInt.add(6);
        actualInt.add(7);

        Assert.assertEquals(expectedInt, actualInt);
    }

    @Test
    public void unionSetsStr(){

        HashSet<String> expectedStr = SetOperations.unionSets(setStr1, setStr2);

        Set<String> actualStr = new HashSet<>();
        actualStr.add("table");
        actualStr.add("pen");
        actualStr.add("paper");
        actualStr.add("book");
        actualStr.add("copybook");
        actualStr.add("computer");
        actualStr.add("eraser");

        Assert.assertEquals(expectedStr, actualStr);
    }

    @Test
    public void intersectionSetsInt() {

        HashSet<Integer> expectedInt = SetOperations.intersectionSets(setInt1, setInt2);

        Set<Integer> actualInt = new HashSet<>();
        actualInt.add(4);

        Assert.assertEquals(expectedInt, actualInt);
    }

    @Test
    public void intersectionSetStr() {

        HashSet<String> expectedStr = SetOperations.intersectionSets(setStr1, setStr2);

        Set<String> actualStr = new HashSet<>();
        actualStr.add("pen");

        Assert.assertEquals(expectedStr, actualStr);
    }

    @Test
    public void differenceSetsInt() {

        HashSet<Integer> expectedInt = SetOperations.differenceSets(setInt1, setInt2);

        Set<Integer> actualInt = new HashSet<>();
        actualInt.add(1);
        actualInt.add(2);
        actualInt.add(3);

        Assert.assertEquals(expectedInt, actualInt);
    }

    @Test
    public void differenceSetsStr() {

        HashSet<String> expectedStr = SetOperations.differenceSets(setStr1, setStr2);

        Set<String> actualStr = new HashSet<>();
        actualStr.add("table");
        actualStr.add("paper");
        actualStr.add("book");

        Assert.assertEquals(expectedStr, actualStr);
    }

    @Test
    public void symmetricDifferenceSetsInt() {

        HashSet<Integer> expectedInt = SetOperations.symmetricDifferenceSets(setInt1, setInt2);

        Set<Integer> actualInt = new HashSet<>();
        actualInt.add(1);
        actualInt.add(2);
        actualInt.add(3);
        actualInt.add(5);
        actualInt.add(6);
        actualInt.add(7);

        Assert.assertEquals(expectedInt, actualInt);
    }

    @Test
    public void symmetricDifferenceSetsStr() {

        HashSet<String> expectedStr = SetOperations.symmetricDifferenceSets(setStr1, setStr2);

        Set<String> actualStr = new HashSet<>();
        actualStr.add("table");
        actualStr.add("paper");
        actualStr.add("book");
        actualStr.add("copybook");
        actualStr.add("computer");
        actualStr.add("eraser");

        Assert.assertEquals(expectedStr, actualStr);
    }
}