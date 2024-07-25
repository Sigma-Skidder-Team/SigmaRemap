package remapped;

public class NCPFly extends Module {
   private int field_14150;
   private double field_14151;

   public NCPFly() {
      super(Category.MOVEMENT, "NCPSpigot", "A fly for NoCheatPlus");
   }

   @Override
   public void onEnable() {
      this.field_14151 = mc.field_9632.method_37309();
      this.field_14150 = 2;
   }

   @Override
   public void onDisable() {
      class_8865.method_40776(0.0);
      if (mc.field_9632.method_37098().field_7333 > 0.0) {
         class_314.method_1408(-0.0789);
      }
   }

   @EventListen
   @class_7664
   public void method_13255(class_7767 var1) {
      if (this.method_42015()) {
         if (this.field_14150 <= 1) {
            if (this.field_14150 != -1) {
               if (this.field_14150 != 0) {
                  if (this.field_14150 == 1) {
                     var1.method_35235(-1.0E-7);
                     class_8865.method_40777(var1, class_8865.method_40775());
                     class_314.method_1408(var1.method_35236());
                  }
               } else {
                  var1.method_35235(-1.0E-7);
                  class_8865.method_40777(var1, class_8865.method_40775());
                  class_314.method_1408(var1.method_35236());
               }
            } else {
               var1.method_35235(0.0);
               class_314.method_1408(var1.method_35236());
               class_8865.method_40777(var1, class_8865.method_40775());
            }
         } else {
            class_8865.method_40777(var1, 0.0);
         }
      }
   }

   @EventListen
   public void method_13257(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         this.field_14150++;
         if (this.field_14150 != 3) {
            if (this.field_14150 > 3 && this.field_14150 >= 20 && this.field_14150 % 20 == 0) {
               var1.method_6455(-150.0 - Math.random() * 150.0);
            }
         } else {
            var1.method_6455(-150.0 - Math.random() * 150.0);
         }

         var1.method_6444(true);
      }
   }

   @EventListen
   public void method_13253(class_139 var1) {
      if (this.method_42015()) {
         Packet var4 = var1.method_557();
         if (var4 instanceof class_509) {
            class_509 var5 = (class_509)var4;
            if (this.field_14150 >= 1) {
               this.field_14150 = -1;
            }

            this.field_14151 = var5.field_3144;
            var5.field_3143 = mc.field_9632.field_41701;
            var5.field_3140 = mc.field_9632.field_41755;
         }
      }
   }

   @EventListen
   public void method_13254(class_2157 var1) {
      if (this.method_42015()) {
         Packet var4 = var1.method_10047();
         if (var4 instanceof class_4609) {
            class_4609 var5 = (class_4609)var4;
            if (this.field_14150 == -1) {
               var5.field_22416 = true;
            }
         }
      }
   }

   @EventListen
   public void method_13256(class_1711 var1) {
      if (this.method_42015()) {
         double var4 = this.field_14151;
         mc.field_9632.field_41736.field_7333 = var4;
         mc.field_9632.field_41713 = var4;
         mc.field_9632.field_3864 = var4;
         mc.field_9632.field_41698 = var4;
      }
   }
}
