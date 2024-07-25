package remapped;

public class class_4461 {
   private Boolean field_21750 = null;

   public boolean method_20699() {
      if (this.field_21750 == null) {
         this.field_21750 = System.getProperty("java.runtime.name").startsWith("Android Runtime");
      }

      return this.field_21750;
   }
}
