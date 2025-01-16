// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import java.util.Locale;
import com.google.common.collect.HashBiMap;
import java.util.Collections;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;
import java.util.List;
import com.google.common.collect.BiMap;
import net.minecraft.util.math.BlockPos;

public abstract class Class4535<FC extends Class5113>
{
    public static final Class4574<Class5122> field19958;
    public static final Class4574<Class5132> field19959;
    public static final Class4574<Class5122> field19960;
    public static final Class4574<Class5122> field19961;
    public static final Class4574<Class5122> field19962;
    public static final Class4574<Class5122> field19963;
    public static final Class4574<Class5125> field19964;
    public static final Class4584 field19965;
    public static final Class4574<Class5122> field19966;
    public static final Class4574<Class5122> field19967;
    public static final Class4574<Class5130> field19968;
    public static final Class4574<Class5122> field19969;
    public static final Class4574<Class5122> field19970;
    public static final Class4574<Class5136> field19971;
    public static final Class4574<Class5115> field19972;
    public static final Class4535<Class5122> field19973;
    public static final Class4535<Class5129> field19974;
    public static final Class4535<Class5129> field19975;
    public static final Class4535<Class5129> field19976;
    public static final Class4535<Class5127> field19977;
    public static final Class4535<Class5128> field19978;
    public static final Class4535<Class5128> field19979;
    public static final Class4535<Class5128> field19980;
    public static final Class4572<Class5144> field19981;
    public static final Class4535<Class5144> field19982;
    public static final Class4535<Class5112> field19983;
    public static final Class4535<Class5131> field19984;
    public static final Class4535<Class5122> field19985;
    public static final Class4535<Class5126> field19986;
    public static final Class4535<Class5122> field19987;
    public static final Class4535<Class5122> field19988;
    public static final Class4535<Class5122> field19989;
    public static final Class4535<Class5137> field19990;
    public static final Class4535<Class5137> field19991;
    public static final Class4535<Class5122> field19992;
    public static final Class4535<Class5122> field19993;
    public static final Class4535<Class5122> field19994;
    public static final Class4535<Class5122> field19995;
    public static final Class4535<Class5122> field19996;
    public static final Class4535<Class5122> field19997;
    public static final Class4535<Class5141> field19998;
    public static final Class4535<Class5139> field19999;
    public static final Class4535<Class5138> field20000;
    public static final Class4535<Class5120> field20001;
    public static final Class4535<Class5141> field20002;
    public static final Class4535<Class5133> field20003;
    public static final Class4535<Class5143> field20004;
    public static final Class4535<Class5122> field20005;
    public static final Class4535<Class5116> field20006;
    public static final Class4535<Class5124> field20007;
    public static final Class4535<Class5122> field20008;
    public static final Class4535<Class5122> field20009;
    public static final Class4535<Class5122> field20010;
    public static final Class4535<Class5122> field20011;
    public static final Class4535<Class5123> field20012;
    public static final Class4535<Class5135> field20013;
    public static final Class4535<Class5117> field20014;
    public static final Class4535<Class5140> field20015;
    public static final Class4549 field20016;
    public static final Class4535<Class5121> field20017;
    public static final Class4535<Class5145> field20018;
    public static final Class4535<Class5134> field20019;
    public static final Class4535<Class5142> field20020;
    public static final Class4535<Class5114> field20021;
    public static final Class4535<Class5114> field20022;
    public static final BiMap<String, Class4574<?>> field20023;
    public static final List<Class4574<?>> field20024;
    private final Function<Dynamic<?>, ? extends FC> field20025;
    
    private static <C extends Class5113, F extends Class4535<C>> F method13526(final String s, final F n) {
        return Registry.register(Registry.field215, s, n);
    }
    
    public Class4535(final Function<Dynamic<?>, ? extends FC> field20025) {
        this.field20025 = field20025;
    }
    
    public Class8530<FC, ?> method13527(final FC fc) {
        return new Class8530<FC, Object>(this, fc);
    }
    
    public FC method13528(final Dynamic<?> dynamic) {
        return (FC)this.field20025.apply(dynamic);
    }
    
    public void method13529(final Class1876 class1876, final BlockPos class1877, final BlockState class1878) {
        class1876.setBlockState(class1877, class1878, 3);
    }
    
