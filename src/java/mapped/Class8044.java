// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.types.Type;
import java.util.Optional;
import java.util.Arrays;
import java.util.stream.IntStream;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class8044 extends DataFix
{
    public Class8044(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("Leaves fix", this.getInputSchema().getType(Class9451.field40613), typed -> {
            final Type type;
            type.findField("Level");
            return typed.updateTyped(opticFinder, typed2 -> typed2.update(DSL.remainderFinder(), dynamic -> {
                dynamic.get("Biomes").asIntStreamOpt();
                final Optional optional;
                if (optional.isPresent()) {
                    optional.get().toArray();
                    final int[] array = new int[1024];
                    int i = 0;
                    while (i < 4) {
                        int j = 0;
                        while (j < 4) {
                            final int n;
                            final int[] array2;
                            array[i << 2 | j] = ((n >= array2.length) ? -1 : array2[n]);
                            ++j;
                        }
                        ++i;
                    }
                    int k = 0;
                    while (k < 64) {
                        System.arraycopy(array, 0, array, k * 16, 16);
                        ++k;
                    }
                    return dynamic.set("Biomes", dynamic.createIntList(Arrays.stream(array)));
                }
                else {
                    return dynamic;
                }
            }));
        });
    }
}
