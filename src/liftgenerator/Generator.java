package liftgenerator;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import liftgenerator.BicepLift.Exercise;

public class Generator {
	
	public int generateReps() {
		int repMin = 6;
		int repMax = 20;
		int repAmount = ThreadLocalRandom.current().nextInt(repMin, repMax);
		return repAmount;
	}
	
	public int generateSets() {
		int setMin = 3;
		int setMax = 6;
		int setAmount = ThreadLocalRandom.current().nextInt(setMin, setMax);
		return setAmount;
	}
	
	public Exercise generateExerciseType() {
	    int pick = new Random().nextInt(Exercise.values().length);
	    return Exercise.values()[pick];
	}
	
	
	public int generateWeights() {
		int[] weights = {15,20,25,30,35,40,45};
	    int rnd = new Random().nextInt(weights.length);
	    return weights[rnd];
	}
		
	public static void main(String[] args) {
		Generator generator = new Generator();
		System.out.println("Lift:" + generator.generateExerciseType() +  
				"    Sets:" + generator.generateSets() + "     "
						+ "Reps:"+ generator.generateReps() + "    "
								+ "Weight:" + generator.generateWeights()); 
	}
}
