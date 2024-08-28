package mapped;

import java.util.Objects;

public class Class9007<T> extends Class9008 {
   private final Class8762 field41185;
   private final T field41186;
   private final Class49<T> field41187;

   public Class9007(Class49<T> var1, T var2, Class8762 var3) {
      super(method33273(var1, var2));
      this.field41187 = var1;
      this.field41185 = var3;
      this.field41186 = (T)var2;
   }

   public static <T> String method33273(Class49<T> var0, T var1) {
      return method33274(Class2348.field16088.method9181(var0)) + ":" + method33274(var0.method171().method9181(var1));
   }

   private static <T> String method33274(ResourceLocation var0) {
      return var0.toString().replace(':', '.');
   }

   public Class49<T> method33275() {
      return this.field41187;
   }

   public T method33276() {
      return this.field41186;
   }

   public String method33277(int var1) {
      return this.field41185.method31615(var1);
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 || var1 instanceof Class9007 && Objects.equals(this.method33280(), ((Class9007)var1).method33280());
   }

   @Override
   public int hashCode() {
      return this.method33280().hashCode();
   }

   @Override
   public String toString() {
      return "Stat{name=" + this.method33280() + ", formatter=" + this.field41185 + '}';
   }
}
