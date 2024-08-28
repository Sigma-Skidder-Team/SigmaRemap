package mapped;

public class Class3317<T extends Entity & Class1071> extends Class3257 {
   private static String[] field18825;
   private final Class8992<T> field18826;
   private final int field18827;

   public Class3317(Class5643 var1, Class8992<T> var2, int var3) {
      super(var1);
      this.field18826 = var2;
      this.field18827 = var3;
   }

   @Override
   public Class6794<Class8848> method11700(Class1655 var1, PlayerEntity var2, Class79 var3) {
      Class8848 var6 = var2.method3094(var3);
      if (!var1.field9020) {
         Entity var7 = var2.method3421();
         if (var2.method3328() && var7 instanceof Class1071 && var7.method3204() == this.field18826) {
            Class1071 var8 = (Class1071)var7;
            if (var8.method4982()) {
               var6.method32121(this.field18827, var2, var1x -> var1x.method3185(var3));
               if (!var6.method32105()) {
                  return Class6794.<Class8848>method20696(var6);
               }

               Class8848 var9 = new Class8848(Class8514.field37906);
               var9.method32148(var6.method32142());
               return Class6794.<Class8848>method20696(var9);
            }
         }

         var2.method2913(Class8876.field40098.method172(this));
         return Class6794.<Class8848>method20698(var6);
      } else {
         return Class6794.<Class8848>method20698(var6);
      }
   }
}
