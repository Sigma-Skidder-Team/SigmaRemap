package mapped;

import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;

public class Class2611 extends Class2595 {
   private final Class1006 field16871;
   private final Predicate<Class1006> field16872;
   private Class1006 field16873;
   private final double field16874;
   private final Class6990 field16875;
   private int field16876;
   private final float field16877;
   private float field16878;
   private final float field16879;

   public Class2611(Class1006 var1, double var2, float var4, float var5) {
      this.field16871 = var1;
      this.field16872 = var1x -> var1x != null && var1.getClass() != var1x.getClass();
      this.field16874 = var2;
      this.field16875 = var1.method4230();
      this.field16877 = var4;
      this.field16879 = var5;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
      if (!(var1.method4230() instanceof Class6991) && !(var1.method4230() instanceof Class6995)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public boolean method10803() {
      List<Class1006> var3 = this.field16871
         .world
         .method6772(Class1006.class, this.field16871.getBoundingBox().method19664((double)this.field16879), this.field16872);
      if (!var3.isEmpty()) {
         for (Class1006 var5 : var3) {
            if (!var5.method3342()) {
               this.field16873 = var5;
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean method10806() {
      return this.field16873 != null
         && !this.field16875.method21664()
         && this.field16871.getDistanceSq(this.field16873) > (double)(this.field16877 * this.field16877);
   }

   @Override
   public void method10804() {
      this.field16876 = 0;
      this.field16878 = this.field16871.method4223(Class2163.field14191);
      this.field16871.method4224(Class2163.field14191, 0.0F);
   }

   @Override
   public void method10807() {
      this.field16873 = null;
      this.field16875.method21666();
      this.field16871.method4224(Class2163.field14191, this.field16878);
   }

   @Override
   public void method10805() {
      if (this.field16873 != null && !this.field16871.method4296()) {
         this.field16871.method4227().method28040(this.field16873, 10.0F, (float)this.field16871.method4259());
         if (--this.field16876 <= 0) {
            this.field16876 = 10;
            double var3 = this.field16871.getPosX() - this.field16873.getPosX();
            double var5 = this.field16871.getPosY() - this.field16873.getPosY();
            double var7 = this.field16871.getPosZ() - this.field16873.getPosZ();
            double var9 = var3 * var3 + var5 * var5 + var7 * var7;
            if (var9 <= (double)(this.field16877 * this.field16877)) {
               this.field16875.method21666();
               Class8092 var11 = this.field16873.method4227();
               if (var9 <= (double)this.field16877
                  || var11.method28044() == this.field16871.getPosX()
                     && var11.method28045() == this.field16871.getPosY()
                     && var11.method28046() == this.field16871.getPosZ()) {
                  double var12 = this.field16873.getPosX() - this.field16871.getPosX();
                  double var14 = this.field16873.getPosZ() - this.field16871.getPosZ();
                  this.field16875
                     .method21654(this.field16871.getPosX() - var12, this.field16871.getPosY(), this.field16871.getPosZ() - var14, this.field16874);
               }
            } else {
               this.field16875.method21655(this.field16873, this.field16874);
            }
         }
      }
   }
}
