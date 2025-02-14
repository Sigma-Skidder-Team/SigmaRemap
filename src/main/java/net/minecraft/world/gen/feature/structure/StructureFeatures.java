package net.minecraft.world.gen.feature.structure;

import mapped.*;
import net.minecraft.util.registry.WorldGenRegistries;

public class StructureFeatures {
   public static final StructureFeature<Class4700, ? extends Structure<Class4700>> PILLAGER_OUTPOST = register(
      "pillager_outpost", Structure.PILLAGER_OUTPOST.method11368(new Class4700(() -> Class8685.field39213, 7))
   );
   public static final StructureFeature<MineshaftConfig, ? extends Structure<MineshaftConfig>> MINESHAFT = register(
      "mineshaft", Structure.MINESHAFT.method11368(new MineshaftConfig(0.004F, Class102.field307))
   );
   public static final StructureFeature<MineshaftConfig, ? extends Structure<MineshaftConfig>> MINESHAFT_MESA = register(
      "mineshaft_mesa", Structure.MINESHAFT.method11368(new MineshaftConfig(0.004F, Class102.field308))
   );
   public static final StructureFeature<Class4712, ? extends Structure<Class4712>> MANSION = register(
      "mansion", Structure.MANSION.method11368(Class4712.field22350)
   );
   public static final StructureFeature<Class4712, ? extends Structure<Class4712>> JUNGLE_PYRAMID = register(
      "jungle_pyramid", Structure.JUNGLE_PYRAMID.method11368(Class4712.field22350)
   );
   public static final StructureFeature<Class4712, ? extends Structure<Class4712>> DESERT_PYRAMID = register(
      "desert_pyramid", Structure.DESERT_PYRAMID.method11368(Class4712.field22350)
   );
   public static final StructureFeature<Class4712, ? extends Structure<Class4712>> IGLOO = register(
      "igloo", Structure.IGLOO.method11368(Class4712.field22350)
   );
   public static final StructureFeature<ShipwreckConfig, ? extends Structure<ShipwreckConfig>> SHIPWRECK = register(
      "shipwreck", Structure.SHIPWRECK.method11368(new ShipwreckConfig(false))
   );
   public static final StructureFeature<ShipwreckConfig, ? extends Structure<ShipwreckConfig>> SHIPWRECK_BEACHED = register(
      "shipwreck_beached", Structure.SHIPWRECK.method11368(new ShipwreckConfig(true))
   );
   public static final StructureFeature<Class4712, ? extends Structure<Class4712>> SWAMP_HUT = register(
      "swamp_hut", Structure.SWAMP_HUT.method11368(Class4712.field22350)
   );
   public static final StructureFeature<Class4712, ? extends Structure<Class4712>> STRONGHOLD = register(
      "stronghold", Structure.STRONGHOLD.method11368(Class4712.field22350)
   );
   public static final StructureFeature<Class4712, ? extends Structure<Class4712>> MONUMENT = register(
      "monument", Structure.MONUMENT.method11368(Class4712.field22350)
   );
   public static final StructureFeature<Class4711, ? extends Structure<Class4711>> OCEAN_RUIN_COLD = register(
      "ocean_ruin_cold", Structure.field18069.method11368(new Class4711(Class110.COLD, 0.3F, 0.9F))
   );
   public static final StructureFeature<Class4711, ? extends Structure<Class4711>> OCEAN_RUIN_WARM = register(
      "ocean_ruin_warm", Structure.field18069.method11368(new Class4711(Class110.WARM, 0.3F, 0.9F))
   );
   public static final StructureFeature<Class4712, ? extends Structure<Class4712>> FORTRESS = register(
      "fortress", Structure.field18070.method11368(Class4712.field22350)
   );
   public static final StructureFeature<Class4712, ? extends Structure<Class4712>> NETHER_FOSSIL = register(
      "nether_fossil", Structure.field18074.method11368(Class4712.field22350)
   );
   public static final StructureFeature<Class4712, ? extends Structure<Class4712>> END_CITY = register(
      "end_city", Structure.field18071.method11368(Class4712.field22350)
   );
   public static final StructureFeature<Class4728, ? extends Structure<Class4728>> BURIED_TREASURE = register(
      "buried_treasure", Structure.field18072.method11368(new Class4728(0.01F))
   );
   public static final StructureFeature<Class4700, ? extends Structure<Class4700>> BASTION_REMNANT = register(
      "bastion_remnant", Structure.field18075.method11368(new Class4700(() -> Class8382.field35954, 6))
   );
   public static final StructureFeature<Class4700, ? extends Structure<Class4700>> VILLAGE_PLAINS = register(
      "village_plains", Structure.field18073.method11368(new Class4700(() -> Class8327.field35787, 6))
   );
   public static final StructureFeature<Class4700, ? extends Structure<Class4700>> VILLAGE_DESERT = register(
      "village_desert", Structure.field18073.method11368(new Class4700(() -> Class8673.field39097, 6))
   );
   public static final StructureFeature<Class4700, ? extends Structure<Class4700>> VILLAGE_SAVANNA = register(
      "village_savanna", Structure.field18073.method11368(new Class4700(() -> Class9835.field45935, 6))
   );
   public static final StructureFeature<Class4700, ? extends Structure<Class4700>> VILLAGE_SNOWY = register(
      "village_snowy", Structure.field18073.method11368(new Class4700(() -> Class7028.field30340, 6))
   );
   public static final StructureFeature<Class4700, ? extends Structure<Class4700>> VILLAGE_TAIGA = register(
      "village_taiga", Structure.field18073.method11368(new Class4700(() -> Class8481.field36359, 6))
   );
   public static final StructureFeature<Class4726, ? extends Structure<Class4726>> RUINED_PORTAL = register(
      "ruined_portal", Structure.RUINED_PORTAL.method11368(new Class4726(Class107.STANDARD))
   );
   public static final StructureFeature<Class4726, ? extends Structure<Class4726>> RUINED_PORTAL_DESERT = register(
      "ruined_portal_desert", Structure.RUINED_PORTAL.method11368(new Class4726(Class107.DESERT))
   );
   public static final StructureFeature<Class4726, ? extends Structure<Class4726>> RUINED_PORTAL_JUNGLE = register(
      "ruined_portal_jungle", Structure.RUINED_PORTAL.method11368(new Class4726(Class107.JUNGLE))
   );
   public static final StructureFeature<Class4726, ? extends Structure<Class4726>> RUINED_PORTAL_SWAMP = register(
      "ruined_portal_swamp", Structure.RUINED_PORTAL.method11368(new Class4726(Class107.SWAMP))
   );
   public static final StructureFeature<Class4726, ? extends Structure<Class4726>> RUINED_PORTAL_MOUNTAIN = register(
      "ruined_portal_mountain", Structure.RUINED_PORTAL.method11368(new Class4726(Class107.MOUNTAIN))
   );
   public static final StructureFeature<Class4726, ? extends Structure<Class4726>> RUINED_PORTAL_OCEAN = register(
      "ruined_portal_ocean", Structure.RUINED_PORTAL.method11368(new Class4726(Class107.OCEAN))
   );
   public static final StructureFeature<Class4726, ? extends Structure<Class4726>> RUINED_PORTAL_NETHER = register(
      "ruined_portal_nether", Structure.RUINED_PORTAL.method11368(new Class4726(Class107.NETHER))
   );

   private static <FC extends Class4698, F extends Structure<FC>> StructureFeature<FC, F> register(String var0, StructureFeature<FC, F> var1) {
      return WorldGenRegistries.method20496(WorldGenRegistries.field29427, var0, var1);
   }
}
