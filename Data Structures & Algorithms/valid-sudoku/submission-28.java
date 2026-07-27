class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> cols = new HashMap<>();
        HashMap<Integer, HashSet<Character>> rows = new HashMap<>();
        HashMap<String, HashSet<Character>> squares = new HashMap<>();

        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                if (board[i][j] == '.') continue;

                String squareKey = i/3 + "," + j/3; 
                if (cols.computeIfAbsent(j, k -> new HashSet<>()).contains(board[i][j]) 
                    || rows.computeIfAbsent(i, k -> new HashSet<>()).contains(board[i][j])
                    || squares.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(board[i][j]))
                    return false;

                rows.get(i).add(board[i][j]);
                cols.get(j).add(board[i][j]);
                squares.get(squareKey).add(board[i][j]);
            }
        }

        return true;
    }
}
