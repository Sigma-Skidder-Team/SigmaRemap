package remapped;

public class SigmaIRCLogin implements class_6224 {
   public SigmaIRCLogin(SigmaIRC var1) {
      this.field_10198 = var1;
   }

   @Override
   public void method_28452(Object... var1) {
      this.field_10198.field_21933.method_19325("my other event", "hi");
      class_1293 var4 = new class_1293();
      var4.method_5820("session", "TOMYGAMESTESTINGID");
      this.field_10198.field_21933.method_19325("login", var4);
      System.out.println("hey");
   }
}
