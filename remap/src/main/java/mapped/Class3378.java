// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.util.ArrayList;

public class Class3378 extends Class3167
{
    private double field16074;
    private double field16075;
    private double field16076;
    public static double field16077;
    private float field16078;
    private boolean field16079;
    private boolean field16080;
    private int field16081;
    
    public Class3378() {
        super(Class8013.field32990, "Hypixel", "Fly for Hypixel");
        this.method9881(new Class5001("Mode", "Mode", 0, new String[] { "Basic", "Fast", "NoDmg", "Old", "Funcraft" }).method15211("Fast"));
        this.method9881(new Class4996("Speed", "Old and funcraft speed", 3.5f, Float.class, 0.0f, 4.0f, 0.1f));
        this.method9881(new Class4999("No Collision", "Prevents block collison.", true));
        this.method9881(new Class4999("Timer boost", "Faster fly.", true));
    }
    
    @Override
    public void method9879() {
        String method9887 = this.method9887("Mode");
        if ((method9887.equals("Fast") || method9887.equals("NoDmg")) && !Class9171.field38852) {
            Class9463.method35173().method35197().method25776(new Class6224("Hypixel " + method9887 + " fly", "Set " + method9887 + " mode before playing"));
            method9887 = "Basic";
        }
        this.field16078 = 1.0f;
        this.field16075 = -1.0;
        this.field16081 = -1;
        if (Class3378.field15514.field4684.field2404 || Class6430.method19160(Class3378.field15514.field4684, 0.001f)) {
            if (this.method9883("Timer boost")) {
                this.field16078 = 2.55f;
            }
            this.field16075 = Class3378.field15514.field4684.field2396;
        }
        this.field16080 = false;
        if (Class3378.field15514.field4684.field2404) {
            this.field16081 = 0;
            final String s = method9887;
            switch (s) {
                case "Basic": {
                    this.field16074 = 0.0;
                    this.field16079 = true;
                    break;
                }
                case "Fast": {
                    Class6430.method19179(true);
                    this.field16079 = true;
                    break;
                }
                case "Old": {
                    Class6430.method19179(true);
                    this.field16079 = true;
                    break;
                }
                case "NoDmg": {
                    this.field16079 = true;
                    break;
                }
                case "Funcraft": {
                    this.field16079 = true;
                    break;
                }
            }
        }
        else {
            this.field16074 = 0.0;
            this.field16079 = false;
        }
    }
    
    @Override
    public void method9897() {
        Class7482.method23151(Class7482.method23136() * 0.7);
        this.field16078 = 1.0f;
        Class3378.field15514.field4633.field26532 = 1.0f;
    }
    
    @Class6753
    public void method10770(final Class5732 class5732) {
        this.field16075 = -1.0;
    }
    
    @Class6753
    public void method10771(final Class5744 class5744) {
        if (class5744.method17046()) {
            if (!Class6430.method19160(Class3378.field15514.field4684, 1.0E-5f)) {
                Label_0031: {
                    if (Class6430.method19146()) {
                        if (Class3378.field16077 == 0.0 || Class6430.method19160(Class3378.field15514.field4684, 0.001f)) {
                            String method9887 = this.method9887("Mode");
                            if (method9887.equals("Fast") || method9887.equals("NoDmg")) {
                                if (!Class9171.field38852) {
                                    method9887 = "Basic";
                                }
                            }
                            if (!method9887.equals("Basic")) {
                                if (!method9887.equals("Fast")) {
                                    if (!method9887.equals("NoDmg")) {
                                        break Label_0031;
                                    }
                                }
                            }
                            final double[] method9888 = Class6430.method19177();
                            final int length = method9888.length;
                            int n = 0;
                            for (int i = 0; i < length; ++i) {
                                if (class5744.method17036() - (int)class5744.method17036() == method9888[i]) {
                                    n = 1;
                                }
                            }
                            if (n != 0) {
                                class5744.method17045(true);
                            }
                        }
                    }
                }
                if (Class3378.field16077 != 3.0) {
                    class5744.method17033(true);
                }
            }
        }
    }
    
