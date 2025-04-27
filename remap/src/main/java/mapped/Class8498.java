// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8498<T>
{
    private final T field34888;
    private final int field34889;
    private double field34890;
    public final /* synthetic */ Class8841 field34891;
    
    private Class8498(final Class8841 field34891, final T field34892, final int field34893) {
        this.field34891 = field34891;
        this.field34889 = field34893;
        this.field34888 = field34892;
    }
    
    private double method28391() {
        return this.field34890;
    }
    
    private void method28392(final float n) {
        this.field34890 = -Math.pow(n, 1.0f / this.field34889);
    }
    
    public T method28393() {
        return this.field34888;
    }
    
    public int method28394() {
        return this.field34889;
    }
    
    @Override
    public String toString() {
        return this.field34889 + ":" + this.field34888;
    }
}
