package mapped;

import java.util.EnumSet;
import java.util.Random;

public class Class2608 extends Class2595 {
   private static String[] field16859;
   private final Class1046 field16860;
   private final int field16861;
   private BlockPos field16862;

   public Class2608(Class1046 var1, int var2) {
      this.field16860 = var1;
      this.field16861 = var2;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      if (!this.field16860.method3329()) {
         if (!this.field16860.field5024.method6740()) {
            if (this.field16860.method3013().nextInt(this.field16861) == 0) {
               ServerWorld var3 = (ServerWorld)this.field16860.field5024;
               BlockPos var4 = this.field16860.method3432();
               if (var3.method6954(var4, 6)) {
                  Vector3d var5 = Class8037.method27584(this.field16860, 15, 7, var1 -> (double)(-var3.method6955(Class2002.method8390(var1))));
                  this.field16862 = var5 != null ? new BlockPos(var5) : null;
                  return this.field16862 != null;
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      return this.field16862 != null && !this.field16860.method4230().method21664() && this.field16860.method4230().method21643().equals(this.field16862);
   }

   @Override
   public void method10805() {
      if (this.field16862 != null) {
         Class6990 var3 = this.field16860.method4230();
         if (var3.method21664() && !this.field16862.method8317(this.field16860.getPositionVec(), 10.0)) {
            Vector3d var4 = Vector3d.method11330(this.field16862);
            Vector3d var5 = this.field16860.getPositionVec();
            Vector3d var6 = var5.method11336(var4);
            var4 = var6.method11344(0.4).method11338(var4);
            Vector3d var7 = var4.method11336(var5).method11333().method11344(10.0).method11338(var5);
            BlockPos var8 = new BlockPos(var7);
            var8 = this.field16860.field5024.method7006(Class101.field300, var8);
            if (!var3.method21654((double)var8.method8304(), (double)var8.getY(), (double)var8.method8306(), 1.0)) {
               this.method10814();
            }
         }
      }
   }

   private void method10814() {
      Random var3 = this.field16860.method3013();
      BlockPos var4 = this.field16860
         .field5024
         .method7006(Class101.field300, this.field16860.method3432().method8336(-8 + var3.nextInt(16), 0, -8 + var3.nextInt(16)));
      this.field16860.method4230().method21654((double)var4.method8304(), (double)var4.getY(), (double)var4.method8306(), 1.0);
   }
}