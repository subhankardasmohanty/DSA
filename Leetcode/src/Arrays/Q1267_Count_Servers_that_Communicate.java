package Arrays;

public class Q1267_Count_Servers_that_Communicate {

    public int countServers(int[][] grid) {

        int a = grid.length;
        int b = grid[0].length;

        int[] row = new int[a];
        int[] col =  new int[b];

        for(int i = 0; i < a; i++){

            for(int j = 0; j < b; j++){

                if(grid[i][j] == 1){
                    row[i]++;
                    col[j]++;
                }
            }
        }

        int c = 0;

        for(int i = 0; i < a; i++){

            for(int j = 0; j < b; j++){

                if(grid[i][j] == 1 && (row[i] > 1 || col[j] > 1)){

                    c++;
                }
            }
        }

        return c;
    }
}
