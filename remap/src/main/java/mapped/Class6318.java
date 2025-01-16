// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.Collections;

import com.google.common.collect.Lists;
import java.util.Random;
import it.unimi.dsi.fastutil.Hash$Strategy;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenCustomHashMap;
import java.util.BitSet;
import java.util.Map;
import java.util.function.Predicate;

import net.minecraft.util.Direction;
import org.apache.commons.lang3.tuple.Pair;
import java.util.List;

public class Class6318 implements Class6313
{
    private static String[] field25261;
    private final List<Pair<Predicate<BlockState>, Class6313>> field25262;
    public final boolean field25263;
    public final boolean field25264;
    public final boolean field25265;
    public final TextureAtlasSprite field25266;
    public final Class7503 field25267;
    public final Class9168 field25268;
    private final Map<BlockState, BitSet> field25269;
    
    public Class6318(final List<Pair<Predicate<BlockState>, Class6313>> field25262) {
        this.field25269 = (Map<BlockState, BitSet>)new Object2ObjectOpenCustomHashMap((Hash$Strategy) Util.method27852());
        this.field25262 = field25262;
        final Class6313 class6313 = (Class6313)field25262.iterator().next().getRight();
        this.field25263 = class6313.method18692();
        this.field25264 = class6313.method18693();
        this.field25265 = class6313.method18694();
        this.field25266 = class6313.method18696();
        this.field25267 = class6313.method18697();
        this.field25268 = class6313.method18698();
    }
    
    @Override
    public List<Class8754> method18691(final BlockState class7096, final Direction class7097, final Random random) {
        if (class7096 != null) {
            BitSet set = this.field25269.get(class7096);
            if (set == null) {
                set = new BitSet();
                for (int i = 0; i < this.field25262.size(); ++i) {
                    if (((Predicate)this.field25262.get(i).getLeft()).test(class7096)) {
                        set.set(i);
                    }
                }
                this.field25269.put(class7096, set);
            }
            final ArrayList arrayList = Lists.newArrayList();
            final long nextLong = random.nextLong();
            for (int j = 0; j < set.length(); ++j) {
                if (set.get(j)) {
                    arrayList.addAll(((Class6313)this.field25262.get(j).getRight()).method18691(class7096, class7097, new Random(nextLong)));
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }
    
    @Override
    public boolean method18692() {
        return this.field25263;
    }
    
    @Override
    public boolean method18693() {
        return this.field25264;
    }
    
    @Override
    public boolean method18694() {
        return this.field25265;
    }
    
    @Override
    public boolean method18695() {
        return false;
    }
    
    @Override
    public TextureAtlasSprite method18696() {
        return this.field25266;
    }
    
    @Override
    public Class7503 method18697() {
        return this.field25267;
    }
    
    @Override
    public Class9168 method18698() {
        return this.field25268;
    }
}
