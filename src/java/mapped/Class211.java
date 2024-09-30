package mapped;

import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;

public final class Class211 extends Class207 {
   private static String[] field792;
   private final Long2ByteMap field793;
   public final Class1653 field794;

   public Class211(Class1653 var1) {
      super(7, 16, 256);
      this.field794 = var1;
      this.field793 = new Long2ByteOpenHashMap();
      this.field793.defaultReturnValue((byte)7);
   }

   @Override
   public int method696(long var1) {
      return !Class1653.method6705(this.field794, var1) ? 7 : 0;
   }

   @Override
   public int getLevel(long var1) {
      return this.field793.get(var1);
   }

   @Override
   public void setLevel(long var1, int var3) {
      if (var3 <= 6) {
         this.field793.put(var1, (byte)var3);
      } else {
         this.field793.remove(var1);
      }
   }

   public void method726() {
      super.processUpdates(Integer.MAX_VALUE);
   }
}
