package mapped;

import java.util.Optional;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public class Class7019 implements Class7016 {
   private static String[] field30321;
   private final Random field30322 = new Random();
   private final Class6608 field30323;
   private int field30324;
   private int field30325;
   private int field30326;

   public Class7019(Class6608 var1) {
      this.field30323 = var1;
      this.field30324 = 1200;
      this.field30325 = var1.method20062();
      this.field30326 = var1.method20064();
      if (this.field30325 == 0 && this.field30326 == 0) {
         this.field30325 = 24000;
         var1.method20063(this.field30325);
         this.field30326 = 25;
         var1.method20065(this.field30326);
      }
   }

   @Override
   public int method21742(ServerWorld var1, boolean var2, boolean var3) {
      if (var1.method6789().method17135(Class5462.field24253)) {
         if (--this.field30324 <= 0) {
            this.field30324 = 1200;
            this.field30325 -= 1200;
            this.field30323.method20063(this.field30325);
            if (this.field30325 <= 0) {
               this.field30325 = 24000;
               if (var1.method6789().method17135(Class5462.field24226)) {
                  int var6 = this.field30326;
                  this.field30326 = MathHelper.method37775(this.field30326 + 25, 25, 75);
                  this.field30323.method20065(this.field30326);
                  if (this.field30322.nextInt(100) <= var6) {
                     if (!this.method21750(var1)) {
                        return 0;
                     } else {
                        this.field30326 = 25;
                        return 1;
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
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   private boolean method21750(ServerWorld var1) {
      ServerPlayerEntity var4 = var1.method6915();
      if (var4 != null) {
         if (this.field30322.nextInt(10) != 0) {
            return false;
         } else {
            BlockPos var5 = var4.method3432();
            byte var6 = 48;
            Class1653 var7 = var1.method6951();
            Optional<BlockPos> var8 = var7.method6670(Class4913.field22767.method15182(), var0 -> true, var5, 48, Class2093.field13637);
            BlockPos var9 = var8.orElse(var5);
            BlockPos var10 = this.method21752(var1, var9, 48);
            if (var10 != null && this.method21753(var1, var10)) {
               if (var1.method7178(var10).equals(Optional.<Class8705<Class8907>>of(Class9495.field44172))) {
                  return false;
               }

               Class1044 var11 = Class8992.field41100
                  .method33201(var1, (Class39)null, (ITextComponent)null, (PlayerEntity)null, var10, Class2202.field14398, false, false);
               if (var11 != null) {
                  for (int var12 = 0; var12 < 2; var12++) {
                     this.method21751(var1, var11, 4);
                  }

                  this.field30323.method20066(var11.getUniqueID());
                  var11.method4755(48000);
                  var11.method4758(var9);
                  var11.method4288(var9, 16);
                  return true;
               }
            }

            return false;
         }
      } else {
         return true;
      }
   }

   private void method21751(ServerWorld var1, Class1044 var2, int var3) {
      BlockPos var6 = this.method21752(var1, var2.method3432(), var3);
      if (var6 != null) {
         Class1065 var7 = Class8992.field41094.method33201(var1, (Class39)null, (ITextComponent)null, (PlayerEntity)null, var6, Class2202.field14398, false, false);
         if (var7 != null) {
            var7.method4298(var2, true);
         }
      }
   }

   @Nullable
   private BlockPos method21752(Class1662 var1, BlockPos var2, int var3) {
      BlockPos var6 = null;

      for (int var7 = 0; var7 < 10; var7++) {
         int var8 = var2.method8304() + this.field30322.nextInt(var3 * 2) - var3;
         int var9 = var2.method8306() + this.field30322.nextInt(var3 * 2) - var3;
         int var10 = var1.method6736(Class101.field296, var8, var9);
         BlockPos var11 = new BlockPos(var8, var10, var9);
         if (Class8170.method28429(Class2068.field13472, var1, var11, Class8992.field41100)) {
            var6 = var11;
            break;
         }
      }

      return var6;
   }

   private boolean method21753(Class1665 var1, BlockPos var2) {
      for (BlockPos var6 : BlockPos.method8359(var2, var2.method8336(1, 2, 1))) {
         if (!var1.method6738(var6).method23414(var1, var6).method19516()) {
            return false;
         }
      }

      return true;
   }
}