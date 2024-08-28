package mapped;

import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class Class7473 {
   private static String[] field32110;
   private static final Class8609 field32111 = (var0, var1, var2) -> var0.method23448(Class8487.field36527);
   private final Class1660 field32112;
   private final Class113 field32113;
   private final Direction field32114;
   private int field32115;
   private BlockPos field32116;
   private int field32117;
   private int field32118;

   public static Optional<Class7473> method24194(Class1660 var0, BlockPos var1, Class113 var2) {
      return method24195(var0, var1, var0x -> var0x.method24203() && var0x.field32115 == 0, var2);
   }

   public static Optional<Class7473> method24195(Class1660 var0, BlockPos var1, Predicate<Class7473> var2, Class113 var3) {
      Optional var6 = Optional.<Class7473>of(new Class7473(var0, var1, var3)).filter(var2);
      if (!var6.isPresent()) {
         Class113 var7 = var3 != Class113.field413 ? Class113.field413 : Class113.field415;
         return Optional.<Class7473>of(new Class7473(var0, var1, var7)).filter(var2);
      } else {
         return var6;
      }
   }

   public Class7473(Class1660 var1, BlockPos var2, Class113 var3) {
      this.field32112 = var1;
      this.field32113 = var3;
      this.field32114 = var3 != Class113.field413 ? Direction.SOUTH : Direction.WEST;
      this.field32116 = this.method24196(var2);
      if (this.field32116 != null) {
         this.field32118 = this.method24197();
         if (this.field32118 > 0) {
            this.field32117 = this.method24199();
         }
      } else {
         this.field32116 = var2;
         this.field32118 = 1;
         this.field32117 = 1;
      }
   }

   @Nullable
   private BlockPos method24196(BlockPos var1) {
      int var4 = Math.max(0, var1.getY() - 21);

      while (var1.getY() > var4 && method24202(this.field32112.method6738(var1.method8313()))) {
         var1 = var1.method8313();
      }

      Direction var6 = this.field32114.method536();
      int var5 = this.method24198(var1, var6) - 1;
      return var5 >= 0 ? var1.method8350(var6, var5) : null;
   }

   private int method24197() {
      int var3 = this.method24198(this.field32116, this.field32114);
      return var3 >= 2 && var3 <= 21 ? var3 : 0;
   }

   private int method24198(BlockPos var1, Direction var2) {
      Mutable var5 = new Mutable();

      for (int var6 = 0; var6 <= 21; var6++) {
         var5.method8374(var1).method8380(var2, var6);
         Class7380 var7 = this.field32112.method6738(var5);
         if (!method24202(var7)) {
            if (field32111.method30847(var7, this.field32112, var5)) {
               return var6;
            }
            break;
         }

         Class7380 var8 = this.field32112.method6738(var5.method8379(Direction.field672));
         if (!field32111.method30847(var8, this.field32112, var5)) {
            break;
         }
      }

      return 0;
   }

   private int method24199() {
      Mutable var3 = new Mutable();
      int var4 = this.method24201(var3);
      return var4 >= 3 && var4 <= 21 && this.method24200(var3, var4) ? var4 : 0;
   }

   private boolean method24200(Mutable var1, int var2) {
      for (int var5 = 0; var5 < this.field32118; var5++) {
         Mutable var6 = var1.method8374(this.field32116).method8380(Direction.field673, var2).method8380(this.field32114, var5);
         if (!field32111.method30847(this.field32112.method6738(var6), this.field32112, var6)) {
            return false;
         }
      }

      return true;
   }

   private int method24201(Mutable var1) {
      for (int var4 = 0; var4 < 21; var4++) {
         var1.method8374(this.field32116).method8380(Direction.field673, var4).method8380(this.field32114, -1);
         if (!field32111.method30847(this.field32112.method6738(var1), this.field32112, var1)) {
            return var4;
         }

         var1.method8374(this.field32116).method8380(Direction.field673, var4).method8380(this.field32114, this.field32118);
         if (!field32111.method30847(this.field32112.method6738(var1), this.field32112, var1)) {
            return var4;
         }

         for (int var5 = 0; var5 < this.field32118; var5++) {
            var1.method8374(this.field32116).method8380(Direction.field673, var4).method8380(this.field32114, var5);
            Class7380 var6 = this.field32112.method6738(var1);
            if (!method24202(var6)) {
               return var4;
            }

            if (var6.method23448(Class8487.field36588)) {
               this.field32115++;
            }
         }
      }

      return 21;
   }

   private static boolean method24202(Class7380 var0) {
      return var0.method23393() || var0.method23446(Class7645.field32798) || var0.method23448(Class8487.field36588);
   }

   public boolean method24203() {
      return this.field32116 != null && this.field32118 >= 2 && this.field32118 <= 21 && this.field32117 >= 3 && this.field32117 <= 21;
   }

   public void method24204() {
      Class7380 var3 = Class8487.field36588.method11579().method23465(Class3401.field19060, this.field32113);
      BlockPos.method8359(this.field32116, this.field32116.method8350(Direction.field673, this.field32117 - 1).method8350(this.field32114, this.field32118 - 1))
         .forEach(var2 -> this.field32112.method6725(var2, var3, 18));
   }

   public boolean method24205() {
      return this.method24203() && this.field32115 == this.field32118 * this.field32117;
   }

   public static Vector3d method24206(Class9502 var0, Class113 var1, Vector3d var2, Class8847 var3) {
      double var6 = (double)var0.field44254 - (double)var3.field39968;
      double var8 = (double)var0.field44255 - (double)var3.field39969;
      BlockPos var10 = var0.field44253;
      double var11;
      if (!(var6 > 0.0)) {
         var11 = 0.5;
      } else {
         float var13 = (float)var10.method8322(var1) + var3.field39968 / 2.0F;
         var11 = Class9679.method37778(Class9679.method37813(var2.method11356(var1) - (double)var13, 0.0, var6), 0.0, 1.0);
      }

      double var14;
      if (!(var8 > 0.0)) {
         var14 = 0.0;
      } else {
         Class113 var16 = Class113.field414;
         var14 = Class9679.method37778(Class9679.method37813(var2.method11356(var16) - (double)var10.method8322(var16), 0.0, var8), 0.0, 1.0);
      }

      Class113 var19 = var1 != Class113.field413 ? Class113.field413 : Class113.field415;
      double var17 = var2.method11356(var19) - ((double)var10.method8322(var19) + 0.5);
      return new Vector3d(var11, var14, var17);
   }

   public static Class9761 method24207(Class1657 var0, Class9502 var1, Class113 var2, Vector3d var3, Class8847 var4, Vector3d var5, float var6, float var7) {
      BlockPos var10 = var1.field44253;
      Class7380 var11 = var0.method6738(var10);
      Class113 var12 = var11.<Class113>method23463(Class8820.field39712);
      double var13 = (double)var1.field44254;
      double var15 = (double)var1.field44255;
      int var17 = var2 != var12 ? 90 : 0;
      Vector3d var18 = var2 != var12 ? new Vector3d(var5.field18050, var5.field18049, -var5.field18048) : var5;
      double var19 = (double)var4.field39968 / 2.0 + (var13 - (double)var4.field39968) * var3.method11320();
      double var21 = (var15 - (double)var4.field39969) * var3.method11321();
      double var23 = 0.5 + var3.method11322();
      boolean var25 = var12 == Class113.field413;
      Vector3d var26 = new Vector3d(
         (double)var10.method8304() + (!var25 ? var23 : var19), (double)var10.getY() + var21, (double)var10.method8306() + (!var25 ? var19 : var23)
      );
      return new Class9761(var26, var18, var6 + (float)var17, var7);
   }
}
