// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8617
{
    private static String[] field36155;
    private int field36156;
    private int field36157;
    private int field36158;
    private boolean field36159;
    private long field36160;
    private float field36161;
    private Class869 field36162;
    
    public Class8617() {
        this.field36156 = 0;
        this.field36157 = 0;
        this.field36158 = 0;
        this.field36159 = false;
        this.field36160 = System.currentTimeMillis();
        this.field36161 = 1.0f;
        this.field36162 = Class869.method5277();
    }
    
    public void method29223() {
        Class9463.method35173().method35188().method21094(this);
    }
    
    @Class6753
    private void method29224(final Class5743 class5743) {
        ++this.field36156;
        ++this.field36157;
        ++this.field36158;
        if (!this.field36162.field4684.onGround) {
            this.field36157 = 0;
        }
        if (this.field36162.field4700 != null) {
            this.field36156 = 0;
        }
        if (!Class7482.method23148()) {
            this.field36158 = 0;
            this.field36159 = true;
        }
        if (this.field36162.field4684.ticksExisted <= 1) {
            this.field36159 = false;
        }
    }
    
    @Class6753
    private void method29225(final Class5723 class5723) {
        if (class5723.method16998() instanceof Class4396) {
            this.field36161 = Math.min(1.05f, Math.max(0.0f, 15000.0f / (System.currentTimeMillis() - this.field36160)));
            this.field36160 = System.currentTimeMillis();
        }
    }
    
    public float method29226() {
        return this.field36161;
    }
    
    public float method29227() {
        return this.method29226() * 20.0f;
    }
    
    public int method29228() {
        return this.field36157;
    }
    
    public boolean method29229() {
        return this.field36159;
    }
    
    public int method29230() {
        return this.field36157;
    }
    
    public int method29231() {
        return this.field36156;
    }
    
    public void method29232() {
        this.field36157 = 0;
        this.field36156 = 0;
    }
}
