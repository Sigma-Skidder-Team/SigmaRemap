// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import slick2d.Texture;

import java.io.IOException;
import java.util.Map;

public class Class4930 extends Class4800
{
    private static Minecraft field21102;
    private static float field21103;
    private float field21104;
    private Class4900 field21105;
    private Class4817 field21106;
    private Class4844 field21107;
    private int field21108;
    private int field21109;
    private int field21110;
    private int field21111;
    private int field21112;
    public boolean field21113;
    private Texture field21114;
    
    public Class4930() {
        super("JelloChat");
        this.field21108 = 20;
        this.field21109 = 642;
        this.field21110 = 410;
        this.field21111 = 55;
        this.field21112 = 200;
        this.field21113 = true;
        this.addToList(this.field21105 = new Class4900(this, "input", this.field21108, this.method14278() - this.field21111 - this.field21108, this.field21109, this.field21111));
        this.addToList(this.field21106 = new Class4817(this, "navbar", this.field21108, this.method14278() - this.field21111 - this.field21108 * 2 - this.field21110 + 80, this.field21112, this.field21110 - 90));
        this.addToList(this.field21107 = new Class4844(this, "chatView", this.field21108 + this.field21112, this.method14278() - this.field21111 - this.field21108 * 2 - this.field21110, this.field21109 - this.field21112, this.field21110));
        final int n = 55;
        System.out.println("loading");
        for (final Map.Entry<K, Class6538> entry : Client.getInstance().getNetworkManager().combatTracker.method33655().entrySet()) {
            System.out.println("added " + entry.getValue().field25988);
            this.field21106.addToList(new Class4856(this.field21106, entry.getValue().field25987 + "_" + this.field21106.method14250().size(), 0, 0, this.field21106.method14276(), n, entry.getValue().field25986, entry.getValue().field25989));
        }
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        this.setListening(false);
        this.field21109 = 642;
        this.field21105.method14277(this.field21109);
    }
    
    @Override
    public int method14201() {
        return 60;
    }
    
    public void method14804(final String s) {
        this.field21107.method14522(s);
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (n == 256) {
            Class4930.field21102.displayGuiScreen(null);
        }
    }
    
    @Override
    public void draw(float method25031) {
        this.field21104 = Math.min(1.0f, this.field21104 + 0.1f);
        this.field21105.drawBackground(this.field21111 + this.field21108 - (int)(Class7707.method24584(this.field21104, 0.0f, 1.0f, 1.0f) * (this.field21111 + this.field21108)));
        this.drawBackground((int)((1.0f - this.field21104) * 10.0f));
        this.method14228();
        final int field21108 = this.field21108;
        final int n = this.method14278() - this.field21111 - this.field21108 * 2 - 410;
        final int field21109 = this.field21109;
        final int field21110 = this.field21110;
        try {
            if (this.field21113) {
                this.field21114 = BufferedImageUtil.getTexture("blur", BufferedImage.method20836(BufferedImage.method20830(field21108, n, 200, field21110, 10, 14, 0, true), 0.0f, 1.1f, 1.3f));
            }
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
        this.field21113 = !this.field21113;
        method25031 = Class7791.method25031(this.field21104, 0.0f, 1.0f, 1.0f);
        RenderUtil.method26913((float)(field21108 + 5), (float)(n + 5), (float)(this.field21112 - 10), (float)(field21110 - 10), 25.0f, method25031 * 0.4f);
        RenderUtil.method26921((float)field21108, (float)n, (float)field21109, (float)field21110, 10.0f);
        if (this.field21114 != null) {
            RenderUtil.drawImage((float)field21108, (float)n, (float)this.field21112, (float)field21110, this.field21114, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, method25031));
        }
        RenderUtil.method26876((float)field21108, (float)n, (float)(field21108 + this.field21112), (float)(n + 80), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.14f));
        RenderUtil.method26928();
        RenderUtil.method26870(field21108 + this.field21112, n - this.field21108, field21108 + field21109 + this.field21108, n + field21110 + this.field21108);
        RenderUtil.method26917(field21108, n, field21109, field21110, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, method25031));
        RenderUtil.endScissor();
        RenderUtil.method26870(field21108 - this.field21108, n - this.field21108, field21108 + this.field21112, n + field21110 + this.field21108);
        RenderUtil.method26917(field21108, n, field21109, field21110, ColorUtils.applyAlpha(-2236963, method25031 * 0.75f));
        RenderUtil.method26876((float)(field21108 + this.field21112 - 1), (float)n, (float)(field21108 + this.field21112), (float)(n + field21110), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.05f));
        RenderUtil.endScissor();
        super.draw(method25031);
    }
    
    static {
        Class4930.field21102 = Minecraft.method5277();
    }
}
