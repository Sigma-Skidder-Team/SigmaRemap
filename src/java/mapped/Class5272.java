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
        this.registerSetting(new NumberSetting<Float>("Min Health", "Minimum health before it logs you out", 2.5F, Float.class, 0.0F, 10.0F, 0.01F));
        this.registerSetting(new BooleanSetting("No Totems", "Logs out when you have no totems in inventory", false));
        this.registerSetting(new BooleanSetting("One Time Use", "Disables the mod every time it saves you.", true));
    }

    @EventTarget
    public void method16498(TickEvent var1) {
        if (this.isEnabled() && mc.player.field5055 > 10 && mc.getIntegratedServer() == null && mc.getCurrentServerData() != null) {
            float var4 = mc.player.method3042() / mc.player.method3075() * 10.0F;
            if (var4 < this.getNumberValueBySettingName("Min Health") || Class7789.method25878(Items.field38126) == 0) {
                boolean var5 = this.getBooleanValueFromSetttingName("One Time Use");
                mc.world.sendQuittingDisconnectingPacket();
                mc.unloadWorld();
                mc.displayGuiScreen(
                        new Class832(
                                new MultiplayerScreen(new MainMenuScreen()),
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
