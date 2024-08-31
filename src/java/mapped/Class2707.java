package mapped;

import net.minecraft.entity.LivingEntity;

public class Class2707 extends Class2704 {
   private static String[] field17178;
   public final Class1096 field17185;

   public Class2707(Class1096 var1) {
      super(var1);
      this.field17185 = var1;
   }

   @Override
   public void method10804() {
      super.method10804();
      if (this.field17185.method3005()) {
         this.method10919();
         this.method10807();
      }
   }

   @Override
   public void method10920(Class1006 var1, LivingEntity var2) {
      if (var1 instanceof Class1096 && !var1.method3005()) {
         super.method10920(var1, var2);
      }
   }
}
