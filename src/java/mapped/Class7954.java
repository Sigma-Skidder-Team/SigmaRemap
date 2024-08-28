package mapped;

public class Class7954 {
   private static String[] field34194;
   private int field34195 = 0;
   private Class7219 field34196 = null;

   public Class7954(int var1, Class7219 var2) {
      this.field34195 = var1;
      this.field34196 = var2;
   }

   public Class7219 method27043() {
      return this.field34196;
   }

   public void method27044(Class2797 var1, Class9332 var2, Class5422 var3, int var4, int var5) {
      Class7219 var8 = Class7078.method21992(var1, this.field34195);
      if (var8 != null) {
         var8.method22682(var2);
      }

      this.field34196.method22680(var2, var3, var4, var5);
   }
}
