// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;

public class Class619<E extends Class623<E>> extends Class608<E>
{
    private static String[] field3592;
    private final Class5056 field3593;
    
    public Class619(final Class5056 field3593, final int n, final int n2, final int n3, final int n4, final int n5) {
        super(Class869.method5277(), n, n2, n3, n4, n5);
        this.field3593 = field3593;
    }
    
    @Override
    public int method3537() {
        return super.method3537();
    }
    
    public void method3597() {
        super.method3533();
    }
    
    @Override
    public boolean method3561() {
        return this.field3593.method15532();
    }
    
    public void method3598(final int n) {
        if (n != -1) {
            if (super.method3537() != 0) {
                super.method3531(super.method3535(n));
            }
        }
        else {
            super.method3531(null);
        }
    }
    
    public void method3599(final E e) {
        super.method3531(e);
        this.field3593.method15533(super.method3040().indexOf(e));
    }
    
    @Override
    public void method3545() {
        this.field3593.method15522();
    }
    
    public int method3600() {
        return this.field3543;
    }
    
    @Override
    public int method3542() {
        return this.field3593.method15523();
    }
    
    @Override
    public int method3555() {
        return this.field3593.method15524();
    }
    
    @Override
    public boolean method3012(final double n, final double n2, final double n3) {
        return this.field3593.method15494(n, n2, n3) || super.method3012(n, n2, n3);
    }
    
    @Override
    public int method3529() {
        return this.field3593.method15531();
    }
    
    @Override
    public boolean method2982(final double n, final double n2, final int n3) {
        return this.field3593.method15368(n, n2, n3) || super.method2982(n, n2, n3);
    }
    
    @Override
    public boolean method2985(final double n, final double n2, final int n3) {
        return this.field3593.method15492(n, n2, n3);
    }
    
    @Override
    public boolean method2984(final double n, final double n2, final int n3, final double n4, final double n5) {
        return this.field3593.method15493(n, n2, n3, n4, n5) || super.method2984(n, n2, n3, n4, n5);
    }
    
    public final int method3601(final E e) {
        return super.method3536(e);
    }
    
    public E method3602(final int n) {
        return super.method3563(n);
    }
    
    public boolean method3603(final E e) {
        return super.method3564(e);
    }
    
    @Override
    public void method3551(final double n) {
        super.method3551(n);
    }
    
    public int method3604() {
        return this.field3545;
    }
    
    public int method3605() {
        return this.field3546;
    }
    
    public int method3606() {
        return this.field3554;
    }
    
    public int method3607() {
        return this.field3541;
    }
    
    @Override
    public boolean method2972(final int n, final int n2, final int n3) {
        return super.method2972(n, n2, n3) || this.field3593.method15376(n, n2, n3);
    }
    
    @Override
    public void method3534(final Collection<E> collection) {
        super.method3534(collection);
    }
    
    @Override
    public int method3559(final int n) {
        return super.method3559(n);
    }
    
    @Override
    public int method3558() {
        return super.method3558();
    }
}
