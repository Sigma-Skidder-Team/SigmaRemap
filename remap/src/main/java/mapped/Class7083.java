// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class7083 implements Class7079
{
    private static final ITextComponent field27591;
    private static final ITextComponent field27592;
    private final Class9106 field27593;
    private Class6869 field27594;
    private int field27595;
    
    public Class7083(final Class9106 field27593) {
        this.field27593 = field27593;
    }
    
    @Override
    public void method21655() {
        ++this.field27595;
        if (this.field27593.method32928() == Class101.field298) {
            if (this.field27595 >= 600) {
                if (this.field27594 == null) {
                    this.field27594 = new Class6869(Class2240.field13770, Class7083.field27591, Class7083.field27592, false);
                    this.field27593.method32927().method5318().method3852(this.field27594);
                }
            }
        }
        else {
            this.field27593.method32926(Class2012.field11444);
        }
    }
    
    @Override
    public void method21656() {
        if (this.field27594 != null) {
            this.field27594.method20985();
            this.field27594 = null;
        }
    }
    
    @Override
    public void method21661() {
        this.field27593.method32926(Class2012.field11443);
    }
    
    static {
        field27591 = new Class2259("tutorial.open_inventory.title");
        field27592 = new Class2259("tutorial.open_inventory.description", Class9106.method32929("inventory"));
    }
}
