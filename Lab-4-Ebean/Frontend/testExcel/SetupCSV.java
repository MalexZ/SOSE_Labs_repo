import java.io.*;
import java.nio.file.Paths;
import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import com.opencsv.CSVWriter;

//Read data and create data structure (Array List). Then use data structure to create 50 workflows (createWorkflow function),
// calculating fitnessValues (createFV funciton) and then create csv that is imported into website database.

public class SetupCSV {
    public static void createCsv(List titles, List cat)  {
        String fullPath = new File(".").getAbsolutePath();
        fullPath = fullPath + "\\baseFile.csv";
        System.out.println(fullPath);
        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter("baseFile.csv"));
        } catch (IOException e) {
            e.printStackTrace();
        }

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
        // String fullPath = new File("").getAbsolutePath();
        // fullPath = fullPath+"\\AbstractTest.csv";
        //File file= new File(fullPath);
        Scanner sc = new Scanner(new File("InputTest.csv"));
        // System.out.println(fullPath);
        sc.useDelimiter(",");
        int col = 0;
        int row = 0;

        //array for titles and probabilities
        List<String> titles = new ArrayList<String>();
        List<Integer> cat = new ArrayList<Integer>();
        List<Double> operate = new ArrayList<Double>();
        int largestCategory;
        String name;
        while(sc.hasNext());
        {
            System.out.println("in while");
            if (row!=0){
                if(col==2){
                    name=sc.next();
                    name = parseName(name);
                    titles.add(name);
                }
                if(col>=3 || col<=52) {
                    operate.add(Double.parseDouble(sc.next()));
                }
                if(col==52) {
                    largestCategory = findLargestCategory(operate);
                    cat.add(largestCategory);
                }
            }
            else{
                sc.next();
            }
            col++;
            if(row==0)
                row++;
            else if(col%52 ==0){
                col=0;
                //empty operate List
                operate.clear();
                row++;
            }
        }

        createCsv(titles, cat);

    }
}
