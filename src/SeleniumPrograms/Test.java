package SeleniumPrograms;
import java.util.Random;
import java.io.*;


import org.apache.commons.lang3.RandomStringUtils;

//import org.apache.commons.lang3.RandomStringUtils;


public class Test {
	   public void pupAge() {
	      int age =0;
	      age = age + 7;
	      System.out.println("Puppy age is : " + age);
	   }

	   public static void main(String args[]) {
	      Test test = new Test();
	      test.pupAge();
	   }
	}