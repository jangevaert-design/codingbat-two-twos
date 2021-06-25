package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatTwoTwos.twoTwo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatTwoTwosTest {

  private int[][] twoParams = {
      {4, 2, 2, 3},
      {2, 2, 4},
      {2, 2, 4, 2},
      {1, 3, 4},
      {1, 2, 2, 3, 4},
      {1, 2, 3, 4},
      {2, 2},
      {2, 2, 7},
      {2, 2, 7, 2, 1},
      {4, 2, 2, 2},
      {2, 2, 2},
      {1, 2},
      {2},
      {1},
      {},
      {5, 2, 2, 3},
      {2, 2, 5, 2}
  };

  private boolean[] twoExpected = {true, true, false, true, true, false, true, true, false, true,
      true, false, false, true, true, true, false};

  @Test
  void twoTest() {
    for (int i = 0; i < twoParams.length; i++) {
      boolean actual = twoTwo(twoParams[i]);
      Assertions.assertEquals(twoExpected[i], actual);
    }
  }

}