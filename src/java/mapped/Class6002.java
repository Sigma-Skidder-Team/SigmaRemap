// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class6002 implements Class5997
{
    @Override
    public void method17923(final Class7576 obj, final Object o) {
        if (!obj.method23852()) {
            throw new Class2386("Unexpected recursive structure for Node: " + obj);
        }
        throw new IllegalStateException("Not Implemented in " + this.getClass().getName());
    }
}
