package mapped;

import java.util.EnumSet;

public class Class2698 extends Class2595 {
   private static String[] field17150;
   public int field17151;
   public final Class1095 field17152;

   public Class2698(Class1095 var1) {
      this.field17152 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14658, Class2240.field14659, Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      return this.field17152.method5131();
   }

   @Override
   public boolean method10806() {
      return this.method10803() && this.field17151 > 0;
   }

   @Override
   public void method10804() {
      this.field17151 = 40;
   }

   @Override
   public void method10807() {
      Class1095.method5170(this.field17152, false);
   }

   @Override
   public void method10805() {
      this.field17151--;
   }
}
