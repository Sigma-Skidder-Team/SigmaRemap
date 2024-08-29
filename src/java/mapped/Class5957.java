package mapped;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Class5957<T extends Class956> extends Class5942<T> {
   public static final ResourceLocation field25978 = new ResourceLocation("textures/environment/end_sky.png");
   public static final ResourceLocation field25979 = new ResourceLocation("textures/entity/end_portal.png");
   private static final Random field25980 = new Random(31100L);
   private static final List<RenderType> field25981 = IntStream.range(0, 16)
      .<RenderType>mapToObj(var0 -> RenderType.method14344(var0 + 1))
      .collect(ImmutableList.toImmutableList());

   public Class5957(TileEntityRendererDispatcher var1) {
      super(var1);
   }

   public void method18462(T var1, float var2, MatrixStack var3, Class7733 var4, int var5, int var6) {
      if (!Class7944.method26921() || !Class5463.method17174(var1, var2, this.method18490(), var3, var4, var5, var6)) {
         field25980.setSeed(31100L);
         double var9 = var1.getPos().method8319(this.field25928.field34748.method37504(), true);
         int var11 = this.method18489(var9);
         float var12 = this.method18490();
         Class9367 var13 = var3.method35296().method32361();
         this.method18487((T)var1, var12, 0.15F, var13, var4.method25597(field25981.get(0)));

         for (int var14 = 1; var14 < var11; var14++) {
            this.method18487((T)var1, var12, 2.0F / (float)(18 - var14), var13, var4.method25597(field25981.get(var14)));
         }
      }
   }

   private void method18487(T var1, float var2, float var3, Class9367 var4, Class5422 var5) {
      float var8 = (field25980.nextFloat() * 0.5F + 0.1F) * var3;
      float var9 = (field25980.nextFloat() * 0.5F + 0.4F) * var3;
      float var10 = (field25980.nextFloat() * 0.5F + 0.5F) * var3;
      this.method18488((T)var1, var4, var5, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, var8, var9, var10, Direction.SOUTH);
      this.method18488((T)var1, var4, var5, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, var8, var9, var10, Direction.NORTH);
      this.method18488((T)var1, var4, var5, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, var8, var9, var10, Direction.EAST);
      this.method18488((T)var1, var4, var5, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, var8, var9, var10, Direction.WEST);
      this.method18488((T)var1, var4, var5, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var8, var9, var10, Direction.DOWN);
      this.method18488((T)var1, var4, var5, 0.0F, 1.0F, var2, var2, 1.0F, 1.0F, 0.0F, 0.0F, var8, var9, var10, Direction.field673);
   }

   private void method18488(
      T var1,
      Class9367 var2,
      Class5422 var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      Direction var15
   ) {
      if (var1.method3870(var15)) {
         var3.method17040(var2, var4, var6, var8).method17033(var12, var13, var14, 1.0F).endVertex();
         var3.method17040(var2, var5, var6, var9).method17033(var12, var13, var14, 1.0F).endVertex();
         var3.method17040(var2, var5, var7, var10).method17033(var12, var13, var14, 1.0F).endVertex();
         var3.method17040(var2, var4, var7, var11).method17033(var12, var13, var14, 1.0F).endVertex();
      }
   }

   public int method18489(double var1) {
      if (!(var1 > 36864.0)) {
         if (!(var1 > 25600.0)) {
            if (!(var1 > 16384.0)) {
               if (!(var1 > 9216.0)) {
                  if (!(var1 > 4096.0)) {
                     if (!(var1 > 1024.0)) {
                        if (!(var1 > 576.0)) {
                           return !(var1 > 256.0) ? 15 : 14;
                        } else {
                           return 13;
                        }
                     } else {
                        return 11;
                     }
                  } else {
                     return 9;
                  }
               } else {
                  return 7;
               }
            } else {
               return 5;
            }
         } else {
            return 3;
         }
      } else {
         return 1;
      }
   }

   public float method18490() {
      return 0.75F;
   }
}
