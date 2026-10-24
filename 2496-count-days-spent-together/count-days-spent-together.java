class Solution {
    int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    int convert(String s){
        String m="" , d ="";
        m += s.charAt(0);
        m += s.charAt(1);

        d += s.charAt(3);
        d += s.charAt(4);
        int count =0,mm,dd;
        mm = Integer.parseInt(m);
        dd = Integer.parseInt(d);
        for(int i=0;i<mm;i++){
          count += month[i];
        }
        count += dd;
        return count;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int arr1 = convert(arriveAlice);
        int arr2 = convert(arriveBob);
        int leave1 = convert(leaveAlice);
        int leave2 = convert(leaveBob);

        int arr = Math.max(arr1, arr2);
        int leave = Math.min(leave1 , leave2);
        if(arr > leave) return 0;
        return leave - arr + 1;
    }
}