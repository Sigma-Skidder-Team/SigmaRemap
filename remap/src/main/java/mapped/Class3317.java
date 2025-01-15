// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.authlib.GameProfile;

public class Class3317 extends Class3167
{
    public static Class512 field15901;
    private double field15902;
    private double field15903;
    private double field15904;
    private double field15905;
    private double field15906;
    private double field15907;
    private float field15908;
    private float field15909;
    private int field15910;
    public float field15911;
    public float field15912;
    public boolean field15913;
    public boolean field15914;
    public boolean field15915;
    public boolean field15916;
    public boolean field15917;
    public boolean field15918;
    
    public Class3317() {
        super(Class8013.field32984, "Freecam", "Move client side but not server side");
        this.method9881(new Class4996("Speed", "Speed value", 4.0f, Float.class, 1.0f, 10.0f, 0.1f));
    }
    
    @Class6753
    public void method10497(final Class5729 class5729) {
        if (this.method9906()) {
            if (class5729.method17016() instanceof Class756) {
                if (class5729.method17016() != Class3317.field15901) {
                    class5729.method16961(true);
                }
            }
        }
    }
    
    @Class6753
    public void method10498(final Class5741 class5741) {
        if (this.method9906()) {
            if (Class3317.field15901 == null) {
                this.method9879();
            }
            Class3317.field15514.field4684.field4078 = Class3317.field15514.field4684.field2400;
            final AxisAlignedBB field2403 = Class3317.field15514.field4684.field2403;
            Class3317.field15901.method1656((field2403.field25073 + field2403.field25076) / 2.0, field2403.field25074, (field2403.field25075 + field2403.field25078) / 2.0);
            final double n = this.field15905 + (this.field15902 - this.field15905) * class5741.field23312;
            final double n2 = this.field15906 + (this.field15903 - this.field15906) * class5741.field23312;
            final double n3 = this.field15907 + (this.field15904 - this.field15907) * class5741.field23312;
            Class3317.field15514.field4684.field2395 = n;
            Class3317.field15514.field4684.field2417 = n;
            Class3317.field15514.field4684.field3018 = n;
            Class3317.field15514.field4684.field2392 = n;
            Class3317.field15514.field4684.field2396 = n2;
            Class3317.field15514.field4684.field2418 = n2;
            Class3317.field15514.field4684.field3019 = n2;
            Class3317.field15514.field4684.field2393 = n2;
            Class3317.field15514.field4684.field2397 = n3;
            Class3317.field15514.field4684.field2419 = n3;
            Class3317.field15514.field4684.field3020 = n3;
            Class3317.field15514.field4684.field2394 = n3;
            if (Class7482.method23148()) {
                Class3317.field15514.field4684.field3013 = 0.099999994f;
            }
        }
    }
    
