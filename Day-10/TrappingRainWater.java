

public class TrappingRainWater {
    public static int trappingRainWater (int[] height) {
        int n = height.length;
        int totTrappedWater = 0;
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        int rightmax[] = new int[n];
        rightmax[n - 1] = height [n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        for (int i = 0; i < n; i++) {
            int waterLvl = Math.min(leftmax[i], rightmax[i]);  
            totTrappedWater += waterLvl - height[i] * 1;
        }
        return totTrappedWater;
    }
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappingRainWater(height));
    }
}
