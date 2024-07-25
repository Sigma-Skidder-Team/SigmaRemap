package remapped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$class_47;
import org.apache.commons.lang3.StringUtils;

public class HypixelGameplayModule extends Module {
   private class_7376 field_16172;

   public HypixelGameplayModule() {
      super(Category.MISC, "Hypixel", "Gameplay for Hypixel");
      this.addSetting(new BooleanSetting("FriendAccept", "Automatically accept friend requests", false));
      this.addSetting(new BooleanSetting("Hide infos", "Hide scoreboard server informations & date when ingame", false));
   }

   @Override
   public void method_42012() {
      this.field_16172 = (class_7376)this.method_42017();
   }

   @EventListen
   private void method_14880(class_139 var1) {
      if (mc.field_9632 != null) {
         Packet var4 = var1.method_557();
         if (var4 instanceof class_5182) {
            class_5182 var5 = (class_5182)var4;
            String var6 = var5.method_23768().getString().replaceAll("§.", "");
            if (var5.method_23771() != ChatType.SYSTEM && var5.method_23771() != ChatType.CHAT) {
               return;
            }

            String var7 = mc.field_9632.method_45509().getString().toLowerCase();
            if (SigmaMainClass.getInstance().getModuleManager().method_847(NameProtectModule.class).method_42015()) {
            }

            if (this.field_16172.method_42007("AutoL")) {
               String[] var8 = new String[]{"MULTI ", "PENTA ", "QUADRA ", "TRIPLE ", "DOUBLE ", ""};
               boolean var9 = false;

               for (int var10 = 0; var10 < 6; var10++) {
                  if (var6.startsWith(var8[var10] + "KILL! ")) {
                     var9 = true;
                  }
               }

               if (var9) {
                  String[] var33 = var6.split(" ");
                  if (var33.length > 3) {
                     this.field_16172.method_33596(var33[3]);
                  }
               }

               if (var6.toLowerCase().contains("was killed by " + var7)
                  || var6.toLowerCase().contains("was thrown into the void by " + var7 + ".")
                  || var6.toLowerCase().contains("was thrown off a cliff by " + var7 + ".")
                  || var6.toLowerCase().contains("was struck down by " + var7 + ".")
                  || var6.toLowerCase().contains("be sent to davy jones' locker by " + var7 + ".")) {
                  class_1097 var34 = mc.field_9601.method_29562();
                  class_4399 var11 = null;
                  class_3903 var12 = var34.method_4848(mc.field_9632.method_37206());
                  if (var12 != null) {
                     int var13 = var12.method_23381().getColorIndex();
                     if (var13 >= 0) {
                        var11 = var34.method_4833(3 + var13);
                     }
                  }

                  class_4399 var38 = var11 != null ? var11 : var34.method_4833(1);
                  Collection var14 = var34.method_4863(var38);
                  int var15 = -1;

                  label155:
                  for (class_8274 var17 : var14) {
                     class_3903 var18 = var34.method_4848(var17.method_38147());
                     String var19 = class_3903.method_18063(var18, new StringTextComponent(var17.method_38147())).getString().replaceAll("§t", "");

                     for (String var22 : new ArrayList<String>(Arrays.asList("players left", "joueurs restants", "spieler verbleibend"))) {
                        if (var19.toLowerCase().contains(var22 + ":")) {
                           String[] var23 = var19.split(" ");
                           if (var23.length > 2) {
                              try {
                                 var15 = Integer.parseInt(var23[2]);
                              } catch (NumberFormatException var25) {
                              }
                              break label155;
                           }
                        }
                     }
                  }

                  if (var15 > 2) {
                     this.field_16172.method_33596(var6);
                  }
               }
            }

            if (this.method_42007("FriendAccept") && var6.contains("[ACCEPT] - [DENY] - [IGNORE]")) {
               for (ITextComponent var31 : var5.method_23768().getSiblings()) {
                  ClickEvent var35 = var31.getStyle().getClickEvent();
                  if (var35 != null && var35.getAction() == ClickEvent$class_47.RUN_COMMAND && var35.getValue().contains("/f accept")) {
                     class_314.method_1423(var35.getValue());
                  }
               }
            }

            if (var6.contains("Want to play again? Click here! ") || var6.contains("coins! (Win)")) {
               if (this.field_16172.method_42007("Auto Join")) {
                  for (ITextComponent var32 : var5.method_23768().getSiblings()) {
                     ClickEvent var36 = var32.getStyle().getClickEvent();
                     if (var36 != null && var36.getAction() == ClickEvent$class_47.RUN_COMMAND) {
                        class_1508 var37 = new class_1508(var36.getValue(), (long)this.field_16172.getFloatValueByName("Auto Join delay") * 1000L);
                        this.field_16172.method_33594(var37);
                     }
                  }
               }

               if (this.field_16172.method_42007("AutoGG")) {
                  this.field_16172.method_33593();
               }
            }
         } else if (var4 instanceof class_8077 && this.method_42007("Hide infos")) {
            class_8077 var26 = (class_8077)var4;
            if (var26.method_36694() == 2 && var26.method_36690().startsWith("team_")) {
               String var27 = var26.method_36687().getString() + var26.method_36686().getString();
               String[] var28 = var27.split(" ");
               if (var28 != null && var28.length > 1 && StringUtils.countMatches(var28[0], "/") == 2) {
                  var1.method_29715(true);
               }
            }
         }
      }
   }
}
