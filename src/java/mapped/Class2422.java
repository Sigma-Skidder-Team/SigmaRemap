package mapped;

import java.util.Random;

public class Class2422 extends Random {
   private static String[] field16426;
   private static final long field16427 = 1L;

//   @Override
   public int nextInt(int var1, int var2) {
      return this.nextInt(var2 - var1) + var1;
   }
}
