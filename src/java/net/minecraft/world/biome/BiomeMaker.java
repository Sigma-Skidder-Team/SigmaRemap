package net.minecraft.world.biome;

import mapped.*;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;

public class BiomeMaker {

   private static int getSkyColorWithTemperatureModifier(float var0) {
      float var3 = var0 / 3.0F;
      var3 = MathHelper.clamp(var3, -1.0F, 1.0F);
      return MathHelper.method37818(0.62222224F - var3 * 0.05F, 0.5F + var3 * 0.1F, 1.0F);
   }

   public static Biome makeGiantTaigaBiome(float var0, float var1, float var2, boolean var3) {
      Class9328 var6 = new Class9328();
      Class8468.method29838(var6);
      var6.method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.WOLF, 8, 4, 4));
      var6.method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.RABBIT, 4, 2, 3));
      var6.method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.FOX, 8, 2, 4));
      if (!var3) {
         Class8468.method29839(var6);
         Class8468.method29846(var6, 100, 25, 100);
      } else {
         Class8468.method29840(var6);
      }

      Class7935 var7 = new Class7935().method26688(Class9109.field41849);
      Class8468.method29771(var7);
      var7.method26693(StructureFeatures.RUINED_PORTAL);
      Class8468.method29773(var7);
      Class8468.method29775(var7);
      Class8468.method29777(var7);
      Class8468.method29785(var7);
      Class8468.method29786(var7);
      Class8468.method29778(var7);
      Class8468.method29779(var7);
      Class8468.method29783(var7);
      var7.method26690(Decoration.field13006, !var3 ? Features.field41821 : Features.field41820);
      Class8468.method29816(var7);
      Class8468.method29815(var7);
      Class8468.method29821(var7);
      Class8468.method29822(var7);
      Class8468.method29832(var7);
      Class8468.method29788(var7);
      Class8468.method29835(var7);
      return new Biome.Builder()
         .precipitation(Biome.RainType.RAIN)
         .category(Biome.Category.TAIGA)
         .depth(var0)
         .scale(var1)
         .temperature(var2)
         .downfall(0.8F)
         .setEffects(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(var2))
               .method34877(MoodSoundAmbience.field34224)
               .method34880()
         )
         .withMobSpawnSettings(var6.method35253())
         .withGenerationSettings(var7.method26695())
         .build();
   }

   public static Biome method36063(float var0, float var1, boolean var2) {
      Class9328 var5 = new Class9328();
      Class8468.method29838(var5);
      Class8468.method29840(var5);
      Class7935 var6 = new Class7935().method26688(Class9109.field41850);
      Class8468.method29771(var6);
      var6.method26693(StructureFeatures.RUINED_PORTAL);
      Class8468.method29773(var6);
      Class8468.method29775(var6);
      Class8468.method29777(var6);
      Class8468.method29809(var6);
      Class8468.method29778(var6);
      Class8468.method29779(var6);
      Class8468.method29783(var6);
      if (!var2) {
         Class8468.method29793(var6);
      } else {
         Class8468.method29795(var6);
      }

      Class8468.method29816(var6);
      Class8468.method29810(var6);
      Class8468.method29821(var6);
      Class8468.method29822(var6);
      Class8468.method29832(var6);
      Class8468.method29835(var6);
      return new Biome.Builder()
         .precipitation(Biome.RainType.RAIN)
         .category(Biome.Category.FOREST)
         .depth(var0)
         .scale(var1)
         .temperature(0.6F)
         .downfall(0.6F)
         .setEffects(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(0.6F))
               .method34877(MoodSoundAmbience.field34224)
               .method34880()
         )
         .withMobSpawnSettings(var5.method35253())
         .withGenerationSettings(var6.method26695())
         .build();
   }

   public static Biome method36064() {
      return method36071(0.1F, 0.2F, 40, 2, 3);
   }

   public static Biome method36065() {
      Class9328 var2 = new Class9328();
      Class8468.method29848(var2);
      return method36073(0.1F, 0.2F, 0.8F, false, true, false, var2);
   }

   public static Biome method36066() {
      Class9328 var2 = new Class9328();
      Class8468.method29848(var2);
      return method36073(0.2F, 0.4F, 0.8F, false, true, true, var2);
   }

   public static Biome method36067() {
      Class9328 var2 = new Class9328();
      Class8468.method29848(var2);
      var2.method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.PARROT, 10, 1, 1))
         .method35249(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.OCELOT, 2, 1, 1));
      return method36073(0.2F, 0.4F, 0.9F, false, false, true, var2);
   }

   public static Biome method36068() {
      return method36071(0.45F, 0.3F, 10, 1, 1);
   }

   public static Biome method36069() {
      return method36072(0.1F, 0.2F, 40, 2);
   }

   public static Biome method36070() {
      return method36072(0.45F, 0.3F, 10, 1);
   }

   private static Biome method36071(float var0, float var1, int var2, int var3, int var4) {
      Class9328 var7 = new Class9328();
      Class8468.method29848(var7);
      var7.method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.PARROT, var2, 1, var3))
         .method35249(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.OCELOT, 2, 1, var4))
         .method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.PANDA, 1, 1, 2));
      var7.method35252();
      return method36073(var0, var1, 0.9F, false, false, false, var7);
   }

   private static Biome method36072(float var0, float var1, int var2, int var3) {
      Class9328 var6 = new Class9328();
      Class8468.method29848(var6);
      var6.method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.PARROT, var2, 1, var3))
         .method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.PANDA, 80, 1, 2))
         .method35249(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.OCELOT, 2, 1, 1));
      return method36073(var0, var1, 0.9F, true, false, false, var6);
   }

   private static Biome method36073(float var0, float var1, float var2, boolean var3, boolean var4, boolean var5, Class9328 var6) {
      Class7935 var9 = new Class7935().method26688(Class9109.field41850);
      if (!var4 && !var5) {
         var9.method26693(StructureFeatures.JUNGLE_PYRAMID);
      }

      Class8468.method29771(var9);
      var9.method26693(StructureFeatures.RUINED_PORTAL_JUNGLE);
      Class8468.method29773(var9);
      Class8468.method29775(var9);
      Class8468.method29777(var9);
      Class8468.method29778(var9);
      Class8468.method29779(var9);
      Class8468.method29783(var9);
      if (!var3) {
         if (!var4 && !var5) {
            Class8468.method29789(var9);
         }

         if (!var4) {
            Class8468.method29800(var9);
         } else {
            Class8468.method29801(var9);
         }
      } else {
         Class8468.method29790(var9);
      }

      Class8468.method29817(var9);
      Class8468.method29804(var9);
      Class8468.method29821(var9);
      Class8468.method29822(var9);
      Class8468.method29832(var9);
      Class8468.method29824(var9);
      Class8468.method29835(var9);
      return new Biome.Builder()
         .precipitation(Biome.RainType.RAIN)
         .category(Biome.Category.JUNGLE)
         .depth(var0)
         .scale(var1)
         .temperature(0.95F)
         .downfall(var2)
         .setEffects(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(0.95F))
               .method34877(MoodSoundAmbience.field34224)
               .method34880()
         )
         .withMobSpawnSettings(var6.method35253())
         .withGenerationSettings(var9.method26695())
         .build();
   }

   public static Biome method36074(float var0, float var1, ConfiguredSurfaceBuilder<Class8278> var2, boolean var3) {
      Class9328 var6 = new Class9328();
      Class8468.method29838(var6);
      var6.method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.LLAMA, 5, 4, 6));
      Class8468.method29840(var6);
      Class7935 var7 = new Class7935().method26688(var2);
      Class8468.method29771(var7);
      var7.method26693(StructureFeatures.RUINED_PORTAL_MOUNTAIN);
      Class8468.method29773(var7);
      Class8468.method29775(var7);
      Class8468.method29777(var7);
      Class8468.method29778(var7);
      Class8468.method29779(var7);
      Class8468.method29783(var7);
      if (!var3) {
         Class8468.method29798(var7);
      } else {
         Class8468.method29799(var7);
      }

      Class8468.method29816(var7);
      Class8468.method29818(var7);
      Class8468.method29821(var7);
      Class8468.method29822(var7);
      Class8468.method29832(var7);
      Class8468.method29781(var7);
      Class8468.method29782(var7);
      Class8468.method29835(var7);
      return new Biome.Builder()
         .precipitation(Biome.RainType.RAIN)
         .category(Biome.Category.EXTREME_HILLS)
         .depth(var0)
         .scale(var1)
         .temperature(0.2F)
         .downfall(0.3F)
         .setEffects(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(0.2F))
               .method34877(MoodSoundAmbience.field34224)
               .method34880()
         )
         .withMobSpawnSettings(var6.method35253())
         .withGenerationSettings(var7.method26695())
         .build();
   }

   public static Biome method36075(float var0, float var1, boolean var2, boolean var3, boolean var4) {
      Class9328 var7 = new Class9328();
      Class8468.method29845(var7);
      Class7935 var8 = new Class7935().method26688(Class9109.field41844);
      if (var2) {
         var8.method26693(StructureFeatures.VILLAGE_DESERT);
         var8.method26693(StructureFeatures.PILLAGER_OUTPOST);
      }

      if (var3) {
         var8.method26693(StructureFeatures.DESERT_PYRAMID);
      }

      if (var4) {
         Class8468.method29828(var8);
      }

      Class8468.method29771(var8);
      var8.method26693(StructureFeatures.RUINED_PORTAL_DESERT);
      Class8468.method29773(var8);
      Class8468.method29776(var8);
      Class8468.method29777(var8);
      Class8468.method29778(var8);
      Class8468.method29779(var8);
      Class8468.method29783(var8);
      Class8468.method29816(var8);
      Class8468.method29818(var8);
      Class8468.method29814(var8);
      Class8468.method29821(var8);
      Class8468.method29825(var8);
      Class8468.method29832(var8);
      Class8468.method29827(var8);
      Class8468.method29835(var8);
      return new Biome.Builder()
         .precipitation(Biome.RainType.NONE)
         .category(Biome.Category.DESERT)
         .depth(var0)
         .scale(var1)
         .temperature(2.0F)
         .downfall(0.0F)
         .setEffects(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(2.0F))
               .method34877(MoodSoundAmbience.field34224)
               .method34880()
         )
         .withMobSpawnSettings(var7.method35253())
         .withGenerationSettings(var8.method26695())
         .build();
   }

   public static Biome makePlainsBiome(boolean isSunflowerVariant) {
      Class9328 var3 = new Class9328();
      Class8468.method29843(var3);
      if (!isSunflowerVariant) {
         var3.method35252();
      }

      Class7935 var4 = new Class7935().method26688(Class9109.field41850);
      if (!isSunflowerVariant) {
         var4.method26693(StructureFeatures.VILLAGE_PLAINS).method26693(StructureFeatures.PILLAGER_OUTPOST);
      }

      Class8468.method29771(var4);
      var4.method26693(StructureFeatures.RUINED_PORTAL);
      Class8468.method29773(var4);
      Class8468.method29775(var4);
      Class8468.method29777(var4);
      Class8468.method29820(var4);
      if (isSunflowerVariant) {
         var4.method26690(Decoration.field13006, Features.field41701);
      }

      Class8468.method29778(var4);
      Class8468.method29779(var4);
      Class8468.method29783(var4);
      Class8468.method29813(var4);
      if (isSunflowerVariant) {
         var4.method26690(Decoration.field13006, Features.field41729);
      }

      Class8468.method29821(var4);
      if (!isSunflowerVariant) {
         Class8468.method29822(var4);
      } else {
         var4.method26690(Decoration.field13006, Features.field41702);
      }

      Class8468.method29832(var4);
      Class8468.method29835(var4);
      return new Biome.Builder()
         .precipitation(Biome.RainType.RAIN)
         .category(Biome.Category.PLAINS)
         .depth(0.125F)
         .scale(0.05F)
         .temperature(0.8F)
         .downfall(0.4F)
         .setEffects(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(0.8F))
               .method34877(MoodSoundAmbience.field34224)
               .method34880()
         )
         .withMobSpawnSettings(var3.method35253())
         .withGenerationSettings(var4.method26695())
         .build();
   }

   private static Biome method36077(Class7935 var0) {
      Class9328 var3 = new Class9328();
      Class8468.method29849(var3);
      return new Biome.Builder()
         .precipitation(Biome.RainType.NONE)
         .category(Biome.Category.THEEND)
         .depth(0.1F)
         .scale(0.2F)
         .temperature(0.5F)
         .downfall(0.5F)
         .setEffects(
            new Class9265().method34869(4159204).method34870(329011).method34868(10518688).method34871(0).method34877(MoodSoundAmbience.field34224).method34880()
         )
         .withMobSpawnSettings(var3.method35253())
         .withGenerationSettings(var0.method26695())
         .build();
   }

   public static Biome method36078() {
      Class7935 var2 = new Class7935().method26688(Class9109.field41845);
      return method36077(var2);
   }

   public static Biome method36079() {
      Class7935 var2 = new Class7935().method26688(Class9109.field41845).method26690(Decoration.field13002, Features.field41633);
      return method36077(var2);
   }

   public static Biome method36080() {
      Class7935 var2 = new Class7935().method26688(Class9109.field41845).method26693(StructureFeatures.END_CITY);
      return method36077(var2);
   }

   public static Biome method36081() {
      Class7935 var2 = new Class7935()
         .method26688(Class9109.field41845)
         .method26693(StructureFeatures.END_CITY)
         .method26690(Decoration.field13002, Features.field41634)
         .method26690(Decoration.field13006, Features.field41636);
      return method36077(var2);
   }

   public static Biome method36082() {
      Class7935 var2 = new Class7935().method26688(Class9109.field41845).method26690(Decoration.field12998, Features.field41638);
      return method36077(var2);
   }

   public static Biome method36083(float var0, float var1) {
      Class9328 var4 = new Class9328();
      Class8468.method29847(var4);
      Class7935 var5 = new Class7935().method26688(Class9109.field41854);
      Class8468.method29771(var5);
      var5.method26693(StructureFeatures.RUINED_PORTAL);
      Class8468.method29773(var5);
      Class8468.method29775(var5);
      Class8468.method29777(var5);
      Class8468.method29778(var5);
      Class8468.method29779(var5);
      Class8468.method29783(var5);
      Class8468.method29812(var5);
      Class8468.method29821(var5);
      Class8468.method29822(var5);
      Class8468.method29832(var5);
      Class8468.method29835(var5);
      return new Biome.Builder()
         .precipitation(Biome.RainType.RAIN)
         .category(Biome.Category.MUSHROOM)
         .depth(var0)
         .scale(var1)
         .temperature(0.9F)
         .downfall(1.0F)
         .setEffects(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(0.9F))
               .method34877(MoodSoundAmbience.field34224)
               .method34880()
         )
         .withMobSpawnSettings(var4.method35253())
         .withGenerationSettings(var5.method26695())
         .build();
   }

   private static Biome method36084(float var0, float var1, float var2, boolean var3, boolean var4, Class9328 var5) {
      Class7935 var8 = new Class7935().method26688(!var4 ? Class9109.field41850 : Class9109.field41858);
      if (!var3 && !var4) {
         var8.method26693(StructureFeatures.VILLAGE_SAVANNA).method26693(StructureFeatures.PILLAGER_OUTPOST);
      }

      Class8468.method29771(var8);
      var8.method26693(!var3 ? StructureFeatures.RUINED_PORTAL : StructureFeatures.RUINED_PORTAL_MOUNTAIN);
      Class8468.method29773(var8);
      Class8468.method29775(var8);
      Class8468.method29777(var8);
      if (!var4) {
         Class8468.method29805(var8);
      }

      Class8468.method29778(var8);
      Class8468.method29779(var8);
      Class8468.method29783(var8);
      if (!var4) {
         Class8468.method29796(var8);
         Class8468.method29817(var8);
         Class8468.method29807(var8);
      } else {
         Class8468.method29797(var8);
         Class8468.method29816(var8);
         Class8468.method29806(var8);
      }

      Class8468.method29821(var8);
      Class8468.method29822(var8);
      Class8468.method29832(var8);
      Class8468.method29835(var8);
      return new Biome.Builder()
         .precipitation(Biome.RainType.NONE)
         .category(Biome.Category.SAVANNA)
         .depth(var0)
         .scale(var1)
         .temperature(var2)
         .downfall(0.0F)
         .setEffects(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(var2))
               .method34877(MoodSoundAmbience.field34224)
               .method34880()
         )
         .withMobSpawnSettings(var5.method35253())
         .withGenerationSettings(var8.method26695())
         .build();
   }

   public static Biome method36085(float var0, float var1, float var2, boolean var3, boolean var4) {
      Class9328 var7 = method36086();
      return method36084(var0, var1, var2, var3, var4, var7);
   }

   private static Class9328 method36086() {
      Class9328 var2 = new Class9328();
      Class8468.method29838(var2);
      var2.method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.HORSE, 1, 2, 6))
         .method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.DONKEY, 1, 1, 1));
      Class8468.method29840(var2);
      return var2;
   }

   public static Biome method36087() {
      Class9328 var2 = method36086();
      var2.method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.LLAMA, 8, 4, 4));
      return method36084(1.5F, 0.025F, 1.0F, true, false, var2);
   }

   private static Biome method36088(ConfiguredSurfaceBuilder<Class8278> var0, float var1, float var2, boolean var3, boolean var4) {
      Class9328 var7 = new Class9328();
      Class8468.method29840(var7);
      Class7935 var8 = new Class7935().method26688(var0);
      Class8468.method29770(var8);
      var8.method26693(!var3 ? StructureFeatures.RUINED_PORTAL : StructureFeatures.RUINED_PORTAL_MOUNTAIN);
      Class8468.method29773(var8);
      Class8468.method29775(var8);
      Class8468.method29777(var8);
      Class8468.method29778(var8);
      Class8468.method29779(var8);
      Class8468.method29780(var8);
      Class8468.method29783(var8);
      if (var4) {
         Class8468.method29802(var8);
      }

      Class8468.method29808(var8);
      Class8468.method29821(var8);
      Class8468.method29823(var8);
      Class8468.method29832(var8);
      Class8468.method29835(var8);
      return new Biome.Builder()
         .precipitation(Biome.RainType.NONE)
         .category(Biome.Category.MESA)
         .depth(var1)
         .scale(var2)
         .temperature(2.0F)
         .downfall(0.0F)
         .setEffects(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(2.0F))
               .method34872(10387789)
               .method34873(9470285)
               .method34877(MoodSoundAmbience.field34224)
               .method34880()
         )
         .withMobSpawnSettings(var7.method35253())
         .withGenerationSettings(var8.method26695())
         .build();
   }

   public static Biome method36089(float var0, float var1, boolean var2) {
      return method36088(Class9109.field41841, var0, var1, var2, false);
   }

   public static Biome method36090(float var0, float var1) {
      return method36088(Class9109.field41863, var0, var1, true, true);
   }

   public static Biome method36091() {
      return method36088(Class9109.field41846, 0.1F, 0.2F, true, false);
   }

   private static Biome method36092(Class9328 var0, int var1, int var2, boolean var3, Class7935 var4) {
      return new Biome.Builder()
         .precipitation(Biome.RainType.RAIN)
         .category(Biome.Category.OCEAN)
         .depth(!var3 ? -1.0F : -1.8F)
         .scale(0.1F)
         .temperature(0.5F)
         .downfall(0.5F)
         .setEffects(
            new Class9265()
               .method34869(var1)
               .method34870(var2)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(0.5F))
               .method34877(MoodSoundAmbience.field34224)
               .method34880()
         )
         .withMobSpawnSettings(var0.method35253())
         .withGenerationSettings(var4.method26695())
         .build();
   }

   private static Class7935 method36093(ConfiguredSurfaceBuilder<Class8278> var0, boolean var1, boolean var2, boolean var3) {
      Class7935 var6 = new Class7935().method26688(var0);
      StructureFeature var7 = !var2 ? StructureFeatures.OCEAN_RUIN_COLD : StructureFeatures.OCEAN_RUIN_WARM;
      if (!var3) {
         var6.method26693(var7);
         if (var1) {
            var6.method26693(StructureFeatures.MONUMENT);
         }

         Class8468.method29772(var6);
      } else {
         if (var1) {
            var6.method26693(StructureFeatures.MONUMENT);
         }

         Class8468.method29772(var6);
         var6.method26693(var7);
      }

      var6.method26693(StructureFeatures.RUINED_PORTAL_OCEAN);
      Class8468.method29774(var6);
      Class8468.method29775(var6);
      Class8468.method29777(var6);
      Class8468.method29778(var6);
      Class8468.method29779(var6);
      Class8468.method29783(var6);
      Class8468.method29792(var6);
      Class8468.method29816(var6);
      Class8468.method29818(var6);
      Class8468.method29821(var6);
      Class8468.method29822(var6);
      Class8468.method29832(var6);
      return var6;
   }

   public static Biome method36094(boolean var0) {
      Class9328 var3 = new Class9328();
      Class8468.method29841(var3, 3, 4, 15);
      var3.method35249(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(EntityType.SALMON, 15, 1, 5));
      boolean var4 = !var0;
      Class7935 var5 = method36093(Class9109.field41850, var0, false, var4);
      var5.method26690(Decoration.field13006, !var0 ? Features.field41652 : Features.field41653);
      Class8468.method29830(var5);
      Class8468.method29829(var5);
      Class8468.method29835(var5);
      return method36092(var3, 4020182, 329011, var0, var5);
   }

   public static Biome method36095(boolean var0) {
      Class9328 var3 = new Class9328();
      Class8468.method29841(var3, 1, 4, 10);
      var3.method35249(EntityClassification.WATER_CREATURE, new MobSpawnInfo.Spawners(EntityType.DOLPHIN, 1, 1, 2));
      Class7935 var4 = method36093(Class9109.field41850, var0, false, true);
      var4.method26690(Decoration.field13006, !var0 ? Features.field41654 : Features.field41656);
      Class8468.method29830(var4);
      Class8468.method29829(var4);
      Class8468.method29835(var4);
      return method36092(var3, 4159204, 329011, var0, var4);
   }

   public static Biome method36096(boolean var0) {
      Class9328 var3 = new Class9328();
      if (!var0) {
         Class8468.method29841(var3, 10, 2, 15);
      } else {
         Class8468.method29841(var3, 8, 4, 8);
      }

      var3.method35249(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(EntityType.PUFFERFISH, 5, 1, 3))
         .method35249(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(EntityType.TROPICAL_FISH, 25, 8, 8))
         .method35249(EntityClassification.WATER_CREATURE, new MobSpawnInfo.Spawners(EntityType.DOLPHIN, 2, 1, 2));
      Class7935 var4 = method36093(Class9109.field41857, var0, true, false);
      var4.method26690(Decoration.field13006, !var0 ? Features.field41658 : Features.field41659);
      if (var0) {
         Class8468.method29830(var4);
      }

      Class8468.method29831(var4);
      Class8468.method29835(var4);
      return method36092(var3, 4566514, 267827, var0, var4);
   }

   public static Biome method36097() {
      Class9328 var2 = new Class9328().method35249(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(EntityType.PUFFERFISH, 15, 1, 3));
      Class8468.method29842(var2, 10, 4);
      Class7935 var3 = method36093(Class9109.field41848, false, true, false)
         .method26690(Decoration.field13006, Features.field41807)
         .method26690(Decoration.field13006, Features.field41658)
         .method26690(Decoration.field13006, Features.field41660);
      Class8468.method29835(var3);
      return method36092(var2, 4445678, 270131, false, var3);
   }

   public static Biome method36098() {
      Class9328 var2 = new Class9328();
      Class8468.method29842(var2, 5, 1);
      var2.method35249(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.DROWNED, 5, 1, 1));
      Class7935 var3 = method36093(Class9109.field41848, true, true, false).method26690(Decoration.field13006, Features.field41659);
      Class8468.method29830(var3);
      Class8468.method29835(var3);
      return method36092(var2, 4445678, 270131, true, var3);
   }

   public static Biome method36099(boolean var0) {
      Class9328 var3 = new Class9328()
         .method35249(EntityClassification.WATER_CREATURE, new MobSpawnInfo.Spawners(EntityType.SQUID, 1, 1, 4))
         .method35249(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(EntityType.SALMON, 15, 1, 5))
         .method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.POLAR_BEAR, 1, 1, 2));
      Class8468.method29840(var3);
      var3.method35249(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.DROWNED, 5, 1, 1));
      float var4 = !var0 ? 0.0F : 0.5F;
      Class7935 var5 = new Class7935().method26688(Class9109.field41847);
      var5.method26693(StructureFeatures.OCEAN_RUIN_COLD);
      if (var0) {
         var5.method26693(StructureFeatures.MONUMENT);
      }

      Class8468.method29772(var5);
      var5.method26693(StructureFeatures.RUINED_PORTAL_OCEAN);
      Class8468.method29774(var5);
      Class8468.method29775(var5);
      Class8468.method29833(var5);
      Class8468.method29777(var5);
      Class8468.method29834(var5);
      Class8468.method29778(var5);
      Class8468.method29779(var5);
      Class8468.method29783(var5);
      Class8468.method29792(var5);
      Class8468.method29816(var5);
      Class8468.method29818(var5);
      Class8468.method29821(var5);
      Class8468.method29822(var5);
      Class8468.method29832(var5);
      Class8468.method29835(var5);
      return new Biome.Builder()
         .precipitation(!var0 ? Biome.RainType.SNOW : Biome.RainType.RAIN)
         .category(Biome.Category.OCEAN)
         .depth(!var0 ? -1.0F : -1.8F)
         .scale(0.1F)
         .temperature(var4)
         .withTemperatureModifier(Biome.TemperatureModifier.FROZEN)
         .downfall(0.5F)
         .setEffects(
            new Class9265()
               .method34869(3750089)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(var4))
               .method34877(MoodSoundAmbience.field34224)
               .method34880()
         )
         .withMobSpawnSettings(var3.method35253())
         .withGenerationSettings(var5.method26695())
         .build();
   }

   private static Biome method36100(float var0, float var1, boolean var2, Class9328 var3) {
      Class7935 var6 = new Class7935().method26688(Class9109.field41850);
      Class8468.method29771(var6);
      var6.method26693(StructureFeatures.RUINED_PORTAL);
      Class8468.method29773(var6);
      Class8468.method29775(var6);
      Class8468.method29777(var6);
      if (!var2) {
         Class8468.method29809(var6);
      } else {
         var6.method26690(Decoration.field13006, Features.field41803);
      }

      Class8468.method29778(var6);
      Class8468.method29779(var6);
      Class8468.method29783(var6);
      if (!var2) {
         Class8468.method29794(var6);
         Class8468.method29816(var6);
         Class8468.method29810(var6);
      } else {
         var6.method26690(Decoration.field13006, Features.field41808);
         var6.method26690(Decoration.field13006, Features.field41798);
         Class8468.method29818(var6);
      }

      Class8468.method29821(var6);
      Class8468.method29822(var6);
      Class8468.method29832(var6);
      Class8468.method29835(var6);
      return new Biome.Builder()
         .precipitation(Biome.RainType.RAIN)
         .category(Biome.Category.FOREST)
         .depth(var0)
         .scale(var1)
         .temperature(0.7F)
         .downfall(0.8F)
         .setEffects(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(0.7F))
               .method34877(MoodSoundAmbience.field34224)
               .method34880()
         )
         .withMobSpawnSettings(var3.method35253())
         .withGenerationSettings(var6.method26695())
         .build();
   }

   private static Class9328 method36101() {
      Class9328 var2 = new Class9328();
      Class8468.method29838(var2);
      Class8468.method29840(var2);
      return var2;
   }

   public static Biome method36102(float var0, float var1) {
      Class9328 var4 = method36101().method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.WOLF, 5, 4, 4)).method35252();
      return method36100(var0, var1, false, var4);
   }

   public static Biome method36103() {
      Class9328 var2 = method36101().method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.RABBIT, 4, 2, 3));
      return method36100(0.1F, 0.4F, true, var2);
   }

   public static Biome method36104(float var0, float var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      Class9328 var8 = new Class9328();
      Class8468.method29838(var8);
      var8.method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.WOLF, 8, 4, 4))
         .method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.RABBIT, 4, 2, 3))
         .method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.FOX, 8, 2, 4));
      if (!var2 && !var3) {
         var8.method35252();
      }

      Class8468.method29840(var8);
      float var9 = !var2 ? 0.25F : -0.5F;
      Class7935 var10 = new Class7935().method26688(Class9109.field41850);
      if (var4) {
         var10.method26693(StructureFeatures.VILLAGE_TAIGA);
         var10.method26693(StructureFeatures.PILLAGER_OUTPOST);
      }

      if (var5) {
         var10.method26693(StructureFeatures.IGLOO);
      }

      Class8468.method29771(var10);
      var10.method26693(!var3 ? StructureFeatures.RUINED_PORTAL : StructureFeatures.RUINED_PORTAL_MOUNTAIN);
      Class8468.method29773(var10);
      Class8468.method29775(var10);
      Class8468.method29777(var10);
      Class8468.method29786(var10);
      Class8468.method29778(var10);
      Class8468.method29779(var10);
      Class8468.method29783(var10);
      Class8468.method29791(var10);
      Class8468.method29816(var10);
      Class8468.method29819(var10);
      Class8468.method29821(var10);
      Class8468.method29822(var10);
      Class8468.method29832(var10);
      if (!var2) {
         Class8468.method29788(var10);
      } else {
         Class8468.method29787(var10);
      }

      Class8468.method29835(var10);
      return new Biome.Builder()
         .precipitation(!var2 ? Biome.RainType.RAIN : Biome.RainType.SNOW)
         .category(Biome.Category.TAIGA)
         .depth(var0)
         .scale(var1)
         .temperature(var9)
         .downfall(!var2 ? 0.8F : 0.4F)
         .setEffects(
            new Class9265()
               .method34869(!var2 ? 4159204 : 4020182)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(var9))
               .method34877(MoodSoundAmbience.field34224)
               .method34880()
         )
         .withMobSpawnSettings(var8.method35253())
         .withGenerationSettings(var10.method26695())
         .build();
   }

   public static Biome method36105(float var0, float var1, boolean var2) {
      Class9328 var5 = new Class9328();
      Class8468.method29838(var5);
      Class8468.method29840(var5);
      Class7935 var6 = new Class7935().method26688(Class9109.field41850);
      var6.method26693(StructureFeatures.MANSION);
      Class8468.method29771(var6);
      var6.method26693(StructureFeatures.RUINED_PORTAL);
      Class8468.method29773(var6);
      Class8468.method29775(var6);
      Class8468.method29777(var6);
      var6.method26690(Decoration.field13006, !var2 ? Features.field41805 : Features.field41806);
      Class8468.method29809(var6);
      Class8468.method29778(var6);
      Class8468.method29779(var6);
      Class8468.method29783(var6);
      Class8468.method29816(var6);
      Class8468.method29810(var6);
      Class8468.method29821(var6);
      Class8468.method29822(var6);
      Class8468.method29832(var6);
      Class8468.method29835(var6);
      return new Biome.Builder()
         .precipitation(Biome.RainType.RAIN)
         .category(Biome.Category.FOREST)
         .depth(var0)
         .scale(var1)
         .temperature(0.7F)
         .downfall(0.8F)
         .setEffects(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(0.7F))
               .method34874(BiomeAmbience.GrassColorModifier.field231)
               .method34877(MoodSoundAmbience.field34224)
               .method34880()
         )
         .withMobSpawnSettings(var5.method35253())
         .withGenerationSettings(var6.method26695())
         .build();
   }

   public static Biome makeGenericSwampBiome(float var0, float var1, boolean var2) {
      Class9328 var5 = new Class9328();
      Class8468.method29838(var5);
      Class8468.method29840(var5);
      var5.method35249(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.SLIME, 1, 1, 1));
      Class7935 var6 = new Class7935().method26688(Class9109.field41861);
      if (!var2) {
         var6.method26693(StructureFeatures.SWAMP_HUT);
      }

      var6.method26693(StructureFeatures.MINESHAFT);
      var6.method26693(StructureFeatures.RUINED_PORTAL_SWAMP);
      Class8468.method29773(var6);
      if (!var2) {
         Class8468.method29828(var6);
      }

      Class8468.method29775(var6);
      Class8468.method29777(var6);
      Class8468.method29778(var6);
      Class8468.method29779(var6);
      Class8468.method29784(var6);
      Class8468.method29811(var6);
      Class8468.method29821(var6);
      Class8468.method29826(var6);
      Class8468.method29832(var6);
      if (!var2) {
         var6.method26690(Decoration.field13006, Features.field41657);
      } else {
         Class8468.method29828(var6);
      }

      Class8468.method29835(var6);
      return new Biome.Builder()
         .precipitation(Biome.RainType.RAIN)
         .category(Biome.Category.SWAMP)
         .depth(var0)
         .scale(var1)
         .temperature(0.8F)
         .downfall(0.9F)
         .setEffects(
            new Class9265()
               .method34869(6388580)
               .method34870(2302743)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(0.8F))
               .method34872(6975545)
               .method34874(BiomeAmbience.GrassColorModifier.field232)
               .method34877(MoodSoundAmbience.field34224)
               .method34880()
         )
         .withMobSpawnSettings(var5.method35253())
         .withGenerationSettings(var6.method26695())
         .build();
   }

   public static Biome method36107(float var0, float var1, boolean var2, boolean var3) {
      Class9328 var6 = new Class9328().method35251(0.07F);
      Class8468.method29844(var6);
      Class7935 var7 = new Class7935().method26688(!var2 ? Class9109.field41850 : Class9109.field41852);
      if (!var2 && !var3) {
         var7.method26693(StructureFeatures.VILLAGE_SNOWY).method26693(StructureFeatures.IGLOO);
      }

      Class8468.method29771(var7);
      if (!var2 && !var3) {
         var7.method26693(StructureFeatures.PILLAGER_OUTPOST);
      }

      var7.method26693(!var3 ? StructureFeatures.RUINED_PORTAL : StructureFeatures.RUINED_PORTAL_MOUNTAIN);
      Class8468.method29773(var7);
      Class8468.method29775(var7);
      Class8468.method29777(var7);
      if (var2) {
         var7.method26690(Decoration.field13002, Features.field41661);
         var7.method26690(Decoration.field13002, Features.field41662);
      }

      Class8468.method29778(var7);
      Class8468.method29779(var7);
      Class8468.method29783(var7);
      Class8468.method29803(var7);
      Class8468.method29816(var7);
      Class8468.method29818(var7);
      Class8468.method29821(var7);
      Class8468.method29822(var7);
      Class8468.method29832(var7);
      Class8468.method29835(var7);
      return new Biome.Builder()
         .precipitation(Biome.RainType.SNOW)
         .category(Biome.Category.ICY)
         .depth(var0)
         .scale(var1)
         .temperature(0.0F)
         .downfall(0.5F)
         .setEffects(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(0.0F))
               .method34877(MoodSoundAmbience.field34224)
               .method34880()
         )
         .withMobSpawnSettings(var6.method35253())
         .withGenerationSettings(var7.method26695())
         .build();
   }

   public static Biome method36108(float var0, float var1, float var2, int var3, boolean var4) {
      Class9328 var7 = new Class9328()
         .method35249(EntityClassification.WATER_CREATURE, new MobSpawnInfo.Spawners(EntityType.SQUID, 2, 1, 4))
         .method35249(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(EntityType.SALMON, 5, 1, 5));
      Class8468.method29840(var7);
      var7.method35249(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.DROWNED, !var4 ? 100 : 1, 1, 1));
      Class7935 var8 = new Class7935().method26688(Class9109.field41850);
      var8.method26693(StructureFeatures.MINESHAFT);
      var8.method26693(StructureFeatures.RUINED_PORTAL);
      Class8468.method29773(var8);
      Class8468.method29775(var8);
      Class8468.method29777(var8);
      Class8468.method29778(var8);
      Class8468.method29779(var8);
      Class8468.method29783(var8);
      Class8468.method29792(var8);
      Class8468.method29816(var8);
      Class8468.method29818(var8);
      Class8468.method29821(var8);
      Class8468.method29822(var8);
      Class8468.method29832(var8);
      if (!var4) {
         var8.method26690(Decoration.field13006, Features.field41655);
      }

      Class8468.method29835(var8);
      return new Biome.Builder()
         .precipitation(!var4 ? Biome.RainType.RAIN : Biome.RainType.SNOW)
         .category(Biome.Category.RIVER)
         .depth(var0)
         .scale(var1)
         .temperature(var2)
         .downfall(0.5F)
         .setEffects(
            new Class9265()
               .method34869(var3)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(var2))
               .method34877(MoodSoundAmbience.field34224)
               .method34880()
         )
         .withMobSpawnSettings(var7.method35253())
         .withGenerationSettings(var8.method26695())
         .build();
   }

   public static Biome method36109(float var0, float var1, float var2, float var3, int var4, boolean var5, boolean var6) {
      Class9328 var9 = new Class9328();
      if (!var6 && !var5) {
         var9.method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.TURTLE, 5, 2, 5));
      }

      Class8468.method29840(var9);
      Class7935 var10 = new Class7935().method26688(!var6 ? Class9109.field41844 : Class9109.field41860);
      if (!var6) {
         var10.method26693(StructureFeatures.MINESHAFT);
         var10.method26693(StructureFeatures.BURIED_TREASURE);
         var10.method26693(StructureFeatures.SHIPWRECK_BEACHED);
      } else {
         Class8468.method29771(var10);
      }

      var10.method26693(!var6 ? StructureFeatures.RUINED_PORTAL : StructureFeatures.RUINED_PORTAL_MOUNTAIN);
      Class8468.method29773(var10);
      Class8468.method29775(var10);
      Class8468.method29777(var10);
      Class8468.method29778(var10);
      Class8468.method29779(var10);
      Class8468.method29783(var10);
      Class8468.method29816(var10);
      Class8468.method29818(var10);
      Class8468.method29821(var10);
      Class8468.method29822(var10);
      Class8468.method29832(var10);
      Class8468.method29835(var10);
      return new Biome.Builder()
         .precipitation(!var5 ? Biome.RainType.RAIN : Biome.RainType.SNOW)
         .category(!var6 ? Biome.Category.BEACH : Biome.Category.NONE)
         .depth(var0)
         .scale(var1)
         .temperature(var2)
         .downfall(var3)
         .setEffects(
            new Class9265()
               .method34869(var4)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(var2))
               .method34877(MoodSoundAmbience.field34224)
               .method34880()
         )
         .withMobSpawnSettings(var9.method35253())
         .withGenerationSettings(var10.method26695())
         .build();
   }

   public static Biome method36110() {
      Class7935 var2 = new Class7935().method26688(Class9109.field41856);
      var2.method26690(Decoration.field13007, Features.field41680);
      return new Biome.Builder()
         .precipitation(Biome.RainType.NONE)
         .category(Biome.Category.NONE)
         .depth(0.1F)
         .scale(0.2F)
         .temperature(0.5F)
         .downfall(0.5F)
         .setEffects(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(12638463)
               .method34871(getSkyColorWithTemperatureModifier(0.5F))
               .method34877(MoodSoundAmbience.field34224)
               .method34880()
         )
         .withMobSpawnSettings(MobSpawnInfo.EMPTY)
         .withGenerationSettings(var2.method26695())
         .build();
   }

   public static Biome method36111() {
      MobSpawnInfo var2 = new Class9328()
         .method35249(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.GHAST, 50, 4, 4))
         .method35249(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ZOMBIFIED_PIGLIN, 100, 4, 4))
         .method35249(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.MAGMA_CUBE, 2, 4, 4))
         .method35249(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.field41025, 1, 4, 4))
         .method35249(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.PIGLIN, 15, 4, 4))
         .method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.STRIDER, 60, 1, 2))
         .method35253();
      Class7935 var3 = new Class7935()
         .method26688(Class9109.field41855)
         .method26693(StructureFeatures.RUINED_PORTAL_NETHER)
         .method26693(StructureFeatures.FORTRESS)
         .method26693(StructureFeatures.BASTION_REMNANT)
         .method26692(GenerationStageCarving.field259, Class7827.field33611)
         .method26690(Decoration.field13006, Features.field41685);
      Class8468.method29821(var3);
      var3.method26690(Decoration.field13005, Features.field41689)
         .method26690(Decoration.field13005, Features.field41696)
         .method26690(Decoration.field13005, Features.field41697)
         .method26690(Decoration.field13005, Features.field41644)
         .method26690(Decoration.field13005, Features.field41645)
         .method26690(Decoration.field13005, Features.field41730)
         .method26690(Decoration.field13005, Features.field41731)
         .method26690(Decoration.field13005, Features.field41740)
         .method26690(Decoration.field13005, Features.field41687);
      Class8468.method29836(var3);
      return new Biome.Builder()
         .precipitation(Biome.RainType.NONE)
         .category(Biome.Category.NETHER)
         .depth(0.1F)
         .scale(0.2F)
         .temperature(2.0F)
         .downfall(0.0F)
         .setEffects(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(3344392)
               .method34871(getSkyColorWithTemperatureModifier(2.0F))
               .method34876(SoundEvents.field26321)
               .method34877(new MoodSoundAmbience(SoundEvents.field26322, 6000, 8, 2.0))
               .method34878(new SoundAdditionsAmbience(SoundEvents.field26320, 0.0111))
               .method34879(BackgroundMusicTracks.method25672(SoundEvents.field26796))
               .method34880()
         )
         .withMobSpawnSettings(var2)
         .withGenerationSettings(var3.method26695())
         .build();
   }

   public static Biome method36112() {
      double var2 = 0.7;
      double var4 = 0.15;
      MobSpawnInfo var6 = new Class9328()
         .method35249(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.SKELETON, 20, 5, 5))
         .method35249(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.GHAST, 50, 4, 4))
         .method35249(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.field41025, 1, 4, 4))
         .method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.STRIDER, 60, 1, 2))
         .method35250(EntityType.SKELETON, 0.7, 0.15)
         .method35250(EntityType.GHAST, 0.7, 0.15)
         .method35250(EntityType.field41025, 0.7, 0.15)
         .method35250(EntityType.STRIDER, 0.7, 0.15)
         .method35253();
      Class7935 var7 = new Class7935()
         .method26688(Class9109.field41859)
         .method26693(StructureFeatures.FORTRESS)
         .method26693(StructureFeatures.NETHER_FOSSIL)
         .method26693(StructureFeatures.RUINED_PORTAL_NETHER)
         .method26693(StructureFeatures.BASTION_REMNANT)
         .method26692(GenerationStageCarving.field259, Class7827.field33611)
         .method26690(Decoration.field13006, Features.field41685)
         .method26690(Decoration.field13000, Features.field41651)
         .method26690(Decoration.field13005, Features.field41689)
         .method26690(Decoration.field13005, Features.field41644)
         .method26690(Decoration.field13005, Features.field41645)
         .method26690(Decoration.field13005, Features.field41700)
         .method26690(Decoration.field13005, Features.field41696)
         .method26690(Decoration.field13005, Features.field41697)
         .method26690(Decoration.field13005, Features.field41740)
         .method26690(Decoration.field13005, Features.field41687)
         .method26690(Decoration.field13005, Features.field41741);
      Class8468.method29836(var7);
      return new Biome.Builder()
         .precipitation(Biome.RainType.NONE)
         .category(Biome.Category.NETHER)
         .depth(0.1F)
         .scale(0.2F)
         .temperature(2.0F)
         .downfall(0.0F)
         .setEffects(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(1787717)
               .method34871(getSkyColorWithTemperatureModifier(2.0F))
               .method34875(new ParticleEffectAmbience(ParticleTypes.field34112, 0.00625F))
               .method34876(SoundEvents.field26324)
               .method34877(new MoodSoundAmbience(SoundEvents.field26325, 6000, 8, 2.0))
               .method34878(new SoundAdditionsAmbience(SoundEvents.field26323, 0.0111))
               .method34879(BackgroundMusicTracks.method25672(SoundEvents.field26797))
               .method34880()
         )
         .withMobSpawnSettings(var6)
         .withGenerationSettings(var7.method26695())
         .build();
   }

   public static Biome method36113() {
      MobSpawnInfo var2 = new Class9328()
         .method35249(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.GHAST, 40, 1, 1))
         .method35249(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.MAGMA_CUBE, 100, 2, 5))
         .method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.STRIDER, 60, 1, 2))
         .method35253();
      Class7935 var3 = new Class7935()
         .method26688(Class9109.field41842)
         .method26693(StructureFeatures.RUINED_PORTAL_NETHER)
         .method26692(GenerationStageCarving.field259, Class7827.field33611)
         .method26693(StructureFeatures.FORTRESS)
         .method26690(Decoration.field13002, Features.field41639)
         .method26690(Decoration.field13006, Features.field41684)
         .method26690(Decoration.field13002, Features.field41640)
         .method26690(Decoration.field13002, Features.field41641)
         .method26690(Decoration.field13005, Features.field41642)
         .method26690(Decoration.field13005, Features.field41643)
         .method26690(Decoration.field13005, Features.field41686)
         .method26690(Decoration.field13005, Features.field41696)
         .method26690(Decoration.field13005, Features.field41697)
         .method26690(Decoration.field13005, Features.field41644)
         .method26690(Decoration.field13005, Features.field41645)
         .method26690(Decoration.field13005, Features.field41730)
         .method26690(Decoration.field13005, Features.field41731)
         .method26690(Decoration.field13005, Features.field41740)
         .method26690(Decoration.field13005, Features.field41688)
         .method26690(Decoration.field13005, Features.field41742)
         .method26690(Decoration.field13005, Features.field41743);
      Class8468.method29837(var3);
      return new Biome.Builder()
         .precipitation(Biome.RainType.NONE)
         .category(Biome.Category.NETHER)
         .depth(0.1F)
         .scale(0.2F)
         .temperature(2.0F)
         .downfall(0.0F)
         .setEffects(
            new Class9265()
               .method34869(4159204)
               .method34870(4341314)
               .method34868(6840176)
               .method34871(getSkyColorWithTemperatureModifier(2.0F))
               .method34875(new ParticleEffectAmbience(ParticleTypes.field34119, 0.118093334F))
               .method34876(SoundEvents.field26315)
               .method34877(new MoodSoundAmbience(SoundEvents.field26316, 6000, 8, 2.0))
               .method34878(new SoundAdditionsAmbience(SoundEvents.field26314, 0.0111))
               .method34879(BackgroundMusicTracks.method25672(SoundEvents.field26795))
               .method34880()
         )
         .withMobSpawnSettings(var2)
         .withGenerationSettings(var3.method26695())
         .build();
   }

   public static Biome method36114() {
      MobSpawnInfo var2 = new Class9328()
         .method35249(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ZOMBIFIED_PIGLIN, 1, 2, 4))
         .method35249(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.HOGLIN, 9, 3, 4))
         .method35249(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.PIGLIN, 5, 3, 4))
         .method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.STRIDER, 60, 1, 2))
         .method35253();
      Class7935 var3 = new Class7935()
         .method26688(Class9109.field41843)
         .method26693(StructureFeatures.RUINED_PORTAL_NETHER)
         .method26692(GenerationStageCarving.field259, Class7827.field33611)
         .method26693(StructureFeatures.FORTRESS)
         .method26693(StructureFeatures.BASTION_REMNANT)
         .method26690(Decoration.field13006, Features.field41685);
      Class8468.method29821(var3);
      var3.method26690(Decoration.field13005, Features.field41689)
         .method26690(Decoration.field13005, Features.field41696)
         .method26690(Decoration.field13005, Features.field41644)
         .method26690(Decoration.field13005, Features.field41645)
         .method26690(Decoration.field13005, Features.field41740)
         .method26690(Decoration.field13005, Features.field41687)
         .method26690(Decoration.field13006, Features.field41650)
         .method26690(Decoration.field13006, Features.field41764)
         .method26690(Decoration.field13006, Features.field41646);
      Class8468.method29836(var3);
      return new Biome.Builder()
         .precipitation(Biome.RainType.NONE)
         .category(Biome.Category.NETHER)
         .depth(0.1F)
         .scale(0.2F)
         .temperature(2.0F)
         .downfall(0.0F)
         .setEffects(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(3343107)
               .method34871(getSkyColorWithTemperatureModifier(2.0F))
               .method34875(new ParticleEffectAmbience(ParticleTypes.field34113, 0.025F))
               .method34876(SoundEvents.field26318)
               .method34877(new MoodSoundAmbience(SoundEvents.field26319, 6000, 8, 2.0))
               .method34878(new SoundAdditionsAmbience(SoundEvents.field26317, 0.0111))
               .method34879(BackgroundMusicTracks.method25672(SoundEvents.field26798))
               .method34880()
         )
         .withMobSpawnSettings(var2)
         .withGenerationSettings(var3.method26695())
         .build();
   }

   public static Biome method36115() {
      MobSpawnInfo var2 = new Class9328()
         .method35249(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.field41025, 1, 4, 4))
         .method35249(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.STRIDER, 60, 1, 2))
         .method35250(EntityType.field41025, 1.0, 0.12)
         .method35253();
      Class7935 var3 = new Class7935()
         .method26688(Class9109.field41862)
         .method26693(StructureFeatures.FORTRESS)
         .method26693(StructureFeatures.BASTION_REMNANT)
         .method26693(StructureFeatures.RUINED_PORTAL_NETHER)
         .method26692(GenerationStageCarving.field259, Class7827.field33611)
         .method26690(Decoration.field13006, Features.field41685);
      Class8468.method29821(var3);
      var3.method26690(Decoration.field13005, Features.field41689)
         .method26690(Decoration.field13005, Features.field41696)
         .method26690(Decoration.field13005, Features.field41697)
         .method26690(Decoration.field13005, Features.field41644)
         .method26690(Decoration.field13005, Features.field41645)
         .method26690(Decoration.field13005, Features.field41740)
         .method26690(Decoration.field13005, Features.field41687)
         .method26690(Decoration.field13006, Features.field41766)
         .method26690(Decoration.field13006, Features.field41647)
         .method26690(Decoration.field13006, Features.field41648)
         .method26690(Decoration.field13006, Features.field41649);
      Class8468.method29836(var3);
      return new Biome.Builder()
         .precipitation(Biome.RainType.NONE)
         .category(Biome.Category.NETHER)
         .depth(0.1F)
         .scale(0.2F)
         .temperature(2.0F)
         .downfall(0.0F)
         .setEffects(
            new Class9265()
               .method34869(4159204)
               .method34870(329011)
               .method34868(1705242)
               .method34871(getSkyColorWithTemperatureModifier(2.0F))
               .method34875(new ParticleEffectAmbience(ParticleTypes.field34114, 0.01428F))
               .method34876(SoundEvents.field26327)
               .method34877(new MoodSoundAmbience(SoundEvents.field26328, 6000, 8, 2.0))
               .method34878(new SoundAdditionsAmbience(SoundEvents.field26326, 0.0111))
               .method34879(BackgroundMusicTracks.method25672(SoundEvents.field26799))
               .method34880()
         )
         .withMobSpawnSettings(var2)
         .withGenerationSettings(var3.method26695())
         .build();
   }
}
