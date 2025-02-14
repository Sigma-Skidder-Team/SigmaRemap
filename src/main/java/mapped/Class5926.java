package mapped;

public abstract class Class5926 extends Class5928 {
   private final String field25812;
   private final boolean field25813;
   private final Class2214 field25814;

   public Class5926(String var1, String var2, boolean var3, Class2512 var4, Class2512 var5, Class2214 var6) {
      super(var1, var4, var5);
      this.field25812 = var2;
      this.field25813 = var3;
      if (var6 != null) {
         this.field25814 = var6;
      } else {
         throw new NullPointerException("Flow style must be provided.");
      }
   }

   public String method18426() {
      return this.field25812;
   }

   public boolean method18427() {
      return this.field25813;
   }

   public Class2214 method18428() {
      return this.field25814;
   }

   @Override
   public String method18429() {
      return super.method18429() + ", tag=" + this.field25812 + ", implicit=" + this.field25813;
   }

   public boolean method18430() {
      return Class2214.field14475 == this.field25814;
   }
}
