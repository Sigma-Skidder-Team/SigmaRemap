package mapped;

import java.util.List;

public class Class6907 extends Class6904 {
   private static String[] field29905;

   public Class6907(Class6384 var1) {
      super(var1, Class6053.class);
   }

   @Override
   public void method21088(int var1, Class1867 var2, Class8656 var3, List<Class8656> var4, Class7161 var5) throws Exception {
      if (var3.method31150() != Class1953.field12691) {
         if (var3.method31150() == Class1953.field12698) {
            int var8 = (Integer)var3.method31152();
            var3.method31154(this.field29902.method19376().method18528(var8));
         }
      } else {
         Class8704.method31393((Class9738)var3.method31152());
      }

      if (var2 != null) {
         if (var3.method31148() > 11 && var2.method8128(Class1870.field10429)) {
            var3.method31149(var3.method31148() + 1);
         }

         if (!var2.method8128(Class1870.field10454)) {
            if (var2 == Class1870.field10417 && var3.method31148() == 10) {
               this.method21091((Class8600)var3.method31152());
            }
         } else if (var3.method31148() != 18) {
            if (var3.method31148() > 18) {
               var3.method31149(var3.method31148() - 1);
            }
         } else {
            var4.remove(var3);
         }
      }
   }

   @Override
   public int method21106(int var1) {
      return Class8691.method31314(var1);
   }

   @Override
   public Class1867 method21089(int var1) {
      return Class9114.method33997(var1);
   }
}
