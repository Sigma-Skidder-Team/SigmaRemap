// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class1991
{
    field11141("master", 0), 
    field11142("music", 1), 
    field11143("record", 2), 
    field11144("weather", 3), 
    field11145("block", 4), 
    field11146("hostile", 5), 
    field11147("neutral", 6), 
    field11148("player", 7), 
    field11149("ambient", 8), 
    field11150("voice", 9);
    
    private final String field11151;
    private final int field11152;
    
    private Class1991(final String field11151, final int field11152) {
        this.field11151 = field11151;
        this.field11152 = field11152;
    }
    
    public String method8013() {
        return this.field11151;
    }
    
    public int method8014() {
        return this.field11152;
    }
}
