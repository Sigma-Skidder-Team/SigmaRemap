// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class297
{
    field1700(4, "Float", 5126), 
    field1701(1, "Unsigned Byte", 5121), 
    field1702(1, "Byte", 5120), 
    field1703(2, "Unsigned Short", 5123), 
    field1704(2, "Short", 5122), 
    field1705(4, "Unsigned Int", 5125), 
    field1706(4, "Int", 5124);
    
    private final int field1707;
    private final String field1708;
    private final int field1709;
    
    private Class297(final int field1707, final String field1708, final int field1709) {
        this.field1707 = field1707;
        this.field1708 = field1708;
        this.field1709 = field1709;
    }
    
    public int method951() {
        return this.field1707;
    }
    
    public String method952() {
        return this.field1708;
    }
    
    public int method953() {
        return this.field1709;
    }
}
