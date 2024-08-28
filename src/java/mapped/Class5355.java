package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5355 extends Module {
    private float field23921;
    private float field23922;
    private Class7843 field23923;
    private int field23924 = -1;
    private int field23925;
    private int field23926;
    private Class79 field23927;
    private Class5328 field23928 = null;
    private boolean field23929;
    private boolean field23930 = false;
    private double field23931;

    public Class5355() {
        super(ModuleCategory.MOVEMENT, "NCP", "Places block underneath");
        this.method15972(new Class6005("Speed Mode", "Speed mode", 0, "None", "Jump", "AAC", "Slow", "Sneak"));
        this.method15972(new Class6004("KeepRotations", "Keeps your rotations.", true));
        this.method15972(new Class6009<Float>("Extend", "Extend value", 0.0F, Float.class, 0.0F, 6.0F, 0.1F));
        this.method15972(new Class6004("Downwards", "Allows you to go down when sneaking.", true));
    }

    public static Vector3d method16814(BlockPos var0, Direction var1) {
        double var4 = (double) var0.method8304() + 0.5;
        double var6 = (double) var0.getY() + 0.5;
        double var8 = (double) var0.method8306() + 0.5;
        var4 += (double) var1.method539() / 2.0;
        var8 += (double) var1.method541() / 2.0;
        var6 += (double) var1.method540() / 2.0;
        double var10 = 0.2;
        if (var1 != Direction.field673 && var1 != Direction.field672) {
            var6 += method16815(var10, -var10);
        } else {
            var4 += method16815(var10, -var10);
            var8 += method16815(var10, -var10);
        }

        if (var1 == Direction.WEST || var1 == Direction.EAST) {
            var8 += method16815(var10, -var10);
        }

        if (var1 == Direction.SOUTH || var1 == Direction.NORTH) {
            var4 += method16815(var10, -var10);
        }

        return new Vector3d(var4, var6, var8);
    }

    public static double method16815(double var0, double var2) {
        return Math.random() * (var0 - var2) + var2;
    }

    @Override
    public void method15953() {
        this.field23928 = (Class5328) this.method16004();
    }

    @Override
    public void method15966() {
        this.field23924 = field23386.field1339.field4902.field5443;
        this.field23922 = this.field23921 = 999.0F;
        ((Class5328) this.method16004()).field23884 = -1;
        if (field23386.field1299.field44637.method8509() && this.method15974("Downwards")) {
            field23386.field1299.field44637.field13071 = false;
            this.field23929 = true;
        }

        if (!field23386.field1299.field44637.method8509()) {
            this.field23929 = false;
        }

        this.field23931 = -1.0;
        this.field23930 = false;
        if (field23386.field1339.field5036) {
            this.field23931 = field23386.field1339.getPosY();
        }

        this.field23926 = -1;
    }

    @Override
    public void method15965() {
        if (this.field23924 != -1 && this.method16004().method15978("ItemSpoof").equals("Switch")) {
            field23386.field1339.field4902.field5443 = this.field23924;
        }

        this.field23924 = -1;
        if (((Class5328) this.method16004()).field23884 >= 0) {
            field23386.getClientPlayNetHandler().sendPacket(new Class5539(field23386.field1339.field4902.field5443));
            ((Class5328) this.method16004()).field23884 = -1;
        }

        Class9567.method37090(Class9567.method37075() * 0.9);
        field23386.field1284.field40360 = 1.0F;
        if (this.method15978("Speed Mode").equals("Cubecraft") && this.field23926 == 0) {
            Class5628.method17725(-0.0789);
        }
    }

    @EventTarget
    public void method16805(Class4417 var1) {
        if (this.method15996()) {
            if (this.method15978("Speed Mode").equals("Cubecraft") && !Client.getInstance().getModuleManager().method14662(Class5333.class).method15996()) {
                if (field23386.field1338
                        .method7055(
                                field23386.field1339,
                                field23386.field1339.field5035.method19662(0.0, -1.5, 0.0).method19660(0.05, 0.0, 0.05).method19660(-0.05, 0.0, -0.05)
                        )
                        .count()
                        == 0L
                        && field23386.field1339.field5045 < 1.0F) {
                    var1.method13966(true);
                }
            } else if (field23386.field1339.field5036
                    && Client.getInstance().getModuleManager().method14662(Class5363.class).method15996()
                    && (!this.field23929 || !this.method15974("Downwards"))) {
                var1.method13966(true);
            }
        }
    }

    @EventTarget
    private void method16806(Class4430 var1) {
        if (this.method15996() && this.method15974("Downwards")) {
            if (var1.method13977() == field23386.field1299.field44637.field13070.field34875) {
                var1.method13900(true);
                this.field23929 = true;
            }
        }
    }

    @EventTarget
    private void method16807(Class4426 var1) {
        if (this.method15996() && this.method15974("Downwards")) {
            if (var1.method13973() == field23386.field1299.field44637.field13070.field34875) {
                var1.method13900(true);
                this.field23929 = false;
            }
        }
    }

    @EventTarget
    @LowerPriority
    public void method16808(Class4399 var1) {
        if (this.method15996() && this.field23928.method16735() != 0) {
            if (!var1.method13921()) {
                this.field23928.method16736();
                if (this.field23923 != null) {
                    Class8711 var13 = new Class8711(
                            method16814(this.field23923.field33646, this.field23923.field33647), this.field23923.field33647, this.field23923.field33646, false
                    );
                    int var14 = field23386.field1339.field4902.field5443;
                    if (!this.method16004().method15978("ItemSpoof").equals("None")) {
                        this.field23928.method16734();
                    }

                    field23386.field1337.method23139(field23386.field1339, field23386.field1338, this.field23927, var13);
                    if (!this.method16004().method15974("NoSwing")) {
                        field23386.field1339.method2820(this.field23927);
                    } else {
                        field23386.getClientPlayNetHandler().sendPacket(new Class5511(this.field23927));
                    }

                    if (this.method16004().method15978("ItemSpoof").equals("Spoof") || this.method16004().method15978("ItemSpoof").equals("LiteSpoof")) {
                        field23386.field1339.field4902.field5443 = var14;
                    }
                }
            } else {
                this.field23925++;
                var1.method13908(true);
                this.field23927 = Class79.field182;
                if (Class5328.method16733(field23386.field1339.method3094(Class79.field183).method32107())
                        && (
                        field23386.field1339.method3094(this.field23927).method32105()
                                || !Class5328.method16733(field23386.field1339.method3094(this.field23927).method32107())
                )) {
                    this.field23927 = Class79.field183;
                }

                double var4 = var1.method13909();
                double var6 = var1.method13913();
                double var8 = var1.method13911();
                if (!field23386.field1339.field5037 && !field23386.field1299.field44636.field13071) {
                    double[] var10 = this.method16813();
                    var4 = var10[0];
                    var6 = var10[1];
                }

                if (field23386.field1339.method3433().field18049 < 0.0
                        && field23386.field1339.field5045 > 1.0F
                        && Class9217.method34567(0.0F, 90.0F, 3.0F).method31417() == Class2100.field13689) {
                    var8 += Math.min(field23386.field1339.method3433().field18049 * 2.0, 4.0);
                } else if (this.field23929 && this.method15974("Downwards")) {
                    var8--;
                } else if ((this.method15978("Speed Mode").equals("Jump") || this.method15978("Speed Mode").equals("Cubecraft"))
                        && !field23386.field1299.field44636.method8509()) {
                    var8 = this.field23931;
                }

                if (!Class9217.method34578(
                        new BlockPos(
                                field23386.field1339.method3431().method11320(),
                                field23386.field1339.method3431().method11321() - 1.0,
                                field23386.field1339.method3431().method11322()
                        )
                )) {
                    var4 = field23386.field1339.method3431().method11320();
                    var6 = field23386.field1339.method3431().method11322();
                }

                BlockPos var15 = new BlockPos(var4, var8 - 1.0, var6);
                if (!Class9217.method34578(var15) && this.field23928.method16739(this.field23927)) {
                    Class7843 var11 = Class9217.method34575(var15, !this.field23929 && this.method15974("Downwards"));
                    this.field23923 = var11;
                    if (var11 != null) {
                        float[] var12 = Class9217.method34542(this.field23923.field33646, this.field23923.field33647);
                        this.field23922 = var12[0];
                        this.field23921 = var12[1];
                        var1.method13918(this.field23922);
                        var1.method13916(this.field23921);
                    }
                } else {
                    if (this.method15974("KeepRotations") && this.field23921 != 999.0F) {
                        var1.method13918(this.field23922);
                        var1.method13916(this.field23921);
                    }

                    this.field23923 = null;
                }

                if (field23386.field1339.field5031 != var1.method13917() && field23386.field1339.field5032 != var1.method13915()) {
                    this.field23925 = 0;
                }
            }
        }
    }

    @EventTarget
    @HigherPriority
    public void method16809(Class4435 var1) {
        if (this.method15996() && this.field23928.method16735() != 0) {
            if (field23386.field1339.field5036 || Class5628.method17730(field23386.field1339, 0.01F)) {
                this.field23931 = field23386.field1339.getPosY();
            }

            if (this.method16004().method15974("No Sprint")) {
                field23386.field1339.method3098(false);
            }

            if (field23386.field1339.field5036) {
                this.field23926 = 0;
            } else if (this.field23926 >= 0) {
                this.field23926++;
            }

            if (this.field23928 == null) {
                this.field23928 = (Class5328) this.method16004();
            }

            String var4 = this.method15978("Speed Mode");
            switch (var4) {
                case "Jump":
                    if (field23386.field1339.field5036 && Class5628.method17686() && !field23386.field1339.method3331() && !this.field23929) {
                        this.field23930 = false;
                        field23386.field1339.method2914();
                        ((Class5341) Client.getInstance().getModuleManager().method14662(Class5341.class)).method16764();
                        this.field23930 = true;
                        var1.method13995(field23386.field1339.method3433().field18049);
                        var1.method13993(field23386.field1339.method3433().field18048);
                        var1.method13997(field23386.field1339.method3433().field18050);
                    }
                    break;
                case "AAC":
                    if (this.field23925 == 0 && field23386.field1339.field5036) {
                        Class9567.method37088(var1, Class9567.method37075() * 0.82);
                    }
                    break;
                case "Cubecraft":
                    double var6 = 0.2;
                    float var8 = this.method16816(Class9679.method37792(field23386.field1339.field5031));
                    if (field23386.field1299.field44636.method8509()) {
                        field23386.field1284.field40360 = 1.0F;
                    } else if (field23386.field1339.field5036) {
                        if (Class5628.method17686() && !field23386.field1339.method3331() && !this.field23929) {
                            var1.method13995(1.01);
                        }
                    } else if (this.field23926 == 1) {
                        if (var1.method13994() <= 0.9) {
                            this.field23926 = -1;
                        } else {
                            var1.method13995(0.122);
                            field23386.field1284.field40360 = 0.7F;
                            var6 = 2.4;
                        }
                    } else if (this.field23926 == 2) {
                        if (var1.method13994() > 0.05) {
                            this.field23926 = -1;
                        } else {
                            field23386.field1284.field40360 = 0.7F;
                            var6 = 0.28;
                        }
                    } else if (this.field23926 == 3) {
                        field23386.field1284.field40360 = 0.3F;
                        var6 = 2.4;
                    } else if (this.field23926 == 4) {
                        var6 = 0.28;
                        field23386.field1284.field40360 = 1.0F;
                    } else if (this.field23926 == 6) {
                        var1.method13995(-1.023456987345906);
                    }

                    if (!Class5628.method17686()) {
                        var6 = 0.0;
                    }

                    if (field23386.field1339.field5045 < 1.0F) {
                        Class9567.method37092(var1, var6, var8, var8, 360.0F);
                    }

                    Class5628.method17725(var1.method13994());
                    break;
                case "Slow":
                    if (field23386.field1339.field5036) {
                        var1.method13993(var1.method13992() * 0.75);
                        var1.method13997(var1.method13996() * 0.75);
                    } else {
                        var1.method13993(var1.method13992() * 0.93);
                        var1.method13997(var1.method13996() * 0.93);
                    }
                    break;
                case "Sneak":
                    if (field23386.field1339.field5036) {
                        var1.method13993(var1.method13992() * 0.65);
                        var1.method13997(var1.method13996() * 0.65);
                    } else {
                        var1.method13993(var1.method13992() * 0.85);
                        var1.method13997(var1.method13996() * 0.85);
                    }
            }

            this.field23928.method16741(var1);
        }
    }

    @EventTarget
    @LowerPriority
    public void method16810(Class4402 var1) {
        if (this.method15996() && field23386.field1339 != null) {
            if (var1.method13932() instanceof Class5539 && ((Class5328) this.method16004()).field23884 >= 0) {
                var1.method13900(true);
            }
        }
    }

    @EventTarget
    public void method16811(Class4436 var1) {
        if (this.method15996() && this.field23930) {
            if (this.method16004().method15978("Tower Mode").equalsIgnoreCase("Vanilla")
                    && (!Class5628.method17686() || this.method16004().method15974("Tower while moving"))) {
                var1.method13900(true);
            }
        }
    }

    @EventTarget
    public void method16812(Class4422 var1) {
        if (this.method15996() && this.method15978("Speed Mode").equals("Cubecraft") && this.field23926 >= 0) {
            if (!(field23386.field1339.field5045 > 1.2F)) {
                if (!(field23386.field1339.field4915 < this.field23931)) {
                    if (!field23386.field1339.field4981) {
                        field23386.field1339.field5028.field18049 = this.field23931;
                        field23386.field1339.field5049 = this.field23931;
                        field23386.field1339.field4915 = this.field23931;
                        field23386.field1339.field5026 = this.field23931;
                        if (Class9567.method37087()) {
                            field23386.field1339.field4909 = 0.099999994F;
                        }
                    }
                }
            }
        }
    }

    public double[] method16813() {
        double var3 = field23386.field1339.getPosX();
        double var5 = field23386.field1339.getPosZ();
        double var7 = field23386.field1339.field6131.field43908;
        double var9 = field23386.field1339.field6131.field43907;
        float var11 = field23386.field1339.field5031;
        BlockPos var12 = new BlockPos(var3, field23386.field1339.getPosY() - 1.0, var5);
        double var13 = var3;
        double var15 = var5;
        double var17 = 0.0;

        for (double var19 = this.method15977("Extend") * 2.0F;
             Class9217.method34578(var12);
             var12 = new BlockPos(var13, field23386.field1339.getPosY() - 1.0, var15)
        ) {
            if (++var17 > var19) {
                var17 = var19;
            }

            var13 = var3
                    + (var7 * 0.45 * Math.cos(Math.toRadians(var11 + 90.0F)) + var9 * 0.45 * Math.sin(Math.toRadians(var11 + 90.0F))) * var17;
            var15 = var5
                    + (var7 * 0.45 * Math.sin(Math.toRadians(var11 + 90.0F)) - var9 * 0.45 * Math.cos(Math.toRadians(var11 + 90.0F))) * var17;
            if (var17 == var19) {
                break;
            }
        }

        return new double[]{var13, var15};
    }

    public float method16816(float var1) {
        float var4 = 0.0F;
        float var5 = field23386.field1339.field4982;
        float var6 = field23386.field1339.field4984;
        if (!(var5 > 0.0F)) {
            if (var5 < 0.0F) {
                if (!(var6 > 0.0F)) {
                    if (!(var6 < 0.0F)) {
                        var1 += 90.0F;
                    } else {
                        var1 -= 45.0F;
                    }
                } else {
                    var1 += 45.0F;
                }
            }
        } else if (!(var6 > 0.0F)) {
            if (!(var6 < 0.0F)) {
                var1 -= 90.0F;
            } else {
                var1 += 45.0F;
            }
        } else {
            var1 -= 45.0F;
        }

        if (var1 >= 45.0F && var1 <= 135.0F) {
            var4 = 90.0F;
        } else if (var1 >= 135.0F || var1 <= -135.0F) {
            var4 = 180.0F;
        } else if (var1 <= -45.0F && var1 >= -135.0F) {
            var4 = -90.0F;
        } else if (var1 >= -45.0F && var1 <= 45.0F) {
            var4 = 0.0F;
        }

        if (var6 < 0.0F) {
            var4 -= 180.0F;
        }

        return var4 + 90.0F;
    }
}
