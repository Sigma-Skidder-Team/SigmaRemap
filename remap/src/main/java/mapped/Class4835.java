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
    private Class869 field20722;
    
    public Class4835(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final int n5) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field20722 = Class869.method5277();
        this.field20721 = new ItemStack(Class3820.method11697(n5));
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
    public void method14205(final float n) {
        if (!this.field20720) {
            Class8154.method26876((float)this.field20478, (float)this.field20479, (float)(this.field20478 + this.field20480), (float)(this.field20479 + this.field20481), Class6430.method19118(Class265.field1278.field1292, n));
        }
        else {
            Class8154.method26876((float)this.field20478, (float)this.field20479, (float)(this.field20478 + this.field20480), (float)(this.field20479 + this.field20481), Class6430.method19118(-3487030, n * 0.5f));
        }
        Class8154.method26878((float)(this.field20478 - 1), (float)(this.field20479 - 1), (float)(this.field20478 + this.field20480), (float)(this.field20479 + this.field20481), Class6430.method19118(-921103, n));
        if (this.field20721.method27622() != null) {
            this.method14504();
        }
    }
    
    private void method14504() {
        GL11.glPushMatrix();
        final float n = 0.062f;
        GL11.glTranslatef((float)this.field20478, (float)this.field20479, 0.0f);
        GL11.glScalef(this.field20480 * n - 0.25f * this.field20480 / 40.0f, this.field20481 * n - 0.25f * this.field20481 / 40.0f, 1.0f);
        GL11.glTranslatef((float)(-this.field20478), (float)(-this.field20479), 0.0f);
        GL11.glEnable(2929);
        Class8317.method27608();
        this.field20722.method5307().method6538(this.field20721, this.field20478 + 1, this.field20479 + 1);
        Class8317.method27609();
        GL11.glDisable(2929);
        GL11.glPopMatrix();
    }
}
