// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class151 implements Class122
{
    private static String[] field443;
    private final Boolean field444;
    private final Boolean field445;
    
    private Class151(final Boolean field444, final Boolean field445) {
        this.field444 = field444;
        this.field445 = field445;
    }
    
    @Override
    public boolean test(final Class7529 class7529) {
        final Class1849 method23588 = class7529.method23588();
        return (this.field444 == null || this.field444 == method23588.method6771()) && (this.field445 == null || this.field445 == method23588.method6770());
    }
}
