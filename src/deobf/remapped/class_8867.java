package remapped;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class class_8867 implements class_4885 {
   private static String[] field_45332;
   private final CompoundNBT field_45334;
   private final Predicate<class_8406> field_45333;

   public class_8867(CompoundNBT var1) {
      this.field_45334 = var1;
      this.field_45333 = class_4235.method_19749(var1);
   }

   @Override
   public void method_22411(class_8406 var1, List<class_8406> var2) {
      if (var1 instanceof class_3416) {
         class_3416 var5 = (class_3416)var1;
         var5.stream().filter(this.field_45333).forEach(var2::add);
      }
   }

   @Override
   public void method_22409(class_8406 var1, Supplier<class_8406> var2, List<class_8406> var3) {
      MutableBoolean var6 = new MutableBoolean();
      if (var1 instanceof class_3416) {
         class_3416 var7 = (class_3416)var1;
         var7.stream().filter(this.field_45333).forEach(var2x -> {
            var3.add(var2x);
            var6.setTrue();
         });
         if (var6.isFalse()) {
            CompoundNBT var8 = this.field_45334.method_25944();
            var7.add(var8);
            var3.add(var8);
         }
      }
   }

   @Override
   public class_8406 method_22407() {
      return new class_3416();
   }

   @Override
   public int method_22412(class_8406 var1, Supplier<class_8406> var2) {
      int var5 = 0;
      if (var1 instanceof class_3416) {
         class_3416 var6 = (class_3416)var1;
         int var7 = var6.size();
         if (var7 != 0) {
            for (int var8 = 0; var8 < var7; var8++) {
               class_8406 var9 = var6.get(var8);
               if (this.field_45333.test(var9)) {
                  class_8406 var10 = (class_8406)var2.get();
                  if (!var10.equals(var9) && var6.method_31429(var8, var10)) {
                     var5++;
                  }
               }
            }
         } else {
            var6.add((class_8406)var2.get());
            var5++;
         }
      }

      return var5;
   }

   @Override
   public int method_22410(class_8406 var1) {
      int var4 = 0;
      if (var1 instanceof class_3416) {
         class_3416 var5 = (class_3416)var1;

         for (int var6 = var5.size() - 1; var6 >= 0; var6--) {
            if (this.field_45333.test(var5.get(var6))) {
               var5.remove(var6);
               var4++;
            }
         }
      }

      return var4;
   }
}
