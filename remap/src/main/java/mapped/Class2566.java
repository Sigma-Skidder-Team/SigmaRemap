// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

public class Class2566 extends Class2466
{
    public final /* synthetic */ Class2804 field14606;
    
    public Class2566(final Class2804 field14606) {
        this.field14606 = field14606;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final List<Class7276> list = class8699.method29818(Class8794.field36974, 0);
        final int intValue = class8699.method29818(Class5260.field22312, 0);
        final Class1974 class8700 = class8699.method29841().method18207(Class6634.class).method20101().get(intValue);
        if (class8700 == null) {
            Class8563.method28793().method34742().warning("Unable to find entity for metadata, entity ID: " + intValue);
            list.clear();
        }
        else {
            Class9392.method34924(class8700, list);
        }
    }
}
