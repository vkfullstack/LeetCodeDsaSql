class Solution {
    public int maximumPopulation(int[][] logs) {

        int maxPopulation = 0;
        int answerYear = 0;

        
        for (int year = 1950; year < 2050; year++) {

            int population = 0;

            for (int i = 0; i < logs.length; i++) {

                int birth = logs[i][0];
                int death = logs[i][1];

            
                if (birth <= year && year < death) {
                    population++;
                }
            }

           
            if (population > maxPopulation) {
                maxPopulation = population;
                answerYear = year;
            }
        }

        return answerYear;
    }
}