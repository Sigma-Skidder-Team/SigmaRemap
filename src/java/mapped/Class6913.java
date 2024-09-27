package mapped;

import java.util.List;

public class Class6913 extends BitchNiggerPlane2 {
   private static String[] field29910;

   public Class6913(Class6357 var1) {
      super(var1, Class6035.class);
      this.method21098(Class1869.values(), Class1874.class);
   }

   @Override
   public void method21088(int var1, Class1867 var2, Class8656 var3, List<Class8656> var4, Class7161 var5) throws Exception {
      if (var3.method31150() != Class1953.field12691) {
         if (var3.method31150() == Class1953.field12698) {
            int var8 = (Integer)var3.method31152();
            var3.method31154(this.field29902.method19376().method18528(var8));
         }
      } else {
         Class9550.method36997((Class9738)var3.method31152());
      }

      if (var2 != null) {
         if (!var2.method8128(Class1874.field10943)) {
            if (var2.method8127(Class1874.field10874) && var3.method31148() == 10) {
               this.method21091((Class8600)var3.method31152());
            }
         } else if (var3.method31148() != 15) {
            if (var3.method31148() == 16) {
               var3.method31149(15);
            }
         } else {
            var3.method31149(16);
         }
      }
   }

   @Override
   public Class1867 method21089(int var1) {
      return Class8769.method31633(var1);
   }
}
