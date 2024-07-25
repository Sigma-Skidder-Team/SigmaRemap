package remapped;

import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.stream.Stream;

public final class class_1043 {
   private static String[] field_5747;
   private final Object2BooleanMap<class_9359> field_5746 = new Object2BooleanOpenHashMap();

   public Stream<class_9359> method_4618(long var1) {
      return this.field_5746.keySet().stream();
   }

   public void method_4611(long var1, class_9359 var3, boolean var4) {
      this.field_5746.put(var3, var4);
   }

   public void method_4617(long var1, class_9359 var3) {
      this.field_5746.removeBoolean(var3);
   }

   public void method_4610(class_9359 var1) {
      this.field_5746.replace(var1, true);
   }

   public void method_4614(class_9359 var1) {
      this.field_5746.replace(var1, false);
   }

   public boolean method_4612(class_9359 var1) {
      return this.field_5746.getOrDefault(var1, true);
   }

   public boolean method_4615(class_9359 var1) {
      return this.field_5746.getBoolean(var1);
   }

   public void method_4616(long var1, long var3, class_9359 var5) {
   }
}
