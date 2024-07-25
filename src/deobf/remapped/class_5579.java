package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$class_47;

public class class_5579 extends class_9128 {
   private class_7376 field_28338;

   public class_5579() {
      super(class_5664.field_28711, "Cubecraft", "Gameplay for Cubecraft");
   }

   @Override
   public void method_42012() {
      this.field_28338 = (class_7376)this.method_42017();
   }

   @class_9148
   private void method_25345(class_139 var1) {
      if (this.method_42015() && field_46692.field_9632 != null) {
         class_6310 var4 = var1.method_557();
         if (var4 instanceof class_5182) {
            class_5182 var5 = (class_5182)var4;
            String var6 = var5.method_23768().getString();
            String var7 = var5.method_23768().getString();
            String var8 = field_46692.field_9632.method_45509().getString().toLowerCase();
            if (this.field_28338.method_42007("AutoL")
               && (
                  var6.toLowerCase().contains("was slain by " + var8)
                     || var6.toLowerCase().contains("burned to death while fighting " + var8)
                     || var6.toLowerCase().contains("was shot by " + var8)
                     || var6.toLowerCase().contains("burnt to a crisp while fighting " + var8)
                     || var6.toLowerCase().contains("couldn't fly while escaping " + var8)
                     || var6.toLowerCase().contains("thought they could survive in the void while escaping " + var8)
                     || var6.toLowerCase().contains("fell to their death while escaping " + var8)
                     || var6.toLowerCase().contains("died in the void while escaping " + var8)
               )) {
               this.field_28338.method_33596(var6);
            }

            if (var7.contains("§a§lPlay Again §r§8• §r§6§lAuto Mode §r§8• §r§c§lLeave") && this.field_28338.method_42007("Auto Join")) {
               for (ITextComponent var10 : var5.method_23768().getSiblings()) {
                  ClickEvent var11 = var10.getStyle().getClickEvent();
                  if (var11 != null && var11.getAction() == ClickEvent$class_47.RUN_COMMAND && var11.getValue().contains("playagain")) {
                     this.field_28338.method_33594(new class_1508(var11.getValue(), (long)this.field_28338.method_42002("Auto Join delay") * 1000L));
                     SigmaMainClass.method_3328()
                        .method_3335()
                        .method_27841(
                           new class_8235(
                              "Auto Join", "Joining a new game in 3 seconds.", (int)(this.field_28338.method_42002("Auto Join delay") - 1.0F) * 1000
                           )
                        );
                     break;
                  }
               }
            }

            if (this.field_28338.method_42007("AutoGG")
               && var7.equalsIgnoreCase("§e" + field_46692.field_9632.method_45509().getString() + "§r§a won the game!§r")) {
               this.field_28338.method_33593();
            }
         }
      }
   }
}
