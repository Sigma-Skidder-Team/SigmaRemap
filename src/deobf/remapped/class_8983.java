package remapped;

import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface class_8983 extends class_5888 {
   List<? extends class_5888> method_41183();

   default Optional<class_5888> method_41181(double var1, double var3) {
      for (class_5888 var8 : this.method_41183()) {
         if (var8.method_26937(var1, var3)) {
            return Optional.<class_5888>of(var8);
         }
      }

      return Optional.<class_5888>empty();
   }

   @Override
   default boolean method_26940(double var1, double var3, int var5) {
      for (class_5888 var9 : this.method_41183()) {
         if (var9.method_26940(var1, var3, var5)) {
            this.method_41180(var9);
            if (var5 == 0) {
               this.method_41179(true);
            }

            return true;
         }
      }

      return false;
   }

   @Override
   default boolean method_26941(double var1, double var3, int var5) {
      this.method_41179(false);
      return this.method_41181(var1, var3).filter(var5x -> var5x.method_26941(var1, var3, var5)).isPresent();
   }

   @Override
   default boolean method_26944(double var1, double var3, int var5, double var6, double var8) {
      return this.method_41185() != null && this.method_41182() && var5 == 0 ? this.method_41185().method_26944(var1, var3, var5, var6, var8) : false;
   }

   boolean method_41182();

   void method_41179(boolean var1);

   @Override
   default boolean method_26945(double var1, double var3, double var5) {
      return this.method_41181(var1, var3).filter(var6 -> var6.method_26945(var1, var3, var5)).isPresent();
   }

   @Override
   default boolean method_26946(int var1, int var2, int var3) {
      return this.method_41185() != null && this.method_41185().method_26946(var1, var2, var3);
   }

   @Override
   default boolean method_26939(int var1, int var2, int var3) {
      return this.method_41185() != null && this.method_41185().method_26939(var1, var2, var3);
   }

   @Override
   default boolean method_26938(char var1, int var2) {
      return this.method_41185() != null && this.method_41185().method_26938(var1, var2);
   }

   @Nullable
   class_5888 method_41185();

   void method_41180(class_5888 var1);

   default void method_41178(class_5888 var1) {
      this.method_41180(var1);
      var1.method_26942(true);
   }

   default void method_41184(class_5888 var1) {
      this.method_41180(var1);
   }

   @Override
   default boolean method_26942(boolean var1) {
      class_5888 var4 = this.method_41185();
      boolean var5 = var4 != null;
      if (var5 && var4.method_26942(var1)) {
         return true;
      } else {
         List var6 = this.method_41183();
         int var7 = var6.indexOf(var4);
         int var8;
         if (var5 && var7 >= 0) {
            var8 = var7 + (!var1 ? 0 : 1);
         } else if (!var1) {
            var8 = var6.size();
         } else {
            var8 = 0;
         }

         ListIterator var9 = var6.listIterator(var8);
         BooleanSupplier var10 = !var1 ? var9::hasPrevious : var9::hasNext;
         Supplier var11 = !var1 ? var9::previous : var9::next;

         while (var10.getAsBoolean()) {
            class_5888 var12 = (class_5888)var11.get();
            if (var12.method_26942(var1)) {
               this.method_41180(var12);
               return true;
            }
         }

         this.method_41180((class_5888)null);
         return false;
      }
   }
}
