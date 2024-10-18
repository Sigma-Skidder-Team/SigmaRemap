package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.MobSpawnInfo;

import java.util.List;

public class Class2974 extends Structure<Class4712> {
   private static final List<MobSpawnInfo.Spawners> field18087 = ImmutableList.of(new MobSpawnInfo.Spawners(EntityType.WITCH, 1, 1, 1));
   private static final List<MobSpawnInfo.Spawners> field18088 = ImmutableList.of(new MobSpawnInfo.Spawners(EntityType.CAT, 1, 1, 1));

   public Class2974(Codec<Class4712> var1) {
      super(var1);
   }

   @Override
   public Class7072<Class4712> method11359() {
      return Class5458::new;
   }

   @Override
   public List<MobSpawnInfo.Spawners> method11374() {
      return field18087;
   }

   @Override
   public List<MobSpawnInfo.Spawners> method11375() {
      return field18088;
   }
}
