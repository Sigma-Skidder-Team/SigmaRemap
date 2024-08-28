package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class Class5686 extends Class5685<Class1068, Class2856<Class1068>> {
   private static final Map<Class8992<?>, ResourceLocation> field25053 = Maps.newHashMap(
      ImmutableMap.of(
         Class8992.field41108,
         new ResourceLocation("textures/entity/horse/horse_zombie.png"),
         Class8992.field41079,
         new ResourceLocation("textures/entity/horse/horse_skeleton.png")
      )
   );

   public Class5686(Class8853 var1) {
      super(var1, new Class2856<Class1068>(0.0F), 1.0F);
   }

   public ResourceLocation method17843(Class1068 var1) {
      return field25053.get(var1.method3204());
   }
}
