class Solution {
    public boolean isValidSudoku(char[][] board) {
       
       //checking for the rows 
        for(int i=0; i < 9; i++){
            HashSet<Character> rowSet = new HashSet<>();
            for(int j=0; j < 9; j++){
                if(board[i][j] != '.'){
                if(board[i][j] < '1' || board[i][j] > '9') return false;
                if(rowSet.contains(board[i][j])) return false;
                else{
                    rowSet.add(board[i][j]);
                }
                }
            }
        }
        //checking the cols
    
        for(int i=0; i < 9; i++){
            HashSet<Character> colSet = new HashSet<>();
            for(int j=0; j < 9; j++){
                if(board[j][i] != '.'){

                if(board[j][i] < '1' || board[j][i] > '9') return false;
                if(colSet.contains(board[j][i])) return false;
                else{
                    colSet.add(board[j][i]);
                }
                }
            }
        }

//checking for boxes
       int subRows = 3; 
        int subCols = 3;

for (int subRow = 0; subRow < 3; subRow++) { // Iterate over row groups
    for (int subCol = 0; subCol < 3; subCol++) { // Iterate over column groups
        HashSet<Character> subSet = new HashSet<>();
        for (int i = subRow * subRows; i < (subRow + 1) * subRows; i++) {
            for (int j = subCol * subCols; j < (subCol + 1) * subCols; j++) {
                if(board[i][j] != '.'){
                if(board[i][j] < '1' || board[i][j] > '9') return false;
                if(subSet.contains(board[i][j])) return false;
                else{
                    subSet.add(board[i][j]);
                }
                }
            }
        }
    }
}
     return true;   
    }
}