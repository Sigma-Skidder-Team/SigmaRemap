package mapped;

import java.util.EnumSet;
import java.util.function.Predicate;

public class Class2770<T extends Class880> extends Class2595 {
   private static String[] field17348;
   public final Class1046 field17349;
   private final double field17350;
   private final double field17351;
   public T field17352;
   public final float field17353;
   public Class8238 field17354;
   public final Class6990 field17355;
   public final Class<T> field17356;
   public final Predicate<Class880> field17357;
   public final Predicate<Class880> field17358;
   private final Class8522 field17359;

   public Class2770(Class1046 var1, Class<T> var2, float var3, double var4, double var6) {
      this(var1, var2, var0 -> true, var3, var4, var6, Class8088.field34761::test);
   }

   public Class2770(Class1046 var1, Class<T> var2, Predicate<Class880> var3, float var4, double var5, double var7, Predicate<Class880> var9) {
      this.field17349 = var1;
      this.field17356 = var2;
      this.field17357 = var3;
      this.field17353 = var4;
      this.field17350 = var5;
      this.field17351 = var7;
      this.field17358 = var9;
      this.field17355 = var1.method4230();
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
      this.field17359 = new Class8522().method30203((double)var4).method30209(var9.and(var3));
   }

   public Class2770(Class1046 var1, Class<T> var2, float var3, double var4, double var6, Predicate<Class880> var8) {
      this(var1, var2, var0 -> true, var3, var4, var6, var8);
   }

   @Override
   public boolean method10803() {
      this.field17352 = this.field17349
         .world
         .<T>method7192(
            this.field17356,
            this.field17359,
            this.field17349,
            this.field17349.getPosX(),
            this.field17349.getPosY(),
            this.field17349.getPosZ(),
            this.field17349.getBoundingBox().method19663((double)this.field17353, 3.0, (double)this.field17353)
         );
      if (this.field17352 != null) {
         Vector3d var3 = Class8037.method27590(this.field17349, 16, 7, this.field17352.getPositionVec());
         if (var3 != null) {
            if (!(this.field17352.method3276(var3.field18048, var3.field18049, var3.field18050) < this.field17352.getDistanceSq(this.field17349))) {
               this.field17354 = this.field17355.method21648(var3.field18048, var3.field18049, var3.field18050, 0);
               return this.field17354 != null;
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
      return !this.field17355.method21664();
   }

   @Override
   public void method10804() {
      this.field17355.method21656(this.field17354, this.field17350);
   }

   @Override
   public void method10807() {
      this.field17352 = null;
   }

   @Override
   public void method10805() {
      if (!(this.field17349.getDistanceSq(this.field17352) < 49.0)) {
         this.field17349.method4230().method21645(this.field17350);
      } else {
         this.field17349.method4230().method21645(this.field17351);
      }
   }
}
