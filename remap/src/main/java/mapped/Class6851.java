// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

import java.util.Set;
import java.util.Random;

public abstract class Class6851<E extends LivingEntity>
{
    private static final Random field26878;
    private final int field26879;
    private long field26880;
    
    public Class6851(final int n) {
        this.field26879 = n;
        this.field26880 = Class6851.field26878.nextInt(n);
    }
    
    public Class6851() {
        this(20);
    }
    
    public final void method20958(final Class1849 class1849, final E e) {
        final long field26880 = this.field26880 - 1L;
        this.field26880 = field26880;
        if (field26880 <= 0L) {
            this.field26880 = this.field26879;
            this.method20955(class1849, e);
        }
    }
    
    public abstract void method20955(final Class1849 p0, final E p1);
    
    public abstract Set<Class8233<?>> method20953();
    
    static {
        field26878 = new Random();
    }
}
