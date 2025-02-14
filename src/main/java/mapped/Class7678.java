package mapped;

public class Class7678<T> {
   private final T field32893;
   private Class7678<T> field32894;
   private Class7678<T> field32895;
   private Class9380<T> field32896;

   public Class7678(T var1) {
      this.field32893 = (T)var1;
   }

   public T method25253() {
      return this.field32893;
   }

   public Class7678<T> method25254() {
      return this.field32894;
   }

   public Class7678<T> method25255() {
      return this.field32895;
   }

   private void method25256(Class7678<T> var1) {
      this.field32894 = var1;
   }

   private void method25257(Class7678<T> var1) {
      this.field32895 = var1;
   }

   private void method25258(Class9380<T> var1) {
      this.field32896 = var1;
   }

   @Override
   public String toString() {
      return "" + this.field32893;
   }

   // $VF: synthetic method
   public static void method25259(Class7678 var0, Class7678 var1) {
      var0.method25257(var1);
   }

   // $VF: synthetic method
   public static void method25260(Class7678 var0, Class7678 var1) {
      var0.method25256(var1);
   }

   // $VF: synthetic method
   public static void method25261(Class7678 var0, Class9380 var1) {
      var0.method25258(var1);
   }

   // $VF: synthetic method
   public static Class9380 method25262(Class7678 var0) {
      return var0.field32896;
   }

   // $VF: synthetic method
   public static Class7678 method25263(Class7678 var0) {
      return var0.field32895;
   }
}
