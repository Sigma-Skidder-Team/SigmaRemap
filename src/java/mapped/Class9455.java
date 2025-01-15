// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;

public class Class9455<T> extends Class9456
{
    private final Class9109 field40636;
    private final T field40637;
    private final Class2248<T> field40638;
    
    public Class9455(final Class2248<T> field40638, final T field40639, final Class9109 field40640) {
        super(method35132(field40638, field40639));
        this.field40638 = field40638;
        this.field40636 = field40640;
        this.field40637 = field40639;
    }
    
    public static <T> String method35132(final Class2248<T> class2248, final T t) {
        return method35133(Class90.field238.method503(class2248)) + ":" + method35133(class2248.method8448().method503(t));
    }
    
    private static <T> String method35133(final Class1932 class1932) {
        return class1932.toString().replace(':', '.');
    }
    
    public Class2248<T> method35134() {
        return this.field40638;
    }
    
    public T method35135() {
        return this.field40637;
    }
    
    public String method35136(final int n) {
        return this.field40636.method32943(n);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class9455 && Objects.equals(this.method35139(), ((Class9455)o).method35139()));
    }
    
    @Override
    public int hashCode() {
        return this.method35139().hashCode();
    }
    
    @Override
    public String toString() {
        return "Stat{name=" + this.method35139() + ", formatter=" + this.field40636 + '}';
    }
}
