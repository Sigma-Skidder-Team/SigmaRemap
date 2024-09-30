package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.gen.settings.StructureSeparationSettings;

import java.util.List;
import java.util.function.Supplier;

public class StructureFeature<FC extends Class4698, F extends Structure<FC>> {
   public static final Codec<StructureFeature<?, ?>> field43171 = Registry.STRUCTURE_FEATURE.dispatch(var0 -> var0.field_236268_b_, Structure::method11367);
   public static final Codec<Supplier<StructureFeature<?, ?>>> field43172 = RegistryKeyCodec.create(Registry.field16103, field43171);
   public static final Codec<List<Supplier<StructureFeature<?, ?>>>> field43173 = RegistryKeyCodec.<StructureFeature<?, ?>>method33672(Registry.field16103, field43171);
   public final F field_236268_b_;
   public final FC field43175;

   public StructureFeature(F var1, FC var2) {
      this.field_236268_b_ = (F)var1;
      this.field43175 = (FC)var2;
   }

   public StructureStart<?> method35098(
           DynamicRegistries var1, ChunkGenerator var2, BiomeProvider var3, TemplateManager var4, long var5, ChunkPos var7, Biome var8, int var9, StructureSeparationSettings var10
   ) {
      return this.field_236268_b_.method11372(var1, var2, var3, var4, var5, var7, var8, var9, new SharedSeedRandom(), var10, this.field43175);
   }
}
