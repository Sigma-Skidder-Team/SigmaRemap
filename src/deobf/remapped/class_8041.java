package remapped;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;

public class class_8041 extends Long2ByteOpenHashMap {
   private static String[] field_41194;

   public class_8041(class_6057 var1, int var2, float var3, int var4) {
      super(var2, var3);
      this.field_41193 = var1;
      this.field_41192 = var4;
   }

   public void rehash(int var1) {
      if (var1 > this.field_41192) {
         super.rehash(var1);
      }
   }
}
