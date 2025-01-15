// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class5898 extends Class5845<Class852>
{
    private final Class6300 field24223;
    private final Class6300 field24224;
    private final Class6300 field24225;
    private final Class6300 field24226;
    private Class6300 field24227;
    private Class6300 field24228;
    private Class6300 field24229;
    private Class6300 field24230;
    private Class6300 field24231;
    private Class6300 field24232;
    private Class6300 field24233;
    private Class6300 field24234;
    private Class6300 field24235;
    private Class6300 field24236;
    private Class6300 field24237;
    private Class6300 field24238;
    private Class6300 field24239;
    private Class6300 field24240;
    private Class6300 field24241;
    private Class6300 field24242;
    private Class852 field24243;
    private float field24244;
    
    public Class5898() {
        this.field24269 = 256;
        this.field24270 = 256;
        (this.field24223 = new Class6300(this)).method18635("upperlip", -6.0f, -1.0f, -24.0f, 12, 5, 16, 0.0f, 176, 44);
        this.field24223.method18635("upperhead", -8.0f, -8.0f, -10.0f, 16, 16, 16, 0.0f, 112, 30);
        this.field24223.field25186 = true;
        this.field24223.method18635("scale", -5.0f, -12.0f, -4.0f, 2, 4, 6, 0.0f, 0, 0);
        this.field24223.method18635("nostril", -5.0f, -3.0f, -22.0f, 2, 2, 4, 0.0f, 112, 0);
        this.field24223.field25186 = false;
        this.field24223.method18635("scale", 3.0f, -12.0f, -4.0f, 2, 4, 6, 0.0f, 0, 0);
        this.field24223.method18635("nostril", 3.0f, -3.0f, -22.0f, 2, 2, 4, 0.0f, 112, 0);
        (this.field24225 = new Class6300(this)).method18642(0.0f, 4.0f, -8.0f);
        this.field24225.method18635("jaw", -6.0f, 0.0f, -16.0f, 12, 4, 16, 0.0f, 176, 65);
        this.field24223.method18633(this.field24225);
        (this.field24224 = new Class6300(this)).method18635("box", -5.0f, -5.0f, -5.0f, 10, 10, 10, 0.0f, 192, 104);
        this.field24224.method18635("scale", -1.0f, -9.0f, -3.0f, 2, 4, 6, 0.0f, 48, 0);
        (this.field24226 = new Class6300(this)).method18642(0.0f, 4.0f, 8.0f);
        this.field24226.method18635("body", -12.0f, 0.0f, -16.0f, 24, 24, 64, 0.0f, 0, 0);
        this.field24226.method18635("scale", -1.0f, -6.0f, -10.0f, 2, 6, 12, 0.0f, 220, 53);
        this.field24226.method18635("scale", -1.0f, -6.0f, 10.0f, 2, 6, 12, 0.0f, 220, 53);
        this.field24226.method18635("scale", -1.0f, -6.0f, 30.0f, 2, 6, 12, 0.0f, 220, 53);
        this.field24227 = new Class6300(this);
        this.field24227.field25186 = true;
        this.field24227.method18642(12.0f, 5.0f, 2.0f);
        this.field24227.method18635("bone", 0.0f, -4.0f, -4.0f, 56, 8, 8, 0.0f, 112, 88);
        this.field24227.method18635("skin", 0.0f, 0.0f, 2.0f, 56, 0, 56, 0.0f, -56, 88);
        this.field24228 = new Class6300(this);
        this.field24228.field25186 = true;
        this.field24228.method18642(56.0f, 0.0f, 0.0f);
        this.field24228.method18635("bone", 0.0f, -2.0f, -2.0f, 56, 4, 4, 0.0f, 112, 136);
        this.field24228.method18635("skin", 0.0f, 0.0f, 2.0f, 56, 0, 56, 0.0f, -56, 144);
        this.field24227.method18633(this.field24228);
        (this.field24229 = new Class6300(this)).method18642(12.0f, 20.0f, 2.0f);
        this.field24229.method18635("main", -4.0f, -4.0f, -4.0f, 8, 24, 8, 0.0f, 112, 104);
        (this.field24230 = new Class6300(this)).method18642(0.0f, 20.0f, -1.0f);
        this.field24230.method18635("main", -3.0f, -1.0f, -3.0f, 6, 24, 6, 0.0f, 226, 138);
        this.field24229.method18633(this.field24230);
        (this.field24231 = new Class6300(this)).method18642(0.0f, 23.0f, 0.0f);
        this.field24231.method18635("main", -4.0f, 0.0f, -12.0f, 8, 4, 16, 0.0f, 144, 104);
        this.field24230.method18633(this.field24231);
        (this.field24232 = new Class6300(this)).method18642(16.0f, 16.0f, 42.0f);
        this.field24232.method18635("main", -8.0f, -4.0f, -8.0f, 16, 32, 16, 0.0f, 0, 0);
        (this.field24233 = new Class6300(this)).method18642(0.0f, 32.0f, -4.0f);
        this.field24233.method18635("main", -6.0f, -2.0f, 0.0f, 12, 32, 12, 0.0f, 196, 0);
        this.field24232.method18633(this.field24233);
        (this.field24234 = new Class6300(this)).method18642(0.0f, 31.0f, 4.0f);
        this.field24234.method18635("main", -9.0f, 0.0f, -20.0f, 18, 6, 24, 0.0f, 112, 0);
        this.field24233.method18633(this.field24234);
        (this.field24235 = new Class6300(this)).method18642(-12.0f, 5.0f, 2.0f);
        this.field24235.method18635("bone", -56.0f, -4.0f, -4.0f, 56, 8, 8, 0.0f, 112, 88);
        this.field24235.method18635("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56, 0.0f, -56, 88);
        (this.field24236 = new Class6300(this)).method18642(-56.0f, 0.0f, 0.0f);
        this.field24236.method18635("bone", -56.0f, -2.0f, -2.0f, 56, 4, 4, 0.0f, 112, 136);
        this.field24236.method18635("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56, 0.0f, -56, 144);
        this.field24235.method18633(this.field24236);
        (this.field24237 = new Class6300(this)).method18642(-12.0f, 20.0f, 2.0f);
        this.field24237.method18635("main", -4.0f, -4.0f, -4.0f, 8, 24, 8, 0.0f, 112, 104);
        (this.field24238 = new Class6300(this)).method18642(0.0f, 20.0f, -1.0f);
        this.field24238.method18635("main", -3.0f, -1.0f, -3.0f, 6, 24, 6, 0.0f, 226, 138);
        this.field24237.method18633(this.field24238);
        (this.field24239 = new Class6300(this)).method18642(0.0f, 23.0f, 0.0f);
        this.field24239.method18635("main", -4.0f, 0.0f, -12.0f, 8, 4, 16, 0.0f, 144, 104);
        this.field24238.method18633(this.field24239);
        (this.field24240 = new Class6300(this)).method18642(-16.0f, 16.0f, 42.0f);
        this.field24240.method18635("main", -8.0f, -4.0f, -8.0f, 16, 32, 16, 0.0f, 0, 0);
        (this.field24241 = new Class6300(this)).method18642(0.0f, 32.0f, -4.0f);
        this.field24241.method18635("main", -6.0f, -2.0f, 0.0f, 12, 32, 12, 0.0f, 196, 0);
        this.field24240.method18633(this.field24241);
        (this.field24242 = new Class6300(this)).method18642(0.0f, 31.0f, 4.0f);
        this.field24242.method18635("main", -9.0f, 0.0f, -20.0f, 18, 6, 24, 0.0f, 112, 0);
        this.field24241.method18633(this.field24242);
    }
    
    public void method17635(final Class852 field24243, final float n, final float n2, final float field24244) {
        this.field24243 = field24243;
        this.field24244 = field24244;
    }
    
    public void method17636(final Class852 class852, final float n, final float n2, final float n3, final float n4, final float n5) {
    }
    
    @Override
    public void method17564(final Class7351 class7351, final Class4150 class7352, final int n, final int n2, final float n3, final float n4, final float n5, final float n6) {
        class7351.method22567();
        final float method35700 = MathHelper.method35700(this.field24244, this.field24243.field4543, this.field24243.field4544);
        this.field24225.field25183 = (float)(Math.sin(method35700 * 6.2831855f) + 1.0) * 0.2f;
        final float n7 = (float)(Math.sin(method35700 * 6.2831855f - 1.0f) + 1.0);
        final float n8 = (n7 * n7 + n7 * 2.0f) * 0.05f;
        class7351.method22564(0.0, n8 - 2.0f, -3.0);
        class7351.method22566(Vector3f.XP.rotationDegrees(n8 * 2.0f));
        float n9 = 0.0f;
        float n10 = 20.0f;
        float n11 = -12.0f;
        final double[] method35701 = this.field24243.method5108(6, this.field24244);
        final float method35702 = MathHelper.method35708(this.field24243.method5108(5, this.field24244)[0] - this.field24243.method5108(10, this.field24244)[0]);
        final float method35703 = MathHelper.method35708(this.field24243.method5108(5, this.field24244)[0] + method35702 / 2.0f);
        final float n12 = method35700 * 6.2831855f;
        for (int i = 0; i < 5; ++i) {
            final double[] method35704 = this.field24243.method5108(5 - i, this.field24244);
            final float n13 = (float)Math.cos(i * 0.45f + n12) * 0.15f;
            this.field24224.field25184 = MathHelper.method35708(method35704[0] - method35701[0]) * 0.017453292f * 1.5f;
            this.field24224.field25183 = n13 + this.field24243.method5124(i, method35701, method35704) * 0.017453292f * 1.5f * 5.0f;
            this.field24224.field25185 = -MathHelper.method35708(method35704[0] - method35703) * 0.017453292f * 1.5f;
            this.field24224.field25181 = n10;
            this.field24224.field25182 = n11;
            this.field24224.field25180 = n9;
            n10 += (float)(Math.sin(this.field24224.field25183) * 10.0);
            n11 -= (float)(Math.cos(this.field24224.field25184) * Math.cos(this.field24224.field25183) * 10.0);
            n9 -= (float)(Math.sin(this.field24224.field25184) * Math.cos(this.field24224.field25183) * 10.0);
            this.field24224.method18643(class7351, class7352, n, n2);
        }
        this.field24223.field25181 = n10;
        this.field24223.field25182 = n11;
        this.field24223.field25180 = n9;
        final double[] method35705 = this.field24243.method5108(0, this.field24244);
        this.field24223.field25184 = MathHelper.method35708(method35705[0] - method35701[0]) * 0.017453292f;
        this.field24223.field25183 = MathHelper.method35708(this.field24243.method5124(6, method35701, method35705)) * 0.017453292f * 1.5f * 5.0f;
        this.field24223.field25185 = -MathHelper.method35708(method35705[0] - method35703) * 0.017453292f;
        this.field24223.method18643(class7351, class7352, n, n2);
        class7351.method22567();
        class7351.method22564(0.0, 1.0, 0.0);
        class7351.method22566(Vector3f.ZP.rotationDegrees(-method35702 * 1.5f));
        class7351.method22564(0.0, -1.0, 0.0);
        this.field24226.field25185 = 0.0f;
        this.field24226.method18643(class7351, class7352, n, n2);
        final float n14 = method35700 * 6.2831855f;
        this.field24227.field25183 = 0.125f - (float)Math.cos(n14) * 0.2f;
        this.field24227.field25184 = -0.25f;
        this.field24227.field25185 = -(float)(Math.sin(n14) + 0.125) * 0.8f;
        this.field24228.field25185 = (float)(Math.sin(n14 + 2.0f) + 0.5) * 0.75f;
        this.field24235.field25183 = this.field24227.field25183;
        this.field24235.field25184 = -this.field24227.field25184;
        this.field24235.field25185 = -this.field24227.field25185;
        this.field24236.field25185 = -this.field24228.field25185;
        this.method17637(class7351, class7352, n, n2, n8, this.field24227, this.field24229, this.field24230, this.field24231, this.field24232, this.field24233, this.field24234);
        this.method17637(class7351, class7352, n, n2, n8, this.field24235, this.field24237, this.field24238, this.field24239, this.field24240, this.field24241, this.field24242);
        class7351.method22568();
        float n15 = -(float)Math.sin(method35700 * 6.2831855f) * 0.0f;
        final float n16 = method35700 * 6.2831855f;
        float field25181 = 10.0f;
        float field25182 = 60.0f;
        float field25183 = 0.0f;
        final double[] method35706 = this.field24243.method5108(11, this.field24244);
        for (int j = 0; j < 12; ++j) {
            final double[] method35707 = this.field24243.method5108(12 + j, this.field24244);
            n15 += (float)(Math.sin(j * 0.45f + n16) * 0.05000000074505806);
            this.field24224.field25184 = (MathHelper.method35708(method35707[0] - method35706[0]) * 1.5f + 180.0f) * 0.017453292f;
            this.field24224.field25183 = n15 + (float)(method35707[1] - method35706[1]) * 0.017453292f * 1.5f * 5.0f;
            this.field24224.field25185 = MathHelper.method35708(method35707[0] - method35703) * 0.017453292f * 1.5f;
            this.field24224.field25181 = field25181;
            this.field24224.field25182 = field25182;
            this.field24224.field25180 = field25183;
            field25181 += (float)(Math.sin(this.field24224.field25183) * 10.0);
            field25182 -= (float)(Math.cos(this.field24224.field25184) * Math.cos(this.field24224.field25183) * 10.0);
            field25183 -= (float)(Math.sin(this.field24224.field25184) * Math.cos(this.field24224.field25183) * 10.0);
            this.field24224.method18643(class7351, class7352, n, n2);
        }
        class7351.method22568();
    }
    
    private void method17637(final Class7351 class7351, final Class4150 class7352, final int n, final int n2, final float n3, final Class6300 class7353, final Class6300 class7354, final Class6300 class7355, final Class6300 class7356, final Class6300 class7357, final Class6300 class7358, final Class6300 class7359) {
        class7357.field25183 = 1.0f + n3 * 0.1f;
        class7358.field25183 = 0.5f + n3 * 0.1f;
        class7359.field25183 = 0.75f + n3 * 0.1f;
        class7354.field25183 = 1.3f + n3 * 0.1f;
        class7355.field25183 = -0.5f - n3 * 0.1f;
        class7356.field25183 = 0.75f + n3 * 0.1f;
        class7353.method18643(class7351, class7352, n, n2);
        class7354.method18643(class7351, class7352, n, n2);
        class7357.method18643(class7351, class7352, n, n2);
    }
}
