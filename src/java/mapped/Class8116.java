package mapped;

public class Class8116 implements Class8117 {
   private static String[] field34878;
   private final double field34879;
   private double field34880;
   private double field34881;
   private double field34882;
   private double field34883;
   private Class6408 field34884;
   public final Class7522 field34885;

   public Class8116(Class7522 var1, double var2) {
      this.field34885 = var1;
      this.field34879 = var2;
      this.method28114();
   }

   @Override
   public double method28105() {
      return this.field34880;
   }

   @Override
   public double method28106() {
      return this.field34882;
   }

   @Override
   public double method28107() {
      return this.field34881;
   }

   @Override
   public double method28108() {
      return this.field34883;
   }

   @Override
   public double method28109() {
      return this.field34879;
   }

   @Override
   public Class2101 method28110() {
      return Class2101.field13695;
   }

   @Override
   public double method28111() {
      return 0.0;
   }

   @Override
   public long method28112() {
      return 0L;
   }

   @Override
   public double method28113() {
      return this.field34879;
   }

   private void method28114() {
      this.field34880 = Math.max(this.field34885.method24534() - this.field34879 / 2.0, (double)(-Class7522.method24558(this.field34885)));
      this.field34881 = Math.max(this.field34885.method24535() - this.field34879 / 2.0, (double)(-Class7522.method24558(this.field34885)));
      this.field34882 = Math.min(this.field34885.method24534() + this.field34879 / 2.0, (double)Class7522.method24558(this.field34885));
      this.field34883 = Math.min(this.field34885.method24535() + this.field34879 / 2.0, (double)Class7522.method24558(this.field34885));
      this.field34884 = Class8022.method27433(
         Class8022.field34463,
         Class8022.method27427(
            Math.floor(this.method28105()),
            Double.NEGATIVE_INFINITY,
            Math.floor(this.method28107()),
            Math.ceil(this.method28106()),
            Double.POSITIVE_INFINITY,
            Math.ceil(this.method28108())
         ),
         Class9477.field44041
      );
   }

   @Override
   public void method28115() {
      this.method28114();
   }

   @Override
   public void method28116() {
      this.method28114();
   }

   @Override
   public Class8117 method28117() {
      return this;
   }

   @Override
   public Class6408 method28118() {
      return this.field34884;
   }
}
