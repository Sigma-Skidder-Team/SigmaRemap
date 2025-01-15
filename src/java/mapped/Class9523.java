// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9523
{
    private static String[] field41000;
    private float field41001;
    private float field41002;
    private boolean field41003;
    public final /* synthetic */ Class7395 field41004;
    
    private Class9523(final Class7395 field41004, final float field41005, final float field41006) {
        this.field41004 = field41004;
        this.field41003 = false;
        this.field41002 = field41005;
        this.field41001 = field41006;
    }
    
    public float method35543() {
        return (float)(this.field41002 + Math.random() * (this.field41001 - this.field41002));
    }
    
    public boolean method35544() {
        return this.field41003;
    }
    
    public void method35545(final boolean field41003) {
        this.field41003 = field41003;
    }
    
    public float method35546() {
        return this.field41001;
    }
    
    public void method35547(final float field41001) {
        this.field41001 = field41001;
    }
    
    public float method35548() {
        return this.field41002;
    }
    
    public void method35549(final float field41002) {
        this.field41002 = field41002;
    }
}
