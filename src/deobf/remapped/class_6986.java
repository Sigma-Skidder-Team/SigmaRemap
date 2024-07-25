package remapped;

import java.util.Set;
import java.util.function.Predicate;

public class class_6986 implements Predicate<class_9115> {
   private final class_2522 field_35869;
   private final Set<class_5019<?>> field_35870;
   private final CompoundNBT field_35871;

   public class_6986(class_2522 var1, Set<class_5019<?>> var2, CompoundNBT var3) {
      this.field_35869 = var1;
      this.field_35870 = var2;
      this.field_35871 = var3;
   }

   public class_2522 method_31963() {
      return this.field_35869;
   }

   public boolean test(class_9115 var1) {
      class_2522 var4 = var1.method_41968();
      if (!var4.method_8350(this.field_35869.method_8360())) {
         return false;
      } else {
         for (class_5019 var6 : this.field_35870) {
            if (var4.method_10313(var6) != this.field_35869.method_10313(var6)) {
               return false;
            }
         }

         if (this.field_35871 == null) {
            return true;
         } else {
            class_3757 var7 = var1.method_41967();
            return var7 != null && class_4338.method_20182(this.field_35871, var7.method_17396(new CompoundNBT()), true);
         }
      }
   }

   public boolean method_31964(class_6331 var1, BlockPos var2, int var3) {
      class_2522 var6 = class_6414.method_29274(this.field_35869, var1, var2);
      if (var6.method_8345()) {
         var6 = this.field_35869;
      }

      if (var1.method_7513(var2, var6, var3)) {
         if (this.field_35871 != null) {
            class_3757 var7 = var1.method_28260(var2);
            if (var7 != null) {
               CompoundNBT var8 = this.field_35871.method_25944();
               var8.putInt("x", var2.getX());
               var8.putInt("y", var2.getY());
               var8.putInt("z", var2.getZ());
               var7.method_17394(var6, var8);
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
