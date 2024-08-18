package remapped;

public class AutoTotemModule extends Module {
   public int field_41968 = -1;

   public AutoTotemModule() {
      super(Category.ITEM, "AutoTotem", "Automatically equips a totem in your second hand");
   }

   @EventListen
   private void method_37570(PlayerTickEvent var1) {
      this.method_37568();
   }

   @EventListen
   private void method_37569(class_1393 var1) {
      if (!var1.method_6449()) {
         this.method_37568();
      }
   }

   @Override
   public String getName2() {
      return this.getName() + "";
   }

   private void method_37568() {
      if (this.isEnabled() && client.thePlayer != null && !client.thePlayer.playerAbilities.isCreativeMode) {
         ItemStack var3 = client.thePlayer.method_26520(class_6943.field_35701);
         if (var3.method_27960() != class_4897.field_24472) {
            int var4 = class_2740.method_12318(class_4897.field_24472);
            if (var4 != -1) {
               client.playerController.method_42134(0, var4 >= 9 ? var4 : var4 + 36, 0, class_6269.field_32027, client.thePlayer);
               client.playerController.method_42134(0, 45, 0, class_6269.field_32027, client.thePlayer);
               client.playerController.method_42134(0, var4 >= 9 ? var4 : var4 + 36, 0, class_6269.field_32027, client.thePlayer);
            }
         }
      }
   }
}
