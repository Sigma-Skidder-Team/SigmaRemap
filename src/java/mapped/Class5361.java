package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;
import net.minecraft.util.text.ITextComponent;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

public class Class5361 extends Module {
    private final List<UUID> field23967 = new CopyOnWriteArrayList<UUID>();
    private int field23968 = -3200;

    public Class5361() {
        super(ModuleCategory.WORLD, "AntiVanish", "Detects if there are vanished players");
    }

    @EventTarget
    private void method16862(Class4399 var1) {
        if (this.method15996()) {
            if (var1.method13921() && mc.getCurrentServerData() != null) {
                if (!this.field23967.isEmpty()) {
                    if (this.field23968 > 3200) {
                        this.field23967.clear();
                        Client.getInstance().getNotificationManager().post(new Notification("Vanished Cleared", "Vanish List has been Cleared.", 5500));
                        this.field23968 = -3200;
                    } else {
                        this.field23968++;
                    }
                }

                if (this.field23967 != null) {
                    try {
                        for (UUID var5 : this.field23967) {
                            Class6589 var6 = mc.getConnection().method15792(var5);
                            ITextComponent var7 = var6 == null ? null : var6.method19979();
                            if (var6 != null && this.field23967.contains(var5)) {
                                if (var7 == null) {
                                    Client.getInstance()
                                            .getNotificationManager()
                                            .post(
                                                    new Notification("Vanished Warning", "A player is vanished !!" + var6.method19979().getUnformattedComponentText(), 5500)
                                            );
                                } else {
                                    Client.getInstance()
                                            .getNotificationManager()
                                            .post(new Notification("Vanish Warning", var6.method19979().getString() + " is no longer Vanished.", 5500));
                                }
                            }

                            this.field23967.remove(var5);
                        }
                    } catch (Exception var8) {
                        Client.getInstance().getNotificationManager().post(new Notification("Vanished Error", "Something bad happened.", 5500));
                    }
                }
            }
        }
    }

    @EventTarget
    private void method16863(Class4396 var1) {
        if (this.method15996()) {
            if (mc.getConnection() != null && var1.method13898() instanceof Class5503) {
                Class5503 var4 = (Class5503) var1.method13898();
                if (var4.method17308() == Class2176.field14283) {
                    for (Class8790 var6 : var4.method17307()) {
                        Class6589 var7 = mc.getConnection().method15792(var6.method31726().getId());
                        if (var7 == null && !this.method16864(var6.method31726().getId())) {
                            System.out.println(var6.method31726().getId());
                            Client.getInstance().getNotificationManager().post(new Notification("Vanished Warning", "A player is vanished ! ", 5500));
                            this.field23968 = -3200;
                        }
                    }
                }
            }
        }
    }

    private boolean method16864(UUID var1) {
        if (!this.field23967.contains(var1)) {
            this.field23967.add(var1);
            return false;
        } else {
            return true;
        }
    }
}
