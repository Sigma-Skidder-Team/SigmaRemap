package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$class_47;

public class JartexGamePlay extends Module {
   private GamePlayModule parentModule;

   public JartexGamePlay() {
      super(Category.MISC, "Jartex", "Gameplay for Jartex network");
   }

   @Override
   public void method_42012() {
      this.parentModule = (GamePlayModule)this.getModule();
   }

   @EventListen
   private void onPacket(PacketEvent packetEvent) {
      if (this.method_42015() && client.thePlayer != null) {
         Packet var4 = packetEvent.method_557();
         if (var4 instanceof class_5182) {
            class_5182 var5 = (class_5182)var4;
            String var6 = var5.method_23768().getString();
            String var7 = client.thePlayer.method_45509().getString().toLowerCase();
            String var8 = var5.method_23768().getString();
            if (this.parentModule.getBooleanValueByName("AutoL")
               && (
                  var8.toLowerCase().contains("§r§7 has been killed by §r§a§l" + var7)
                     || var8.toLowerCase().contains("§r§7 was shot by §r§a§l" + var7)
                     || var6.toLowerCase().contains("§r§7 was killed with dynamite by §r§a§l" + var7)
               )) {
               this.parentModule.method_33596(var6);
            }

            if (var8.contains("§e§lPlay Again? §r§7Click here!§r")) {
               if (this.parentModule.getBooleanValueByName("AutoGG")) {
                  this.parentModule.method_33593();
               }

               if (this.parentModule.getBooleanValueByName("Auto Join")) {
                  for (ITextComponent var10 : var5.method_23768().getSiblings()) {
                     ClickEvent var11 = var10.getStyle().getClickEvent();
                     if (var11 != null && var11.getAction().equals(ClickEvent.Action.RUN_COMMAND)) {
                        this.parentModule.method_33594(new class_1508(var11.getValue(), (long)this.parentModule.getFloatValueByName("Auto Join delay") * 1000L));
                        SigmaMainClass.getInstance()
                           .getNotificationManager()
                           .pushNotification(
                              new Notification(
                                 "Auto Join", "Joining a new game in 3 seconds.", (int)(this.parentModule.getFloatValueByName("Auto Join delay") - 1.0F) * 1000
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
