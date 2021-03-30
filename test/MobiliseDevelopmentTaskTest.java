/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mar_9
 */

import mobilisedevelopmenttask.*;
import org.junit.Assert;
import org.junit.Test;

public class MobiliseDevelopmentTaskTest {
    
        @Test
        public void when3sequenceTerrainAreWithEqualLenAndWindIsLessThan3_thenFirstPositionShouldBeReturn() {
              int[] t = {0, 1, 2, 0, 1, 3, 1, 2, 2, 3, 1, 2, 3, 1, 1, 1, 0, 1, 2, 3, 3, 3, 1, 2, 2, 3, 1, 0, 2, 1};
              int[] w =      {10, 15, 20, 30, 30, 20, 40, 40, 30, 20, 10, 15, 20, 10, 15, 10, 30, 15, 15, 5, 10, 30, 10, 20, 25, 35, 40, 50, 20, 15};

              final int actualPosition = MobiliseDevelopmentTask.findLandingStartingPoint(t, w);
              
              Assert.assertEquals(13, actualPosition);
        }
        
         @Test
        public void whenLessThan3sequenceTerrainAreWithEqualLenAndWindIsLessThan3_thenNoReturn() {
              int[] t = {0, 1, 2, 0, 1, 3, 1, 2, 2, 3, 1, 2, 3, 1, 2, 1, 0, 1, 2, 3, 3, 3, 1, 2, 2, 3, 1, 0, 2, 1};
              int[] w ={10, 15, 20, 30, 30, 20, 40, 40, 30, 20, 10, 15, 20, 10, 15, 10, 30, 15, 15, 5, 10, 30, 10, 20, 25, 35, 40, 50, 20, 15};

              final int actualPosition = MobiliseDevelopmentTask.findLandingStartingPoint(t, w);
              
              Assert.assertEquals(0, actualPosition);
        }
        
         @Test
        public void whenEqualsThan3sequenceTerrainAreWithEqualLenAndWindIsGreaterThan3_thenNoReturn() {
              int[] t = {0, 1, 2, 0, 1, 3, 1, 2, 2, 3, 1, 2, 3, 1, 1, 1, 0, 1, 2, 3, 3, 3, 1, 2, 2, 3, 1, 0, 2, 1};
              int[] w =      {10, 15, 20, 30, 30, 20, 40, 40, 30, 20, 10, 15, 20, 10, 25, 10, 30, 15, 15, 5, 10, 30, 10, 20, 25, 35, 40, 50, 20, 15};

              final int actualPosition = MobiliseDevelopmentTask.findLandingStartingPoint(t, w);
              
              Assert.assertEquals(0, actualPosition);
        }
}
