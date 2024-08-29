package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;

public class Class5341 extends ModuleWithModuleSettings {
    public static int field23893;

    public Class5341() {
        super(
                ModuleCategory.MOVEMENT,
                "Speed",
                "Vroom vroom",
                new Class5161(),
                new Class5158(),
                new Class5154(),
                new Class5210(),
                new Class5379(),
                new Class5241(),
                new Class5244(),
                new Class5380(),
                new Class5248(),
                new Class5214(),
                new Class5308(),
                new Class5387(),
                new Class5219(),
                new Class5233(),
                new Class5353()
        );
        this.registerSetting(new BooleanSetting("Lag back checker", "Disable speed when you get lag back", true));
        field23893 = 0;
    }

    @EventTarget
    public void method16762(TickEvent var1) {
        field23893++;
    }

    @EventTarget
    public void method16763(RecievePacketEvent var1) {
        if (var1.getPacket() instanceof Class5473 && mc.player != null) {
            field23893 = 0;
            if (this.getBooleanValueFromSetttingName("Lag back checker") && this.isEnabled() && mc.player.ticksExisted > 2) {
                Client.getInstance().getNotificationManager().post(new Notification("Speed", "Disabled speed due to lagback."));
                this.method16000();
            }
        }
    }

    public void method16764() {
        if (this.module instanceof Class5158) {
            Class5158 var3 = (Class5158) this.module;
            var3.method16044();
        }
    }
}
