package remapped;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class AutoLogModule extends Module {
   public AutoLogModule() {
      super(Category.COMBAT, "AutoLog", "Automatically logs out");
      this.addSetting(new FloatSetting<Float>("Min Health", "Minimum health before it logs you out", 2.5F, Float.class, 0.0F, 10.0F, 0.01F));
      this.addSetting(new BooleanSetting("No Totems", "Logs out when you have no totems in inventory", false));
      this.addSetting(new BooleanSetting("One Time Use", "Disables the mod every time it saves you.", true));
   }

   @EventListen
   public void method_6969(class_5596 var1) {
      if (this.method_42015() && mcInstance.field_9632.field_41697 > 10 && mcInstance.method_8515() == null && mcInstance.method_8530() != null) {
         float var4 = mcInstance.field_9632.method_26551() / mcInstance.field_9632.method_26465() * 10.0F;
         if (var4 < this.method_42002("Min Health") || class_2740.method_12345(class_4897.field_24472) == 0) {
            boolean var5 = this.method_42007("One Time Use");
            mcInstance.field_9601.method_29519();
            mcInstance.method_8499();
            mcInstance.method_8609(
               new class_7773(
                  new class_4145(new class_1876()),
                  new TranslationTextComponent("disconnect.lost"),
                  new StringTextComponent(
                     "AutoLog disconnected you. " + (!var5 ? "Disable it in a singleplayer world to reconnect." : "The mod now disabled for you to reconnect.")
                  )
               )
            );
         }
      }
   }
}
