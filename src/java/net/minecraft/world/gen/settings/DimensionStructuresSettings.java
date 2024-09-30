package net.minecraft.world.gen.settings;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import mapped.Structure;
import net.minecraft.util.registry.Registry;

import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class DimensionStructuresSettings {
   public static final Codec<DimensionStructuresSettings> field45673 = RecordCodecBuilder.create(
      var0 -> var0.group(
               StructureSpreadSettings.field42537.optionalFieldOf("stronghold").forGetter(var0x -> Optional.<StructureSpreadSettings>ofNullable(var0x.field45677)),
               Codec.simpleMap(Registry.STRUCTURE_FEATURE, StructureSeparationSettings.field36361, Registry.STRUCTURE_FEATURE).fieldOf("structures").forGetter(var0x -> var0x.field45676)
            )
            .apply(var0, DimensionStructuresSettings::new)
   );
   public static final ImmutableMap<Structure<?>, StructureSeparationSettings> field45674 = ImmutableMap.<Structure<?>, StructureSeparationSettings>builder()
      .put(Structure.field18073, new StructureSeparationSettings(32, 8, 10387312))
      .put(Structure.DESERT_PYRAMID, new StructureSeparationSettings(32, 8, 14357617))
      .put(Structure.IGLOO, new StructureSeparationSettings(32, 8, 14357618))
      .put(Structure.JUNGLE_PYRAMID, new StructureSeparationSettings(32, 8, 14357619))
      .put(Structure.SWAMP_HUT, new StructureSeparationSettings(32, 8, 14357620))
      .put(Structure.PILLAGER_OUTPOST, new StructureSeparationSettings(32, 8, 165745296))
      .put(Structure.STRONGHOLD, new StructureSeparationSettings(1, 0, 0))
      .put(Structure.MONUMENT, new StructureSeparationSettings(32, 5, 10387313))
      .put(Structure.field18071, new StructureSeparationSettings(20, 11, 10387313))
      .put(Structure.MANSION, new StructureSeparationSettings(80, 20, 10387319))
      .put(Structure.field18072, new StructureSeparationSettings(1, 0, 0))
      .put(Structure.MINESHAFT, new StructureSeparationSettings(1, 0, 0))
      .put(Structure.RUINED_PORTAL, new StructureSeparationSettings(40, 15, 34222645))
      .put(Structure.SHIPWRECK, new StructureSeparationSettings(24, 4, 165745295))
      .put(Structure.field18069, new StructureSeparationSettings(20, 8, 14357621))
      .put(Structure.field18075, new StructureSeparationSettings(27, 4, 30084232))
      .put(Structure.field18070, new StructureSeparationSettings(27, 4, 30084232))
      .put(Structure.field18074, new StructureSeparationSettings(2, 1, 14357921))
      .build();
   public static final StructureSpreadSettings field45675;
   private final Map<Structure<?>, StructureSeparationSettings> field45676;
   private final StructureSpreadSettings field45677;

   public DimensionStructuresSettings(Optional<StructureSpreadSettings> var1, Map<Structure<?>, StructureSeparationSettings> var2) {
      this.field45677 = var1.orElse((StructureSpreadSettings)null);
      this.field45676 = var2;
   }

   public DimensionStructuresSettings(boolean var1) {
      this.field45676 = Maps.newHashMap(field45674);
      this.field45677 = !var1 ? null : field45675;
   }

   public Map<Structure<?>, StructureSeparationSettings> method38380() {
      return this.field45676;
   }

   @Nullable
   public StructureSeparationSettings func_236197_a_(Structure<?> var1) {
      return this.field45676.get(var1);
   }

   @Nullable
   public StructureSpreadSettings func_236199_b_() {
      return this.field45677;
   }

   static {
      for (Structure var7 : Registry.STRUCTURE_FEATURE) {
         if (!field45674.containsKey(var7)) {
            throw new IllegalStateException("Structure feature without default settings: " + Registry.STRUCTURE_FEATURE.getKey(var7));
         }
      }

      field45675 = new StructureSpreadSettings(32, 3, 128);
   }
}
