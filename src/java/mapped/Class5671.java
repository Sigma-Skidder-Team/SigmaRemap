package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;

import java.util.Map;

public class Class5671 extends Class5661<MobEntity, Class2895<MobEntity>> {
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
      this.addLayer(new BipedArmorLayer(this, new BipedModel(0.5F), new BipedModel(1.02F)));
   }

   private static Class2895<MobEntity> method17863(boolean var0) {
      Class2895 var3 = new Class2895(0.0F, 64, 64);
      if (var0) {
         var3.field17929.showModel = false;
      }

      return var3;
   }

   @Override
   public ResourceLocation method17843(MobEntity var1) {
      ResourceLocation var4 = field25036.get(var1.getType());
      if (var4 != null) {
         return var4;
      } else {
         throw new IllegalArgumentException("I don't know what texture to use for " + var1.getType());
      }
   }

   public boolean method17860(MobEntity var1) {
      return var1 instanceof Class1035 && ((Class1035)var1).method4634();
   }
}
