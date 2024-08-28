package mapped;

public class Class8494 {
   private String field37161;
   private String field37162;
   private Class1886 field37163;
   private Class1884 field37164;

   public boolean method30079(Class6266 var1) {
      this.field37163 = var1.method19232(this.field37161);
      if (this.field37163 == null) {
         Class7944.method26811("Model variable not found: " + this.field37161);
         return false;
      } else {
         try {
            Class7344 var4 = new Class7344(var1);
            this.field37164 = var4.method23270(this.field37162);
            return true;
         } catch (Class2445 var5) {
            Class7944.method26811("Error parsing expression: " + this.field37162);
            Class7944.method26811(var5.getClass().getName() + ": " + var5.getMessage());
            return false;
         }
      }
   }

   public Class8494(String var1, String var2) {
      this.field37161 = var1;
      this.field37162 = var2;
   }

   public void method30080() {
      float var3 = this.field37164.method8142();
      this.field37163.method8144(var3);
   }
}
