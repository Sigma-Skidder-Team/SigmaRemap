package remapped;

public class VanillaPhase extends Module {
   public VanillaPhase() {
      super(Category.MOVEMENT, "Vanilla", "Vanilla phase");
   }

   @EventListen
   private void method_8717(class_1393 var1) {
      if (this.method_42015()) {
         if (client.thePlayer.field_41744) {
            class_9097 var4 = class_314.method_1462(1.0E-4);
            double var5 = class_3347.method_15349() != class_412.field_1747.method_2055() ? 1.0E-6 : 0.0625;
            if (((Direction)var4.method_41933()).method_1029() != class_9249.field_47215) {
               var1.method_6453(
                  (double)Math.round((((class_1343)var4.method_41934()).field_7334 + 1.1921022E-8) * 10000.0) / 10000.0
                     + (double)((Direction)var4.method_41933()).method_1034() * var5
               );
            } else {
               var1.method_6443(
                  (double)Math.round((((class_1343)var4.method_41934()).field_7336 + 1.1921022E-8) * 10000.0) / 10000.0
                     + (double)((Direction)var4.method_41933()).method_1041() * var5
               );
            }
         }
      }
   }

   @EventListen
   private void method_8718(class_7767 var1) {
      if (this.method_42015()) {
         if (client.thePlayer.field_41744 || class_314.method_1383()) {
            class_8865.method_40777(var1, 0.0);
            class_8865.method_40781(1.7);
         }
      }
   }

   @EventListen
   private void method_8719(class_3574 var1) {
      if (this.method_42015()) {
         var1.method_29715(true);
      }
   }
}
