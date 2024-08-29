package mapped;

public class Class8118 implements Class8117 {
   private static String[] field34886;
   private final double field34887;
   private final double field34888;
   private final long field34889;
   private final long field34890;
   private final double field34891;
   public final Class7522 field34892;

   public Class8118(Class7522 var1, double var2, double var4, long var6) {
      this.field34892 = var1;
      this.field34887 = var2;
      this.field34888 = var4;
      this.field34891 = (double)var6;
      this.field34890 = Util.milliTime();
      this.field34889 = this.field34890 + var6;
   }

   @Override
   public double method28105() {
      return Math.max(this.field34892.method24534() - this.method28109() / 2.0, (double)(-Class7522.method24558(this.field34892)));
   }

   @Override
   public double method28107() {
      return Math.max(this.field34892.method24535() - this.method28109() / 2.0, (double)(-Class7522.method24558(this.field34892)));
   }

   @Override
   public double method28106() {
      return Math.min(this.field34892.method24534() + this.method28109() / 2.0, (double)Class7522.method24558(this.field34892));
   }

   @Override
   public double method28108() {
      return Math.min(this.field34892.method24535() + this.method28109() / 2.0, (double)Class7522.method24558(this.field34892));
   }

   @Override
   public double method28109() {
      double var3 = (double)(Util.milliTime() - this.field34890) / this.field34891;
      return !(var3 < 1.0) ? this.field34888 : MathHelper.method37822(var3, this.field34887, this.field34888);
   }

   @Override
   public double method28111() {
      return Math.abs(this.field34887 - this.field34888) / (double)(this.field34889 - this.field34890);
   }

   @Override
   public long method28112() {
      return this.field34889 - Util.milliTime();
   }

   @Override
   public double method28113() {
      return this.field34888;
   }

   @Override
   public Class2101 method28110() {
      return !(this.field34888 < this.field34887) ? Class2101.field13693 : Class2101.field13694;
   }

   @Override
   public void method28116() {
   }

   @Override
   public void method28115() {
   }

   @Override
   public Class8117 method28117() {
      Object var10000;
      if (this.method28112() > 0L) {
         var10000 = this;
      } else {
         Class7522 var10002 = this.field34892;
         this.field34892.getClass();
         var10000 = new Class8116(var10002, this.field34888);
      }

      return (Class8117)var10000;
   }

   @Override
   public VoxelShape method28118() {
      return VoxelShapes.method27433(
         VoxelShapes.field34463,
         VoxelShapes.method27427(
            Math.floor(this.method28105()),
            Double.NEGATIVE_INFINITY,
            Math.floor(this.method28107()),
            Math.ceil(this.method28106()),
            Double.POSITIVE_INFINITY,
            Math.ceil(this.method28108())
         ),
         IBooleanFunction.field44041
      );
   }
}
