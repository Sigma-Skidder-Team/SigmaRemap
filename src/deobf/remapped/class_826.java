package remapped;

public class class_826 extends class_6165 {
   private static String[] field_4359;
   private final AbstractMinecartEntity field_4360;
   private float field_4358 = 0.0F;

   public class_826(AbstractMinecartEntity var1) {
      super(class_463.field_2311, class_562.field_3328);
      this.field_4360 = var1;
      this.field_5768 = true;
      this.field_5764 = 0;
      this.field_5766 = 0.0F;
      this.field_5761 = (double)((float)var1.method_37302());
      this.field_5765 = (double)((float)var1.method_37309());
      this.field_5762 = (double)((float)var1.method_37156());
   }

   @Override
   public boolean method_16554() {
      return !this.field_4360.method_37378();
   }

   @Override
   public boolean method_16558() {
      return true;
   }

   @Override
   public void method_29511() {
      if (!this.field_4360.field_41751) {
         this.field_5761 = (double)((float)this.field_4360.method_37302());
         this.field_5765 = (double)((float)this.field_4360.method_37309());
         this.field_5762 = (double)((float)this.field_4360.method_37156());
         float var3 = class_9299.method_42842(Entity.method_37266(this.field_4360.method_37098()));
         if (!((double)var3 >= 0.01)) {
            this.field_4358 = 0.0F;
            this.field_5766 = 0.0F;
         } else {
            this.field_4358 = class_9299.method_42828(this.field_4358 + 0.0025F, 0.0F, 1.0F);
            this.field_5766 = class_9299.method_42795(class_9299.method_42828(var3, 0.0F, 0.5F), 0.0F, 0.7F);
         }
      } else {
         this.method_28267();
      }
   }
}