    @Class6753
    public void method10772(final Class5717 class5717) {
        if (Class3378.field15514.field4684.field2404 || Class6430.method19160(Class3378.field15514.field4684, 0.001f)) {
            this.field16075 = Class3378.field15514.field4684.field2396;
        }
        if (this.field16075 == -1.0) {
            final double[] method19177 = Class6430.method19177();
            final int length = method19177.length;
            double a = Double.MAX_VALUE;
            for (final double n : method19177) {
                final double field2396 = Class3378.field15514.field4684.field2396;
                final double a2 = (int)(field2396 + class5717.method16974()) - field2396 - class5717.method16974() + n;
                final double n2 = 0.02;
                if (a2 > -0.05 && a2 < n2 && Math.abs(a2) < a) {
                    a = a2;
                }
            }
            if (Math.abs(a) < 0.1) {
                class5717.method16975(class5717.method16974() + a);
                Class6430.method19155(class5717.method16974());
                this.field16075 = Class3378.field15514.field4684.field2396 + class5717.method16974();
                Class3378.field16077 = 0.0;
                this.field16079 = false;
                this.field16076 = 0.0;
            }
            return;
        }
        String method19178 = this.method9887("Mode");
        if ((method19178.equals("Fast") || method19178.equals("NoDmg")) && !Class9171.field38852) {
            method19178 = "Basic";
        }
        this.field16078 -= 0.016666668f;
        if (this.field16078 < 2.1) {
            this.field16078 = 1.0f;
        }
        if (!Class9463.method35173().method35189().method21551(Class3280.class).method9906()) {
            Class3378.field15514.field4633.field26532 = this.field16078;
        }
        if (this.field16079) {
            double n3 = 0.64 - Math.random() * 1.0E-10;
            if (method19178.equals("Funcraft")) {
                n3 -= 0.04;
            }
            Class3378.field16077 = 0.0;
            final double[] method19179 = Class6430.method19177();
            double field2397 = 0.0;
            final int length2 = method19179.length;
            final double n4 = Class3378.field15514.field4684.field2396 - (int)Class3378.field15514.field4684.field2396;
            for (int j = 0; j < length2; ++j) {
                if (method19179[j] > n4 && (method19178.equals("Basic") || method19179[j] - n4 >= 0.37)) {
                    field2397 = method19179[j] - n4;
                    break;
                }
            }
            this.field16076 = field2397;
            if (Class7482.method23140() > 0) {
                this.field16076 = 0.6 + Class7482.method23140() * 0.1;
            }
            final String s = method19178;
            switch (s) {
                case "Basic": {
                    class5717.method16975(this.field16076);
                    this.field16079 = !this.field16079;
                    break;
                }
                case "Fast": {
                    if (!Class6430.method19146()) {
                        this.field16076 = Class7482.method23141();
                    }
                    class5717.method16975(0.39999994);
                    if (Class7482.method23140() > 0) {
                        class5717.method16975(this.field16076);
                    }
                    Class7482.method23149(class5717, n3);
                    this.field16079 = !this.field16079;
                    this.field16074 = 0.66 + this.method9886("Speed") / 6.0f;
                    break;
                }
                case "Old": {
                    class5717.method16975(this.field16076 = Class7482.method23141());
                    Class7482.method23149(class5717, n3);
                    this.field16079 = !this.field16079;
                    this.field16074 = 0.65 + this.method9886("Speed") / 6.0f;
                    break;
                }
                case "NoDmg": {
                    class5717.method16975(this.field16076);
                    Class7482.method23149(class5717, n3);
                    this.field16079 = !this.field16079;
                    this.field16074 = n3 * 0.987;
                    break;
                }
                case "Funcraft": {
                    class5717.method16975(this.field16076 = Class7482.method23141());
                    Class7482.method23149(class5717, n3);
                    this.field16079 = !this.field16079;
                    this.field16074 = 0.65 + this.method9886("Speed") / 6.0f;
                    break;
                }
            }
            return;
        }
        if (method19178.equals("NoDmg") && this.field16081 > 20) {
            this.field16074 = 0.0;
        }
        double n6 = 0.0083 - (this.field16081 - 1) / 40000.0;
        if (n6 < 0.004) {
            n6 = 0.004;
        }
        if (this.field16074 / (this.field16074 + n6) > 0.992) {
            this.field16074 -= n6;
        }
        else {
            this.field16074 *= 0.992;
        }
        if (Class3378.field15514.field4684.field2407) {
            this.field16074 = 0.0;
        }
        final double n7 = method19178.equals("Basic") ? Class7482.method23137() : (Class7482.method23137() - 0.008);
        if (this.field16074 < n7) {
            this.field16074 = n7;
        }
        else if (!Class6430.method19114()) {
            this.field16074 = n7;
        }
        Class7482.method23149(class5717, this.field16074);
        if (!Class3378.field15514.field4684.field2404 || !Class6430.method19160(Class3378.field15514.field4684, 0.001f)) {
            ++this.field16081;
            if (!Class6430.method19160(Class3378.field15514.field4684, 0.001f)) {
                class5717.method16975(0.0);
                Class6430.method19155(0.0);
            }
            if (this.field16080) {
                return;
            }
            ++Class3378.field16077;
            final double field2398 = Class3378.field15514.field4684.field2395;
            final double n8 = this.field16075 + this.field16076;
            final double field2399 = Class3378.field15514.field4684.field2397;
            if (Class3378.field16077 == 1.0) {
                Class3378.field15514.field4684.method1656(field2398, n8 - 1.0E-4, field2399);
            }
            else if (Class3378.field16077 >= 3.0) {
                if (Class6430.method19146()) {
                    Class3378.field15514.field4684.method1656(field2398, n8, field2399);
                }
                else {
                    Class3378.field15514.field4684.method1656(field2398, n8 + 1.0E-4, field2399);
                }
                Class3378.field16077 = 0.0;
            }
        }
        else {
            Class3378.field16077 = 0.0;
        }
        if (Class3378.field15514.field4648.field23439.field2162) {
            class5717.method16975(0.25);
            this.field16075 += 0.25;
        }
        final Vec3d method19180 = Class3378.field15514.field4684.method1679(class5717.method16978().add(0.0, -class5717.method16978().getY(), 0.0));
        final boolean b = Math.abs(Math.sqrt(method19180.lengthSquared()) - this.field16074) < 1.0E-4;
        if (this.method9883("No Collision") && this.field16074 > n7) {
            final ArrayList list = new ArrayList();
            final float method19181 = MathHelper.method35668(Class7482.method23147());
            if (method19181 > 0.0f && method19181 < 90.0f) {
                list.add(new Vec3d(1.0, 0.0, 0.0));
                list.add(new Vec3d(0.0, 0.0, 1.0));
                list.add(new Vec3d(0.0, 0.0, -1.0));
                list.add(new Vec3d(-1.0, 0.0, 0.0));
            }
            else if (method19181 > 90.0f && method19181 < 180.0f) {
                list.add(new Vec3d(0.0, 0.0, 1.0));
                list.add(new Vec3d(-1.0, 0.0, 0.0));
                list.add(new Vec3d(0.0, 0.0, -1.0));
                list.add(new Vec3d(1.0, 0.0, 0.0));
            }
            else if (method19181 > -180.0f && method19181 < -90.0f) {
                list.add(new Vec3d(0.0, 0.0, -1.0));
                list.add(new Vec3d(-1.0, 0.0, 0.0));
                list.add(new Vec3d(1.0, 0.0, 0.0));
                list.add(new Vec3d(0.0, 0.0, 1.0));
            }
            else {
                list.add(new Vec3d(0.0, 0.0, -1.0));
                list.add(new Vec3d(1.0, 0.0, 0.0));
                list.add(new Vec3d(0.0, 0.0, 1.0));
                list.add(new Vec3d(-1.0, 0.0, 0.0));
            }
            class5717.method16979(method19180);
            if (!b && Class3378.field15514.field4684.field2396 % 1.0 > 0.10000000149011612 && Class7482.method23148()) {
                for (final Vec3d class5719 : list) {
                    final Vec3d class5718 = class5719;
                    class5719.x *= this.field16074;
                    final Vec3d class5720 = class5718;
                    class5720.z *= this.field16074;
                    if (Math.abs(Math.sqrt(Class3378.field15514.field4684.method1679(class5718).lengthSquared()) - this.field16074) < 1.0E-4) {
                        class5717.method16979(class5718);
                        break;
                    }
                }
            }
        }
    }
    
