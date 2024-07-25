package remapped;

import java.util.List;
import java.util.function.Supplier;

public class class_4344 implements class_4885 {
   private static String[] field_21299;
   private final int field_21300;

   public class_4344(int var1) {
      this.field_21300 = var1;
   }

   @Override
   public void method_22411(class_8406 var1, List<class_8406> var2) {
      if (var1 instanceof class_6850) {
         class_6850 var5 = (class_6850)var1;
         int var6 = var5.size();
         int var7 = this.field_21300 >= 0 ? this.field_21300 : var6 + this.field_21300;
         if (0 <= var7 && var7 < var6) {
            var2.add(var5.get(var7));
         }
      }
   }

   @Override
   public void method_22409(class_8406 var1, Supplier<class_8406> var2, List<class_8406> var3) {
      this.method_22411(var1, var3);
   }

   @Override
   public class_8406 method_22407() {
      return new class_3416();
   }

   @Override
   public int method_22412(class_8406 var1, Supplier<class_8406> var2) {
      if (var1 instanceof class_6850) {
         class_6850 var5 = (class_6850)var1;
         int var6 = var5.size();
         int var7 = this.field_21300 >= 0 ? this.field_21300 : var6 + this.field_21300;
         if (0 <= var7 && var7 < var6) {
            class_8406 var8 = (class_8406)var5.get(var7);
            class_8406 var9 = (class_8406)var2.get();
            if (!var9.equals(var8) && var5.method_31429(var7, var9)) {
               return 1;
            }
         }
      }

      return 0;
   }

   @Override
   public int method_22410(class_8406 var1) {
      if (var1 instanceof class_6850) {
         class_6850 var4 = (class_6850)var1;
         int var5 = var4.size();
         int var6 = this.field_21300 >= 0 ? this.field_21300 : var5 + this.field_21300;
         if (0 <= var6 && var6 < var5) {
            var4.remove(var6);
            return 1;
         }
      }

      return 0;
   }
}
