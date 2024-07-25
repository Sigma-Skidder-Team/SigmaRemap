package remapped;

import java.util.stream.Stream;

public class class_5748<T> {
   private static String[] field_29104;
   private final class_1079 field_29103;
   private final class_8669<T> field_29105;
   private final String field_29106;

   private class_5748(class_1079 var1, class_8669<T> var2, String var3) {
      this.field_29103 = var1;
      this.field_29105 = var2;
      this.field_29106 = var3;
   }

   public class_5748<T> method_26025(T var1) {
      this.field_29103.method_4730(this.field_29105.method_39797((T)var1), this.field_29106);
      return this;
   }

   public class_5748<T> method_26024(class_8813<T> var1) {
      this.field_29103.method_4723(var1.method_40487(), this.field_29106);
      return this;
   }

   @SafeVarargs
   public final class_5748<T> method_26026(T... var1) {
      Stream.<Object>of(var1).<class_4639>map(this.field_29105::method_39797).forEach(var1x -> this.field_29103.method_4730(var1x, this.field_29106));
      return this;
   }
}
