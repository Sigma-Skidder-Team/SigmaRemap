package remapped;

public class class_6505 extends Module {
   private class_7376 field_33098;
   private boolean field_33096;
   private Timer field_33097 = new Timer();

   public class_6505() {
      super(Category.MISC, "Mineplex", "Gameplay for Mineplex");
   }

   @Override
   public void method_42012() {
      this.field_33098 = (class_7376)this.method_42017();
   }

   @Override
   public void onEnable() {
      this.field_33096 = false;
   }

   @EventListen
   private void method_29653(class_139 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null) {
         Packet var4 = var1.method_557();
         if (var4 instanceof class_5182) {
            class_5182 var5 = (class_5182)var4;
            String var6 = var5.method_23768().getString();
            String var7 = mcInstance.field_9632.method_45509().getString().toLowerCase();
            if (this.field_33098.getBooleanValueByName("AutoL") && var6.toLowerCase().contains("killed by " + var7 + " ")) {
               this.field_33098.method_33596(var6);
            }

            String[] var8 = new String[]{"Green", "Red", "Blue", "Yellow"};

            for (int var9 = 0; var9 < var8.length; var9++) {
               if (var6.equals(var8[var9] + " won the game!")) {
                  this.field_33097.method_14773();
                  this.field_33096 = true;
               }
            }
         }
      }
   }

   @EventListen
   private void method_29654(class_717 var1) {
      if (this.method_42015()) {
         this.field_33096 = false;
      }
   }

   @EventListen
   private void method_29652(class_5596 var1) {
      if (this.method_42015()) {
         if (this.getBooleanValueByName("AutoGG") && this.field_33097.method_14772() > 5000L && this.field_33096) {
            this.field_33096 = false;
            this.field_33097.method_14773();
            this.field_33098.method_33593();
         }
      }
   }
}
