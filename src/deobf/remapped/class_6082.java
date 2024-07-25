package remapped;

import java.util.EnumSet;

public class class_6082 extends class_3599 {
   private static String[] field_31125;
   private final AbstractRaiderEntity field_31127;

   public class_6082(AbstractRaiderEntity var1, AbstractRaiderEntity var2) {
      this.field_31126 = var1;
      this.field_31127 = var2;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564));
   }

   @Override
   public boolean method_16795() {
      class_2452 var3 = this.field_31127.method_18589();
      return this.field_31127.isAlive() && this.field_31127.method_17809() == null && var3 != null && var3.method_11295();
   }

   @Override
   public void method_16796() {
      this.field_31127.method_18594(true);
      super.method_16796();
   }

   @Override
   public void method_16793() {
      this.field_31127.method_18594(false);
      super.method_16793();
   }

   @Override
   public void method_16794() {
      if (!this.field_31127.method_37378() && AbstractRaiderEntity.method_18586(this.field_31127).nextInt(100) == 0) {
         this.field_31126.method_37155(this.field_31126.method_18591(), AbstractRaiderEntity.method_18601(this.field_31126), AbstractRaiderEntity.method_18597(this.field_31126));
      }

      if (!this.field_31127.isPassenger() && AbstractRaiderEntity.method_18604(this.field_31127).nextInt(50) == 0) {
         this.field_31127.method_26886().method_18772();
      }

      super.method_16794();
   }
}
