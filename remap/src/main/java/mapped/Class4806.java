// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;

public class Class4806 extends Class4803
{
    public String field20523;
    public Class9572 field20524;
    private static Class88 field20525;
    private Class4831 field20526;
    
    public Class4806(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4);
        this.field20523 = "";
        this.field20524 = new Class9572(380, 200, Class2186.field12965);
        this.method14311(false);
        final Class4831 class4804;
        this.method14239(class4804 = new Class4831(this, "redeemBox", 100, 200, 350, 50, Class4831.field20671, "", "Premium Code"));
        final Class4861 class4805;
        this.method14239(class4805 = new Class4861(this, "redeembtn", 100, 290, 80, 30, new Class6523(Class265.field1278.field1292, Class265.field1278.field1292, Class265.field1278.field1292), "Redeem", ClientFonts.JelloLight20));
        this.method14239(this.field20526 = new Class4831(this, "captcha", 195, 290, 75, 35, Class4831.field20671, "", "Captcha"));
        this.field20526.method14317(ClientFonts.JelloLight18);
        this.field20526.method14297(false);
        class4805.method14260((class4832, n) -> new Thread(() -> {
            Client.method35173().method35201().method19344();
            final Class8773 class4834;
            if (class4834 != null) {
                class4834.method30475(this.field20526.method14314());
            }
            this.field20523 = Client.method35173().method35201().method19343(class4833.method14314(), Client.method35173().method35201().method19344());
            if (this.field20523 == null) {
                this.field20523 = "";
            }
            if (!(!Client.method35173().method35201().method19352())) {
                this.method14225(() -> ((Class4929)this.method14267()).method14790());
            }
        }).start());
    }
    
    @Override
    public void method14205(float n) {
        this.field20524.method35855(this.method14304() ? Class2186.field12964 : Class2186.field12965);
        n = 1.0f;
        n *= this.field20524.method35858();
        final Class8773 method19344 = Client.method35173().method35201().method19344();
        if (method19344 != null) {
            this.field20526.method14297(method19344.method30471());
            if (method19344.method30470() != null) {
                Class8154.method26869((float)(this.field20478 + 295), (float)(this.field20479 + 280), 190.0f, 50.0f);
                Class8154.method26899((float)(this.field20478 + 316), (float)(this.field20479 + 255), 190.0f, 190.0f, method19344.method30470(), Class6430.method19118(Class265.field1278.field1292, n));
                Class8154.method26872();
            }
        }
        float method19345 = Class8862.method31033(this.field20524.method35858(), 0.17, 1.0, 0.51, 1.0);
        if (this.field20524.method35857() == Class2186.field12965) {
            method19345 = 1.0f;
        }
        this.method14294((int)(150.0f * (1.0f - method19345)));
        this.method14228();
        Class8154.method26889(ClientFonts.JelloLight36, 100.0f, 100.0f, "Redeem Premium", Class6430.method19118(Class265.field1278.field1292, n));
        Class8154.method26889(ClientFonts.JelloLight25, 100.0f, 150.0f, "Visit http://sigmaclient.info for more info", Class6430.method19118(Class265.field1278.field1292, 0.6f * n));
        Class8154.method26889(ClientFonts.JelloLight18, 100.0f, 263.0f, this.field20523, Class6430.method19118(Class265.field1278.field1292, 0.6f * n));
        super.method14205(n);
    }
}
