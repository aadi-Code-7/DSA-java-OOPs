class Solution {
    public int minLights(int[] lights) {
        // int n = lights.length;
        // boolean[] bulb = new boolean[n];

        // //If there is working bulb where v>0
        // //position i illumminates position {max(0, i-v) to min(n-1, i+v)}
        // //so according to qn
        // for(int i = 0; i<n; i++){
        //     if(lights[i]>0){
        //         int left = Math.max(0, i-lights[i]);
        //         int right = Math.min(n-1, i+lights[i]);

        //         for(int j=left; j<=right; j++){
        //             bulb[j] = true;
        //         }
        //     }
        // }

        // int ans = 0;
        // int i = 0;

        // while(i<n){
        //     if(bulb[i]){
        //         i++;
        //     }else{
        //         //placing new bulb at i+1 or (n-1 if boundary)

        //         int position = Math.min(i+1, n-1);

        //         int left = Math.max(0, position-1);
        //         int right = Math.min(n-1, position+1);

        //         //making bulb visibility range from left to right indexes
        //         for(int j=left; j<=right; j++){
        //             bulb[j] = true;
        //         }

        //         ans++;
        //     }
        // }
        // return ans;




        //Above code causes TLE because for loop traverse for every bulb inserted
        // Now
        int n = lights.length;
        int[] dif = new int[n+1];

        //here marking coverage of bulb using dif array
        for (int i=0; i<n; i++){
            if(lights[i] > 0){
                int left = Math.max(0, i-lights[i]);
                int right = Math.min(n-1, i+lights[i]);

                dif[left]++;
                dif[right+1]--;
            }
        }

        int visible=0;
        int ans = 0;

        for (int i=0; i<n; i++){
            visible += dif[i];

            if(visible == 0){
                ans++;
            
                //placing new bulb at i+1 or n-1
                int position = Math.min(i+1, n-1);

                //covers pos-1  to  pos+1
                int right = Math.min(n-1, position+1);
                int left = Math.max(0, position-1);

                dif[left]++;
                dif[right+1]--;

                visible++;
            }
        }

        return ans;
    }
}