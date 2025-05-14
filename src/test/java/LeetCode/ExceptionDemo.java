package LeetCode;

public class ExceptionDemo{
    static int a=10;
    static int b=0;
    public  static  void main(String []args)  {
        try {
            throw  new CustomException("Invalid age");
        } catch (CustomException e) {
            throw new RuntimeException(e);
        }
    }
}
