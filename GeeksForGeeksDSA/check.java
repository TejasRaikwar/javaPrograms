//package GeeksForGeeksDSA;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class check {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        char[] arr = str.toCharArray() ;
//        String res = "", first ="", last = "", cons="", conLast="",finalresult="";
//        boolean isvowelFind = false;
//        for(int i = 0 ; i <arr.length ; i++){
//            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
//                res += arr[i];
//                isvowelFind=true;
//            }
//            else{
//                cons+=arr[i];
//            }
//        }
//
//        String res1 = placeInLex(res);
//        String cons1 = placeInLex(cons);
//        char [] arr2 = res1.toCharArray();
//        for(int j = 0 ; j<arr.length ; j++){
//            if(res1.indexOf(0)==arr[j]){
//                first += String.valueOf(j);
//                break;
//            }
//        }
//        for (int j = 0 ; j<arr.length;j++){
//            if (arr2[arr.length-1]==arr[j]){
//                last += String.valueOf(j);
//                break;
//            }
//        }
//        for (int j = 0 ; j<arr.length;j++){
//            if(cons.indexOf(cons.length()-1)==arr[j]){
//                conLast += String.valueOf(j);
//                break;
//            }
//        }
//        if(isvowelFind){
//            finalresult=res1+first+cons1+last;
//        }
//        else{
//            finalresult = "NA-1"+cons1+conLast;
//        }
//
//    }
//
//     static String placeInLex(String s) {
//        char arr[] = s.toCharArray();
//        Arrays.sort(arr);
//        return new String(arr);
//    }
//}
