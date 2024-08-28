package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;
import com.mentalfrostbyte.jello.notification.Notification;

public class Class5262 extends PremiumModule {
    private int field23668;
    private int field23669;
    private int field23670;
    private double field23671;
    private double field23672;
    private double field23673;
    private boolean field23674;
    private boolean field23675;

    public Class5262() {
        super("Mineplex", "Mineplex fly/longjump", ModuleCategory.MOVEMENT);
        this.method15972(new Class6009<Float>("Boost", "Boost value", 4.0F, Float.class, 1.0F, 8.0F, 0.01F));
        this.method15972(new Class6004("Fake", "Simulate a real fly", false));
    }

    @Override
    public void method15966() {
        this.field23668 = -1;
        this.field23671 = Class9567.method37075();
        this.field23669 = 0;
        this.field23675 = false;
        this.field23670 = -1;
        this.field23673 = -1.0;
        this.method16461();
    }

    @Override
    public void method15965() {
        double var3 = Class9567.method37075() * 0.5;
        Class9567.method37090(var3);
        if (this.field23670 != -1) {
            field23386.getClientPlayNetHandler().sendPacket(new Class5539(field23386.field1339.field4902.field5443));
            this.field23670 = field23386.field1339.field4902.field5443;
        }

        field23386.field1284.field40360 = 1.0F;
    }

    @EventTarget
    public void method16454(Class4399 var1) {
        if (this.method15996() && var1.method13921()) {
            var1.method13908(true);
        }
    }

    @EventTarget
    public void method16455(Class4418 var1) {
        if (this.method15996()) {
            this.field23673 = this.field23668 = this.field23670 = -1;
            this.field23669 = 0;
            this.field23675 = false;
            this.field23671 = Class9567.method37075();
        }
    }

    public boolean method16456() {
        return this.method15996()
                && this.field23670 != -1
                && this.field23671 < (double) this.method15977("Boost")
                && (field23386.field1339.field5036 || Class5628.method17730(field23386.field1339, 0.001F))
                && !this.field23675;
    }

    @EventTarget
    public void method16457(Class4417 var1) {
        if (this.method15996() && this.field23675 && field23386.field1339 != null) {
            if (field23386.field1339.field5036) {
                var1.method13966(true);
            }
        }
    }

    @EventTarget
    public void method16458(Class4435 var1) {
        if (this.method15996()) {
            if (this.field23675) {
                Class9567.method37088(var1, 0.01);
            } else {
                float var4 = field23386.field1339.field5031 + 90.0F;
                if (!field23386.field1339.field5036 && !Class5628.method17730(field23386.field1339, 0.001F)) {
                    if (this.field23668 != -1) {
                        if (this.field23674 && !Class5628.method17686()) {
                            this.field23674 = !this.field23674;
                            this.field23671 = 0.5;
                        }

                        this.field23669++;
                        this.field23671 *= 0.98;
                        this.field23672 -= 0.04000000000001;
                        if (this.field23669 <= 22) {
                            if (this.field23669 == 10 && this.field23674) {
                                this.field23672 = -0.005;
                            }
                        } else {
                            this.field23672 -= 0.02;
                        }

                        if (this.field23669 > 6 && !Class5628.method17686()) {
                            this.field23672 -= 0.05;
                        }

                        var1.method13995(this.field23672);
                        if (field23386.field1339.field5037 || !Class5628.method17686()) {
                            this.field23671 = 0.35;
                        }

                        Class9567.method37088(var1, this.field23671);
                    }
                } else {
                    if (this.field23669 > 0) {
                        Class9567.method37088(var1, 0.0);
                        this.method16004().method16000();
                        return;
                    }

                    if (this.field23668 == -1) {
                        this.field23668 = 0;
                        this.field23671 = 0.35;
                        return;
                    }

                    this.field23668++;
                    int var5 = this.method16461();
                    if (var5 == -1) {
                        return;
                    }

                    Vector3d var6 = new Vector3d(0.475 + Math.random() * 0.05, 1.0, 0.475 + Math.random() * 0.05);
                    BlockPos var7 = new BlockPos(field23386.field1339.method3432()).method8336(0, -1, 0);
                    Class8711 var8 = new Class8711(var6, Direction.field673, var7, false);
                    Class5570 var9 = new Class5570(Class79.field182, var8);
                    field23386.getClientPlayNetHandler().sendPacket(var9);
                    if (!(this.field23671 < (double) this.method15977("Boost"))) {
                        Class9567.method37088(var1, 0.0);
                        field23386.field1339.method2914();
                        this.field23672 = 0.4299999;
                        this.field23669 = 0;
                        this.field23674 = Class5628.method17686();
                        var1.method13995(this.field23672);
                        this.field23673 = field23386.field1339.getPosY();
                        this.field23668++;
                        this.field23671 += 0.5;
                    } else {
                        field23386.field1284.field40360 = Math.min(1.0F, Math.max(0.1F, (float) (1.2 - this.field23671 * 0.15)));
                        if (this.field23668 > 2) {
                            this.field23671 += 0.05;
                        }

                        if (this.field23668 % 2 != 0) {
                            var1.method13993(Math.cos(Math.toRadians(var4)) * this.field23671);
                            var1.method13997(Math.sin(Math.toRadians(var4)) * this.field23671);
                        } else {
                            var1.method13993(Math.cos(Math.toRadians(var4 + 180.0F)) * this.field23671);
                            var1.method13997(Math.sin(Math.toRadians(var4 + 180.0F)) * this.field23671);
                        }
                    }
                }
            }
        }
    }

