package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.Class4415;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mojang.datafixers.util.Pair;

import java.io.IOException;

public class Class5300 extends Module {
    public String field23833 = "IBreakerman";
    private Texture field23834;
    private boolean field23835 = true;
    private boolean field23836;

    public Class5300() {
        super(ModuleCategory.MISC, "Murderer", "Detects murderer in murder mystery minigame on hypixel");
        this.registerSetting(new BooleanSetting("GUI", "Shows a GUI with info on the murderer", true));
        this.registerSetting(new BooleanSetting("Chat Message", "Sends a message with the murderer's name", true));
    }

    @EventTarget
    private void method16654(RecievePacketEvent var1) throws IOException {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof Class5588) {
                Class5588 var4 = (Class5588) var1.getPacket();

                for (Pair var6 : var4.method17562()) {
                    if (var6.getSecond() != null
                            && ((ItemStack) var6.getSecond()).getItem() instanceof ItemSword
                            && mc.world.method6774(var4.method17561()) instanceof PlayerEntity) {
                        Entity var7 = mc.world.method6774(var4.method17561());
                        if (!this.field23833.equalsIgnoreCase(var7.getName().getString())) {
                            if (this.getBooleanValueFromSetttingName("Chat Message")) {
                                mc.player.method5389("Murderer is " + var7.getName() + ", detected by Jello client");
                            }

                            this.field23833 = var7.getName().getUnformattedComponentText();
                            this.field23835 = true;
                            this.field23836 = true;
                        }

                        this.field23833 = var7.getName().getUnformattedComponentText();
                    }
                }
            }

            if (var1.getPacket() instanceof Class5545) {
                this.field23836 = false;
            }
        }
    }

    @EventTarget
    private void method16655(Class4415 var1) throws IOException {
        if (this.isEnabled()) {
            if (this.field23836) {
                if (this.getBooleanValueFromSetttingName("GUI")) {
                    ClientResource var4 = ResourceRegistry.JelloLightFont20;
                    byte var5 = -1;
                    int var6 = Minecraft.getInstance().mainWindow.method8043();
                    int var7 = Minecraft.getInstance().mainWindow.method8044();
                    if (this.field23835 && this.field23834 != null) {
                        this.field23835 = false;
                    }

                    if (this.field23834 != null) {
                        RenderUtil.method11426(
                                (float) (var6 - var4.method23942(this.field23833) - 90), (float) (var7 - 130), (float) (var6 - 10), (float) (var7 - 10), 1342177280
                        );
                        RenderUtil.method11455((float) (var6 - var4.method23942(this.field23833) - 80), (float) (var7 - 120), 50.0F, 100.0F, this.field23834);
                        RenderUtil.method11439(
                                var4, (float) (var6 - var4.method23942(this.field23833) - 20), (float) (var7 - var4.method23941(this.field23833) - 60), this.field23833, -1
                        );
                    }
                }
            }
        }
    }
}
