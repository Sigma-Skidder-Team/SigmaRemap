package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;
import com.mentalfrostbyte.jello.unmapped.Class8005;

import java.util.Iterator;
import java.util.stream.Stream;

public class Class5258 extends PremiumModule {
    private static int field23649;
    private int field23647;
    private int field23648;
    private BlockPos field23650;

    public Class5258() {
        super("AutoMLG", "Automatically places water when falling", ModuleCategory.ITEM);
        this.method15972(new Class6004("Cubecraft", "Cubecraft bypass", true));
        field23649 = -1;
    }

    public static boolean method16421() {
        return field23649 >= 0;
    }

    @Override
    public void method15966() {
        field23649 = -1;
    }

    @Override
    public void method15965() {
        field23649 = -1;
    }

    @EventTarget
    private void method16422(Class4435 var1) {
        if (this.method15996()) {
            if (field23649 > 0 && !field23386.field1339.field5036) {
                Class9567.method37088(var1, 0.0);
            }
        }
    }

    @EventTarget
    @LowerPriority
    private void method16423(Class4399 var1) {
        if (this.method15996() && field23386.field1337.method23150()) {
            if (var1.method13921() && field23649 >= 0) {
                field23649++;
                float[] var4 = Class9142.method34144(
                        (double) this.field23650.method8304() + 0.5, (double) this.field23650.method8306() + 0.5, (double) this.field23650.getY() + 0.5
                );
                var1.method13918(var4[0]);
                var1.method13916(var4[1]);
            }

            if (field23649 == (!this.method15974("Cubecraft") ? 3 : 5)) {
                if (field23386.field1339.field4902.field5443 != this.field23647) {
                    this.field23648 = field23386.field1339.field4902.field5443;
                    field23386.field1339.field4902.field5443 = this.field23647;
                    field23386.field1337.method23138();
                }

                field23386.getClientPlayNetHandler().sendPacket(new Class5511(Class79.field182));
                field23386.getClientPlayNetHandler().sendPacket(new Class5555(Class79.field182));
                field23649 = -1;
                this.field23650 = null;
                field23386.field1339.field4902.field5443 = this.field23648;
            }

            int var7 = this.method16424();
            if (!Client.getInstance().getModuleManager().method14662(Class5333.class).method15996()
                    && var7 != -1
                    && !field23386.field1339.field5036
                    && field23386.field1339.field5045 > 3.0F) {
                BlockPos var5 = this.method16425();
                if (var5 != null) {
                    if (var1.method13921() && field23649 == -1) {
                        float[] var6 = Class9142.method34144((double) var5.method8304() + 0.5, (double) var5.method8306() + 0.5, (double) var5.getY() + 0.5);
                        var1.method13918(var6[0]);
                        var1.method13916(var6[1]);
                        if (var7 != field23386.field1339.field4902.field5443) {
                            this.field23648 = field23386.field1339.field4902.field5443;
                            field23386.field1339.field4902.field5443 = var7;
                            field23386.field1337.method23138();
                        }

                        this.field23647 = var7;
                        this.field23650 = var5;
                        field23649 = 0;
                        return;
                    }

                    if (this.field23650 != null) {
                        field23386.getClientPlayNetHandler().sendPacket(new Class5511(Class79.field182));
                        field23386.getClientPlayNetHandler().sendPacket(new Class5555(Class79.field182));
                    }
                }
            }
        }
    }

    public int method16424() {
        for (int var3 = 36; var3 < 45; var3++) {
            if (field23386.field1339.field4904.method18131(var3).method18266()) {
                Class8848 var4 = field23386.field1339.field4904.method18131(var3).method18265();
                if (var4.method32107() == Class8514.field37883) {
                    return var3 - 36;
                }
            }
        }

        if (Client.getInstance().method19939().method31333() > 1) {
            for (int var5 = 9; var5 < 36; var5++) {
                if (field23386.field1339.field4904.method18131(var5).method18266()) {
                    Class8848 var6 = field23386.field1339.field4904.method18131(var5).method18265();
                    if (var6.method32107() == Class8514.field37883) {
                        if (Class8005.method27349() <= Class5989.field26136.method18582()) {
                            field23386.getClientPlayNetHandler().sendPacket(new Class5564(Class2175.field14279));
                        }

                        Class7789.method25873(var5, 6);
                        field23386.getClientPlayNetHandler().sendPacket(new Class5482(-1));
                        return 6;
                    }
                }
            }

            return -1;
        } else {
            return -1;
        }
    }

    private BlockPos method16425() {
        double var3 = field23386.field1339.method3433().field18048;
        double var5 = field23386.field1339.method3433().field18049;
        double var7 = field23386.field1339.method3433().field18050;
        Class6488 var9 = field23386.field1339.field5035.method19662(var3, 0.0, var7).method19667(0.0, var5, 0.0);
        Stream var10 = field23386.field1338.method7055(field23386.field1339, var9);
        Iterator var11 = var10.iterator();
        BlockPos var12 = null;

        while (var11.hasNext()) {
            Class6408 var13 = (Class6408) var11.next();
            Class6488 var14 = var13.method19514();
            BlockPos var15 = new BlockPos(var14.method19685());
            if (Class9217.method34578(var15)
                    && (double) (var15.getY() + 1) < field23386.field1339.getPosY()
                    && (
                    var12 == null
                            || field23386.field1339
                            .method3276((double) var12.method8304() + 0.5 - var3, var12.getY() + 1, (double) var12.method8306() + 0.5 - var7)
                            > field23386.field1339
                            .method3276((double) var15.method8304() + 0.5 - var3, var15.getY() + 1, (double) var15.method8306() + 0.5 - var7)
            )) {
                var12 = var15;
            }
        }

        if (var12 != null) {
            return var12;
        } else {
            var5 = field23386.field1339.method3433().field18049 - 1.0;
            var9 = field23386.field1339.field5035.method19662(var3, 0.0, var7).method19667(0.0, var5, 0.0);
            var10 = field23386.field1338.method7055(field23386.field1339, var9);
            var11 = var10.iterator();

            while (var11.hasNext()) {
                Class6408 var20 = (Class6408) var11.next();
                Class6488 var21 = var20.method19514();
                BlockPos var22 = new BlockPos(var21.method19685());
                if (Class9217.method34578(var22)
                        && (double) (var22.getY() + 1) < field23386.field1339.getPosY()
                        && (
                        var12 == null
                                || field23386.field1339
                                .method3276((double) var12.method8304() + 0.5 - var3, var12.getY() + 1, (double) var12.method8306() + 0.5 - var7)
                                > field23386.field1339
                                .method3276((double) var22.method8304() + 0.5 - var3, var22.getY() + 1, (double) var22.method8306() + 0.5 - var7)
                )) {
                    var12 = var22;
                }
            }

            return var12;
        }
    }
}
