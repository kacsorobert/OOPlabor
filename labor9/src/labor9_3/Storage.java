package labor9_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Storage {
    private ArrayList<Product> products;

    public Storage(String fileName){
        this.products=new ArrayList<>();

        Scanner scanner=null;

        try {
            scanner=new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found:"+fileName);
            System.exit(1);
        }

        while(scanner.hasNextLine()){
            String line=scanner.nextLine();
            String[] items=line.split(" ");
            this.products.add(new Product(Integer.parseInt(items[0].trim()),items[1].trim(),
                    Integer.parseInt(items[2].trim()),Integer.parseInt(items[3].trim())));
        }
        Collections.sort(products);
    }

    public void update(String fileName){
        Scanner scanner=null;

        try {
            scanner=new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found:"+fileName);
            System.exit(1);
        }

        int index,updated=0;
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] items = line.split(" ");
            index=Collections.binarySearch(products, new Product(Integer.parseInt(items[0].trim()), null,
                    0, 0));
            if(index>=0){
                products.get(index).increaseAmount(Integer.parseInt(items[1].trim()));
                updated++;
            }
        }
        System.out.println("Number of successful updates:"+updated);
    }
}
