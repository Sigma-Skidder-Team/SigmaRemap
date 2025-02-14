package mapped;

public class Class6214 extends Class6210 {
   private ClassLoader field27715 = Class6214.class.getClassLoader();

   public Class6214(ClassLoader var1) {
      this(Object.class, var1);
   }

   public Class6214(Class<? extends Object> var1, ClassLoader var2) {
      super(var1);
      if (var2 != null) {
         this.field27715 = var2;
      } else {
         throw new NullPointerException("Loader must be provided.");
      }
   }

   @Override
   public Class<?> method19143(String var1) throws ClassNotFoundException {
      return Class.forName(var1, true, this.field27715);
   }
}
