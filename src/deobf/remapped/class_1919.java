package remapped;

public class class_1919 extends class_4364 {
   private ClassLoader field_9792 = class_1919.class.getClassLoader();

   public class_1919(ClassLoader var1) {
      this(Object.class, var1);
   }

   public class_1919(Class<? extends Object> var1, ClassLoader var2) {
      super(var1);
      if (var2 != null) {
         this.field_9792 = var2;
      } else {
         throw new NullPointerException("Loader must be provided.");
      }
   }

   @Override
   public Class<?> method_20239(String var1) throws ClassNotFoundException {
      return Class.forName(var1, true, this.field_9792);
   }
}
