// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.UglyClickGUICategory;

public class Class4799 extends Class4800
{
    private static Minecraft field20454;
    private static Class9572 field20455;
    private static boolean field20456;
    private Class4807 field20457;
    
    public Class4799() {
        super("ClassicScreen");
        Class4799.field20455 = new Class9572(250, 200, Direction.BACKWARDS);
        this.method14199();
        ColorUtils.method19169();
    }
    
    public void method14197() {
        this.method14225(() -> this.method14199());
    }
    
    public void method14198(final String s, final Category... array) {
        this.method14225(() -> {
            if (this.field20457 != null) {
                this.method14245(this.field20457);
            }
            final Class4808 field20457 = new Class4808(this, s2, this.method14276() / 2, this.method14278() / 2, array2);
            this.addVisualThing(this.field20457 = field20457);
        });
    }
    
    private void method14199() {
        if (this.field20457 != null) {
            this.method14245(this.field20457);
        }
        this.addVisualThing(this.field20457 = new UglyClickGUICategory(this, "Sigma", this.method14276() / 2, this.method14278() / 2));
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
    }
    
    @Override
    public int method14201() {
        final Minecraft field20454 = Class4799.field20454;
        return Minecraft.method5338();
    }
    
    @Override
    public JSONObject method14202(final JSONObject JSONObject) {
        ColorUtils.method19172();
        return super.method14202(JSONObject);
    }
    
    @Override
    public void method14203(final JSONObject JSONObject) {
        super.method14203(JSONObject);
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (n == 256) {
            Class4799.field20454.displayGuiScreen(null);
        }
    }
    
    @Override
    public void draw(final float n) {
        RenderUtil.method26876((float)this.field20478, (float)this.field20479, (float)(this.field20478 + this.field20480), (float)(this.field20479 + this.field20481), ColorUtils.applyAlpha(ClientColors.field1273.color, Class4799.field20455.calcPercent() * 0.35f));
        super.draw(n);
    }
    
    static {
        Class4799.field20454 = Minecraft.method5277();
        Class4799.field20456 = true;
    }
}
