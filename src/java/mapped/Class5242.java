package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.WorldLoadEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.timer.Timer;

public class Class5242 extends Module {
    private Class5340 field23602;
    private boolean field23603;
    private final Timer field23604 = new Timer();

    public Class5242() {
        super(ModuleCategory.MISC, "Mineplex", "Gameplay for Mineplex");
    }

    @Override
    public void method15953() {
        this.field23602 = (Class5340) this.method16004();
    }

    @Override
    public void onEnable() {
        this.field23603 = false;
    }

    @EventTarget
    private void method16340(RecievePacketEvent var1) {
        if (this.isEnabled() && mc.player != null) {
            Packet var4 = var1.getPacket();
            if (var4 instanceof SChatPacket) {
                SChatPacket var5 = (SChatPacket) var4;
                String var6 = var5.method17648().getString();
                String var7 = mc.player.getName().getString().toLowerCase();
                if (this.field23602.getBooleanValueFromSetttingName("AutoL") && var6.toLowerCase().contains("killed by " + var7 + " ")) {
                    this.field23602.method16761(var6);
                }

                String[] var8 = new String[]{"Green", "Red", "Blue", "Yellow"};

                for (int var9 = 0; var9 < var8.length; var9++) {
                    if (var6.equals(var8[var9] + " won the game!")) {
                        this.field23604.method27120();
                        this.field23603 = true;
                    }
                }
            }
        }
    }

    @EventTarget
    private void method16341(WorldLoadEvent var1) {
        if (this.isEnabled()) {
            this.field23603 = false;
        }
    }

    @EventTarget
    private void method16342(TickEvent var1) {
        if (this.isEnabled()) {
            if (this.getBooleanValueFromSetttingName("AutoGG") && this.field23604.method27121() > 5000L && this.field23603) {
                this.field23603 = false;
                this.field23604.method27120();
                this.field23602.method16760();
            }
        }
    }
}
