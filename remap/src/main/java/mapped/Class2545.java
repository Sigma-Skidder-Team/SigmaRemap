// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.UUID;

public class Class2545 extends Class2466
{
    private static String[] field14570;
    public final /* synthetic */ Class3071 field14571;
    
    public Class2545(final Class3071 field14571) {
        this.field14571 = field14571;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final int intValue = class8699.method29818(Class5260.field22312, 0);
        final UUID uuid = class8699.method29818(Class5260.field22310, 0);
        final Class2148 method32624 = Class9059.method32624(class8699.method29818(Class5260.field22312, 1), true);
        int i = (int)Class8329.method27766(method32624.method8317()).or((Object)method32624.method8317());
        final Class266 method32625 = Class8816.method30754(i);
        if (method32625 != null) {
            final int intValue2 = class8699.method29818(Class5260.field22296, 0);
            if (method32625.method909(Class266.field1300)) {
                class8699.method29821(Class5260.field22296, 0, Class5213.method16325(intValue2));
            }
            else if (method32625.method909(Class266.field1416)) {
                switch (intValue2) {
                    case 1: {
                        i = Class266.field1414.method911();
                        break;
                    }
                    case 2: {
                        i = Class266.field1417.method911();
                        break;
                    }
                    case 3: {
                        i = Class266.field1419.method911();
                        break;
                    }
                    case 4: {
                        i = Class266.field1420.method911();
                        break;
                    }
                    case 5: {
                        i = Class266.field1415.method911();
                        break;
                    }
                    case 6: {
                        i = Class266.field1418.method911();
                        break;
                    }
                }
            }
            else if ((method32625.method909(Class266.field1302) && intValue2 > 0) || method32625.method910(Class266.field1397)) {
                if (method32625.method910(Class266.field1397)) {
                    class8699.method29821(Class5260.field22296, 0, intValue2 - 1);
                }
                final Class8699 method32626 = class8699.method29836(69);
                method32626.method29823(Class5260.field22312, intValue);
                method32626.method29823(Class5260.field22304, (Short)class8699.method29818((Class5260<T>)Class5260.field22304, 0));
                method32626.method29823(Class5260.field22304, (Short)class8699.method29818((Class5260<T>)Class5260.field22304, 1));
                method32626.method29823(Class5260.field22304, (Short)class8699.method29818((Class5260<T>)Class5260.field22304, 2));
                method32626.method29833(Class5213.class);
            }
        }
        class8699.method29821(Class5260.field22312, 1, i);
        class8699.method29841().method18207(Class6639.class).method20139(intValue, method32625);
    }
}
