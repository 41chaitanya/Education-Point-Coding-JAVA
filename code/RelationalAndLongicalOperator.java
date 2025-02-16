public class RelationalAndLongicalOperator {
    public static void main(String[] args) {
    //    Relational
        // ==
        // = vs ==
        // = -->assign ,==-->comnpare 

        // int a=5;
        // int b=2*3;
        // System.out.println(a==b);

        // // !=
        // int c=5;
        // System.out.println(a!=c);
        
        // int a=5;
        // int b=4;
        // >
        
        // System.out.println(a<b);
        
        
        // <
        // System.out.println(a>b);
        
        // int x=5;
        // int y=5;
        // // >= 
        // System.out.println(x>=y);
        // // <=
        // System.out.println(x<=y);

        // real life example 

        int marksObtained=45;
        int passingMarks=33;

        // System.out.println(marksObtained>=passingMarks); //-->true


        int requireAge=25;
        int myage=27;

        // System.out.println(myage<=requireAge); //-->false

        boolean isIndian=true;

        // System.out.println(isIndian==true); //-->true



        // combine all condition ---> logical operator 


        // sari condition necessary  --- logical operator 


        System.out.println(marksObtained>passingMarks && myage<requireAge &&isIndian==true ); //-->  false 




    }
}
