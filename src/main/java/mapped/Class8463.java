// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Predicate;
import com.mojang.datafixers.OpticFinder;
import it.unimi.dsi.fastutil.ints.IntIterator;
import java.util.Iterator;
import java.util.ArrayList;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Dynamic;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.stream.Collector;
import java.util.function.Function;
import java.util.stream.Collectors;
import com.mojang.datafixers.Typed;
import java.util.Map;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.List$ListType;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.Set;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import com.mojang.datafixers.DataFix;

public class Class8463 extends DataFix
{
    private static final int[][] field34741;
    private static final Object2IntMap<String> field34742;
    private static final Set<String> field34743;
    
    public Class8463(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        final Type type = this.getInputSchema().getType(Class9451.field40613);
        if (type.findField("Level").type().findField("Sections").type() instanceof List$ListType) {
            return this.fixTypeEverywhereTyped("Leaves fix", type, typed -> {
                final List$ListType list$ListType;
                DSL.typeFinder(list$ListType.getElement());
                return typed.updateTyped(opticFinder, typed2 -> {
                    final int[] array = { 0 };
                    typed2.updateTyped(opticFinder2, typed3 -> {
                        final Int2ObjectMap int2ObjectMap = (Int2ObjectMap)new Int2ObjectOpenHashMap((Map)typed3.getAllTyped(opticFinder3).stream().map(typed4 -> new Class8188((Typed<?>)typed4, this.getInputSchema())).collect(Collectors.toMap((Function<? super Object, ?>)Class8187::method27108, class8190 -> class8190)));
                        if (!int2ObjectMap.values().stream().allMatch(Class8187::method27105)) {
                            Lists.newArrayList();
                            boolean b = false;
                            final ArrayList list;
                            while ((b ? 1 : 0) < 7) {
                                list.add(new IntOpenHashSet());
                                ++b;
                            }
                            int2ObjectMap.values().iterator();
                            final Iterator iterator;
                            while (iterator.hasNext()) {
                                final Class8188 class8188 = (Class8188)iterator.next();
                                if (class8188.method27105()) {
                                    continue;
                                }
                                else {
                                    int i = 0;
                                    while (i < 4096) {
                                        class8188.method27106(i);
                                        final int n;
                                        if (!class8188.method27113(n)) {
                                            if (!(!class8188.method27114(n))) {
                                                this.method28238(i);
                                                this.method28240(i);
                                                final int n2;
                                                final int n3;
                                                final int n4;
                                                array2[n2] |= method28241(n3 == 0, n3 == 15, n4 == 0, n4 == 15);
                                            }
                                        }
                                        else {
                                            ((IntSet)list.get(0)).add(class8188.method27108() << 12 | i);
                                        }
                                        ++i;
                                    }
                                }
                            }
                            int j = 0;
                            while (j < 7) {
                                final IntSet set = (IntSet)list.get(j - 1);
                                final IntSet set2 = (IntSet)list.get(j);
                                set.iterator();
                                final IntIterator intIterator;
                                while (intIterator.hasNext()) {
                                    intIterator.nextInt();
                                    final int n5;
                                    this.method28238(n5);
                                    this.method28239(n5);
                                    this.method28240(n5);
                                    final int[][] field34741 = Class8463.field34741;
                                    int k = 0;
                                    for (int length = field34741.length; k < length; ++k) {
                                        final int[] array3 = field34741[k];
                                        final int n7;
                                        final int n6 = n7 + array3[0];
                                        final int n9;
                                        final int n8 = n9 + array3[1];
                                        final int n11;
                                        final int n10 = n11 + array3[2];
                                        if (n6 >= 0) {
                                            if (n6 <= 15) {
                                                if (n10 >= 0) {
                                                    if (n10 <= 15) {
                                                        if (n8 >= 0) {
                                                            if (n8 <= 255) {
                                                                final Class8188 class8189 = (Class8188)int2ObjectMap.get(n8 >> 4);
                                                                if (class8189 != null) {
                                                                    if (!class8189.method27105()) {
                                                                        method28237(n6, n8 & 0xF, n10);
                                                                        final int n12;
                                                                        class8189.method27106(n12);
                                                                        final int n13;
                                                                        if (!(!class8189.method27114(n13))) {
                                                                            if (Class8188.method27117(class8189, n13) > j) {
                                                                                Class8188.method27118(class8189, n12, n13, j);
                                                                                set2.add(method28237(n6, n8, n10));
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                ++j;
                            }
                            return typed3.updateTyped(opticFinder3, typed5 -> ((Class8188)int2ObjectMap2.get(((Dynamic)typed5.get(DSL.remainderFinder())).get("Y").asInt(0))).method27104((Typed<?>)typed5));
                        }
                        else {
                            return typed3;
                        }
                    });
                    Typed update = null;
                    if (array[0] != 0) {
                        update = update.update(DSL.remainderFinder(), dynamic -> {
                            final Dynamic dynamic2 = (Dynamic)DataFixUtils.orElse(dynamic.get("UpgradeData").get(), (Object)dynamic.emptyMap());
                            return dynamic.set("UpgradeData", dynamic2.set("Sides", dynamic.createByte((byte)(dynamic2.get("Sides").asByte((byte)0) | array4[0]))));
                        });
                    }
                    return update;
                });
            });
        }
        throw new IllegalStateException("Expecting sections to be a list.");
    }
    
    public static int method28237(final int n, final int n2, final int n3) {
        return n2 << 8 | n3 << 4 | n;
    }
    
    private int method28238(final int n) {
        return n & 0xF;
    }
    
    private int method28239(final int n) {
        return n >> 8 & 0xFF;
    }
    
    private int method28240(final int n) {
        return n >> 4 & 0xF;
    }
    
    public static int method28241(final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        int n = 0;
        if (!b3) {
            if (!b4) {
                if (!b2) {
                    if (b) {
                        n |= 0x40;
                    }
                }
                else {
                    n |= 0x4;
                }
            }
            else if (!b) {
                if (!b2) {
                    n |= 0x10;
                }
                else {
                    n |= 0x8;
                }
            }
            else {
                n |= 0x20;
            }
        }
        else if (!b2) {
            if (!b) {
                n |= 0x1;
            }
            else {
                n |= 0x80;
            }
        }
        else {
            n |= 0x2;
        }
        return n;
    }
    
    static {
        field34741 = new int[][] { { -1, 0, 0 }, { 1, 0, 0 }, { 0, -1, 0 }, { 0, 1, 0 }, { 0, 0, -1 }, { 0, 0, 1 } };
        field34742 = (Object2IntMap)DataFixUtils.make((Object)new Object2IntOpenHashMap(), object2IntOpenHashMap -> {
            object2IntOpenHashMap.put((Object)"minecraft:acacia_leaves", 0);
            object2IntOpenHashMap.put((Object)"minecraft:birch_leaves", 1);
            object2IntOpenHashMap.put((Object)"minecraft:dark_oak_leaves", 2);
            object2IntOpenHashMap.put((Object)"minecraft:jungle_leaves", 3);
            object2IntOpenHashMap.put((Object)"minecraft:oak_leaves", 4);
            object2IntOpenHashMap.put((Object)"minecraft:spruce_leaves", 5);
            return;
        });
        field34743 = (Set)ImmutableSet.of((Object)"minecraft:acacia_bark", (Object)"minecraft:birch_bark", (Object)"minecraft:dark_oak_bark", (Object)"minecraft:jungle_bark", (Object)"minecraft:oak_bark", (Object)"minecraft:spruce_bark", (Object[])new String[] { "minecraft:acacia_log", "minecraft:birch_log", "minecraft:dark_oak_log", "minecraft:jungle_log", "minecraft:oak_log", "minecraft:spruce_log", "minecraft:stripped_acacia_log", "minecraft:stripped_birch_log", "minecraft:stripped_dark_oak_log", "minecraft:stripped_jungle_log", "minecraft:stripped_oak_log", "minecraft:stripped_spruce_log" });
    }
}
