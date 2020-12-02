import java.util.*;

public class CroatianAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String croa=sc.nextLine().trim();
        sc.close();
        String[] arr= {"c=","c-","dz=","d-","lj","nj","s=","z="};
        int result=0;

        for(int i=0;i<arr.length;i++) {
            if(croa.contains(arr[i])) {
                croa=croa.replaceAll(arr[i]," ");
            }
        }
        System.out.println(croa.length());
    }
}
