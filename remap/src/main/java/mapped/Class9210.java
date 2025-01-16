// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Locale;

public class Class9210
{
    private static Class9210 field39013;
    private final int field39014;
    private final int field39015;
    private final int field39016;
    private final int field39017;
    private final int field39018;
    private final boolean field39019;
    private final boolean field39020;
    
    private Class9210(final boolean field39019, final boolean field39020, final int field39021, final int field39022, final int field39023, final int field39024, final int field39025) {
        this.field39019 = field39019;
        this.field39014 = field39021;
        this.field39016 = field39022;
        this.field39015 = field39023;
        this.field39017 = field39024;
        this.field39020 = field39020;
        this.field39018 = field39025;
    }
    
    public Class9210() {
        this(false, true, 1, 0, 1, 0, 32774);
    }
    
    public Class9210(final int n, final int n2, final int n3) {
        this(false, false, n, n2, n, n2, n3);
    }
    
    public Class9210(final int n, final int n2, final int n3, final int n4, final int n5) {
        this(true, false, n, n2, n3, n4, n5);
    }
    
    public void method33685() {
        if (!this.equals(Class9210.field39013)) {
            if (Class9210.field39013 == null || this.field39020 != Class9210.field39013.method33686()) {
                Class9210.field39013 = this;
                if (this.field39020) {
                    RenderSystem.disableBlend();
                    return;
                }
                RenderSystem.enableBlend();
            }
            RenderSystem.method30017(this.field39018);
            if (!this.field39019) {
                RenderSystem.method30014(this.field39014, this.field39016);
            }
            else {
                RenderSystem.method30016(this.field39014, this.field39016, this.field39015, this.field39017);
            }
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class9210) {
            final Class9210 class9210 = (Class9210)o;
            return this.field39018 == class9210.field39018 && this.field39017 == class9210.field39017 && this.field39016 == class9210.field39016 && this.field39020 == class9210.field39020 && this.field39019 == class9210.field39019 && this.field39015 == class9210.field39015 && this.field39014 == class9210.field39014;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * (31 * (31 * this.field39014 + this.field39015) + this.field39016) + this.field39017) + this.field39018) + (this.field39019 ? 1 : 0)) + (this.field39020 ? 1 : 0);
    }
    
    public boolean method33686() {
        return this.field39020;
    }
    
    public static int method33687(final String s) {
        final String lowerCase = s.trim().toLowerCase(Locale.ROOT);
        if ("add".equals(lowerCase)) {
            return 32774;
        }
        if ("subtract".equals(lowerCase)) {
            return 32778;
        }
        if ("reversesubtract".equals(lowerCase)) {
            return 32779;
        }
        if ("reverse_subtract".equals(lowerCase)) {
            return 32779;
        }
        if (!"min".equals(lowerCase)) {
            return "max".equals(lowerCase) ? 32776 : 32774;
        }
        return 32775;
    }
    
    public static int method33688(final String s) {
        final String replaceAll = s.trim().toLowerCase(Locale.ROOT).replaceAll("_", "").replaceAll("one", "1").replaceAll("zero", "0").replaceAll("minus", "-");
        if ("0".equals(replaceAll)) {
            return 0;
        }
        if ("1".equals(replaceAll)) {
            return 1;
        }
        if ("srccolor".equals(replaceAll)) {
            return 768;
        }
        if ("1-srccolor".equals(replaceAll)) {
            return 769;
        }
        if ("dstcolor".equals(replaceAll)) {
            return 774;
        }
        if ("1-dstcolor".equals(replaceAll)) {
            return 775;
        }
        if ("srcalpha".equals(replaceAll)) {
            return 770;
        }
        if ("1-srcalpha".equals(replaceAll)) {
            return 771;
        }
        if (!"dstalpha".equals(replaceAll)) {
            return "1-dstalpha".equals(replaceAll) ? 773 : -1;
        }
        return 772;
    }
}
