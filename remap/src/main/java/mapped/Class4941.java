// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Texture;

public class Class4941 extends Class4800
{
    private int field21221;
    private int field21222;
    private boolean field21223;
    public static Animation field21224;
    private Texture field21225;
    private final Class4813 field21226;
    public static Screen field21227;
    
    public Class4941() {
        super("options");
        this.field21221 = 0;
        this.field21222 = 0;
        this.field21223 = true;
        this.setListening(false);
        final int max = Math.max((int)(this.field20481 * 0.8f), 420);
        final int n = (int)(this.field20480 * 0.8f);
        this.addToList(this.field21226 = new Class4813(this, "centerBlock", this.method14276() - n, this.method14278() - max, n - (this.method14276() - n), max - (this.method14278() - max)));
        Class4941.field21224 = new Animation(300, 100);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        if (Class4941.field21224.getDirection() == Direction.FORWARDS) {
            if (Class4941.field21224.calcPercent() == 0.0f) {
                if (Class4941.field21227 != null) {
                    Minecraft.getInstance().displayGuiScreen(Class4941.field21227);
                }
            }
        }
        super.method14200(n, n2);
    }
    
    @Override
    public void draw(final float n) {
        float n2 = 1.3f - Class7707.method24584(Class4941.field21224.calcPercent(), 0.0f, 1.0f, 1.0f) * 0.3f;
        float method35858 = 1.0f;
        if (Class4941.field21224.getDirection() == Direction.FORWARDS) {
            n2 = 0.7f + Class7791.method25030(Class4941.field21224.calcPercent(), 0.0f, 1.0f, 1.0f) * 0.3f;
            method35858 = Class4941.field21224.calcPercent();
        }
        RenderUtil.method26881(0, 0, this.method14276(), this.method14278(), ColorUtils.method19120(-1072689136, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.1f), method35858), ColorUtils.method19120(-804253680, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.1f), method35858));
        this.method14288(n2, n2);
        this.method14227();
        super.draw(Class4941.field21224.calcPercent());
    }
    
    private void method14886(final float n) {
        final int field21222 = this.method14320() * -1;
        final float n2 = this.method14321() / (float)this.method14276() * -114.0f;
        if (this.field21223) {
            this.field21221 = (int)n2;
            this.field21222 = field21222;
            this.field21223 = false;
        }
        final float n3 = n2 - this.field21221;
        final float n4 = (float)(field21222 - this.field21222);
        GL11.glPushMatrix();
        RenderUtil.method26898((float)this.field21222, (float)this.field21221, (float)(this.method14276() * 2), (float)(this.method14278() + 114), this.field21225, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n));
        GL11.glPopMatrix();
        final float n5 = 0.5f;
        if (n2 != this.field21221) {
            this.field21221 += (int)(n3 * n5);
        }
        if (field21222 != this.field21222) {
            this.field21222 += (int)(n4 * n5);
        }
    }
    
    public static void method14887(final Screen field21227) {
        Class4941.field21227 = field21227;
        Class4941.field21224.changeDirection(Direction.FORWARDS);
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (n == 256) {
            Minecraft.getInstance().displayGuiScreen(null);
        }
    }
    
    static {
        Class4941.field21224 = new Animation(300, 200);
        Class4941.field21227 = null;
    }
}
