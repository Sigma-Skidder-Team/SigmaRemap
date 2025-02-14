package mapped;

public final class Class6563 extends Class6553 {
   private final String field28925;
   private final boolean field28926;
   private final Class1857 field28927;

   public Class6563(String var1, Class2512 var2, Class2512 var3, boolean var4) {
      this(var1, var4, var2, var3, Class1857.field9898);
   }

   public Class6563(String var1, boolean var2, Class2512 var3, Class2512 var4, Class1857 var5) {
      super(var3, var4);
      this.field28925 = var1;
      this.field28926 = var2;
      if (var5 != null) {
         this.field28927 = var5;
      } else {
         throw new NullPointerException("Style must be provided.");
      }
   }

   public boolean method19898() {
      return this.field28926;
   }

   public String method19899() {
      return this.field28925;
   }

   public Class1857 method19900() {
      return this.field28927;
   }

   @Override
   public Class2228 method19894() {
      return Class2228.field14603;
   }
}
