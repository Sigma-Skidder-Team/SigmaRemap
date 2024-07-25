package remapped;

public class FullBlockPhase extends Module {
   public FullBlockPhase() {
      super(Category.MOVEMENT, "FullBlock", "Basic phase");
   }

   @EventListen
   private void method_24133(class_1393 var1) {
      if (this.method_42015() && class_314.method_1383()) {
         var1.method_6444(true);
      }
   }

   @EventListen
   private void method_24134(class_7767 var1) {
      if (this.method_42015()) {
         if (!class_314.method_1383()) {
            if (client.thePlayer.field_41744) {
               class_8865.method_40777(var1, 0.0);
               class_8865.method_40781(1.1920931E-8);
            }
         } else {
            class_8865.method_40781(0.617);
         }
      }
   }

   @EventListen
   private void method_24132(class_3574 var1) {
      if (this.method_42015()) {
         var1.method_29715(true);
      }
   }
}
