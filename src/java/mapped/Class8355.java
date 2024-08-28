package mapped;

import java.util.List;
import java.util.function.Supplier;

public class Class8355 implements Class8356 {
   private static String[] field35897;
   private final int field35898;

   public Class8355(int var1) {
      this.field35898 = var1;
   }

   @Override
   public void method29291(Class30 var1, List<Class30> var2) {
      if (var1 instanceof Class27) {
         Class27<Class30> var5 = (Class27) var1;
         int var6 = var5.size();
         int var7 = this.field35898 >= 0 ? this.field35898 : var6 + this.field35898;
         if (0 <= var7 && var7 < var6) {
            var2.add(var5.get(var7));
         }
      }
   }

   @Override
   public void method29292(Class30 var1, Supplier<Class30> var2, List<Class30> var3) {
      this.method29291(var1, var3);
   }

   @Override
   public Class30 method29293() {
      return new Class41();
   }

   @Override
   public int method29294(Class30 var1, Supplier<Class30> var2) {
      if (var1 instanceof Class27) {
         Class27 var5 = (Class27)var1;
         int var6 = var5.size();
         int var7 = this.field35898 >= 0 ? this.field35898 : var6 + this.field35898;
         if (0 <= var7 && var7 < var6) {
            Class30 var8 = (Class30)var5.get(var7);
            Class30 var9 = (Class30)var2.get();
            if (!var9.equals(var8) && var5.method70(var7, var9)) {
               return 1;
            }
         }
      }

      return 0;
   }

   @Override
   public int method29295(Class30 var1) {
      if (var1 instanceof Class27) {
         Class27 var4 = (Class27)var1;
         int var5 = var4.size();
         int var6 = this.field35898 >= 0 ? this.field35898 : var5 + this.field35898;
         if (0 <= var6 && var6 < var5) {
            var4.remove(var6);
            return 1;
         }
      }

      return 0;
   }
}
