package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.event.impl.WorldLoadEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.timer.Timer;

import java.util.ArrayList;

public class Class5371 extends Module {
    private final ArrayList<Packet<?>> field23989 = new ArrayList<Packet<?>>();
    private final Timer field23990 = new Timer();
    private boolean field23991;

    public Class5371() {
        super(ModuleCategory.WORLD, "FakeLag", "Other players will see you lagging !");
        this.registerSetting(new NumberSetting<Float>("Lag duration", "The lags duration", 0.3F, Float.class, 0.1F, 2.0F, 0.01F));
        this.registerSetting(new NumberSetting<Float>("Delay", "The lags cooldown", 0.4F, Float.class, 0.1F, 2.0F, 0.01F));
        this.registerSetting(new BooleanSetting("Combat", "Delay combat packets", true));
        this.registerSetting(new BooleanSetting("Blocks", "Delay blocks packets", true));
        this.registerSetting(new BooleanSetting("Ping", "Delay ping packets", true));
        this.field23990.method27118();
    }

    @Override
    public void onEnable() {
        this.field23989.clear();
        this.field23991 = false;
        this.field23990.method27120();
    }

    @Override
    public void onDisable() {
        for (Packet var4 : this.field23989) {
            mc.getConnection().getNetworkManager().method30695(var4);
        }
    }

    @EventTarget
    private void method16910(WorldLoadEvent var1) {
        if (this.isEnabled()) {
            this.field23989.clear();
            this.field23991 = false;
            this.field23990.method27120();
        }
    }

    @EventTarget
    private void method16911(SendPacketEvent var1) {
        if (this.isEnabled() && mc.getConnection() != null) {
            if (!this.field23991) {
                if ((float) this.field23990.method27121() > this.getNumberValueBySettingName("Delay") * 1000.0F) {
                    this.field23991 = true;
                    this.field23990.method27120();
                }
            } else if (!((float) this.field23990.method27121() > this.getNumberValueBySettingName("Lag duration") * 1000.0F)) {
                if (!(var1.method13932() instanceof Class5603)) {
                    if (!(var1.method13932() instanceof Class5600) && !(var1.method13932() instanceof Class5493)) {
                        if (!(var1.method13932() instanceof CUseEntityPacket) && !(var1.method13932() instanceof CAnimateHandPacket)) {
                            if (!(var1.method13932() instanceof Class5555) && !(var1.method13932() instanceof CPlayerDiggingPacket) && !(var1.method13932() instanceof Class5570)
                            ) {
                                return;
                            }

                            if (!this.getBooleanValueFromSetttingName("Blocks")) {
                                return;
                            }
                        } else if (!this.getBooleanValueFromSetttingName("Combat")) {
                            return;
                        }
                    } else if (!this.getBooleanValueFromSetttingName("Ping")) {
                        return;
                    }
                }

                this.field23989.add(var1.method13932());
                var1.method13900(true);
            } else {
                this.field23991 = false;
                this.field23990.method27120();

                for (Packet var5 : this.field23989) {
                    mc.getConnection().getNetworkManager().method30695(var5);
                }

                this.field23989.clear();
            }
        }
    }
}
