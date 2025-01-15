// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.UUID;

public class Class2661 extends Class2466
{
    private static String[] field14781;
    public final /* synthetic */ Class2834 field14782;
    
    public Class2661(final Class2834 field14782) {
        this.field14782 = field14782;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final int intValue = class8699.method29818(Class5260.field22312, 0);
        final int intValue2 = class8699.method29818(Class5260.field22312, 1);
        final UUID uuid = class8699.method29818(Class5260.field22310, 0);
        final int intValue3 = (int)Class8329.method27766(intValue2).or((Object)intValue2);
        final Class266 method30754 = Class8816.method30754(intValue3);
        class8699.method29821(Class5260.field22312, 1, intValue3);
        class8699.method29841().method18207(Class6639.class).method20139(intValue, method30754);
        Class7380.method22654(intValue, method30754, class8699.method29818(Class8761.field36784, 0), class8699.method29841());
    }
}
