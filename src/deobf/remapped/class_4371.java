package remapped;

import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class class_4371<T> implements class_2874<T> {
   private static String[] field_21446;
   private final class_95<T> field_21445;
   private final class_6834<T> field_21448;
   private final class_5021<T> field_21449;
   private final Function<class_5734, T> field_21447;
   private final Function<T, class_5734> field_21444;
   private final int field_21450;

   public class_4371(class_95<T> var1, int var2, class_5021<T> var3, Function<class_5734, T> var4, Function<T, class_5734> var5) {
      this.field_21445 = var1;
      this.field_21450 = var2;
      this.field_21449 = var3;
      this.field_21447 = var4;
      this.field_21444 = var5;
      this.field_21448 = new class_6834<T>(1 << var2);
   }

   @Override
   public int method_13201(T var1) {
      int var4 = this.field_21448.method_14041((T)var1);
      if (var4 == -1) {
         var4 = this.field_21448.method_31341((T)var1);
         if (var4 >= 1 << this.field_21450) {
            var4 = this.field_21449.method_23119(this.field_21450 + 1, (T)var1);
         }
      }

      return var4;
   }

   @Override
   public boolean method_13203(Predicate<T> var1) {
      for (int var4 = 0; var4 < this.method_20370(); var4++) {
         if (var1.test(this.field_21448.method_14040(var4))) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public T method_13200(int var1) {
      return this.field_21448.method_14040(var1);
   }

   @Override
   public void method_13206(class_8248 var1) {
      this.field_21448.method_31336();
      int var4 = var1.method_37778();

      for (int var5 = 0; var5 < var4; var5++) {
         this.field_21448.method_31341(this.field_21445.method_14040(var1.method_37778()));
      }
   }

   @Override
   public void method_13202(class_8248 var1) {
      int var4 = this.method_20370();
      var1.method_37743(var4);

      for (int var5 = 0; var5 < var4; var5++) {
         var1.method_37743(this.field_21445.method_14041(this.field_21448.method_14040(var5)));
      }
   }

   @Override
   public int method_13204() {
      int var3 = class_8248.method_37766(this.method_20370());

      for (int var4 = 0; var4 < this.method_20370(); var4++) {
         var3 += class_8248.method_37766(this.field_21445.method_14041(this.field_21448.method_14040(var4)));
      }

      return var3;
   }

   public int method_20370() {
      return this.field_21448.method_31346();
   }

   @Override
   public void method_13205(class_3416 var1) {
      this.field_21448.method_31336();

      for (int var4 = 0; var4 < var1.size(); var4++) {
         this.field_21448.method_31341(this.field_21447.apply(var1.method_15764(var4)));
      }
   }

   public void method_20371(class_3416 var1) {
      for (int var4 = 0; var4 < this.method_20370(); var4++) {
         var1.add(this.field_21444.apply(this.field_21448.method_14040(var4)));
      }
   }
}
