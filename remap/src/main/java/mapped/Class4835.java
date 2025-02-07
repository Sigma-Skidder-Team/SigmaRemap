// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class Class4835 extends Class4825
{
    private static String[] field20591;
    public boolean field20720;
    private ItemStack field20721;
    private Minecraft field20722;
    
    public Class4835(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final int n5) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field20722 = Minecraft.method5277();
        this.field20721 = new ItemStack(Item.method11697(n5));
    }
    
    @Override
    public void method14234(final int n, final int n2, final int n3) {
        this.method14503(!this.field20720);
        super.method14234(n, n2, n3);
    }
    
    public boolean method14502() {
        return this.field20720;
    }
    
    public void method14503(final boolean field20720) {
        this.field20720 = field20720;
    }
    
    @Override
    public void draw(final float n) {
        if (!this.field20720) {
            RenderUtil.method26876((float)this.x, (float)this.y, (float)(this.x + this.field20480), (float)(this.y + this.field20481), ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n));
        }
        else {
            RenderUtil.method26876((float)this.x, (float)this.y, (float)(this.x + this.field20480), (float)(this.y + this.field20481), ColorUtils.applyAlpha(-3487030, n * 0.5f));
        }
        RenderUtil.method26878((float)(this.x - 1), (float)(this.y - 1), (float)(this.x + this.field20480), (float)(this.y + this.field20481), ColorUtils.applyAlpha(-921103, n));
        if (this.field20721.getItem() != null) {
            this.method14504();
        }
    }
    
    private void method14504() {
        GL11.glPushMatrix();
        final float n = 0.062f;
        GL11.glTranslatef((float)this.x, (float)this.y, 0.0f);
        GL11.glScalef(this.field20480 * n - 0.25f * this.field20480 / 40.0f, this.field20481 * n - 0.25f * this.field20481 / 40.0f, 1.0f);
        GL11.glTranslatef((float)(-this.x), (float)(-this.y), 0.0f);
        GL11.glEnable(2929);
        Class8317.method27608();
        this.field20722.getItemRenderer().method6538(this.field20721, this.x + 1, this.y + 1);
        Class8317.method27609();
        GL11.glDisable(2929);
        GL11.glPopMatrix();
    }
}
