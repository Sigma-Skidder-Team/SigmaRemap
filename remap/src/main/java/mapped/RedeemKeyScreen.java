// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientFonts;

public class RedeemKeyScreen extends CustomGuiScreen
{
    public String field20523;
    public Animation animation;
    private final TextField captchaField;
    
    public RedeemKeyScreen(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4);
        this.field20523 = "";
        this.animation = new Animation(380, 200, Direction.FORWARDS);
        this.setListening(false);
        final TextField redeemBox;
        this.addToList(redeemBox = new TextField(this, "redeemBox", 100, 200, 350, 50, TextField.field20671, "", "Premium Code"));
        final UIButton redeemButton;
        this.addToList(redeemButton = new UIButton(this, "redeembtn", 100, 290, 80, 30, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.color, ClientColors.LIGHT_GREYISH_BLUE.color, ClientColors.LIGHT_GREYISH_BLUE.color), "Redeem", ClientFonts.JelloLight20));
        this.addToList(this.captchaField = new TextField(this, "captcha", 195, 290, 75, 35, TextField.field20671, "", "Captcha"));
        this.captchaField.setFont(ClientFonts.JelloLight18);
        this.captchaField.setEnabled(false);
        redeemButton.doThis((var2x, var3x) -> new Thread(() -> {
            final CaptchaChecker captcha = Client.getInstance().getNetworkManager().getChallengeResponse();
            if (captcha != null) {
                captcha.setChallengeAnswer(this.captchaField.getTypedText());
            }
            this.field20523 = Client.getInstance().getNetworkManager().redeemPremium(redeemBox.getTypedText(), Client.getInstance().getNetworkManager().getChallengeResponse());
            if (this.field20523 == null) {
                this.field20523 = "";
            }
            if (Client.getInstance().getNetworkManager().isPremium()) {
                this.runThisOnDimensionUpdate(() -> ((MainMenuScreen)this.getParent()).goOut());
            }
        }).start());
    }
    
    @Override
    public void draw(float partialTicks) {
        this.animation.changeDirection(this.isHovered() ? Direction.BACKWARDS : Direction.FORWARDS);
        partialTicks = 1.0f;
        partialTicks *= this.animation.calcPercent();
        final CaptchaChecker captchaChecker = Client.getInstance().getNetworkManager().getChallengeResponse();
        if (captchaChecker != null) {
            this.captchaField.setEnabled(captchaChecker.method30471());
            if (captchaChecker.method30470() != null) {
                RenderUtil.startScissor((float)(this.x + 295), (float)(this.y + 280), 190.0f, 50.0f);
                RenderUtil.drawImage((float)(this.x + 316), (float)(this.y + 255), 190.0f, 190.0f, captchaChecker.method30470(), ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, partialTicks));
                RenderUtil.endScissor();
            }
        }
        float method19345 = MathUtils.lerp(this.animation.calcPercent(), 0.17, 1.0, 0.51, 1.0);
        if (this.animation.getDirection() == Direction.FORWARDS) {
            method19345 = 1.0f;
        }
        this.drawBackground((int)(150.0f * (1.0f - method19345)));
        this.method14228();
        RenderUtil.drawString(ClientFonts.JelloLight36, 100.0f, 100.0f, "Redeem Premium", ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, partialTicks));
        RenderUtil.drawString(ClientFonts.JelloLight25, 100.0f, 150.0f, "Visit http://sigmaclient.info for more info", ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.6f * partialTicks));
        RenderUtil.drawString(ClientFonts.JelloLight18, 100.0f, 263.0f, this.field20523, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.6f * partialTicks));
        super.draw(partialTicks);
    }
}
