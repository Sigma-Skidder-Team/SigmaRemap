package mapped;

public class Class3306 extends Class3257 {
   private static String[] field18813;

   public Class3306(Class5643 var1) {
      super(var1);
   }

   @Override
   public Class8848 method11709(Class8848 var1, Class1655 var2, Class880 var3) {
      Class8848 var6 = super.method11709(var1, var2, var3);
      return var3 instanceof PlayerEntity && ((PlayerEntity)var3).field4919.field29609 ? var6 : new Class8848(Class8514.field37836);
   }
}
