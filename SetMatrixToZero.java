class SetMatrixToZero {
    public void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>> zeroes = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0 ; i<rows ; i++){
            for(int j=0 ; j<cols ; j++){
                if(matrix[i][j] == 0){
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    zeroes.add(temp);
                }
            }
        }


        for(int i=0 ; i<zeroes.size() ; i++){
            int row = zeroes.get(i).get(0);
            int col = zeroes.get(i).get(1);

            for(int j=0 ; j<cols ; j++){
                matrix[row][j] = 0;
            }

            for(int j=0 ; j<rows ; j++){
                matrix[j][col] = 0;
            }
        }
    }
}