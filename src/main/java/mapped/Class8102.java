package mapped;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Class8102 {
   private static String[] field34830;
   private final Object2IntMap<Class2074> field34831 = new Object2IntOpenHashMap();

   public Class8102() {
   }

   public int method28060(Predicate<Class2074> var1) {
      return this.field34831
         .object2IntEntrySet()
         .stream()
         .filter(var1x -> var1.test(var1x.getKey()))
         .mapToInt(var0 -> var0.getIntValue() * ((Class2074)var0.getKey()).field13512)
         .sum();
   }

   public Stream<Class7539> method28061(UUID var1) {
      return this.field34831.object2IntEntrySet().stream().<Class7539>map(var1x -> new Class7539(var1, (Class2074)var1x.getKey(), var1x.getIntValue()));
   }

   public void method28062() {
      ObjectIterator var3 = this.field34831.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         int var5 = var4.getIntValue() - ((Class2074)var4.getKey()).field13514;
         if (var5 >= 2) {
            var4.setValue(var5);
         } else {
            var3.remove();
         }
      }
   }

   public boolean method28063() {
      return this.field34831.isEmpty();
   }

   public void method28064(Class2074 var1) {
      int var4 = this.field34831.getInt(var1);
      if (var4 > var1.field13513) {
         this.field34831.put(var1, var1.field13513);
      }

      if (var4 < 2) {
         this.method28065(var1);
      }
   }

   public void method28065(Class2074 var1) {
      this.field34831.removeInt(var1);
   }

   // $VF: synthetic method
   public static Object2IntMap<Class2074> method28069(Class8102 var0) {
      return var0.field34831;
   }
}
