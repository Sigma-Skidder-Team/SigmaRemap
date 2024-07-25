package remapped;

public class HawkFly extends Module {
   private int field_16754;
   private double field_16753;
   private double field_16751;
   private double field_16755;

   public HawkFly() {
      super(Category.MOVEMENT, "Hawk", "A fly for Hawk anticheat");
   }

   @Override
   public void onEnable() {
      this.field_16753 = client.thePlayer.method_37302();
      this.field_16751 = client.thePlayer.method_37309();
      this.field_16755 = client.thePlayer.method_37156();
      this.field_16754 = 0;
   }

   @Override
   public void onDisable() {
      class_8865.method_40776(0.0);
      if (client.thePlayer.method_37098().field_7333 > 0.0) {
         class_314.method_1408(-0.0789);
      }
   }

   @EventListen
   @class_7664
   public void method_15718(class_7767 var1) {
      if (this.method_42015()) {
         double var4 = 0.125;
         if (this.field_16754 != -1) {
            if (this.field_16754 == 0) {
               class_8865.method_40777(var1, 0.18);
            }
         } else {
            var1.method_35235(0.015);
            class_8865.method_40777(var1, var4);
         }

         class_314.method_1408(var1.method_35236());
         class_314.method_1463(var1.method_35234());
         class_314.method_1405(var1.method_35231());
      }
   }

   @EventListen
   public void method_15719(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         this.field_16754++;
         if (this.field_16754 == 1) {
            var1.method_6455(0.1);
         }

         var1.method_6444(true);
         var1.method_6451(false);
      }
   }

   @EventListen
   public void method_15721(PacketEvent var1) {
      if (this.method_42015()) {
         Packet var4 = var1.method_557();
         if (var4 instanceof class_509) {
            class_509 var5 = (class_509)var4;
            if (this.field_16754 >= 1) {
               this.field_16754 = -1;
            }

            this.field_16753 = var5.field_3139;
            this.field_16751 = var5.field_3144;
            this.field_16755 = var5.field_3141;
            var5.field_3143 = client.thePlayer.rotationYaw;
            var5.field_3140 = client.thePlayer.rotationPitch;
         }
      }
   }

   @EventListen
   public void method_15720(class_1711 var1) {
      if (this.method_42015()) {
         double var4 = this.field_16751;
         double var6 = this.field_16753;
         double var8 = this.field_16755;
         client.thePlayer.field_41736.field_7333 = var4;
         client.thePlayer.field_41713 = var4;
         client.thePlayer.field_3864 = var4;
         client.thePlayer.field_41698 = var4;
         client.thePlayer.field_41736.field_7336 = var6;
         client.thePlayer.field_41754 = var6;
         client.thePlayer.field_3868 = var6;
         client.thePlayer.field_41767 = var6;
         client.thePlayer.field_41736.field_7334 = var8;
         client.thePlayer.field_41724 = var8;
         client.thePlayer.field_3858 = var8;
         client.thePlayer.field_41725 = var8;
      }
   }
}
