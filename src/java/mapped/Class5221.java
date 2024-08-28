package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

import java.io.FileWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Class5221 extends Module {
    public FileWriter field23556;
    public int field23557 = 1;
    public Vector3d field23558;

    public Class5221() {
        super(ModuleCategory.MISC, "DebugSpeed", "");
    }

    @EventTarget
    public void method16256(TickEvent var1) {
        if (this.method15996()) {
            Vector3d var4 = new Vector3d(mc.field1339.getPosX(), 0.0, mc.field1339.getPosZ());
            if (mc.field1339.field5036 && this.field23558 != null) {
                double var5 = var4.method11341(this.field23558) / (double) this.field23557;
                var5 *= mc.field1284.field40360;
                boolean var7 = Client.getInstance().method19939().method31329() > 1 && mc.field1339.field4999 == 0;
                double var8 = !var7 ? 0.312948 : 0.280616;
                double var10 = var5 / var8;
                BigDecimal var12 = new BigDecimal(var10);
                BigDecimal var13 = var12.setScale(4, RoundingMode.DOWN);
                float var14 = var13.floatValue();
                if ((double) var14 <= 9.0E-4) {
                    var14 = 0.0F;
                }

                if (var14 == 0.0F) {
                    return;
                }

                String var15 = Float.toString(var14);

                while (var15.length() < 6) {
                    var15 = var15 + "0";
                }

                Class5628.method17678(
                        Client.getInstance().getCommandManager().method30235() + "(" + var15 + "x faster " + (!var7 ? "jumping" : "walking") + ")  Speed: " + var5
                );
            }

            this.field23557 = !mc.field1339.field5036 ? this.field23557++ : 1;
            this.field23558 = var4;
        }
    }
}
