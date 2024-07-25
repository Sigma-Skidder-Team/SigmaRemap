package remapped;

public class class_9859 implements class_8861 {
   private String field_49900 = null;
   private boolean field_49899 = false;
   private Class field_49898 = null;

   public class_9859(String var1) {
      this.field_49900 = var1;
      class_9696.method_44804(this);
   }

   public class_9859(Class var1) {
      this.field_49898 = var1;
      this.field_49900 = var1.getName();
      this.field_49899 = true;
   }

   public Class method_45471() {
      if (this.field_49899) {
         return this.field_49898;
      } else {
         this.field_49899 = true;

         try {
            this.field_49898 = Class.forName(this.field_49900);
         } catch (ClassNotFoundException var4) {
            class_9569.method_44218("(Reflector) Class not present: " + this.field_49900);
         } catch (Throwable var5) {
            var5.printStackTrace();
         }

         return this.field_49898;
      }
   }

   public boolean method_45472() {
      return this.method_45471() != null;
   }

   public String method_45467() {
      return this.field_49900;
   }

   public boolean method_45470(Object var1) {
      return this.method_45471() != null ? this.method_45471().isInstance(var1) : false;
   }

   public class_1790 method_45468(String var1) {
      return new class_1790(this, var1);
   }

   public class_817 method_45473(String var1) {
      return new class_817(this, var1);
   }

   public class_817 method_45474(String var1, Class[] var2) {
      return new class_817(this, var1, var2);
   }

   @Override
   public void method_40748() {
      Class var3 = this.method_45471();
   }
}
