package mapped;

import java.util.Random;

public class Class2787 extends Class2785 {
   private static String[] field17405;
   private final Class1088 field17414;

   public Class2787(Class1088 var1, double var2) {
      super(var1, var2);
      this.field17414 = var1;
   }

   @Override
   public boolean method10803() {
      return super.method10803() && !this.field17414.method5045();
   }

   @Override
   public void method10979() {
      ServerPlayerEntity var3 = this.field17407.method4506();
      if (var3 == null && this.field17410.method4506() != null) {
         var3 = this.field17410.method4506();
      }

      if (var3 != null) {
         var3.method2911(Stats.field40136);
         CriteriaTriggers.field44479.method15112(var3, this.field17407, this.field17410, (Class1045)null);
      }

      Class1088.method5062(this.field17414, true);
      this.field17407.method4508();
      this.field17410.method4508();
      Random var4 = this.field17407.getRNG();
      if (this.field17409.getGameRules().getBoolean(Class5462.field24227)) {
         this.field17409
            .addEntity(
               new ExperienceOrbEntity(this.field17409, this.field17407.getPosX(), this.field17407.getPosY(), this.field17407.getPosZ(), var4.nextInt(7) + 1)
            );
      }
   }
}
