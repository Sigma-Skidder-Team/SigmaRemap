package remapped;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class StatisticsManager {
   private static String[] field_20205;
   public final Object2IntMap<class_6676<?>> field_20206 = Object2IntMaps.synchronize(new Object2IntOpenHashMap());

   public StatisticsManager() {
      this.field_20206.defaultReturnValue(0);
   }

   public void method_19274(class_704 var1, class_6676<?> var2, int var3) {
      int var6 = (int)Math.min((long)this.method_19276(var2) + (long)var3, 2147483647L);
      this.method_19275(var1, var2, var6);
   }

   public void method_19275(class_704 var1, class_6676<?> var2, int var3) {
      this.field_20206.put(var2, var3);
   }

   public <T> int method_19277(class_9478<T> var1, T var2) {
      return !var1.method_43793(var2) ? 0 : this.method_19276(var1.method_43790(var2));
   }

   public int method_19276(class_6676<?> var1) {
      return this.field_20206.getInt(var1);
   }
}
