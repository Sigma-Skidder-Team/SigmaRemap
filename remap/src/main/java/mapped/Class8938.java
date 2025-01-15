// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

public class Class8938
{
    private static String[] field37600;
    public int field37601;
    public int field37602;
    public List<Class354> field37603;
    
    public Class8938(final int field37601, final int field37602, final List<Class354> field37603) {
        this.field37601 = field37601;
        this.field37602 = field37602;
        this.field37603 = field37603;
    }
    
    public boolean method31699(final Class7859 class7859) {
        return class7859.field32290 == this.field37601 && class7859.field32291 == this.field37602;
    }
    
    public int method31700(final Class7859 class7859) {
        return (int)Math.sqrt((class7859.field32290 - this.field37601) * (class7859.field32290 - this.field37601) + (class7859.field32291 - this.field37602) * (class7859.field32291 - this.field37602));
    }
    
    public Class7859 method31701() {
        return new Class7859(this.field37601, this.field37602);
    }
}
