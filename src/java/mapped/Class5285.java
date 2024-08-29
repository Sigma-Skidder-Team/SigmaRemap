package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4402;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.event.impl.Class4430;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import org.lwjgl.glfw.GLFW;

public class Class5285 extends Module {
    private boolean field23757;

    public Class5285() {
        super(ModuleCategory.PLAYER, "InvMove", "Move freely in the inventory");
        this.registerSetting(new BooleanSetting("AACP", "Bypass for AACP", true));
        this.field23757 = false;
    }

    @EventTarget
    private void method16583(Class4430 var1) {
        if (this.isEnabled()) {
            if (var1.method13977() == mc.gameSettings.field44639.field13070.field34875 && mc.player.method3337()) {
                mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, Class1865.field10044));
            }
        }
    }

    @EventTarget
    private void method16584(Class4402 var1) {
        if (this.isEnabled()) {
            if (this.field23757 && var1.method13932() instanceof CEntityActionPacket && this.getBooleanValueFromSetttingName("AACP")) {
                CEntityActionPacket var4 = (CEntityActionPacket) var1.method13932();
                if (var4.getAction() == Class1865.field10043) {
                    var1.method13900(true);
                }
            }
        }
    }

    @EventTarget
    private void method16585(TickEvent var1) {
        if (this.isEnabled()) {
            if (this.getBooleanValueFromSetttingName("AACP")) {
                boolean var4 = !(mc.currentScreen instanceof InventoryScreen) || !(mc.currentScreen instanceof Class868);
                if (this.field23757 && !var4) {
                    this.field23757 = !this.field23757;
                    if (mc.player.method3337()) {
                        mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, Class1865.field10043));
                    }
                } else if (!this.field23757 && var4) {
                    this.field23757 = !this.field23757;
                    if (mc.player.method3337()) {
                        mc.getConnection().sendPacket(new CEntityActionPacket(mc.player, Class1865.field10044));
                    }
                }
            }

            if (mc.currentScreen instanceof Class851 || Client.getInstance().method19939().method31332() <= 1) {
                if (mc.currentScreen instanceof ChatScreen) {
                    return;
                }

                if (mc.currentScreen instanceof Class1124) {
                    return;
                }

                if (mc.currentScreen instanceof Class1144) {
                    return;
                }

                if (mc.currentScreen instanceof CreativeScreen) {
                    CreativeScreen var9 = (CreativeScreen) mc.currentScreen;
                    if (var9.method2654() == 5) {
                        return;
                    }
                }

                if (Client.getInstance().getGuiManager().method33480() != null && Client.getInstance().getGuiManager().method33480().method13227()) {
                    for (KeyBinding var14 : Minecraft.getInstance().gameSettings.field44658) {
                        var14.field13071 = false;
                    }

                    return;
                }

                for (KeyBinding var7 : mc.gameSettings.field44658) {
                    if (var7.field13070.field34875 > 0
                            && mc.gameSettings.field44637.field13070.field34875 != var7.field13070.field34875
                            && var7.field13070.field34875 > 4) {
                        int var8 = GLFW.glfwGetKey(mc.mainWindow.getHandle(), var7.field13070.field34875);
                        var7.field13071 = var8 == 1;
                    }
                }
            }
        }
    }
}
