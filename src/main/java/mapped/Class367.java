// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;
import java.util.List;
import java.util.Random;

public abstract class Class367 implements Class356
{
    public final Class7742<?> field2209;
    
    public Class367(final Class7742<?> field2209) {
        this.field2209 = field2209;
    }
    
    public abstract void method1241(final Class1851 p0, final Random p1, final List<Class354> p2, final List<Class354> p3, final Set<Class354> p4, final Class6997 p5);
    
    public void method1242(final Class1876 class1876, final Class354 class1877, final Class7113 class1878, final Set<Class354> set, final Class6997 class1879) {
        this.method1243(class1876, class1877, ((Class7097<O, Class7096>)Class7521.field29388.method11878()).method21773((Class7111<Comparable>)class1878, true), set, class1879);
    }
    
    public void method1243(final Class1876 class1876, final Class354 class1877, final Class7096 class1878, final Set<Class354> set, final Class6997 class1879) {
        class1876.method6688(class1877, class1878, 19);
        set.add(class1877);
        class1879.method21412(new Class6997(class1877, class1877));
    }
}
