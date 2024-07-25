package remapped;

public class class_569 extends class_6165 {
   private static String[] field_3355;
   private final Entity field_3354;

   public class_569(class_8461 var1, class_562 var2, Entity var3) {
      this(var1, var2, 1.0F, 1.0F, var3);
   }

   public class_569(class_8461 var1, class_562 var2, float var3, float var4, Entity var5) {
      super(var1, var2);
      this.field_5766 = var3;
      this.field_5773 = var4;
      this.field_3354 = var5;
      this.field_5761 = (double)((float)this.field_3354.method_37302());
      this.field_5765 = (double)((float)this.field_3354.method_37309());
      this.field_5762 = (double)((float)this.field_3354.method_37156());
   }

   @Override
   public boolean method_16554() {
      return !this.field_3354.method_37378();
   }

   @Override
   public void method_29511() {
      if (!this.field_3354.field_41751) {
         this.field_5761 = (double)((float)this.field_3354.method_37302());
         this.field_5765 = (double)((float)this.field_3354.method_37309());
         this.field_5762 = (double)((float)this.field_3354.method_37156());
      } else {
         this.method_28267();
      }
   }
}
