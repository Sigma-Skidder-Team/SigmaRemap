// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class2449<T1, T2> implements Class2448<T1>
{
    private final Class5260<T2> field14406;
    
    public Class2449(final Class5260<T2> field14406) {
        this.field14406 = field14406;
    }
    
    public abstract T2 method9790(final Class8699 p0, final T1 p1) throws Exception;
    
    @Override
    public void method9789(final Class8699 class8699, final T1 t1) throws Exception {
        try {
            class8699.method29823(this.field14406, this.method9790(class8699, t1));
        }
        catch (final Class2328 class8700) {
            class8700.method9450(this.getClass());
            throw class8700;
        }
    }
}
