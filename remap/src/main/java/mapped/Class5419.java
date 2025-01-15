// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

import java.util.Map;

public abstract class Class5419<E extends LivingEntity>
{
    private final Map<Class8233<?>, Class1952> field22591;
    private Class232 field22592;
    private long field22593;
    private final int field22594;
    private final int field22595;
    
    public Class5419(final Map<Class8233<?>, Class1952> map) {
        this(map, 60);
    }
    
    public Class5419(final Map<Class8233<?>, Class1952> map, final int n) {
        this(map, n, n);
    }
    
    public Class5419(final Map<Class8233<?>, Class1952> field22591, final int field22592, final int field22593) {
        this.field22592 = Class232.field867;
        this.field22594 = field22592;
        this.field22595 = field22593;
        this.field22591 = field22591;
    }
    
    public Class232 method16543() {
        return this.field22592;
    }
    
    public final boolean method16544(final Class1849 class1849, final E e, final long n) {
        if (this.method16551(e) && this.method16538(class1849, e)) {
            this.field22592 = Class232.field868;
            this.field22593 = n + (this.field22594 + class1849.method6790().nextInt(this.field22595 + 1 - this.field22594));
            this.method16539(class1849, e, n);
            return true;
        }
        return false;
    }
    
    public void method16539(final Class1849 class1849, final E e, final long n) {
    }
    
    public final void method16545(final Class1849 class1849, final E e, final long n) {
        if (!this.method16550(n) && this.method16549(class1849, e, n)) {
            this.method16546(class1849, e, n);
        }
        else {
            this.method16547(class1849, e, n);
        }
    }
    
    public void method16546(final Class1849 class1849, final E e, final long n) {
    }
    
    public final void method16547(final Class1849 class1849, final E e, final long n) {
        this.field22592 = Class232.field867;
        this.method16548(class1849, e, n);
    }
    
    public void method16548(final Class1849 class1849, final E e, final long n) {
    }
    
    public boolean method16549(final Class1849 class1849, final E e, final long n) {
        return false;
    }
    
    public boolean method16550(final long n) {
        return n > this.field22593;
    }
    
    public boolean method16538(final Class1849 class1849, final E e) {
        return true;
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
    private boolean method16551(final E e) {
        return this.field22591.entrySet().stream().allMatch(entry -> class511.method2618().method1199(entry.getKey(), (Class1952)entry.getValue()));
    }
}
