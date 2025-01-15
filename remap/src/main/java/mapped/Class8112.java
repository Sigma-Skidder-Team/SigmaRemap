// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap$Builder;
import com.google.common.collect.ImmutableMap;
import net.minecraft.world.dimension.DimensionType;

import java.util.concurrent.CompletableFuture;
import java.util.Map;

public final class Class8112
{
    private final Map<Class7859, String> field33427;
    private final CompletableFuture<Map<Class7859, String>> field33428;
    public final /* synthetic */ Class6122 field33429;
    
    private Class8112(final Class6122 field33429, final Class1655 class1655, final double n, final double n2) {
        this.field33429 = field33429;
        final Class1848 field33430 = Class6122.method18316(field33429).field4683;
        final DimensionType method20487 = Class6122.method18316(field33429).field4683.field10063.method20487();
        if (class1655.method1481(method20487) != null) {
            class1655.method1481(method20487);
        }
        final int n3 = (int)n >> 4;
        final int n4 = (int)n2 >> 4;
        final ImmutableMap$Builder builder = ImmutableMap.builder();
        final Class1907 method20488 = field33430.method6835();
        for (int i = n3 - 12; i <= n3 + 12; ++i) {
            for (int j = n4 - 12; j <= n4 + 12; ++j) {
                final Class7859 class1656 = new Class7859(i, j);
                final String str = "";
                final Class1862 method20489 = method20488.method7398(i, j, false);
                final String string = str + "Client: ";
                String s;
                if (method20489 != null) {
                    s = string + (method20489.method7062() ? " E" : "") + "\n";
                }
                else {
                    s = string + "0n/a\n";
                }
                builder.put((Object)class1656, (Object)s);
            }
        }
        this.field33427 = (Map<Class7859, String>)builder.build();
        this.field33428 = class1655.method5377(() -> {
            ImmutableMap.builder();
            class1657.method6904();
            int k = 0;
            final ImmutableMap$Builder immutableMap$Builder;
            while (k <= n5 + 12) {
                int l = 0;
                while (l <= n6 + 12) {
                    final Class7859 class1658 = new Class7859(k, l);
                    final Class1909 class1659;
                    immutableMap$Builder.put((Object)class1658, (Object)("Server: " + class1659.method7449(class1658)));
                    ++l;
                }
                ++k;
            }
            return immutableMap$Builder.build();
        });
    }
}
