package remapped;

import java.util.List;
import java.util.function.Supplier;

public class class_7043 implements class_4885 {
   private static String[] field_36379;
   public static final class_7043 field_36380 = new class_7043();

   private class_7043() {
   }

   @Override
   public void method_22411(class_8406 var1, List<class_8406> var2) {
      if (var1 instanceof class_6850) {
         var2.addAll((class_6850)var1);
      }
   }

   @Override
   public void method_22409(class_8406 var1, Supplier<class_8406> var2, List<class_8406> var3) {
      if (var1 instanceof class_6850) {
         class_6850 var6 = (class_6850)var1;
         if (!var6.isEmpty()) {
            var3.addAll(var6);
         } else {
            class_8406 var7 = (class_8406)var2.get();
            if (var6.method_31426(0, var7)) {
               var3.add(var7);
            }
         }
      }
   }

   @Override
   public class_8406 method_22407() {
      return new class_3416();
   }

   @Override
   public int method_22412(class_8406 var1, Supplier<class_8406> var2) {
      if (!(var1 instanceof class_6850)) {
         return 0;
      } else {
         class_6850 var5 = (class_6850)var1;
         int var6 = var5.size();
         if (var6 == 0) {
            var5.method_31426(0, (class_8406)var2.get());
            return 1;
         } else {
            class_8406 var7 = (class_8406)var2.get();
            int var8 = var6 - (int)var5.stream().filter(var7::equals).count();
            if (var8 == 0) {
               return 0;
            } else {
               var5.clear();
               if (!var5.method_31426(0, var7)) {
                  return 0;
               } else {
                  for (int var9 = 1; var9 < var6; var9++) {
                     var5.method_31426(var9, (class_8406)var2.get());
                  }

                  return var8;
               }
            }
         }
      }
   }

   @Override
   public int method_22410(class_8406 var1) {
      if (var1 instanceof class_6850) {
         class_6850 var4 = (class_6850)var1;
         int var5 = var4.size();
         if (var5 > 0) {
            var4.clear();
            return var5;
         }
      }

      return 0;
   }
}
