// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.mojang.datafixers.DataFixUtils;
import com.google.common.collect.Maps;
import org.apache.logging.log4j.LogManager;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Objects;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry;
import java.util.HashMap;
import java.util.function.Function;
import com.mojang.datafixers.TypeRewriteRule;
import java.util.Optional;
import com.mojang.datafixers.schemas.Schema;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.Map;
import com.mojang.datafixers.Dynamic;
import java.util.BitSet;
import org.apache.logging.log4j.Logger;
import com.mojang.datafixers.DataFix;

public class Class9251 extends DataFix
{
    private static final Logger field39666;
    private static final BitSet field39667;
    private static final BitSet field39668;
    private static final Dynamic<?> field39669;
    private static final Dynamic<?> field39670;
    private static final Dynamic<?> field39671;
    private static final Dynamic<?> field39672;
    private static final Dynamic<?> field39673;
    private static final Dynamic<?> field39674;
    private static final Dynamic<?> field39675;
    private static final Dynamic<?> field39676;
    private static final Dynamic<?> field39677;
    private static final Dynamic<?> field39678;
    private static final Map<String, Dynamic<?>> field39679;
    private static final Map<String, Dynamic<?>> field39680;
    private static final Map<String, Dynamic<?>> field39681;
    private static final Map<String, Dynamic<?>> field39682;
    private static final Int2ObjectMap<String> field39683;
    private static final Map<String, Dynamic<?>> field39684;
    private static final Map<String, Dynamic<?>> field39685;
    private static final Dynamic<?> field39686;
    
