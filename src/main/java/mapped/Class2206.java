// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2206
{
    field13425(new Integer[] { 1, 0 }), 
    field13426(new Integer[] { 1, 1 });
    
    private Integer[] field13427;
    
    private Class2206(final Integer[] field13427) {
        this.field13427 = field13427;
    }
    
    public int method8383() {
        return this.field13427[0];
    }
    
    public int method8384() {
        return this.field13427[1];
    }
    
    public String method8385() {
        return this.field13427[0] + "." + this.field13427[1];
    }
    
    @Override
    public String toString() {
        return "Version: " + this.method8385();
    }
}
