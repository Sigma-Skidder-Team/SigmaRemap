package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class Class5686 extends Class5685<AbstractHorseEntity, Class2856<AbstractHorseEntity>> {
   private static final Map<EntityType<?>, ResourceLocation> field25053 = Maps.newHashMap(
      ImmutableMap.of(
         EntityType.field41108,
         new ResourceLocation("textures/entity/horse/horse_zombie.png"),
         EntityType.field41079,
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
