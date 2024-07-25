package remapped;

public class class_8750 {
   private class_2279[] field_44793 = new class_2279[0];

   public class_8750() {
   }

   public class_8750(class_2279 var1) {
      this.method_40162(var1);
   }

   public void method_40162(class_2279 var1) {
      this.field_44793 = (class_2279[]) Config.method_14441(this.field_44793, var1);
   }

   public boolean method_40164(int var1) {
      for (int var4 = 0; var4 < this.field_44793.length; var4++) {
         class_2279 var5 = this.field_44793[var4];
         if (var5.method_10504(var1)) {
            return true;
         }
      }

      return false;
   }

   public int method_40163() {
      return this.field_44793.length;
   }

   public class_2279 method_40161(int var1) {
      return this.field_44793[var1];
   }

   @Override
   public String toString() {
      StringBuffer var3 = new StringBuffer();
      var3.append("[");

      for (int var4 = 0; var4 < this.field_44793.length; var4++) {
         class_2279 var5 = this.field_44793[var4];
         if (var4 > 0) {
            var3.append(", ");
         }

         var3.append(var5.toString());
      }

      var3.append("]");
      return var3.toString();
   }
}
