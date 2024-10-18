package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.MobSpawnInfo;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class Class9328 {
   private static String[] field43287;
   private final Map<EntityClassification, List<MobSpawnInfo.Spawners>> field43288 = Stream.<EntityClassification>of(EntityClassification.values())
      .collect(ImmutableMap.toImmutableMap(var0 -> var0, var0 -> Lists.newArrayList()));
   private final Map<EntityType<?>, MobSpawnInfo.SpawnCosts> field43289 = Maps.newLinkedHashMap();
   private float field43290 = 0.1F;
   private boolean field43291;

   public Class9328 method35249(EntityClassification var1, MobSpawnInfo.Spawners var2) {
      this.field43288.get(var1).add(var2);
      return this;
   }

   public Class9328 method35250(EntityType<?> var1, double var2, double var4) {
      this.field43289.put(var1, new MobSpawnInfo.SpawnCosts(var4, var2));
      return this;
   }

   public Class9328 method35251(float var1) {
      this.field43290 = var1;
      return this;
   }

   public Class9328 method35252() {
      this.field43291 = true;
      return this;
   }

   public MobSpawnInfo method35253() {
      return new MobSpawnInfo(
         this.field43290,
         this.field43288.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> ImmutableList.copyOf((Collection)var0.getValue()))),
         ImmutableMap.copyOf(this.field43289),
         this.field43291
      );
   }
}
