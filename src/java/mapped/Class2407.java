// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public strictfp class Class2407 extends Class2406
{
    private static String[] field14257;
    public float field14262;
    
    public Class2407(final float n, final float n2, final float n3) {
        this(n, n2, n3, 50);
    }
    
    public Class2407(final float n, final float n2, final float n3, final int n4) {
        super(n, n2, n3, n3, n4);
        this.field14214 = n - n3;
        this.field14215 = n2 - n3;
        this.field14262 = n3;
        this.field14220 = n3;
    }
    
    @Override
    public strictfp float method9526() {
        return this.method9521() + this.field14262;
    }
    
    @Override
    public strictfp float method9528() {
        return this.method9524() + this.field14262;
    }
    
    public strictfp void method9605(final float field14262) {
        if (field14262 != this.field14262) {
            this.field14221 = true;
            this.method9600(this.field14262 = field14262, field14262);
        }
    }
    
    public strictfp float method9606() {
        return this.field14262;
    }
    
    @Override
    public strictfp boolean method9545(final Class2400 class2400) {
        if (!(class2400 instanceof Class2407)) {
            if (!(class2400 instanceof Class2403)) {
                return super.method9545(class2400);
            }
            return this.method9608((Class2403)class2400);
        }
        else {
            final Class2407 class2401 = (Class2407)class2400;
            final float n = this.method9606() + class2401.method9606();
            if (Math.abs(class2401.method9526() - this.method9526()) > n) {
                return false;
            }
            if (Math.abs(class2401.method9528() - this.method9528()) <= n) {
                final float n2 = n * n;
                final float abs = Math.abs(class2401.method9526() - this.method9526());
                final float abs2 = Math.abs(class2401.method9528() - this.method9528());
                return n2 >= abs * abs + abs2 * abs2;
            }
            return false;
        }
    }
    
    @Override
    public strictfp boolean method9544(final float n, final float n2) {
        return (n - this.method9521()) * (n - this.method9521()) + (n2 - this.method9524()) * (n2 - this.method9524()) < this.method9606() * this.method9606();
    }
    
    private strictfp boolean method9607(final Class2402 class2402) {
        return this.method9544(class2402.method9576(), class2402.method9577()) && this.method9544(class2402.method9578(), class2402.method9579());
    }
    
    @Override
    public strictfp void method9547() {
        (this.field14213 = new float[2])[0] = this.field14214 + this.field14262;
        this.field14213[1] = this.field14215 + this.field14262;
    }
    
    @Override
    public strictfp void method9548() {
        this.field14220 = this.field14262;
    }
    
    private strictfp boolean method9608(final Class2403 class2403) {
        if (!class2403.method9544(this.field14214 + this.field14262, this.field14215 + this.field14262)) {
            final float method9521 = class2403.method9521();
            final float method9522 = class2403.method9524();
            final float n = class2403.method9521() + class2403.method9558();
            final float n2 = class2403.method9524() + class2403.method9559();
            final Class2402[] array = { new Class2402(method9521, method9522, n, method9522), new Class2402(n, method9522, n, n2), new Class2402(n, n2, method9521, n2), new Class2402(method9521, n2, method9521, method9522) };
            final float n3 = this.method9606() * this.method9606();
            final Class2412 class2404 = new Class2412(this.method9526(), this.method9528());
            for (int i = 0; i < 4; ++i) {
                if (array[i].method9582(class2404) < n3) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    private strictfp boolean method9609(final Class2402 class2402) {
        final Class2412 class2403 = new Class2412(class2402.method9576(), class2402.method9577());
        final Class2412 class2404 = new Class2412(class2402.method9578(), class2402.method9579());
        final Class2412 class2405 = new Class2412(this.method9526(), this.method9528());
        final Class2412 method9641 = class2404.method9648().method9641(class2403);
        final Class2412 method9642 = class2405.method9648().method9641(class2403);
        final float method9643 = method9641.method9646();
        final float n = method9642.method9634(method9641) / method9643;
        Class2412 method9644;
        if (n >= 0.0f) {
            if (n <= method9643) {
                method9644 = class2403.method9648().method9640(method9641.method9648().method9642(n / method9643));
            }
            else {
                method9644 = class2404;
            }
        }
        else {
            method9644 = class2403;
        }
        return class2405.method9648().method9641(method9644).method9645() <= this.method9606() * this.method9606();
    }
}
