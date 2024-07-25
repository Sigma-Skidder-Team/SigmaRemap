package remapped;

import java.util.Set;
import java.util.function.Predicate;

public class class_7393 implements Predicate<class_9115> {
   private static String[] field_37752;
   private final class_2522 field_37750;
   private final Set<class_5019<?>> field_37751;
   private final class_5734 field_37749;

   public class_7393(class_2522 var1, Set<class_5019<?>> var2, class_5734 var3) {
      this.field_37750 = var1;
      this.field_37751 = var2;
      this.field_37749 = var3;
   }

   public boolean test(class_9115 var1) {
      class_2522 var4 = var1.method_41968();
      if (!var4.method_8350(this.field_37750.method_8360())) {
         return false;
      } else {
         for (class_5019 var6 : this.field_37751) {
            if (var4.method_10313(var6) != this.field_37750.method_10313(var6)) {
               return false;
            }
         }

         if (this.field_37749 == null) {
            return true;
         } else {
            class_3757 var7 = var1.method_41967();
            return var7 != null && class_4338.method_20182(this.field_37749, var7.method_17396(new class_5734()), true);
         }
      }
   }
}
