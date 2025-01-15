// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2481 extends Class2466
{
    private static String[] field14451;
    public final /* synthetic */ Class2825 field14452;
    
    public Class2481(final Class2825 field14452) {
        this.field14452 = field14452;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final int intValue = class8699.method29818(Class5260.field22312, 0);
        final Class2148 method32624 = Class9059.method32624(class8699.method29818(Class5260.field22289, 0), true);
        if (method32624 != null) {
            if (method32624.method8315(Class2148.field12654)) {
                final int intValue2 = class8699.method29818(Class5260.field22296, 0);
                class8699.method29821(Class5260.field22296, 0, Class7559.method23731((intValue2 & 0xFFF) << 4 | (intValue2 >> 12 & 0xF)));
            }
            if (method32624.method8315(Class2148.field12740)) {
                int intValue3 = class8699.method29818(Class5260.field22296, 0);
                switch (intValue3) {
                    case 0: {
                        intValue3 = 3;
                        break;
                    }
                    case 1: {
                        intValue3 = 4;
                        break;
                    }
                    case 3: {
                        intValue3 = 5;
                        break;
                    }
                }
                class8699.method29821(Class5260.field22296, 0, intValue3);
            }
        }
        class8699.method29841().method18207(Class6641.class).method20162(intValue, method32624);
    }
}
