package mapped;

public class Class3274 extends Class3257 {
   private static String[] field18774;

   public Class3274(Class5643 var1) {
      super(var1);
   }

   @Override
   public Class8848 method11709(Class8848 var1, Class1655 var2, Class880 var3) {
      if (var3 instanceof Class878) {
         Class878 var6 = (Class878)var3;
         Class9551.field44490.method15174(var6, var1);
         var6.method2913(Class8876.field40098.method172(this));
      }

      if (var3 instanceof PlayerEntity && !((PlayerEntity)var3).field4919.field29609) {
         var1.method32182(1);
      }

      if (!var2.field9020) {
         var3.method3030();
      }

      return !var1.method32105() ? var1 : new Class8848(Class8514.field37882);
   }

   @Override
   public int method11728(Class8848 var1) {
      return 32;
   }

   @Override
   public Class2103 method11727(Class8848 var1) {
      return Class2103.field13708;
   }

   @Override
   public Class6794<Class8848> method11700(Class1655 var1, PlayerEntity var2, Class79 var3) {
      return Class8482.method29977(var1, var2, var3);
   }
}
