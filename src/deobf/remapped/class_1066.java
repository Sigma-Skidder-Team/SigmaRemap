package remapped;

import java.util.Random;

public final class class_1066 implements class_3254 {
   private static String[] field_5843;
   private final int field_5842;
   private final float field_5844;

   public class_1066(int var1, float var2) {
      this.field_5842 = var1;
      this.field_5844 = var2;
   }

   @Override
   public int method_14868(Random var1) {
      int var4 = 0;

      for (int var5 = 0; var5 < this.field_5842; var5++) {
         if (var1.nextFloat() < this.field_5844) {
            var4++;
         }
      }

      return var4;
   }

   public static class_1066 method_4678(int var0, float var1) {
      return new class_1066(var0, var1);
   }

   @Override
   public class_4639 method_14869() {
      return field_16150;
   }
}
