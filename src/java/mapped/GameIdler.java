package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4415;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import org.lwjgl.glfw.GLFW;

public class GameIdler extends Module {
    public GameIdler() {
        super(ModuleCategory.MISC, "GameIdler", "Lowers your fps when the game is idle to increase performance");
    }

    @EventTarget
    private void method16941(Class4415 var1) {
        if (this.method15996()) {
            boolean var4 = GLFW.glfwGetWindowAttrib(mc.mainWindow.method8039(), 131073) == 1;
            if (var4) {
                Minecraft.getInstance().mainWindow.method8027(mc.gameSettings.field44576);
            } else {
                Minecraft.getInstance().mainWindow.method8027(5);
            }
        }
    }

    @Override
    public void method15965() {
        Minecraft.getInstance().mainWindow.method8027(mc.gameSettings.field44576);
    }
}
