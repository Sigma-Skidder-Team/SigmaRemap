package remapped;

import java.util.BitSet;

public class class_3175 {
   private static String[] field_15883;
   private final BitSet field_15882 = new BitSet();

   public void method_14631(int var1, int var2) {
      this.field_15882.set(var1, var1 + var2);
   }

   public void method_14630(int var1, int var2) {
      this.field_15882.clear(var1, var1 + var2);
   }

   public int method_14632(int var1) {
      int var4 = 0;

      while (true) {
         int var5 = this.field_15882.nextClearBit(var4);
         int var6 = this.field_15882.nextSetBit(var5);
         if (var6 == -1 || var6 - var5 >= var1) {
            this.method_14631(var5, var1);
            return var5;
         }

         var4 = var6;
      }
   }
}
