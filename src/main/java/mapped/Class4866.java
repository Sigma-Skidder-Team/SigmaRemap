// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4866 extends Class4841
{
    private Class4834 field20832;
    private Class4831 field20833;
    private Class4831 field20834;
    private Class4831 field20835;
    private Class4831 field20836;
    private Class4861 field20837;
    private Class4861 field20838;
    private Class4861 field20839;
    private Class4840 field20840;
    public static int field20841;
    public static int field20842;
    
    public Class4866(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4, false);
        this.method14239(this.field20832 = new Class4834(this, "Register", 228, 43, Class9400.field40325.method23505("New Account"), 50, new Class6523(Class265.field1273.field1292, Class265.field1273.field1292, Class265.field1273.field1292, -7631989), "New Account", Class9400.field40325));
        this.method14239(this.field20837 = new Class4861(this, "RegisterButton", 468, 291, Class9400.field40314.method23505("Register"), 70, Class6523.field25964, "Register", Class9400.field40314));
        this.method14239(this.field20838 = new Class4861(this, "LoginButton", 98, 333, Class9400.field40311.method23505("Login"), 14, Class6523.field25964, "Login", Class9400.field40311));
        this.method14239(this.field20840 = new Class4840(this, "loading", 530, 314, 30, 30));
        this.field20840.method14305(false);
        this.field20840.method14303(true);
        final int n5 = 50;
        final int n6 = 320;
        final int n7 = 106;
        final Class6523 class4804 = new Class6523(-892679478, -892679478, -892679478, Class265.field1281.field1292, Class2056.field11734, Class2056.field11738);
        this.method14239(this.field20833 = new Class4831(this, "Username", 228, n7, n6, n5, class4804, "", "Username"));
        this.field20833.method14317(Class9400.field40313);
        this.method14239(this.field20834 = new Class4831(this, "Email", 228, n7 + 53, n6, n5, class4804, "", "Email"));
        this.field20834.method14317(Class9400.field40313);
        this.method14239(this.field20835 = new Class4831(this, "Password", 228, n7 + 106, n6, n5, class4804, "", "Password"));
        this.field20835.method14317(Class9400.field40313);
        this.field20835.method14477(true);
        this.method14239(this.field20836 = new Class4831(this, "CaptchaBox", 228, n7 + 53 + 135, 80, n5, class4804, "", "Captcha"));
        this.field20836.method14317(Class9400.field40313);
        this.field20836.method14297(false);
        this.field20837.method14260((class4803, n) -> this.method14596());
        this.field20838.method14260((class4803, n) -> ((Class4926)this.method14267()).method14780());
    }
    
    @Override
    public void method14205(final float n) {
        super.method14227();
        super.method14228();
        final int n2 = 28;
        Class8154.method26904((float)(this.field20478 + n2), (float)(this.field20479 + n2 + 10), 160.0f, 160.0f, Class7853.field32205, n);
        final int n3 = 305;
        final int n4 = 316;
        final Class8773 method19344 = Class9463.method35173().method35201().method19344();
        if (method19344 != null) {
            this.field20836.method14297(method19344.method30471());
            if (method19344.method30471()) {
                Class8154.method26874((float)(this.field20478 + n4), (float)(this.field20479 + n3), 114.0f, 40.0f, Class6430.method19118(Class265.field1273.field1292, 0.04f));
            }
            if (method19344.method30470() != null) {
                Class8154.method26869((float)(this.field20478 + n4), (float)(this.field20479 + n3), 190.0f, 50.0f);
                Class8154.method26905((float)(this.field20478 + n4), (float)(this.field20479 + n3), 190.0f, 190.0f, method19344.method30470());
                Class8154.method26872();
            }
        }
        super.method14205(n);
    }
    
    public void method14596() {
        new Thread(() -> {
            this.field20840.method14305(true);
            this.field20837.method14297(false);
            Class9463.method35173().method35201().method19344();
            final Class8773 class8773;
            if (class8773 != null) {
                class8773.method30475(this.field20836.method14314());
            }
            Class9463.method35173().method35201().method19348();
            Class9463.method35173().method35201().method19340(this.field20833.method14314(), this.field20835.method14314(), this.field20834.method14314(), class8773);
            final Class4926 class8774 = (Class4926)this.method14267();
            final String s;
            if (s != null) {
                class8774.method14781("Error", s);
                this.field20836.method14315("");
            }
            else {
                class8774.method14781("Success", "You can now login.");
                class8774.method14780();
            }
            this.field20840.method14305(false);
            this.field20837.method14297(true);
        }).start();
    }
    
    static {
        Class4866.field20841 = 390;
        Class4866.field20842 = 590;
    }
}
