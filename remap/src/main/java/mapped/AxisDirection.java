// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum AxisDirection
{
    POSITIVE(1, "Towards positive"),
    NEGATIVE(-1, "Towards negative");
    
    private final int offset;
    private final String description;
    
    AxisDirection(final int offset, final String description) {
        this.offset = offset;
        this.description = description;
    }
    
    public int getOffset() {
        return this.offset;
    }
    
    @Override
    public String toString() {
        return this.description;
    }
}
