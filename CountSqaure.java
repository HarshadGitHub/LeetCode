class CountSqaure {
    public int countSquares(int[][] matrix) {
        
        if(matrix.length==0 || matrix[0].length==0) return 0;
        
        int count=0;
        
        for(int row=0; row<matrix.length; row++)
            if(matrix[row][0]==1) count++;
        for(int col=1; col<matrix[0].length; col++)
            if(matrix[0][col]==1) count++;
        for(int row=1; row<matrix.length; row++){
            for(int col=1; col<matrix[0].length; col++){
                if(matrix[row][col]==1){
                matrix[row][col]= 1+ Math.min(matrix[row-1][col-1],
                    Math.min(matrix[row][col-1],matrix[row-1][col]));
                }
            count+=matrix[row][col];
            }
        
        }
        return count;
    }
}
