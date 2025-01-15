// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.objects.ObjectArrays;
import java.util.Random;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import com.mojang.datafixers.util.Pair;
import com.google.common.collect.ImmutableList;

public class Class8795
{
    public static final Class8795 field36977;
    public static final Class8795 field36978;
    private final Class1932 field36979;
    private final ImmutableList<Pair<Class8228, Integer>> field36980;
    private final List<Class8228> field36981;
    private final Class1932 field36982;
    private final Class261 field36983;
    private int field36984;
    
    public Class8795(final Class1932 field36979, final Class1932 field36980, final List<Pair<Class8228, Integer>> list, final Class261 field36981) {
        this.field36984 = Integer.MIN_VALUE;
        this.field36979 = field36979;
        this.field36980 = (ImmutableList<Pair<Class8228, Integer>>)ImmutableList.copyOf((Collection)list);
        this.field36981 = Lists.newArrayList();
        for (final Pair pair : list) {
            for (Integer n = 0; n < (int)pair.getSecond(); ++n) {
                this.field36981.add(((Class8228)pair.getFirst()).method27262(field36981));
            }
        }
        this.field36982 = field36980;
        this.field36983 = field36981;
    }
    
    public int method30671(final Class1795 class1795) {
        if (this.field36984 == Integer.MIN_VALUE) {
            this.field36984 = this.field36981.stream().mapToInt(class1797 -> class1797.method27254(class1796, BlockPos.ZERO, Class2052.field11707).getYSize()).max().orElse(0);
        }
        return this.field36984;
    }
    
    public Class1932 method30672() {
        return this.field36982;
    }
    
    public Class8228 method30673(final Random random) {
        return this.field36981.get(random.nextInt(this.field36981.size()));
    }
    
    public List<Class8228> method30674(final Random random) {
        return (List<Class8228>)ImmutableList.copyOf(ObjectArrays.shuffle((Object[])this.field36981.toArray(new Class8228[0]), random));
    }
    
    public Class1932 method30675() {
        return this.field36979;
    }
    
    public int method30676() {
        return this.field36981.size();
    }
    
    static {
        field36977 = new Class8795(new Class1932("empty"), new Class1932("empty"), (List<Pair<Class8228, Integer>>)ImmutableList.of(), Class261.field1247);
        field36978 = new Class8795(new Class1932("invalid"), new Class1932("invalid"), (List<Pair<Class8228, Integer>>)ImmutableList.of(), Class261.field1247);
    }
}
