package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.WorldLoadEvent;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;

public class Class5228 extends Module {
    private int field23574;
    private int field23575;

    public Class5228() {
        super(ModuleCategory.MISC, "Unstuck", "Toggle this when an anticheat freeze you mid-air");
        this.registerSetting(new NumberSetting<Float>("Flags", "Maximum flag before trying to unstuck", 5.0F, Float.class, 2.0F, 20.0F, 1.0F));
    }

    @Override
    public void onEnable() {
        this.field23574 = 0;
    }

    @EventTarget
    public void method16285(Class4435 var1) {
        if (this.isEnabled()) {
            if ((float) this.field23574 >= this.getNumberValueBySettingName("Flags")) {
                Class9567.method37088(var1, 0.0);
                var1.method13995(0.0);
                mc.player.method3435(0.0, 0.0, 0.0);
            }
        }
    }

    @EventTarget
    public void method16286(WorldLoadEvent var1) {
        if (this.isEnabled()) {
            this.field23574 = 0;
        }
    }

    @EventTarget
    public void method16287(Class4399 var1) {
        if (this.isEnabled() && var1.method13921()) {
            if (!mc.player.onGround && !Class5628.method17730(mc.player, 0.001F)) {
                if ((float) this.field23574 >= this.getNumberValueBySettingName("Flags") && this.field23575 == 0) {
                    this.field23575 = 60;
                    Client.getInstance().getNotificationManager().post(new Notification("Unstuck", "Trying to unstuck you.."));
                }

                if (this.field23575 > 0) {
                    this.field23575--;
                    if (this.field23575 == 0) {
                        this.field23574 = 0;
                    }

                    var1.method13900(true);
                }
            } else {
                this.field23574 = 0;
            }
        }
    }

    @EventTarget
    public void method16288(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            if (mc.player != null) {
                if (var1.getPacket() instanceof Class5473 && !Class5628.method17730(mc.player, 0.3F) && mc.player.ticksExisted > 10) {
                    this.field23574++;
                    if ((float) this.field23574 > this.getNumberValueBySettingName("Flags")) {
                        var1.method13900(true);
                    }
                }
            }
        }
    }
}
