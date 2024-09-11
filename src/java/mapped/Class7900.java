package mapped;

import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;

public final class Class7900 implements Class7899 {
   private static String[] field33854;
   private final Class8984 field33855;
   private final Long2IntLinkedOpenHashMap field33856;
   private final int field33857;

   public Class7900(Long2IntLinkedOpenHashMap var1, int var2, Class8984 var3) {
      this.field33856 = var1;
      this.field33857 = var2;
      this.field33855 = var3;
   }

   @Override
   public int method26471(int var1, int var2) {
      long var5 = ChunkPos.asLong(var1, var2);
      synchronized (this.field33856) {
         int var8 = this.field33856.get(var5);
         if (var8 != Integer.MIN_VALUE) {
            return var8;
         } else {
            int var9 = this.field33855.method33187(var1, var2);
            this.field33856.put(var5, var9);
            if (this.field33856.size() > this.field33857) {
               for (int var10 = 0; var10 < this.field33857 / 16; var10++) {
                  this.field33856.removeFirstInt();
               }
            }

            return var9;
         }
      }
   }

   public int method26472() {
      return this.field33857;
   }
}
