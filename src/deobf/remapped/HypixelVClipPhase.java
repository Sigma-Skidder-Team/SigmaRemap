package remapped;

public class HypixelVClipPhase extends Module {
   private int field_7607;
   private double field_7608;

   public HypixelVClipPhase() {
      super(Category.MOVEMENT, "Unfull", "Weird Hypixel VClip for some blocks");
   }

   @EventListen
   private void method_6457(class_4868 var1) {
      if (this.method_42015()) {
         if ((int) client.thePlayer.method_37309() == this.field_7607 && !client.thePlayer.field_29654) {
            class_314.method_1408(-2.0);
         }

         if (client.thePlayer.method_37309() > (double)this.field_7607 && client.thePlayer.field_29654 && !client.thePlayer.method_37252()) {
            this.field_7607++;
         }

         if (client.thePlayer.method_37309() % 1.0 == 0.0 && client.thePlayer.method_37252()) {
            this.field_7607--;
         }
      }
   }

   @EventListen
   private void method_6458(class_5243 var1) {
      if (this.method_42015()) {
         if (var1.method_23988() != null && var1.method_23989().method_12165() == this.field_7607 - 1
            || var1.method_23989().method_12165() == this.field_7607
            || var1.method_23989().method_12165() == this.field_7607 + 1
               && client.field_9601.method_28262(var1.method_23989()).method_8360() instanceof class_6344
            || client.field_9601.method_28262(var1.method_23989()).method_8360() instanceof class_4423
            || client.field_9601.method_28262(var1.method_23989()).method_8360() instanceof class_3049
            || client.field_9601.method_28262(var1.method_23989()).method_8360() instanceof class_5177
            || client.field_9601.method_28262(var1.method_23989()).method_8360() instanceof class_4749) {
            var1.method_23986(null);
         }
      }
   }

   @EventListen
   private void method_6456(class_3574 var1) {
      if (this.method_42015()) {
         var1.method_29715(true);
      }
   }

   @Override
   public void onEnable() {
      this.field_7607 = (int) client.thePlayer.method_37309();
      this.field_7608 = (double)this.field_7607 - client.thePlayer.method_37309();
   }
}
