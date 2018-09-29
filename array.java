class array{
// since the main mehod is static i.e we have created this method as static //

    static  int finder(int array[],int number){ // passing an array and the number which want to search in that array
        for (int i = 0;i<array.length;i++){
            if (array[i]==number){ 
                return i;
            }
        }
        return -1;
    }
    public static void main (String args[]){
        int array[] = {1,2,8,5,6,12};
        int number = 5;
        int position = finder(array,number);
        if (position==-1){
            System.out.println("element not found ");
        }
        System.out.println("element found" +(position+1));
    }
}
