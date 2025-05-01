// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;
import com.mentalfrostbyte.jello.auth.Encryptor;
import org.newdawn.slick.Texture;

public class Class4897 extends Panel
{
    public float field20943;
    private final int field20944 = 10;
    private final int field20945 = 60;
    public int field20508;
    public int field20509;
    public int field20946;
    public int field20947;
    private Encryptor field20948;
    
    public Class4897(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final String s2) {
        super(customGuiScreen, s, n, n2, n3, n4, ColorHelper.field25964, s2, false);
        this.field20943 = 0.0f;
        this.field20496 = ClientFonts.JelloLight20;
    }
    
    @Override
    public void method14200(final int field20508, final int field20509) {
        this.field20508 = field20508;
        this.field20509 = field20509;
    }
    
    @Override
    public void draw(final float partialTicks) {
        this.field20948 = Client.getInstance().getNetworkManager().getEncryptor();
        String field32930 = "Log in";
        final Texture field32931 = ClientAssets.account;
        if (this.field20948 != null) {
            field32930 = this.field20948.username;
        }
        this.method14277(this.field20496.getWidth(field32930) + 50 + 60);
        this.method14273(Minecraft.getInstance().window.method7694() - this.field20480 - 20);
        this.field20943 = Math.max(0.0f, Math.min(1.0f, this.field20943 + ((this.field20508 >= this.x && this.field20509 <= this.y + this.method14278()) ? 0.1f : -0.1f)));
        RenderUtil.method26913((float)this.x, (float)this.y, (float)this.method14276(), (float)this.method14278(), 20.0f, this.field20943 * 0.2f * partialTicks);
        RenderUtil.method26876((float)this.x, (float)this.y, (float)(this.x + this.method14276()), (float)(this.y + this.method14278()), AllUtils.applyAlpha(ClientColors.DULL_GREEN.color, (0.2f * this.field20943 + (this.method14309() ? 0.2f : 0.0f)) * partialTicks));
        final float n2 = (float)(this.x + this.field20480 - 60 - 10);
        final float n3 = (float)(this.y + 10);
        RenderUtil.drawImage((float)(this.x + this.field20480 - 60 - 10), (float)(this.y + 10), 60.0f, 60.0f, field32931, AllUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, (0.5f + 0.5f * this.field20943) * partialTicks));
        RenderUtil.drawString(this.field20496, (float)(this.x + this.field20480 - 90 - this.field20496.getWidth(field32930)), (float)(this.y + 27), field32930, AllUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, (0.5f + 0.5f * this.field20943) * partialTicks));
        super.draw(partialTicks);
    }
}
