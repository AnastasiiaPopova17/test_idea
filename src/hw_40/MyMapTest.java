package hw_40;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MyMapTest {
    private MyMap myMap;

   @BeforeEach
    public void setUp(){
        MyMap myMap = new MyMap();
    }

    @Test
    public void changeMapWithOneElt(){
        Map<String,String> actual = new HashMap<>();
        actual.put("a", "Hi");
        Map<String,String> expected = new HashMap<>();
        expected.put("a", "Hi");
        assertEquals(expected,MyMap.changeMap1(actual));

    }
    @Test
    public void changeMapWithFewElt(){
        Map<String,String> actual = new HashMap<>();
        actual.put("a", "Hi");
        actual.put("b", "There");
        Map<String,String> expected = new HashMap<>();
        expected.put("ab", "HiThere");
        assertEquals(expected,MyMap.changeMap1(actual));

    }

}