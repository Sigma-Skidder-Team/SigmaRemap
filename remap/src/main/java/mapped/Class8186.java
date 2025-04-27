// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import com.mojang.datafixers.Dynamic;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.Typed;
import it.unimi.dsi.fastutil.ints.IntSet;

public final class Class8186 extends Class8187
{
    private IntSet field33693;
    
    public Class8186(final Typed<?> typed, final Schema schema) {
        super(typed, schema);
    }
    
    @Override
    public boolean method27101() {
        this.field33693 = new IntOpenHashSet();
        for (int i = 0; i < this.field33696.size(); ++i) {
            if (Objects.equals(this.field33696.get(i).get("Name").asString(""), "minecraft:trapped_chest")) {
                this.field33693.add(i);
            }
        }
        return this.field33693.isEmpty();
    }
    
    public boolean method27102(final int n) {
        return this.field33693.contains(n);
    }
}
