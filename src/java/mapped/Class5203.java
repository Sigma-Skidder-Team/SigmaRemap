package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

import java.util.ArrayList;
import java.util.List;

public class Class5203 extends Module {
    public int field23519 = 0;
    private final List<Packet<?>> field23518 = new ArrayList<Packet<?>>();

    public Class5203() {
        super(ModuleCategory.COMBAT, "Delay", "For anticheats with \"good\" velocity checks");
        this.registerSetting(new NumberSetting<Float>("Delay", "Ticks delay", 7.0F, Float.class, 1.0F, 20.0F, 1.0F));
        this.registerSetting(new NumberSetting<Float>("H-Multiplier", "Horizontal velocity multiplier", 0.0F, Float.class, 0.0F, 1.0F, 0.01F));
        this.registerSetting(new NumberSetting<Float>("V-Multiplier", "Vertical velocity multiplier", 0.0F, Float.class, 0.0F, 1.0F, 0.01F));
    }

    @EventTarget
    private void method16198(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof Class5515) {
                Class5515 var4 = (Class5515) var1.getPacket();
                this.field23518.add(var4);
                var1.method13900(true);
            }

            if (mc.player != null && var1.getPacket() instanceof Class5590) {
                Class5590 var5 = (Class5590) var1.getPacket();
                if (var5.method17565() == mc.player.method3205()) {
                    this.field23518.add(var5);
                    var1.method13900(true);
                    if (this.field23519 == 0) {
                        this.field23519 = (int) this.getNumberValueBySettingName("Delay");
                    }
                }
            }
        }
    }

    @EventTarget
    private void method16199(SendPacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.method13932() instanceof CUseEntityPacket) {
                CUseEntityPacket var4 = (CUseEntityPacket) var1.method13932();
                CUseEntityPacket.Action var5 = var4.getAction();
                if (var5 != CUseEntityPacket.Action.ATTACK) {
                }
            }
        }
    }

    @EventTarget
    private void method16200(TickEvent var1) {
        if (this.field23519 != 0) {
            if (this.field23519 > 0) {
                this.field23519--;
            }
        } else {
            this.method16201();
        }
    }

    private void method16201() {
        for (Packet var4 : this.field23518) {
            if (!(var4 instanceof Class5590)) {
                if (var4 instanceof Class5515) {
                    Class5515 var5 = (Class5515) var4;
                    var5.field24473 = var5.field24473 * this.getNumberValueBySettingName("H-Multiplier");
                    var5.field24475 = var5.field24475 * this.getNumberValueBySettingName("H-Multiplier");
                    var5.field24474 = var5.field24474 * this.getNumberValueBySettingName("V-Multiplier");
                    mc.getConnection().method15720(var5);
                }
            } else {
                Class5590 var6 = (Class5590) var4;
                var6.field24801 = (int) ((float) var6.field24801 * this.getNumberValueBySettingName("H-Multiplier"));
                var6.field24803 = (int) ((float) var6.field24803 * this.getNumberValueBySettingName("H-Multiplier"));
                var6.field24802 = (int) ((float) var6.field24802 * this.getNumberValueBySettingName("V-Multiplier"));
                mc.getConnection().method15739(var6);
            }
        }

        this.field23518.clear();
    }
}
