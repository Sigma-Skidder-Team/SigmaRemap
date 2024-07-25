package remapped;

public class class_8683 extends Module {
   private class_3223 field_44552 = new class_3223();
   private boolean field_44554;

   public class_8683() {
      super(Category.COMBAT, "Packet", "Packet criticals");
      this.addSetting(new FloatSetting<Integer>("HurtTime", "The hurtTime to crit at", 15.0F, Integer.class, 0.0F, 20.0F, 1.0F));
      this.addSetting(new ModeSetting("Mode", "Mode", 0, "Basic", "Hypixel"));
   }

   @class_9148
   private void method_39870(class_3645 var1) {
      if (this.method_42015() && var1.method_16973() != null && var1.method_16971()) {
         Entity var4 = var1.method_16973();
         if (var4 instanceof class_5834
            && var4.field_41749 <= (int)this.method_42002("HurtTime")
            && class_4181.field_20352 > 1
            && (this.field_44552.method_14772() > 200L || var4.field_41749 > 0)
            && mcInstance.field_9632.field_41726
            && mcInstance.field_9632.field_41774) {
            double[] var5 = new double[]{0.2, 0.0};
            if (this.method_42016("Mode").equals("Hypixel")) {
               var5 = new double[]{
                  0.0624 + class_314.method_1397(), 1.0E-14 + class_314.method_1397(), 0.0624 + class_314.method_1397(), 1.0E-14 + class_314.method_1397()
               };
            }

            for (int var6 = 0; var6 < var5.length; var6++) {
               mcInstance.method_8614()
                  .method_4813(
                     new class_9515(
                        mcInstance.field_9632.method_37302(), mcInstance.field_9632.method_37309() + var5[var6], mcInstance.field_9632.method_37156(), false
                     )
                  );
            }

            this.field_44554 = true;
            this.field_44552.method_14773();
         }
      }
   }

   @class_9148
   @class_315
   private void method_39871(class_2157 var1) {
      if (this.method_42015()) {
         if (var1.method_10047() instanceof class_4609) {
            if (!this.field_44552.method_14771()) {
               this.field_44552.method_14776();
            }

            if (this.field_44554 && mcInstance.field_9632.field_41726) {
               var1.method_29715(true);
               this.field_44554 = false;
            }
         }
      }
   }
}
