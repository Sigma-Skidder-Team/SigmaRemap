package mapped;

import java.util.Random;

public class Class3193 extends Class3194 implements Class3196 {
   private static String[] field18466;
   public static final Class8554 field18467 = Class8820.field39760;
   public static final Class6408 field18468 = Class3209.method11539(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   private final Class7665 field18469;

   public Class3193(Class7665 var1, Class7929 var2) {
      super(var2);
      this.field18469 = var1;
      this.method11578(this.field18612.method35393().method23465(field18467, Integer.valueOf(0)));
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field18468;
   }

   @Override
   public void method11484(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
      if (var2.method7015(var3.method8311()) >= 9 && var4.nextInt(7) == 0) {
         this.method11485(var2, var3, var1, var4);
      }
   }

   public void method11485(Class1657 var1, BlockPos var2, Class7380 var3, Random var4) {
      if (var3.<Integer>method23463(field18467) != 0) {
         this.field18469.method25182(var1, var1.method6883().method7370(), var2, var3, var4);
      } else {
         var1.method6725(var2, var3.method23459(field18467), 4);
      }
   }

   @Override
   public boolean method11486(Class1665 var1, BlockPos var2, Class7380 var3, boolean var4) {
      return true;
   }

   @Override
   public boolean method11487(Class1655 var1, Random var2, BlockPos var3, Class7380 var4) {
      return (double)var1.field9016.nextFloat() < 0.45;
   }

   @Override
   public void method11488(Class1657 var1, Random var2, BlockPos var3, Class7380 var4) {
      this.method11485(var1, var3, var4, var2);
   }

   @Override
   public void method11489(Class7558<Class3209, Class7380> var1) {
      var1.method24737(field18467);
   }
}
