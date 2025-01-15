// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;
import java.util.Iterator;

public class Class3182 extends Class3167
{
    public Class354 field15568;
    public int field15569;
    public int field15570;
    public int field15571;
    public int field15572;
    public short field15573;
    public Class4308 field15574;
    public boolean field15575;
    
    public Class3182() {
        super(Class8013.field32987, "Auto32k", "Automaticly places 32k shulker + hopper in hotbar");
        this.field15569 = -1;
        this.field15570 = -1;
        this.field15571 = 0;
        this.field15572 = -1;
        this.field15573 = 0;
        this.field15575 = false;
    }
    
    @Override
    public void method9879() {
        this.field15568 = null;
        for (final Class354 field15568 : Class4609.method13675(Class4609.method13691(Class3182.field15514.field4682.method27315()))) {
            if (Class4609.method13680(Class3182.field15514.field4684, field15568) >= 2.0f) {
                if (!Class4609.method13665(Class3182.field15514.field4684, field15568)) {
                    continue;
                }
                if (field15568.method1075() < Class3182.field15514.field4684.field2396 - 2.0) {
                    continue;
                }
                if (field15568.method1075() > Class3182.field15514.field4684.field2396 - 1.0) {
                    continue;
                }
                if (this.method9981(field15568)) {
                    this.field15568 = field15568;
                    break;
                }
                continue;
            }
        }
        this.field15570 = Class8639.method29340(Class7739.field31150, Class7739.field31146, Class7739.field31147, Class7739.field31144, Class7739.field31142, Class7739.field31148, Class7739.field31138, Class7739.field31143, Class7739.field31140, Class7739.field31137, Class7739.field31136, Class7739.field31141, Class7739.field31145, Class7739.field31149, Class7739.field31134, Class7739.field31135, Class7739.field31139);
        this.field15569 = Class8639.method29340(Class7739.field31028);
        if (this.field15569 == -1) {
            this.field15569 = Class8639.method29319(Class7739.field31028);
            if (this.field15569 != -1) {
                if (this.field15569 >= 36 && this.field15569 <= 44) {
                    this.field15569 %= 9;
                }
                else {
                    this.field15569 = Class8639.method29354(this.field15569);
                }
            }
        }
        if (this.field15570 == -1) {
            this.field15570 = Class8639.method29320(Class7739.field31150, Class7739.field31146, Class7739.field31147, Class7739.field31144, Class7739.field31142, Class7739.field31148, Class7739.field31138, Class7739.field31143, Class7739.field31140, Class7739.field31137, Class7739.field31136, Class7739.field31141, Class7739.field31145, Class7739.field31149, Class7739.field31134, Class7739.field31135, Class7739.field31139);
            if (this.field15570 != -1) {
                if (this.field15570 >= 36 && this.field15570 <= 44) {
                    this.field15570 %= 9;
                }
                else {
                    this.field15570 = Class8639.method29354(this.field15570);
                }
            }
        }
        this.field15571 = 0;
    }
    
