package mapped;

public final class Class9660 {
   public final Class8223 field45146;
   public final Class1797 field45147;

   public Class9660(Class8223 var1, Class1797 var2) {
      this.field45146 = var1;
      this.field45147 = var2;
   }

   public static boolean method37711(Class1797 var0, Class8223 var1) {
      switch (var0.method7846()) {
         case 302:
         case 307:
            if (var0.method7851("Expires") == null
               && var0.method7862().method23196() == -1
               && !var0.method7862().method23199()
               && !var0.method7862().method23198()) {
               break;
            }
         case 200:
         case 203:
         case 204:
         case 300:
         case 301:
         case 308:
         case 404:
         case 405:
         case 410:
         case 414:
         case 501:
            return !var0.method7862().method23195() && !var1.method28620().method23195();
      }

      return false;
   }
}
