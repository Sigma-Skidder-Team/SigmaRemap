// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class5716 extends Class5714
{
    private static String[] field23249;
    private boolean field23250;
    private boolean field23251;
    private float field23252;
    private float field23253;
    private Class2226 field23254;
    private ItemStack field23255;
    private MatrixStack field23256;
    
    public Class5716(final boolean field23250, final float field23251, final float field23252, final Class2226 field23253, final ItemStack field23254, final MatrixStack field23255) {
        this.field23250 = field23250;
        this.field23252 = field23251;
        this.field23253 = field23252;
        this.field23254 = field23253;
        this.field23255 = field23254;
        this.field23256 = field23255;
        this.field23251 = true;
    }
    
    public float method16964() {
        return this.field23252;
    }
    
    public float method16965() {
        return this.field23253;
    }
    
    public boolean method16966() {
        return this.field23250;
    }
    
    public Class2226 method16967() {
        return this.field23254;
    }
    
    public ItemStack method16968() {
        return this.field23255;
    }
    
    public MatrixStack method16969() {
        return this.field23256;
    }
    
    public boolean method16970() {
        return this.field23251;
    }
    
    public void method16971(final boolean field23251) {
        this.field23251 = field23251;
    }
}
