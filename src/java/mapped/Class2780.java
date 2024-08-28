package mapped;

import java.util.EnumSet;
import java.util.List;

public class Class2780 extends Class2595 {
   private static String[] field17381;
   public final Class1064 field17382;
   private double field17383;
   private int field17384;

   public Class2780(Class1064 var1, double var2) {
      this.field17382 = var1;
      this.field17383 = var2;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      if (!this.field17382.method4296() && !this.field17382.method4914()) {
         List<Entity> var3 = this.field17382.field5024.method6770(this.field17382, this.field17382.method3389().method19663(9.0, 4.0, 9.0), var0 -> {
            Class8992 var3x = var0.method3204();
            return var3x == Class8992.field41047 || var3x == Class8992.field41094;
         });
         Class1064 var4 = null;
         double var5 = Double.MAX_VALUE;

         for (Entity var8 : var3) {
            Class1064 var9 = (Class1064)var8;
            if (var9.method4914() && !var9.method4913()) {
               double var10 = this.field17382.method3277(var9);
               if (!(var10 > var5)) {
                  var5 = var10;
                  var4 = var9;
               }
            }
         }

         if (var4 == null) {
            for (Entity var13 : var3) {
               Class1064 var14 = (Class1064)var13;
               if (var14.method4296() && !var14.method4913()) {
                  double var15 = this.field17382.method3277(var14);
                  if (!(var15 > var5)) {
                     var5 = var15;
                     var4 = var14;
                  }
               }
            }
         }

         if (var4 == null) {
            return false;
         } else if (var5 < 4.0) {
            return false;
         } else if (!var4.method4296() && !this.method10971(var4, 1)) {
            return false;
         } else {
            this.field17382.method4912(var4);
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      if (this.field17382.method4914() && this.field17382.method4915().method3066() && this.method10971(this.field17382, 0)) {
         double var3 = this.field17382.method3277(this.field17382.method4915());
         if (var3 > 676.0) {
            if (this.field17383 <= 3.0) {
               this.field17383 *= 1.2;
               this.field17384 = 40;
               return true;
            }

            if (this.field17384 == 0) {
               return false;
            }
         }

         if (this.field17384 > 0) {
            this.field17384--;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method10807() {
      this.field17382.method4911();
      this.field17383 = 2.1;
   }

   @Override
   public void method10805() {
      if (this.field17382.method4914() && !(this.field17382.method4297() instanceof Class996)) {
         Class1064 var3 = this.field17382.method4915();
         double var4 = (double)this.field17382.method3275(var3);
         float var6 = 2.0F;
         Vector3d var7 = new Vector3d(
               var3.getPosX() - this.field17382.getPosX(),
               var3.getPosY() - this.field17382.getPosY(),
               var3.getPosZ() - this.field17382.getPosZ()
            )
            .method11333()
            .method11344(Math.max(var4 - 2.0, 0.0));
         this.field17382
            .method4230()
            .method21654(
               this.field17382.getPosX() + var7.field18048,
               this.field17382.getPosY() + var7.field18049,
               this.field17382.getPosZ() + var7.field18050,
               this.field17383
            );
      }
   }

   private boolean method10971(Class1064 var1, int var2) {
      if (var2 <= 8) {
         if (!var1.method4914()) {
            return false;
         } else if (!var1.method4915().method4296()) {
            Class1064 var5 = var1.method4915();
            return this.method10971(var5, ++var2);
         } else {
            return true;
         }
      } else {
         return false;
      }
   }
}
