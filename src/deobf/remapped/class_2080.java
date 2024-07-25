package remapped;

import it.unimi.dsi.fastutil.shorts.ShortList;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import java.util.function.Function;
import java.util.function.Predicate;

public class class_2080<T> implements class_3065<T> {
   private static String[] field_10469;
   public final Predicate<T> field_10470;
   private final class_2034 field_10472;
   private final ShortList[] field_10471 = new ShortList[16];

   public class_2080(Predicate<T> var1, class_2034 var2) {
      this(var1, var2, new class_3416());
   }

   public class_2080(Predicate<T> var1, class_2034 var2, class_3416 var3) {
      this.field_10470 = var1;
      this.field_10472 = var2;

      for (int var6 = 0; var6 < var3.size(); var6++) {
         class_3416 var7 = var3.method_15760(var6);

         for (int var8 = 0; var8 < var7.size(); var8++) {
            class_5990.method_27337(this.field_10471, var6).add(var7.method_15765(var8));
         }
      }
   }

   public class_3416 method_9707() {
      return class_9477.method_43782(this.field_10471);
   }

   public void method_9708(class_3065<T> var1, Function<BlockPos, T> var2) {
      for (int var5 = 0; var5 < this.field_10471.length; var5++) {
         if (this.field_10471[var5] != null) {
            ShortListIterator var6 = this.field_10471[var5].iterator();

            while (var6.hasNext()) {
               Short var7 = (Short)var6.next();
               BlockPos var8 = class_7481.method_34017(var7, var5, this.field_10472);
               var1.method_14011(var8, var2.apply(var8), 0);
            }

            this.field_10471[var5].clear();
         }
      }
   }

   @Override
   public boolean method_14013(BlockPos var1, T var2) {
      return false;
   }

   @Override
   public void method_14012(BlockPos var1, T var2, int var3, class_1716 var4) {
      class_5990.method_27337(this.field_10471, var1.method_12165() >> 4).add(class_7481.method_34024(var1));
   }

   @Override
   public boolean method_14010(BlockPos var1, T var2) {
      return false;
   }
}
