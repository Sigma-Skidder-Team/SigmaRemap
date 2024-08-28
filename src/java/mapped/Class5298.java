package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mojang.authlib.GameProfile;

public class Class5298 extends Module {
    public static PlayerEntity field23814;
    public float field23824;
    public float field23825;
    public boolean field23826;
    public boolean field23827;
    public boolean field23828;
    public boolean field23829;
    public boolean field23830;
    public boolean field23831;
    private double field23815;
    private double field23816;
    private double field23817;
    private double field23818;
    private double field23819;
    private double field23820;
    private float field23821;
    private float field23822;
    private int field23823;

    public Class5298() {
        super(ModuleCategory.RENDER, "Freecam", "Move client side but not server side");
        this.method15972(new Class6009<Float>("Speed", "Speed value", 4.0F, Float.class, 1.0F, 10.0F, 0.1F));
    }

    @EventTarget
    public void method16639(Class4410 var1) {
        if (this.method15996()) {
            if (var1.method13953() instanceof ClientPlayerEntity && var1.method13953() != field23814) {
                var1.method13900(true);
            }
        }
    }

    @EventTarget
    public void method16640(Class4422 var1) {
        if (this.method15996()) {
            if (field23814 == null) {
                this.isInDevelopment();
            }

            mc.field1339.field6123 = mc.field1339.field5032;
            Class6488 var4 = mc.field1339.field5035;
            field23814.method3215((var4.field28449 + var4.field28452) / 2.0, var4.field28450, (var4.field28451 + var4.field28454) / 2.0);
            double var5 = this.field23818 + (this.field23815 - this.field23818) * (double) var1.field21554;
            double var7 = this.field23819 + (this.field23816 - this.field23819) * (double) var1.field21554;
            double var9 = this.field23820 + (this.field23817 - this.field23820) * (double) var1.field21554;
            mc.field1339.field5028.field18048 = var5;
            mc.field1339.field5048 = var5;
            mc.field1339.field4914 = var5;
            mc.field1339.field5025 = var5;
            mc.field1339.field5028.field18049 = var7;
            mc.field1339.field5049 = var7;
            mc.field1339.field4915 = var7;
            mc.field1339.field5026 = var7;
            mc.field1339.field5028.field18050 = var9;
            mc.field1339.field5050 = var9;
            mc.field1339.field4916 = var9;
            mc.field1339.field5027 = var9;
            if (Class9567.method37087()) {
                mc.field1339.field4909 = 0.099999994F;
            }
        }
    }

