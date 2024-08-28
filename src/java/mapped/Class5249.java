package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;

public class Class5249 extends Module {
    public Class5249() {
        super(ModuleCategory.WORLD, "AutoFish", "Automatically catches fish for you");
    }

    @EventTarget
    public void method16364(Class4396 var1) {
        if (this.method15996()) {
            if (var1.method13898() instanceof Class5584 || var1.method13898() instanceof Class5475) {
                if (field23386.field1339.method3090() != null) {
                    if (field23386.field1339.method3090().method32107() instanceof Class3259) {
                        if (!(var1.method13898() instanceof Class5584)) {
                            if (var1.method13898() instanceof Class5475 && !((Class5475) var1.method13898()).field24315.equals("entity.bobber.splash")) {
                                return;
                            }
                        } else if (!((Class5584) var1.method13898()).method17549().equals(Class6067.field26585)) {
                            return;
                        }

                        field23386.getClientPlayNetHandler().sendPacket(new Class5555(Class79.field182));
                        field23386.getClientPlayNetHandler().sendPacket(new Class5555(Class79.field182));
                        Client.getInstance().getNotificationManager().post(new Notification("AutoFish", "We catched something!", ResourcesDecrypter.doneIconPNG));
                    }
                }
            }
        }
    }
}
