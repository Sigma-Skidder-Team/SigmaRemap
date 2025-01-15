// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;

public class Class5442<E extends Class511, T extends Class511> extends Class5419<E>
{
    private static String[] field22650;
    private final int field22651;
    private final float field22652;
    private final EntityType<? extends T> field22653;
    private final int field22654;
    private final Predicate<T> field22655;
    private final Predicate<E> field22656;
    private final Class8233<T> field22657;
    
    public Class5442(final EntityType<? extends T> field22653, final int n, final Predicate<E> field22654, final Predicate<T> field22655, final Class8233<T> field22656, final float field22657, final int field22658) {
        super((Map)ImmutableMap.of((Object)Class8233.field33810, (Object)Class1952.field10630, (Object)Class8233.field33809, (Object)Class1952.field10629, (Object)field22656, (Object)Class1952.field10629, (Object)Class8233.field33805, (Object)Class1952.field10628));
        this.field22653 = field22653;
        this.field22652 = field22657;
        this.field22654 = n * n;
        this.field22651 = field22658;
        this.field22655 = field22655;
        this.field22656 = field22654;
        this.field22657 = field22656;
    }
    
    public static <T extends Class511> Class5442<Class511, T> method16615(final EntityType<? extends T> class7499, final int n, final Class8233<T> class7500, final float n2, final int n3) {
        return new Class5442<Class511, T>(class7499, n, p0 -> true, p0 -> true, class7500, n2, n3);
    }
    
    @Override
    public boolean method16538(final Class1849 class1849, final E e) {
        return this.field22656.test(e) && e.method2618().method1198(Class8233.field33805).get().stream().anyMatch(class1850 -> this.field22653.equals(class1850.method1642()) && this.field22655.test((T)class1850));
    }
    
    @Override
    public void method16539(final Class1849 class1849, final E e, final long n) {
        e.method2618().method1198(Class8233.field33805).ifPresent(list -> list.stream().filter(class1850 -> this.field22653.equals(class1850.method1642())).map(class1851 -> class1851).filter(class1853 -> class1853.method1734(class1852) <= this.field22654).filter(this.field22655).findFirst().ifPresent(class1855 -> {
            class1854.method1196(this.field22657, class1855);
            class1854.method1196(Class8233.field33810, new Class6440(class1855));
            final Class8233<Class6949> field33809 = Class8233.field33809;
            new Class6949(new Class6440(class1855), this.field22652, this.field22651);
            final Class6949 class1856;
            class1854.method1196(field33809, class1856);
        }));
    }
}
