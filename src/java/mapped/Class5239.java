package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import org.lwjgl.glfw.GLFW;

public class Class5239 extends Module {
    public Class5239() {
        super(ModuleCategory.PLAYER, "AutoWalk", "Automatically walks forward");
    }

    @EventTarget
    private void method16336(TickEvent var1) {
        if (this.method15996()) {
            mc.gameSettings.field44632.field13071 = true;
        }
    }

    @Override
    public void method15965() {
        int var3 = GLFW.glfwGetKey(mc.mainWindow.getHandle(), mc.gameSettings.field44632.field13070.field34875);
        mc.gameSettings.field44632.field13071 = var3 == 1;
    }
}
