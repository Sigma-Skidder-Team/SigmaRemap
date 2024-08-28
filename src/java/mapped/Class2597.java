package mapped;

import java.util.EnumSet;
import java.util.function.Predicate;

public class Class2597 extends Class2595 {
   private static String[] field16821;
   private static final Predicate<Class7380> field16822 = Class166.method497(Class8487.field36482);
   private final Class1006 field16823;
   private final Class1655 field16824;
   private int field16825;

   public Class2597(Class1006 var1) {
      this.field16823 = var1;
      this.field16824 = var1.field5024;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658, Class2240.field14659));
   }

   @Override
   public boolean method10803() {
      if (this.field16823.method3013().nextInt(!this.field16823.method3005() ? 1000 : 50) == 0) {
         BlockPos var3 = this.field16823.method3432();
         return !field16822.test(this.field16824.method6738(var3)) ? this.field16824.method6738(var3.method8313()).method23448(Class8487.field36395) : true;
      } else {
         return false;
      }
   }

   @Override
   public void method10804() {
      this.field16825 = 40;
      this.field16824.method6786(this.field16823, (byte)10);
      this.field16823.method4230().method21666();
   }

   @Override
   public void method10807() {
      this.field16825 = 0;
   }

   @Override
   public boolean method10806() {
      return this.field16825 > 0;
   }

   public int method10811() {
      return this.field16825;
   }

   @Override
   public void method10805() {
      this.field16825 = Math.max(0, this.field16825 - 1);
      if (this.field16825 == 4) {
         BlockPos var3 = this.field16823.method3432();
         if (!field16822.test(this.field16824.method6738(var3))) {
            BlockPos var4 = var3.method8313();
            if (this.field16824.method6738(var4).method23448(Class8487.field36395)) {
               if (this.field16824.method6789().method17135(Class5462.field24224)) {
                  this.field16824.method6999(2001, var4, Class3209.method11535(Class8487.field36395.method11579()));
                  this.field16824.method6725(var4, Class8487.field36396.method11579(), 2);
               }

               this.field16823.method4235();
            }
         } else {
            if (this.field16824.method6789().method17135(Class5462.field24224)) {
               this.field16824.method7179(var3, false);
            }

            this.field16823.method4235();
         }
      }
   }
}
