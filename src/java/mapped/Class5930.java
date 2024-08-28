package mapped;

public final class Class5930 extends Class5928 {
   private final String field25818;
   private final Class1857 field25819;
   private final String field25820;
   private final Class7813 field25821;

   public Class5930(String var1, String var2, Class7813 var3, String var4, Class2512 var5, Class2512 var6, Class1857 var7) {
      super(var1, var5, var6);
      this.field25818 = var2;
      this.field25821 = var3;
      this.field25820 = var4;
      if (var7 != null) {
         this.field25819 = var7;
      } else {
         throw new NullPointerException("Style must be provided.");
      }
   }

   public String method18433() {
      return this.field25818;
   }

   public Class1857 method18434() {
      return this.field25819;
   }

   public String method18435() {
      return this.field25820;
   }

   public Class7813 method18436() {
      return this.field25821;
   }

   @Override
   public String method18429() {
      return super.method18429() + ", tag=" + this.field25818 + ", " + this.field25821 + ", value=" + this.field25820;
   }

   @Override
   public boolean method18431(Class78 var1) {
      return Class78.field176 == var1;
   }

   public boolean method18437() {
      return this.field25819 == Class1857.field9898;
   }
}
