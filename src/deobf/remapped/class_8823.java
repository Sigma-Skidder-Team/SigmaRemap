package remapped;

import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;

public final class class_8823 implements class_2997 {
   private static String[] field_45126;
   private final class_6604 field_45128;
   private final Long2IntLinkedOpenHashMap field_45127;
   private final int field_45129;

   public class_8823(Long2IntLinkedOpenHashMap var1, int var2, class_6604 var3) {
      this.field_45127 = var1;
      this.field_45129 = var2;
      this.field_45128 = var3;
   }

   @Override
   public int method_13700(int var1, int var2) {
      long var5 = class_2034.method_9540(var1, var2);
      synchronized (this.field_45127) {
         int var8 = this.field_45127.get(var5);
         if (var8 != Integer.MIN_VALUE) {
            return var8;
         } else {
            int var9 = this.field_45128.method_30390(var1, var2);
            this.field_45127.put(var5, var9);
            if (this.field_45127.size() > this.field_45129) {
               for (int var10 = 0; var10 < this.field_45129 / 16; var10++) {
                  this.field_45127.removeFirstInt();
               }
            }

            return var9;
         }
      }
   }

   public int method_40522() {
      return this.field_45129;
   }
}