    public boolean method9981(final Class354 class354) {
        final Class7096 method6701 = Class3182.field15514.field4683.method6701(class354);
        final Class7096 method6702 = Class3182.field15514.field4683.method6701(class354.method1137());
        final Class7096 method6703 = Class3182.field15514.field4683.method6701(class354.method1138(2));
        if (method6701.method21723()) {
            if (method6702.method21706()) {
                if (method6703.method21706()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void method9897() {
    }
    
    @Class6753
    private void method9982(final Class5739 class5739) {
        if (!this.method9906()) {
            return;
        }
        if (this.field15568 != null) {
            GL11.glAlphaFunc(516, 0.0f);
            final Class354 field15568 = this.field15568;
            final double n = field15568.method1074() - Class3182.field15514.field4644.method5833().method18161().method16760();
            final double n2 = field15568.method1075() - Class3182.field15514.field4644.method5833().method18161().method16761();
            final double n3 = field15568.method1076() - Class3182.field15514.field4644.method5833().method18161().method16762();
            Class8154.method26909(new Class7644(n, n2 + 1.625, n3, n + 1.0, n2 + 3.0, n3 + 1.0), Class6430.method19118(Class265.field1285.field1292, 0.3f));
            GL11.glColor3f(1.0f, 1.0f, 1.0f);
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(3042);
            GL11.glEnable(2848);
            GL11.glDisable(3553);
            GL11.glEnable(2929);
            GL11.glDisable(2896);
            GL11.glDepthMask(false);
            final float n4 = 8.0f;
            if (true) {
                GL11.glPushMatrix();
                final int method19118 = Class6430.method19118(Class265.field1285.field1292, 0.5f);
                GL11.glColor4f((method19118 >> 16 & 0xFF) / 255.0f, (method19118 >> 8 & 0xFF) / 255.0f, (method19118 & 0xFF) / 255.0f, (method19118 >> 24 & 0xFF) / 255.0f);
                GL11.glTranslated(n + 0.5, n2 + 1.0099999904632568, n3 + 0.5);
                GL11.glRotatef(90.0f, 0.0f, 0.0f, 0.0f);
                GL11.glLineWidth(3.4f);
                this.method9983(n4);
                GL11.glPopMatrix();
            }
            final int method19119 = Class6430.method19118(Class265.field1278.field1292, 0.5f);
            final float n5 = (method19119 >> 24 & 0xFF) / 255.0f;
            final float n6 = (method19119 >> 16 & 0xFF) / 255.0f;
            final float n7 = (method19119 >> 8 & 0xFF) / 255.0f;
            final float n8 = (method19119 & 0xFF) / 255.0f;
            for (int n9 = 0; n9 < n4 - 1.0f; ++n9) {
                final float n10 = n9 / n4;
                final double cos = Math.cos(n10 * 3.141592653589793 / 2.0);
                GL11.glPushMatrix();
                GL11.glColor4f(n6, n7, n8, n5 * (1.0f - n10) * 0.25f);
                GL11.glTranslated(n + 0.5, n2 + 2.009999990463257 + n9, n3 + 0.5);
                GL11.glRotatef(90.0f, 0.0f, 0.0f, 0.0f);
                GL11.glLineWidth(3.4f);
                this.method9983((float)(n4 * cos));
                GL11.glPopMatrix();
            }
            for (int n11 = 0; n11 < n4 - 1.0f; ++n11) {
                final float n12 = n11 / n4;
                final double cos2 = Math.cos(n12 * 3.141592653589793 / 2.0);
                GL11.glPushMatrix();
                GL11.glColor4f(n6, n7, n8, n5 * (1.0f - n12) * 0.25f);
                GL11.glTranslated(n + 0.5, n2 - n11 + 0.009999999776482582, n3 + 0.45);
                GL11.glRotatef(90.0f, 0.0f, 0.0f, 0.0f);
                GL11.glLineWidth(3.4f);
                this.method9983((float)(n4 * cos2));
                GL11.glPopMatrix();
            }
            GL11.glEnable(3553);
            GL11.glDisable(2848);
            GL11.glDepthMask(true);
            GL11.glEnable(2896);
            GL11.glColor3f(1.0f, 1.0f, 1.0f);
        }
    }
    
    private void method9983(final float n) {
        GL11.glBegin(2);
        for (int i = 0; i < 360; ++i) {
            final double n2 = i * 3.141592653589793 / 180.0;
            GL11.glVertex2d(Math.cos(n2) * n, Math.sin(n2) * n);
        }
        GL11.glEnd();
    }
    
    @Class6753
    private void method9984(final Class5744 class5744) {
        if (!this.method9906()) {
            return;
        }
        if (this.field15569 == -1) {
            return;
        }
        if (this.field15570 == -1) {
            return;
        }
        if (this.field15568 != null) {
            if (this.field15571 != 0) {
                if (this.field15571 == 1) {
                    final float n = Class4609.method13673(this.field15568.method1137(), Class179.field512)[0];
                    final float n2 = Class4609.method13673(this.field15568.method1137(), Class179.field512)[1];
                    class5744.method17043(n);
                    class5744.method17041(n2);
                    final int field2743 = Class3182.field15514.field4684.field3006.field2743;
                    Class3182.field15514.field4684.field3006.field2743 = this.field15569;
                    final Class2201 method27319 = Class3182.field15514.field4682.method27319(Class3182.field15514.field4684, Class3182.field15514.field4683, Class316.field1877, new Class7005(Class4609.method13702(Class179.field512, this.field15568), Class179.field512, this.field15568, false));
                    Class3182.field15514.field4684.method2707(Class316.field1877);
                    if (method27319 == Class2201.field13400) {
                        ++this.field15571;
                        Class3182.field15514.method5269().method17292(new Class4336(Class3182.field15514.field4684, Class287.field1591));
                        Class3182.field15514.field4684.field4085.field24728 = true;
                        Class3182.field15514.field4684.field3006.field2743 = this.field15570;
                        final Class7005 class5745 = new Class7005(Class4609.method13702(Class179.field512, this.field15568.method1137()), Class179.field512, this.field15568.method1137(), false);
                        Class3182.field15514.field4682.method27319(Class3182.field15514.field4684, Class3182.field15514.field4683, Class316.field1877, class5745);
                        Class3182.field15514.field4684.method2707(Class316.field1877);
                        Class3182.field15514.field4684.field4085.field24728 = false;
                        Class3182.field15514.method5269().method17292(new Class4336(Class3182.field15514.field4684, Class287.field1592));
                        Class3182.field15514.field4682.method27319(Class3182.field15514.field4684, Class3182.field15514.field4683, Class316.field1877, class5745);
                    }
                }
            }
            else {
                final float n3 = Class4609.method13673(this.field15568, Class179.field512)[0];
                final float n4 = Class4609.method13673(this.field15568, Class179.field512)[1];
                class5744.method17043(n3);
                class5744.method17041(n4);
                ++this.field15571;
            }
        }
    }
    
    @Class6753
    private void method9985(final Class5723 class5723) {
        if (this.method9906()) {
            if (class5723.method16998() instanceof Class4308) {
                this.field15574 = (Class4308)class5723.method16998();
                if (this.method9906()) {
                    if (this.field15574.method12952() == Class8471.field34770) {
                        class5723.method16961(true);
                    }
                }
                this.field15572 = this.field15574.method12951();
                this.field15575 = false;
            }
            if (class5723.method16998() instanceof Class4272) {
                final Class4272 class5724 = (Class4272)class5723.method16998();
                final int method12820 = class5724.method12820();
                final Class8321 method12821 = class5724.method12821();
                final int method12822 = class5724.method12819();
                if (this.field15572 == method12822) {
                    if (method12820 == 0) {
                        if (method12821.method27622() != Class7739.field30754) {
                            if (!this.field15575) {
                                class5723.method16961(true);
                                final Class5799 method12823 = Class3182.field15514.method5269();
                                final int n = method12822;
                                final int n2 = method12820;
                                final int n3 = 1;
                                final Class2133 field12438 = Class2133.field12438;
                                final Class8321 class5725 = method12821;
                                final short field12439 = this.field15573;
                                this.field15573 = (short)(field12439 + 1);
                                method12823.method17292(new Class4256(n, n2, n3, field12438, class5725, field12439));
                                int n4 = -1;
                                for (int i = 44; i > 9; --i) {
                                    if (Class3182.field15514.field4684.field3008.method10878(i).method20053().method27620()) {
                                        n4 = i;
                                        break;
                                    }
                                }
                                if (n4 != -1) {
                                    Class3182.field15514.field4684.field3008.method10878(n4).method20055(method12821);
                                    if (n4 >= 36) {
                                        Class3182.field15514.field4684.field3006.field2743 = n4 % 9;
                                    }
                                }
                                this.field15575 = true;
                            }
                        }
                    }
                }
            }
            if (class5723.method16998() instanceof Class4284) {
                this.method9909(false);
            }
        }
    }
    
    @Class6753
    private void method9986(final Class5721 class5721) {
        if (this.method9906()) {
            if (class5721.method16990() instanceof Class4389) {
                class5721.method16961(true);
            }
            if (class5721.method16990() instanceof Class4381) {
                final float n = Class4609.method13673(this.field15568.method1137(), Class179.field512)[0];
                final float n2 = Class4609.method13673(this.field15568.method1137(), Class179.field512)[1];
            }
            if (class5721.method16990() instanceof Class4353) {
                ((Class4353)class5721.method16990()).field19504 = false;
            }
        }
    }
}
