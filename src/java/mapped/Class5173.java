package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4402;
import com.mentalfrostbyte.jello.event.impl.Class4418;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

import java.util.ArrayList;

public class Class5173 extends Module {
    private final ArrayList<Class8772> field23461 = new ArrayList<Class8772>();
    private int field23462;
    private int field23463;

    public Class5173() {
        super(ModuleCategory.EXPLOIT, "PingSpoof", "Makes you lagggy.");
        this.method15972(new Class6009<Float>("Lag", "Your ping (ms)", 1000.0F, Float.class, 50.0F, 2000.0F, 10.0F));
        this.method15972(new Class6004("Inv Bypass", "Avoid inventory glitchs on some servers", false));
    }

    @EventTarget
    public void method16100(Class4418 var1) {
        if (!this.method15996()) {
            Class5325 var4 = (Class5325) Client.getInstance().getModuleManager().method14662(Class5344.class);
            if (!var4.method15996() || !var4.getStringSettingValueByName("Type").equalsIgnoreCase("TP") || !var4.method16726().method15974("Ping spoof")) {
                return;
            }
        }

        this.field23461.clear();
    }

    @EventTarget
    public void method16101(TickEvent var1) {
        if (!this.method15996()) {
            Class5325 var4 = (Class5325) Client.getInstance().getModuleManager().method14662(Class5344.class);
            if (!var4.method15996() || !var4.getStringSettingValueByName("Type").equalsIgnoreCase("TP") || !var4.method16726().method15974("Ping spoof")) {
                return;
            }
        }

        this.field23462++;
        if (mc.field1339 != null && mc.method1528() != null) {
            if (mc.field1339.field5055 <= 1) {
                this.field23461.clear();
            }

            if (!this.field23461.isEmpty()) {
                int var7 = this.field23461.size();

                for (int var5 = 0; var5 < var7; var5++) {
                    Class8772 var6 = this.field23461.get(var5);
                    if (var6.method31641()) {
                        mc.getClientPlayNetHandler().method15589();
                        Class8586.method30691(var6.method31642(), mc.getClientPlayNetHandler().method15589().field38650);
                        this.field23461.remove(var5);
                        var7--;
                        var5--;
                    }
                }
            }
        }
    }

    @EventTarget
    public void method16102(Class4402 var1) {
        Packet var4 = var1.method13932();
        if (var4 instanceof Class5594) {
            Class5594 var5 = (Class5594) var4;
            this.field23463 = var5.method17582();
        }
    }

    @EventTarget
    public void method16103(Class4396 var1) {
        if (!this.method15996()) {
            Class5325 var4 = (Class5325) Client.getInstance().getModuleManager().method14662(Class5344.class);
            if (!var4.method15996() || !var4.getStringSettingValueByName("Type").equalsIgnoreCase("TP") || !var4.method16726().method15974("Ping spoof")) {
                return;
            }
        }

        if (mc.method1528() != null) {
            Packet var7 = var1.method13898();
            if (!(var7 instanceof Class5554)) {
                if (!(var7 instanceof Class5542)) {
                    if (var7 instanceof Class5473 && this.field23462 > 0) {
                        Class5473 var5 = (Class5473) var7;
                    } else if (!(var7 instanceof Class5525)) {
                        if (!(var7 instanceof Class5599) && !(var7 instanceof Class5501) && !(var7 instanceof Class5498) && !(var7 instanceof Class5614)) {
                        }
                    } else {
                        this.field23462 = 0;
                    }
                } else {
                    Class5542 var8 = (Class5542) var7;
                    int var6 = var8.method17422() - this.field23463;
                    if (var6 > 0 || var6 < -20 || !this.method15974("Inv Bypass")) {
                        this.field23461.add(new Class8772(var8, this, (long) this.method15977("Lag")));
                        var1.method13900(true);
                    }
                }
            } else {
                Class5554 var9 = (Class5554) var7;
                this.field23461.add(new Class8772(var9, this, (long) this.method15977("Lag")));
                var1.method13900(true);
            }
        }
    }

    public class Class8772 {
        public final Class5173 field39475;
        private final long field39473;
        private final Packet<?> field39474;

        public Class8772(Packet<?> var1, Class5173 var2, long param4) {
            this.field39474 = var1;
            this.field39475 = var2;
            this.field39473 = System.currentTimeMillis() + param4;
        }

        public boolean method31641() {
            return this.field39473 - System.currentTimeMillis() < 0L;
        }

        public Packet<?> method31642() {
            return this.field39474;
        }
    }
}
