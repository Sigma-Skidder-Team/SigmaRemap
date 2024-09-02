package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.Random;

public abstract class Class2898<FC extends Class4698> {
   public static final Class2898<Class4712> field17936 = method11214("no_op", new Class2928(Class4712.field22349));
   public static final Class2898<Class4733> field17937 = method11214("tree", new Class2903(Class4733.field22410));
   public static final Class2921<Class4703> field17938 = method11214("flower", new Class2922(Class4703.field22305));
   public static final Class2921<Class4703> field17939 = method11214("no_bonemeal_flower", new Class2922(Class4703.field22305));
   public static final Class2898<Class4703> field17940 = method11214("random_patch", new Class2920(Class4703.field22305));
   public static final Class2898<Class4710> field17941 = method11214("block_pile", new Class2923(Class4710.field22342));
   public static final Class2898<Class4697> field17942 = method11214("spring_feature", new Class2911(Class4697.field22284));
   public static final Class2898<Class4712> field17943 = method11214("chorus_plant", new Class2936(Class4712.field22349));
   public static final Class2898<Class4731> field17944 = method11214("emerald_ore", new Class2904(Class4731.field22404));
   public static final Class2898<Class4712> field17945 = method11214("void_start_platform", new Class2912(Class4712.field22349));
   public static final Class2898<Class4712> field17946 = method11214("desert_well", new Class2924(Class4712.field22349));
   public static final Class2898<Class4712> field17947 = method11214("fossil", new Class2947(Class4712.field22349));
   public static final Class2898<Class4727> field17948 = method11214("huge_red_mushroom", new Class2931(Class4727.field22394));
   public static final Class2898<Class4727> field17949 = method11214("huge_brown_mushroom", new Class2932(Class4727.field22394));
   public static final Class2898<Class4712> field17950 = method11214("ice_spike", new Class2905(Class4712.field22349));
   public static final Class2898<Class4712> field17951 = method11214("glowstone_blob", new Class2953(Class4712.field22349));
   public static final Class2898<Class4712> field17952 = method11214("freeze_top_layer", new Class2938(Class4712.field22349));
   public static final Class2898<Class4712> field17953 = method11214("vines", new Class2906(Class4712.field22349));
   public static final Class2898<Class4712> field17954 = method11214("monster_room", new Class2929(Class4712.field22349));
   public static final Class2898<Class4712> field17955 = method11214("blue_ice", new Class2919(Class4712.field22349));
   public static final Class2898<Class4705> field17956 = method11214("iceberg", new Class2950(Class4705.field22321));
   public static final Class2898<Class4705> field17957 = method11214("forest_rock", new Class2940(Class4705.field22321));
   public static final Class2898<Class4699> field17958 = method11214("disk", new Class2901(Class4699.field22291));
   public static final Class2898<Class4699> field17959 = method11214("ice_patch", new Class2900(Class4699.field22291));
   public static final Class2898<Class4705> field17960 = method11214("lake", new Class2943(Class4705.field22321));
   public static final Class2898<Class4734> field17961 = method11214("ore", new Class2933(Class4734.field22421));
   public static final Class2898<Class4707> field17962 = method11214("end_spike", new Class2944(Class4707.field22325));
   public static final Class2898<Class4712> field17963 = method11214("end_island", new Class2913(Class4712.field22349));
   public static final Class2898<Class4701> field17964 = method11214("end_gateway", new Class2902(Class4701.field22299));
   public static final Class2945 field17965 = method11214("seagrass", new Class2945(Class4728.field22398));
   public static final Class2898<Class4712> field17966 = method11214("kelp", new Class2926(Class4712.field22349));
   public static final Class2898<Class4712> field17967 = method11214("coral_tree", new Class2916(Class4712.field22349));
   public static final Class2898<Class4712> field17968 = method11214("coral_mushroom", new Class2915(Class4712.field22349));
   public static final Class2898<Class4712> field17969 = method11214("coral_claw", new Class2917(Class4712.field22349));
   public static final Class2898<Class4715> field17970 = method11214("sea_pickle", new Class2918(Class4715.field22359));
   public static final Class2898<Class4714> field17971 = method11214("simple_block", new Class2925(Class4714.field22354));
   public static final Class2898<Class4728> field17972 = method11214("bamboo", new Class2951(Class4728.field22398));
   public static final Class2898<Class4709> field17973 = method11214("huge_fungus", new Class2927(Class4709.field22332));
   public static final Class2898<Class4710> field17974 = method11214("nether_forest_vegetation", new Class2946(Class4710.field22342));
   public static final Class2898<Class4712> field17975 = method11214("weeping_vines", new Class2949(Class4712.field22349));
   public static final Class2898<Class4712> field17976 = method11214("twisting_vines", new Class2937(Class4712.field22349));
   public static final Class2898<Class4708> field17977 = method11214("basalt_columns", new Class2935(Class4708.field22329));
   public static final Class2898<Class4738> field17978 = method11214("delta_feature", new Class2908(Class4738.field22433));
   public static final Class2898<Class4704> field17979 = method11214("netherrack_replace_blobs", new Class2941(Class4704.field22317));
   public static final Class2898<Class4732> field17980 = method11214("fill_layer", new Class2910(Class4732.field22407));
   public static final Class2952 field17981 = method11214("bonus_chest", new Class2952(Class4712.field22349));
   public static final Class2898<Class4712> field17982 = method11214("basalt_pillar", new Class2907(Class4712.field22349));
   public static final Class2898<Class4734> field17983 = method11214("no_surface_ore", new Class2939(Class4734.field22421));
   public static final Class2898<Class4736> field17984 = method11214("random_selector", new Class2948(Class4736.field22428));
   public static final Class2898<Class4706> field17985 = method11214("simple_random_selector", new Class2897(Class4706.field22323));
   public static final Class2898<Class4702> field17986 = method11214("random_boolean_selector", new Class2942(Class4702.field22302));
   public static final Class2898<Class4713> field17987 = method11214("decorated", new Class2934(Class4713.field22351));
   private final Codec<Class7909<FC, Class2898<FC>>> field17988;

   private static <C extends Class4698, F extends Class2898<C>> F method11214(String var0, F var1) {
      return Registry.<F>method9194(Registry.field16112, var0, (F)var1);
   }

   public Class2898(Codec<FC> var1) {
      this.field17988 = var1.fieldOf("config").xmap(var1x -> new Class7909<>(this, var1x), var0 -> var0.field33887).codec();
   }

   public Codec<Class7909<FC, Class2898<FC>>> method11215() {
      return this.field17988;
   }

   public Class7909<FC, ?> method11216(FC var1) {
      return new Class7909<FC, Class2898<FC>>(this, (FC)var1);
   }

   public void method11217(Class1681 var1, BlockPos var2, BlockState var3) {
      var1.setBlockState(var2, var3, 3);
   }

   public abstract boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, FC var5);

   public static boolean method11218(Block var0) {
      return var0 == Blocks.STONE || var0 == Blocks.GRANITE || var0 == Blocks.DIORITE || var0 == Blocks.ANDESITE;
   }

   public static boolean method11219(Block var0) {
      return var0 == Blocks.field36396
         || var0 == Blocks.field36395
         || var0 == Blocks.field36398
         || var0 == Blocks.field36397
         || var0 == Blocks.MYCELIUM;
   }

   public static boolean method11220(Class1680 var0, BlockPos var1) {
      return var0.method6815(var1, var0x -> method11219(var0x.getBlock()));
   }

   public static boolean method11221(Class1680 var0, BlockPos var1) {
      return var0.method6815(var1, Class7377::isAir);
   }
}
