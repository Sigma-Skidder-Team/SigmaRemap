package mapped;

import java.util.List;
import java.util.Random;

public class Class7017 implements Class7016 {
   private static String[] field30317;
   private int field30318;

   @Override
   public int method21742(ServerWorld var1, boolean var2, boolean var3) {
      if (var3 && var1.method6789().method17135(Class5462.field24226)) {
         this.field30318--;
         if (this.field30318 <= 0) {
            this.field30318 = 1200;
            ServerPlayerEntity var6 = var1.method6915();
            if (var6 != null) {
               Random var7 = var1.field9016;
               int var8 = (8 + var7.nextInt(24)) * (!var7.nextBoolean() ? 1 : -1);
               int var9 = (8 + var7.nextInt(24)) * (!var7.nextBoolean() ? 1 : -1);
               BlockPos var10 = var6.method3432().method8336(var8, 0, var9);
               if (var1.method7019(
                  var10.method8304() - 10,
                  var10.getY() - 10,
                  var10.method8306() - 10,
                  var10.method8304() + 10,
                  var10.getY() + 10,
                  var10.method8306() + 10
               )) {
                  if (Class8170.method28429(Class2068.field13472, var1, var10, Class8992.field41012)) {
                     if (var1.method6954(var10, 2)) {
                        return this.method21746(var1, var10);
                     }

                     if (var1.method6893().method24345(var10, true, Class2961.field18066).method17117()) {
                        return this.method21747(var1, var10);
                     }
                  }

                  return 0;
               } else {
                  return 0;
               }
            } else {
               return 0;
            }
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   private int method21746(ServerWorld var1, BlockPos var2) {
      byte var5 = 48;
      if (var1.method6951().method6663(Class4913.field22766.method15182(), var2, 48, Class2093.field13636) > 4L) {
         List var6 = var1.<Class1098>method7182(Class1098.class, new Class6488(var2).method19663(48.0, 8.0, 48.0));
         if (var6.size() < 5) {
            return this.method21748(var2, var1);
         }
      }

      return 0;
   }

   private int method21747(ServerWorld var1, BlockPos var2) {
      byte var5 = 16;
      List var6 = var1.<Class1098>method7182(Class1098.class, new Class6488(var2).method19663(16.0, 8.0, 16.0));
      return var6.size() >= 1 ? 0 : this.method21748(var2, var1);
   }

   private int method21748(BlockPos var1, ServerWorld var2) {
      Class1098 var5 = Class8992.field41012.method33215(var2);
      if (var5 != null) {
         var5.method4276(var2, var2.method6807(var1), Class2202.field14391, (Class5093)null, (Class39)null);
         var5.method3272(var1, 0.0F, 0.0F);
         var2.method6995(var5);
         return 1;
      } else {
         return 0;
      }
   }
}
