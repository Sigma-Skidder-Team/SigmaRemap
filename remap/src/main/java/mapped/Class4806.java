// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientFonts;

public class Class4806 extends Class4803
{
    public String field20523;
    public Class9572 field20524;
    private static JSONArray field20525;
    private Class4831 field20526;
    
    public Class4806(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4);
        this.field20523 = "";
        this.field20524 = new Class9572(380, 200, Direction.FORWARDS);
        this.method14311(false);
        final Class4831 class4804;
        this.addVisualThing(class4804 = new Class4831(this, "redeemBox", 100, 200, 350, 50, Class4831.field20671, "", "Premium Code"));
        final Class4861 class4805;
        this.addVisualThing(class4805 = new Class4861(this, "redeembtn", 100, 290, 80, 30, new Class6523(ClientColors.LIGHT_GREYISH_BLUE.color, ClientColors.LIGHT_GREYISH_BLUE.color, ClientColors.LIGHT_GREYISH_BLUE.color), "Redeem", ClientFonts.JelloLight20));
        this.addVisualThing(this.field20526 = new Class4831(this, "captcha", 195, 290, 75, 35, Class4831.field20671, "", "Captcha"));
        this.field20526.method14317(ClientFonts.JelloLight18);
        this.field20526.method14297(false);
        class4805.method14260((class4832, n) -> new Thread(() -> {
            Client.method35173().method35201().getChallengeResponse();
            final CaptchaChecker class4834;
            if (class4834 != null) {
                class4834.method30475(this.field20526.method14314());
            }
            this.field20523 = Client.method35173().method35201().method19343(class4833.method14314(), Client.method35173().method35201().getChallengeResponse());
            if (this.field20523 == null) {
                this.field20523 = "";
            }
            if (!(!Client.method35173().method35201().method19352())) {
                this.method14225(() -> ((Class4929)this.method14267()).method14790());
            }
        }).start());
    }
    
    @Override
    public void draw(float n) {
        this.field20524.changeDirection(this.isHovered() ? Direction.BACKWARDS : Direction.FORWARDS);
        n = 1.0f;
        n *= this.field20524.calcPercent();
        final CaptchaChecker method19344 = Client.method35173().method35201().getChallengeResponse();
        if (method19344 != null) {
            this.field20526.method14297(method19344.method30471());
            if (method19344.method30470() != null) {
                RenderUtil.method26869((float)(this.field20478 + 295), (float)(this.field20479 + 280), 190.0f, 50.0f);
                RenderUtil.method26899((float)(this.field20478 + 316), (float)(this.field20479 + 255), 190.0f, 190.0f, method19344.method30470(), ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n));
                RenderUtil.method26872();
            }
        }
        float method19345 = MathUtils.lerp(this.field20524.calcPercent(), 0.17, 1.0, 0.51, 1.0);
        if (this.field20524.getDirection() == Direction.FORWARDS) {
            method19345 = 1.0f;
        }
        this.drawBackground((int)(150.0f * (1.0f - method19345)));
        this.method14228();
        RenderUtil.drawString(ClientFonts.JelloLight36, 100.0f, 100.0f, "Redeem Premium", ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n));
        RenderUtil.drawString(ClientFonts.JelloLight25, 100.0f, 150.0f, "Visit http://sigmaclient.info for more info", ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.6f * n));
        RenderUtil.drawString(ClientFonts.JelloLight18, 100.0f, 263.0f, this.field20523, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.6f * n));
        super.draw(n);
    }
}
