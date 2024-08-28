package mapped;

import java.util.List;
import java.util.function.Supplier;

public class Class8359 implements Class8356 {
   private static String[] field35905;
   private final String field35906;

   public Class8359(String var1) {
      this.field35906 = var1;
   }

   @Override
   public void method29291(Class30 var1, List<Class30> var2) {
      if (var1 instanceof Class39) {
         Class30 var5 = ((Class39)var1).method116(this.field35906);
         if (var5 != null) {
            var2.add(var5);
         }
      }
   }

   @Override
   public void method29292(Class30 var1, Supplier<Class30> var2, List<Class30> var3) {
      if (var1 instanceof Class39) {
         Class39 var6 = (Class39)var1;
         Class30 var7;
         if (!var6.method118(this.field35906)) {
            var7 = (Class30)var2.get();
            var6.method99(this.field35906, var7);
         } else {
            var7 = var6.method116(this.field35906);
         }

         var3.add(var7);
      }
   }

   @Override
   public Class30 method29293() {
      return new Class39();
   }

   @Override
   public int method29294(Class30 var1, Supplier<Class30> var2) {
      if (var1 instanceof Class39) {
         Class39 var5 = (Class39)var1;
         Class30 var6 = (Class30)var2.get();
         Class30 var7 = var5.method99(this.field35906, var6);
         if (!var6.equals(var7)) {
            return 1;
         }
      }

      return 0;
   }

   @Override
   public int method29295(Class30 var1) {
      if (var1 instanceof Class39) {
         Class39 var4 = (Class39)var1;
         if (var4.method118(this.field35906)) {
            var4.method133(this.field35906);
            return 1;
         }
      }

      return 0;
   }
}
