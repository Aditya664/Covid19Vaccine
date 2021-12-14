/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.covid.classes;

import com.covid.classes.StatusClass;
import javax.swing.*;
import java.awt.Color;
import java.util.*;

/**
 *
 * @author Aditya
 */
public class RandomNo {

    public static String generateRand() {
        Random r = new Random();
        HashSet<Integer> set = new HashSet<>();
//        HashSet<String> set1 = new HashSet<>();

        while (set.size() < 1) {
            int rand = r.nextInt(1000) + 15556;
            set.add(rand);
        }
        for (int randno : set) {
            String code = String.valueOf(randno);
            StatusClass.rnd = code;
        }
        return StatusClass.rnd;
    }

}