    @Class6753
    public void method10773(final Class5723 class5723) {
        if (Class3378.field15514.method5269() != null) {
            if (class5723.method16998() instanceof Class4328) {
                this.field16075 = ((Class4328)class5723.method16998()).field19378;
                this.field16080 = true;
            }
        }
    }
    
    @Class6753
    public void method10774(final Class5741 class5741) {
        String method9887 = this.method9887("Mode");
        if (method9887.equals("Fast") || method9887.equals("NoDmg")) {
            if (!Class9171.field38852) {
                method9887 = "Basic";
            }
        }
        if (this.field16081 >= 0) {
            if (!this.field16080) {
                if (!method9887.equals("Funcraft")) {
                    if (!method9887.equals("Old")) {
                        if (this.field16075 >= 0.0) {
                            if (!Class3378.field15514.field4684.field2404) {
                                if (!Class6430.method19160(Class3378.field15514.field4684, 0.001f)) {
                                    if (!method9887.equals("Basic")) {
                                        final double n = 0.42 + Class7482.method23140() * 0.1;
                                        Class3378.field15514.field4684.field2396 = this.field16075 + n;
                                        Class3378.field15514.field4684.field2418 = this.field16075 + n;
                                        Class3378.field15514.field4684.field3019 = this.field16075 + n;
                                        Class3378.field15514.field4684.field2393 = this.field16075 + n;
                                    }
                                    else {
                                        final double n2 = 0.0;
                                        Class3378.field15514.field4684.field2396 = this.field16075 + n2;
                                        Class3378.field15514.field4684.field2418 = this.field16075 + n2;
                                        Class3378.field15514.field4684.field3019 = this.field16075 + n2;
                                        Class3378.field15514.field4684.field2393 = this.field16075 + n2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
