package remapped;

public abstract class class_8374<E extends class_4686<E>> extends class_7983<E> {
   private boolean field_42873;

   public class_8374(class_1893 var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method_26942(boolean var1) {
      if (!this.field_42873 && this.method_36218() == 0) {
         return false;
      } else {
         this.field_42873 = !this.field_42873;
         if (this.field_42873 && this.method_36226() == null && this.method_36218() > 0) {
            this.method_36206(class_792.field_4255);
         } else if (this.field_42873 && this.method_36226() != null) {
            this.method_36215();
         }

         return this.field_42873;
      }
   }
}
