package com.pantxi.Calculature;
import org.junit.jupiter.api.* ;
import  static org.junit.jupiter.api.Assertions.* ;


public class CalculatureTest {
    @Test
    public void Testaddition1(){
        assertEquals(2 ,Calculature.addition(1,1)) ;
    }

    @Test
    public void Testadditon2(){
        assertEquals(-3 ,Calculature.addition(-6,3));
    }
    @Test
    public void Testsoustraction1(){
        assertEquals(6,Calculature.soustraction(9,3));
    }
    @Test
    public void Testsoustraction2(){
        assertEquals(-12,Calculature.soustraction(-9,3));
    }
    @Test
    public void Testmultiple1(){
        assertEquals(4,Calculature.multiple(2,2));
    }

    @Test
    public void Testdivide(){
        assertEquals(4,Calculature.divide(9,2));
    }



}
