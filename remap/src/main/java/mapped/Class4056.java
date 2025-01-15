// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

public class Class4056 extends Class3820
{
    private final Class230 field18152;
    
    public Class4056(final Class230 field18152, final Class8959 class8959) {
        super(class8959);
        this.field18152 = field18152;
    }
    
    public Class230 method12260() {
        return this.field18152;
    }
    
    @Override
    public void method11728(final Class8321 class8321, final Class1847 class8322, final List<Class2250> list, final Class1981 class8323) {
        list.add(this.method12261().method8469(Class2116.field12316));
    }
    
    public Class2250 method12261() {
        return new Class2259(this.method11717() + ".desc", new Object[0]);
    }
}
