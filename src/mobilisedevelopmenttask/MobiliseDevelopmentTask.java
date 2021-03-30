/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilisedevelopmenttask;

/**
 *
 * @author mar_9
 */
public class MobiliseDevelopmentTask {

    public final static int NO_SOLUTION_FOUND_CODE = 0;

    public final static int MIN_TERRAIN = 3;

    public final static int MAX_WIND_SPEED = 19;

    public final static int LENGTH_OF_VALID_TERRAIN = 3;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] t = {0, 1, 2, 0, 1, 3, 1, 2, 2, 3, 1, 2, 3, 1, 1, 1, 0, 1, 2, 3, 3, 3, 1, 2, 2, 3, 1, 0, 2, 1};
        int[] w = {10, 15, 20, 30, 30, 20, 40, 40, 30, 20, 10, 15, 20, 10, 15, 10, 30, 15, 15, 5, 10, 30, 10, 20, 25, 35, 40, 50, 20, 15};

        int startingPoint = findLandingStartingPoint(t, w);
        if (startingPoint == NO_SOLUTION_FOUND_CODE) {
            System.out.println("Error, no suitable location was found");
        } else {
            System.out.println(startingPoint);
        }
    }

    public static int findLandingStartingPoint(int[] terrain, int[] wind) {
        if (terrain == null || wind == null) {
            System.err.println("No terrain or wind provided. Please provide a valid input!");
            return NO_SOLUTION_FOUND_CODE;
        }
        int lenOfIteration = terrain.length < wind.length ? terrain.length : wind.length;
        for (int i = 0; i < lenOfIteration - (LENGTH_OF_VALID_TERRAIN - 1); i++) {
            if (terrain[i] < 0 || wind[i] < 0) {
                System.err.println("Terrain or wind should be positive values");
                return 0;
            }
            int nextIndex = i + 1;
            int nextNextIndex = i + 2;
            if (terrain[i] == terrain[nextIndex] && terrain[i] == terrain[nextNextIndex]
                    && wind[i] < MAX_WIND_SPEED && wind[nextIndex] < MAX_WIND_SPEED
                    && wind[nextNextIndex] < MAX_WIND_SPEED) {
                return i;
            }
        }
        return NO_SOLUTION_FOUND_CODE;
    }
}
