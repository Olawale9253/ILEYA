public class splitArray{

    public static void main(String args[]){
    
       int [] array = {45, 60, 3, 10, 9, 22};

    int even = 0;

    for (int count = 0; count < array.length; count++){
    
        if (even % 2 == 0){

   
    
    System.out.print(" [" + array[even] + "]");
}
    
}

    for(int odd = 0; odd < array.length; odd++){

    if(odd % 2 != 0){

        System.out.print(" [ " + array[odd] + "]");
}
}
}
}
