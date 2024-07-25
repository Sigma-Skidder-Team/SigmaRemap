package remapped;

import java.util.EnumSet;

public class class_3949 extends class_956 {
   private static String[] field_19166;
   private final class_9310 field_19167;
   private class_5834 field_19169;
   private int field_19170;

   public class_3949(class_9629 var1, class_9310 var2) {
      super(var2, false);
      this.field_19168 = var1;
      this.field_19167 = var2;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9563));
   }

   @Override
   public boolean method_16795() {
      if (this.field_19167.method_26920()) {
         Entity var3 = this.field_19167.method_26922();
         if (!(var3 instanceof class_6862)) {
            return false;
         } else {
            class_6862 var4 = (class_6862)var3;
            this.field_19169 = var4.method_26531();
            int var5 = var4.method_26577();
            return var5 != this.field_19170 && this.method_4210(this.field_19169, class_4931.field_25526);
         }
      } else {
         return false;
      }
   }

   @Override
   public void method_16796() {
      this.field_4915.method_26860(this.field_19169);
      Entity var3 = this.field_19167.method_26922();
      if (var3 instanceof class_6862) {
         this.field_19170 = ((class_6862)var3).method_26577();
      }

      super.method_16796();
   }
}
