package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.util.InDevelopment;

@InDevelopment
public class Class5304 extends Module {
    private double field23837;
    private int field23838;
    private int field23839;
    private Vector3d field23840 = null;

    public Class5304() {
        super(ModuleCategory.PLAYER, "AntiVoid", "Avoids you from falling in the void");
        this.method15972(new Class6004("Void", "Catch only above void", true));
        this.method15972(new Class6009<Float>("Fall Distance", "Fall distance before catching you", 8.0F, Float.class, 2.0F, 15.0F, 0.5F));
        this.method15972(new Class6005("Mode", "AntiVoid method", 0, "Hypixel", "Motion", "Cubecraft", "Legit"));
    }

    @Override
    public void isInDevelopment() {
        this.field23837 = 0.0;
        this.field23839 = 0;
        this.field23838 = 0;
        if (mc.field1339.field5036 || Class5628.method17730(mc.field1339, 0.001F)) {
            this.field23840 = new Vector3d(mc.field1339.getPosX(), mc.field1339.getPosY(), mc.field1339.getPosZ());
        }
    }

    @EventTarget
    private void method16664(Class4435 var1) {
        if (this.method15996()) {
            if (mc.field1339.field5036 || Class5628.method17730(mc.field1339, 0.001F)) {
                this.field23840 = new Vector3d(mc.field1339.getPosX(), mc.field1339.getPosY(), mc.field1339.getPosZ());
            }

            if (this.field23839 <= 0) {
                Module var4 = Client.getInstance().getModuleManager().method14662(Fly.class);
                String var5 = var4.getStringSettingValueByName("Type");
                Module var6 = Client.getInstance().getModuleManager().method14662(Class5342.class);
                String var7 = var6.getStringSettingValueByName("Type");
                boolean var8 = var4.method15996();
                if (var5.equals("Cubecraft") && var1.method13994() < -0.4) {
                    var8 = false;
                }

                if (var6.method15996() && var7.equals("Hypixel")) {
                    var8 = true;
                }

                if (mc.field1339.method3433().field18049 < -0.08 && !var8) {
                    this.field23837 = this.field23837 - mc.field1339.method3433().field18049;
                } else if (mc.field1339.field5036) {
                    this.field23837 = 0.0;
                }
            } else {
                Class9567.method37088(var1, 0.0);
                var1.method13995(0.0);
                this.field23839--;
            }

            if (this.field23837 > (double) this.method15977("Fall Distance") && (this.method16667() || !this.method15974("Void"))) {
                this.field23837 = 0.0;
                this.method16668(this.getStringSettingValueByName("Mode"), var1);
            }

            if (this.field23838 > 0) {
                this.field23838--;
                Class9567.method37088(var1, 0.1);
            }
        }
    }

    @EventTarget
    private void method16665(Class4399 var1) {
        if (this.method15996() && var1.method13921() && this.field23839 != 0) {
            var1.method13900(true);
        }
    }

    @EventTarget
    private void method16666(Class4396 var1) {
        if (this.method15996() && this.field23839 != 0) {
            if (var1.method13898() instanceof Class5473) {
                this.field23839 = 0;
                this.field23838 = 4;
            }
        }
    }

    private boolean method16667() {
        if (!(mc.field1339.getPositionVec().field18049 < 1.0)) {
            if (!mc.field1339.field5036) {
                Class6488 var3 = mc.field1339.field5035;
                var3 = var3.method19662(0.0, -mc.field1339.getPositionVec().field18049, 0.0);
                return mc.field1338.method7055(mc.field1339, var3).count() == 0L;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    private void method16668(String var1, Class4435 var2) {
        double var5 = mc.field1339.getPositionVec().method11320();
        double var7 = mc.field1339.getPositionVec().method11321();
        double var9 = mc.field1339.getPositionVec().method11322();
        if (var1.equals("Cubecraft") && !Class5628.method17718()) {
            var1 = "Motion";
        }

        switch (var1) {
            case "Hypixel":
                mc.getClientPlayNetHandler().sendPacket(new Class5605(0.0, -999.0, 0.0, true));
                break;
            case "Motion":
                var2.method13995(0.1);
                Class5628.method17725(var2.method13994());
                break;
            case "Cubecraft":
                double var13 = 3.2E7;
                mc.getClientPlayNetHandler().sendPacket(new Class5605(var5, var13, var9, false));
                Client.getInstance().getModuleManager().method14662(Fly.class).method15999(false);
                break;
            case "Legit":
                this.field23839 = 200;
        }
    }
}
