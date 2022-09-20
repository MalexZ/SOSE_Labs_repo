/*
 * This file is part of JGAP.
 *
 * JGAP offers a dual license model containing the LGPL as well as the MPL.
 *
 * For licensing information please see the file license.txt included with JGAP
 * or have a look at the top of class org.jgap.Chromosome which representatively
 * includes the JGAP license policy applicable for any file delivered with JGAP.
 */
package utils;


import com.opencsv.CSVReader;
import org.jgap.FitnessFunction;
import org.jgap.IChromosome;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Sample fitness function for the MakeChange example.
 *
 * @author Neil Rotstan
 * @author Klaus Meffert
 * @since 1.0
 */
public class MinimizingMakeChangeFitnessFunction
    extends FitnessFunction {
  /** String containing the CVS revision. Read out via reflection!*/
  private final static String CVS_REVISION = "$Revision: 1.18 $";

  private final int m_targetAmount;

  public static final int MAX_BOUND = 4000;


  public MinimizingMakeChangeFitnessFunction(int a_targetAmount) {
    if (a_targetAmount < 1 || a_targetAmount >= MAX_BOUND) {
      throw new IllegalArgumentException(
          "Change amount must be between 1 and " + MAX_BOUND + " cents.");
    }
    m_targetAmount = a_targetAmount;
  }

  /**
   * Determine the fitness of the given Chromosome instance. The higher the
   * return value, the more fit the instance. This method should always
   * return the same fitness value for two equivalent Chromosome instances.
   *
   * @param a_subject the Chromosome instance to evaluate
   *
   * @return positive double reflecting the fitness rating of the given
   * Chromosome
   * @since 2.0 (until 1.1: return type int)
   * @author Neil Rotstan, Klaus Meffert, John Serri
   */
/********************************************************fitness function calculations****************************************/






  //return a csvList containing sc1-sc3 lists
  public static List<List<List<String>>> startCSVReading() throws FileNotFoundException {
    String fullPath = new File("").getAbsolutePath();
    fullPath = fullPath + "\\app\\utils\\InputTable.csv";
    System.out.println(fullPath);
    //File file= new File(fullPath);
    CSVReader sc = new CSVReader(new FileReader("app\\utils\\InputTable.csv"));
    // System.out.println(fullPath);
    int col = 0;
    int row = 0;
    String line[];
    Iterator it = sc.iterator();


    //array for titles and probabilities
    List<List<List<String>>> csvList = new ArrayList<List<List<String>>>();
    List<List<String>> sc1 = new ArrayList<>();
    List<List<String>> sc2 = new ArrayList<>();
    List<List<String>> sc3 = new ArrayList<>();

    int largestCategory;
    String element;
    while (it.hasNext()) {
      line = (String[]) it.next();

      if (row != 0) {
        if (line[0].equals("SC1")) {
          List<String> temp = new ArrayList<String>();
          for (int i = 0; i < line.length; i++)
            temp.add(line[i]);

          sc1.add(temp);
          //System.out.println(S1);
        }
        if (line[0].equals("SC2")) {
          List<String> temp = new ArrayList<String>();
          for (int i = 0; i < line.length; i++)
            temp.add(line[i]);

          sc2.add(temp);
          //System.out.println(S2_3);
        }
        if (line[0].equals("SC3")) {
          List<String> temp = new ArrayList<String>();
          for (int i = 0; i < line.length; i++)
            temp.add(line[i]);

          sc3.add(temp);
          //System.out.println(S2_3);
        }
        // fc.add(Double.parseDouble(element));
      }
      row++;
    }

    csvList.add(sc1);
    csvList.add(sc2);
    csvList.add(sc3);
    return csvList;

   /* String fullPath = new File("").getAbsolutePath();
    fullPath = fullPath + "\\app\\utils\\InputTable.csv";
    System.out.println(fullPath);
    //File file= new File(fullPath);
    CSVReader sc = new CSVReader(new FileReader("app\\utils\\InputTable.csv"));
    // System.out.println(fullPath);
    int col = 0;
    int row = 0;
    String line[];
    Iterator it = sc.iterator();


    //array for titles and probabilities
    List<List<String>> S1 = new ArrayList<List<String>>();
    List<List<String>> S2_3 = new ArrayList<List<String>>();

    List<String> category = new ArrayList<String>();
    List<String> service = new ArrayList<String>();
    List<Double> fc = new ArrayList<Double>();
    List<Double> fr = new ArrayList<Double>();
    List<Double> ft = new ArrayList<Double>();
    List<Double> fa = new ArrayList<Double>();


    int largestCategory;
    String element;
    while (it.hasNext()) {
      System.out.println("in while");
      line = (String[]) it.next();
      System.out.println(line[1]);

      if (row != 0) {
        if (line[0].equals("SC1")) {
          List<String> temp = new ArrayList<String>();
          for (int i = 0; i < line.length; i++)
            temp.add(line[i]);

          S1.add(temp);
          //System.out.println(S1);
        }
        if (line[0].equals("SC2")) {
          List<String> temp = new ArrayList<String>();
          for (int i = 0; i < line.length; i++)
            temp.add(line[i]);

          S2_3.add(temp);
          //System.out.println(S2_3);
        }
        if (line[0].equals("SC3")) {
          List<String> temp = new ArrayList<String>();
          for (int i = 0; i < line.length; i++)
            temp.add(line[i]);

          S2_3.add(temp);
          //System.out.println(S2_3);
        }
        // fc.add(Double.parseDouble(element));
      }
      row++;
    }
    System.out.println(S1);
    createWorkFlows(S1, S2_3);
*/
  }


//Given: the services for each category(SC1-SC3) to select (the 1 signifies the index for each SC1-SC3)
// If a_subject = 00010 100 00001000
  //Then
//Fitness function calculated from sc1[3] , sc2[0], sc3[4] and returned
  public double evaluate(IChromosome a_subject) {//overwrite this method
    /*********************/
    double fitness;
    double fitness2;
    List<List<List<String>>> csvList = null;
    try {
      csvList = startCSVReading();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }


    Object one = a_subject.getGene(0).getAllele();
    int indexOne = (int) one;//?, max is 0-4

    Object two = a_subject.getGene(1).getAllele();

    int indexTwo = (int) two;//?, max is 0-2, sometimes equals to 0 no negatibe

    Object three = a_subject.getGene(2).getAllele();
    int indexThree = (int) three;//?, max is 0-7

    /*
    // In lab, you need to clear the content in this method and design your fitness function here.

    // Take care of the fitness evaluator. It could either be weighting higher
    // fitness values higher (e.g.DefaultFitnessEvaluator). Or it could weight
    // lower fitness values higher, because the fitness value is seen as a
    // defect rate (e.g. DeltaFitnessEvaluator)
    boolean defaultComparation = a_subject.getConfiguration().
        getFitnessEvaluator().isFitter(2, 1);

    // The fitness value measures both how close the value is to the
    // target amount supplied by the user and the total number of coins
    // represented by the solution. We do this in two steps: first,
    // we consider only the represented amount of change vs. the target
    // amount of change and return higher fitness values for amounts
    // closer to the target, and lower fitness values for amounts further
    // away from the target. Then we go to step 2, which returns a higher
    // fitness value for solutions representing fewer total coins, and
    // lower fitness values for solutions representing more total coins.
    // ------------------------------------------------------------------
    int changeAmount = amountOfChange(a_subject);
    int totalCoins = getTotalNumberOfCoins(a_subject);
    int changeDifference = Math.abs(m_targetAmount - changeAmount);
    double fitness;
    if (defaultComparation) {
      fitness = 0.0d;
    }
    else {
      fitness = MAX_BOUND/2;
    }
    // Step 1: Determine distance of amount represented by solution from
    // the target amount. If the change difference is greater than zero we
    // will divide one by the difference in change between the
    // solution amount and the target amount. That will give the desired
    // effect of returning higher values for amounts closer to the target
    // amount and lower values for amounts further away from the target
    // amount.
    // In the case where the change difference is zero it means that we have
    // the correct amount and we assign a higher fitness value.
    // ---------------------------------------------------------------------
    if (defaultComparation) {
      fitness += changeDifferenceBonus(MAX_BOUND/2, changeDifference);
    }
    else {
      fitness -= changeDifferenceBonus(MAX_BOUND/2, changeDifference);
    }
    // Step 2: We divide the fitness value by a penalty based on the number of
    // coins. The higher the number of coins the higher the penalty and the
    // smaller the fitness value.
    // And inversely the smaller number of coins in the solution the higher
    // the resulting fitness value.
    // -----------------------------------------------------------------------
    if (defaultComparation) {
      fitness -= computeCoinNumberPenalty(MAX_BOUND/2, totalCoins);
    }
    else {
      fitness += computeCoinNumberPenalty(MAX_BOUND/2, totalCoins);
    }
    // Make sure fitness value is always positive.
    // -------------------------------------------
    */

    double fc = 0.0;
    double fr = 0.0;
    double ft = 0.0;
    double fa = 0.0;


    double fc2 = 0.0;
    double fr2 = 0.0;
    double ft2 = 0.0;
    double fa2 = 0.0;
    //for cost and time, the smaller the better.
    /*if (singleWF.size() == 2) {
      fc = 1 / (Double.parseDouble(singleWF.get(0).get(2)) + Double.parseDouble(singleWF.get(1).get(2)));
      fr = Double.parseDouble(singleWF.get(0).get(3)) * Double.parseDouble(singleWF.get(1).get(3));
      ft = 1 / (Double.parseDouble(singleWF.get(0).get(4)) + Double.parseDouble(singleWF.get(1).get(4)));
      fa = Double.parseDouble(singleWF.get(0).get(5)) * Double.parseDouble(singleWF.get(1).get(5));
    } else {*/

    fc = 1 / (Double.parseDouble(csvList.get(0).get(indexOne).get(2)) + Double.parseDouble(csvList.get(1).get(indexTwo).get(2)) + Double.parseDouble(csvList.get(2).get(indexThree).get(2)));
    fr = Double.parseDouble(csvList.get(0).get(indexOne).get(3)) * Double.parseDouble(csvList.get(1).get(indexTwo).get(3)) * Double.parseDouble(csvList.get(2).get(indexThree).get(3));
    ft = 1 / (Double.parseDouble(csvList.get(0).get(indexOne).get(4)) + Double.parseDouble(csvList.get(1).get(indexTwo).get(4)) + Double.parseDouble(csvList.get(2).get(indexThree).get(4)));
    fa = Double.parseDouble(csvList.get(0).get(indexOne).get(5)) * Double.parseDouble(csvList.get(1).get(indexTwo).get(5)) * Double.parseDouble(csvList.get(2).get(indexThree).get(5));

    fitness = (fc * .35) + (fr * .10) + (ft * .20) + (fa * .35);
    fc2 = 1 / (Double.parseDouble(csvList.get(0).get(indexOne).get(2))  + Double.parseDouble(csvList.get(2).get(indexThree).get(2)));
    fr2 = Double.parseDouble(csvList.get(0).get(indexOne).get(3)) * Double.parseDouble(csvList.get(2).get(indexThree).get(3));
    ft2 = 1 / (Double.parseDouble(csvList.get(0).get(indexOne).get(4)) + Double.parseDouble(csvList.get(2).get(indexThree).get(4)));
    fa2 = Double.parseDouble(csvList.get(0).get(indexOne).get(5)) * Double.parseDouble(csvList.get(2).get(indexThree).get(5));

    fitness2 = (fc2 * .35) + (fr2 * .10) + (ft2 * .20) + (fa2 * .35);

    double offset = 20000.0;
    if(fitness2>fitness) {
      return (offset + Math.max(1.0d, fitness2));
    }
      // store
    return Math.max(1.0d, fitness);
  }

  /**
   * Bonus calculation of fitness value.
   * @param a_maxFitness maximum fitness value appliable
   * @param a_changeDifference change difference in coins for the coins problem
   * @return bonus for given change difference
   *
   * @author Klaus Meffert
   * @since 2.3
   */
  protected double changeDifferenceBonus(double a_maxFitness,
                                         int a_changeDifference) {
    if (a_changeDifference == 0) {
      return a_maxFitness;
    }
    else {
      // we arbitrarily work with half of the maximum fitness as basis for non-
      // optimal solutions (concerning change difference)
      if (a_changeDifference * a_changeDifference >= a_maxFitness / 2) {
        return 0.0d;
      }
      else {
        return a_maxFitness / 2 - a_changeDifference * a_changeDifference;
      }
    }
  }

  /**
   * Calculates the penalty to apply to the fitness value based on the ammount
   * of coins in the solution
   *
   * @param a_maxFitness maximum fitness value allowed
   * @param a_coins number of coins in the solution
   * @return penalty for the fitness value base on the number of coins
   *
   * @author John Serri
   * @since 2.2
   */
  protected double computeCoinNumberPenalty(double a_maxFitness, int a_coins) {
    if (a_coins == 1) {
      // we know the solution cannot have less than one coin
      return 0;
    }
    else {
      // The more coins the more penalty, but not more than the maximum fitness
      // value possible. Let's avoid linear behavior and use
      // exponential penalty calculation instead
      return (Math.min(a_maxFitness, a_coins * a_coins));
    }
  }

  /**
   * Calculates the total amount of change (in cents) represented by
   * the given potential solution and returns that amount.
   *
   * @param a_potentialSolution the potential solution to evaluate
   * @return The total amount of change (in cents) represented by the
   * given solution
   *
   * @author Neil Rotstan
   * @since 1.0
   */
  public static int amountOfChange(IChromosome a_potentialSolution) {
    int numTenDollars = getNumberOfCoinsAtGene(a_potentialSolution, 0);
    int numFiveDollars = getNumberOfCoinsAtGene(a_potentialSolution, 1);
    int numOneDollars = getNumberOfCoinsAtGene(a_potentialSolution, 2);
    return (numTenDollars * 10) + (numFiveDollars * 5) +
        numOneDollars;
  }

  /**
   * Retrieves the number of coins represented by the given potential
   * solution at the given gene position.
   *
   * @param a_potentialSolution the potential solution to evaluate
   * @param a_position the gene position to evaluate
   * @return the number of coins represented by the potential solution at the
   * given gene position
   *
   * @author Neil Rotstan
   * @since 1.0
   */
  public static int getNumberOfCoinsAtGene(IChromosome a_potentialSolution,
                                           int a_position) {
    Integer numCoins =
        (Integer) a_potentialSolution.getGene(a_position).getAllele();
    return numCoins.intValue();
  }

  /**
   * Returns the total number of coins represented by all of the genes in
   * the given potential solution.
   *
   * @param a_potentialsolution the potential solution to evaluate
   * @return total number of coins represented by the given Chromosome
   *
   * @author Neil Rotstan
   * @since 1.0
   */
  public static int getTotalNumberOfCoins(IChromosome a_potentialsolution) {
    int totalCoins = 0;
    int numberOfGenes = a_potentialsolution.size();
    for (int i = 0; i < numberOfGenes; i++) {
      totalCoins += getNumberOfCoinsAtGene(a_potentialsolution, i);
    }
    return totalCoins;
  }
}
