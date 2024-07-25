package remapped;

public class class_4789 {
   private String field_23953;
   private String field_23952;

   public class_4789(String var1, String var2) {
      this.field_23953 = var1;
      this.field_23952 = var2;
   }

   public String method_22086() {
      return this.field_23953;
   }

   public String method_22085() {
      return this.field_23952;
   }

   public String method_22084() {
      return "#define " + this.field_23953 + " " + this.field_23952;
   }

   @Override
   public String toString() {
      return this.method_22084();
   }
}
