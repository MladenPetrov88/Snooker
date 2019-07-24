import java.util.Scanner;

public class SnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String period = scanner.nextLine();
        String type = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        String pic = scanner.nextLine();
        double sum = 0;

        if(period.equals("Quarter final")) {
            if (type.equals("Standard")) {
                sum=number*55.50;
            } else if (type.equals("Premium")){
                sum=number*105.2;
            } else if (type.equals("VIP")){
                sum=number*118.90;
            }
        }
        if(period.equals("Semi final")) {
            if (type.equals("Standard")) {
                sum=number*75.88;
            } else if (type.equals("Premium")){
                sum=number*125.22;
            } else if (type.equals("VIP")){
                sum=number*300.4;
            }
        }

        if(period.equals("Final")) {
            if (type.equals("Standard")) {
                sum=number*110.10;
            } else if (type.equals("Premium")){
                sum=number*160.66;
            } else if (type.equals("VIP")){
                sum=number*400;
            }
        }

        if(sum>4000){
            sum=sum*0.75;
        }
        else if (sum>2500){
            if(pic.equals("Y")){
                sum=sum*0.9 +number*40;
            }
            else {
                sum=sum*0.9;
            }
        }
        else {
            if(pic.equals("Y")){
                sum=sum+number*40;
            }
        }

        System.out.printf("%.2f",sum);



    }
}

