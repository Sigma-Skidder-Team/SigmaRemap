package remapped;

public class ReloadedFlyModule extends Module {
   private int field_28770;
   private double field_28771;
   private boolean field_28772;

   public ReloadedFlyModule() {
      super(Category.MOVEMENT, "Reloaded", "A fly for AnticheatReloaded");
      this.addSetting(new FloatSetting<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.3F, 8.0F, 0.1F));
      this.addSetting(new BooleanSetting("Offset", "Offset while flying", false));
      this.addSetting(new BooleanSetting("NoFall", "Avoid getting fall damage when flying down", true));
   }

   @Override
   public void method_42006() {
      this.field_28771 = mcInstance.field_9632.method_37309();
      this.field_28770 = 0;
      if (!mcInstance.gameOptions.field_45560.method_27060()) {
         if (!mcInstance.gameOptions.field_45560.method_27060()) {
            this.field_28772 = false;
         }
      } else {
         mcInstance.gameOptions.field_45560.field_30024 = false;
         this.field_28772 = true;
      }
   }

   @Override
   public void method_42020() {
      class_8865.method_40776(0.0);
      if (mcInstance.field_9632.method_37098().field_7333 > 0.0) {
         class_314.method_1408(-0.0789);
      }
   }

   @EventListen
   private void method_25672(class_6435 var1) {
      if (this.method_42015()) {
         if (var1.method_29384() == mcInstance.gameOptions.field_45560.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_28772 = true;
         }
      }
   }

   @EventListen
   private void method_25673(class_307 var1) {
      if (this.method_42015()) {
         if (var1.method_1364() == mcInstance.gameOptions.field_45560.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_28772 = false;
         }
      }
   }

   @EventListen
   @class_7664
   public void method_25676(class_7767 var1) {
      if (this.method_42015()) {
         if (this.field_28770 != -1) {
            if (this.field_28770 == 0) {
               if (Math.abs(var1.method_35236()) < 0.08) {
                  var1.method_35235(!this.getBooleanValueByName("Offset") ? 0.0 : -0.01);
               }

               class_314.method_1408(var1.method_35236());
               class_8865.method_40777(var1, 0.35);
            }
         } else {
            double var4 = !this.getBooleanValueByName("Offset") ? 0.0 : 0.01;
            if (this.field_28772) {
               var4 -= (double)(this.getFloatValueByName("Speed") / 2.0F);
            }

            if (mcInstance.gameOptions.field_45450.method_27060()) {
               var4 += (double)(this.getFloatValueByName("Speed") / 2.0F);
            }

            var1.method_35235(var4);
            class_314.method_1408(var1.method_35236());
            class_8865.method_40777(var1, (double)this.getFloatValueByName("Speed"));
         }
      }
   }

   @EventListen
   public void method_25677(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         this.field_28770++;
         if (this.field_28770 != 2) {
            if (this.field_28770 > 2 && this.field_28770 >= 20 && this.field_28770 % 20 == 0) {
               var1.method_6455(-150.0 - Math.random() * 150.0);
            }
         } else {
            var1.method_6455(-150.0 - Math.random() * 150.0);
         }

         if (this.getBooleanValueByName("NoFall")) {
            var1.method_6451(true);
         }

         var1.method_6444(true);
      }
   }

   @EventListen
   public void method_25674(class_139 var1) {
      if (this.method_42015()) {
         class_6310 var4 = var1.method_557();
         if (var4 instanceof class_509) {
            class_509 var5 = (class_509)var4;
            if (this.field_28770 >= 1) {
               this.field_28770 = -1;
            }

            this.field_28771 = var5.field_3144;
            var5.field_3143 = mcInstance.field_9632.field_41701;
            var5.field_3140 = mcInstance.field_9632.field_41755;
         }
      }
   }

   @EventListen
   public void method_25675(class_2157 var1) {
      if (this.method_42015()) {
         class_6310 var4 = var1.method_10047();
         if (var4 instanceof class_4609) {
            class_4609 var5 = (class_4609)var4;
            if (this.field_28770 == -1 && this.getBooleanValueByName("NoFall")) {
               var5.field_22416 = true;
            }
         }
      }
   }

   @EventListen
   public void method_25678(class_1711 var1) {
      if (this.method_42015()) {
         double var4 = this.field_28771;
         mcInstance.field_9632.field_41736.field_7333 = var4;
         mcInstance.field_9632.field_41713 = var4;
         mcInstance.field_9632.field_3864 = var4;
         mcInstance.field_9632.field_41698 = var4;
      }
   }
}
