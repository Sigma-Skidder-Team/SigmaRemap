// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.mods.util.InDevelopment;
import net.minecraft.util.math.Vec3d;

@InDevelopment
public class Class3215 extends Class3167
{
    private double field15662;
    private int field15663;
    private int field15664;
    private Vec3d field15665;
    
    public Class3215() {
        super(Class8013.field32985, "AntiVoid", "Avoids you from falling in the void");
        this.field15665 = null;
        this.method9881(new Class4999("Void", "Catch only above void", true));
        this.method9881(new Class4996("Fall Distance", "Fall distance before catching you", 8.0f, Float.class, 2.0f, 15.0f, 0.5f));
        this.method9881(new Class5001("Mode", "AntiVoid method", 0, new String[] { "Hypixel", "Motion", "Cubecraft", "Legit" }));
    }
    
    @Override
    public void method9879() {
        this.field15662 = 0.0;
        this.field15664 = 0;
        this.field15663 = 0;
        if (Class3215.field15514.field4684.onGround || Class6430.method19160(Class3215.field15514.field4684, 0.001f)) {
            this.field15665 = new Vec3d(Class3215.field15514.field4684.posX, Class3215.field15514.field4684.posY, Class3215.field15514.field4684.posZ);
        }
    }
    
    @Class6753
    private void method10134(final Class5717 class5717) {
        if (this.method9906()) {
            if (Class3215.field15514.field4684.onGround || Class6430.method19160(Class3215.field15514.field4684, 0.001f)) {
                this.field15665 = new Vec3d(Class3215.field15514.field4684.posX, Class3215.field15514.field4684.posY, Class3215.field15514.field4684.posZ);
            }
            if (this.field15664 <= 0) {
                final Class3167 method21551 = Class9463.method35173().method35189().method21551(Class3259.class);
                final String method21552 = method21551.method9887("Type");
                final Class3167 method21553 = Class9463.method35173().method35189().method21551(Class3254.class);
                final String method21554 = method21553.method9887("Type");
                boolean method21555 = method21551.method9906();
                if (method21552.equals("Cubecraft")) {
                    if (class5717.method16974() < -0.4) {
                        method21555 = false;
                    }
                }
                if (method21553.method9906()) {
                    if (method21554.equals("Hypixel")) {
                        method21555 = true;
                    }
                }
                if (Class3215.field15514.field4684.getMotion().y < -0.08 && !method21555) {
                    this.field15662 -= Class3215.field15514.field4684.getMotion().y;
                }
                else if (Class3215.field15514.field4684.onGround) {
                    this.field15662 = 0.0;
                }
            }
            else {
                Class7482.method23149(class5717, 0.0);
                class5717.method16975(0.0);
                --this.field15664;
            }
            if (this.field15662 > this.method9886("Fall Distance")) {
                if (this.method10137() || !this.method9883("Void")) {
                    this.field15662 = 0.0;
                    this.method10138(this.method9887("Mode"), class5717);
                }
            }
            if (this.field15663 > 0) {
                --this.field15663;
                Class7482.method23149(class5717, 0.1);
            }
        }
    }
    
    @Class6753
    private void method10135(final Class5744 class5744) {
        if (this.method9906()) {
            if (class5744.method17046()) {
                if (this.field15664 != 0) {
                    class5744.method16961(true);
                }
            }
        }
    }
    
    @Class6753
    private void method10136(final Class5723 class5723) {
        if (this.method9906() && this.field15664 != 0) {
            if (class5723.method16998() instanceof Class4328) {
                this.field15664 = 0;
                this.field15663 = 4;
            }
        }
    }
    
    private boolean method10137() {
        return Class3215.field15514.field4684.method1895().y < 1.0 || (!Class3215.field15514.field4684.onGround && Class3215.field15514.field4683.method6981(Class3215.field15514.field4684, Class3215.field15514.field4684.boundingBox.method18494(0.0, -Class3215.field15514.field4684.method1934().y, 0.0)).count() == 0L);
    }
    
    private void method10138(String s, final Class5717 class5717) {
        final double method16760 = Class3215.field15514.field4684.method1895().getX();
        Class3215.field15514.field4684.method1895().getY();
        final double method16761 = Class3215.field15514.field4684.method1895().getZ();
        if (s.equals("Cubecraft") && !Class6430.method19148()) {
            s = "Motion";
        }
        final String s2 = s;
        switch (s2) {
            case "Hypixel": {
                Class3215.field15514.method5269().method17292(new Class4354(0.0, -999.0, 0.0, true));
                break;
            }
            case "Motion": {
                class5717.method16975(0.1);
                Class6430.method19155(class5717.method16974());
                break;
            }
            case "Cubecraft": {
                Class3215.field15514.method5269().method17292(new Class4354(method16760, 3.2E7, method16761, false));
                Class9463.method35173().method35189().method21551(Class3259.class).method9909(false);
                break;
            }
            case "Legit": {
                this.field15664 = 200;
                break;
            }
        }
    }
}
