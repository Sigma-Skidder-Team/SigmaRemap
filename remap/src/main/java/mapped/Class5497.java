// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5497 implements ILivingEntityData
{
    private static String[] field22786;
    private int field22787;
    private boolean field22788;
    private float field22789;
    
    public Class5497() {
        this.field22788 = true;
        this.field22789 = 0.05f;
    }
    
    public int method16798() {
        return this.field22787;
    }
    
    public void method16799() {
        ++this.field22787;
    }
    
    public boolean method16800() {
        return this.field22788;
    }
    
    public void method16801(final boolean field22788) {
        this.field22788 = field22788;
    }
    
    public float method16802() {
        return this.field22789;
    }
    
    public void method16803(final float field22789) {
        this.field22789 = field22789;
    }
}
