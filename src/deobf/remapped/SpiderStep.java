package remapped;

public class SpiderStep extends Module {
   private int field_49203;
   private double field_49206;
   private double field_49205;
   private float field_49204;

   public SpiderStep() {
      super(Category.MOVEMENT, "Spider", "Step for Spider");
      this.addSetting(new ModeSetting("Mode", "Mode", 0, "NCP", "AAC", "Gomme"));
   }

   @Override
   public void onEnable() {
      this.field_49203 = 0;
   }

   @EventListen
   @class_7664
   private void method_44591(class_8544 var1) {
      if (this.method_42015() && !var1.method_29716()) {
         double var4 = var1.method_39326();
         class_1380 var6 = ((StepModule)this.getModule()).method_19450(var1);
         if (var6 == class_1380.field_7487) {
            var1.method_29715(true);
         } else if (var6 != class_1380.field_7484) {
            if (!class_8865.method_40771() && var4 >= 0.625) {
               this.field_49205 = var4;
               double var7 = class_8865.method_40786();
               if (var4 < 1.1) {
                  var7 *= var4;
               }

               var7 = !(var7 > 0.42) ? var7 : 0.4199998;
               var1.method_39324(var7);
               this.field_49204 = class_8865.method_40787()[0] - 90.0F;
               this.field_49203 = 1;
               this.field_49206 = client.thePlayer.method_37309();
               var4 = var1.method_39326();
            }
         }
      }
   }

   @EventListen
   private void method_44592(class_1393 var1) {
      if (this.method_42015() && client.thePlayer != null && var1.method_6449()) {
         if (this.field_49203 != 1) {
            if (this.field_49203 == 3) {
               Module var4 = SigmaMainClass.getInstance().getModuleManager().getModuleByClass(CriticalsModule.class);
               if (var4.method_42015() && var4.getStringValueByName("Type").equals("NoGround")) {
                  var1.method_6455(var1.method_6454() + 1.0E-14);
               } else {
                  var1.method_6451(true);
               }
            }
         } else {
            var1.method_6451(false);
         }
      }
   }

   @EventListen
   private void method_44589(class_7767 var1) {
      if (this.method_42015() && client.thePlayer != null) {
         if (this.field_49203 == 1) {
            double var4 = class_8865.method_40786();
            if (this.field_49205 < 1.1) {
               var4 *= this.field_49205;
            }

            var4 = var4 > 0.42 ? 0.4199998 : var4;
            var1.method_35235(var4 * 0.797);
            class_8865.method_40777(var1, 0.0);
            this.field_49203++;
         } else if (this.field_49203 == 2) {
            var1.method_35235(this.field_49206 + this.field_49205 - client.thePlayer.method_37309());
            double var10 = this.getStringValueByName("Mode").equals("AAC") ? 0.301 : class_8865.method_40775();
            float var6 = this.field_49204 * (float) (Math.PI / 180.0);
            var1.method_35232((double)(-class_9299.method_42818(var6)) * var10);
            var1.method_35229((double)class_9299.method_42840(var6) * var10);
            this.field_49203++;
         } else if (this.field_49203 == 3) {
            if (class_314.method_1413(client.thePlayer, 0.001F)) {
               var1.method_35235(-0.078);
               String var7 = this.getStringValueByName("Mode");
               switch (var7) {
                  case "NCP":
                     class_8865.method_40777(var1, class_8865.method_40775());
                     break;
                  case "AAC":
                     class_8865.method_40777(var1, 0.301);
                     break;
                  case "Gomme":
                     class_8865.method_40777(var1, 0.175);
               }
            } else {
               class_8865.method_40777(var1, 0.25);
            }

            if (!class_314.method_1434()) {
               class_8865.method_40777(var1, 0.0);
            }

            this.field_49203 = 0;
         }
      }
   }

   @EventListen
   private void method_44590(class_7982 var1) {
      if (this.method_42015() && client.thePlayer != null) {
         if (!var1.method_36184()) {
            client.thePlayer.field_41733 = 1.07F;
         } else {
            client.thePlayer.field_41733 = 0.5F;
         }
      }
   }
}
