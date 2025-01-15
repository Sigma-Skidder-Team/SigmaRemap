// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9068
{
    private final boolean field38407;
    private final byte field38408;
    private final byte field38409;
    private final Class222 field38410;
    
    public Class9068(final boolean field38407, final byte field38408, final byte field38409, final Class222 field38410) {
        this.field38407 = field38407;
        this.field38408 = field38408;
        this.field38409 = field38409;
        this.field38410 = field38410;
    }
    
    public boolean method32662() {
        return this.field38407;
    }
    
    public byte method32663() {
        return this.field38408;
    }
    
    public byte method32664() {
        return this.field38409;
    }
    
    public Class222 method32665() {
        return this.field38410;
    }
    
    @Override
    public String toString() {
        return "StairConnectionHandler.StairData(bottom=" + this.method32662() + ", shape=" + this.method32663() + ", type=" + this.method32664() + ", facing=" + this.method32665() + ")";
    }
}
