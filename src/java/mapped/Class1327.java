package mapped;

public class Class1327 extends Class1325 {
   private static String[] field7024;
   private final Class911 field7025;

   public Class1327(Class911 var1) {
      this.field7025 = var1;
   }

   @Override
   public Class911 method6304() {
      return this.field7025;
   }

   @Override
   public int method6305() {
      return 150;
   }

   @Override
   public void init() {
      super.init();
      this.field7015 = this.method6304().method3571();
      this.method6306();
      this.field7010.method5635(this.method6304().method3563());
   }

   @Override
   public void method6308(Class911 var1) {
      if (var1 instanceof Class912) {
         Class912 var4 = (Class912)var1;
         this.mc.getConnection().sendPacket(new Class5529(var4.method3577().method3205(), this.field7010.getText(), var1.method3571()));
      }
   }
}
