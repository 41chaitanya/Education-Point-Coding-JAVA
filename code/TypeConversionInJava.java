public class TypeConversionInJava {
    public static void main(String[] args) {

        // type conversion 
                //  one data type  other data type convert 

                    //  implicit (widening) / explicit (narrowing)
                    
                        // implicit 
                            // small  data type ---> large data type 
                            //compiler  automatically  do this 

                                byte myByteNum=55;

                                short myShortNum=myByteNum;

                                int myIntNum=myShortNum;
                                
                                // System.out.println(myShortNum);
                                
                                // explicit type conversion (type casting )
                                // large data type ---> small data type 
                                //user forcefully do this  
                                // by using operator
                                double doubleVar=2255.55;
                                int intVar=(int)doubleVar;
                                // System.out.println(doubleVar);
                                // System.out.println(intVar);
                                
                                int myVar=400;
                                byte myByte=(byte)myVar;
                                System.out.println(myVar);
                                System.out.println(myByte);
                            }
}
