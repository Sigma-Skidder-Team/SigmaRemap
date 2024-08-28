package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class Class5687<T extends Class1066> extends Class5685<T, Class2857<T>> {
   private static final Map<Class8992<?>, ResourceLocation> field25054 = Maps.newHashMap(
      ImmutableMap.of(
         Class8992.field41019, new ResourceLocation("textures/entity/horse/donkey.png"), Class8992.field41057, new ResourceLocation("textures/entity/horse/mule.png")
      )
   );

   public Class5687(Class8853 var1, float var2) {
      super(var1, new Class2857<T>(0.0F), var2);
   }

   public ResourceLocation method17843(T var1) {
      return field25054.get(var1.method3204());
   }
}
