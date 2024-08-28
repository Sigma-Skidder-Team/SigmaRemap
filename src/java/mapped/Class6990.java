package mapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class Class6990 {
   public final Class1006 field30243;
   public final Class1655 field30244;
   public Class8238 field30245;
   public double field30246;
   public int field30247;
   public int field30248;
   public Vector3d field30249 = Vector3d.field18047;
   public Class1998 field30250 = Class1998.field13026;
   public long field30251;
   public long field30252;
   public double field30253;
   public float field30254 = 0.5F;
   public boolean field30255;
   public long field30256;
   public Class6764 field30257;
   private BlockPos field30258;
   private int field30259;
   private float field30260 = 1.0F;
   private final Class9597 field30261;
   private boolean field30262;

   public Class6990(Class1006 var1, Class1655 var2) {
      this.field30243 = var1;
      this.field30244 = var2;
      int var5 = Class9679.method37769(var1.method3086(Class9173.field42106) * 16.0);
      this.field30261 = this.method21644(var5);
   }

   public void method21641() {
      this.field30260 = 1.0F;
   }

   public void method21642(float var1) {
      this.field30260 = var1;
   }

   public BlockPos method21643() {
      return this.field30258;
   }

   public abstract Class9597 method21644(int var1);

   public void method21645(double var1) {
      this.field30246 = var1;
   }

   public boolean method21646() {
      return this.field30255;
   }

   public void method21647() {
      if (this.field30244.method6783() - this.field30256 <= 20L) {
         this.field30255 = true;
      } else if (this.field30258 != null) {
         this.field30245 = null;
         this.field30245 = this.method21651(this.field30258, this.field30259);
         this.field30256 = this.field30244.method6783();
         this.field30255 = false;
      }
   }

   @Nullable
   public final Class8238 method21648(double var1, double var3, double var5, int var7) {
      return this.method21651(new BlockPos(var1, var3, var5), var7);
   }

   @Nullable
   public Class8238 method21649(Stream<BlockPos> var1, int var2) {
      return this.method21653(var1.collect(Collectors.<BlockPos>toSet()), 8, false, var2);
   }

   @Nullable
   public Class8238 method21650(Set<BlockPos> var1, int var2) {
      return this.method21653(var1, 8, false, var2);
   }

   @Nullable
   public Class8238 method21651(BlockPos var1, int var2) {
      return this.method21653(ImmutableSet.of(var1), 8, false, var2);
   }

   @Nullable
   public Class8238 method21652(Entity var1, int var2) {
      return this.method21653(ImmutableSet.of(var1.method3432()), 16, true, var2);
   }

   @Nullable
   public Class8238 method21653(Set<BlockPos> var1, int var2, boolean var3, int var4) {
      if (!var1.isEmpty()) {
         if (!(this.field30243.getPosY() < 0.0)) {
            if (this.method21668()) {
               if (this.field30245 != null && !this.field30245.method28693() && var1.contains(this.field30258)) {
                  return this.field30245;
               } else {
                  this.field30244.method6820().method22503("pathfind");
                  float var7 = (float)this.field30243.method3086(Class9173.field42106);
                  BlockPos var8 = !var3 ? this.field30243.method3432() : this.field30243.method3432().method8311();
                  int var9 = (int)(var7 + (float)var2);
                  Class1667 var10 = new Class1667(this.field30244, var8.method8336(-var9, -var9, -var9), var8.method8336(var9, var9, var9));
                  Class8238 var11 = this.field30261.method37250(var10, this.field30243, var1, var7, var4, this.field30260);
                  this.field30244.method6820().method22505();
                  if (var11 != null && var11.method28712() != null) {
                     this.field30258 = var11.method28712();
                     this.field30259 = var4;
                     this.method21663();
                  }

                  return var11;
               }
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public boolean method21654(double var1, double var3, double var5, double var7) {
      return this.method21656(this.method21648(var1, var3, var5, 1), var7);
   }

   public boolean method21655(Entity var1, double var2) {
      Class8238 var6 = this.method21652(var1, 1);
      return var6 != null && this.method21656(var6, var2);
   }

   public boolean method21656(Class8238 var1, double var2) {
      if (var1 != null) {
         if (!var1.method28707(this.field30245)) {
            this.field30245 = var1;
         }

         if (!this.method21664()) {
            this.method21670();
            if (this.field30245.method28698() > 0) {
               this.field30246 = var2;
               Vector3d var6 = this.method21667();
               this.field30248 = this.field30247;
               this.field30249 = var6;
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         this.field30245 = null;
         return false;
      }
   }

   @Nullable
   public Class8238 method21657() {
      return this.field30245;
   }

   public void method21658() {
      this.field30247++;
      if (this.field30255) {
         this.method21647();
      }

      if (!this.method21664()) {
         if (!this.method21668()) {
            if (this.field30245 != null && !this.field30245.method28693()) {
               Vector3d var3 = this.method21667();
               Vector3d var4 = this.field30245.method28703(this.field30243);
               if (var3.field18049 > var4.field18049
                  && !this.field30243.method3226()
                  && Class9679.method37769(var3.field18048) == Class9679.method37769(var4.field18048)
                  && Class9679.method37769(var3.field18050) == Class9679.method37769(var4.field18050)) {
                  this.field30245.method28691();
               }
            }
         } else {
            this.method21659();
         }

         Class7393.method23617(this.field30244, this.field30243, this.field30245, this.field30254);
         if (!this.method21664()) {
            Vector3d var5 = this.field30245.method28703(this.field30243);
            BlockPos var6 = new BlockPos(var5);
            this.field30243
               .method4228()
               .method20813(
                  var5.field18048,
                  !this.field30244.method6738(var6.method8313()).method23393() ? Class6762.method20626(this.field30244, var6) : var5.field18049,
                  var5.field18050,
                  this.field30246
               );
         }
      }
   }

   public void method21659() {
      Vector3d var3 = this.method21667();
      this.field30254 = !(this.field30243.method3429() > 0.75F) ? 0.75F - this.field30243.method3429() / 2.0F : this.field30243.method3429() / 2.0F;
      BlockPos var4 = this.field30245.method28704();
      double var5 = Math.abs(this.field30243.getPosX() - ((double)var4.method8304() + 0.5));
      double var7 = Math.abs(this.field30243.getPosY() - (double)var4.getY());
      double var9 = Math.abs(this.field30243.getPosZ() - ((double)var4.method8306() + 0.5));
      boolean var11 = var5 < (double)this.field30254 && var9 < (double)this.field30254 && var7 < 1.0;
      if (var11 || this.field30243.method4225(this.field30245.method28705().field30859) && this.method21660(var3)) {
         this.field30245.method28691();
      }

      this.method21661(var3);
   }

   private boolean method21660(Vector3d var1) {
      if (this.field30245.method28699() + 1 < this.field30245.method28698()) {
         Vector3d var4 = Vector3d.method11330(this.field30245.method28704());
         if (var1.method11340(var4, 2.0)) {
            Vector3d var5 = Vector3d.method11330(this.field30245.method28702(this.field30245.method28699() + 1));
            Vector3d var6 = var5.method11336(var4);
            Vector3d var7 = var1.method11336(var4);
            return var6.method11334(var7) > 0.0;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void method21661(Vector3d var1) {
      if (this.field30247 - this.field30248 > 100) {
         if (!(var1.method11342(this.field30249) < 2.25)) {
            this.field30262 = false;
         } else {
            this.field30262 = true;
            this.method21666();
         }

         this.field30248 = this.field30247;
         this.field30249 = var1;
      }

      if (this.field30245 != null && !this.field30245.method28693()) {
         BlockPos var4 = this.field30245.method28704();
         if (!var4.equals(this.field30250)) {
            this.field30250 = var4;
            double var5 = var1.method11341(Vector3d.method11330(this.field30250));
            this.field30253 = !(this.field30243.method2918() > 0.0F) ? 0.0 : var5 / (double)this.field30243.method2918() * 1000.0;
         } else {
            this.field30251 = this.field30251 + (Util.method38487() - this.field30252);
         }

         if (this.field30253 > 0.0 && (double)this.field30251 > this.field30253 * 3.0) {
            this.method21662();
         }

         this.field30252 = Util.method38487();
      }
   }

   private void method21662() {
      this.method21663();
      this.method21666();
   }

   private void method21663() {
      this.field30250 = Class1998.field13026;
      this.field30251 = 0L;
      this.field30253 = 0.0;
      this.field30262 = false;
   }

   public boolean method21664() {
      return this.field30245 == null || this.field30245.method28693();
   }

   public boolean method21665() {
      return !this.method21664();
   }

   public void method21666() {
      this.field30245 = null;
   }

   public abstract Vector3d method21667();

   public abstract boolean method21668();

   public boolean method21669() {
      return this.field30243.method3255() || this.field30243.method3264();
   }

   public void method21670() {
      if (this.field30245 != null) {
         for (int var3 = 0; var3 < this.field30245.method28698(); var3++) {
            Class7176 var4 = this.field30245.method28695(var3);
            Class7176 var5 = var3 + 1 >= this.field30245.method28698() ? null : this.field30245.method28695(var3 + 1);
            Class7380 var6 = this.field30244.method6738(new BlockPos(var4.field30847, var4.field30848, var4.field30849));
            if (var6.method23448(Class8487.field36648)) {
               this.field30245.method28697(var3, var4.method22525(var4.field30847, var4.field30848 + 1, var4.field30849));
               if (var5 != null && var4.field30848 >= var5.field30848) {
                  this.field30245.method28697(var3 + 1, var4.method22525(var5.field30847, var4.field30848 + 1, var5.field30849));
               }
            }
         }
      }
   }

   public abstract boolean method21671(Vector3d var1, Vector3d var2, int var3, int var4, int var5);

   public boolean method21672(BlockPos var1) {
      BlockPos var4 = var1.method8313();
      return this.field30244.method6738(var4).method23409(this.field30244, var4);
   }

   public Class6764 method21673() {
      return this.field30257;
   }

   public void method21674(boolean var1) {
      this.field30257.method20646(var1);
   }

   public boolean method21675() {
      return this.field30257.method20649();
   }

   public void method21676(BlockPos var1) {
      if (this.field30245 != null && !this.field30245.method28693() && this.field30245.method28698() != 0) {
         Class7176 var4 = this.field30245.method28694();
         Vector3d var5 = new Vector3d(
            ((double)var4.field30847 + this.field30243.getPosX()) / 2.0,
            ((double)var4.field30848 + this.field30243.getPosY()) / 2.0,
            ((double)var4.field30849 + this.field30243.getPosZ()) / 2.0
         );
         if (var1.method8317(var5, (double)(this.field30245.method28698() - this.field30245.method28699()))) {
            this.method21647();
         }
      }
   }

   public boolean method21677() {
      return this.field30262;
   }
}
