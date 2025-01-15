// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4081 extends Class3820
{
    private static String[] field18185;
    private final Class7499<? extends Class860> field18186;
    
    public Class4081(final Class7499<? extends Class860> field18186, final Class8959 class8959) {
        super(class8959);
        this.field18186 = field18186;
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final Class354 method21639 = class7075.method21639();
        final Class179 method21640 = class7075.method21648();
        final Class354 method21641 = method21639.method1149(method21640);
        final Class512 method21642 = class7075.method21652();
        final Class8321 method21643 = class7075.method21651();
        if (method21642 != null && !this.method12287(method21642, method21640, method21643, method21641)) {
            return Class2201.field13403;
        }
        final Class1847 method21644 = class7075.method21654();
        Class860 class7076;
        if (this.field18186 != Class7499.field29009) {
            if (this.field18186 != Class7499.field28993) {
                return Class2201.field13400;
            }
            class7076 = new Class862(method21644, method21641, method21640);
        }
        else {
            class7076 = new Class861(method21644, method21641, method21640);
        }
        final Class51 method21645 = method21643.method27657();
        if (method21645 != null) {
            Class7499.method23360(method21644, method21642, class7076, method21645);
        }
        if (!class7076.method5189()) {
            return Class2201.field13401;
        }
        if (!method21644.field10067) {
            class7076.method5193();
            method21644.method6886(class7076);
        }
        method21643.method27693(1);
        return Class2201.field13400;
    }
    
    public boolean method12287(final Class512 class512, final Class179 class513, final Class8321 class514, final Class354 class515) {
        return !class513.method790().method600() && class512.method2881(class515, class513, class514);
    }
}