    @EventTarget
    public void method16459(Class4396 var1) {
        if (this.method15996()) {
            if (var1.method13898() instanceof Class5473) {
                this.field23675 = true;
                Client.getInstance().getNotificationManager().post(new Notification("Mineplex fly", "Please try again"));
            }
        }
    }

    @EventTarget
    public void method16460(Class4402 var1) {
        if (this.method15996()) {
            if (var1.method13932() instanceof Class5539
                    && this.field23670 != -1
                    && this.field23671 < (double) this.method15977("Boost")
                    && (field23386.field1339.field5036 || Class5628.method17730(field23386.field1339, 0.001F))
                    && !this.field23675) {
                var1.method13900(true);
            }
        }
    }

    private int method16461() {
        if (field23386.field1339.method3090().method32105()) {
            this.field23670 = field23386.field1339.field4902.field5443;
            return this.field23670;
        } else {
            for (int var3 = 36; var3 < 45; var3++) {
                int var4 = var3 - 36;
                if (field23386.field1339.field4904.method18131(var3).method18265().method32105()) {
                    if (field23386.field1339.field4902.field5443 != var4 && this.field23670 != var4) {
                        field23386.getClientPlayNetHandler().sendPacket(new Class5539(var4));
                        this.field23670 = var4;
                    }

                    return var4;
                }
            }

            Class7789.method25870(field23386.field1339.field4904.field25471, 42, 0, Class2259.field14695, field23386.field1339, true);
            if (!field23386.field1339.field4904.method18131(42).method18265().method32105()) {
                Client.getInstance().getNotificationManager().post(new Notification("Mineplex Fly", "Please empty a slot in your inventory"));
            } else if (field23386.field1339.field4902.field5443 != 6 && this.field23670 != 6) {
                field23386.getClientPlayNetHandler().sendPacket(new Class5539(6));
                this.field23670 = 6;
                return 6;
            }

            return -1;
        }
    }

    @EventTarget
    public void method16462(Class4422 var1) {
        if (this.method15996() && this.method15974("Fake") && !(this.field23673 < 0.0) && !(field23386.field1339.getPosY() < this.field23673)) {
            field23386.field1339.field5028.field18049 = this.field23673;
            field23386.field1339.field5049 = this.field23673;
            field23386.field1339.field4915 = this.field23673;
            field23386.field1339.field5026 = this.field23673;
            if (Class9567.method37087()) {
                field23386.field1339.field4909 = 0.099999994F;
            }
        }
    }
}
