package mapped;

import java.util.List;

public class FollowParentGoal extends Class2595 {
   private static String[] field17332;
   private final AnimalEntity field17333;
   private AnimalEntity field17334;
   private final double field17335;
   private int field17336;

   public FollowParentGoal(AnimalEntity var1, double var2) {
      this.field17333 = var1;
      this.field17335 = var2;
   }

   @Override
   public boolean method10803() {
      if (this.field17333.method4767() < 0) {
         List<? extends AnimalEntity> var3 = this.field17333.world.getEntitiesWithinAABB(this.field17333.getClass(), this.field17333.getBoundingBox().grow(8.0, 4.0, 8.0));
         AnimalEntity var4 = null;
         double var5 = Double.MAX_VALUE;

         for (AnimalEntity var8 : var3) {
            if (var8.method4767() >= 0) {
               double var9 = this.field17333.getDistanceSq(var8);
               if (!(var9 > var5)) {
                  var5 = var9;
                  var4 = var8;
               }
            }
         }

         if (var4 == null) {
            return false;
         } else if (!(var5 < 9.0)) {
            this.field17334 = var4;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      if (this.field17333.method4767() < 0) {
         if (!this.field17334.isAlive()) {
            return false;
         } else {
            double var3 = this.field17333.getDistanceSq(this.field17334);
            return !(var3 < 9.0) && !(var3 > 256.0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void startExecuting() {
      this.field17336 = 0;
   }

   @Override
   public void method10807() {
      this.field17334 = null;
   }

   @Override
   public void method10805() {
      if (--this.field17336 <= 0) {
         this.field17336 = 10;
         this.field17333.method4230().method21655(this.field17334, this.field17335);
      }
   }
}
