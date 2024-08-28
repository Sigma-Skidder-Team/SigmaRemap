package mapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class Class5696 extends Class5651<Class1097, Class2867<Class1097>> {
   private static final Map<Class2293, ResourceLocation> field25066 = Util.<Map<Class2293, ResourceLocation>>method38508(Maps.newEnumMap(Class2293.class), var0 -> {
      var0.put(Class2293.field15234, new ResourceLocation("textures/entity/panda/panda.png"));
      var0.put(Class2293.field15235, new ResourceLocation("textures/entity/panda/lazy_panda.png"));
      var0.put(Class2293.field15236, new ResourceLocation("textures/entity/panda/worried_panda.png"));
      var0.put(Class2293.field15237, new ResourceLocation("textures/entity/panda/playful_panda.png"));
      var0.put(Class2293.field15238, new ResourceLocation("textures/entity/panda/brown_panda.png"));
      var0.put(Class2293.field15239, new ResourceLocation("textures/entity/panda/weak_panda.png"));
      var0.put(Class2293.field15240, new ResourceLocation("textures/entity/panda/aggressive_panda.png"));
   });

   public Class5696(Class8853 var1) {
      super(var1, new Class2867<Class1097>(9, 0.0F), 0.9F);
      this.method17880(new Class256(this));
   }

   public ResourceLocation method17843(Class1097 var1) {
      return field25066.getOrDefault(var1.method5209(), field25066.get(Class2293.field15234));
   }

   public void method17842(Class1097 var1, Class9332 var2, float var3, float var4, float var5) {
      super.method17842(var1, var2, var3, var4, var5);
      if (var1.field6026 > 0) {
         int var8 = var1.field6026;
         int var9 = var8 + 1;
         float var10 = 7.0F;
         float var11 = !var1.method3005() ? 0.8F : 0.3F;
         if (var8 >= 8) {
            if (var8 >= 16) {
               if (!((float)var8 < 24.0F)) {
                  if (var8 < 32) {
                     float var12 = ((float)var8 - 24.0F) / 7.0F;
                     float var13 = 270.0F + 90.0F * var12;
                     float var14 = 270.0F + 90.0F * ((float)var9 - 24.0F) / 7.0F;
                     float var15 = this.method17876(var13, var14, var9, var5, 32.0F);
                     var2.method35291(0.0, (double)(var11 * ((360.0F - var15) / 90.0F)), 0.0);
                     var2.method35293(Class7680.field32898.method25286(-var15));
                  }
               } else {
                  float var20 = ((float)var8 - 16.0F) / 7.0F;
                  float var23 = 180.0F + 90.0F * var20;
                  float var26 = 180.0F + 90.0F * ((float)var9 - 16.0F) / 7.0F;
                  float var29 = this.method17876(var23, var26, var9, var5, 24.0F);
                  var2.method35291(0.0, (double)(var11 + var11 * (270.0F - var29) / 90.0F), 0.0);
                  var2.method35293(Class7680.field32898.method25286(-var29));
               }
            } else {
               float var21 = ((float)var8 - 8.0F) / 7.0F;
               float var24 = 90.0F + 90.0F * var21;
               float var27 = 90.0F + 90.0F * ((float)var9 - 8.0F) / 7.0F;
               float var30 = this.method17876(var24, var27, var9, var5, 16.0F);
               var2.method35291(0.0, (double)(var11 + 0.2F + (var11 - 0.2F) * (var30 - 90.0F) / 90.0F), 0.0);
               var2.method35293(Class7680.field32898.method25286(-var30));
            }
         } else {
            float var22 = (float)(90 * var8) / 7.0F;
            float var25 = (float)(90 * var9) / 7.0F;
            float var28 = this.method17876(var22, var25, var9, var5, 8.0F);
            var2.method35291(0.0, (double)((var11 + 0.2F) * (var28 / 90.0F)), 0.0);
            var2.method35293(Class7680.field32898.method25286(-var28));
         }
      }

      float var16 = var1.method5220(var5);
      if (var16 > 0.0F) {
         var2.method35291(0.0, (double)(0.8F * var16), 0.0);
         var2.method35293(Class7680.field32898.method25286(MathHelper.method37821(var16, var1.field5032, var1.field5032 + 90.0F)));
         var2.method35291(0.0, (double)(-1.0F * var16), 0.0);
         if (var1.method5214()) {
            float var17 = (float)(Math.cos((double)var1.field5055 * 1.25) * Math.PI * 0.05F);
            var2.method35293(Class7680.field32900.method25286(var17));
            if (var1.method3005()) {
               var2.method35291(0.0, 0.8F, 0.55F);
            }
         }
      }

      float var18 = var1.method5221(var5);
      if (var18 > 0.0F) {
         float var19 = !var1.method3005() ? 1.3F : 0.5F;
         var2.method35291(0.0, (double)(var19 * var18), 0.0);
         var2.method35293(Class7680.field32898.method25286(MathHelper.method37821(var18, var1.field5032, var1.field5032 + 180.0F)));
      }
   }

   private float method17876(float var1, float var2, int var3, float var4, float var5) {
      return !((float)var3 < var5) ? var1 : MathHelper.method37821(var4, var1, var2);
   }
}
