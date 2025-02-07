// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;

public class LoginScreen extends Class4841 {
    private TextField inputUsername;
    private TextField inputEmail;
    private TextField inputPassword;
    private TextField inputCatcha;
    private UIButton loginButton;
    private UIButton registerButton;
    private UIButton forgotButton;
    private LoadingIndicator loadingThingy;
    public static int field20841;
    public static int field20842;

    public LoginScreen(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.addToList(new Class4834(this, "Register", 228, 43, ClientFonts.JelloMedium40.getWidth("New Account"), 50, new ColorHelper(ClientColors.DEEP_TEAL.color, ClientColors.DEEP_TEAL.color, ClientColors.DEEP_TEAL.color, -7631989), "New Account", ClientFonts.JelloMedium40));
        this.addToList(this.loginButton = new UIButton(this, "RegisterButton", 468, 291, ClientFonts.JelloLight25.getWidth("Register"), 70, ColorHelper.field25964, "Register", ClientFonts.JelloLight25));
        this.addToList(this.registerButton = new UIButton(this, "LoginButton", 98, 333, ClientFonts.JelloLight14.getWidth("Login"), 14, ColorHelper.field25964, "Login", ClientFonts.JelloLight14));
        this.addToList(this.loadingThingy = new LoadingIndicator(this, "loading", 530, 314, 30, 30));
        this.loadingThingy.method14305(false);
        this.loadingThingy.method14303(true);
        final int n5 = 50;
        final int n6 = 320;
        final int n7 = 106;
        final ColorHelper class4804 = new ColorHelper(-892679478, -892679478, -892679478, ClientColors.MID_GREY.color, Class2056.field11734, Class2056.field11738);
        this.addToList(this.inputUsername = new TextField(this, "Username", 228, n7, n6, n5, class4804, "", "Username"));
        this.inputUsername.setFont(ClientFonts.JelloLight20);
        this.addToList(this.inputEmail = new TextField(this, "Email", 228, n7 + 53, n6, n5, class4804, "", "Email"));
        this.inputEmail.setFont(ClientFonts.JelloLight20);
        this.addToList(this.inputPassword = new TextField(this, "Password", 228, n7 + 106, n6, n5, class4804, "", "Password"));
        this.inputPassword.setFont(ClientFonts.JelloLight20);
        this.inputPassword.method14477(true);
        this.addToList(this.inputCatcha = new TextField(this, "CaptchaBox", 228, n7 + 53 + 135, 80, n5, class4804, "", "Captcha"));
        this.inputCatcha.setFont(ClientFonts.JelloLight20);
        this.inputCatcha.setEnabled(false);
        this.loginButton.doThis((class4803, asd) -> this.method14596());
        this.registerButton.doThis((class4803, asd) -> ((RegisterScreen) this.getParent()).method14780());
    }

    @Override
    public void draw(final float n) {
        super.method14227();
        super.method14228();
        final int n2 = 28;
        RenderUtil.method26904((float) (this.x + n2), (float) (this.y + n2 + 10), 160.0f, 160.0f, ClientAssets.sigma, n);
        final int n3 = 305;
        final int n4 = 316;
        final CaptchaChecker method19344 = Client.getInstance().getNetworkManager().getChallengeResponse();
        if (method19344 != null) {
            this.inputCatcha.setEnabled(method19344.method30471());
            if (method19344.method30471()) {
                RenderUtil.method26874((float) (this.x + n4), (float) (this.y + n3), 114.0f, 40.0f, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.04f));
            }
            if (method19344.method30470() != null) {
                RenderUtil.startScissor((float) (this.x + n4), (float) (this.y + n3), 190.0f, 50.0f);
                RenderUtil.method26905((float) (this.x + n4), (float) (this.y + n3), 190.0f, 190.0f, method19344.method30470());
                RenderUtil.endScissor();
            }
        }
        super.draw(n);
    }

    public void method14596() {
        new Thread(() -> {
            this.loadingThingy.method14305(true);
            this.loginButton.setEnabled(false);

            final CaptchaChecker captchaChecker = Client.getInstance().getNetworkManager().getChallengeResponse();
            if (captchaChecker != null) {
                captchaChecker.setChallengeAnswer(this.inputCatcha.getTypedText());
            }
            Client.getInstance().getNetworkManager().resetLicense();
            Client.getInstance().getNetworkManager().method30448(this.inputUsername.getTypedText(), this.inputPassword.getTypedText(), this.inputEmail.getTypedText(), captchaChecker);
            final RegisterScreen var5 = (RegisterScreen) this.getParent();
            final String s = Client.getInstance().getNetworkManager().newAccount(this.inputUsername.getTypedText());
            if (s != null) {
                var5.method14781("Error", s);
                this.inputCatcha.setTypedText("");
            } else {
                var5.method14781("Success", "You can now login.");
                var5.method14780();
            }
            this.loadingThingy.method14305(false);
            this.loginButton.setEnabled(true);
        }).start();
    }

    static {
        LoginScreen.field20841 = 390;
        LoginScreen.field20842 = 590;
    }
}
