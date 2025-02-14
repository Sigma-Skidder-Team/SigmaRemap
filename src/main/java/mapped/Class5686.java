package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.horse.AbstractHorseEntity;
import net.minecraft.util.ResourceLocation;

import java.util.Map;

public class Class5686 extends Class5685<AbstractHorseEntity, Class2856<AbstractHorseEntity>> {
   private static final Map<EntityType<?>, ResourceLocation> field25053 = Maps.newHashMap(
      ImmutableMap.of(
         EntityType.ZOMBIE_HORSE,
         new ResourceLocation("textures/entity/horse/horse_zombie.png"),
         EntityType.SKELETON_HORSE,
         new ResourceLocation("textures/entity/horse/horse_skeleton.png")
      )
   );

   public Class5686(EntityRendererManager var1) {
      super(var1, new Class2856<AbstractHorseEntity>(0.0F), 1.0F);
   }

   public ResourceLocation method17843(AbstractHorseEntity var1) {
      return field25053.get(var1.getType());
   }
}
