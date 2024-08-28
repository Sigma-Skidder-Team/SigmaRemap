package mapped;

import java.util.EnumSet;

public abstract class Class2628 extends Class2595 {
   public final Class1046 field16928;
   public final double field16929;
   public int field16930;
   public int field16931;
   private int field16932;
   public BlockPos field16933 = BlockPos.field13032;
   private boolean field16934;
   private final int field16935;
   private final int field16936;
   public int field16937;

   public Class2628(Class1046 var1, double var2, int var4) {
      this(var1, var2, var4, 1);
   }

   public Class2628(Class1046 var1, double var2, int var4, int var5) {
      this.field16928 = var1;
      this.field16929 = var2;
      this.field16935 = var4;
      this.field16937 = 0;
      this.field16936 = var5;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14659));
   }

   @Override
   public boolean method10803() {
      if (this.field16930 <= 0) {
         this.field16930 = this.method10833(this.field16928);
         return this.method10839();
      } else {
         this.field16930--;
         return false;
      }
   }

   public int method10833(Class1046 var1) {
      return 200 + var1.method3013().nextInt(200);
   }

   @Override
   public boolean method10806() {
      return this.field16931 >= -this.field16932 && this.field16931 <= 1200 && this.method10840(this.field16928.field5024, this.field16933);
   }

   @Override
   public void method10804() {
      this.method10834();
      this.field16931 = 0;
      this.field16932 = this.field16928.method3013().nextInt(this.field16928.method3013().nextInt(1200) + 1200) + 1200;
   }

   public void method10834() {
      this.field16928
         .method4230()
         .method21654(
            (double)((float)this.field16933.method8304()) + 0.5,
            (double)(this.field16933.getY() + 1),
            (double)((float)this.field16933.method8306()) + 0.5,
            this.field16929
         );
   }

   public double method10835() {
      return 1.0;
   }

   public BlockPos method10836() {
      return this.field16933.method8311();
   }

   @Override
   public void method10805() {
      BlockPos var3 = this.method10836();
      if (var3.method8317(this.field16928.method3431(), this.method10835())) {
         this.field16934 = true;
         this.field16931--;
      } else {
         this.field16934 = false;
         this.field16931++;
         if (this.method10837()) {
            this.field16928
               .method4230()
               .method21654((double)((float)var3.method8304()) + 0.5, (double)var3.getY(), (double)((float)var3.method8306()) + 0.5, this.field16929);
         }
      }
   }

   public boolean method10837() {
      return this.field16931 % 40 == 0;
   }

   public boolean method10838() {
      return this.field16934;
   }

   public boolean method10839() {
      int var3 = this.field16935;
      int var4 = this.field16936;
      BlockPos var5 = this.field16928.method3432();
      Mutable var6 = new Mutable();

      for (int var7 = this.field16937; var7 <= var4; var7 = var7 <= 0 ? 1 - var7 : -var7) {
         for (int var8 = 0; var8 < var3; var8++) {
            for (int var9 = 0; var9 <= var8; var9 = var9 <= 0 ? 1 - var9 : -var9) {
               for (int var10 = var9 < var8 && var9 > -var8 ? var8 : 0; var10 <= var8; var10 = var10 <= 0 ? 1 - var10 : -var10) {
                  var6.method8378(var5, var9, var7 - 1, var10);
                  if (this.field16928.method4287(var6) && this.method10840(this.field16928.field5024, var6)) {
                     this.field16933 = var6;
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public abstract boolean method10840(Class1662 var1, BlockPos var2);
}
