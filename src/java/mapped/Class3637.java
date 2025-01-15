// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3637 extends Class3446
{
    private static String[] field16878;
    private final Class776 field16879;
    public final /* synthetic */ Class776 field16880;
    
    public Class3637(final Class776 field16880, final Class776 field16881) {
        this.field16880 = field16880;
        this.field16879 = field16881;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        final Class8792 method4292 = this.field16879.method4292();
        if (this.field16879.method1768()) {
            if (this.field16879.method4152() == null) {
                if (method4292 != null) {
                    if (method4292.method30623()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11015() {
        this.field16879.method4297(true);
        super.method11015();
    }
    
    @Override
    public void method11018() {
        this.field16879.method4297(false);
        super.method11018();
    }
    
    @Override
    public void method11016() {
        if (!this.field16879.method1696()) {
            if (Class776.method4301(this.field16879).nextInt(100) == 0) {
                this.field16880.method1695(this.field16880.method4260(), Class776.method4302(this.field16880), Class776.method4303(this.field16880));
            }
        }
        if (!this.field16879.method1805()) {
            if (Class776.method4304(this.field16879).nextInt(50) == 0) {
                this.field16879.method4149().method22382();
            }
        }
        super.method11016();
    }
}
