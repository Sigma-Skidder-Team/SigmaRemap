package mapped;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class Class7532 extends Class7530 {
   private final Object2IntMap<String> field32336 = new Object2IntOpenHashMap();

   public Class7532() {
      super("idcounts");
      this.field32336.defaultReturnValue(-1);
   }

   @Override
   public void method24591(CompoundNBT var1) {
      this.field32336.clear();

      for (String var5 : var1.method97()) {
         if (var1.method119(var5, 99)) {
            this.field32336.put(var5, var1.method122(var5));
         }
      }
   }

   @Override
   public CompoundNBT method24592(CompoundNBT var1) {
      ObjectIterator var4 = this.field32336.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         var1.method102((String)var5.getKey(), var5.getIntValue());
      }

      return var1;
   }

   public int method24618() {
      int var3 = this.field32336.getInt("map") + 1;
      this.field32336.put("map", var3);
      this.method24605();
      return var3;
   }
}
