package remapped;

public class class_2458 extends Module {
   public class_2458() {
      super(Category.RENDER, "NoServerInfo", "Hides the server scoreboard and boss bar at top");
   }

   @EventListen
   private void method_11328(PacketEvent var1) {
      if (this.isEnabled()) {
         if (var1.method_557() instanceof class_9889) {
            class_9889 var4 = (class_9889)var1.method_557();
            var1.method_29715(true);
         }

         if (var1.method_557() instanceof class_3263) {
            class_3263 var5 = (class_3263)var1.method_557();
            var1.method_29715(true);
         }
      }
   }
}
