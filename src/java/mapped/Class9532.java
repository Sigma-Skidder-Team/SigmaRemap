package mapped;

public class Class9532 {
   private Class7589[] field44355 = new Class7589[0];

   public Class9532() {
   }

   public Class9532(Class7589 var1) {
      this.method36837(var1);
   }

   public void method36837(Class7589 var1) {
      this.field44355 = (Class7589[])Class7944.method26948(this.field44355, var1);
   }

   public boolean method36838(int var1) {
      for (int var4 = 0; var4 < this.field44355.length; var4++) {
         Class7589 var5 = this.field44355[var4];
         if (var5.method24845(var1)) {
            return true;
         }
      }

      return false;
   }

   public int method36839() {
      return this.field44355.length;
   }

   public Class7589 method36840(int var1) {
      return this.field44355[var1];
   }

   @Override
   public String toString() {
      StringBuffer var3 = new StringBuffer();
      var3.append("[");

      for (int var4 = 0; var4 < this.field44355.length; var4++) {
         Class7589 var5 = this.field44355[var4];
         if (var4 > 0) {
            var3.append(", ");
         }

         var3.append(var5.toString());
      }

      var3.append("]");
      return var3.toString();
   }
}
