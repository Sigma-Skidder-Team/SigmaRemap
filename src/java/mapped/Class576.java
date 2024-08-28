package mapped;

public class Class576 implements Runnable {
   public final Class2344 field2812;
   public final Class4336 field2813;

   public Class576(Class4336 var1, Class2344 var2) {
      this.field2813 = var1;
      this.field2812 = var2;
   }

   @Override
   public void run() {
      int var3 = 75;

      for (int var4 = 0; var4 < this.field2812.method9134(); var4++) {
         JSONObject var5 = this.field2812.method9129(var4);
         Class4330 var6 = null;
         if (var5.has("url")) {
            Util.getOSType().method8181(var5.method21773("url"));
         }

         this.field2813.field21184.method13517().method13233(var6 = new Class4330(this.field2813.field21184, "changelog" + var4, var5));
         var6.method13266(var3);
         var3 += var6.method13269();
      }
   }
}
