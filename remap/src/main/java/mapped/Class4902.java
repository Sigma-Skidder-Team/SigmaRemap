// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class4902 extends Panel
{
    private static String[] field20591;
    public ItemStack field20973;
    public boolean field20974;
    
    public Class4902(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ItemStack field20973) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field20973 = field20973;
    }
    
    @Override
    public void draw(final float partialTicks) {
        final int n2 = 5;
        if (this.method14723() || this.method14308()) {
            RenderUtil.method26914((float)this.x, (float)this.y, (float)this.field20480, (float)this.field20481, 14.0f, this.method14723() ? (0.8f * partialTicks) : (0.3f * partialTicks));
        }
        RenderUtil.method26929(this.field20973, this.x + n2, this.y + n2, this.field20480 - n2 * 2, this.field20481 - n2 * 2);
        super.draw(partialTicks);
    }
    
    public boolean method14723() {
        return this.field20974;
    }
    
    public void method14724(final boolean b) {
        this.method14725(b, true);
    }
    
    public void method14725(final boolean field20974, final boolean b) {
        if (field20974 != this.method14723()) {
            this.field20974 = field20974;
            this.method14517();
        }
    }
    
    @Override
    public void method14234(final int n, final int n2, final int n3) {
        this.method14725(!this.field20974, true);
    }
}
