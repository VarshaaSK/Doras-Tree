import java.util.Scanner;

public class MangoTree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Tree Number : ");
        int tree_number = scan.nextInt();

        System.out.println("Enter the Number of Rows : ");
        int row = scan.nextInt();

        System.out.println("Enter the number of Coloumns : ");
        int coloumn = scan.nextInt();

        int[][] garden = new int[row][coloumn];
        int treeCheck = 1;
        int flag = 0;

        for(int rowIteration = 0 ; rowIteration < garden.length; rowIteration++){
            for(int coloumnIterator = 0 ; coloumnIterator < garden[rowIteration].length ;coloumnIterator++){
                if(treeCheck == tree_number){

                    if(rowIteration == 0 || coloumnIterator == 0 || coloumnIterator == garden[rowIteration].length - 1){
                        System.out.println("yes");
                        flag += 1;
                        break;
                    }
                }
                treeCheck += 1;
            }
            if(flag == 1){
                break;
            }

        }
        if(flag == 0){
            System.out.println("no");
        }
    }
}