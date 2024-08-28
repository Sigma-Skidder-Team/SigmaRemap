package mapped;

import java.util.List;

public class Class6905 extends Class6904 {
   private static String[] field29904;

   public Class6905(Class6372 var1) {
      super(var1, Class6059.class);
   }

   @Override
   public void method21088(int var1, Class1867 var2, Class8656 var3, List<Class8656> var4, Class7161 var5) {
      if (var3.method31152() instanceof Class9738) {
         Class8417.method29572((Class9738)var3.method31152());
      }

      if (var2 != null) {
         if (var2 == Class1871.field10578 && var3.method31148() == 12) {
            var3.method31149(13);
         }
      }
   }

   @Override
   public Class1867 method21089(int var1) {
      return Class7750.method25671(var1, false);
   }

   @Override
   public Class1867 method21105(int var1) {
      return Class7750.method25671(var1, true);
   }
}
