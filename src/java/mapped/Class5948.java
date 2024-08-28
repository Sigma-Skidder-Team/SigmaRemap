package mapped;

import com.mojang.datafixers.util.Pair;
import java.util.List;

public class Class5948 extends Class5942<Class958> {
   private static String[] field25940;
   private final Class7219 field25941 = method18477();
   private final Class7219 field25942 = new Class7219(64, 64, 44, 0);
   private final Class7219 field25943;

   public Class5948(Class8086 var1) {
      super(var1);
      this.field25942.method22675(-1.0F, -30.0F, -1.0F, 2.0F, 42.0F, 2.0F, 0.0F);
      this.field25943 = new Class7219(64, 64, 0, 42);
      this.field25943.method22675(-10.0F, -32.0F, -1.0F, 20.0F, 2.0F, 2.0F, 0.0F);
   }

   public static Class7219 method18477() {
      Class7219 var2 = new Class7219(64, 64, 0, 0);
      var2.method22675(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F, 0.0F);
      return var2;
   }

   public void method18462(Class958 var1, float var2, MatrixStack var3, Class7733 var4, int var5, int var6) {
      List var9 = var1.method3890();
      if (var9 != null) {
         float var10 = 0.6666667F;
         boolean var11 = var1.method3734() == null;
         var3.method35294();
         long var12;
         if (!var11) {
            var12 = var1.method3734().method6783();
            Class7380 var14 = var1.method3775();
            if (!(var14.method23383() instanceof Class3360)) {
               var3.method35291(0.5, -0.16666667F, 0.5);
               float var15 = -var14.<Direction>method23463(Class3361.field18910).method551();
               var3.method35293(Class7680.field32900.method25286(var15));
               var3.method35291(0.0, -0.3125, -0.4375);
               this.field25942.field31039 = false;
            } else {
               var3.method35291(0.5, 0.5, 0.5);
               float var18 = (float)(-var14.<Integer>method23463(Class3360.field18906) * 360) / 16.0F;
               var3.method35293(Class7680.field32900.method25286(var18));
               this.field25942.field31039 = true;
            }
         } else {
            var12 = 0L;
            var3.method35291(0.5, 0.5, 0.5);
            this.field25942.field31039 = true;
         }

         var3.method35294();
         var3.method35292(0.6666667F, -0.6666667F, -0.6666667F);
         Class5422 var17 = Class8968.field40513.method26200(var4, Class4520::method14309);
         this.field25942.method22680(var3, var17, var5, var6);
         this.field25943.method22680(var3, var17, var5, var6);
         BlockPos var19 = var1.method3774();
         float var16 = ((float)Math.floorMod((long)(var19.method8304() * 7 + var19.getY() * 9 + var19.method8306() * 13) + var12, 100L) + var2) / 100.0F;
         this.field25941.field31035 = (-0.0125F + 0.01F * MathHelper.method37764((float) (Math.PI * 2) * var16)) * (float) Math.PI;
         this.field25941.field31033 = -32.0F;
         method18478(var3, var4, var5, var6, this.field25941, Class8968.field40513, true, var9);
         var3.method35295();
         var3.method35295();
      }
   }

   public static void method18478(
           MatrixStack var0, Class7733 var1, int var2, int var3, Class7219 var4, Class7826 var5, boolean var6, List<Pair<Class2154, Class112>> var7
   ) {
      method18479(var0, var1, var2, var3, var4, var5, var6, var7, false);
   }

   public static void method18479(
           MatrixStack var0, Class7733 var1, int var2, int var3, Class7219 var4, Class7826 var5, boolean var6, List<Pair<Class2154, Class112>> var7, boolean var8
   ) {
      var4.method22680(var0, var5.method26201(var1, Class4520::method14309, var8), var2, var3);

      for (int var11 = 0; var11 < 17 && var11 < var7.size(); var11++) {
         Pair var12 = (Pair)var7.get(var11);
         float[] var13 = ((Class112)var12.getSecond()).method311();
         Class7826 var14 = new Class7826(!var6 ? Class8624.field38769 : Class8624.field38768, ((Class2154)var12.getFirst()).method8869(var6));
         var4.method22681(var0, var14.method26200(var1, Class4520::method14322), var2, var3, var13[0], var13[1], var13[2], 1.0F);
      }
   }
}
