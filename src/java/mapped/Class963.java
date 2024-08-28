package mapped;

public class Class963 extends Class944 {
   private int field5394;

   public Class963() {
      super(Class4387.field21438);
   }

   @Override
   public Class39 method3646(Class39 var1) {
      super.method3646(var1);
      var1.method102("OutputSignal", this.field5394);
      return var1;
   }

   @Override
   public void method3645(Class7380 var1, Class39 var2) {
      super.method3645(var1, var2);
      this.field5394 = var2.method122("OutputSignal");
   }

   public int method3930() {
      return this.field5394;
   }

   public void method3931(int var1) {
      this.field5394 = var1;
   }
}
