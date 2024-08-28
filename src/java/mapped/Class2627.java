package mapped;

import java.util.EnumSet;

public class Class2627 extends Class2595 {
   private static String[] field16925;
   private final Class1081 field16926;
   private Class880 field16927;

   public Class2627(Class1081 var1) {
      this.field16926 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      Class880 var3 = this.field16926.method4232();
      return this.field16926.method5020() > 0 || var3 != null && this.field16926.method3277(var3) < 9.0;
   }

   @Override
   public void method10804() {
      this.field16926.method4230().method21666();
      this.field16927 = this.field16926.method4232();
   }

   @Override
   public void method10807() {
      this.field16927 = null;
   }

   @Override
   public void method10805() {
      if (this.field16927 != null) {
         if (!(this.field16926.method3277(this.field16927) > 49.0)) {
            if (this.field16926.method4231().method35460(this.field16927)) {
               this.field16926.method5021(1);
            } else {
               this.field16926.method5021(-1);
            }
         } else {
            this.field16926.method5021(-1);
         }
      } else {
         this.field16926.method5021(-1);
      }
   }
}
