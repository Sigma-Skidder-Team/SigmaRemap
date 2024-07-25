package remapped;

public class class_8025 extends class_8626 {
   private static String[] field_41083;
   private class_8784 field_41081;
   private class_706[] field_41082;

   public class_8025(class_2159 var1) {
      this.field_41081 = (class_8784)var1;
      this.field_41082 = new class_706[this.field_41081.method_40379()];

      for (int var4 = 0; var4 < this.field_41082.length; var4++) {
         this.field_41082[var4] = new class_706(this, var4, null);
      }
   }

   public int method_36455() {
      return this.field_41081.method_40374();
   }

   public class_706[] method_36454() {
      return this.field_41082;
   }
}