    public abstract boolean method13525(final Class1851 p0, final Class6346<? extends Class7065> p1, final Random p2, final BlockPos p3, final FC p4);
    
    public List<Class6828> method13530() {
        return Collections.emptyList();
    }
    
    public List<Class6828> method13531() {
        return Collections.emptyList();
    }
    
    public static boolean method13532(final Block class3833) {
        if (class3833 != Blocks.STONE) {
            if (class3833 != Blocks.GRANITE) {
                if (class3833 != Blocks.DIORITE) {
                    if (class3833 != Blocks.ANDESITE) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public static boolean method13533(final Block class3833) {
        if (class3833 != Blocks.DIRT) {
            if (class3833 != Blocks.GRASS_BLOCK) {
                if (class3833 != Blocks.PODZOL) {
                    if (class3833 != Blocks.COARSE_DIRT) {
                        if (class3833 != Blocks.field29392) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    
    static {
        field19958 = method13526("pillager_outpost", new Class4586(Class5122::method16027));
        field19959 = method13526("mineshaft", new Class4590(Class5132::method16041));
        field19960 = method13526("woodland_mansion", new Class4577(Class5122::method16027));
        field19961 = method13526("jungle_temple", new Class4589(Class5122::method16027));
        field19962 = method13526("desert_pyramid", new Class4585(Class5122::method16027));
        field19963 = method13526("igloo", new Class4588(Class5122::method16027));
        field19964 = method13526("shipwreck", new Class4583(Class5125::method16030));
        field19965 = method13526("swamp_hut", new Class4584(Class5122::method16027));
        field19966 = method13526("stronghold", new Class4575(Class5122::method16027));
        field19967 = method13526("ocean_monument", new Class4579(Class5122::method16027));
        field19968 = method13526("ocean_ruin", new Class4587(Class5130::method16038));
        field19969 = method13526("nether_bridge", new Class4581(Class5122::method16027));
        field19970 = method13526("end_city", new Class4578(Class5122::method16027));
        field19971 = method13526("buried_treasure", new Class4576(Class5136::method16049));
        field19972 = method13526("village", new Class4580(Class5115::method16013));
        field19973 = method13526("no_op", new Class4563(Class5122::method16027));
        field19974 = method13526("normal_tree", new Class4600(Class5129::method16037));
        field19975 = method13526("acacia_tree", new Class4599(Class5129::method16037));
        field19976 = method13526("fancy_tree", new Class4601(Class5129::method16037));
        field19977 = method13526("jungle_ground_bush", new Class4596(Class5127::method16033));
        field19978 = method13526("dark_oak_tree", new Class4597(Class5128::method16036));
        field19979 = method13526("mega_jungle_tree", new Class4595(Class5128::method16036));
        field19980 = method13526("mega_spruce_tree", new Class4594(Class5128::method16036));
        field19981 = method13526("flower", new Class4573(Class5144::method16063));
        field19982 = method13526("random_patch", new Class4565(Class5144::method16063));
        field19983 = method13526("block_pile", new Class4569(Class5112::method16011));
        field19984 = method13526("spring_feature", new Class4605(Class5131::method16039));
        field19985 = method13526("chorus_plant", new Class4564(Class5122::method16027));
        field19986 = method13526("emerald_ore", new Class4547(Class5126::method16031));
        field19987 = method13526("void_start_platform", new Class4552(Class5122::method16027));
        field19988 = method13526("desert_well", new Class4571(Class5122::method16027));
        field19989 = method13526("fossil", new Class4570(Class5122::method16027));
        field19990 = method13526("huge_red_mushroom", new Class4557(Class5137::method16050));
        field19991 = method13526("huge_brown_mushroom", new Class4558(Class5137::method16050));
        field19992 = method13526("ice_spike", new Class4542(Class5122::method16027));
        field19993 = method13526("glowstone_blob", new Class4607(Class5122::method16027));
        field19994 = method13526("freeze_top_layer", new Class4555(Class5122::method16027));
        field19995 = method13526("vines", new Class4554(Class5122::method16027));
        field19996 = method13526("monster_room", new Class4541(Class5122::method16027));
        field19997 = method13526("blue_ice", new Class4566(Class5122::method16027));
        field19998 = method13526("iceberg", new Class4545(Class5141::method16055));
        field19999 = method13526("forest_rock", new Class4534(Class5139::method16053));
        field20000 = method13526("disk", new Class4546(Class5138::method16051));
        field20001 = method13526("ice_patch", new Class4567(Class5120::method16024));
        field20002 = method13526("lake", new Class4562(Class5141::method16055));
        field20003 = method13526("ore", new Class4608(Class5133::method16042));
        field20004 = method13526("end_spike", new Class4550(Class5143::method16057));
        field20005 = method13526("end_island", new Class4606(Class5122::method16027));
        field20006 = method13526("end_gateway", new Class4540(Class5116::method16018));
        field20007 = method13526("seagrass", new Class4559(Class5124::method16029));
        field20008 = method13526("kelp", new Class4544(Class5122::method16027));
        field20009 = method13526("coral_tree", new Class4539(Class5122::method16027));
        field20010 = method13526("coral_mushroom", new Class4538(Class5122::method16027));
        field20011 = method13526("coral_claw", new Class4537(Class5122::method16027));
        field20012 = method13526("sea_pickle", new Class4553(Class5123::method16028));
        field20013 = method13526("simple_block", new Class4602(Class5135::method16045));
        field20014 = method13526("bamboo", new Class4560(Class5117::method16023));
        field20015 = method13526("fill_layer", new Class4548(Class5140::method16054));
        field20016 = method13526("bonus_chest", new Class4549(Class5122::method16027));
        field20017 = method13526("random_random_selector", new Class4591(Class5121::method16025));
        field20018 = method13526("random_selector", new Class4543(Class5145::method16066));
        field20019 = method13526("simple_random_selector", new Class4568(Class5134::method16043));
        field20020 = method13526("random_boolean_selector", new Class4561(Class5142::method16056));
        field20021 = method13526("decorated", new Class4603(Class5114::method16012));
        field20022 = method13526("decorated_flower", new Class4604(Class5114::method16012));
        field20023 = Util.method27851((BiMap)HashBiMap.create(), hashBiMap -> {
            hashBiMap.put((Object)"Pillager_Outpost".toLowerCase(Locale.ROOT), (Object)Class4535.field19958);
            hashBiMap.put((Object)"Mineshaft".toLowerCase(Locale.ROOT), (Object)Class4535.field19959);
            hashBiMap.put((Object)"Mansion".toLowerCase(Locale.ROOT), (Object)Class4535.field19960);
            hashBiMap.put((Object)"Jungle_Pyramid".toLowerCase(Locale.ROOT), (Object)Class4535.field19961);
            hashBiMap.put((Object)"Desert_Pyramid".toLowerCase(Locale.ROOT), (Object)Class4535.field19962);
            hashBiMap.put((Object)"Igloo".toLowerCase(Locale.ROOT), (Object)Class4535.field19963);
            hashBiMap.put((Object)"Shipwreck".toLowerCase(Locale.ROOT), (Object)Class4535.field19964);
            hashBiMap.put((Object)"Swamp_Hut".toLowerCase(Locale.ROOT), (Object)Class4535.field19965);
            hashBiMap.put((Object)"Stronghold".toLowerCase(Locale.ROOT), (Object)Class4535.field19966);
            hashBiMap.put((Object)"Monument".toLowerCase(Locale.ROOT), (Object)Class4535.field19967);
            hashBiMap.put((Object)"Ocean_Ruin".toLowerCase(Locale.ROOT), (Object)Class4535.field19968);
            hashBiMap.put((Object)"Fortress".toLowerCase(Locale.ROOT), (Object)Class4535.field19969);
            hashBiMap.put((Object)"EndCity".toLowerCase(Locale.ROOT), (Object)Class4535.field19970);
            hashBiMap.put((Object)"Buried_Treasure".toLowerCase(Locale.ROOT), (Object)Class4535.field19971);
            hashBiMap.put((Object)"Village".toLowerCase(Locale.ROOT), (Object)Class4535.field19972);
            return;
        });
        field20024 = (List)ImmutableList.of((Object)Class4535.field19958, (Object)Class4535.field19972);
    }
}
