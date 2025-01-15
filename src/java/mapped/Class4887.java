// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4887 extends Class4841
{
    private Class4834 field20887;
    private Class4831 field20888;
    private Class4831 field20889;
    private Class4831 field20890;
    private Class4861 field20891;
    private Class4861 field20892;
    private Class4861 field20893;
    private Class4840 field20894;
    public static int field20895;
    public static int field20896;
    
    public Class4887(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4, false);
        this.method14239(this.field20887 = new Class4834(this, "Login", 228, 43, Class9400.field40325.method23505("Login"), 50, new Class6523(Class265.field1273.field1292, Class265.field1273.field1292, Class265.field1273.field1292, -7631989), "Login", Class9400.field40325));
        this.method14239(this.field20891 = new Class4861(this, "LoginButton", 468, 238, Class9400.field40314.method23505("Login"), 70, Class6523.field25964, "Login", Class9400.field40314));
        this.method14239(this.field20892 = new Class4861(this, "RegisterButton", 88, 250, Class9400.field40311.method23505("Register"), 14, Class6523.field25964, "Register", Class9400.field40311));
        this.method14239(this.field20893 = new Class4861(this, "ForgotButton", 60, 275, Class9400.field40311.method23505("Forgot password?"), 14, Class6523.field25964, "Forgot password?", Class9400.field40311));
        this.method14239(this.field20894 = new Class4840(this, "loading", 511, 260, 30, 30));
        this.field20894.method14305(false);
        this.field20894.method14303(true);
        final int n5 = 50;
        final int n6 = 300;
        final int n7 = 106;
        final Class6523 class4804 = new Class6523(-892679478, -892679478, -892679478, Class265.field1281.field1292, Class2056.field11734, Class2056.field11738);
        this.method14239(this.field20888 = new Class4831(this, "Username", 228, n7, n6, n5, class4804, "", "Username"));
        this.method14239(this.field20889 = new Class4831(this, "Password", 228, n7 + 53, n6, n5, class4804, "", "Password"));
        this.field20888.method14317(Class9400.field40313);
        this.field20889.method14317(Class9400.field40313);
        this.field20889.method14477(true);
        this.method14239(this.field20890 = new Class4831(this, "CaptchaBox", 228, n7 + 135, 84, n5, class4804, "", "Captcha"));
        this.field20890.method14317(Class9400.field40313);
        this.field20890.method14297(false);
        this.field20891.method14260((class4803, n) -> this.method14630());
        this.field20892.method14260((class4803, n) -> ((Class4926)this.method14267()).method14779());
        this.field20893.method14260((class4803, n) -> Class8349.method27845().method980("https://sigmaclient.info/pwdreset.php"));
    }
    
    @Override
    public void method14205(final float n) {
        super.method14227();
        super.method14228();
        final int n2 = 28;
        Class8154.method26904((float)(this.field20478 + n2), (float)(this.field20479 + n2 + 10), 160.0f, 160.0f, Class7853.field32205, n);
        final Class8773 method19344 = Class9463.method35173().method35201().method19344();
        if (method19344 != null) {
            this.field20890.method14297(method19344.method30471());
            if (method19344.method30471()) {
                Class8154.method26874((float)(this.field20478 + 330), (float)(this.field20479 + 255), 114.0f, 40.0f, Class6430.method19118(Class265.field1273.field1292, 0.04f));
            }
            if (method19344.method30470() != null) {
                Class8154.method26869((float)(this.field20478 + 316), (float)(this.field20479 + 255), 190.0f, 50.0f);
                Class8154.method26905((float)(this.field20478 + 316), (float)(this.field20479 + 255), 190.0f, 190.0f, method19344.method30470());
                Class8154.method26872();
            }
        }
        super.method14205(n);
    }
    
    public void method14630() {
        new Thread(() -> {
            this.field20894.method14305(true);
            this.field20891.method14297(false);
            Class9463.method35173().method35201().method19344();
            final Class8773 class8773;
            if (class8773 != null) {
                class8773.method30475(this.field20890.method14314());
            }
            Class9463.method35173().method35201().method19348();
            Class9463.method35173().method35201().method19339(this.field20888.method14314(), this.field20889.method14314(), class8773);
            final String s;
            if (s != null) {
                ((Class4926)this.method14267()).method14781("Error", s);
                this.field20890.method14315("");
            }
            else {
                this.method14517();
            }
            this.field20894.method14305(false);
            this.field20891.method14297(true);
        }).start();
    }
    
    static {
        Class4887.field20895 = 334;
        Class4887.field20896 = 571;
    }
}
