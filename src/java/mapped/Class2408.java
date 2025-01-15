// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2408 extends Class2400
{
    private static String[] field14263;
    
    public Class2408(final float field14214, final float field14215) {
        this.field14214 = field14214;
        this.field14215 = field14215;
        this.method9552();
    }
    
    @Override
    public Class2400 method9519(final Class7310 class7310) {
        class7310.method22419(this.field14212, 0, new float[this.field14212.length], 0, this.field14212.length / 2);
        return new Class2408(this.field14212[0], this.field14212[1]);
    }
    
    @Override
    public void method9520() {
        (this.field14212 = new float[2])[0] = this.method9521();
        this.field14212[1] = this.method9524();
        this.field14216 = this.field14214;
        this.field14217 = this.field14215;
        this.field14218 = this.field14214;
        this.field14219 = this.field14215;
        this.method9547();
        this.method9548();
    }
    
    @Override
    public void method9547() {
        (this.field14213 = new float[2])[0] = this.field14212[0];
        this.field14213[1] = this.field14212[1];
    }
    
    @Override
    public void method9548() {
        this.field14220 = 0.0f;
    }
}
