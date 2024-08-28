package mapped;

public class Class3006 implements Class2982 {
   private static String[] field18133;
   public final Class3906 field18134;

   public Class3006(Class3906 var1) {
      this.field18134 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      int var4 = var1.<Integer>method30555(Class4750.field22526, 0);
      int var5 = var1.<Integer>method30555(Class4750.field22526, 1);
      if (var4 != 1010) {
         if (var4 == 2001) {
            var1.method30558(Class4750.field22526, 1, this.field18134.field20160.method19376().method18528(var5));
         }
      } else {
         var1.method30558(Class4750.field22526, 1, this.field18134.field20160.method19376().method18530(var5));
      }
   }
}
