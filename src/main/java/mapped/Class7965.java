package mapped;

import java.util.BitSet;

public class Class7965 {
   private static String[] field34254;
   private final BitSet field34255 = new BitSet();

   public void method27088(int var1, int var2) {
      this.field34255.set(var1, var1 + var2);
   }

   public void method27089(int var1, int var2) {
      this.field34255.clear(var1, var1 + var2);
   }

   public int method27090(int var1) {
      int var4 = 0;

      while (true) {
         int var5 = this.field34255.nextClearBit(var4);
         int var6 = this.field34255.nextSetBit(var5);
         if (var6 == -1 || var6 - var5 >= var1) {
            this.method27088(var5, var1);
            return var5;
         }

         var4 = var6;
      }
   }
}
