// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1950 implements Comparable<Class1950>
{
    private static String[] field10620;
    private final Class2071 field10621;
    private final long field10622;
    private final long field10623;
    private final double field10624;
    private byte[] field10625;
    
    public Class1950(final Class2071 field10621, final long field10622, final long field10623, final double field10624) {
        this.field10621 = field10621;
        this.field10622 = field10622;
        this.field10623 = field10623;
        this.field10624 = field10624;
    }
    
    public Class2071 method7926() {
        return this.field10621;
    }
    
    public long method7927() {
        return this.field10622;
    }
    
    public long method7928() {
        return this.field10623;
    }
    
    public double method7929() {
        return this.field10624;
    }
    
    @Override
    public int compareTo(final Class1950 class1950) {
        final double n = this.field10624 - class1950.field10624;
        return (n >= 0.0) ? ((n <= 0.0) ? false : true) : -1;
    }
    
    public void method7930(final byte[] field10625) {
        this.field10625 = field10625;
    }
    
    public byte[] method7931() {
        return this.field10625;
    }
}
