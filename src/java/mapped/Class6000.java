// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6000 implements Class5997
{
    public final /* synthetic */ Class6589 field24473;
    
    public Class6000(final Class6589 field24473) {
        this.field24473 = field24473;
    }
    
    private Class5997 method17924(final Class7576 class7576) {
        class7576.method23850(this.field24473.method20023(class7576));
        return this.field24473.field26128.get(class7576.method23834());
    }
    
    @Override
    public Object method17922(final Class7576 class7576) {
        try {
            return this.method17924(class7576).method17922(class7576);
        }
        catch (final Class2390 class7577) {
            throw class7577;
        }
        catch (final Exception ex) {
            throw new Class2390(null, null, "Can't construct a java object for " + class7576.method23845() + "; exception=" + ex.getMessage(), class7576.method23847(), ex);
        }
    }
    
    @Override
    public void method17923(final Class7576 class7576, final Object o) {
        try {
            this.method17924(class7576).method17923(class7576, o);
        }
        catch (final Exception ex) {
            throw new Class2390(null, null, "Can't construct a second step for a java object for " + class7576.method23845() + "; exception=" + ex.getMessage(), class7576.method23847(), ex);
        }
    }
}
