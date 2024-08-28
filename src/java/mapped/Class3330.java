package mapped;

public class Class3330 extends Class3257 {
   private static String[] field18838;

   public Class3330(Class5643 var1) {
      super(var1);
   }

   @Override
   public Class2274 method11716(Class8848 var1, PlayerEntity var2, Class880 var3, Class79 var4) {
      if (var3 instanceof Class1069 && var3.method3066()) {
         Class1069 var7 = (Class1069)var3;
         if (!var7.method4943() && var7.method4901()) {
            if (!var2.field5024.field9020) {
               var7.method4942(Class2266.field14734);
               var1.method32182(1);
            }

            return Class2274.method9002(var2.field5024.field9020);
         }
      }

      return Class2274.field14820;
   }
}
