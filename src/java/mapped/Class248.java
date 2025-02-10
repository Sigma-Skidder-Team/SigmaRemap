package mapped;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.Util;
import net.minecraft.util.ResourceLocation;

import java.util.Map;

public class Class248 extends LayerRenderer<HorseEntity, Class2856<HorseEntity>> {
   private static final Map<Class2102, ResourceLocation> field904 = Util.<Map<Class2102, ResourceLocation>>make(Maps.newEnumMap(Class2102.class), var0 -> {
      var0.put(Class2102.field13698, (ResourceLocation)null);
      var0.put(Class2102.field13699, new ResourceLocation("textures/entity/horse/horse_markings_white.png"));
      var0.put(Class2102.field13700, new ResourceLocation("textures/entity/horse/horse_markings_whitefield.png"));
      var0.put(Class2102.field13701, new ResourceLocation("textures/entity/horse/horse_markings_whitedots.png"));
      var0.put(Class2102.field13702, new ResourceLocation("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public Class248(Class5714<HorseEntity, Class2856<HorseEntity>> var1) {
      super(var1);
   }

   public void render(MatrixStack var1, IRenderTypeBuffer var2, int var3, HorseEntity var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      ResourceLocation var13 = field904.get(var4.method4996());
      if (var13 != null && !var4.isInvisible()) {
         IVertexBuilder var14 = var2.getBuffer(RenderType.getEntityTranslucent(var13));
         this.method825().render(var1, var14, var3, LivingRenderer.method17883(var4, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
