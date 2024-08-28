package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4402;
import com.mentalfrostbyte.jello.event.impl.Class4418;
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
        this.method15972(new Class6009<Float>("Lag duration", "The lags duration", 0.3F, Float.class, 0.1F, 2.0F, 0.01F));
        this.method15972(new Class6009<Float>("Delay", "The lags cooldown", 0.4F, Float.class, 0.1F, 2.0F, 0.01F));
        this.method15972(new Class6004("Combat", "Delay combat packets", true));
        this.method15972(new Class6004("Blocks", "Delay blocks packets", true));
        this.method15972(new Class6004("Ping", "Delay ping packets", true));
        this.field23990.method27118();
    }

    @Override
    public void method15966() {
        this.field23989.clear();
        this.field23991 = false;
        this.field23990.method27120();
    }

    @Override
    public void method15965() {
        for (Packet var4 : this.field23989) {
            field23386.getClientPlayNetHandler().method15589().method30695(var4);
        }
    }

    @EventTarget
    private void method16910(Class4418 var1) {
        if (this.method15996()) {
            this.field23989.clear();
            this.field23991 = false;
            this.field23990.method27120();
        }
    }

    @EventTarget
    private void method16911(Class4402 var1) {
        if (this.method15996() && field23386.getClientPlayNetHandler() != null) {
            if (!this.field23991) {
                if ((float) this.field23990.method27121() > this.method15977("Delay") * 1000.0F) {
                    this.field23991 = true;
                    this.field23990.method27120();
                }
            } else if (!((float) this.field23990.method27121() > this.method15977("Lag duration") * 1000.0F)) {
                if (!(var1.method13932() instanceof Class5603)) {
                    if (!(var1.method13932() instanceof Class5600) && !(var1.method13932() instanceof Class5493)) {
                        if (!(var1.method13932() instanceof Class5505) && !(var1.method13932() instanceof Class5511)) {
                            if (!(var1.method13932() instanceof Class5555) && !(var1.method13932() instanceof Class5492) && !(var1.method13932() instanceof Class5570)
                            ) {
                                return;
                            }

                            if (!this.method15974("Blocks")) {
                                return;
                            }
                        } else if (!this.method15974("Combat")) {
                            return;
                        }
                    } else if (!this.method15974("Ping")) {
                        return;
                    }
                }

                this.field23989.add(var1.method13932());
                var1.method13900(true);
            } else {
                this.field23991 = false;
                this.field23990.method27120();

                for (Packet var5 : this.field23989) {
                    field23386.getClientPlayNetHandler().method15589().method30695(var5);
                }

                this.field23989.clear();
            }
        }
    }
}
