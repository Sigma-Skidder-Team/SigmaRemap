package remapped;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class class_5265 extends class_7186 {
   private final Object2IntMap<String> field_26920 = new Object2IntOpenHashMap();

   public class_5265() {
      super("idcounts");
      this.field_26920.defaultReturnValue(-1);
   }

   @Override
   public void method_32924(CompoundNBT var1) {
      this.field_26920.clear();

      for (String var5 : var1.method_25952()) {
         if (var1.method_25939(var5, 99)) {
            this.field_26920.put(var5, var1.method_25947(var5));
         }
      }
   }

   @Override
   public CompoundNBT method_32920(CompoundNBT var1) {
      ObjectIterator var4 = this.field_26920.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         var1.method_25931((String)var5.getKey(), var5.getIntValue());
      }

      return var1;
   }

   public int method_24031() {
      int var3 = this.field_26920.getInt("map") + 1;
      this.field_26920.put("map", var3);
      this.method_32923();
      return var3;
   }
}
