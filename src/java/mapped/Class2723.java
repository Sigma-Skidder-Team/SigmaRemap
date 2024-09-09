package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;

import java.util.EnumSet;
import java.util.List;
import java.util.Random;

public class Class2723<T extends Class1028> extends Class2595 {
   private static String[] field17211;
   private final T field17212;
   private final double field17213;
   private final double field17214;
   private long field17215;

   public Class2723(T var1, double var2, double var4) {
      this.field17212 = (T)var1;
      this.field17213 = var2;
      this.field17214 = var4;
      this.field17215 = -1L;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      boolean var3 = this.field17212.world.getGameTime() < this.field17215;
      return this.field17212.method4579() && this.field17212.method4232() == null && !this.field17212.isBeingRidden() && this.field17212.method4575() && !var3;
   }

   @Override
   public void method10804() {
   }

   @Override
   public void method10807() {
   }

   @Override
   public void method10805() {
      boolean var3 = this.field17212.method4577();
      Class6990 var4 = this.field17212.method4230();
      if (var4.method21664()) {
         List<Class1028> var5 = this.method10931();
         if (this.field17212.method4579() && var5.isEmpty()) {
            this.field17212.method4580(false);
         } else if (var3 && this.field17212.method4574().method8317(this.field17212.getPositionVec(), 10.0)) {
            this.field17212.method4578();
         } else {
            Vector3d var6 = Vector3d.method11330(this.field17212.method4574());
            Vector3d var7 = this.field17212.getPositionVec();
            Vector3d var8 = var7.method11336(var6);
            var6 = var8.method11351(90.0F).scale(0.4).add(var6);
            Vector3d var9 = var6.method11336(var7).method11333().scale(10.0).add(var7);
            BlockPos var10 = new BlockPos(var9);
            var10 = this.field17212.world.method7006(Class101.field300, var10);
            if (var4.method21654((double)var10.getX(), (double)var10.getY(), (double)var10.getZ(), !var3 ? this.field17213 : this.field17214)
               )
             {
               if (var3) {
                  for (Class1028 var12 : var5) {
                     var12.method4573(var10);
                  }
               }
            } else {
               this.method10932();
               this.field17215 = this.field17212.world.getGameTime() + 200L;
            }
         }
      }
   }

   private List<Class1028> method10931() {
      return this.field17212
         .world
         .<Class1028>method6772(Class1028.class, this.field17212.getBoundingBox().method19664(16.0), var1 -> var1.method4549() && !var1.isEntityEqual(this.field17212));
   }

   private boolean method10932() {
      Random var3 = this.field17212.getRNG();
      BlockPos var4 = this.field17212
         .world
         .method7006(Class101.field300, this.field17212.getPosition().method8336(-8 + var3.nextInt(16), 0, -8 + var3.nextInt(16)));
      return this.field17212.method4230().method21654((double)var4.getX(), (double)var4.getY(), (double)var4.getZ(), this.field17213);
   }
}
