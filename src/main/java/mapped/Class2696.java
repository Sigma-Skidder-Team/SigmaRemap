// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class2696 extends Class2466
{
    public final /* synthetic */ Class2888 field14850;
    
    public Class2696(final Class2888 field14850) {
        this.field14850 = field14850;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final Class6562 class8700 = class8699.method29824((Class5260<Class6562>)new Class5282(class8699.method29841().method18207(Class6637.class)));
        class8699.method29827();
        if (class8700.method19892() != null) {
            for (final Class74 class8701 : class8700.method19892()) {
                if (!class8701.method418("id")) {
                    continue;
                }
                final String method406 = class8701.method419("id").method406();
                if (method406.equals("MobSpawner")) {
                    Class9325.method34545(class8701);
                }
                class8701.method419("id").method407(Class8963.method31801(method406));
            }
        }
    }
}
