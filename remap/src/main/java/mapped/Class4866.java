// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;

public class Class4866 extends Class4841
{
    private Class4834 field20832;
    private TextField field20833;
    private TextField field20834;
    private TextField field20835;
    private TextField field20836;
    private UIButton field20837;
    private UIButton field20838;
    private UIButton field20839;
    private Class4840 field20840;
    public static int field20841;
    public static int field20842;
    
    public Class4866(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.addToList(this.field20832 = new Class4834(this, "Register", 228, 43, ClientFonts.JelloMedium40.getWidth("New Account"), 50, new ColorHelper(ClientColors.DEEP_TEAL.color, ClientColors.DEEP_TEAL.color, ClientColors.DEEP_TEAL.color, -7631989), "New Account", ClientFonts.JelloMedium40));
        this.addToList(this.field20837 = new UIButton(this, "RegisterButton", 468, 291, ClientFonts.JelloLight25.getWidth("Register"), 70, ColorHelper.field25964, "Register", ClientFonts.JelloLight25));
        this.addToList(this.field20838 = new UIButton(this, "LoginButton", 98, 333, ClientFonts.JelloLight14.getWidth("Login"), 14, ColorHelper.field25964, "Login", ClientFonts.JelloLight14));
        this.addToList(this.field20840 = new Class4840(this, "loading", 530, 314, 30, 30));
        this.field20840.method14305(false);
        this.field20840.method14303(true);
        final int n5 = 50;
        final int n6 = 320;
        final int n7 = 106;
        final ColorHelper class4804 = new ColorHelper(-892679478, -892679478, -892679478, ClientColors.MID_GREY.color, Class2056.field11734, Class2056.field11738);
        this.addToList(this.field20833 = new TextField(this, "Username", 228, n7, n6, n5, class4804, "", "Username"));
        this.field20833.setFont(ClientFonts.JelloLight20);
        this.addToList(this.field20834 = new TextField(this, "Email", 228, n7 + 53, n6, n5, class4804, "", "Email"));
        this.field20834.setFont(ClientFonts.JelloLight20);
        this.addToList(this.field20835 = new TextField(this, "Password", 228, n7 + 106, n6, n5, class4804, "", "Password"));
        this.field20835.setFont(ClientFonts.JelloLight20);
        this.field20835.method14477(true);
        this.addToList(this.field20836 = new TextField(this, "CaptchaBox", 228, n7 + 53 + 135, 80, n5, class4804, "", "Captcha"));
        this.field20836.setFont(ClientFonts.JelloLight20);
        this.field20836.setEnabled(false);
        this.field20837.doThis((class4803, n) -> this.method14596());
        this.field20838.doThis((class4803, n) -> ((Class4926)this.getParent()).method14780());
    }
    
    @Override
    public void draw(final float n) {
        super.method14227();
        super.method14228();
        final int n2 = 28;
        RenderUtil.method26904((float)(this.x + n2), (float)(this.y + n2 + 10), 160.0f, 160.0f, ClientAssets.sigma, n);
        final int n3 = 305;
        final int n4 = 316;
        final CaptchaChecker method19344 = Client.getInstance().getNetworkManager().getChallengeResponse();
        if (method19344 != null) {
            this.field20836.setEnabled(method19344.method30471());
            if (method19344.method30471()) {
                RenderUtil.method26874((float)(this.x + n4), (float)(this.y + n3), 114.0f, 40.0f, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.04f));
            }
            if (method19344.method30470() != null) {
                RenderUtil.startScissor((float)(this.x + n4), (float)(this.y + n3), 190.0f, 50.0f);
                RenderUtil.method26905((float)(this.x + n4), (float)(this.y + n3), 190.0f, 190.0f, method19344.method30470());
                RenderUtil.endScissor();
            }
        }
        super.draw(n);
    }
    
    public void method14596() {
        new Thread(() -> {
            this.field20840.method14305(true);
            this.field20837.setEnabled(false);
            Client.getInstance().getNetworkManager().getChallengeResponse();
            final CaptchaChecker captchaChecker;
            if (captchaChecker != null) {
                captchaChecker.method30475(this.field20836.getTypedText());
            }
            Client.getInstance().getNetworkManager().method19348();
            Client.getInstance().getNetworkManager().method19340(this.field20833.getTypedText(), this.field20835.getTypedText(), this.field20834.getTypedText(), captchaChecker);
            final Class4926 class8774 = (Class4926)this.getParent();
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
            this.field20837.setEnabled(true);
        }).start();
    }
    
    static {
        Class4866.field20841 = 390;
        Class4866.field20842 = 590;
    }
}
