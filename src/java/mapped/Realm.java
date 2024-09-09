package mapped;

import com.mojang.datafixers.util.Either;

public class Realm extends Thread {
   public final Class6108 field1577;
   public final Class804 field1578;

   public Realm(Class804 var1, String var2, Class6108 var3) {
      super(var2);
      this.field1578 = var1;
      this.field1577 = var3;
   }

   @Override
   public void run() {
      Class6108 var3 = this.field1577;
      Class4624 var4 = Class4624.method14543();

      while (var3 != null) {
         Either var5 = Class804.method1978(this.field1578, var3, var4);
         var3 = Class804.method1979(this.field1578)
            .<Class6108>supplyAsync(
               () -> {
                  if (var5.right().isPresent()) {
                     Class804.method1980().error("Couldn't fetch templates: {}", var5.right().get());
                     if (Class804.method1981(this.field1578).method6119()) {
                        Class804.method1982(this.field1578, Class9729.method38112(I18n.format("mco.template.select.failure")));
                     }

                     return null;
                  } else {
                     Class6108 var4x = (Class6108)var5.left().get();

                     for (Class6130 var6 : var4x.field27365) {
                        Class804.method1981(this.field1578).method6118(var6);
                     }

                     if (!var4x.field27365.isEmpty()) {
                        return var4x;
                     } else {
                        if (Class804.method1981(this.field1578).method6119()) {
                           String var7 = I18n.format("mco.template.select.none", "%link");
                           Class6102 var8 = Class6102.method18867(
                              I18n.format("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator"
                           );
                           Class804.method1982(this.field1578, Class9729.method38112(var7, var8));
                        }

                        return null;
                     }
                  }
               }
            )
            .join();
      }
   }
}
