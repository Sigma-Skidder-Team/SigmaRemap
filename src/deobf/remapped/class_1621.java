package remapped;

public abstract class class_1621 {
   private class_9592 field_8432;
   private class_404 field_8428;
   public class_404 field_8427;
   private Class<? extends Object> field_8431;
   private boolean field_8430;
   public boolean field_8429;
   public Boolean field_8433;

   public class_1621(class_9592 var1, class_404 var2, class_404 var3) {
      this.method_7227(var1);
      this.field_8428 = var2;
      this.field_8427 = var3;
      this.field_8431 = Object.class;
      this.field_8430 = false;
      this.field_8429 = true;
      this.field_8433 = null;
   }

   public class_9592 method_7232() {
      return this.field_8432;
   }

   public class_404 method_7222() {
      return this.field_8427;
   }

   public abstract class_99 method_7221();

   public class_404 method_7224() {
      return this.field_8428;
   }

   public void method_7227(class_9592 var1) {
      if (var1 != null) {
         this.field_8432 = var1;
      } else {
         throw new NullPointerException("tag in a Node is required.");
      }
   }

   @Override
   public final boolean equals(Object var1) {
      return super.equals(var1);
   }

   public Class<? extends Object> method_7230() {
      return this.field_8431;
   }

   public void method_7226(Class<? extends Object> var1) {
      if (!var1.isAssignableFrom(this.field_8431)) {
         this.field_8431 = var1;
      }
   }

   public void method_7229(boolean var1) {
      this.field_8430 = var1;
   }

   public boolean method_7225() {
      return this.field_8430;
   }

   @Override
   public final int hashCode() {
      return super.hashCode();
   }

   public boolean method_7223() {
      if (this.field_8433 != null) {
         return this.field_8433;
      } else {
         return !this.field_8432.method_44299() && this.field_8429 && !Object.class.equals(this.field_8431) && !this.field_8432.equals(class_9592.field_48873)
            ? true
            : this.field_8432.method_44297(this.method_7230());
      }
   }

   public void method_7231(Boolean var1) {
      this.field_8433 = var1;
   }
}
