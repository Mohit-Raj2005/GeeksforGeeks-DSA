// User function Template for Java

class Solution {
    // Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        ArrayList<Integer>array=new ArrayList<>();
        for(int row=0;row<matrix.length;row++){  //iterating rows 
            if(row%2==0){  //for even rows , iterating columns from left to right
                for(int column=0;column<matrix[0].length;column++){
                    array.add(matrix[row][column]); //adding element of that iteration to the arraylist
                }
            }
            else{  //for odd rows , iterating from right to left
                for(int column = matrix[0].length-1;column>=0;column--){
                    array.add(matrix[row][column]);  //adding element of that iteration to the arraylist

                }
            }
        }
        return array;
    }
}