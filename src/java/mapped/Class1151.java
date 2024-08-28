package mapped;

import javax.annotation.Nullable;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public interface Class1151 extends Class1152 {
   List<? extends Class1152> method2468();

   default Optional<Class1152> method5535(double var1, double var3) {
      for (Class1152 var8 : this.method2468()) {
         if (var8.method2485(var1, var3)) {
            return Optional.<Class1152>of(var8);
         }
      }

      return Optional.<Class1152>empty();
   }

   @Override
   default boolean method1958(double var1, double var3, int var5) {
      for (Class1152 var9 : this.method2468()) {
         if (var9.method1958(var1, var3, var5)) {
            this.method5534(var9);
            if (var5 == 0) {
               this.method5532(true);
            }

            return true;
         }
      }

      return false;
   }

   @Override
   default boolean method2565(double var1, double var3, int var5) {
      this.method5532(false);
      return this.method5535(var1, var3).filter(var5x -> var5x.method2565(var1, var3, var5)).isPresent();
   }

   @Override
   default boolean method2516(double var1, double var3, int var5, double var6, double var8) {
      return this.method5533() != null && this.method5531() && var5 == 0 ? this.method5533().method2516(var1, var3, var5, var6, var8) : false;
   }

   boolean method5531();

   void method5532(boolean var1);

   @Override
   default boolean method2649(double var1, double var3, double var5) {
      return this.method5535(var1, var3).filter(var6 -> var6.method2649(var1, var3, var5)).isPresent();
   }

   @Override
   default boolean method1920(int var1, int var2, int var3) {
      return this.method5533() != null && this.method5533().method1920(var1, var2, var3);
   }

   @Override
   default boolean method2644(int var1, int var2, int var3) {
      return this.method5533() != null && this.method5533().method2644(var1, var2, var3);
   }

   @Override
   default boolean method1932(char var1, int var2) {
      return this.method5533() != null && this.method5533().method1932(var1, var2);
   }

   @Nullable
   Class1152 method5533();

   void method5534(Class1152 var1);

   default void method5536(Class1152 var1) {
      this.method5534(var1);
      var1.method5538(true);
   }

   default void method5537(Class1152 var1) {
      this.method5534(var1);
   }

   @Override
   default boolean method5538(boolean var1) {
      Class1152 var4 = this.method5533();
      boolean var5 = var4 != null;
      if (var5 && var4.method5538(var1)) {
         return true;
      } else {
         List var6 = this.method2468();
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
            Class1152 var12 = (Class1152)var11.get();
            if (var12.method5538(var1)) {
               this.method5534(var12);
               return true;
            }
         }

         this.method5534((Class1152)null);
         return false;
      }
   }
}
