package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class Class5671 extends Class5661<Class1006, Class2895<Class1006>> {
   private static final Map<EntityType<?>, ResourceLocation> field25036 = ImmutableMap.of(
      EntityType.field41065,
      new ResourceLocation("textures/entity/piglin/piglin.png"),
      EntityType.field41110,
      new ResourceLocation("textures/entity/piglin/zombified_piglin.png"),
      EntityType.field41066,
      new ResourceLocation("textures/entity/piglin/piglin_brute.png")
   );

   public Class5671(EntityRendererManager var1, boolean var2) {
      super(var1, method17863(var2), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.method17880(new Class255(this, new Class2797(0.5F), new Class2797(1.02F)));
   }

   private static Class2895<Class1006> method17863(boolean var0) {
      Class2895 var3 = new Class2895(0.0F, 64, 64);
      if (var0) {
         var3.field17929.field31039 = false;
      }

      return var3;
   }

   @Override
   public ResourceLocation method17843(Class1006 var1) {
      ResourceLocation var4 = field25036.get(var1.getType());
      if (var4 != null) {
         return var4;
      } else {
         throw new IllegalArgumentException("I don't know what texture to use for " + var1.getType());
      }
   }

   public boolean method17860(Class1006 var1) {
      return var1 instanceof Class1035 && ((Class1035)var1).method4634();
   }
}
