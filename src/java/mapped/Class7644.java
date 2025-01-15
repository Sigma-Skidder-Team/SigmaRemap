// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7644
{
    private static String[] field30360;
    public final double field30361;
    public final double field30362;
    public final double field30363;
    public final double field30364;
    public final double field30365;
    public final double field30366;
    
    public Class7644(final double field30361, final double field30362, final double field30363, final double field30364, final double field30365, final double field30366) {
        this.field30361 = field30361;
        this.field30362 = field30362;
        this.field30363 = field30363;
        this.field30364 = field30364;
        this.field30365 = field30365;
        this.field30366 = field30366;
    }
    
    public Class7644(final Class6221 class6221) {
        this.field30361 = class6221.field25073;
        this.field30362 = class6221.field25074;
        this.field30363 = class6221.field25075;
        this.field30364 = class6221.field25076;
        this.field30365 = class6221.field25077;
        this.field30366 = class6221.field25078;
    }
    
    public Class7644 method24204(final double n) {
        return new Class7644(this.field30361 - n, this.field30362 - n, this.field30363 - n, this.field30364 + n * 2.0, this.field30365 + n * 2.0, this.field30366 + n * 2.0);
    }
}
