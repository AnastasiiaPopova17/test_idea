package our_arraylist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurArrayListTest {
   private OurArrayList ourArrayList = new OurArrayList<>();


    @BeforeEach
    public void setUp(){
        ourArrayList = new OurArrayList<>();
    }

    @Test
    @DisplayName("Check, if size is 0")
    public void isZero(){
        OurArrayList[] actual = {};
        assertEquals(null, ourArrayList.get(0));
    }



}