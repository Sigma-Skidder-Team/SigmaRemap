package remapped;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class class_3619 {
   private static String[] field_17658;
   private final Object2IntMap<class_5279> field_17657 = new Object2IntOpenHashMap();

   private class_3619() {
   }

   public int method_16860(Predicate<class_5279> var1) {
      return this.field_17657
         .object2IntEntrySet()
         .stream()
         .filter(var1x -> var1.test(var1x.getKey()))
         .mapToInt(var0 -> var0.getIntValue() * ((class_5279)var0.getKey()).field_26994)
         .sum();
   }

   public Stream<class_2147> method_16858(UUID var1) {
      return this.field_17657.object2IntEntrySet().stream().<class_2147>map(var1x -> new class_2147(var1, (class_5279)var1x.getKey(), var1x.getIntValue()));
   }

   public void method_16855() {
      ObjectIterator var3 = this.field_17657.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         int var5 = var4.getIntValue() - ((class_5279)var4.getKey()).field_26997;
         if (var5 >= 2) {
            var4.setValue(var5);
         } else {
            var3.remove();
         }
      }
   }

   public boolean method_16853() {
      return this.field_17657.isEmpty();
   }

   public void method_16854(class_5279 var1) {
      int var4 = this.field_17657.getInt(var1);
      if (var4 > var1.field_26996) {
         this.field_17657.put(var1, var1.field_26996);
      }

      if (var4 < 2) {
         this.method_16856(var1);
      }
   }

   public void method_16856(class_5279 var1) {
      this.field_17657.removeInt(var1);
   }
}
