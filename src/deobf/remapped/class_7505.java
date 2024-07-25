package remapped;

public final class class_7505<T extends class_9152<T>> {
   private final String field_38315;
   private final class_8094 field_38314;

   public class_7505(String var1, class_8094 var2) {
      this.field_38315 = var1;
      this.field_38314 = var2;
   }

   @Override
   public String toString() {
      return this.field_38315;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class_7505 && ((class_7505)var1).field_38315.equals(this.field_38315);
   }

   @Override
   public int hashCode() {
      return this.field_38315.hashCode();
   }

   public String method_34215() {
      return this.field_38315;
   }

   public String method_34214() {
      return "gamerule." + this.field_38315;
   }

   public class_8094 method_34213() {
      return this.field_38314;
   }
}
