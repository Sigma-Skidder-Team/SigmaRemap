package remapped;

public class class_6983 implements class_7245 {
   private String field_35857;

   public class_6983(String var1) {
      this.field_35857 = var1;
   }

   public String method_31938() {
      return this.field_35857;
   }

   @Override
   public int hashCode() {
      return this.field_35857.hashCode();
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof class_6983) ? false : ((class_6983)var1).field_35857.equals(this.field_35857);
   }

   @Override
   public String toString() {
      return "[Command=" + this.field_35857 + "]";
   }
}
