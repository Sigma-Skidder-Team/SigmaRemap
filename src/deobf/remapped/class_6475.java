package remapped;

import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class class_6475<T> implements class_2874<T> {
   private static String[] field_33004;
   private final class_95<T> field_33003;
   private final T[] field_33001;
   private final class_5021<T> field_32998;
   private final Function<class_5734, T> field_32999;
   private final int field_33002;
   private int field_33000;

   public class_6475(class_95<T> var1, int var2, class_5021<T> var3, Function<class_5734, T> var4) {
      this.field_33003 = var1;
      this.field_33001 = (T[])(new Object[1 << var2]);
      this.field_33002 = var2;
      this.field_32998 = var3;
      this.field_32999 = var4;
   }

   @Override
   public int method_13201(T var1) {
      for (int var4 = 0; var4 < this.field_33000; var4++) {
         if (this.field_33001[var4] == var1) {
            return var4;
         }
      }

      int var5 = this.field_33000;
      if (var5 >= this.field_33001.length) {
         return this.field_32998.method_23119(this.field_33002 + 1, (T)var1);
      } else {
         this.field_33001[var5] = (T)var1;
         this.field_33000++;
         return var5;
      }
   }

   @Override
   public boolean method_13203(Predicate<T> var1) {
      for (int var4 = 0; var4 < this.field_33000; var4++) {
         if (var1.test(this.field_33001[var4])) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public T method_13200(int var1) {
      return var1 >= 0 && var1 < this.field_33000 ? this.field_33001[var1] : null;
   }

   @Override
   public void method_13206(class_8248 var1) {
      this.field_33000 = var1.method_37778();

      for (int var4 = 0; var4 < this.field_33000; var4++) {
         this.field_33001[var4] = this.field_33003.method_14040(var1.method_37778());
      }
   }

   @Override
   public void method_13202(class_8248 var1) {
      var1.method_37743(this.field_33000);

      for (int var4 = 0; var4 < this.field_33000; var4++) {
         var1.method_37743(this.field_33003.method_14041(this.field_33001[var4]));
      }
   }

   @Override
   public int method_13204() {
      int var3 = class_8248.method_37766(this.method_29489());

      for (int var4 = 0; var4 < this.method_29489(); var4++) {
         var3 += class_8248.method_37766(this.field_33003.method_14041(this.field_33001[var4]));
      }

      return var3;
   }

   public int method_29489() {
      return this.field_33000;
   }

   @Override
   public void method_13205(class_3416 var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         this.field_33001[var4] = this.field_32999.apply(var1.method_15764(var4));
      }

      this.field_33000 = var1.size();
   }
}
