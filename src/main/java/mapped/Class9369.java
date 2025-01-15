// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9369<T>
{
    private static String[] field40177;
    private final Class8810<T> field40178;
    private T field40179;
    private boolean field40180;
    
    public Class9369(final Class8810<T> field40178, final T field40179) {
        this.field40178 = field40178;
        this.field40179 = field40179;
        this.field40180 = true;
    }
    
    public Class8810<T> method34766() {
        return this.field40178;
    }
    
    public void method34767(final T field40179) {
        this.field40179 = field40179;
    }
    
    public T method34768() {
        return this.field40179;
    }
    
    public boolean method34769() {
        return this.field40180;
    }
    
    public void method34770(final boolean field40180) {
        this.field40180 = field40180;
    }
    
    public Class9369<T> method34771() {
        return new Class9369<T>(this.field40178, this.field40178.method30738().method13345(this.field40179));
    }
}
