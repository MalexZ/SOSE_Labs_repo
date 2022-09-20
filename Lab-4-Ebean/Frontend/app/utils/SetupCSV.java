package utils;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.*;

//Read data and create data structure (Array List). Then use data structure to create 50 workflows (createWorkflows function),
// calculating fitnessValues (createFV funciton) and then create csv that is imported into website database.

public class SetupCSV {
    public static void createCSV(List<List<String>> workflow)  {
        String fullPath = new File("").getAbsolutePath();
        fullPath = fullPath + "\\baseFVDataSet.csv";
        String[] finalTitle= new String[50];
        Integer[] totalEach= new Integer[50];
        System.out.println(fullPath);
        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter(fullPath));
            for(int i=0;i<50;i++){
                //String catNum= Integer.toString(i);
                //id, category, titles(delimiter="||"), total each
                csvWriter.writeNext(new String[]{workflow.get(i).get(0), workflow.get(i).get(1), workflow.get(i).get(2), workflow.get(i).get(3), workflow.get(i).get(4)});
            }
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static double evaluateFitnessValue(List<List<String>> singleWF){
        System.out.println("calculate FV");
       // List<String> singleWF2 = new ArrayList<String>();
        double FV = 0.0;
        double fc = 0.0;
        double fr = 0.0;
        double ft = 0.0;
        double fa = 0.0;
        int size = singleWF.size();

        //for cost and time, the smaller the better.
        if(singleWF.size()==2){
            fc = 1/(Double.parseDouble(singleWF.get(0).get(2)) + Double.parseDouble(singleWF.get(1).get(2)));
            fr = Double.parseDouble(singleWF.get(0).get(3)) * Double.parseDouble(singleWF.get(1).get(3));
            ft = 1/(Double.parseDouble(singleWF.get(0).get(4)) + Double.parseDouble(singleWF.get(1).get(4)));
            fa = Double.parseDouble(singleWF.get(0).get(5)) * Double.parseDouble(singleWF.get(1).get(5));
        }
        else{
            fc = 1/(Double.parseDouble(singleWF.get(0).get(2)) + Double.parseDouble(singleWF.get(1).get(2)) + Double.parseDouble(singleWF.get(2).get(2)));
            fr = Double.parseDouble(singleWF.get(0).get(3)) * Double.parseDouble(singleWF.get(1).get(3)) * Double.parseDouble(singleWF.get(2).get(3));
            ft = 1/(Double.parseDouble(singleWF.get(0).get(4)) + Double.parseDouble(singleWF.get(1).get(4)) + Double.parseDouble(singleWF.get(2).get(4)));
            fa = Double.parseDouble(singleWF.get(0).get(5)) * Double.parseDouble(singleWF.get(1).get(5)) * Double.parseDouble(singleWF.get(2).get(5));
        }
        FV = (fc*.35)+(fr*.10)+(ft*.20)+(fa*.35);

        return FV;
    }

    public static void createWorkFlows(List S1, List S2_3)  {
        //initialize work flow list of list
        System.out.println("Create workflows");
        List<List<String>> workflow = new ArrayList<List<String>>();


        //select one random service from each category for one workflow * 50
        Random rand = new Random();



        int index = 0;
        String serviceName1 = " ";
        String serviceName2 = " ";
        String serviceName3 = " ";
        boolean checkS3 = true;

        for(int i=0; i<50;i++){
            List<List<String>> singleWF = new ArrayList<List<String>>();
            System.out.println("Creating WF" + i);
            index = rand.nextInt(S1.size());
            singleWF.add((List<String>) S1.get(index));
            serviceName1= singleWF.get(0).get(1);

            index = rand.nextInt(S2_3.size());
            singleWF.add((List<String>) S2_3.get(index));
            serviceName2= singleWF.get(1).get(1);

            List<String> temp = new ArrayList<String>();
            temp = (List<String>) S2_3.get(index);

            if(temp.get(0).equals("SC2")){
                checkS3 = false;
            }

            while(checkS3==false){
                index = rand.nextInt(S2_3.size());
                List<String> temp2 = new ArrayList<String>();
                temp2 = (List<String>) S2_3.get(index);

                if(temp2.get(0).equals("SC3")){
                    checkS3 = true;
                    singleWF.add((List<String>) S2_3.get(index));
                    serviceName3= singleWF.get(2).get(1);
                    break;
                }

            }
            List<String> temp3 = new ArrayList<String>();
            double FV = evaluateFitnessValue(singleWF);
            temp3.add("WF"+Integer.toString(i));
            temp3.add(serviceName1);
            temp3.add(serviceName2);
            temp3.add(serviceName3);
            temp3.add(Double.toString(FV));


            //calculate fitness value and return a List of Strings
            //List<String> workflowRow = appendFitnessValue(singleWF);
            workflow.add(temp3);
            serviceName1 = " ";
            serviceName2 = " ";
            serviceName3 = " ";


        }


        //Output: 50 workflows
        createCSV(workflow);

    }

    public static int findLargestCategory(List<Double> operate){
        int category = 0;
        double largest = operate.stream().max(Comparator.naturalOrder()).get();

        for(int i=0; i < operate.size();i++){
            if(operate.get(i) == largest) {
                category = i;
                break;
            }
        }


        return category;
    }

    public static String parseName(String title){
        title = title.replace("%20","");
        title = title.replace("-+-",":");
        System.out.println("parsing");
        return title;
    }
    public static void main(String[] args) throws FileNotFoundException {
        String fullPath = new File("").getAbsolutePath();
        fullPath = fullPath+"\\app\\utils\\InputTable.csv";
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
        while (it.hasNext())
        {
            System.out.println("in while");
            line = (String[]) it.next();
            System.out.println(line[1]);

            if (row != 0) {
                if(line[0].equals("SC1")){
                    List<String> temp = new ArrayList<String>();
                    for(int i=0; i<line.length; i++)
                        temp.add(line[i]);

                    S1.add(temp);
                    //System.out.println(S1);
                }
                if(line[0].equals("SC2")){
                    List<String> temp = new ArrayList<String>();
                    for(int i=0; i<line.length; i++)
                        temp.add(line[i]);

                    S2_3.add(temp);
                    //System.out.println(S2_3);
                }
                if(line[0].equals("SC3")){
                    List<String> temp = new ArrayList<String>();
                    for(int i=0; i<line.length; i++)
                        temp.add(line[i]);

                    S2_3.add(temp);
                    //System.out.println(S2_3);
                }
               // fc.add(Double.parseDouble(element));
            }
            row++;
        }
        System.out.println(S1);
        createWorkFlows(S1,S2_3);

    }
}
