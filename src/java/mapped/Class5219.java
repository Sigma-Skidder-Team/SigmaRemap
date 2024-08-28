package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4434;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.impl.Class4436;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5219 extends Module {
    private int field23552;
    private int field23553;
    private int field23554;
    private double field23555;

    public Class5219() {
        super(ModuleCategory.MOVEMENT, "Mineplex", "Speed for Mineplex");
        this.method15972(new Class6004("AutoJump", "Automatically jumps for you.", true));
        this.method15972(new Class6004("OnGround", "OnGround Speed.", true));
        this.method15972(new Class6009<Float>("OnGround Speed", "OnGround value.", 0.8F, Float.class, 0.3F, 1.5F, 0.01F));
    }

    @Override
    public void method15965() {
        Class9567.method37090(Class9567.method37075() * 0.7);
        if (field23386.field1339.field4902.field5443 != this.field23554) {
            field23386.getClientPlayNetHandler().sendPacket(new Class5539(field23386.field1339.field4902.field5443));
            this.field23554 = field23386.field1339.field4902.field5443;
        }
    }

    @Override
    public void method15966() {
        this.field23553 = 0;
        this.field23552 = 0;
        this.field23554 = -1;
        this.field23555 = this.method15977("OnGround Speed") / 4.0F;
    }

    @EventTarget
    @HigherPriority
    public void method16250(Class4435 var1) {
        if (this.method15996()
                && !Client.getInstance().getModuleManager().method14662(Class5328.class).method15996()
                && !Class5628.method17684(field23386.field1339)) {
            double var4 = this.method15977("OnGround Speed");
            if (!field23386.field1339.field5036) {
                if (field23386.field1339.field5037) {
                    this.field23555 = 0.35;
                    this.field23553 = 1;
                }

                if (!Class5628.method17686()) {
                    this.field23555 = 0.3;
                }

                this.field23555 -= 0.01;
                if (this.field23555 < 0.3) {
                    this.field23555 = 0.3;
                }

                Class9567.method37088(var1, this.field23555);
            } else {
                if (this.field23552 > 1) {
                    this.field23553 = 0;
                } else {
                    this.field23552++;
                }

                if (this.method15974("AutoJump") && Class5628.method17686()) {
                    field23386.field1339.method2914();
                    var1.method13995(field23386.field1339.method3433().field18049);
                }

                if (var1.method13994() == 0.4199998) {
                    Class9567.method37088(var1, 0.0);
                    return;
                }

                if (!this.method15974("OnGround")) {
                    return;
                }

                int var6 = this.method16254();
                if (var6 == -1) {
                    Class9567.method37088(var1, 0.2);
                    return;
                }

                Vector3d var7 = new Vector3d(0.475 + Math.random() * 0.05, 1.0, 0.475 + Math.random() * 0.05);
                BlockPos var8 = new BlockPos(field23386.field1339.method3432()).method8336(0, -1, 0);
                Class8711 var9 = new Class8711(var7, Direction.field673, var8, false);
                Class5570 var10 = new Class5570(Class79.field182, var9);
                field23386.getClientPlayNetHandler().sendPacket(var10);
                this.field23555 += var4 / 4.0;
                if (field23386.field1339.field5037) {
                    this.field23555 /= 2.0;
                }

                if (this.field23555 > var4) {
                    this.field23555 = var4;
                }

                if (this.field23555 < 0.3) {
                    this.field23555 = 0.3;
                }

                Class9567.method37088(var1, this.field23555);
            }
        }
    }

    @EventTarget
    public void method16251(Class4436 var1) {
        if (this.method15996()) {
            this.field23555 = 0.81 + (double) this.field23553 * 0.095;
            if (field23386.field1339.getPosY() != (double) ((int) field23386.field1339.getPosY())) {
                this.field23555 = 0.52;
                this.field23553 = 1;
            }

            this.field23552 = 0;
            if (this.field23553 < 2) {
                this.field23553++;
            }

            var1.method14003(0.0);
            var1.method14002(0.4199998);
            if (field23386.field1339.field4902.field5443 != this.field23554) {
                field23386.getClientPlayNetHandler().sendPacket(new Class5539(field23386.field1339.field4902.field5443));
                this.field23554 = field23386.field1339.field4902.field5443;
            }
        }
    }

    @EventTarget
    public void method16252(Class4396 var1) {
        if (this.method15996() && field23386.field1339 != null) {
            if (var1.method13898() instanceof Class5473) {
                this.field23553 = 0;
                this.field23555 = 0.0;
            }
        }
    }

    @EventTarget
    public void method16253(Class4434 var1) {
        if (this.method15996() && field23386.field1339 != null) {
            if (var1.method13988() > 0.2) {
                this.field23555 = this.field23555 - (double) (this.method15977("OnGround Speed") / 4.0F);
            }
        }
    }

    private int method16254() {
        if (field23386.field1339.method3090().method32105()) {
            this.field23554 = field23386.field1339.field4902.field5443;
            return this.field23554;
        } else {
            for (int var3 = 36; var3 < 45; var3++) {
                int var4 = var3 - 36;
                if (field23386.field1339.field4904.method18131(var3).method18265().method32105()) {
                    if (field23386.field1339.field4902.field5443 != var4 && this.field23554 != var4) {
                        field23386.getClientPlayNetHandler().sendPacket(new Class5539(var4));
                        this.field23554 = var4;
                    }

                    return var4;
                }
            }

            Class7789.method25870(field23386.field1339.field4904.field25471, 42, 0, Class2259.field14695, field23386.field1339, true);
            if (field23386.field1339.field4904.method18131(42).method18265().method32105()
                    && field23386.field1339.field4902.field5443 != 6
                    && this.field23554 != 6) {
                field23386.getClientPlayNetHandler().sendPacket(new Class5539(6));
                this.field23554 = 6;
                return 6;
            } else {
                return -1;
            }
        }
    }
}
