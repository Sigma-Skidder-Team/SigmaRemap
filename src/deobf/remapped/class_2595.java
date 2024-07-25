package remapped;

import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;

public class class_2595 extends LongLinkedOpenHashSet {
   private static String[] field_12827;

   public class_2595(class_6057 var1, int var2, float var3, int var4) {
      super(var2, var3);
      this.field_12829 = var1;
      this.field_12828 = var4;
   }

   public void rehash(int var1) {
      if (var1 > this.field_12828) {
         super.rehash(var1);
      }
   }
}
