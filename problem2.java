import java.util.*;

public class Problem2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int rem = arr[0] % k;

        boolean possible = true;

        for(int i = 1; i < n; i++) {

            if(arr[i] % k != rem) {

                possible = false;

                break;
            }
        }

        if(!possible) {

            System.out.println(-1);

            sc.close();

            return;
        }

        int steps[] = new int[n];

        for(int i = 0; i < n; i++) {

            steps[i] = (arr[i] - rem) / k;
        }

        Arrays.sort(steps);

        int median = steps[n / 2];

        long ans = 0;

        for(int i = 0; i < n; i++) {

            ans += Math.abs(steps[i] - median);
        }

        System.out.println(ans);

        sc.close();
    }
}
