package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5202 extends Module {
    private int field23517;

    public Class5202() {
        super(ModuleCategory.EXPLOIT, "TP", "Disabler working on some anticheats.");
        this.method15972(new Class6009<Float>("Delay", "Tp delay.", 20.0F, Float.class, 5.0F, 40.0F, 1.0F));
        this.method15972(new Class6005("Mode", "Mode", 0, "Basic1", "Basic2", "MinInfinity", "MaxInfinity", "MinValue", "MaxValue"));
        this.method15972(new Class6004("OnGround", "Send on ground packets.", false));
        this.method15972(new Class6004("More Packets", "Send more packets.", false));
        this.method15972(new Class6004("Ping spoof", "Spoof your ping.", false));
    }

    @Override
    public void isInDevelopment() {
        this.field23517 = 0;
    }

    @EventTarget
    public void method16197(Class4399 var1) {
        if (this.method15996() && mc.player != null && var1.method13921() && mc.method1528() != null) {
            this.field23517++;
            double var4 = -4.503599627370497E15;
            String var6 = this.getStringSettingValueByName("Mode");
            switch (var6) {
                case "Basic1":
                    var4 = mc.player.getPosY() - 20.0;
                    break;
                case "Basic2":
                    var4 = mc.player.getPosY() - 1000.0 + Math.random() * 1000.0;
                    break;
                case "MinInfinity":
                    var4 = Double.NEGATIVE_INFINITY;
                    break;
                case "MaxInfinity":
                    var4 = Double.POSITIVE_INFINITY;
                    break;
                case "MinValue":
                    var4 = Double.MIN_VALUE;
                    break;
                case "MaxValue":
                    var4 = Double.MAX_VALUE;
            }

            if ((float) this.field23517 >= this.method15977("Delay")) {
                this.field23517 = 0;
                boolean var8 = this.method15974("OnGround");
                if (this.method15974("More Packets")) {
                    mc.getClientPlayNetHandler().sendPacket(new Class5605(mc.player.getPosX(), var4, mc.player.getPosX(), var8));
                } else {
                    var1.method13912(var4);
                    var1.method13920(var8);
                }
            }
        }
    }
}