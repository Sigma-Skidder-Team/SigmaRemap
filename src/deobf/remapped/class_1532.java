package remapped;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_1532 extends class_9128 {
   public class_1532() {
      super(class_5664.field_28714, "AutoLog", "Automatically logs out");
      this.method_42010(new class_2748<Float>("Min Health", "Minimum health before it logs you out", 2.5F, Float.class, 0.0F, 10.0F, 0.01F));
      this.method_42010(new class_8563("No Totems", "Logs out when you have no totems in inventory", false));
      this.method_42010(new class_8563("One Time Use", "Disables the mod every time it saves you.", true));
   }

   @class_9148
   public void method_6969(class_5596 var1) {
      if (this.method_42015() && field_46692.field_9632.field_41697 > 10 && field_46692.method_8515() == null && field_46692.method_8530() != null) {
         float var4 = field_46692.field_9632.method_26551() / field_46692.field_9632.method_26465() * 10.0F;
         if (var4 < this.method_42002("Min Health") || class_2740.method_12345(class_4897.field_24472) == 0) {
            boolean var5 = this.method_42007("One Time Use");
            field_46692.field_9601.method_29519();
            field_46692.method_8499();
            field_46692.method_8609(
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