    public Class9251(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    private static void method34105(final Map<String, Dynamic<?>> map, final int i, final String str, final String str2) {
        map.put(i + "north", Class7922.method25671("{Name:'minecraft:" + str + "_wall_" + str2 + "',Properties:{facing:'north'}}"));
        map.put(i + "east", Class7922.method25671("{Name:'minecraft:" + str + "_wall_" + str2 + "',Properties:{facing:'east'}}"));
        map.put(i + "south", Class7922.method25671("{Name:'minecraft:" + str + "_wall_" + str2 + "',Properties:{facing:'south'}}"));
        map.put(i + "west", Class7922.method25671("{Name:'minecraft:" + str + "_wall_" + str2 + "',Properties:{facing:'west'}}"));
        for (int j = 0; j < 16; ++j) {
            map.put(i + "" + j, Class7922.method25671("{Name:'minecraft:" + str + "_" + str2 + "',Properties:{rotation:'" + j + "'}}"));
        }
    }
    
    private static void method34106(final Map<String, Dynamic<?>> map, final String s, final int n) {
        map.put("minecraft:" + s + "eastlowerleftfalsefalse", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'false',powered:'false'}}"));
        map.put("minecraft:" + s + "eastlowerleftfalsetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'false',powered:'true'}}"));
        map.put("minecraft:" + s + "eastlowerlefttruefalse", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'true',powered:'false'}}"));
        map.put("minecraft:" + s + "eastlowerlefttruetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'true',powered:'true'}}"));
        map.put("minecraft:" + s + "eastlowerrightfalsefalse", Class7922.method25672(n));
        map.put("minecraft:" + s + "eastlowerrightfalsetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'east',half:'lower',hinge:'right',open:'false',powered:'true'}}"));
        map.put("minecraft:" + s + "eastlowerrighttruefalse", Class7922.method25672(n + 4));
        map.put("minecraft:" + s + "eastlowerrighttruetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'east',half:'lower',hinge:'right',open:'true',powered:'true'}}"));
        map.put("minecraft:" + s + "eastupperleftfalsefalse", Class7922.method25672(n + 8));
        map.put("minecraft:" + s + "eastupperleftfalsetrue", Class7922.method25672(n + 10));
        map.put("minecraft:" + s + "eastupperlefttruefalse", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'east',half:'upper',hinge:'left',open:'true',powered:'false'}}"));
        map.put("minecraft:" + s + "eastupperlefttruetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'east',half:'upper',hinge:'left',open:'true',powered:'true'}}"));
        map.put("minecraft:" + s + "eastupperrightfalsefalse", Class7922.method25672(n + 9));
        map.put("minecraft:" + s + "eastupperrightfalsetrue", Class7922.method25672(n + 11));
        map.put("minecraft:" + s + "eastupperrighttruefalse", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'east',half:'upper',hinge:'right',open:'true',powered:'false'}}"));
        map.put("minecraft:" + s + "eastupperrighttruetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'east',half:'upper',hinge:'right',open:'true',powered:'true'}}"));
        map.put("minecraft:" + s + "northlowerleftfalsefalse", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'false',powered:'false'}}"));
        map.put("minecraft:" + s + "northlowerleftfalsetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'false',powered:'true'}}"));
        map.put("minecraft:" + s + "northlowerlefttruefalse", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'true',powered:'false'}}"));
        map.put("minecraft:" + s + "northlowerlefttruetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'true',powered:'true'}}"));
        map.put("minecraft:" + s + "northlowerrightfalsefalse", Class7922.method25672(n + 3));
        map.put("minecraft:" + s + "northlowerrightfalsetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'north',half:'lower',hinge:'right',open:'false',powered:'true'}}"));
        map.put("minecraft:" + s + "northlowerrighttruefalse", Class7922.method25672(n + 7));
        map.put("minecraft:" + s + "northlowerrighttruetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'north',half:'lower',hinge:'right',open:'true',powered:'true'}}"));
        map.put("minecraft:" + s + "northupperleftfalsefalse", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'false',powered:'false'}}"));
        map.put("minecraft:" + s + "northupperleftfalsetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'false',powered:'true'}}"));
        map.put("minecraft:" + s + "northupperlefttruefalse", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'true',powered:'false'}}"));
        map.put("minecraft:" + s + "northupperlefttruetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'true',powered:'true'}}"));
        map.put("minecraft:" + s + "northupperrightfalsefalse", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'false',powered:'false'}}"));
        map.put("minecraft:" + s + "northupperrightfalsetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'false',powered:'true'}}"));
        map.put("minecraft:" + s + "northupperrighttruefalse", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'true',powered:'false'}}"));
        map.put("minecraft:" + s + "northupperrighttruetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'true',powered:'true'}}"));
        map.put("minecraft:" + s + "southlowerleftfalsefalse", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'false',powered:'false'}}"));
        map.put("minecraft:" + s + "southlowerleftfalsetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'false',powered:'true'}}"));
        map.put("minecraft:" + s + "southlowerlefttruefalse", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'true',powered:'false'}}"));
        map.put("minecraft:" + s + "southlowerlefttruetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'true',powered:'true'}}"));
        map.put("minecraft:" + s + "southlowerrightfalsefalse", Class7922.method25672(n + 1));
        map.put("minecraft:" + s + "southlowerrightfalsetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'south',half:'lower',hinge:'right',open:'false',powered:'true'}}"));
        map.put("minecraft:" + s + "southlowerrighttruefalse", Class7922.method25672(n + 5));
        map.put("minecraft:" + s + "southlowerrighttruetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'south',half:'lower',hinge:'right',open:'true',powered:'true'}}"));
        map.put("minecraft:" + s + "southupperleftfalsefalse", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'false',powered:'false'}}"));
        map.put("minecraft:" + s + "southupperleftfalsetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'false',powered:'true'}}"));
        map.put("minecraft:" + s + "southupperlefttruefalse", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'true',powered:'false'}}"));
        map.put("minecraft:" + s + "southupperlefttruetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'true',powered:'true'}}"));
        map.put("minecraft:" + s + "southupperrightfalsefalse", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'false',powered:'false'}}"));
        map.put("minecraft:" + s + "southupperrightfalsetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'false',powered:'true'}}"));
        map.put("minecraft:" + s + "southupperrighttruefalse", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'true',powered:'false'}}"));
        map.put("minecraft:" + s + "southupperrighttruetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'true',powered:'true'}}"));
        map.put("minecraft:" + s + "westlowerleftfalsefalse", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'false',powered:'false'}}"));
        map.put("minecraft:" + s + "westlowerleftfalsetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'false',powered:'true'}}"));
        map.put("minecraft:" + s + "westlowerlefttruefalse", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'true',powered:'false'}}"));
        map.put("minecraft:" + s + "westlowerlefttruetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'true',powered:'true'}}"));
        map.put("minecraft:" + s + "westlowerrightfalsefalse", Class7922.method25672(n + 2));
        map.put("minecraft:" + s + "westlowerrightfalsetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'west',half:'lower',hinge:'right',open:'false',powered:'true'}}"));
        map.put("minecraft:" + s + "westlowerrighttruefalse", Class7922.method25672(n + 6));
        map.put("minecraft:" + s + "westlowerrighttruetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'west',half:'lower',hinge:'right',open:'true',powered:'true'}}"));
        map.put("minecraft:" + s + "westupperleftfalsefalse", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'false',powered:'false'}}"));
        map.put("minecraft:" + s + "westupperleftfalsetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'false',powered:'true'}}"));
        map.put("minecraft:" + s + "westupperlefttruefalse", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'true',powered:'false'}}"));
        map.put("minecraft:" + s + "westupperlefttruetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'true',powered:'true'}}"));
        map.put("minecraft:" + s + "westupperrightfalsefalse", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'false',powered:'false'}}"));
        map.put("minecraft:" + s + "westupperrightfalsetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'false',powered:'true'}}"));
        map.put("minecraft:" + s + "westupperrighttruefalse", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'true',powered:'false'}}"));
        map.put("minecraft:" + s + "westupperrighttruetrue", Class7922.method25671("{Name:'minecraft:" + s + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'true',powered:'true'}}"));
    }
    
    private static void method34107(final Map<String, Dynamic<?>> map, final int n, final String s) {
        map.put("southfalsefoot" + n, Class7922.method25671("{Name:'minecraft:" + s + "_bed',Properties:{facing:'south',occupied:'false',part:'foot'}}"));
        map.put("westfalsefoot" + n, Class7922.method25671("{Name:'minecraft:" + s + "_bed',Properties:{facing:'west',occupied:'false',part:'foot'}}"));
        map.put("northfalsefoot" + n, Class7922.method25671("{Name:'minecraft:" + s + "_bed',Properties:{facing:'north',occupied:'false',part:'foot'}}"));
        map.put("eastfalsefoot" + n, Class7922.method25671("{Name:'minecraft:" + s + "_bed',Properties:{facing:'east',occupied:'false',part:'foot'}}"));
        map.put("southfalsehead" + n, Class7922.method25671("{Name:'minecraft:" + s + "_bed',Properties:{facing:'south',occupied:'false',part:'head'}}"));
        map.put("westfalsehead" + n, Class7922.method25671("{Name:'minecraft:" + s + "_bed',Properties:{facing:'west',occupied:'false',part:'head'}}"));
        map.put("northfalsehead" + n, Class7922.method25671("{Name:'minecraft:" + s + "_bed',Properties:{facing:'north',occupied:'false',part:'head'}}"));
        map.put("eastfalsehead" + n, Class7922.method25671("{Name:'minecraft:" + s + "_bed',Properties:{facing:'east',occupied:'false',part:'head'}}"));
        map.put("southtruehead" + n, Class7922.method25671("{Name:'minecraft:" + s + "_bed',Properties:{facing:'south',occupied:'true',part:'head'}}"));
        map.put("westtruehead" + n, Class7922.method25671("{Name:'minecraft:" + s + "_bed',Properties:{facing:'west',occupied:'true',part:'head'}}"));
        map.put("northtruehead" + n, Class7922.method25671("{Name:'minecraft:" + s + "_bed',Properties:{facing:'north',occupied:'true',part:'head'}}"));
        map.put("easttruehead" + n, Class7922.method25671("{Name:'minecraft:" + s + "_bed',Properties:{facing:'east',occupied:'true',part:'head'}}"));
    }
    
    private static void method34108(final Map<String, Dynamic<?>> map, final int i, final String str) {
        for (int j = 0; j < 16; ++j) {
            map.put("" + j + "_" + i, Class7922.method25671("{Name:'minecraft:" + str + "_banner',Properties:{rotation:'" + j + "'}}"));
        }
        map.put("north_" + i, Class7922.method25671("{Name:'minecraft:" + str + "_wall_banner',Properties:{facing:'north'}}"));
        map.put("south_" + i, Class7922.method25671("{Name:'minecraft:" + str + "_wall_banner',Properties:{facing:'south'}}"));
        map.put("west_" + i, Class7922.method25671("{Name:'minecraft:" + str + "_wall_banner',Properties:{facing:'west'}}"));
        map.put("east_" + i, Class7922.method25671("{Name:'minecraft:" + str + "_wall_banner',Properties:{facing:'east'}}"));
    }
    
    public static String method34109(final Dynamic<?> dynamic) {
        return dynamic.get("Name").asString("");
    }
    
    public static String method34110(final Dynamic<?> dynamic, final String s) {
        return dynamic.get("Properties").get(s).asString("");
    }
    
    public static int method34111(final Class95<Dynamic<?>> class95, final Dynamic<?> dynamic) {
        int n = class95.method565(dynamic);
        if (n == -1) {
            n = class95.method567(dynamic);
        }
        return n;
    }
    
    private Dynamic<?> method34112(final Dynamic<?> dynamic) {
        final Optional value = dynamic.get("Level").get();
        return (Dynamic<?>)((value.isPresent() && ((Dynamic)value.get()).get("Sections").asStreamOpt().isPresent()) ? dynamic.set("Level", (Dynamic)new Class9186((Dynamic<?>)value.get()).method33587()) : dynamic);
    }
    
    public TypeRewriteRule makeRule() {
        return this.writeFixAndRead("ChunkPalettedStorageFix", this.getInputSchema().getType(Class9451.field40613), this.getOutputSchema().getType(Class9451.field40613), (Function)this::method34112);
    }
    
    public static int method34113(final boolean b, final boolean b2, final boolean b3, final boolean b4) {
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
        field39666 = LogManager.getLogger();
        field39667 = new BitSet(256);
        field39668 = new BitSet(256);
        field39669 = Class7922.method25671("{Name:'minecraft:pumpkin'}");
        field39670 = Class7922.method25671("{Name:'minecraft:podzol',Properties:{snowy:'true'}}");
        field39671 = Class7922.method25671("{Name:'minecraft:grass_block',Properties:{snowy:'true'}}");
        field39672 = Class7922.method25671("{Name:'minecraft:mycelium',Properties:{snowy:'true'}}");
        field39673 = Class7922.method25671("{Name:'minecraft:sunflower',Properties:{half:'upper'}}");
        field39674 = Class7922.method25671("{Name:'minecraft:lilac',Properties:{half:'upper'}}");
        field39675 = Class7922.method25671("{Name:'minecraft:tall_grass',Properties:{half:'upper'}}");
        field39676 = Class7922.method25671("{Name:'minecraft:large_fern',Properties:{half:'upper'}}");
        field39677 = Class7922.method25671("{Name:'minecraft:rose_bush',Properties:{half:'upper'}}");
        field39678 = Class7922.method25671("{Name:'minecraft:peony',Properties:{half:'upper'}}");
        field39679 = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap -> {
            hashMap.put("minecraft:air0", Class7922.method25671("{Name:'minecraft:flower_pot'}"));
            hashMap.put("minecraft:red_flower0", Class7922.method25671("{Name:'minecraft:potted_poppy'}"));
            hashMap.put("minecraft:red_flower1", Class7922.method25671("{Name:'minecraft:potted_blue_orchid'}"));
            hashMap.put("minecraft:red_flower2", Class7922.method25671("{Name:'minecraft:potted_allium'}"));
            hashMap.put("minecraft:red_flower3", Class7922.method25671("{Name:'minecraft:potted_azure_bluet'}"));
            hashMap.put("minecraft:red_flower4", Class7922.method25671("{Name:'minecraft:potted_red_tulip'}"));
            hashMap.put("minecraft:red_flower5", Class7922.method25671("{Name:'minecraft:potted_orange_tulip'}"));
            hashMap.put("minecraft:red_flower6", Class7922.method25671("{Name:'minecraft:potted_white_tulip'}"));
            hashMap.put("minecraft:red_flower7", Class7922.method25671("{Name:'minecraft:potted_pink_tulip'}"));
            hashMap.put("minecraft:red_flower8", Class7922.method25671("{Name:'minecraft:potted_oxeye_daisy'}"));
            hashMap.put("minecraft:yellow_flower0", Class7922.method25671("{Name:'minecraft:potted_dandelion'}"));
            hashMap.put("minecraft:sapling0", Class7922.method25671("{Name:'minecraft:potted_oak_sapling'}"));
            hashMap.put("minecraft:sapling1", Class7922.method25671("{Name:'minecraft:potted_spruce_sapling'}"));
            hashMap.put("minecraft:sapling2", Class7922.method25671("{Name:'minecraft:potted_birch_sapling'}"));
            hashMap.put("minecraft:sapling3", Class7922.method25671("{Name:'minecraft:potted_jungle_sapling'}"));
            hashMap.put("minecraft:sapling4", Class7922.method25671("{Name:'minecraft:potted_acacia_sapling'}"));
            hashMap.put("minecraft:sapling5", Class7922.method25671("{Name:'minecraft:potted_dark_oak_sapling'}"));
            hashMap.put("minecraft:red_mushroom0", Class7922.method25671("{Name:'minecraft:potted_red_mushroom'}"));
            hashMap.put("minecraft:brown_mushroom0", Class7922.method25671("{Name:'minecraft:potted_brown_mushroom'}"));
            hashMap.put("minecraft:deadbush0", Class7922.method25671("{Name:'minecraft:potted_dead_bush'}"));
            hashMap.put("minecraft:tallgrass2", Class7922.method25671("{Name:'minecraft:potted_fern'}"));
            hashMap.put("minecraft:cactus0", Class7922.method25672(2240));
            return;
        });
        field39680 = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap2 -> {
            method34105(hashMap2, 0, "skeleton", "skull");
            method34105(hashMap2, 1, "wither_skeleton", "skull");
            method34105(hashMap2, 2, "zombie", "head");
            method34105(hashMap2, 3, "player", "head");
            method34105(hashMap2, 4, "creeper", "head");
            method34105(hashMap2, 5, "dragon", "head");
            return;
        });
        field39681 = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap3 -> {
            method34106(hashMap3, "oak_door", 1024);
            method34106(hashMap3, "iron_door", 1136);
            method34106(hashMap3, "spruce_door", 3088);
            method34106(hashMap3, "birch_door", 3104);
            method34106(hashMap3, "jungle_door", 3120);
            method34106(hashMap3, "acacia_door", 3136);
            method34106(hashMap3, "dark_oak_door", 3152);
            return;
        });
        field39682 = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap4 -> {
            int i = 0;
            while (i < 26) {
                hashMap4.put("true" + i, Class7922.method25671("{Name:'minecraft:note_block',Properties:{powered:'true',note:'" + i + "'}}"));
                hashMap4.put("false" + i, Class7922.method25671("{Name:'minecraft:note_block',Properties:{powered:'false',note:'" + i + "'}}"));
                ++i;
            }
            return;
        });
        field39683 = (Int2ObjectMap)DataFixUtils.make((Object)new Int2ObjectOpenHashMap(), int2ObjectOpenHashMap -> {
            int2ObjectOpenHashMap.put(0, (Object)"white");
            int2ObjectOpenHashMap.put(1, (Object)"orange");
            int2ObjectOpenHashMap.put(2, (Object)"magenta");
            int2ObjectOpenHashMap.put(3, (Object)"light_blue");
            int2ObjectOpenHashMap.put(4, (Object)"yellow");
            int2ObjectOpenHashMap.put(5, (Object)"lime");
            int2ObjectOpenHashMap.put(6, (Object)"pink");
            int2ObjectOpenHashMap.put(7, (Object)"gray");
            int2ObjectOpenHashMap.put(8, (Object)"light_gray");
            int2ObjectOpenHashMap.put(9, (Object)"cyan");
            int2ObjectOpenHashMap.put(10, (Object)"purple");
            int2ObjectOpenHashMap.put(11, (Object)"blue");
            int2ObjectOpenHashMap.put(12, (Object)"brown");
            int2ObjectOpenHashMap.put(13, (Object)"green");
            int2ObjectOpenHashMap.put(14, (Object)"red");
            int2ObjectOpenHashMap.put(15, (Object)"black");
            return;
        });
        field39684 = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap5 -> {
            Class9251.field39683.int2ObjectEntrySet().iterator();
            final Iterator iterator;
            while (iterator.hasNext()) {
                final Int2ObjectMap$Entry int2ObjectMap$Entry = (Int2ObjectMap$Entry)iterator.next();
                if (Objects.equals(int2ObjectMap$Entry.getValue(), "red")) {
                    continue;
                }
                else {
                    method34107(hashMap5, int2ObjectMap$Entry.getIntKey(), (String)int2ObjectMap$Entry.getValue());
                }
            }
            return;
        });
        field39685 = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap6 -> {
            Class9251.field39683.int2ObjectEntrySet().iterator();
            final Iterator iterator2;
            while (iterator2.hasNext()) {
                final Int2ObjectMap$Entry int2ObjectMap$Entry2 = (Int2ObjectMap$Entry)iterator2.next();
                if (Objects.equals(int2ObjectMap$Entry2.getValue(), "white")) {
                    continue;
                }
                else {
                    method34108(hashMap6, 15 - int2ObjectMap$Entry2.getIntKey(), (String)int2ObjectMap$Entry2.getValue());
                }
            }
            return;
        });
        field39686 = Class7922.method25672(0);
        Class9251.field39668.set(2);
        Class9251.field39668.set(3);
        Class9251.field39668.set(110);
        Class9251.field39668.set(140);
        Class9251.field39668.set(144);
        Class9251.field39668.set(25);
        Class9251.field39668.set(86);
        Class9251.field39668.set(26);
        Class9251.field39668.set(176);
        Class9251.field39668.set(177);
        Class9251.field39668.set(175);
        Class9251.field39668.set(64);
        Class9251.field39668.set(71);
        Class9251.field39668.set(193);
        Class9251.field39668.set(194);
        Class9251.field39668.set(195);
        Class9251.field39668.set(196);
        Class9251.field39668.set(197);
        Class9251.field39667.set(54);
        Class9251.field39667.set(146);
        Class9251.field39667.set(25);
        Class9251.field39667.set(26);
        Class9251.field39667.set(51);
        Class9251.field39667.set(53);
        Class9251.field39667.set(67);
        Class9251.field39667.set(108);
        Class9251.field39667.set(109);
        Class9251.field39667.set(114);
        Class9251.field39667.set(128);
        Class9251.field39667.set(134);
        Class9251.field39667.set(135);
        Class9251.field39667.set(136);
        Class9251.field39667.set(156);
        Class9251.field39667.set(163);
        Class9251.field39667.set(164);
        Class9251.field39667.set(180);
        Class9251.field39667.set(203);
        Class9251.field39667.set(55);
        Class9251.field39667.set(85);
        Class9251.field39667.set(113);
        Class9251.field39667.set(188);
        Class9251.field39667.set(189);
        Class9251.field39667.set(190);
        Class9251.field39667.set(191);
        Class9251.field39667.set(192);
        Class9251.field39667.set(93);
        Class9251.field39667.set(94);
        Class9251.field39667.set(101);
        Class9251.field39667.set(102);
        Class9251.field39667.set(160);
        Class9251.field39667.set(106);
        Class9251.field39667.set(107);
        Class9251.field39667.set(183);
        Class9251.field39667.set(184);
        Class9251.field39667.set(185);
        Class9251.field39667.set(186);
        Class9251.field39667.set(187);
        Class9251.field39667.set(132);
        Class9251.field39667.set(139);
        Class9251.field39667.set(199);
    }
}
