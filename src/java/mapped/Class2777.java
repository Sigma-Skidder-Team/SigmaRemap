package mapped;

import java.util.EnumSet;

public class Class2777 extends Class2595 {
   private static String[] field17370;
   private static final Class8522 field17371 = new Class8522().method30203(6.0).method30205().method30204();
   private final Class1058 field17372;
   private Class1042 field17373;
   private int field17374;

   public Class2777(Class1058 var1) {
      this.field17372 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
   }

   @Override
   public boolean method10803() {
      if (this.field17372.world.method6740()) {
         if (this.field17372.method3013().nextInt(8000) == 0) {
            this.field17373 = this.field17372
               .world
               .<Class1042>method7191(
                  Class1042.class,
                  field17371,
                  this.field17372,
                  this.field17372.getPosX(),
                  this.field17372.getPosY(),
                  this.field17372.getPosZ(),
                  this.field17372.method3389().method19663(6.0, 2.0, 6.0)
               );
            return this.field17373 != null;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      return this.field17374 > 0;
   }

   @Override
   public void method10804() {
      this.field17374 = 400;
      this.field17372.method4867(true);
   }

   @Override
   public void method10807() {
      this.field17372.method4867(false);
      this.field17373 = null;
   }

   @Override
   public void method10805() {
      this.field17372.method4227().method28040(this.field17373, 30.0F, 30.0F);
      this.field17374--;
   }
}
