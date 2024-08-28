package mapped;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Class8357 implements Class8356 {
   private static String[] field35899;
   private final String field35900;
   private final Class39 field35901;
   private final Predicate<Class30> field35902;

   public Class8357(String var1, Class39 var2) {
      this.field35900 = var1;
      this.field35901 = var2;
      this.field35902 = Class8320.method29137(var2);
   }

   @Override
   public void method29291(Class30 var1, List<Class30> var2) {
      if (var1 instanceof Class39) {
         Class30 var5 = ((Class39)var1).method116(this.field35900);
         if (this.field35902.test(var5)) {
            var2.add(var5);
         }
      }
   }

   @Override
   public void method29292(Class30 var1, Supplier<Class30> var2, List<Class30> var3) {
      if (var1 instanceof Class39) {
         Class39 var6 = (Class39)var1;
         Class30 var7 = var6.method116(this.field35900);
         if (var7 != null) {
            if (this.field35902.test(var7)) {
               var3.add(var7);
            }
         } else {
            Class39 var8 = this.field35901.method79();
            var6.method99(this.field35900, var8);
            var3.add(var8);
         }
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
         Class30 var6 = var5.method116(this.field35900);
         if (this.field35902.test(var6)) {
            Class30 var7 = (Class30)var2.get();
            if (!var7.equals(var6)) {
               var5.method99(this.field35900, var7);
               return 1;
            }
         }
      }

      return 0;
   }

   @Override
   public int method29295(Class30 var1) {
      if (var1 instanceof Class39) {
         Class39 var4 = (Class39)var1;
         Class30 var5 = var4.method116(this.field35900);
         if (this.field35902.test(var5)) {
            var4.method133(this.field35900);
            return 1;
         }
      }

      return 0;
   }
}
