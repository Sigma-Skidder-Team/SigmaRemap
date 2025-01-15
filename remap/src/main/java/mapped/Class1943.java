// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1943 implements Comparable<Class1943>
{
    private static String[] field10591;
    public final double field10592;
    public final double field10593;
    public final long field10594;
    public final String field10595;
    
    public Class1943(final String field10595, final double field10596, final double field10597, final long field10598) {
        this.field10595 = field10595;
        this.field10592 = field10596;
        this.field10593 = field10597;
        this.field10594 = field10598;
    }
    
    @Override
    public int compareTo(final Class1943 class1943) {
        if (class1943.field10592 >= this.field10592) {
            return (class1943.field10592 <= this.field10592) ? class1943.field10595.compareTo(this.field10595) : 1;
        }
        return -1;
    }
    
    public int method7893() {
        return (this.field10595.hashCode() & 0xAAAAAA) + 4473924;
    }
}
