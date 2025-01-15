// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class8130
{
    private int field33493;
    private boolean field33494;
    private int field33495;
    private int field33496;
    private int field33497;
    private Class2314 field33498;
    
    public Class8130(final int field33493, final boolean field33494, final int field33495, final int field33496, final int field33497, final Class2314 field33498) {
        this.field33493 = field33493;
        this.field33494 = field33494;
        this.field33495 = field33495;
        this.field33496 = field33496;
        this.field33497 = field33497;
        this.field33498 = field33498;
    }
    
    public int method26792() {
        return this.field33493;
    }
    
    public int method26793() {
        return this.field33497;
    }
    
    public Class2314 method26794() {
        return this.field33498;
    }
    
    public int method26795() {
        return this.field33495;
    }
    
    public int method26796() {
        return this.field33496;
    }
    
    public boolean method26797() {
        return this.field33494;
    }
    
    @Override
    public String toString() {
        return "SimpleKey - tokenNumber=" + this.field33493 + " required=" + this.field33494 + " index=" + this.field33495 + " line=" + this.field33496 + " column=" + this.field33497;
    }
}
