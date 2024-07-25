package remapped;

import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectSet;

public class class_5712 extends class_6718 {
   private static String[] field_28892;
   public final Long2ByteMap field_28890;
   public final int field_28891;

   public class_5712(class_9263 var1, int var2) {
      super(var2 + 2, 16, 256);
      this.field_28889 = var1;
      this.field_28890 = new Long2ByteOpenHashMap();
      this.field_28891 = var2;
      this.field_28890.defaultReturnValue((byte)(var2 + 2));
   }

   @Override
   public int method_27698(long var1) {
      return this.field_28890.get(var1);
   }

   @Override
   public void method_27689(long var1, int var3) {
      byte var6;
      if (var3 <= this.field_28891) {
         var6 = this.field_28890.put(var1, (byte)var3);
      } else {
         var6 = this.field_28890.remove(var1);
      }

      this.method_25798(var1, var6, var3);
   }

   public void method_25798(long var1, int var3, int var4) {
   }

   @Override
   public int method_30840(long var1) {
      return !this.method_25799(var1) ? Integer.MAX_VALUE : 0;
   }

   private boolean method_25799(long var1) {
      ObjectSet var5 = (ObjectSet)class_9263.method_42704(this.field_28889).get(var1);
      return var5 != null && !var5.isEmpty();
   }

   public void method_25797() {
      this.method_27693(Integer.MAX_VALUE);
   }
}
