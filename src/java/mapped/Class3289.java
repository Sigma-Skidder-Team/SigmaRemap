package mapped;

import java.util.Random;
import net.minecraft.util.text.ITextComponent;

public class Class3289 extends Class3257 {
   private static String[] field18800;

   public Class3289(Class5643 var1) {
      super(var1);
   }

   @Override
   public Class2274 method11707(Class5911 var1) {
      Direction var4 = var1.method18354();
      if (var4 != Direction.field672) {
         Class1655 var5 = var1.method18360();
         Class5909 var6 = new Class5909(var1);
         BlockPos var7 = var6.method18345();
         Class8848 var8 = var1.method18357();
         Vector3d var9 = Vector3d.method11330(var7);
         Class6488 var10 = Class8992.field41006.method33221().method32098(var9.method11320(), var9.method11321(), var9.method11322());
         if (var5.method7054((Entity)null, var10, var0 -> true) && var5.method7181((Entity)null, var10).isEmpty()) {
            if (var5 instanceof Class1657) {
               Class1657 var11 = (Class1657)var5;
               Class1005 var12 = Class8992.field41006
                  .method33202(var11, var8.method32142(), (ITextComponent)null, var1.method18358(), var7, Class2202.field14403, true, true);
               if (var12 == null) {
                  return Class2274.field14821;
               }

               var11.method6995(var12);
               float var13 = (float)Class9679.method37767((Class9679.method37792(var1.method18352() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               var12.method3273(var12.getPosX(), var12.getPosY(), var12.getPosZ(), var13, 0.0F);
               this.method11828(var12, var5.field9016);
               var5.method6916(var12);
               var5.method6743(
                  (PlayerEntity)null, var12.getPosX(), var12.getPosY(), var12.getPosZ(), Class6067.field26360, Class2266.field14732, 0.75F, 0.8F
               );
            }

            var8.method32182(1);
            return Class2274.method9002(var5.field9020);
         } else {
            return Class2274.field14821;
         }
      } else {
         return Class2274.field14821;
      }
   }

   private void method11828(Class1005 var1, Random var2) {
      Class7087 var5 = var1.method4211();
      float var6 = var2.nextFloat() * 5.0F;
      float var7 = var2.nextFloat() * 20.0F - 10.0F;
      Class7087 var8 = new Class7087(var5.method22013() + var6, var5.method22014() + var7, var5.method22015());
      var1.method4205(var8);
      var5 = var1.method4212();
      var6 = var2.nextFloat() * 10.0F - 5.0F;
      var8 = new Class7087(var5.method22013(), var5.method22014() + var6, var5.method22015());
      var1.method4206(var8);
   }
}
