// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.UglyClickGUICategory;
import totalcross.json.JSONObject;

public class ClassicClickGui extends Class4800
{
    private static Minecraft field20454;
    private static Animation field20455;
    private static boolean field20456;
    private Class4807 field20457;
    
    public ClassicClickGui() {
        super("ClassicScreen");
        ClassicClickGui.field20455 = new Animation(250, 200, Direction.BACKWARDS);
        this.method14199();
        ColorUtils.method19169();
    }
    
    public void method14197() {
        this.runThisOnDimensionUpdate(() -> this.method14199());
    }
    
    public void method14198(final String s, final Category... array) {
        this.runThisOnDimensionUpdate(() -> {
            if (this.field20457 != null) {
                this.method14245(this.field20457);
            }
            final Class4808 field20457 = new Class4808(this, s2, this.method14276() / 2, this.method14278() / 2, array2);
            this.addToList(this.field20457 = field20457);
        });
    }
    
    private void method14199() {
        if (this.field20457 != null) {
            this.method14245(this.field20457);
        }
        this.addToList(this.field20457 = new UglyClickGUICategory(this, "Sigma", this.method14276() / 2, this.method14278() / 2));
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
    }
    
    @Override
    public int method14201() {
        final Minecraft field20454 = ClassicClickGui.field20454;
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
            ClassicClickGui.field20454.displayGuiScreen(null);
        }
    }
    
    @Override
    public void draw(final float n) {
        RenderUtil.method26876((float)this.x, (float)this.y, (float)(this.x + this.field20480), (float)(this.y + this.field20481), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, ClassicClickGui.field20455.calcPercent() * 0.35f));
        super.draw(n);
    }
    
    static {
        ClassicClickGui.field20454 = Minecraft.getInstance();
        ClassicClickGui.field20456 = true;
    }
}
