// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class4759<T extends Class806, M extends Class5928<T>> extends Class4712<T, M>
{
    private final float field20383;
    
    public Class4759(final Class8551 class8551, final M m, final float field20383) {
        super(class8551, m, 0.75f);
        this.field20383 = field20383;
    }
    
    public void method14097(final T t, final MatrixStack class7351, final float n) {
        class7351.method22565(this.field20383, this.field20383, this.field20383);
        super.method13990(t, class7351, n);
    }
}
