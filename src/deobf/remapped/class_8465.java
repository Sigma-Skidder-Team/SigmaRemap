package remapped;

import java.util.Random;

public class class_8465 extends Random {
   private static String[] field_43267;
   private static final long field_43268 = 1L;

   @Override
   public int nextInt(int var1, int var2) {
      return this.nextInt(var2 - var1) + var1;
   }
}
