package LeetCode;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.jce.provider.BrokenKDF2BytesGenerator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.CharArrayReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ArrayPrograms {

    @Test
    public void medianOfArray()  {
        int[] arr1={1,2};
        int[] arr2={3,4};
        int[] arr3=new int[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++)  {
            arr3[i]=1;
        }
        for(int i:arr1){
            System.out.println("i");
        }
    }
    @Test
    public void midianArr()  {
        int [] arr1 = {2,5,6,7,8};
        int[] arr2 = {1,3,4,9};
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = 0;
        Set<Integer> setDemo=new TreeSet<>();

        for(int i:arr1)  {
            setDemo.add(i);
        }
        for(int i:arr2)  {
            setDemo.add(i);
        }


        /*while(left<arr1.length || right<arr2.length)  {
            if(left==arr1.length)  {

                    list.add(arr2[right]);
                    right++;

            }
            else if (right == arr2.length) {

                    list.add(arr1[left]);
                    left++;

            }
            else if(arr1[left]<arr2[right])  {
                list.add(arr1[left]);
                left++;
            }
            else if(arr2[right]<arr1[left])  {
                list.add(arr2[right]);
                right++;
            }

        }*/
        for(int i : setDemo)  {
            System.out.println(i);
        }
        LinkedList<Integer> list1=new LinkedList<>(setDemo);

        if(list1.size()%2 ==0)  {
            int mid = list1.size()/2;
            int midian = (list1.get(mid-1)+list1.get(mid))/2;
            System.out.println(midian);
        }
        else  {
            int mid = list1.size()/2;
            System.out.println(list1.get(mid));
        }
    }
    @Test
    public void totalCandy()  {
        int arr[] = {1,2,6,1,3};
        int totalCandy = arr.length;
        for(int i=0; i<arr.length-1; i++)  {
            if(i==0)  {
                if(arr[i]<arr[i+1])  {
                    totalCandy += 1;
                }
            }
            else if (arr[i-1]>arr[i] && arr[i+1]>arr[i])  {
                totalCandy += 2;
            }
            else if (arr[i-1]>arr[i] || arr[i+1]>arr[i])  {
                totalCandy += 1;
            }
//            else if (arr[i+1]==arr.length)  {
//                if(arr[i]>arr[i+1])  {
//                    totalCandy += 1;
//                }
//            }
        }
        System.out.println(totalCandy);
    }

    @Test()
    public void shiftZerolast()  {
        int[] arr={0,4,0,1,0,4,7,8};

        for(int i=arr.length-1;i>=0;i--)  {
            if(arr[i]==0)  {
                for(int j=i;j<arr.length-1;j++)  {
                    arr[j]=arr[j+1];
                }
                arr[arr.length-1]=0;
            }
        }
        for(int i:arr)  {
            System.out.println(i);
        }

    }

    @Test
    public void shiftZeroFirst()  {
        int[] arr={1,0,5,0,2,4,0,47};

        for(int i=0;i<arr.length;i++)  {
            if(arr[i]==0)  {
                for(int j=i;j>0;j--)  {
                    arr[j]=arr[j-1];
                }
                arr[0]=0;
            }
        }
        for(int i:arr)  {
            System.out.println(i);
        }
    }

    @Test
    public void candy()  {
        int arr[]={1,2,6};
        int candyCount=arr.length;
        for(int i=0;i<arr.length-1;i++)  {
            if(i==0) {
                if (arr[i] < arr[i + 1]) {
                    candyCount++;
                }
            }else if(arr[i]<arr[i+1])  {
                candyCount++;
            }else if(arr[i+1]==arr.length)  {
                candyCount++;
            }


        }
        System.out.println(candyCount);
    }
    @DataProvider(name="testData")
    public Object[][] getTestData()  {
        return new Object[][] {{1,2},{2,3}};
    }

    @Test
    public void shiftZeros()  {
        int arr[]={1,0,2,3,0,5,0,8};
        int k=2;
        int last;
        for(int i=0;i<k;i++) {
            last=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--) {
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
//        for(int i=0;i<arr.length;i++)  {
//            if(arr[i]==0)  {
//                for(int j=i;j>0;j--) {
//                    arr[j] = arr[j - 1];
//                }
//                arr[0]=0;
//            }
//        }
        for(int i:arr)  {
            System.out.println(i);
        }
//
//        for(int i=arr.length-1;i>=0;i--)  {
//            if(arr[i]==0) {
//                for(int j=i;j<arr.length-1;j++)   {
//                    arr[j]=arr[j+1];
//                }
//                arr[arr.length-1]=0;
//            }
//        }
//        for(int j:arr)  {
//            System.out.println(j);
//        }
    }
    @Test
    public void prime()  {
      String s="ewfwefaqgff";
      HashMap<Character,Integer> map=new HashMap<>();
      List<String>list=new ArrayList<>();
      list.add(null);
        list.add(null);
        list.add(null);
      Iterator itr=list.iterator();
      while(itr.hasNext())  {
          System.out.println(itr.next());
      }
      for(int i=0;i<s.length();i++)  {
          if(map.containsKey(s.charAt(i)))  {
              map.put(s.charAt(i),map.get(s.charAt(i))+1);
          }else{
              map.put(s.charAt(i),1);
          }
      }
        Set<Character>set=new HashSet<>(map.keySet());
        for(char i:set)  {
            System.out.println(i);
        }

//      for(Map.Entry<Character,Integer> entry:map.entrySet()){
//          if(entry.getValue()>1)  {
//              map.remove(entry.getKey());
//          }
//      }
//        for(Map.Entry<Character,Integer> entry:map.entrySet()){
//            System.out.println("key - "+entry.getKey()+"valus - "+entry.getValue());
//        }

    }

    @Test
    public void minSub()  {
        int[] arr={3,9,0,15,99,0,98,0};
        int count =0;
        for(int i =0;i<arr.length; i++)  {
            if(arr[i]!=0)  {
                arr[count] = arr[i];
                count++;
            }
        }
        while(count<arr.length)  {
            arr[count++] =0;
        }
        for(int a : arr)  {
            System.out.println(a);
        }


    }

    @Test
    public void readExcel() throws IOException {

        FileInputStream f=new FileInputStream("C:\\Users\\prachi\\Desktop\\Test.xlsx");
        XSSFWorkbook wb=new XSSFWorkbook(f);
        Sheet sh=wb.getSheet("TestData");
        Row row=sh.getRow(0);
        int rowcount=sh.getLastRowNum();
        System.out.println(rowcount);
        Cell cell=row.getCell(0);
        System.out.println(row.getLastCellNum());
        for(int i=1;i<=rowcount;i++ )  {
            for(int c=0;c<row.getLastCellNum();i++)  {
                System.out.println(sh.getRow(i).getCell(c));
            }

        }

    }
    @Test
    public void primeNumber()  {
       int a=0,b=1,c=0;
       int num=10;
        System.out.println(a);
        System.out.println(b);
       for(int i=2;i<=num;i++)  {
           c=a+b;
           a=b;
           b=c;
           System.out.println(c);
       }
    }
    @Test
    public void pattern()  {
        int arr[]={3,6,8,1,7};
        int max=arr[0];
        int secmax=arr[1];
        for(int i=0;i<arr.length;i++)  {
            if(arr[i]>max) {
                max = arr[i];
            }else if(arr[i]>secmax)  {
                secmax=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secmax);
    }

    @Test
    public void palindromeSubstring()  {
        String str="bdesddsedgg";
        int start=0,end=str.length()-1,ref=str.length()-1,ref2=0;

        while(start<str.length()-2)  {
            if(str.charAt(start)==str.charAt(end))  {
                if(end==start+1)  {
                    break;
                }else if(start == end)  {
                    break;
                }
                else {
                    start++;
                    end--;
                }

            }else if (start==end||end==start+1)  {
                ref2++;
                start=ref2;
                end=str.length()-1;
            } else if (str.charAt(start)!=str.charAt(end)) {

                ref--;
                end=ref;

            }
        }
        if(ref==ref2+1)  {
            System.out.println("none");
        }else  {
            str.substring(ref2,ref);
            System.out.println(str.substring(ref2,ref+1));
        }

    }

}
