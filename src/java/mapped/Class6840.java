package mapped;

public class Class6840 extends Class6829 {
   private static String[] field29706;
   private final Class1094 field29728;
   private double field29729;

   public Class6840(Class1094 var1) {
      super(var1);
      this.field29728 = var1;
   }

   @Override
   public void method20810() {
      if (this.field29728.field5036 && !this.field29728.field4981 && !((Class7955)Class1094.method5119(this.field29728)).method27045()) {
         this.field29728.method5104(0.0);
      } else if (this.method20811()) {
         this.field29728.method5104(this.field29729);
      }

      super.method20810();
   }

   @Override
   public void method20813(double var1, double var3, double var5, double var7) {
      if (this.field29728.method3250()) {
         var7 = 1.5;
      }

      super.method20813(var1, var3, var5, var7);
      if (var7 > 0.0) {
         this.field29729 = var7;
      }
   }
}
