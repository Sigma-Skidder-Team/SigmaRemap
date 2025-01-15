// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5835<T>
{
    private final T field23922;
    private Class5835<T> field23923;
    private Class5835<T> field23924;
    private Class8081<T> field23925;
    
    public Class5835(final T field23922) {
        this.field23922 = field23922;
    }
    
    public T method17537() {
        return this.field23922;
    }
    
    public Class5835<T> method17538() {
        return this.field23923;
    }
    
    public Class5835<T> method17539() {
        return this.field23924;
    }
    
    private void method17540(final Class5835<T> field23923) {
        this.field23923 = field23923;
    }
    
    private void method17541(final Class5835<T> field23924) {
        this.field23924 = field23924;
    }
    
    private void method17542(final Class8081<T> field23925) {
        this.field23925 = field23925;
    }
    
    @Override
    public String toString() {
        return "" + this.field23922;
    }
}
