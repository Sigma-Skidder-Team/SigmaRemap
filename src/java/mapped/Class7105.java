// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7105
{
    private static String[] field27720;
    public double field27721;
    public double field27722;
    public double field27723;
    public double field27724;
    
    public Class7105(final double field27721, final double field27722, final double field27723, final double field27724) {
        this.field27721 = field27721;
        this.field27722 = field27722;
        this.field27723 = field27723;
        this.field27724 = field27724;
    }
    
    public double[] method21822() {
        final double n = Class3239.method10231().field4684.field2395 - this.field27721;
        final double n2 = Class3239.method10232().field4684.field2397 - this.field27723;
        return new double[] { this.field27721 + this.field27724 * n / Math.sqrt(n * n + n2 * n2), this.field27722, this.field27723 + this.field27724 * n2 / Math.sqrt(n * n + n2 * n2) };
    }
}
