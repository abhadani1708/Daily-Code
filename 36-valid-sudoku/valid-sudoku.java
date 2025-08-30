class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') { // Only check non-empty cells
                    // Create unique keys for rows, columns, and boxes
                    String rowKey = "row" + i + num;
                    String colKey = "col" + j + num;
                    String boxKey = "box" + (i / 3) + (j / 3) + num;
                    
                    // Check if the number has already been seen
                    if (seen.contains(rowKey) || seen.contains(colKey) || seen.contains(boxKey)) {
                        return false; // Duplicate found
                    }
                    
                    // Add the number to the seen set
                    seen.add(rowKey);
                    seen.add(colKey);
                    seen.add(boxKey);
                }
            }
        }
        return true;
    }
}