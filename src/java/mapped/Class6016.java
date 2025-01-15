// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

public class Class6016 extends Class6015
{
    private static String[] field24491;
    public final /* synthetic */ Class6591 field24492;
    
    public Class6016(final Class6591 field24492) {
        this.field24492 = field24492;
        super(field24492);
    }
    
    @Override
    public void method17923(final Class7576 class7576, final Object o) {
        final Class7576 method35261 = ((Class7575)class7576).method23835().iterator().next().method35261();
        if (!(method35261 instanceof Class7575)) {
            this.field24492.method20031(o, Class6591.method20033(this.field24492, (Class7573)method35261));
        }
        else {
            method35261.method23850(o.getClass());
            this.method17927((Class7575)method35261, o);
        }
    }
    
    @Override
    public Object method17922(final Class7576 class7576) {
        Class7577 class7577;
        if (!(class7576 instanceof Class7575)) {
            class7577 = (Class7577)class7576;
        }
        else {
            final Class9474 class7578 = ((Class7575)class7576).method23835().iterator().next();
            class7576.method23851(true);
            class7577 = (Class7577)class7578.method35260();
        }
        final Class8440 method20028 = this.field24492.method20028(class7577.method23856());
        if (method20028 != null) {
            return this.field24492.method20025(class7577, method20028);
        }
        return Class6591.method20034(this.field24492, class7577);
    }
}
