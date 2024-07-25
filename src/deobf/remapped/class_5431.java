package remapped;

import java.util.UUID;
import java.util.function.Predicate;

public class class_5431 extends class_4138<class_5834> {
   private static String[] field_27664;
   private class_5834 field_27662;
   private class_5834 field_27661;
   private int field_27663;

   public class_5431(Class<class_5834> var1, boolean var2, boolean var3, Predicate<class_5834> var4, Predicate var5) {
      super(var1, var2, 10, var3, var4, var5);
      this.field_27660 = var1;
   }

   @Override
   public boolean method_16795() {
      if (this.field_20145 > 0 && this.field_4915.method_26594().nextInt(this.field_20145) != 0) {
         return false;
      } else {
         for (UUID var4 : class_5542.method_25179(this.field_27660)) {
            if (var4 != null && this.field_27660.field_41768 instanceof class_6331) {
               class_8145 var5 = ((class_6331)this.field_27660.field_41768).method_28925(var4);
               if (var5 instanceof class_5834) {
                  class_5834 var6 = (class_5834)var5;
                  this.field_27661 = var6;
                  this.field_27662 = var6.method_26531();
                  int var7 = var6.method_26577();
                  return var7 != this.field_27663 && this.method_4210(this.field_27662, this.field_20144);
               }
            }
         }

         return false;
      }
   }

   @Override
   public void method_16796() {
      this.method_19214(this.field_27662);
      this.field_20146 = this.field_27662;
      if (this.field_27661 != null) {
         this.field_27663 = this.field_27661.method_26577();
      }

      this.field_27660.method_37155(class_463.field_2796, 1.0F, 1.0F);
      class_5542.method_25216(this.field_27660, true);
      class_5542.method_25195(this.field_27660);
      super.method_16796();
   }
}
