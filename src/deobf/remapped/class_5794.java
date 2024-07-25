package remapped;

import java.util.Random;

public class class_5794 extends Random {
   private static String[] field_29275;
   private static final long field_29274 = 1L;

   @Override
   public int nextInt(int var1, int var2) {
      return this.nextInt(var2 - var1) + var1;
   }
}
