package remapped;

import java.util.Objects;

public class class_6676<T> extends class_6810 {
   private final class_5802 field_34507;
   private final T field_34508;
   private final class_9478<T> field_34509;

   public class_6676(class_9478<T> var1, T var2, class_5802 var3) {
      super(method_30628(var1, var2));
      this.field_34509 = var1;
      this.field_34507 = var3;
      this.field_34508 = (T)var2;
   }

   public static <T> String method_30628(class_9478<T> var0, T var1) {
      return method_30629(class_8669.field_44376.method_39797(var0)) + ":" + method_30629(var0.method_43788().method_39797(var1));
   }

   private static <T> String method_30629(class_4639 var0) {
      return var0.toString().replace(':', '.');
   }

   public class_9478<T> method_30631() {
      return this.field_34509;
   }

   public T method_30630() {
      return this.field_34508;
   }

   public String method_30627(int var1) {
      return this.field_34507.method_26292(var1);
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 || var1 instanceof class_6676 && Objects.equals(this.method_31262(), ((class_6676)var1).method_31262());
   }

   @Override
   public int hashCode() {
      return this.method_31262().hashCode();
   }

   @Override
   public String toString() {
      return "Stat{name=" + this.method_31262() + ", formatter=" + this.field_34507 + '}';
   }
}
