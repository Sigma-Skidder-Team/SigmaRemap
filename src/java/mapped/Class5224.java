package mapped;

import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5224 extends Module {
    public static boolean field23568 = false;

    public Class5224() {
        super(ModuleCategory.RENDER, "FPSBooster", "Disables Armor Stand and particle rendering");
    }

    @Override
    public void method15953() {
        super.method15953();
        field23568 = this.isEnabled();
    }

    @Override
    public void onDisable() {
        field23568 = false;
    }

    @Override
    public void onEnable() {
        field23568 = true;
    }
}
