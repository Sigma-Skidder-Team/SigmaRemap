package remapped;

public class VeltPVPFlyModule extends Module {
   private int field_17458;
   private int field_17461;
   private double field_17460;
   private double field_17459;
   private boolean field_17456;

   public VeltPVPFlyModule() {
      super(Category.MOVEMENT, "VeltPvP", "A fly for VeltPvP");
      this.addSetting(new FloatSetting<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.2F, 5.0F, 0.1F));
   }

   @Override
   public void method_42006() {
      this.field_17460 = mcInstance.field_9632.method_37309();
      this.field_17458 = 0;
      if (!mcInstance.field_9577.field_45560.method_27060()) {
         if (!mcInstance.field_9577.field_45560.method_27060()) {
            this.field_17456 = false;
         }
      } else {
         mcInstance.field_9577.field_45560.field_30024 = false;
         this.field_17456 = true;
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
   private void method_16579(class_6435 var1) {
      if (this.method_42015()) {
         if (var1.method_29384() == mcInstance.field_9577.field_45560.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_17456 = true;
         }
      }
   }

   @EventListen
   private void method_16578(class_307 var1) {
      if (this.method_42015()) {
         if (var1.method_1364() == mcInstance.field_9577.field_45560.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_17456 = false;
         }
      }
   }

   @EventListen
   @class_7664
   public void method_16577(class_7767 var1) {
      if (this.method_42015()) {
         double var4 = (double)this.method_42002("Speed");
         if (this.field_17458 <= 0) {
            if (this.field_17458 != -1) {
               if (this.field_17458 == 0) {
                  if (!mcInstance.field_9577.field_45450.method_27060() && var1.method_35236() > 0.0) {
                     var1.method_35235(-class_8865.method_40786());
                  }

                  class_314.method_1408(var1.method_35236());
                  class_8865.method_40777(var1, var4 - 0.1);
               }
            } else {
               if (!mcInstance.field_9577.field_45450.method_27060()) {
                  var1.method_35235(!this.field_17456 ? class_8865.method_40786() : -var4 / 2.0);
               } else {
                  var1.method_35235(!this.field_17456 ? var4 / 2.0 : class_8865.method_40786());
                  this.field_17459 = this.field_17460;
                  this.field_17460 = !this.field_17456 ? mcInstance.field_9632.method_37309() + var1.method_35236() : this.field_17460;
               }

               class_314.method_1408(var1.method_35236());
               class_8865.method_40777(var1, var4);
            }
         } else {
            var1.method_35235(0.0);
            class_8865.method_40777(var1, 0.0);
         }
      }
   }

   @EventListen
   public void method_16576(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         this.field_17458++;
         if (this.field_17458 != 2) {
            if (this.field_17458 > 2) {
               if (this.field_17458 >= 20 && this.field_17458 % 20 == 0) {
                  double var4 = 150.0 + Math.random() * 150.0;
                  double var6 = -var4;
                  var1.method_6455(var6);
                  this.field_17461 += 2;
               } else {
                  var1.method_29715(true);
               }
            }
         } else {
            double var8 = 150.0 + Math.random() * 150.0;
            double var9 = -var8;
            var1.method_6455(var9);
            this.field_17461 += 2;
         }

         var1.method_6444(true);
      }
   }

   @EventListen
   public void method_16580(class_139 var1) {
      if (this.method_42015()) {
         class_6310 var4 = var1.method_557();
         if (!(var4 instanceof class_509)) {
            if (var4 instanceof class_5182) {
               class_5182 var5 = (class_5182)var4;
               String var6 = var5.method_23768().getString();
               if (this.field_17461 > 0 && (var6.contains("Now leaving: §") || var6.contains("Now entering: §"))) {
                  this.field_17461--;
                  var1.method_29715(true);
               }
            }
         } else {
            class_509 var7 = (class_509)var4;
            if (this.field_17458 >= 1) {
               this.field_17458 = -1;
            }

            this.field_17459 = this.field_17460;
            this.field_17460 = var7.field_3144;
         }
      }
   }

   @EventListen
   public void method_16581(class_2157 var1) {
      if (this.method_42015()) {
         class_6310 var4 = var1.method_10047();
         if (var4 instanceof class_4609) {
            class_4609 var5 = (class_4609)var4;
            if (this.field_17458 == -1) {
               var5.field_22416 = true;
            }
         }
      }
   }

   @EventListen
   public void method_16582(class_1711 var1) {
      if (this.method_42015()) {
         double var4 = this.field_17460;
         mcInstance.field_9632.field_41736.field_7333 = var4;
         mcInstance.field_9632.field_41713 = var4;
         mcInstance.field_9632.field_3864 = var4;
         mcInstance.field_9632.field_41698 = var4;
      }
   }
}
