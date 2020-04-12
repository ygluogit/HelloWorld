//package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {


    	HashSet<String> set=new HashSet<String>(); 
    	System.out.println("size: " + set.size());
        set.add("Ravi"); 
        System.out.println("size: " + set.size());
        if (!set.add("Ravi")) System.out.println("size not change. " + set.size());  
    	
      }

}
    
   
