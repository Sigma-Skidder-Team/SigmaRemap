package mapped;

import com.google.common.collect.Maps;
import net.minecraft.client.util.Util;
import net.minecraft.util.ResourceLocation;

import java.util.Map;

public final class Class5688 extends Class5685<Class1074, Class2856<Class1074>> {
   private static final Map<Class2190, ResourceLocation> field25055 = Util.<Map<Class2190, ResourceLocation>>make(Maps.newEnumMap(Class2190.class), var0 -> {
      var0.put(Class2190.field14317, new ResourceLocation("textures/entity/horse/horse_white.png"));
      var0.put(Class2190.field14318, new ResourceLocation("textures/entity/horse/horse_creamy.png"));
      var0.put(Class2190.field14319, new ResourceLocation("textures/entity/horse/horse_chestnut.png"));
      var0.put(Class2190.field14320, new ResourceLocation("textures/entity/horse/horse_brown.png"));
      var0.put(Class2190.field14321, new ResourceLocation("textures/entity/horse/horse_black.png"));
      var0.put(Class2190.field14322, new ResourceLocation("textures/entity/horse/horse_gray.png"));
      var0.put(Class2190.field14323, new ResourceLocation("textures/entity/horse/horse_darkbrown.png"));
   });

   public Class5688(EntityRendererManager var1) {
      super(var1, new Class2856<Class1074>(0.0F), 1.1F);
      this.method17880(new Class248(this));
      this.method17880(new Class258(this));
   }

   public ResourceLocation method17843(Class1074 var1) {
      return field25055.get(var1.method4995());
   }
}
