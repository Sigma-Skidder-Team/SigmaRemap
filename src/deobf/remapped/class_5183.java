package remapped;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class class_5183 implements class_4885 {
   private static String[] field_26674;
   private final Predicate<class_8406> field_26673;

   public class_5183(CompoundNBT var1) {
      this.field_26673 = class_4235.method_19749(var1);
   }

   @Override
   public void method_22411(class_8406 var1, List<class_8406> var2) {
      if (var1 instanceof CompoundNBT && this.field_26673.test(var1)) {
         var2.add(var1);
      }
   }

   @Override
   public void method_22409(class_8406 var1, Supplier<class_8406> var2, List<class_8406> var3) {
      this.method_22411(var1, var3);
   }

   @Override
   public class_8406 method_22407() {
      return new CompoundNBT();
   }

   @Override
   public int method_22412(class_8406 var1, Supplier<class_8406> var2) {
      return 0;
   }

   @Override
   public int method_22410(class_8406 var1) {
      return 0;
   }
}
