package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8802 {
   private static final Logger field39629 = LogManager.getLogger();
   public static Class8705<Class1655> field39630 = null;

   public static <T extends Class5104> void method31779(Packet<T> var0, T var1, Class1657 var2) throws Class2466 {
      method31780(var0, var1, var2.method6715());
   }

   public static <T extends Class5104> void method31780(Packet<T> var0, T var1, Class318<?> var2) throws Class2466 {
      if (var2.method1629()) {
         method31781(var0);
      } else {
         var2.execute(() -> {
            method31781(var0);
            if (!var1.method15589().method30707()) {
               field39629.debug("Ignoring packet due to disconnection: " + var0);
            } else {
               var0.method17180(var1);
            }
         });
         throw Class2466.field16549;
      }
   }

   public static void method31781(Packet var0) {
      if (var0 instanceof Class5473) {
         Minecraft.getInstance().field1287.method932();
      }

      if (!(var0 instanceof Class5545)) {
         if (!(var0 instanceof Class5499)) {
            field39630 = null;
         } else {
            Class5499 var3 = (Class5499)var0;
            field39630 = var3.method17295();
         }
      } else {
         Class5545 var4 = (Class5545)var0;
         field39630 = var4.method17433();
      }
   }
}
