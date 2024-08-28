package mapped;

import java.util.Random;

public class Class1039 extends Class1038 {
   private static String[] field5768;

   public Class1039(Class8992<? extends Class1039> var1, Class1655 var2) {
      super(var1, var2);
   }

   public static boolean method4666(Class8992<Class1039> var0, Class1659 var1, Class2202 var2, BlockPos var3, Random var4) {
      return method4341(var0, var1, var2, var3, var4) && (var2 == Class2202.field14393 || var1.method7022(var3));
   }

   @Override
   public boolean method4660() {
      return false;
   }

   @Override
   public Class9455 method4241() {
      return Class6067.field26686;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26689;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field26688;
   }

   @Override
   public Class9455 method4643() {
      return Class6067.field26690;
   }

   @Override
   public boolean method3114(Entity var1) {
      boolean var4 = super.method3114(var1);
      if (var4 && this.method3090().method32105() && var1 instanceof Class880) {
         float var5 = this.field5024.method6807(this.method3432()).method38328();
         ((Class880)var1).method3035(new Class2023(Class8254.field35483, 140 * (int)var5));
      }

      return var4;
   }

   @Override
   public boolean method4645() {
      return true;
   }

   @Override
   public void method4658() {
      this.method4659(Class8992.field41107);
      if (!this.method3245()) {
         this.field5024.method6869((PlayerEntity)null, 1041, this.method3432(), 0);
      }
   }

   @Override
   public Class8848 method4644() {
      return Class8848.field39973;
   }
}
