import java.util.*
class Length{
    public static void main(String[]args){
        String x="Niranjana raja";
        x=x.concat("/0");
        char y[]=x.tocharArray[];
        int count=0;
        int i=0;
        while(y[i]!=0){
            ++count;
            ++i;
        }
        system.out.println("%d",count);

    }
}