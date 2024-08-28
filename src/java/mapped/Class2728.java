package mapped;

import java.util.EnumSet;

public class Class2728 extends Class2595 {
   private static String[] field17235;
   private final Class1026 field17236;
   public final Class1026 field17237;

   public Class2728(Class1026 var1, Class1026 var2) {
      this.field17237 = var1;
      this.field17236 = var2;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      Class7699 var3 = this.field17236.method4551();
      return this.field17236.method3066() && this.field17236.method4232() == null && var3 != null && var3.method25393();
   }

   @Override
   public void method10804() {
      this.field17236.method4556(true);
      super.method10804();
   }

   @Override
   public void method10807() {
      this.field17236.method4556(false);
      super.method10807();
   }

   @Override
   public void method10805() {
      if (!this.field17236.method3245() && Class1026.method4560(this.field17236).nextInt(100) == 0) {
         this.field17237.method2863(this.field17237.method4546(), Class1026.method4561(this.field17237), Class1026.method4562(this.field17237));
      }

      if (!this.field17236.method3328() && Class1026.method4563(this.field17236).nextInt(50) == 0) {
         this.field17236.method4229().method27049();
      }

      super.method10805();
   }
}
