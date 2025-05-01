// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;
import com.mentalfrostbyte.jello.auth.Challenge;

public class LoginPanel extends Panel {
    private final TextField username;
    private final TextField password;
    private final TextField captchaAnswer;
    private final UIButton loginButton;
    private final UIButton registerButton;
    private final UIButton forgotButton;
    private final LoadingIndicator loadingThing;
    public static int field20895;
    public static int field20896;

    public LoginPanel(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.addToList(new Class4834(this, "Login", 228, 43, ClientFonts.JelloMedium40.getWidth("Login"), 50, new ColorHelper(ClientColors.DEEP_TEAL.color, ClientColors.DEEP_TEAL.color, ClientColors.DEEP_TEAL.color, -7631989), "Login", ClientFonts.JelloMedium40));
        this.addToList(this.loginButton = new UIButton(this, "LoginButton", 468, 238, ClientFonts.JelloLight25.getWidth("Login"), 70, ColorHelper.field25964, "Login", ClientFonts.JelloLight25));
        this.addToList(this.registerButton = new UIButton(this, "RegisterButton", 88, 250, ClientFonts.JelloLight14.getWidth("Register"), 14, ColorHelper.field25964, "Register", ClientFonts.JelloLight14));
        this.addToList(this.forgotButton = new UIButton(this, "ForgotButton", 60, 275, ClientFonts.JelloLight14.getWidth("Forgot password?"), 14, ColorHelper.field25964, "Forgot password?", ClientFonts.JelloLight14));
        this.addToList(this.loadingThing = new LoadingIndicator(this, "loading", 511, 260, 30, 30));
        this.loadingThing.setVisible(false);
        this.loadingThing.method14303(true);
        final int n5 = 50;
        final int n6 = 300;
        final int n7 = 106;
        final ColorHelper class4804 = new ColorHelper(-892679478, -892679478, -892679478, ClientColors.MID_GREY.color, Class2056.field11734, Class2056.field11738);
        this.addToList(this.username = new TextField(this, "Username", 228, n7, n6, n5, class4804, "", "Username"));
        this.addToList(this.password = new TextField(this, "Password", 228, n7 + 53, n6, n5, class4804, "", "Password"));
        this.username.setFont(ClientFonts.JelloLight20);
        this.password.setFont(ClientFonts.JelloLight20);
        this.password.method14477(true);
        this.addToList(this.captchaAnswer = new TextField(this, "CaptchaBox", 228, n7 + 135, 84, n5, class4804, "", "Captcha"));
        this.captchaAnswer.setFont(ClientFonts.JelloLight20);
        this.captchaAnswer.setEnabled(false);
        this.loginButton.doThis((a, b) -> this.method14630());
        this.registerButton.doThis((a, b) -> ((RegisterScreen) this.getParent()).method14779());
        this.forgotButton.doThis((a, b) -> Util.method27845().method980("https://sigmaclient.info/pwdreset.php"));
    }

    @Override
    public void draw(final float partialTicks) {
        super.method14227();
        super.translate();
        final int n2 = 28;
        RenderUtil.method26904((float) (this.x + n2), (float) (this.y + n2 + 10), 160.0f, 160.0f, ClientAssets.sigma, partialTicks);
        final Challenge challenge = Client.getInstance().getNetworkManager().getChallengeResponse();
        if (challenge != null) {
            this.captchaAnswer.setEnabled(challenge.isCaptcha());
            if (challenge.isCaptcha()) {
                RenderUtil.method26874((float) (this.x + 330), (float) (this.y + 255), 114.0f, 40.0f, AllUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.04f));
            }
            if (challenge.getCaptcha() != null) {
                RenderUtil.startScissor((float) (this.x + 316), (float) (this.y + 255), 190.0f, 50.0f);
                RenderUtil.drawImage((float) (this.x + 316), (float) (this.y + 255), 190.0f, 190.0f, challenge.getCaptcha());
                RenderUtil.endScissor();
            }
        }
        super.draw(partialTicks);
    }

    public void method14630() {
        new Thread(() -> {
            this.loadingThing.setVisible(true);
            this.loginButton.setEnabled(false);
            Client.getInstance().getNetworkManager().getChallengeResponse();
            final Challenge challenge = new Challenge("", true);
            if (challenge != null) {
                challenge.setAnswer(this.captchaAnswer.getTypedText());
            }
            Client.getInstance().getNetworkManager().resetLicense();
            final String msg = Client.getInstance().getNetworkManager().login(this.username.getTypedText(), this.password.getTypedText(), challenge);
            if (msg != null) {
                ((RegisterScreen) this.getParent()).show("Error", msg);
                this.captchaAnswer.setTypedText("");
            } else {
                this.method14517();
            }
            this.captchaAnswer.setTypedText("");
            this.loadingThing.setVisible(false);
            this.loginButton.setEnabled(true);
        }).start();
    }

    static {
        LoginPanel.field20895 = 334;
        LoginPanel.field20896 = 571;
    }
}