    @EventTarget
    public void method16641(Class4420 var1) {
        if (this.method15996()) {
            field23814.method3239();
            field23814.field5035 = new Class6488(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public void isInDevelopment() {
        this.field23815 = mc.field1339.getPosX();
        this.field23816 = mc.field1339.getPosY();
        this.field23817 = mc.field1339.getPosZ();
        this.field23821 = mc.field1339.field5031;
        this.field23822 = mc.field1339.field5032;
        String var3 = mc.field1339.method2941().getString();
        GameProfile var4 = new GameProfile(mc.field1339.method2906().getId(), var3);
        field23814 = new Class1116(mc.field1338, var4);
        field23814.field4902 = mc.field1339.field4902;
        field23814.method3269(this.field23815, this.field23816, this.field23817, this.field23821, this.field23822);
        field23814.field5052 = true;
        field23814.field5053 = mc.field1339.field5053;
        field23814.field4967 = this.field23821;
        field23814.field4968 = this.field23821;
        field23814.field4965 = this.field23821;
        field23814.field4966 = this.field23821;
        mc.field1338.method6846(this.field23823 = (int) (Math.random() * -10000.0), field23814);
        this.field23826 = mc.field1299.field44632.method8509();
        this.field23827 = mc.field1299.field44634.method8509();
        this.field23828 = mc.field1299.field44633.method8509();
        this.field23829 = mc.field1299.field44635.method8509();
        this.field23825 = this.field23826 != this.field23827 ? (float) (!this.field23826 ? -1 : 1) : 0.0F;
        this.field23824 = this.field23828 != this.field23829 ? (float) (!this.field23828 ? -1 : 1) : 0.0F;
        this.field23830 = mc.field1299.field44636.method8509();
        this.field23831 = mc.field1299.field44637.method8509();
        mc.field1299.field44632.field13071 = false;
        mc.field1299.field44634.field13071 = false;
        mc.field1299.field44633.field13071 = false;
        mc.field1299.field44635.field13071 = false;
        mc.field1299.field44636.field13071 = false;
        mc.field1299.field44637.field13071 = false;
    }

    @Override
    public void method15965() {
        mc.field1299.field44632.field13071 = this.field23826;
        mc.field1299.field44634.field13071 = this.field23827;
        mc.field1299.field44633.field13071 = this.field23828;
        mc.field1299.field44635.field13071 = this.field23829;
        mc.field1299.field44636.field13071 = this.field23830;
        mc.field1299.field44637.field13071 = this.field23831;
        mc.field1338.method6848(this.field23823);
        mc.field1339.method3239();
        if (field23814 != null) {
            mc.field1339.field5053 = field23814.field5053;
        }

        field23814 = null;
    }

    @EventTarget
    private void method16642(Class4425 var1) {
        if (this.method15996()) {
            var1.method13900(true);
        }
    }

    @EventTarget
    private void method16643(Class4430 var1) {
        if (this.method15996()) {
            if (var1.method13977() != mc.field1299.field44637.field13070.field34875) {
                if (var1.method13977() != mc.field1299.field44636.field13070.field34875) {
                    if (var1.method13977() != mc.field1299.field44632.field13070.field34875) {
                        if (var1.method13977() != mc.field1299.field44634.field13070.field34875) {
                            if (var1.method13977() != mc.field1299.field44633.field13070.field34875) {
                                if (var1.method13977() == mc.field1299.field44635.field13070.field34875) {
                                    var1.method13900(true);
                                    this.field23829 = true;
                                }
                            } else {
                                var1.method13900(true);
                                this.field23828 = true;
                            }
                        } else {
                            var1.method13900(true);
                            this.field23827 = true;
                        }
                    } else {
                        var1.method13900(true);
                        this.field23826 = true;
                    }
                } else {
                    var1.method13900(true);
                    this.field23830 = true;
                }
            } else {
                var1.method13900(true);
                this.field23831 = true;
            }

            this.field23825 = this.field23826 != this.field23827 ? (float) (!this.field23826 ? -1 : 1) : 0.0F;
            this.field23824 = this.field23828 != this.field23829 ? (float) (!this.field23828 ? -1 : 1) : 0.0F;
        }
    }

    @EventTarget
    private void method16644(Class4426 var1) {
        if (this.method15996()) {
            if (var1.method13973() != mc.field1299.field44637.field13070.field34875) {
                if (var1.method13973() != mc.field1299.field44636.field13070.field34875) {
                    if (var1.method13973() != mc.field1299.field44632.field13070.field34875) {
                        if (var1.method13973() != mc.field1299.field44634.field13070.field34875) {
                            if (var1.method13973() != mc.field1299.field44633.field13070.field34875) {
                                if (var1.method13973() == mc.field1299.field44635.field13070.field34875) {
                                    var1.method13900(true);
                                    this.field23829 = false;
                                }
                            } else {
                                var1.method13900(true);
                                this.field23828 = false;
                            }
                        } else {
                            var1.method13900(true);
                            this.field23827 = false;
                        }
                    } else {
                        var1.method13900(true);
                        this.field23826 = false;
                    }
                } else {
                    var1.method13900(true);
                    this.field23830 = false;
                }
            } else {
                var1.method13900(true);
                this.field23831 = false;
            }

            this.field23825 = this.field23826 != this.field23827 ? (float) (!this.field23826 ? -1 : 1) : 0.0F;
            this.field23824 = this.field23828 != this.field23829 ? (float) (!this.field23828 ? -1 : 1) : 0.0F;
        }
    }

    @EventTarget
    public void method16645(Class4436 var1) {
        if (this.method15996()) {
            var1.method13900(true);
        }
    }

    @EventTarget
    public void method16646(Class4399 var1) {
        if (this.method15996() && var1.method13921()) {
            var1.method13918(this.field23821 % 360.0F);
            var1.method13916(this.field23822);
            mc.field1339.field6122 = this.field23821;
            mc.field1339.field6123 = this.field23822;
            float[] var4 = Class9567.method37084(this.field23825, this.field23824);
            float var5 = var4[1];
            float var6 = var4[2];
            float var7 = var4[0];
            double var8 = Math.cos(Math.toRadians(var7));
            double var10 = Math.sin(Math.toRadians(var7));
            double var12 = this.method15977("Speed") / 2.0F;
            this.field23818 = this.field23815;
            this.field23820 = this.field23817;
            this.field23819 = this.field23816;
            this.field23815 += ((double) var5 * var8 + (double) var6 * var10) * var12;
            this.field23817 += ((double) var5 * var10 - (double) var6 * var8) * var12;
            if (this.field23830) {
                this.field23816 += var12;
            }

            if (this.field23831) {
                this.field23816 -= var12;
            }
        }
    }

    @EventTarget
    private void method16647(Class4396 var1) {
        if (this.method15996()) {
            if (mc.field1339 != null) {
                if (var1.method13898() instanceof Class5473) {
                    Class5473 var4 = (Class5473) var1.method13898();
                    this.field23821 = var4.field24300;
                    this.field23822 = var4.field24301;
                    var4.field24300 = mc.field1339.field5031;
                    var4.field24301 = mc.field1339.field5032;
                    double var5 = var4.field24297;
                    double var7 = var4.field24298;
                    double var9 = var4.field24299;
                    float var11 = PlayerEntity.field4893.field39968;
                    float var12 = PlayerEntity.field4893.field39969;
                    mc.field1339
                            .method3391(new Class6488(var5 - (double) var11, var7, var9 - (double) var11, var5 + (double) var11, var7 + (double) var12, var9 + (double) var11));
                    var1.method13900(true);
                    field23814.method3435(0.0, 0.0, 0.0);
                }
            }
        }
    }

    @EventTarget
    private void method16648(Class4402 var1) {
        if (this.method15996()) {
            if (var1.method13932() instanceof Class5511) {
                field23814.method2820(Class79.field182);
            }

            if (var1.method13932() instanceof Class5505) {
                Class5505 var4 = (Class5505) var1.method13932();
                if (var4.method17315(mc.field1338) == null) {
                    var1.method13900(true);
                }
            }
        }
    }

    @EventTarget
    private void method16649(Class4427 var1) {
        if (this.method15996()) {
            var1.method13900(true);
        }
    }

    @EventTarget
    private void method16650(Class4418 var1) {
        if (this.method15996()) {
            this.setState(false);
        }
    }
}
