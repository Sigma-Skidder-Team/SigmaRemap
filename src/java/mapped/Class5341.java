package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;

public class Class5341 extends Class5325 {
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
        this.method15972(new Class6004("Lag back checker", "Disable speed when you get lag back", true));
        field23893 = 0;
    }

    @EventTarget
    public void method16762(TickEvent var1) {
        field23893++;
    }

    @EventTarget
    public void method16763(Class4396 var1) {
        if (var1.method13898() instanceof Class5473 && mc.field1339 != null) {
            field23893 = 0;
            if (this.method15974("Lag back checker") && this.method15996() && mc.field1339.field5055 > 2) {
                Client.getInstance().getNotificationManager().post(new Notification("Speed", "Disabled speed due to lagback."));
                this.method16000();
            }
        }
    }

    public void method16764() {
        if (this.field23879 instanceof Class5158) {
            Class5158 var3 = (Class5158) this.field23879;
            var3.method16044();
        }
    }
}
