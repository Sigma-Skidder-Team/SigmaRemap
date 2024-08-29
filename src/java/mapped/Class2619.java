package mapped;

public class Class2619 extends Class2595 {
   private static String[] field16900;
   private final Class1014 field16901;
   private ServerPlayerEntity field16902;
   private boolean field16903;

   public Class2619(Class1014 var1) {
      this.field16901 = var1;
   }

   @Override
   public boolean method10803() {
      ServerPlayerEntity var3 = (ServerPlayerEntity)this.field16901.method4400();
      boolean var4 = var3 != null && !var3.isSpectator() && !var3.abilities.field29607 && !var3.method3250();
      return !this.field16901.method4402() && var4 && this.field16901.method4405();
   }

   @Override
   public boolean method10808() {
      return !this.field16903;
   }

   @Override
   public void method10804() {
      this.field16902 = (ServerPlayerEntity)this.field16901.method4400();
      this.field16903 = false;
   }

   @Override
   public void method10805() {
      if (!this.field16903
         && !this.field16901.method4395()
         && !this.field16901.method4296()
         && this.field16901.method3389().method19670(this.field16902.method3389())) {
         this.field16903 = this.field16901.method4404(this.field16902);
      }
   }
}
