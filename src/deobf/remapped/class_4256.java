package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$class_47;

public class class_4256 extends Module {
   private class_7376 field_20629;

   public class_4256() {
      super(class_5664.field_28711, "Jartex", "Gameplay for Jartex network");
   }

   @Override
   public void method_42012() {
      this.field_20629 = (class_7376)this.method_42017();
   }

   @class_9148
   private void method_19834(class_139 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null) {
         class_6310 var4 = var1.method_557();
         if (var4 instanceof class_5182) {
            class_5182 var5 = (class_5182)var4;
            String var6 = var5.method_23768().getString();
            String var7 = mcInstance.field_9632.method_45509().getString().toLowerCase();
            String var8 = var5.method_23768().getString();
            if (this.field_20629.method_42007("AutoL")
               && (
                  var8.toLowerCase().contains("§r§7 has been killed by §r§a§l" + var7)
                     || var8.toLowerCase().contains("§r§7 was shot by §r§a§l" + var7)
                     || var6.toLowerCase().contains("§r§7 was killed with dynamite by §r§a§l" + var7)
               )) {
               this.field_20629.method_33596(var6);
            }

            if (var8.contains("§e§lPlay Again? §r§7Click here!§r")) {
               if (this.field_20629.method_42007("AutoGG")) {
                  this.field_20629.method_33593();
               }

               if (this.field_20629.method_42007("Auto Join")) {
                  for (ITextComponent var10 : var5.method_23768().getSiblings()) {
                     ClickEvent var11 = var10.getStyle().getClickEvent();
                     if (var11 != null && var11.getAction() == ClickEvent$class_47.RUN_COMMAND) {
                        this.field_20629.method_33594(new class_1508(var11.getValue(), (long)this.field_20629.method_42002("Auto Join delay") * 1000L));
                        SigmaMainClass.method_3328()
                           .method_3335()
                           .method_27841(
                              new class_8235(
                                 "Auto Join", "Joining a new game in 3 seconds.", (int)(this.field_20629.method_42002("Auto Join delay") - 1.0F) * 1000
                              )
                           );
                        break;
                     }
                  }
               }
            }
         }
      }
   }
}
