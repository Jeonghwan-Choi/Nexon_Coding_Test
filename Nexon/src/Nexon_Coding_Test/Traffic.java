package Nexon_Coding_Test;


public class Traffic {

	public static void main(String[] args) {
		int n = 6;
		int[] times = {7,10};
		
		int answer = 0;
        int max = 0;
        for(int i = 0; i < times.length; i++) {
            if(max < times[i]) {
                max = times[i];
            }
        }
        long start = 1, end = (long)max * n;

        while(start < end) {
            long mid = (start + end) / 2;
            long t = 0;
            for(int i = 0; i < times.length; i++) {
                t += mid / times[i];
            }
            if(t >= n) {
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        answer = (int)end;

        System.out.println(answer);
    
		
		

	}

}
