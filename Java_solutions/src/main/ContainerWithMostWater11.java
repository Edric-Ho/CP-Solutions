public class ContainerWithMostWater11 {

    // Two pointers, linear runtime
    public int maxArea(int[] height) {
        int max_area = 0;
        int start = 0;
        int end = height.length - 1;

        while (end > start) {

            int width = end - start;
            int current_area = Math.min(height[start], height[end]) * width;
            max_area = Math.max(max_area, current_area);


            if (height[start] <= height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return max_area;
    }
}
