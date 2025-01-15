// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.UUID;

public class Class2664 extends Class2466
{
    private static String[] field14787;
    public final /* synthetic */ Class3054 field14788;
    
    public Class2664(final Class3054 field14788) {
        this.field14788 = field14788;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final int intValue = class8699.method29818(Class5260.field22312, 0);
        final UUID uuid = class8699.method29818(Class5260.field22310, 0);
        final Class1989 method25541 = Class7889.method25541(Class8456.method28223(class8699.method29818(Class5260.field22312, 1)));
        class8699.method29841().method18207(Class6643.class).method20173(intValue, method25541);
        class8699.method29821(Class5260.field22312, 1, method25541.method8008());
        if (method25541 == Class1989.field11005) {
            class8699.method29821(Class5260.field22296, 0, Class5209.method16320(class8699.method29818(Class5260.field22296, 0)));
        }
    }
}
