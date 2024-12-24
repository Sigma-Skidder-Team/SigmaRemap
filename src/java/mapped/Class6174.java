package mapped;

import java.io.IOException;

public final class Class6174 implements Class6172 {
   public final Class8530 field27610;

   public Class6174(Class8530 var1) {
      this.field27610 = var1;
   }

   @Override
   public Class1797 method19074(Class8165 var1) throws IOException {
      Class1797 var4 = this.field27610 != null ? this.field27610.method30259(var1.method28408()) : null;
      long var5 = System.currentTimeMillis();
      Class9660 var7 = new Class8687(var5, var1.method28408(), var4).method31302();
      Class8223 var8 = var7.field45146;
      Class1797 var9 = var7.field45147;
      if (this.field27610 != null) {
         this.field27610.method30264(var7);
      }

      if (var4 != null && var9 == null) {
         Class9474.method36535(var4.method7855());
      }

      if (var8 == null && var9 == null) {
         return new Class9279()
            .method34977(var1.method28408())
            .method34978(Class2201.field14386)
            .method34979(504)
            .method34980("Unsatisfiable Request (only-if-cached)")
            .method34986(Class9474.field44017)
            .method34992(-1L)
            .method34993(System.currentTimeMillis())
            .method34994();
      } else if (var8 == null) {
         return var9.method7856().method34988(method19080(var9)).method34994();
      } else {
         Class1797 var10 = null;

         try {
            var10 = var1.method28409(var8);
         } finally {
            if (var10 == null && var4 != null) {
               Class9474.method36535(var4.method7855());
            }
         }

         if (var9 != null) {
            if (var10.method7846() == 304) {
               Class1797 var17 = var9.method7856()
                  .method34985(method19082())
                  .method34992(var10.method7863())
                  .method34993(var10.method7864())
                  .method34988(method19080(var9))
                  .method34987(method19080(var10))
                  .method34994();
               var10.method7855().close();
               this.field27610.method30263();
               this.field27610.method30262(var9, var17);
               return var17;
            }

            Class9474.method36535(var9.method7855());
         }

         Class1797 var11 = var10.method7856().method34988(method19080(var9)).method34987(method19080(var10)).method34994();
         if (this.field27610 != null) {
            if (Class8394.method29453(var11) && Class9660.method37711(var11, var8)) {
               Class6441 var12 = this.field27610.method30260(var11);
               return this.method19081(var12, var11);
            }

            if (Class8059.method27666(var8.method28613())) {
               try {
                  this.field27610.method30261(var8);
               } catch (IOException var15) {
               }
            }
         }

         return var11;
      }
   }

   private static Class1797 method19080(Class1797 var0) {
      return var0 != null && var0.method7855() != null ? var0.method7856().method34986(null).method34994() : var0;
   }

   private Class1797 method19081(Class6441 var1, Class1797 var2) throws IOException {
      if (var1 != null) {
         Sink var5 = var1.method19554();
         if (var5 != null) {
            Class1735 var6 = var2.method7855().method7836();
            Class1733 var7 = Class7001.method21697(var5);
            Class1744 var8 = new Class1744(this, var6, var1, var7);
            return var2.method7856().method34986(new Class1796(var2.method7853(), Class7001.method21696(var8))).method34994();
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   private static Class9371 method19082() {
      Class9192 var4 = new Class9192();
      return var4.method34442();
   }


}
