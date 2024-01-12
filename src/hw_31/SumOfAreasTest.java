package hw_31;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumOfAreasTest {
    private SumOfAreas sum1;
    private Shape circle1 = new Circle(5.0);
    private Shape rectangle1 = new Rectangle(2.76, 3.56);


    @BeforeEach
    void setUp(){
    sum1= new SumOfAreas();
    }

    @Test
    @DisplayName("Should successfully sum of 0 shapes")
    public void ZeroElt(){
        Shape[] actual = {};
        assertEquals(0, sum1.sumOfAreas(actual));
    }
    @Test
    @DisplayName("Should successfully sum of 1 shapes")
    public void OneElt(){
        Shape[] actual ={circle1};
        assertEquals(78.53981633974483, sum1.sumOfAreas(actual));
        }
   @Test
   @DisplayName("Should successfully sum of 2 shapes")
    public void TwoElt(){
        Shape[] actual = {circle1, rectangle1};
        assertEquals(88.36541633974483, sum1.sumOfAreas(actual));

        }
}


