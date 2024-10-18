package net.minecraft.world.biome;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

import mapped.Class6691;
import net.minecraft.client.util.Util;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MobSpawnInfo {
   public static final Logger field39898 = LogManager.getLogger();
   public static final MobSpawnInfo EMPTY = new MobSpawnInfo(
      0.1F, Stream.<EntityClassification>of(EntityClassification.values()).collect(ImmutableMap.toImmutableMap(var0 -> var0, var0 -> ImmutableList.of())), ImmutableMap.of(), false
   );
   public static final MapCodec<MobSpawnInfo> CODEC = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
               Codec.FLOAT.optionalFieldOf("creature_spawn_probability", 0.1F).forGetter(var0x -> var0x.creatureSpawnProbability),
               Codec.simpleMap(
                     EntityClassification.field629,
                     Spawners.field29310.listOf().promotePartial(Util.func_240982_a_("Spawn data: ", field39898::error)),
                     IStringSerializable.method260(EntityClassification.values())
                  )
                  .fieldOf("spawners")
                  .forGetter(var0x -> var0x.spawners),
               Codec.simpleMap(Registry.ENTITY_TYPE, SpawnCosts.field33334, Registry.ENTITY_TYPE).fieldOf("spawn_costs").forGetter(var0x -> var0x.spawnCosts),
               Codec.BOOL.fieldOf("player_spawn_friendly").orElse(false).forGetter(MobSpawnInfo::isValidSpawnBiomeForPlayer)
            )
            .apply(var0, MobSpawnInfo::new)
   );
   private final float creatureSpawnProbability;
   private final Map<EntityClassification, List<Spawners>> spawners;
   private final Map<EntityType<?>, SpawnCosts> spawnCosts;
   private final boolean validSpawnBiomeForPlayer;

   public MobSpawnInfo(float var1, Map<EntityClassification, List<Spawners>> var2, Map<EntityType<?>, SpawnCosts> var3, boolean var4) {
      this.creatureSpawnProbability = var1;
      this.spawners = var2;
      this.spawnCosts = var3;
      this.validSpawnBiomeForPlayer = var4;
   }

   public List<Spawners> getSpawners(EntityClassification var1) {
      return this.spawners.getOrDefault(var1, ImmutableList.of());
   }

   @Nullable
   public SpawnCosts getSpawnCost(EntityType<?> var1) {
      return this.spawnCosts.get(var1);
   }

   public float getCreatureSpawnProbability() {
      return this.creatureSpawnProbability;
   }

   public boolean isValidSpawnBiomeForPlayer() {
      return this.validSpawnBiomeForPlayer;
   }

   public static class SpawnCosts {
      public static final Codec<SpawnCosts> field33334 = RecordCodecBuilder.create(
         var0 -> var0.group(
                  Codec.DOUBLE.fieldOf("energy_budget").forGetter(var0x -> var0x.field33335), Codec.DOUBLE.fieldOf("charge").forGetter(var0x -> var0x.field33336)
               )
               .apply(var0, SpawnCosts::new)
      );
      private final double field33335;
      private final double field33336;

      public SpawnCosts(double var1, double var3) {
         this.field33335 = var1;
         this.field33336 = var3;
      }

      public double method25732() {
         return this.field33335;
      }

      public double method25733() {
         return this.field33336;
      }
   }

   public static class Spawners extends Class6691 {
      public static final Codec<Spawners> field29310 = RecordCodecBuilder.create(
         var0 -> var0.group(
                  Registry.ENTITY_TYPE.fieldOf("type").forGetter(var0x -> var0x.field29311),
                  Codec.INT.fieldOf("weight").forGetter(var0x -> var0x.field29309),
                  Codec.INT.fieldOf("minCount").forGetter(var0x -> var0x.field29312),
                  Codec.INT.fieldOf("maxCount").forGetter(var0x -> var0x.field29313)
               )
               .apply(var0, Spawners::new)
      );
      public final EntityType<?> field29311;
      public final int field29312;
      public final int field29313;

      public Spawners(EntityType<?> var1, int var2, int var3, int var4) {
         super(var2);
         this.field29311 = var1.method33209() != EntityClassification.MISC ? var1 : EntityType.PIG;
         this.field29312 = var3;
         this.field29313 = var4;
      }

      @Override
      public String toString() {
         return EntityType.method33198(this.field29311) + "*(" + this.field29312 + "-" + this.field29313 + "):" + this.field29309;
      }
   }
}
