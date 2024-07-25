package remapped;

public class AutoToolsModule extends Module {
   public int field_33089 = -1;

   public AutoToolsModule() {
      super(Category.ITEM, "AutoTools", "Picks the best tool when breaking blocks");
      this.addSetting(new ModeSetting("Inv Mode", "The way it will move tools in your inventory", 0, "Basic", "OpenInv", "FakeInv"));
   }

   @EventListen
   public void method_29644(class_307 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null && var1.method_1364() == 0) {
         if (this.field_33089 != -1) {
            mcInstance.field_9632.field_3853.field_36404 = this.field_33089;
            this.field_33089 = -1;
         }
      }
   }

   @EventListen
   private void method_29646(class_6435 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null && var1.method_29384() == 0) {
         this.method_29647(var1.method_29386());
      }
   }

   @EventListen
   private void method_29645(class_5596 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null && mcInstance.gameOptions.field_45530.method_27060()) {
         this.method_29647(null);
      }
   }

   public void method_29647(class_1331 var1) {
      class_1331 var4 = var1 == null
         ? (mcInstance.field_9587.method_33990() != class_1430.field_7717 ? null : ((class_9529) mcInstance.field_9587).method_43955())
         : var1;
      if (var4 != null) {
         int var5 = class_2740.method_12348(mcInstance.field_9601.method_28262(var4));
         if (var5 != -1) {
            if (mcInstance.field_9632.field_3853.field_36404 != var5 % 9 && this.field_33089 == -1) {
               this.field_33089 = mcInstance.field_9632.field_3853.field_36404;
            }

            if (var5 >= 36 && var5 <= 44) {
               mcInstance.field_9632.field_3853.field_36404 = var5 % 9;
            } else if (SigmaMainClass.getInstance().method_3310().method_25303() > 1) {
               String var6 = this.getStringValueByName("Inv Mode");
               if (var6.equals("OpenInv") && !(mcInstance.field_9623 instanceof class_3431)) {
                  return;
               }

               if (var6.equals("FakeInv") && class_3347.method_15349() <= class_412.field_1752.method_2055()) {
                  mcInstance.method_8614().method_4813(new class_8559(class_2105.field_10551));
               }

               mcInstance.field_9632.field_3853.field_36404 = class_2740.method_12363(var5);
               if (var6.equals("FakeInv")) {
                  mcInstance.method_8614().method_4813(new class_1194(-1));
               }
            }
         }
      }
   }
}
