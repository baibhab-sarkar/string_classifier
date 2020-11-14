import java.util.*;
class AlphaNumChar 
{
    int i,length;
    String str;
    AlphaNumChar(String s,int l)
    {
        str=s;
        i=0;
        length=l;
    }  
    void Split_Alphabet()
    {
        String Alphabets="";
        int j;
        for(i=0;i<length;i++)
        {
            for(j=65;j<=90;j++)
            {
                if(str.charAt(i)==(char)j)
                Alphabets=Alphabets+str.charAt(i);
                else
                continue;
            }
        }
        System.out.println("ONLY ALPHABETS:-"+Alphabets);
    }  
    void Split_Number()
    {
        String Numbers="";
        int j;
        for(i=0;i<length;i++)
        {
            for(j=48;j<=57;j++)
            {
                if(str.charAt(i)==(char)j)
                Numbers=Numbers+str.charAt(i);
                else 
                continue;
            }
        }
        System.out.println("ONLY NUMBERS:-"+Numbers);
    }
    void Split_SpecialCharacters()
    {
        String Special_Characters="";
        int j;
        for(i=0;i<length;i++)
        {
            for(j=32;j<=47;j++)
            {
                if(str.charAt(i)==(char)j)
                Special_Characters=Special_Characters+str.charAt(i);
                else
                continue;
            }
            for(j=58;j<=64;j++)
            {
                if(str.charAt(i)==(char)j)
                Special_Characters=Special_Characters+str.charAt(i);
                else
                continue;
            } 
            for(j=91;j<=96;j++)            
            {
                if(str.charAt(i)==(char)j)
                Special_Characters=Special_Characters+str.charAt(i);
                else
                continue;
            }
            for(j=123;j<=126;j++)
            {
                if(str.charAt(i)==(char)j)
                Special_Characters=Special_Characters+str.charAt(i);
                else
                continue;
            }
        }
        System.out.println("OnLY SPECIAL CHARACTERS:-"+Special_Characters);
    }
    public static void main(String args[])
    {
        Scanner xy=new Scanner(System.in);
        System.out.println("Enter A Sentence:");
        String s=xy.nextLine();
        s=s.trim();
        s=s.toUpperCase();
        int l=s.length();
        AlphaNumChar ab=new AlphaNumChar(s,l);
        ab.Split_Alphabet();
        ab.Split_Number();
        ab.Split_SpecialCharacters();
        xy.close();
    } 
}
