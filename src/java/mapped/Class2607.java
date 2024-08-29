package mapped;

import java.util.List;

public class Class2607 extends Class2605 {
   private static String[] field16857;
   public final Class1110 field16858;

   public Class2607(Class1110 var1) {
      super(var1);
      this.field16858 = var1;
   }

   @Override
   public boolean method10803() {
      return this.field16858.method4232() != null && Class1110.method5340(this.field16858) == Class2143.field14029;
   }

   @Override
   public boolean method10806() {
      Class880 var3 = this.field16858.method4232();
      if (var3 != null) {
         if (!var3.method3066()) {
            return false;
         } else if (!(var3 instanceof PlayerEntity) || !((PlayerEntity)var3).isSpectator() && !((PlayerEntity)var3).isCreative()) {
            if (!this.method10803()) {
               return false;
            } else {
               if (this.field16858.field5055 % 20 == 0) {
                  List<Class1098> var4 = this.field16858
                     .world
                     .method6772(Class1098.class, this.field16858.method3389().method19664(16.0), Class8088.field34757);
                  if (!var4.isEmpty()) {
                     for (Class1098 var6 : var4) {
                        var6.method5258();
                     }

                     return false;
                  }
               }

               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method10804() {
   }

   @Override
   public void method10807() {
      this.field16858.method4233((Class880)null);
      Class1110.method5352(this.field16858, Class2143.field14028);
   }

   @Override
   public void method10805() {
      Class880 var3 = this.field16858.method4232();
      Class1110.method5351(this.field16858, new Vector3d(var3.getPosX(), var3.method3440(0.5), var3.getPosZ()));
      if (!this.field16858.method3389().method19664(0.2F).method19670(var3.method3389())) {
         if (this.field16858.field5037 || this.field16858.field4952 > 0) {
            Class1110.method5352(this.field16858, Class2143.field14028);
         }
      } else {
         this.field16858.method3114(var3);
         Class1110.method5352(this.field16858, Class2143.field14028);
         if (!this.field16858.method3245()) {
            this.field16858.world.method6999(1039, this.field16858.getPosition(), 0);
         }
      }
   }
}
