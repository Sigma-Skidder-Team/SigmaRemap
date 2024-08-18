package remapped;

public class class_7854 extends class_6165 {
   private static String[] field_39801;
   private final ClientPlayerEntity field_39802;
   private int field_39800;

   public class_7854(ClientPlayerEntity var1) {
      super(SoundEvents.field_2680, class_562.field_3335);
      this.field_39802 = var1;
      this.field_5768 = true;
      this.field_5764 = 0;
      this.field_5766 = 0.1F;
   }

   @Override
   public void method_29511() {
      this.field_39800++;
      if (!this.field_39802.removed && (this.field_39800 <= 20 || this.field_39802.method_26618())) {
         this.field_5761 = (double)((float)this.field_39802.getPosX());
         this.field_5765 = (double)((float)this.field_39802.method_37309());
         this.field_5762 = (double)((float)this.field_39802.getPosZ());
         float var3 = (float)this.field_39802.method_37098().method_6221();
         if (!((double)var3 >= 1.0E-7)) {
            this.field_5766 = 0.0F;
         } else {
            this.field_5766 = MathHelper.clamp(var3 / 4.0F, 0.0F, 1.0F);
         }

         if (this.field_39800 >= 20) {
            if (this.field_39800 < 40) {
               this.field_5766 = (float)((double)this.field_5766 * ((double)(this.field_39800 - 20) / 20.0));
            }
         } else {
            this.field_5766 = 0.0F;
         }

         float var4 = 0.8F;
         if (!(this.field_5766 > 0.8F)) {
            this.field_5773 = 1.0F;
         } else {
            this.field_5773 = 1.0F + (this.field_5766 - 0.8F);
         }
      } else {
         this.method_28267();
      }
   }
}
