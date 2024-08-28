package mapped;

public class Class3458 extends Class3209 {
   private static String[] field19278;
   public static final Class8551 field19279 = Class8820.field39709;

   public Class3458(Class7929 var1) {
      super(var1);
      this.method11578(this.method11579().method23465(field19279, Boolean.valueOf(false)));
   }

   @Override
   public void method11589(Class7380 var1, Class1655 var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (!var4.method23448(var1.method23383()) && var2.method6780(var3)) {
         method12131(var2, var3);
         var2.method6728(var3, false);
      }
   }

   @Override
   public void method11506(Class7380 var1, Class1655 var2, BlockPos var3, Class3209 var4, BlockPos var5, boolean var6) {
      if (var2.method6780(var3)) {
         method12131(var2, var3);
         var2.method6728(var3, false);
      }
   }

   @Override
   public void method11574(Class1655 var1, BlockPos var2, Class7380 var3, PlayerEntity var4) {
      if (!var1.method6714() && !var4.method2801() && var3.<Boolean>method23463(field19279)) {
         method12131(var1, var2);
      }

      super.method11574(var1, var2, var3, var4);
   }

   @Override
   public void method11560(Class1655 var1, BlockPos var2, Class7782 var3) {
      if (!var1.field9020) {
         Class1004 var6 = new Class1004(var1, (double)var2.method8304() + 0.5, (double)var2.getY(), (double)var2.method8306() + 0.5, var3.method25789());
         var6.method4182((short)(var1.field9016.nextInt(var6.method4184() / 4) + var6.method4184() / 8));
         var1.method6916(var6);
      }
   }

   public static void method12131(Class1655 var0, BlockPos var1) {
      method12132(var0, var1, (Class880)null);
   }

   private static void method12132(Class1655 var0, BlockPos var1, Class880 var2) {
      if (!var0.field9020) {
         Class1004 var5 = new Class1004(var0, (double)var1.method8304() + 0.5, (double)var1.getY(), (double)var1.method8306() + 0.5, var2);
         var0.method6916(var5);
         var0.method6743((PlayerEntity)null, var5.getPosX(), var5.getPosY(), var5.getPosZ(), Class6067.field27146, Class2266.field14732, 1.0F, 1.0F);
      }
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      Class8848 var9 = var4.method3094(var5);
      Class3257 var10 = var9.method32107();
      if (var10 != Class8514.field37794 && var10 != Class8514.field38046) {
         return super.method11505(var1, var2, var3, var4, var5, var6);
      } else {
         method12132(var2, var3, var4);
         var2.method6725(var3, Class8487.field36387.method11579(), 11);
         if (!var4.method2801()) {
            if (var10 != Class8514.field37794) {
               var9.method32182(1);
            } else {
               var9.method32121(1, var4, var1x -> var1x.method3185(var5));
            }
         }

         return Class2274.method9002(var2.field9020);
      }
   }

   @Override
   public void method11595(Class1655 var1, Class7380 var2, Class8711 var3, Class882 var4) {
      if (!var1.field9020) {
         Entity var7 = var4.method3460();
         if (var4.method3327()) {
            BlockPos var8 = var3.method31423();
            method12132(var1, var8, !(var7 instanceof Class880) ? null : (Class880)var7);
            var1.method6728(var8, false);
         }
      }
   }

   @Override
   public boolean method11576(Class7782 var1) {
      return false;
   }

   @Override
   public void method11489(Class7558<Class3209, Class7380> var1) {
      var1.method24737(field19279);
   }
}
