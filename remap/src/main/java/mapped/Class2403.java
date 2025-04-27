// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2403 extends Class2400
{
    public float field14240;
    public float field14241;
    
    public Class2403(final float field14214, final float field14215, final float field14216, final float field14217) {
        this.field14214 = field14214;
        this.field14215 = field14215;
        this.field14240 = field14216;
        this.field14241 = field14217;
        this.field14216 = field14214 + field14216;
        this.field14217 = field14215 + field14217;
        this.method9552();
    }
    
    @Override
    public boolean method9544(final float n, final float n2) {
        return n > this.method9521() && n2 > this.method9524() && n < this.field14216 && n2 < this.field14217;
    }
    
    public void method9587(final Class2403 class2403) {
        this.method9588(class2403.method9521(), class2403.method9524(), class2403.method9558(), class2403.method9559());
    }
    
    public void method9588(final float n, final float n2, final float n3, final float n4) {
        this.method9522(n);
        this.method9523(n2);
        this.method9589(n3, n4);
    }
    
    public void method9589(final float n, final float n2) {
        this.method9592(n);
        this.method9593(n2);
    }
    
    @Override
    public float method9558() {
        return this.field14240;
    }
    
    @Override
    public float method9559() {
        return this.field14241;
    }
    
    public void method9590(final float n, final float n2) {
        this.method9522(this.method9521() - n);
        this.method9523(this.method9524() - n2);
        this.method9592(this.method9558() + n * 2.0f);
        this.method9593(this.method9559() + n2 * 2.0f);
    }
    
    public void method9591(final float n, final float n2) {
        this.method9590(this.method9558() * (n - 1.0f), this.method9559() * (n2 - 1.0f));
    }
    
    public void method9592(final float field14240) {
        if (field14240 != this.field14240) {
            this.field14221 = true;
            this.field14240 = field14240;
            this.field14216 = this.field14214 + field14240;
        }
    }
    
    public void method9593(final float field14241) {
        if (field14241 != this.field14241) {
            this.field14221 = true;
            this.field14241 = field14241;
            this.field14217 = this.field14215 + field14241;
        }
    }
    
    @Override
    public boolean method9545(final Class2400 class2400) {
        if (class2400 instanceof Class2403) {
            final Class2403 class2401 = (Class2403)class2400;
            return this.field14214 <= class2401.field14214 + class2401.field14240 && this.field14214 + this.field14240 >= class2401.field14214 && (this.field14215 <= class2401.field14215 + class2401.field14241 && this.field14215 + this.field14241 >= class2401.field14215);
        }
        if (!(class2400 instanceof Class2407)) {
            return super.method9545(class2400);
        }
        return this.method9594((Class2407)class2400);
    }
    
    @Override
    public void method9520() {
        final float field14240 = this.field14240;
        final float field14241 = this.field14241;
        (this.field14212 = new float[8])[0] = this.field14214;
        this.field14212[1] = this.field14215;
        this.field14212[2] = this.field14214 + field14240;
        this.field14212[3] = this.field14215;
        this.field14212[4] = this.field14214 + field14240;
        this.field14212[5] = this.field14215 + field14241;
        this.field14212[6] = this.field14214;
        this.field14212[7] = this.field14215 + field14241;
        this.field14216 = this.field14212[2];
        this.field14217 = this.field14212[5];
        this.field14218 = this.field14212[0];
        this.field14219 = this.field14212[1];
        this.method9547();
        this.method9548();
    }
    
    private boolean method9594(final Class2407 class2407) {
        return class2407.method9545(this);
    }
    
    @Override
    public String toString() {
        return "[Rectangle " + this.field14240 + "x" + this.field14241 + "]";
    }
    
    public static boolean method9595(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        if (n >= n3) {
            if (n2 >= n4) {
                if (n <= n3 + n5) {
                    return n2 <= n4 + n6;
                }
            }
        }
        return false;
    }
    
    @Override
    public Class2400 method9519(final Class7310 class7310) {
        this.method9552();
        final Class2410 class7311 = new Class2410();
        final float[] field14212 = new float[this.field14212.length];
        class7310.method22419(this.field14212, 0, field14212, 0, this.field14212.length / 2);
        class7311.field14212 = field14212;
        class7311.method9547();
        class7311.method9552();
        return class7311;
    }
}
