package remapped;

import java.util.Objects;

public class class_5407 {
   private int field_27583;
   private class_5700 field_27582;
   private Object field_27584;

   public class_5407(int var1, class_5700 var2, Object var3) {
      this.field_27583 = var1;
      this.field_27582 = var2;
      this.field_27584 = var3;
   }

   public int method_24602() {
      return this.field_27583;
   }

   public void method_24605(int var1) {
      this.field_27583 = var1;
   }

   public class_5700 method_24603() {
      return this.field_27582;
   }

   public void method_24608(class_5700 var1) {
      this.field_27582 = var1;
   }

   public Object method_24609() {
      return this.field_27584;
   }

   public <T> T method_24604() {
      return (T)this.field_27584;
   }

   public void method_24607(Object var1) {
      this.field_27584 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_5407 var4 = (class_5407)var1;
            if (this.field_27583 != var4.field_27583) {
               return false;
            } else {
               return Objects.equals(this.field_27582, var4.field_27582) ? Objects.equals(this.field_27584, var4.field_27584) : false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field_27583;
      var3 = 31 * var3 + (this.field_27582 == null ? 0 : this.field_27582.hashCode());
      return 31 * var3 + (this.field_27584 == null ? 0 : this.field_27584.hashCode());
   }

   @Override
   public String toString() {
      return "Metadata{id=" + this.field_27583 + ", metaType=" + this.field_27582 + ", value=" + this.field_27584 + '}';
   }
}
