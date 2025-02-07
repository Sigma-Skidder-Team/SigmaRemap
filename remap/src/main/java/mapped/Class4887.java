// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;

public class Class4887 extends Class4841
{
    private Class4834 field20887;
    private TextField field20888;
    private TextField field20889;
    private TextField field20890;
    private UIButton field20891;
    private UIButton field20892;
    private UIButton field20893;
    private Class4840 field20894;
    public static int field20895;
    public static int field20896;
    
    public Class4887(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.addToList(this.field20887 = new Class4834(this, "Login", 228, 43, ClientFonts.JelloMedium40.getWidth("Login"), 50, new ColorHelper(ClientColors.DEEP_TEAL.color, ClientColors.DEEP_TEAL.color, ClientColors.DEEP_TEAL.color, -7631989), "Login", ClientFonts.JelloMedium40));
        this.addToList(this.field20891 = new UIButton(this, "LoginButton", 468, 238, ClientFonts.JelloLight25.getWidth("Login"), 70, ColorHelper.field25964, "Login", ClientFonts.JelloLight25));
        this.addToList(this.field20892 = new UIButton(this, "RegisterButton", 88, 250, ClientFonts.JelloLight14.getWidth("Register"), 14, ColorHelper.field25964, "Register", ClientFonts.JelloLight14));
        this.addToList(this.field20893 = new UIButton(this, "ForgotButton", 60, 275, ClientFonts.JelloLight14.getWidth("Forgot password?"), 14, ColorHelper.field25964, "Forgot password?", ClientFonts.JelloLight14));
        this.addToList(this.field20894 = new Class4840(this, "loading", 511, 260, 30, 30));
        this.field20894.method14305(false);
        this.field20894.method14303(true);
        final int n5 = 50;
        final int n6 = 300;
        final int n7 = 106;
        final ColorHelper class4804 = new ColorHelper(-892679478, -892679478, -892679478, ClientColors.MID_GREY.color, Class2056.field11734, Class2056.field11738);
        this.addToList(this.field20888 = new TextField(this, "Username", 228, n7, n6, n5, class4804, "", "Username"));
        this.addToList(this.field20889 = new TextField(this, "Password", 228, n7 + 53, n6, n5, class4804, "", "Password"));
        this.field20888.setFont(ClientFonts.JelloLight20);
        this.field20889.setFont(ClientFonts.JelloLight20);
        this.field20889.method14477(true);
        this.addToList(this.field20890 = new TextField(this, "CaptchaBox", 228, n7 + 135, 84, n5, class4804, "", "Captcha"));
        this.field20890.setFont(ClientFonts.JelloLight20);
        this.field20890.setEnabled(false);
        this.field20891.doThis((a, b) -> this.method14630());
        this.field20892.doThis((a, b) -> ((Class4926)this.getParent()).method14779());
        this.field20893.doThis((a, b) -> Util.method27845().method980("https://sigmaclient.info/pwdreset.php"));
    }
    
    @Override
    public void draw(final float n) {
        super.method14227();
        super.method14228();
        final int n2 = 28;
        RenderUtil.method26904((float)(this.x + n2), (float)(this.y + n2 + 10), 160.0f, 160.0f, ClientAssets.sigma, n);
        final CaptchaChecker method19344 = Client.getInstance().getNetworkManager().getChallengeResponse();
        if (method19344 != null) {
            this.field20890.setEnabled(method19344.method30471());
            if (method19344.method30471()) {
                RenderUtil.method26874((float)(this.x + 330), (float)(this.y + 255), 114.0f, 40.0f, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.04f));
            }
            if (method19344.method30470() != null) {
                RenderUtil.startScissor((float)(this.x + 316), (float)(this.y + 255), 190.0f, 50.0f);
                RenderUtil.method26905((float)(this.x + 316), (float)(this.y + 255), 190.0f, 190.0f, method19344.method30470());
                RenderUtil.endScissor();
            }
        }
        super.draw(n);
    }
    
    public void method14630() {
        new Thread(() -> {
            this.field20894.method14305(true);
            this.field20891.setEnabled(false);
            Client.getInstance().getNetworkManager().getChallengeResponse();
            final CaptchaChecker captchaChecker = new CaptchaChecker("", true);
            if (captchaChecker != null) {
                captchaChecker.method30475(this.field20890.getTypedText());
            }
            Client.getInstance().getNetworkManager().method19348();
            Client.getInstance().getNetworkManager().method19339(this.field20888.getTypedText(), this.field20889.getTypedText(), captchaChecker);
            final String s = "asd";
            if (s != null) {
                ((Class4926)this.getParent()).method14781("Error", s);
                this.field20890.method14315("");
            }
            else {
                this.method14517();
            }
            this.field20894.method14305(false);
            this.field20891.setEnabled(true);
        }).start();
    }
    
    static {
        Class4887.field20895 = 334;
        Class4887.field20896 = 571;
    }
}
