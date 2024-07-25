package remapped;

public class AntiVoidModule extends Module {
   private double field_37111;
   private int field_37112;
   private int field_37110;
   private class_1343 field_37114 = null;

   public AntiVoidModule() {
      super(Category.PLAYER, "AntiVoid", "Avoids you from falling in the void");
      this.addSetting(new BooleanSetting("Void", "Catch only above void", true));
      this.addSetting(new FloatSetting<Float>("Fall Distance", "Fall distance before catching you", 8.0F, Float.class, 2.0F, 15.0F, 0.5F));
      this.addSetting(new ModeSetting("Mode", "AntiVoid method", 0, "Hypixel", "Motion", "Cubecraft", "Legit"));
   }

   @Override
   public void method_42006() {
      this.field_37111 = 0.0;
      this.field_37110 = 0;
      this.field_37112 = 0;
      if (mcInstance.field_9632.field_41726 || class_314.method_1413(mcInstance.field_9632, 0.001F)) {
         this.field_37114 = new class_1343(mcInstance.field_9632.method_37302(), mcInstance.field_9632.method_37309(), mcInstance.field_9632.method_37156());
      }
   }

   @EventListen
   private void method_33097(class_7767 var1) {
      if (this.method_42015()) {
         if (mcInstance.field_9632.field_41726 || class_314.method_1413(mcInstance.field_9632, 0.001F)) {
            this.field_37114 = new class_1343(
               mcInstance.field_9632.method_37302(), mcInstance.field_9632.method_37309(), mcInstance.field_9632.method_37156()
            );
         }

         if (this.field_37110 <= 0) {
            Module var4 = SigmaMainClass.method_3328().getModuleManager().method_847(FlyModule.class);
            String var5 = var4.getStringValueByName("Type");
            Module var6 = SigmaMainClass.method_3328().getModuleManager().method_847(class_5838.class);
            String var7 = var6.getStringValueByName("Type");
            boolean var8 = var4.method_42015();
            if (var5.equals("Cubecraft") && var1.method_35236() < -0.4) {
               var8 = false;
            }

            if (var6.method_42015() && var7.equals("Hypixel")) {
               var8 = true;
            }

            if (mcInstance.field_9632.method_37098().field_7333 < -0.08 && !var8) {
               this.field_37111 = this.field_37111 - mcInstance.field_9632.method_37098().field_7333;
            } else if (mcInstance.field_9632.field_41726) {
               this.field_37111 = 0.0;
            }
         } else {
            class_8865.method_40777(var1, 0.0);
            var1.method_35235(0.0);
            this.field_37110--;
         }

         if (this.field_37111 > (double)this.getFloatValueByName("Fall Distance") && (this.method_33100() || !this.getBooleanValueByName("Void"))) {
            this.field_37111 = 0.0;
            this.method_33096(this.getStringValueByName("Mode"), var1);
         }

         if (this.field_37112 > 0) {
            this.field_37112--;
            class_8865.method_40777(var1, 0.1);
         }
      }
   }

   @EventListen
   private void method_33099(class_1393 var1) {
      if (this.method_42015() && var1.method_6449() && this.field_37110 != 0) {
         var1.method_29715(true);
      }
   }

   @EventListen
   private void method_33098(class_139 var1) {
      if (this.method_42015() && this.field_37110 != 0) {
         if (var1.method_557() instanceof class_509) {
            this.field_37110 = 0;
            this.field_37112 = 4;
         }
      }
   }

   private boolean method_33100() {
      if (!(mcInstance.field_9632.method_37245().field_7333 < 1.0)) {
         if (!mcInstance.field_9632.field_41726) {
            class_4092 var3 = mcInstance.field_9632.field_41712;
            var3 = var3.method_18928(0.0, -mcInstance.field_9632.method_37245().field_7333, 0.0);
            return mcInstance.field_9601.method_6680(mcInstance.field_9632, var3).count() == 0L;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   private void method_33096(String var1, class_7767 var2) {
      double var5 = mcInstance.field_9632.method_37245().method_61();
      double var7 = mcInstance.field_9632.method_37245().method_60();
      double var9 = mcInstance.field_9632.method_37245().method_62();
      if (var1.equals("Cubecraft") && !class_314.method_1392()) {
         var1 = "Motion";
      }

      switch (var1) {
         case "Hypixel":
            mcInstance.method_8614().method_4813(new class_9515(0.0, -999.0, 0.0, true));
            break;
         case "Motion":
            var2.method_35235(0.1);
            class_314.method_1408(var2.method_35236());
            break;
         case "Cubecraft":
            double var13 = 3.2E7;
            mcInstance.method_8614().method_4813(new class_9515(var5, var13, var9, false));
            SigmaMainClass.method_3328().getModuleManager().method_847(FlyModule.class).method_41991(false);
            break;
         case "Legit":
            this.field_37110 = 200;
      }
   }
}
