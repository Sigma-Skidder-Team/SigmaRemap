package mapped;

public class Class1085 extends Class1082 {
   private static String[] field5950;

   public Class1085(EntityType<? extends Class1085> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public Class9455 method4241() {
      return Sounds.field27059;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Sounds.field27069;
   }

   @Override
   public Class9455 method2880() {
      return Sounds.field27060;
   }

   @Override
   public Class9455 method5030() {
      return Sounds.field27071;
   }

   @Override
   public void method3054(Class8654 var1, int var2, boolean var3) {
      super.method3054(var1, var2, var3);
      Entity var6 = var1.method31109();
      if (var6 instanceof Class1081) {
         Class1081 var7 = (Class1081)var6;
         if (var7.method5026()) {
            var7.method5027();
            this.method3300(Items.field38058);
         }
      }
   }
}
