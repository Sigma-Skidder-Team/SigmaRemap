package remapped;

public class class_1191 extends Module {
   private int field_6675;
   private int field_6681;
   private double field_6680;
   private double field_6674;
   private double field_6678;
   private double field_6673;
   private double field_6679;
   private double field_6677;

   public class_1191() {
      super(Category.MOVEMENT, "Test", "A fly for OmegaCraft");
   }

   @Override
   public void onEnable() {
      this.field_6680 = mc.field_9632.method_37302();
      this.field_6674 = mc.field_9632.method_37309();
      this.field_6678 = mc.field_9632.method_37156();
      this.field_6673 = 0.0;
      this.field_6675 = 2;
      this.field_6681 = 0;
   }

   @Override
   public void onDisable() {
      class_8865.method_40776(0.0);
      if (mc.field_9632.method_37098().field_7333 > 0.0) {
         class_314.method_1408(-0.0789);
      }

      mc.field_9616.field_32603 = 1.0F;
   }

   @EventListen
   @class_7664
   public void method_5276(class_7767 var1) {
      if (this.method_42015()) {
         double var4 = Math.sqrt(var1.method_35234() * var1.method_35234() + var1.method_35231() * var1.method_35231());
         if (this.field_6675 <= 1) {
            if (this.field_6675 != -1) {
               if (this.field_6675 != 0) {
                  if (this.field_6675 < 1) {
                  }
               } else {
                  class_8865.method_40777(var1, 0.1);
               }
            } else {
               this.field_6681++;
               if (this.field_6681 != 1 && this.field_6681 % 3 != 0 && this.field_6681 % 3 != 1) {
               }

               class_314.method_1408(var1.method_35236());
               class_8865.method_40777(var1, 1.0);
            }
         } else {
            var1.method_35235(0.0);
            class_8865.method_40777(var1, 0.0);
         }
      }
   }

   @EventListen
   public void method_5280(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         this.field_6675++;
         if (this.field_6675 != 3) {
            if (this.field_6675 > 3) {
               if (this.field_6675 >= 20 && this.field_6675 % 20 == 0) {
                  var1.method_6455(0.0);
               } else {
                  var1.method_29715(true);
               }
            }
         } else {
            var1.method_6455(1000.0);
         }

         var1.method_6444(true);
      }
   }

   @EventListen
   public void method_5278(class_139 var1) {
      if (this.method_42015()) {
         Packet var4 = var1.method_557();
         if (var4 instanceof class_509) {
            class_509 var5 = (class_509)var4;
            if (this.field_6675 >= 1) {
               this.field_6675 = -1;
            }

            this.field_6679 = this.field_6674;
            this.field_6677 = this.field_6678;
            this.field_6680 = var5.field_3139;
            this.field_6674 = var5.field_3144;
            this.field_6678 = var5.field_3141;
            var5.field_3143 = mc.field_9632.field_41701;
            var5.field_3140 = mc.field_9632.field_41755;
         }
      }
   }

   @EventListen
   public void method_5279(class_2157 var1) {
      if (this.method_42015()) {
         Packet var4 = var1.method_10047();
         if (var4 instanceof class_4609) {
            class_4609 var5 = (class_4609)var4;
            if (this.field_6675 == -1) {
               var5.field_22416 = true;
            }
         }
      }
   }

   @EventListen
   public void method_5277(class_1711 var1) {
      if (!this.method_42015()) {
         ;
      }
   }
}
