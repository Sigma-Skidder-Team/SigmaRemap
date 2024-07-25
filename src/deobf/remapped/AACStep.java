package remapped;

public class AACStep extends Module {
   public AACStep() {
      super(Category.MOVEMENT, "AAC", "Step for AAC");
   }

   @EventListen
   @class_7664
   private void method_37719(class_8544 var1) {
      if (this.method_42015() && !var1.method_29716()) {
         double var4 = var1.method_39326();
         if (!class_314.method_1413(client.thePlayer, 1.0E-4F)) {
            var1.method_29715(true);
         } else {
            if (!class_8865.method_40771() && var4 >= 0.625) {
               double var6 = client.thePlayer.getPosX();
               double var8 = client.thePlayer.method_37309();
               double var10 = client.thePlayer.getPosZ();
               if (var4 < 1.1) {
                  double[] var12 = new double[]{0.41999998688698 * var4, 0.754 * var4};

                  for (double var16 : var12) {
                     client.method_8614().sendPacket(new class_9515(var6, var8 + var16, var10, false));
                  }
               }
            }
         }
      }
   }

   @EventListen
   private void method_37718(class_7982 var1) {
      if (this.method_42015() && client.thePlayer != null) {
         if (!var1.method_36184()) {
            client.thePlayer.field_41733 = 1.0F;
         } else {
            client.thePlayer.field_41733 = 0.5F;
         }
      }
   }
}
