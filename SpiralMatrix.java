class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        int top = 0,left=0;
        int bottom = matrix.length-1,right = matrix[0].length-1;

        while(top <= bottom && left <= right){

            for(int j = left ; j<=right ; j++){
                arr.add(matrix[top][j]);
            }
            top++;

            for(int j=top ; j<=bottom ; j++){
                arr.add(matrix[j][right]);
            }
            right--;

            if(top <= bottom){
                for(int j = right ; j>=left ; j--){
                    arr.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if(left <= right){
                for(int j=bottom ; j>=top ; j--){
                    arr.add(matrix[j][left]);
                }
                left++;
            }
        }

        return arr;
    }
}