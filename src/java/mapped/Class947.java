package mapped;

public class Class947 extends Class944 implements Class946 {
   private Class8848 field5332 = Class8848.field39973;

   public Class947() {
      super(Class4387.field21425);
   }

   @Override
   public void method3645(Class7380 var1, Class39 var2) {
      super.method3645(var1, var2);
      if (var2.method119("RecordItem", 10)) {
         this.method3804(Class8848.method32104(var2.method130("RecordItem")));
      }
   }

   @Override
   public Class39 method3646(Class39 var1) {
      super.method3646(var1);
      if (!this.method3803().method32105()) {
         var1.method99("RecordItem", this.method3803().method32112(new Class39()));
      }

      return var1;
   }

   public Class8848 method3803() {
      return this.field5332;
   }

   public void method3804(Class8848 var1) {
      this.field5332 = var1;
      this.method3622();
   }

   @Override
   public void method3625() {
      this.method3804(Class8848.field39973);
   }
}
