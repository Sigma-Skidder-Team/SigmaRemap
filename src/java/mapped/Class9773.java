package mapped;

public class Class9773<T> {
   private static String[] field45709;
   private final Class9289<T> field45710;
   private T field45711;
   private boolean field45712;

   public Class9773(Class9289<T> var1, T var2) {
      this.field45710 = var1;
      this.field45711 = (T)var2;
      this.field45712 = true;
   }

   public Class9289<T> method38447() {
      return this.field45710;
   }

   public void method38448(T var1) {
      this.field45711 = (T)var1;
   }

   public T method38449() {
      return this.field45711;
   }

   public boolean method38450() {
      return this.field45712;
   }

   public void method38451(boolean var1) {
      this.field45712 = var1;
   }

   public Class9773<T> method38452() {
      return new Class9773<T>(this.field45710, this.field45710.method35016().method19644(this.field45711));
   }

   // $VF: synthetic method
   public static Class9289 method38453(Class9773 var0) {
      return var0.field45710;
   }

   // $VF: synthetic method
   public static Object method38454(Class9773 var0) {
      return var0.field45711;
   }
}
