package mapped;

import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectSet;

public class Class205 extends Class203 {
   private static String[] field761;
   public final Long2ByteMap field762;
   public final int field763;
   public final Class9307 field764;

   public Class205(Class9307 var1, int var2) {
      super(var2 + 2, 16, 256);
      this.field764 = var1;
      this.field762 = new Long2ByteOpenHashMap();
      this.field763 = var2;
      this.field762.defaultReturnValue((byte)(var2 + 2));
   }

   @Override
   public int getLevel(long var1) {
      return this.field762.get(var1);
   }

   @Override
   public void setLevel(long var1, int var3) {
      byte var6;
      if (var3 <= this.field763) {
         var6 = this.field762.put(var1, (byte)var3);
      } else {
         var6 = this.field762.remove(var1);
      }

      this.method682(var1, var6, var3);
   }

   public void method682(long var1, int var3, int var4) {
   }

   @Override
   public int method679(long var1) {
      return !this.method683(var1) ? Integer.MAX_VALUE : 0;
   }

   private boolean method683(long var1) {
      ObjectSet var5 = (ObjectSet)Class9307.method35151(this.field764).get(var1);
      return var5 != null && !var5.isEmpty();
   }

   public void method684() {
      this.processUpdates(Integer.MAX_VALUE);
   }
}