    @Class6753
    public void method10499(final Class5739 class5739) {
        if (this.method9906()) {
            Class3317.field15901.method1685();
            Class3317.field15901.field2403 = new AxisAlignedBB(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        }
    }
    
    @Override
    public void method9879() {
        this.field15902 = Class3317.field15514.field4684.field2395;
        this.field15903 = Class3317.field15514.field4684.field2396;
        this.field15904 = Class3317.field15514.field4684.field2397;
        this.field15908 = Class3317.field15514.field4684.field2399;
        this.field15909 = Class3317.field15514.field4684.field2400;
        Class3317.field15901 = new Class755(Class3317.field15514.field4683, new GameProfile(Class3317.field15514.field4684.method2844().getId(), Class3317.field15514.field4684.getName().method8461()));
        Class3317.field15901.field3006 = Class3317.field15514.field4684.field3006;
        Class3317.field15901.method1728(this.field15902, this.field15903, this.field15904, this.field15908, this.field15909);
        Class3317.field15901.field2421 = true;
        Class3317.field15901.field2422 = Class3317.field15514.field4684.field2422;
        Class3317.field15901.field2953 = this.field15908;
        Class3317.field15901.field2954 = this.field15908;
        Class3317.field15901.field2951 = this.field15908;
        Class3317.field15901.field2952 = this.field15908;
        Class3317.field15514.field4683.method6819(this.field15910 = (int)(Math.random() * -10000.0), Class3317.field15901);
        this.field15913 = Class3317.field15514.field4648.field23435.method1056();
        this.field15914 = Class3317.field15514.field4648.field23437.method1056();
        this.field15915 = Class3317.field15514.field4648.field23436.method1056();
        this.field15916 = Class3317.field15514.field4648.field23438.method1056();
        this.field15912 = ((this.field15913 != this.field15914) ? ((float)(this.field15913 ? 1 : -1)) : 0.0f);
        this.field15911 = ((this.field15915 != this.field15916) ? ((float)(this.field15915 ? 1 : -1)) : 0.0f);
        this.field15917 = Class3317.field15514.field4648.field23439.method1056();
        this.field15918 = Class3317.field15514.field4648.field23440.method1056();
        Class3317.field15514.field4648.field23435.field2162 = false;
        Class3317.field15514.field4648.field23437.field2162 = false;
        Class3317.field15514.field4648.field23436.field2162 = false;
        Class3317.field15514.field4648.field23438.field2162 = false;
        Class3317.field15514.field4648.field23439.field2162 = false;
        Class3317.field15514.field4648.field23440.field2162 = false;
    }
    
    @Override
    public void method9897() {
        Class3317.field15514.field4648.field23435.field2162 = this.field15913;
        Class3317.field15514.field4648.field23437.field2162 = this.field15914;
        Class3317.field15514.field4648.field23436.field2162 = this.field15915;
        Class3317.field15514.field4648.field23438.field2162 = this.field15916;
        Class3317.field15514.field4648.field23439.field2162 = this.field15917;
        Class3317.field15514.field4648.field23440.field2162 = this.field15918;
        Class3317.field15514.field4683.method6821(this.field15910);
        Class3317.field15514.field4684.method1685();
        if (Class3317.field15901 != null) {
            Class3317.field15514.field4684.field2422 = Class3317.field15901.field2422;
        }
        Class3317.field15901 = null;
    }
    
    @Class6753
    private void method10500(final Class5713 class5713) {
        if (this.method9906()) {
            class5713.method16961(true);
        }
    }
    
    @Class6753
    private void method10501(final Class5752 class5752) {
        if (this.method9906()) {
            if (class5752.method17061() != Class3317.field15514.field4648.field23440.field2161.field32860) {
                if (class5752.method17061() != Class3317.field15514.field4648.field23439.field2161.field32860) {
                    if (class5752.method17061() != Class3317.field15514.field4648.field23435.field2161.field32860) {
                        if (class5752.method17061() != Class3317.field15514.field4648.field23437.field2161.field32860) {
                            if (class5752.method17061() != Class3317.field15514.field4648.field23436.field2161.field32860) {
                                if (class5752.method17061() == Class3317.field15514.field4648.field23438.field2161.field32860) {
                                    class5752.method16961(true);
                                    this.field15916 = true;
                                }
                            }
                            else {
                                class5752.method16961(true);
                                this.field15915 = true;
                            }
                        }
                        else {
                            class5752.method16961(true);
                            this.field15914 = true;
                        }
                    }
                    else {
                        class5752.method16961(true);
                        this.field15913 = true;
                    }
                }
                else {
                    class5752.method16961(true);
                    this.field15917 = true;
                }
            }
            else {
                class5752.method16961(true);
                this.field15918 = true;
            }
            this.field15912 = ((this.field15913 != this.field15914) ? ((float)(this.field15913 ? 1 : -1)) : 0.0f);
            this.field15911 = ((this.field15915 != this.field15916) ? ((float)(this.field15915 ? 1 : -1)) : 0.0f);
        }
    }
    
    @Class6753
    private void method10502(final Class5715 class5715) {
        if (this.method9906()) {
            if (class5715.method16963() != Class3317.field15514.field4648.field23440.field2161.field32860) {
                if (class5715.method16963() != Class3317.field15514.field4648.field23439.field2161.field32860) {
                    if (class5715.method16963() != Class3317.field15514.field4648.field23435.field2161.field32860) {
                        if (class5715.method16963() != Class3317.field15514.field4648.field23437.field2161.field32860) {
                            if (class5715.method16963() != Class3317.field15514.field4648.field23436.field2161.field32860) {
                                if (class5715.method16963() == Class3317.field15514.field4648.field23438.field2161.field32860) {
                                    class5715.method16961(true);
                                    this.field15916 = false;
                                }
                            }
                            else {
                                class5715.method16961(true);
                                this.field15915 = false;
                            }
                        }
                        else {
                            class5715.method16961(true);
                            this.field15914 = false;
                        }
                    }
                    else {
                        class5715.method16961(true);
                        this.field15913 = false;
                    }
                }
                else {
                    class5715.method16961(true);
                    this.field15917 = false;
                }
            }
            else {
                class5715.method16961(true);
                this.field15918 = false;
            }
            this.field15912 = ((this.field15913 != this.field15914) ? ((float)(this.field15913 ? 1 : -1)) : 0.0f);
            this.field15911 = ((this.field15915 != this.field15916) ? ((float)(this.field15915 ? 1 : -1)) : 0.0f);
        }
    }
    
    @Class6753
    public void method10503(final Class5722 class5722) {
        if (this.method9906()) {
            class5722.method16961(true);
        }
    }
    
    @Class6753
    public void method10504(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            class5744.method17043(this.field15908 % 360.0f);
            class5744.method17041(this.field15909);
            Class3317.field15514.field4684.field4077 = this.field15908;
            Class3317.field15514.field4684.field4078 = this.field15909;
            final float[] method23145 = Class7482.method23145(this.field15912, this.field15911);
            final float n = method23145[1];
            final float n2 = method23145[2];
            final float n3 = method23145[0];
            final double cos = Math.cos(Math.toRadians(n3));
            final double sin = Math.sin(Math.toRadians(n3));
            final double n4 = this.method9886("Speed") / 2.0f;
            this.field15905 = this.field15902;
            this.field15907 = this.field15904;
            this.field15906 = this.field15903;
            this.field15902 += (n * cos + n2 * sin) * n4;
            this.field15904 += (n * sin - n2 * cos) * n4;
            if (this.field15917) {
                this.field15903 += n4;
            }
            if (this.field15918) {
                this.field15903 -= n4;
            }
        }
    }
    
