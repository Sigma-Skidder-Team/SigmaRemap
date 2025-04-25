// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import slick2d.Texture;

import java.util.Date;

public class Class4935 extends Class4800
{
    private static Minecraft field21156;
    private Texture field21157;
    public Date field21158;
    public Class4843 field21159;
    public boolean field21160;
    public boolean field21161;
    public int field21162;
    public boolean field21163;
    public Class4862 field21164;
    private boolean field21165;
    private boolean field21166;
    
    public Class4935() {
        super("KeybindManager");
        this.field21160 = false;
        this.field21158 = new Date();
        final int max = Math.max(300, Math.min(850, Minecraft.getInstance().window.method7694() - 40));
        final int max2 = Math.max(200, Math.min(550, Minecraft.getInstance().window.method7695() - 80));
        this.addToList(this.field21159 = new Class4843(this, "mapView", (this.field20480 - max) / 2, (this.field20481 - max2) / 2, max, max2));
        this.field21159.field20752.method14719((class4936, n, n2, class4937) -> class4935.method14225(new Class1271(this, class4935, n, n2, class4937)));
        this.field21159.field20752.method14721(class4901 -> this.method14839());
        ColorUtils.method19169();
    }
    
    private void method14838(final Class4862 class4862) {
        class4862.method14580((class4862, s, class4863, n) -> {
            this.field21159.field20753.method14398(s, class4863, n);
            Client.getInstance().method35200().method24263(new Class8124(s, class4863.getX(), class4863.getZ(), n));
            this.method14839();
        });
    }
    
    private void method14839() {
        for (final CustomGuiScreen customGuiScreen : this.method14250()) {
            if (!(customGuiScreen instanceof Class4862)) {
                continue;
            }
            final Class4862 class4804 = (Class4862) customGuiScreen;
            this.runThisOnDimensionUpdate(new Class1036(this, this, customGuiScreen));
        }
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        this.setListening(false);
    }
    
    @Override
    public int method14201() {
        return 60;
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (n == 256) {
            ColorUtils.method19172();
            Class4935.field21156.displayGuiScreen(null);
        }
    }
    
    @Override
    public void draw(float n) {
        n = Math.min(200L, new Date().getTime() - this.field21158.getTime()) / 200.0f;
        final float method24584 = Class7707.method24584(n, 0.0f, 1.0f, 1.0f);
        this.method14288(0.8f + method24584 * 0.2f, 0.8f + method24584 * 0.2f);
        RenderUtil.method26876((float)this.x, (float)this.y, (float)(this.x + this.field20480), (float)(this.y + this.field20481), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.25f * n));
        super.method14227();
        super.draw(n);
    }
    
    static {
        Class4935.field21156 = Minecraft.getInstance();
    }
}
