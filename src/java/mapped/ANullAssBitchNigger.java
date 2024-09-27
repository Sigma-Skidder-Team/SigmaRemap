package mapped;

import java.util.List;

public class ANullAssBitchNigger extends BitchNiggerPlane2 {
   private static String[] field29907;

   public ANullAssBitchNigger(Class6379 var1) {
      super(var1, Class6054.class);
   }

   @Override
   public void method21088(int var1, Class1867 var2, Class8656 var3, List<Class8656> var4, Class7161 var5) {
      if (var3.method31150() != Class1954.field12714) {
         if (var3.method31150() == Class1954.field12721) {
            int var8 = (Integer)var3.method31152();
            var3.method31154(this.field29902.method19376().method18528(var8));
         }
      } else {
         Class7960.method27083((Class9738)var3.method31152());
      }

      if (var2 != null) {
         if (var2.method8128(Class1866.field10161) && var3.method31148() == 9) {
            int var9 = (Integer)var3.method31152();
            var3.method31154(this.field29902.method19376().method18528(var9));
         } else if (var2.method8128(Class1866.field10146) && var3.method31148() >= 7) {
            var3.method31149(var3.method31148() + 1);
         } else if (var2.method8127(Class1866.field10051) && var3.method31148() == 10) {
            this.method21091((Class8600)var3.method31152());
         }
      }
   }

   @Override
   public Class1867 method21089(int var1) {
      return Class8753.method31579(var1, false);
   }

   @Override
   public Class1867 method21105(int var1) {
      return Class8753.method31579(var1, true);
   }
}
