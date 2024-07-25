package remapped;

public class class_2850 extends Module {
   private double field_13966;
   private boolean field_13969;
   private boolean field_13967;

   public class_2850() {
      super(Category.MOVEMENT, "Spartan", "A fly for Spartan anticheat");
      this.addSetting(new BooleanSetting("Ground Spoof", "Send on ground packets", true));
      this.addSetting(new BooleanSetting("Fake Block", "Send on fake blockplacing packet", true));
   }

   @Override
   public void method_42006() {
      this.field_13969 = false;
      this.field_13966 = -10.0;
      if (!mcInstance.gameOptions.field_45560.method_27060()) {
         this.field_13967 = false;
      } else {
         mcInstance.gameOptions.field_45560.field_30024 = false;
         this.field_13967 = true;
      }
   }

   @EventListen
   private void method_12962(class_6435 var1) {
      if (this.method_42015()) {
         if (var1.method_29384() == mcInstance.gameOptions.field_45560.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_13967 = true;
         }
      }
   }

   @EventListen
   private void method_12964(class_307 var1) {
      if (this.method_42015()) {
         if (var1.method_1364() == mcInstance.gameOptions.field_45560.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_13967 = false;
         }
      }
   }

   @EventListen
   public void method_12963(class_1393 var1) {
      if (this.method_42015() && var1.method_6449() && this.getBooleanValueByName("Ground Spoof")) {
         if (this.field_13969) {
            this.field_13969 = !this.field_13969;
            var1.method_6451(true);
         }
      }
   }

   @EventListen
   public void method_12965(class_7767 var1) {
      if (this.method_42015()) {
         boolean var4 = mcInstance.field_9632.field_41726 || class_314.method_1413(mcInstance.field_9632, 0.001F);
         if (!var4) {
            if (var1.method_35236() < 0.0) {
               if (this.field_13966 != mcInstance.field_9632.method_37245().field_7333) {
                  if (mcInstance.field_9632.method_37245().field_7333 + var1.method_35236() < this.field_13966) {
                     this.field_13969 = true;
                     int var5 = this.method_12961();
                     boolean var6 = this.getBooleanValueByName("Fake Block");
                     if (var5 >= 0 && var6) {
                        mcInstance.method_8614().method_4813(new class_7371(var5));
                     }

                     if (var6 && (var5 >= 0 || mcInstance.field_9632.method_26617(class_2584.field_12791).method_27960() instanceof class_6201)) {
                        class_9529 var7 = new class_9529(
                           mcInstance.field_9632.method_37245().method_6214(0.0, -2.0, 0.0),
                           Direction.field_817,
                           mcInstance.field_9632.method_37075().method_6104(0, -2, 0),
                           false
                        );
                        class_8585 var8 = new class_8585(class_2584.field_12791, var7);
                        mcInstance.method_8614().method_4813(var8);
                     }

                     if (var5 >= 0 && var6) {
                        mcInstance.method_8614().method_4813(new class_7371(mcInstance.field_9632.field_3853.field_36404));
                     }

                     var1.method_35235(this.field_13966 - mcInstance.field_9632.method_37245().field_7333);
                  }
               } else {
                  mcInstance.field_9632.method_26595();
                  var1.method_35235(mcInstance.field_9632.method_37098().field_7333);
                  this.field_13966 = !mcInstance.gameOptions.field_45450.method_27060()
                     ? (!this.field_13967 ? mcInstance.field_9632.method_37245().field_7333 : mcInstance.field_9632.method_37245().field_7333 - 1.0)
                     : (!this.field_13967 ? mcInstance.field_9632.method_37245().field_7333 + 1.0 : mcInstance.field_9632.method_37245().field_7333);
                  class_8865.method_40777(var1, 0.35);
               }
            }
         } else {
            mcInstance.field_9632.method_26595();
            var1.method_35235(mcInstance.field_9632.method_37098().field_7333);
            class_8865.method_40777(var1, 0.35);
            this.field_13966 = !mcInstance.gameOptions.field_45450.method_27060()
               ? (!this.field_13967 ? mcInstance.field_9632.method_37245().field_7333 : mcInstance.field_9632.method_37245().field_7333 - 1.0)
               : (!this.field_13967 ? mcInstance.field_9632.method_37245().field_7333 + 1.0 : mcInstance.field_9632.method_37245().field_7333);
         }

         class_314.method_1463(var1.method_35234());
         class_314.method_1408(var1.method_35236());
         class_314.method_1405(var1.method_35231());
      }
   }

   public int method_12961() {
      for (int var3 = 36; var3 < 45; var3++) {
         if (mcInstance.field_9632.field_3869.method_18878(var3).method_35884()) {
            class_6098 var4 = mcInstance.field_9632.field_3869.method_18878(var3).method_35898();
            if (var4.method_27960() instanceof class_6201) {
               if (var3 - 36 == mcInstance.field_9632.field_3853.field_36404) {
                  var3 = 34;
               }

               return var3 - 36;
            }
         }
      }

      return -1;
   }
}
