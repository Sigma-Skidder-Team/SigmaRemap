package mapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;

import java.util.Map;

public class Class251 extends LayerRenderer<IronGolemEntity, Class2880<IronGolemEntity>> {
   private static final Map<Class2286, ResourceLocation> field908 = ImmutableMap.of(
      Class2286.field15132,
      new ResourceLocation("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      Class2286.field15133,
      new ResourceLocation("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      Class2286.field15134,
      new ResourceLocation("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public Class251(Class5714<IronGolemEntity, Class2880<IronGolemEntity>> var1) {
      super(var1);
   }

   public void render(MatrixStack var1, IRenderTypeBuffer var2, int var3, IronGolemEntity var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var4.isInvisible()) {
         Class2286 var13 = var4.method4865();
         if (var13 != Class2286.field15131) {
            ResourceLocation var14 = field908.get(var13);
            method824(this.method825(), var14, var1, var2, var3, var4, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
