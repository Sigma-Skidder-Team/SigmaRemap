package mapped;

import java.util.Random;

public class Class5945 extends Class5942<Class955> {
   private static String[] field25934;
   private final Class217 field25935 = Minecraft.getInstance().method1553();

   public Class5945(Class8086 var1) {
      super(var1);
   }

   public void method18462(Class955 var1, float var2, Class9332 var3, Class7733 var4, int var5, int var6) {
      Class1655 var9 = var1.method3734();
      if (var9 != null) {
         BlockPos var10 = var1.method3774().method8349(var1.method3860().method536());
         Class7380 var11 = var1.method3864();
         if (!var11.method23393()) {
            Class7551.method24692();
            var3.method35294();
            var3.method35291((double)var1.method3850(var2), (double)var1.method3851(var2), (double)var1.method3852(var2));
            if (var11.method23448(Blocks.PISTON_HEAD) && var1.method3849(var2) <= 4.0F) {
               var11 = var11.method23465(Class3436.field19212, Boolean.valueOf(var1.method3849(var2) <= 0.5F));
               this.method18467(var10, var11, var3, var4, var9, false, var6);
            } else if (var1.method3848() && !var1.method3846()) {
               Class180 var12 = !var11.method23448(Blocks.STICKY_PISTON) ? Class180.field638 : Class180.field639;
               Class7380 var13 = Blocks.PISTON_HEAD
                  .method11579()
                  .method23465(Class3436.field19211, var12)
                  .method23465(Class3436.field19198, var11.<Direction>method23463(Class3435.field19198));
               var13 = var13.method23465(Class3436.field19212, Boolean.valueOf(var1.method3849(var2) >= 0.5F));
               this.method18467(var10, var13, var3, var4, var9, false, var6);
               BlockPos var14 = var10.method8349(var1.method3860());
               var3.method35295();
               var3.method35294();
               var11 = var11.method23465(Class3435.field19202, Boolean.valueOf(true));
               this.method18467(var14, var11, var3, var4, var9, true, var6);
            } else {
               this.method18467(var10, var11, var3, var4, var9, false, var6);
            }

            var3.method35295();
            Class7551.method24693();
         }
      }
   }

   private void method18467(BlockPos var1, Class7380 var2, Class9332 var3, Class7733 var4, Class1655 var5, boolean var6, int var7) {
      Class4520 var10 = Class8928.method32631(var2);
      Class5422 var11 = var4.method25597(var10);
      this.field25935.method812().method24679(var5, this.field25935.method813(var2), var2, var1, var3, var11, var6, new Random(), var2.method23451(var1), var7);
   }
}
