// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import com.mojang.datafixers.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.Typed;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.IntSet;

public final class Class8188 extends Class8187
{
    private IntSet field33699;
    private IntSet field33700;
    private Int2IntMap field33701;
    
    public Class8188(final Typed<?> typed, final Schema schema) {
        super(typed, schema);
    }
    
    @Override
    public boolean method27101() {
        this.field33699 = new IntOpenHashSet();
        this.field33700 = new IntOpenHashSet();
        this.field33701 = new Int2IntOpenHashMap();
        for (int i = 0; i < this.field33696.size(); ++i) {
            final Dynamic dynamic = this.field33696.get(i);
            final String string = dynamic.get("Name").asString("");
            if (Class8463.method28247().containsKey((Object)string)) {
                final boolean equals = Objects.equals(dynamic.get("Properties").get("decayable").asString(""), "false");
                this.field33699.add(i);
                this.field33701.put(this.method27107(string, equals, 7), i);
                this.field33696.set(i, this.method27112((Dynamic<?>)dynamic, string, equals, 7));
            }
            if (Class8463.method28248().contains(string)) {
                this.field33700.add(i);
            }
        }
        return this.field33699.isEmpty() && this.field33700.isEmpty();
    }
    
    private Dynamic<?> method27112(final Dynamic<?> dynamic, final String s, final boolean b, final int i) {
        final Dynamic emptyMap = dynamic.emptyMap();
        final Dynamic set = emptyMap.set("persistent", emptyMap.createString(b ? "true" : "false"));
        final Dynamic set2 = dynamic.emptyMap().set("Properties", set.set("distance", set.createString(Integer.toString(i))));
        return (Dynamic<?>)set2.set("Name", set2.createString(s));
    }
    
    public boolean method27113(final int n) {
        return this.field33700.contains(n);
    }
    
    public boolean method27114(final int n) {
        return this.field33699.contains(n);
    }
    
    private int method27115(final int n) {
        return this.method27113(n) ? 0 : Integer.parseInt(this.field33696.get(n).get("Properties").get("distance").asString(""));
    }
    
    private void method27116(final int n, final int n2, final int n3) {
        final Dynamic dynamic = this.field33696.get(n2);
        final String string = dynamic.get("Name").asString("");
        final boolean equals = Objects.equals(dynamic.get("Properties").get("persistent").asString(""), "true");
        final int method27107 = this.method27107(string, equals, n3);
        if (!this.field33701.containsKey(method27107)) {
            final int size = this.field33696.size();
            this.field33699.add(size);
            this.field33701.put(method27107, size);
            this.field33696.add(this.method27112((Dynamic<?>)dynamic, string, equals, n3));
        }
        final int value = this.field33701.get(method27107);
        if (1 << this.field33698.method33930() <= value) {
            final Class9217 field33698 = new Class9217(this.field33698.method33930() + 1, 4096);
            for (int i = 0; i < 4096; ++i) {
                field33698.method33926(i, this.field33698.method33927(i));
            }
            this.field33698 = field33698;
        }
        this.field33698.method33926(n, value);
    }
}
