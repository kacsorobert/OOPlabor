import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Kacso Robert, Szovata, Domokos Kazmer, Termeszettudomany");
//        String name = "Kacso Robert";
//        String monogram = "K" + "R";
//        for (int i = 0; i < name.length(); i++) {
//            System.out.println(name.charAt(i));
//        }
//        System.out.println(monogram);
//
//        3. feladat
//        String str = "ALMAFA";
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.substring(0, i + 1));
//        }
//
//        4. feladat
//        String name = "Kerekes Balint Adam Jozsef";
//        String[] words = name.split(" ");
//        String monogram = "";
//        for (String word : words) {
//            monogram += word.charAt(0);
//        }
//        System.out.println(monogram);

        //II 1. feladat
//        double x[] ={7, 1, -3, 45, 9};
//        System.out.printf("MAX: %6.2f\n", maxElement( x ));
//        double y[] ={};
//        System.out.printf("MAX: %6.2f\n", maxElement( y ));
//        double z[] =null;
//        System.out.printf("MAX: %6.2f\n", maxElement( z ));

        //II 2.feladat

//        int number=13;
//        int order=9;
//        System.out.println(getBit(number,order));

        //II 3.feladat
//        for(int i=0;i<32;i++){
//            System.out.println(countBits(i));
//        }

        //II 4.feladat
//        double array[]={1.1, 3.1415, 9.3};
//        System.out.println(mean(array));

        //II 5.feladat
//        double array[]={6,2,3,1};
//        System.out.println(stddev(array));

        //II 6.feladat
        double array[]={9.6,2.2,3.4,0.1};
        System.out.println(Arrays.toString(max2(array)));
    }

    public static double maxElement( double array[] ){
        double max = Double.NEGATIVE_INFINITY;
        if(array==null) {
            System.out.println("Nem letezo tomb!");
            return max;
        }
        for( int i=0; i<array.length; ++i ){
            if( array[i] > max){
                max = array[ i ];
            }
        }
        return max;
    }
    public static int getBit(int number, int order){
        if(order>31 || order<0){
            return -1;
        }
        else{
            return (number>>order) & 1;
        }
    }
    public static int countBits(int number){
        int count=0;

        while(number!=0){
            if((number & 1)==1){
                count++;
            }
            number>>=1;
        }
        return count;
    }
    public static double mean(double array[]){
        double sum=0;
        if(array==null){
            return Double.NaN;
        }
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }

        return sum/array.length;
    }
    public static double stddev(double array[]){
        if(array==null){
            return Double.NaN;
        }

        double average=mean(array);
        double sum=0;
        for(int i=0;i< array.length;i++){
            sum+=Math.pow((array[i]-average),2);
        }
        sum/=array.length;

        return Math.sqrt(sum);
    }
    public static double[] max2( double array[] ){
        if( array.length == 0 ){
            double max[]={Double.NaN};
            return max;
        }
        else if(array.length==1){
            double max[]={array[0],array[0]};
            return max;
        }
        else if(array[0]>=array[1]){
            double max[]={array[0],array[1]};

            for(int i=2;i<array.length;i++){

                if(array[i]>max[0]){
                    max[0]=array[i];
                }
                else if(array[i]<=max[0] && array[i]>max[1]){
                    max[1]=array[i];
                }
            }
            return max;
        }
        else{
            double max[]={array[1],array[0]};

            for(int i=2;i<array.length;i++){

                if(array[i]>max[0]){
                    max[0]=array[i];
                }
                else if(array[i]<=max[0] && array[i]>max[1]){
                    max[1]=array[i];
                }
            }
            return max;
        }
    }
}