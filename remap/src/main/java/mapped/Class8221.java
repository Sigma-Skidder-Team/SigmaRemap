// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8221
{
    private static String[] field33769;
    public final Class7524 field33770;
    public final int field33771;
    private boolean field33772;
    public final int field33773 = 25;
    public Class9572 field33774;
    public final int field33775 = 7;
    
    public Class8221(final int field33771) {
        this.field33772 = false;
        this.field33774 = new Class9572(300, 300);
        this.field33770 = Class9493.field40813;
        this.field33771 = field33771;
    }
    
    public int method27233() {
        return 106;
    }
    
    public int method27234() {
        return Class3206.method10070(this.field33771);
    }
    
    public int method27235() {
        return 30;
    }
    
    public void method27236() {
        this.field33772 = true;
        this.field33774.method35855(Class2186.field12965);
    }
    
    public boolean method27237() {
        return this.field33772;
    }
    
    public boolean method27238() {
        return this.field33772 && this.field33774.method35858() == 0.0f;
    }
    
    public int method27239() {
        return 100;
    }
    
    public void method27240(final float n) {
        float n2 = Class8468.method28270(this.field33774.method35858(), 0.0f, 1.0f, 1.0f);
        if (this.field33774.method35857() == Class2186.field12965) {
            n2 = Class8468.method28269(this.field33774.method35858(), 0.0f, 1.0f, 1.0f);
        }
        Class8154.method26869((float)this.method27234(), (float)this.method27235(), this.method27233() * n2, (float)this.method27239());
        this.method27232(n);
        Class8154.method26872();
    }
    
    public void method27232(final float n) {
    }
}