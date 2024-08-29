package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$Action;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Class5251 extends Module {
    private Class5340 field23626;

    public Class5251() {
        super(ModuleCategory.MISC, "Hypixel", "Gameplay for Hypixel");
        this.registerSetting(new BooleanSetting("FriendAccept", "Automatically accept friend requests", false));
        this.registerSetting(new BooleanSetting("Hide infos", "Hide scoreboard server informations & date when ingame", false));
    }

    @Override
    public void method15953() {
        this.field23626 = (Class5340) this.method16004();
    }

    @EventTarget
    private void method16372(Class4396 var1) {
        if (mc.player != null) {
            Packet var4 = var1.method13898();
            if (var4 instanceof SChatPacket) {
                SChatPacket var5 = (SChatPacket) var4;
                String var6 = var5.method17648().getString().replaceAll("§.", "");
                if (var5.method17650() != ChatType.SYSTEM && var5.method17650() != ChatType.CHAT) {
                    return;
                }

                String var7 = mc.player.getName().getString().toLowerCase();
                if (Client.getInstance().getModuleManager().getModuleByClass(Class5364.class).isEnabled()) {
                }

                if (this.field23626.getBooleanValueFromSetttingName("AutoL")) {
                    String[] var8 = new String[]{"MULTI ", "PENTA ", "QUADRA ", "TRIPLE ", "DOUBLE ", ""};
                    boolean var9 = false;

                    for (int var10 = 0; var10 < 6; var10++) {
                        if (var6.startsWith(var8[var10] + "KILL! ")) {
                            var9 = true;
                            break;
                        }
                    }

                    if (var9) {
                        String[] var33 = var6.split(" ");
                        if (var33.length > 3) {
                            this.field23626.method16761(var33[3]);
                        }
                    }

                    if (var6.toLowerCase().contains("was killed by " + var7)
                            || var6.toLowerCase().contains("was thrown into the void by " + var7 + ".")
                            || var6.toLowerCase().contains("was thrown off a cliff by " + var7 + ".")
                            || var6.toLowerCase().contains("was struck down by " + var7 + ".")
                            || var6.toLowerCase().contains("be sent to davy jones' locker by " + var7 + ".")) {
                        Class6886 var34 = mc.world.method6805();
                        Class8375 var11 = null;
                        Class8218 var12 = var34.method20998(mc.player.method2956());
                        if (var12 != null) {
                            int var13 = var12.method28591().getColorIndex();
                            if (var13 >= 0) {
                                var11 = var34.method20989(3 + var13);
                            }
                        }

                        Class8375 var38 = var11 != null ? var11 : var34.method20989(1);
                        Collection<Class9411> var14 = var34.method20981(var38);
                        int var15 = -1;

                        label155:
                        for (Class9411 var17 : var14) {
                            Class8218 var18 = var34.method20998(var17.method36054());
                            String var19 = Class8218.method28577(var18, new StringTextComponent(var17.method36054())).getString().replaceAll("§t", "");

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
                            this.field23626.method16761(var6);
                        }
                    }
                }

                if (this.getBooleanValueFromSetttingName("FriendAccept") && var6.contains("[ACCEPT] - [DENY] - [IGNORE]")) {
                    for (ITextComponent var31 : var5.method17648().getSiblings()) {
                        ClickEvent var35 = var31.getStyle().getClickEvent();
                        if (var35 != null && var35.getAction() == ClickEvent$Action.RUN_COMMAND && var35.getValue().contains("/f accept")) {
                            Class5628.method17679(var35.getValue());
                        }
                    }
                }

                if (var6.contains("Want to play again? Click here! ") || var6.contains("coins! (Win)")) {
                    if (this.field23626.getBooleanValueFromSetttingName("Auto Join")) {
                        for (ITextComponent var32 : var5.method17648().getSiblings()) {
                            ClickEvent var36 = var32.getStyle().getClickEvent();
                            if (var36 != null && var36.getAction() == ClickEvent$Action.RUN_COMMAND) {
                                Class7200 var37 = new Class7200(var36.getValue(), (long) this.field23626.getNumberValueBySettingName("Auto Join delay") * 1000L);
                                this.field23626.method16759(var37);
                            }
                        }
                    }

                    if (this.field23626.getBooleanValueFromSetttingName("AutoGG")) {
                        this.field23626.method16760();
                    }
                }
            } else if (var4 instanceof Class5581 && this.getBooleanValueFromSetttingName("Hide infos")) {
                Class5581 var26 = (Class5581) var4;
                if (var26.method17528() == 2 && var26.method17525().startsWith("team_")) {
                    String var27 = var26.method17533().getString() + var26.method17534().getString();
                    String[] var28 = var27.split(" ");
                    if (var28 != null && var28.length > 1 && StringUtils.countMatches(var28[0], "/") == 2) {
                        var1.method13900(true);
                    }
                }
            }
        }
    }
}
