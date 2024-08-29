package mapped;

import com.google.common.collect.Maps;
import net.minecraft.client.util.Util;

import java.util.Map;

public class Class248 extends Class219<Class1074, Class2856<Class1074>> {
   private static final Map<Class2102, ResourceLocation> field904 = Util.<Map<Class2102, ResourceLocation>>make(Maps.newEnumMap(Class2102.class), var0 -> {
      var0.put(Class2102.field13698, (ResourceLocation)null);
      var0.put(Class2102.field13699, new ResourceLocation("textures/entity/horse/horse_markings_white.png"));
      var0.put(Class2102.field13700, new ResourceLocation("textures/entity/horse/horse_markings_whitefield.png"));
      var0.put(Class2102.field13701, new ResourceLocation("textures/entity/horse/horse_markings_whitedots.png"));
      var0.put(Class2102.field13702, new ResourceLocation("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public Class248(Class5714<Class1074, Class2856<Class1074>> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, Class1074 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      ResourceLocation var13 = field904.get(var4.method4996());
      if (var13 != null && !var4.method3342()) {
         Class5422 var14 = var2.method25597(RenderType.method14318(var13));
         this.method825().method11016(var1, var14, var3, Class5712.method17883(var4, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
