package labor12_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Storage {
    private Map<Integer,Product> products=new HashMap<>();
//    private Map<Integer,Product> products=new TreeMap<>();

    public Storage(String fileName){
        try (Scanner scanner=new Scanner(new File(fileName))){
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                String[] items=line.split(" ");

                this.products.put(Integer.parseInt(items[0].trim()),new Product(Integer.parseInt(items[0].trim()),
                        items[1].trim(),Integer.parseInt(items[2].trim()),Integer.parseInt(items[3].trim())));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found:"+fileName);
            System.exit(1);
        }
    }

    public void update(String fileName){
        try (Scanner scanner=new Scanner(new File(fileName))){
            int updated=0;
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] items = line.split(" ");

                if(products.containsKey(Integer.parseInt(items[0].trim()))){
                    products.get(Integer.parseInt(items[0].trim())).updateAmount(Integer.parseInt(items[1].trim()));
                    updated++;
                }
            }
            System.out.println("Number of successful updates:"+updated);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found:"+fileName);
            System.exit(1);
        }
    }
}