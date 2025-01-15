// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class1968 implements Class1967
{
    field10758(0, (Class5260)Class5260.field22289), 
    field10759(1, (Class5260)Class5260.field22312), 
    field10760(2, (Class5260)Class5260.field22302), 
    field10761(3, (Class5260)Class5260.field22308), 
    field10762(4, (Class5260)Class5260.field22308), 
    field10763(5, (Class5260)Class5260.field22328), 
    field10764(6, (Class5260)Class5260.field22294), 
    field10765(7, (Class5260)Class5260.field22320), 
    field10766(8, (Class5260)Class5260.field22318), 
    field10767(9, (Class5260)Class5260.field22326), 
    field10768(10, (Class5260)Class5260.field22312), 
    field10769(11, (Class5260)Class5260.field22324), 
    field10770(12, (Class5260)Class5260.field22312), 
    field10771(99, (Class5260)null);
    
    private final int field10772;
    private final Class5260 field10773;
    
    public static Class1968 method7970(final int n) {
        return values()[n];
    }
    
    private Class1968(final int field10772, final Class5260 field10773) {
        this.field10772 = field10772;
        this.field10773 = field10773;
    }
    
    @Override
    public int method7968() {
        return this.field10772;
    }
    
    @Override
    public Class5260 method7969() {
        return this.field10773;
    }
}
