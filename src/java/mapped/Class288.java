// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class288
{
    field1601(1, "Towards positive"), 
    field1602(-1, "Towards negative");
    
    private final int field1603;
    private final String field1604;
    
    private Class288(final int field1603, final String field1604) {
        this.field1603 = field1603;
        this.field1604 = field1604;
    }
    
    public int method936() {
        return this.field1603;
    }
    
    @Override
    public String toString() {
        return this.field1604;
    }
}
