package remapped;

import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;

public final class class_3857 extends class_4938 {
   private static String[] field_18809;
   private final Long2ByteMap field_18811;

   public class_3857(class_1489 var1) {
      super(7, 16, 256);
      this.field_18810 = var1;
      this.field_18811 = new Long2ByteOpenHashMap();
      this.field_18811.defaultReturnValue((byte)7);
   }

   @Override
   public int method_22639(long var1) {
      return !class_1489.method_6873(this.field_18810, var1) ? 7 : 0;
   }

   @Override
   public int method_27698(long var1) {
      return this.field_18811.get(var1);
   }

   @Override
   public void method_27689(long var1, int var3) {
      if (var3 <= 6) {
         this.field_18811.put(var1, (byte)var3);
      } else {
         this.field_18811.remove(var1);
      }
   }

   public void method_17895() {
      super.method_27693(Integer.MAX_VALUE);
   }
}
