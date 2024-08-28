package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4402;
import com.mentalfrostbyte.jello.event.impl.Class4428;
import com.mentalfrostbyte.jello.event.impl.Class4430;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import org.lwjgl.glfw.GLFW;

public class Class5285 extends Module {
    private boolean field23757;

    public Class5285() {
        super(ModuleCategory.PLAYER, "InvMove", "Move freely in the inventory");
        this.method15972(new Class6004("AACP", "Bypass for AACP", true));
        this.field23757 = false;
    }

    @EventTarget
    private void method16583(Class4430 var1) {
        if (this.method15996()) {
            if (var1.method13977() == field23386.field1299.field44639.field13070.field34875 && field23386.field1339.method3337()) {
                field23386.getClientPlayNetHandler().sendPacket(new Class5583(field23386.field1339, Class1865.field10044));
            }
        }
    }

    @EventTarget
    private void method16584(Class4402 var1) {
        if (this.method15996()) {
            if (this.field23757 && var1.method13932() instanceof Class5583 && this.method15974("AACP")) {
                Class5583 var4 = (Class5583) var1.method13932();
                if (var4.method17547() == Class1865.field10043) {
                    var1.method13900(true);
                }
            }
        }
    }

    @EventTarget
    private void method16585(Class4428 var1) {
        if (this.method15996()) {
            if (this.method15974("AACP")) {
                boolean var4 = !(field23386.field1355 instanceof Class859) || !(field23386.field1355 instanceof Class868);
                if (this.field23757 && !var4) {
                    this.field23757 = !this.field23757;
                    if (field23386.field1339.method3337()) {
                        field23386.getClientPlayNetHandler().sendPacket(new Class5583(field23386.field1339, Class1865.field10043));
                    }
                } else if (!this.field23757 && var4) {
                    this.field23757 = !this.field23757;
                    if (field23386.field1339.method3337()) {
                        field23386.getClientPlayNetHandler().sendPacket(new Class5583(field23386.field1339, Class1865.field10044));
                    }
                }
            }

            if (field23386.field1355 instanceof Class851 || Client.getInstance().method19939().method31332() <= 1) {
                if (field23386.field1355 instanceof Class1331) {
                    return;
                }

                if (field23386.field1355 instanceof Class1124) {
                    return;
                }

                if (field23386.field1355 instanceof Class1144) {
                    return;
                }

                if (field23386.field1355 instanceof Class861) {
                    Class861 var9 = (Class861) field23386.field1355;
                    if (var9.method2654() == 5) {
                        return;
                    }
                }

                if (Client.getInstance().getGuiManager().method33480() != null && Client.getInstance().getGuiManager().method33480().method13227()) {
                    for (Class2007 var14 : Minecraft.getInstance().field1299.field44658) {
                        var14.field13071 = false;
                    }

                    return;
                }

                for (Class2007 var7 : field23386.field1299.field44658) {
                    if (var7.field13070.field34875 > 0
                            && field23386.field1299.field44637.field13070.field34875 != var7.field13070.field34875
                            && var7.field13070.field34875 > 4) {
                        int var8 = GLFW.glfwGetKey(field23386.field1283.method8039(), var7.field13070.field34875);
                        var7.field13071 = var8 == 1;
                    }
                }
            }
        }
    }
}
