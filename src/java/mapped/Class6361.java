// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap$Entry;
import java.util.Iterator;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;

public class Class6361 extends Class6354
{
    private final Object2IntMap<String> field25443;
    
    public Class6361() {
        super("idcounts");
        (this.field25443 = (Object2IntMap<String>)new Object2IntOpenHashMap()).defaultReturnValue(-1);
    }
    
    @Override
    public void method18901(final Class51 class51) {
        this.field25443.clear();
        for (final String s : class51.method293()) {
            if (!class51.method316(s, 99)) {
                continue;
            }
            this.field25443.put((Object)s, class51.method319(s));
        }
    }
    
    @Override
    public Class51 method18902(final Class51 class51) {
        for (final Object2IntMap$Entry object2IntMap$Entry : this.field25443.object2IntEntrySet()) {
            class51.method298((String)object2IntMap$Entry.getKey(), object2IntMap$Entry.getIntValue());
        }
        return class51;
    }
    
    public int method18948() {
        final int n = this.field25443.getInt((Object)"map") + 1;
        this.field25443.put((Object)"map", n);
        this.method18903();
        return n;
    }
}
