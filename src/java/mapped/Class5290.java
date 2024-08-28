package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4428;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.Class8005;
import com.mentalfrostbyte.jello.util.timer.Timer;

public class Class5290 extends Module {
    public static boolean field23798;
    public boolean field23799 = false;
    public boolean field23800 = false;
    private final Timer field23796 = new Timer();
    private boolean field23797;

    public Class5290() {
        super(ModuleCategory.ITEM, "AutoArmor", "Automaticly equips your armor");
        this.method15972(new Class6004("Fake Items", "Bypass for fake items (AAC).", false));
        this.method15972(new Class6009<Float>("Delay", "Inventory clicks delay", 0.3F, Float.class, 0.0F, 1.0F, 0.01F));
        this.method15972(new Class6005("Mode", "The way it will move armor in your inventory", 0, "Basic", "OpenInv", "FakeInv"));
        this.method15972(new Class6005("Elytra", "Elytra Equip Mode", 0, "Ignore", "Equip", "On Use"));
    }

    @Override
    public void method15966() {
        if (!this.field23796.method27123()) {
            this.field23796.method27118();
        }

        this.field23797 = field23386.field1355 instanceof Class859;
        field23798 = false;
    }

    @Override
    public void method15965() {
        field23798 = false;
    }

    @EventTarget
    @HigherPriority
    public void method16615(Class4428 var1) {
        if (this.method15996()) {
            if (!this.field23796.method27123()) {
                this.field23796.method27118();
            }

            if (!this.method15978("Mode").equals("OpenInv") || field23386.field1355 instanceof Class859) {
                long var4 = (long) (this.method15977("Delay") * 1000.0F);
                String var6 = this.method15978("Elytra");
                switch (var6) {
                    case "Ignore":
                        this.field23799 = false;
                        break;
                    case "Equip":
                        this.field23799 = true;
                        break;
                    case "On Use":
                        if (!field23386.field1339.field5036 && field23386.field1339.field4999 == 0 && field23386.field1339.field4981 && !this.field23800) {
                            this.field23799 = true;
                        } else if (field23386.field1339.field5036) {
                            this.field23799 = false;
                        }
                }

                this.field23800 = field23386.field1339.field4981;
                if (field23386.field1355 instanceof Class859) {
                    this.field23797 = false;
                }

                if ((field23386.field1355 == null || field23386.field1355 instanceof Class859 || field23386.field1355 instanceof Class1331)
                        && this.field23796.method27121() > var4
                        && (float) Client.getInstance().method19939().method31333() > (float) var4 / 50.0F) {
                    field23798 = false;
                    this.method16616(this.method15978("Mode").equalsIgnoreCase("FakeInv"));
                }

                for (Class2106 var9 : Class2106.values()) {
                    if (field23386.field1339.field4904.method18131(8 - var9.method8773()).method18266()) {
                        if (Class7789.method25847(8 - var9.method8773())) {
                            return;
                        }
                    } else if (this.method16618(var9)) {
                        return;
                    }
                }

                if (!this.field23797 && !(field23386.field1355 instanceof Class859) && this.field23796.method27121() > 0L) {
                    this.field23797 = true;
                    field23386.getClientPlayNetHandler().sendPacket(new Class5482(-1));
                }
            }
        }
    }

    private void method16616(boolean var1) {
        for (Class2106 var7 : Class2106.values()) {
            if (field23386.field1339.field4904.method18131(8 - var7.method8773()).method18266()) {
                Class8848 var8 = field23386.field1339.field4904.method18131(8 - var7.method8773()).method18265();
                if (Class7789.method25872(var8) && (!this.field23799 || var7 != Class2106.field13735)) {
                    continue;
                }
            }

            for (int var12 = 9; var12 < 45; var12++) {
                if (field23386.field1339.field4904.method18131(var12).method18266()) {
                    Class8848 var9 = field23386.field1339.field4904.method18131(var12).method18265();
                    if (var9.method32107() instanceof Class3256
                            && this.field23799
                            && !(field23386.field1339.field4902.method3618(36 + Class2106.field13735.method8773()).method32107() instanceof Class3256)) {
                        Class3256 var13 = (Class3256) var9.method32107();
                        if (Class2106.field13735 == var7
                                && (
                                !Client.getInstance().getModuleManager().method14662(Class5290.class).method15974("Fake Items")
                                        || Client.getInstance().method19940().method33238(var12) >= 1500L
                        )) {
                            this.method16617(var1);
                            if (!(field23386.field1339.field4902.method3618(36 + var7.method8773()).method32107() instanceof Class3280)) {
                                Class7789.method25826(8 - var7.method8773(), 0, true);
                            }

                            Class7789.method25870(field23386.field1339.field4904.field25471, var12, 0, Class2259.field14695, field23386.field1339, true);
                            this.field23796.method27120();
                            field23798 = true;
                            if (this.method15978("Elytra").equals("On Use")) {
                                field23386.getClientPlayNetHandler().sendPacket(new Class5583(field23386.field1339, Class1865.field10048));
                                field23386.field1339.method3349(7, true);
                            }

                            if (Client.getInstance().getModuleManager().method14662(Class5290.class).method15977("Delay") > 0.0F) {
                                return;
                            }
                        }
                    } else if (var9.method32107() instanceof Class3279 && !this.field23799) {
                        Class3279 var10 = (Class3279) var9.method32107();
                        if (var10.method11805() == var7
                                && Class7789.method25872(var9)
                                && Class7789.method25850(var9) > 0
                                && (
                                !Client.getInstance().getModuleManager().method14662(Class5290.class).method15974("Fake Items")
                                        || Client.getInstance().method19940().method33238(var12) >= 1500L
                        )) {
                            this.method16617(var1);
                            Class3257 var11 = field23386.field1339.field4902.method3618(36 + var10.method11805().method8773()).method32107();
                            if (!(var11 instanceof Class3256)) {
                                if (!(var11 instanceof Class3280)) {
                                    Class7789.method25871(8 - var10.method11805().method8773());
                                }
                            } else {
                                Class7789.method25826(8 - var7.method8773(), 0, true);
                            }

                            Class7789.method25870(field23386.field1339.field4904.field25471, var12, 0, Class2259.field14695, field23386.field1339, true);
                            this.field23796.method27120();
                            field23798 = true;
                            if (Client.getInstance().getModuleManager().method14662(Class5290.class).method15977("Delay") > 0.0F) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    private void method16617(boolean var1) {
        if (var1 && this.field23797 && !(field23386.field1355 instanceof Class859) && Class8005.method27349() <= Class5989.field26136.method18582()) {
            field23386.getClientPlayNetHandler().sendPacket(new Class5564(Class2175.field14279));
            this.field23797 = false;
        }
    }

    private boolean method16618(Class2106 var1) {
        for (int var4 = 9; var4 < 45; var4++) {
            if (field23386.field1339.field4904.method18131(var4).method18266()) {
                Class8848 var5 = field23386.field1339.field4904.method18131(var4).method18265();
                Class3257 var6 = var5.method32107();
                if (var6 instanceof Class3279) {
                    Class3279 var7 = (Class3279) var6;
                    if (var1 == var7.method11805()) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
