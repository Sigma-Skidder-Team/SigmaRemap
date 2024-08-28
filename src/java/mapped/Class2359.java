package mapped;

import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;

public class Class2359 extends LongLinkedOpenHashSet {
   private static String[] field16173;
   public final int field16174;
   public final Class202 field16175;

   public Class2359(Class202 var1, int var2, float var3, int var4) {
      super(var2, var3);
      this.field16175 = var1;
      this.field16174 = var4;
   }

   public void rehash(int var1) {
      if (var1 > this.field16174) {
         super.rehash(var1);
      }
   }
}
