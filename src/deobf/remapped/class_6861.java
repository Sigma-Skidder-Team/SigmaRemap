package remapped;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class class_6861 implements class_4885 {
   private static String[] field_35355;
   private final String field_35354;
   private final CompoundNBT field_35353;
   private final Predicate<class_8406> field_35356;

   public class_6861(String var1, CompoundNBT var2) {
      this.field_35354 = var1;
      this.field_35353 = var2;
      this.field_35356 = class_4235.method_19749(var2);
   }

   @Override
   public void method_22411(class_8406 var1, List<class_8406> var2) {
      if (var1 instanceof CompoundNBT) {
         class_8406 var5 = ((CompoundNBT)var1).method_25929(this.field_35354);
         if (this.field_35356.test(var5)) {
            var2.add(var5);
         }
      }
   }

   @Override
   public void method_22409(class_8406 var1, Supplier<class_8406> var2, List<class_8406> var3) {
      if (var1 instanceof CompoundNBT) {
         CompoundNBT var6 = (CompoundNBT)var1;
         class_8406 var7 = var6.method_25929(this.field_35354);
         if (var7 != null) {
            if (this.field_35356.test(var7)) {
               var3.add(var7);
            }
         } else {
            CompoundNBT var8 = this.field_35353.method_25944();
            var6.method_25946(this.field_35354, var8);
            var3.add(var8);
         }
      }
   }

   @Override
   public class_8406 method_22407() {
      return new CompoundNBT();
   }

   @Override
   public int method_22412(class_8406 var1, Supplier<class_8406> var2) {
      if (var1 instanceof CompoundNBT) {
         CompoundNBT var5 = (CompoundNBT)var1;
         class_8406 var6 = var5.method_25929(this.field_35354);
         if (this.field_35356.test(var6)) {
            class_8406 var7 = (class_8406)var2.get();
            if (!var7.equals(var6)) {
               var5.method_25946(this.field_35354, var7);
               return 1;
            }
         }
      }

      return 0;
   }

   @Override
   public int method_22410(class_8406 var1) {
      if (var1 instanceof CompoundNBT) {
         CompoundNBT var4 = (CompoundNBT)var1;
         class_8406 var5 = var4.method_25929(this.field_35354);
         if (this.field_35356.test(var5)) {
            var4.method_25959(this.field_35354);
            return 1;
         }
      }

      return 0;
   }
}
