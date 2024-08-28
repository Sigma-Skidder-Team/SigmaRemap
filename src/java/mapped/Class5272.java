package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class5272 extends Module {
    public Class5272() {
        super(ModuleCategory.COMBAT, "AutoLog", "Automatically logs out");
        this.method15972(new Class6009<Float>("Min Health", "Minimum health before it logs you out", 2.5F, Float.class, 0.0F, 10.0F, 0.01F));
        this.method15972(new Class6004("No Totems", "Logs out when you have no totems in inventory", false));
        this.method15972(new Class6004("One Time Use", "Disables the mod every time it saves you.", true));
    }

    @EventTarget
    public void method16498(TickEvent var1) {
        if (this.method15996() && mc.field1339.field5055 > 10 && mc.method1531() == null && mc.method1528() != null) {
            float var4 = mc.field1339.method3042() / mc.field1339.method3075() * 10.0F;
            if (var4 < this.method15977("Min Health") || Class7789.method25878(Class8514.field38126) == 0) {
                boolean var5 = this.method15974("One Time Use");
                mc.field1338.method6782();
                mc.method1505();
                mc.displayGuiScreen(
                        new Class832(
                                new Class1316(new Class849()),
                                new TranslationTextComponent("disconnect.lost"),
                                new StringTextComponent(
                                        "AutoLog disconnected you. " + (!var5 ? "Disable it in a singleplayer world to reconnect." : "The mod now disabled for you to reconnect.")
                                )
                        )
                );
            }
        }
    }
}