    @Class6753
    private void method10505(final Class5723 class5723) {
        if (!this.method9906()) {
            return;
        }
        if (Class3317.field15514.field4684 != null) {
            if (class5723.method16998() instanceof Class4328) {
                final Class4328 class5724 = (Class4328)class5723.method16998();
                this.field15908 = class5724.field19380;
                this.field15909 = class5724.field19381;
                class5724.field19380 = Class3317.field15514.field4684.field2399;
                class5724.field19381 = Class3317.field15514.field4684.field2400;
                final double field19377 = class5724.field19377;
                final double field19378 = class5724.field19378;
                final double field19379 = class5724.field19379;
                final float field19380 = Class512.field2997.field34097;
                Class3317.field15514.field4684.method1889(new AxisAlignedBB(field19377 - field19380, field19378, field19379 - field19380, field19377 + field19380, field19378 + Class512.field2997.field34098, field19379 + field19380));
                class5723.method16961(true);
                Class3317.field15901.method1937(0.0, 0.0, 0.0);
            }
        }
    }
    
    @Class6753
    private void method10506(final Class5721 class5721) {
        if (this.method9906()) {
            if (class5721.method16990() instanceof Class4380) {
                Class3317.field15901.method2707(Class316.field1877);
            }
            if (class5721.method16990() instanceof Class4381) {
                if (((Class4381)class5721.method16990()).method13170(Class3317.field15514.field4683) == null) {
                    class5721.method16961(true);
                }
            }
        }
    }
    
    @Class6753
    private void method10507(final Class5746 class5746) {
        if (this.method9906()) {
            class5746.method16961(true);
        }
    }
    
    @Class6753
    private void method10508(final Class5732 class5732) {
        if (this.method9906()) {
            this.method9907(false);
        }
    }
}
