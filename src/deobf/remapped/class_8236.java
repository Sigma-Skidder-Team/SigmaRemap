package remapped;

public class class_8236 implements class_6867 {
   private static String[] field_42304;
   private final class_6867 field_42302;
   private final class_6867 field_42303;

   public class_8236(class_6867 var1, class_6867 var2) {
      if (var1 == null) {
         var1 = var2;
      }

      if (var2 == null) {
         var2 = var1;
      }

      this.field_42302 = var1;
      this.field_42303 = var2;
   }

   @Override
   public int method_31505() {
      return this.field_42302.method_31505() + this.field_42303.method_31505();
   }

   @Override
   public boolean method_31495() {
      return this.field_42302.method_31495() && this.field_42303.method_31495();
   }

   public boolean method_37721(class_6867 var1) {
      return this.field_42302 == var1 || this.field_42303 == var1;
   }

   @Override
   public class_6098 method_31498(int var1) {
      return var1 < this.field_42302.method_31505()
         ? this.field_42302.method_31498(var1)
         : this.field_42303.method_31498(var1 - this.field_42302.method_31505());
   }

   @Override
   public class_6098 method_31497(int var1, int var2) {
      return var1 < this.field_42302.method_31505()
         ? this.field_42302.method_31497(var1, var2)
         : this.field_42303.method_31497(var1 - this.field_42302.method_31505(), var2);
   }

   @Override
   public class_6098 method_31507(int var1) {
      return var1 < this.field_42302.method_31505()
         ? this.field_42302.method_31507(var1)
         : this.field_42303.method_31507(var1 - this.field_42302.method_31505());
   }

   @Override
   public void method_31503(int var1, class_6098 var2) {
      if (var1 < this.field_42302.method_31505()) {
         this.field_42302.method_31503(var1, var2);
      } else {
         this.field_42303.method_31503(var1 - this.field_42302.method_31505(), var2);
      }
   }

   @Override
   public int method_31506() {
      return this.field_42302.method_31506();
   }

   @Override
   public void method_17407() {
      this.field_42302.method_17407();
      this.field_42303.method_17407();
   }

   @Override
   public boolean method_31502(class_704 var1) {
      return this.field_42302.method_31502(var1) && this.field_42303.method_31502(var1);
   }

   @Override
   public void method_31501(class_704 var1) {
      this.field_42302.method_31501(var1);
      this.field_42303.method_31501(var1);
   }

   @Override
   public void method_31499(class_704 var1) {
      this.field_42302.method_31499(var1);
      this.field_42303.method_31499(var1);
   }

   @Override
   public boolean method_31500(int var1, class_6098 var2) {
      return var1 < this.field_42302.method_31505()
         ? this.field_42302.method_31500(var1, var2)
         : this.field_42303.method_31500(var1 - this.field_42302.method_31505(), var2);
   }

   @Override
   public void method_24975() {
      this.field_42302.method_24975();
      this.field_42303.method_24975();
   }
}
