package mapped;

import java.util.List;

public class Class6911 extends BitchNiggerPlane2 {
   private static String[] field29909;

   public Class6911(Class6356 var1) {
      super(var1, Class6056.class);
      this.method21100(Class1870.field10503, Class1869.field10369);
      this.method21098(Class1870.values(), Class1869.class);
   }

   @Override
   public void method21088(int var1, Class1867 var2, Class8656 var3, List<Class8656> var4, Class7161 var5) throws Exception {
      if (var3.method31150() != Class1953.field12691) {
         if (var3.method31150() == Class1953.field12698) {
            int var8 = (Integer)var3.method31152();
            var3.method31154(this.field29902.method19376().method18528(var8));
         }
      } else {
         Class8121.method28120((Class9738)var3.method31152());
      }

      if (var2 != null) {
         if (var2 != Class1869.field10279) {
            if (var2.method8128(Class1869.field10386)) {
               if (var3.method31148() != 8) {
                  if (var3.method31148() > 8) {
                     var3.method31149(var3.method31148() - 1);
                  }
               } else {
                  var4.remove(var3);
               }
            }
         } else if (var3.method31148() == 10) {
            this.method21091((Class8600)var3.method31152());
         }
      }
   }

   @Override
   public Class1867 method21089(int var1) {
      return Class9177.method34324(var1);
   }
}
