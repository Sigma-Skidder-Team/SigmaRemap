// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class349 implements Comparable<Class349>
{
    private static String[] field2149;
    private final int field2150;
    private final Class354 field2151;
    private int field2152;
    private int field2153;
    
    public Class349(final int field2150, final Class354 field2151) {
        this.field2150 = field2150;
        this.field2151 = field2151;
    }
    
    public Class354 method1046() {
        return this.field2151;
    }
    
    public void method1047(int field2152) {
        if (field2152 > 10) {
            field2152 = 10;
        }
        this.field2152 = field2152;
    }
    
    public int method1048() {
        return this.field2152;
    }
    
    public void method1049(final int field2153) {
        this.field2153 = field2153;
    }
    
    public int method1050() {
        return this.field2153;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.field2150 == ((Class349)o).field2150);
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(this.field2150);
    }
    
    @Override
    public int compareTo(final Class349 class349) {
        return (this.field2152 == class349.field2152) ? Integer.compare(this.field2150, class349.field2150) : Integer.compare(this.field2152, class349.field2152);
    }
}
