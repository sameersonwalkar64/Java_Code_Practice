package selenium;

public class CheatCode {
    public static void main(String[] args) {
        String s = "coding";
        String t = "ing";
        int l=0;
        int r =t.length();
        int exchangeCharNumber = t.length();

        while(r<s.length()+1)  {
            if(exchangeCharNumber == 0)  {
                break;
            }
            StringBuilder sb = new StringBuilder(s.substring(l,r));
            int p1 =0, p2 =0;
            while(p1<t.length())  {
                if(t.charAt(p1) == sb.charAt(p2))  {
                    sb.deleteCharAt(p2);
                    exchangeCharNumber =Math.min(sb.length(), exchangeCharNumber);
                    if(sb.length() ==0)  {
                        break;
                    }
                    p1++;
                    p2=0;
                }
                else{
                    if(p2 == sb.length()-1)  {
                        p1++;
                        p2 = 0;
                    }
                    else  {
                        p2++;
                    }
                }
            }
            l++;
            r++;
        }
        System.out.println(exchangeCharNumber);
    }

}
