package mapped;

import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.stream.Stream;

public final class Class6858 {
   private static String[] field29780;
   private final Object2BooleanMap<Class878> field29781 = new Object2BooleanOpenHashMap();

   public Stream<Class878> method20896(long var1) {
      return this.field29781.keySet().stream();
   }

   public void method20897(long var1, Class878 var3, boolean var4) {
      this.field29781.put(var3, var4);
   }

   public void method20898(long var1, Class878 var3) {
      this.field29781.removeBoolean(var3);
   }

   public void method20899(Class878 var1) {
      this.field29781.replace(var1, true);
   }

   public void method20900(Class878 var1) {
      this.field29781.replace(var1, false);
   }

   public boolean method20901(Class878 var1) {
      return this.field29781.getOrDefault(var1, true);
   }

   public boolean method20902(Class878 var1) {
      return this.field29781.getBoolean(var1);
   }

   public void method20903(long var1, long var3, Class878 var5) {
   }
}
