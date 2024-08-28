package mapped;

import java.util.Random;

public class Class1083 extends Class1082 {
   private static String[] field5948;

   public Class1083(Class8992<? extends Class1083> var1, Class1655 var2) {
      super(var1, var2);
   }

   public static boolean method5033(Class8992<Class1083> var0, Class1659 var1, Class2202 var2, BlockPos var3, Random var4) {
      return method4341(var0, var1, var2, var3, var4) && (var2 == Class2202.field14393 || var1.method7022(var3));
   }

   @Override
   public Class9455 method4241() {
      return Class6067.field27138;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field27140;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field27139;
   }

   @Override
   public Class9455 method5030() {
      return Class6067.field27141;
   }

   @Override
   public Class884 method5032(ItemStack var1, float var2) {
      Class884 var5 = super.method5032(var1, var2);
      if (var5 instanceof Class887) {
         ((Class887)var5).method3500(new Class2023(Class8254.field35468, 600));
      }

      return var5;
   }
}
