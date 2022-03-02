package com.nt.beans;

import java.util.Random;
import java.util.RandomAccess;

public class Bat {
 public Bat() {
	System.out.println("Bat :: 0-param constructor");
}

public int scoreRuns() {
	 System.out.println("Bat.scoreRuns()");
	 return new Random().nextInt(130);
}
}
