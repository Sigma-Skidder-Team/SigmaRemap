package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;

public class Class9109 {
   public static final ConfiguredSurfaceBuilder<Class8278> field41841 = method33963("badlands", SurfaceBuilder.field29529.method20657(SurfaceBuilder.field29515));
   public static final ConfiguredSurfaceBuilder<Class8278> field41842 = method33963("basalt_deltas", SurfaceBuilder.field29536.method20657(SurfaceBuilder.field29522));
   public static final ConfiguredSurfaceBuilder<Class8278> field41843 = method33963("crimson_forest", SurfaceBuilder.field29534.method20657(SurfaceBuilder.field29520));
   public static final ConfiguredSurfaceBuilder<Class8278> field41844 = method33963("desert", SurfaceBuilder.field29523.method20657(SurfaceBuilder.field29512));
   public static final ConfiguredSurfaceBuilder<Class8278> field41845 = method33963("end", SurfaceBuilder.field29523.method20657(SurfaceBuilder.field29519));
   public static final ConfiguredSurfaceBuilder<Class8278> field41846 = method33963("eroded_badlands", SurfaceBuilder.field29531.method20657(SurfaceBuilder.field29515));
   public static final ConfiguredSurfaceBuilder<Class8278> field41847 = method33963("frozen_ocean", SurfaceBuilder.field29532.method20657(SurfaceBuilder.field29509));
   public static final ConfiguredSurfaceBuilder<Class8278> field41848 = method33963("full_sand", SurfaceBuilder.field29523.method20657(SurfaceBuilder.field29514));
   public static final ConfiguredSurfaceBuilder<Class8278> field41849 = method33963("giant_tree_taiga", SurfaceBuilder.field29527.method20657(SurfaceBuilder.field29509));
   public static final ConfiguredSurfaceBuilder<Class8278> field41850 = method33963("grass", SurfaceBuilder.field29523.method20657(SurfaceBuilder.field29509));
   public static final ConfiguredSurfaceBuilder<Class8278> field41851 = method33963("gravelly_mountain", SurfaceBuilder.field29526.method20657(SurfaceBuilder.field29509));
   public static final ConfiguredSurfaceBuilder<Class8278> field41852 = method33963(
      "ice_spikes",
      SurfaceBuilder.field29523
         .method20657(new Class8278(Blocks.SNOW_BLOCK.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.GRAVEL.getDefaultState()))
   );
   public static final ConfiguredSurfaceBuilder<Class8278> field41853 = method33963("mountain", SurfaceBuilder.field29524.method20657(SurfaceBuilder.field29509));
   public static final ConfiguredSurfaceBuilder<Class8278> field41854 = method33963("mycelium", SurfaceBuilder.field29523.method20657(SurfaceBuilder.field29516));
   public static final ConfiguredSurfaceBuilder<Class8278> field41855 = method33963("nether", SurfaceBuilder.field29533.method20657(SurfaceBuilder.field29517));
   public static final ConfiguredSurfaceBuilder<Class8278> field41856 = method33963("nope", SurfaceBuilder.field29537.method20657(SurfaceBuilder.field29510));
   public static final ConfiguredSurfaceBuilder<Class8278> field41857 = method33963("ocean_sand", SurfaceBuilder.field29523.method20657(SurfaceBuilder.field29513));
   public static final ConfiguredSurfaceBuilder<Class8278> field41858 = method33963("shattered_savanna", SurfaceBuilder.field29525.method20657(SurfaceBuilder.field29509));
   public static final ConfiguredSurfaceBuilder<Class8278> field41859 = method33963("soul_sand_valley", SurfaceBuilder.field29535.method20657(SurfaceBuilder.field29518));
   public static final ConfiguredSurfaceBuilder<Class8278> field41860 = method33963("stone", SurfaceBuilder.field29523.method20657(SurfaceBuilder.field29510));
   public static final ConfiguredSurfaceBuilder<Class8278> field41861 = method33963("swamp", SurfaceBuilder.field29528.method20657(SurfaceBuilder.field29509));
   public static final ConfiguredSurfaceBuilder<Class8278> field41862 = method33963("warped_forest", SurfaceBuilder.field29534.method20657(SurfaceBuilder.field29521));
   public static final ConfiguredSurfaceBuilder<Class8278> field41863 = method33963("wooded_badlands", SurfaceBuilder.field29530.method20657(SurfaceBuilder.field29515));

   private static <SC extends ISurfaceBuilderConfig> ConfiguredSurfaceBuilder<SC> method33963(String var0, ConfiguredSurfaceBuilder<SC> var1) {
      return WorldGenRegistries.<ConfiguredSurfaceBuilder<SC>>method20496(WorldGenRegistries.field29424, var0, var1);
   }
}
