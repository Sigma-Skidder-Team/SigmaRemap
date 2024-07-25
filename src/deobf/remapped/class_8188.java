package remapped;

import java.util.List;
import java.util.function.Predicate;

public class class_8188 extends class_3599 {
   private static String[] field_41898;
   private final class_8574 field_41900;
   private int field_41899;
   private int field_41901;

   public class_8188(class_8574 var1) {
      this.field_41900 = var1;
      this.field_41901 = this.method_37514(var1);
   }

   public int method_37514(class_8574 var1) {
      return 200 + var1.method_26594().nextInt(200) % 20;
   }

   @Override
   public boolean method_16795() {
      if (!this.field_41900.method_39445()) {
         if (!this.field_41900.method_39444()) {
            if (this.field_41901 <= 0) {
               this.field_41901 = this.method_37514(this.field_41900);
               Predicate var3 = var0 -> var0.method_39438() || !var0.method_39444();
               List var4 = this.field_41900
                  .world
                  .method_25869(this.field_41900.getClass(), this.field_41900.method_37241().method_18899(8.0, 8.0, 8.0), var3);
               class_8574 var5 = var4.stream().filter(class_8574::method_39438).findAny().orElse(this.field_41900);
               var5.method_39437(var4.stream().filter(var0 -> !var0.method_39444()));
               return this.field_41900.method_39444();
            } else {
               this.field_41901--;
               return false;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16799() {
      return this.field_41900.method_39444() && this.field_41900.method_39441();
   }

   @Override
   public void method_16796() {
      this.field_41899 = 0;
   }

   @Override
   public void method_16793() {
      this.field_41900.method_39435();
   }

   @Override
   public void method_16794() {
      if (--this.field_41899 <= 0) {
         this.field_41899 = 10;
         this.field_41900.method_39440();
      }
   }
}
