// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public abstract class Class5056<E extends Class624> extends RealmsGuiEventListener
{
    private final Class619 field21705;
    
    public Class5056(final int n, final int n2, final int n3, final int n4, final int n5) {
        this.field21705 = new Class619(this, n, n2, n3, n4, n5);
    }
    
    public void method15510(final int n, final int n2, final float n3) {
        this.field21705.method2975(n, n2, n3);
    }
    
    public void method15511(final E e) {
        this.field21705.method3601(e);
    }
    
    public void method15512(final int n) {
        this.field21705.method3602(n);
    }
    
    public void method15513() {
        this.field21705.method3597();
    }
    
    public boolean method15514(final E e) {
        return this.field21705.method3603(e);
    }
    
    public int method15515() {
        return this.field21705.method3600();
    }
    
    public void method15516(final int n, final int n2, final int n3, final int n4, final Class7710 class7710, final int n5, final int n6) {
    }
    
    public void method15517(final int n) {
        this.field21705.method3541(n);
    }
    
    public void method15518(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.method15516(n, n2, n3, n4, Class7710.field30674, n5, n6);
    }
    
    public void method15519(final int n) {
        this.field21705.method3598(n);
    }
    
    public void method15520(final int n, final int n2, final double n3, final double n4, final int n5) {
    }
    
    public int method15521() {
        return this.field21705.method3537();
    }
    
    public void method15522() {
    }
    
    public int method15523() {
        return 0;
    }
    
    public int method15524() {
        return this.field21705.method3558() + this.field21705.method3529();
    }
    
    public int method15525() {
        return this.field21705.method3604();
    }
    
    public int method15526() {
        return this.field21705.method3605();
    }
    
    public int method15527() {
        return this.field21705.method3606();
    }
    
    public int method15528() {
        return this.field21705.method3607();
    }
    
    public void method15529(final int n) {
        this.field21705.method3551(n);
    }
    
    public int method15530() {
        return (int)this.field21705.method3550();
    }
    
    @Override
    public IGuiEventListener getProxy() {
        return this.field21705;
    }
    
    public int method15531() {
        return (int)(this.method15515() * 0.6);
    }
    
    public abstract boolean method15532();
    
    public void method15533(final int n) {
        this.method15519(n);
    }
    
    @Nullable
    public E method15534() {
        return (E)this.field21705.method3530();
    }
    
    public List<E> method15535() {
        return this.field21705.children();
    }
    
    public void method15536(final Collection<E> collection) {
        this.field21705.method3534(collection);
    }
    
    public int method15537(final int n) {
        return this.field21705.method3559(n);
    }
    
    public int method15538() {
        return this.field21705.method3558();
    }
}
