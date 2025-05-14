package org.example;
import org.apache.poi.util.ArrayUtil;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;


import java.util.*;

public class TestDemo {
    @Test
    public void demo()  {
        int temp;
        int arr[]={4,2,7,3,1,9};
        for(int i=0;i<arr.length;i++)  {
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int num :arr ) {
            System.out.println(num);
        }
        System.out.println();

        String s= "aainkdnbbwlkllkkllppp";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)  {
            if(map.containsKey(s.charAt(i)))  {
                int count=map.get(s.charAt(i));
                map.put(s.charAt(i),++count);

            }else  {
                map.put(s.charAt(i),1);
            }

        }
        System.out.println(map);


        for(Map.Entry<Character,Integer> entry : map.entrySet())  {
            if(entry.getValue()==1)  {
                System.out.println(entry.getKey().toString()+entry.getValue().intValue());
            }

        }
        List<Integer> li=new ArrayList<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.remove(2);
        System.out.println(li.isEmpty());
        ListIterator<Integer> it=li.listIterator();
        if(it.hasNext())  {
            System.out.println(li.get(it.next()));
        }

        Set<Integer> set=new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        Iterator<Integer>iterarot=set.iterator();
       if(iterarot.hasNext())  {
           System.out.println(set);
       }

       String s1="uibJbd7712k";
        char[] charArr=s1.toCharArray();
        int sum=0;
        for(int i =0;i<charArr.length;i++)  {
//            if(charArr[i]>=65 && charArr[i]<=90) {
//                System.out.println("Capital" + charArr[i]);
//            }
            if(charArr[i]>48 && charArr[i]<57)  {
                sum=sum+Integer.parseInt(String.valueOf(charArr[i]));
            }
//            if(charArr[i]>=97 && charArr[i]<=122)  {
//                System.out.println("small"+charArr[i]);
//            }

        }
        System.out.println(String.valueOf(sum));

    }
    @Test
    public void recur()  {
        String s="prachi,prachi,prachi,sam,sam,me";
        String [] sarr=s.split(",");
        Map<String,Integer>map=new HashMap<>();
        for(int i=0;i<sarr.length;i++)  {
            if(map.containsKey(sarr[i]))  {
                int count =map.get(sarr[i]);
                map.put(sarr[i],++count);
            }else  {
                map.put(sarr[i],1);
            }
        }
        System.out.println(map);

        String sname="prachi",rev="";
        char ch;
        for(int i=sname.length()-1;i>=0;i--)  {
            ch=sname.charAt(i);
            rev=rev+ch;

        }
        System.out.println(rev);
        StringBuilder builder=new StringBuilder(sname);
        System.out.println(builder.reverse());;


        int[]  arr={1,2,3,4,5};
        System.out.println("rever arr is ");
        reverseArr(arr,5,0);
        ArrayList<String>a=new ArrayList<String>();

        HashSet<String> set=new HashSet<String>();
        LinkedHashSet<String> set1=new LinkedHashSet();

    }
    public void reverseArr(int[] arr,int size,int index)  {
       if(index>=size)  {
           return;
       }
       reverseArr(arr,size,index+1);
        System.out.println(arr[index]);
        String n[]={"1","2","%","4","*"};
        Character.getNumericValue(Integer.parseInt(n[0]));
        arr.toString();
    }
    @Test
    public void sum()  {
        HashMap<String,Integer>ma=new HashMap<>();
        ma.put("a",1);
        ma.put("w",7);
        ma.put("h",4);
        ma.put("z",1);
        ma.put("i",8);
        TreeMap<String,Integer>tr=new TreeMap<>(ma);
        for(Map.Entry<String,Integer>en:tr.entrySet())  {
            System.out.println(en.getKey()+ en.getValue());
        }


    }

    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int n =4;
        int m = 4;
        int [][] a = {{1,2,3,4},{1,2,4,5},{2,3,3,4},{1,1,2,3}};

        int diagonalSum = 0;
        int row = i;
        int col = j;

        while (row < n && col < m )
        {
            diagonalSum += a[row][col];
            row++;
            col++;
        }


        System.out.println(diagonalSum);
    }



}
