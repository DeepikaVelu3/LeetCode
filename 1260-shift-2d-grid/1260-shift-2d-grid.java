class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] matrix = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                int oldIdx = i * col + j;
                int newIdx = (oldIdx + k) % (row * col);
                int newRow = newIdx / col;
                int newCol = newIdx % col;
                matrix[newRow][newCol] = grid[i][j];
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < row; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < col; j++){
                list.add(matrix[i][j]);
            }
            result.add(list);
        } 
        return result;
    }
}