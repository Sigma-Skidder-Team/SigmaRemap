package mapped;

import java.util.UUID;

public class Class9239 {
   public static void method34749(Class6356 var0) {
      Class9524 var3 = new Class9524(var0, BruhMotha.field22552);
      var3.method36799(Class1916.field11544);
      var3.method36800(Class1916.field11545);
      var3.method36801(Class1916.field11549);
      var3.method36803(Class1916.field11541);
      var0.method19360(Class1916.field11570, new Class3949());
      var0.method19360(Class1916.field11567, new Class3956(var0));
      var0.method19360(Class1916.field11543, new Class3857());
      var3.method36804(Class1916.field11568, 1010, 2001);
   }

   private static void method34750(Class72 var0) {
      Class71 var3 = var0.<Class71>method235("id");
      if (var3 != null) {
         String var4 = var3.method205();
         if (!var4.equals("minecraft:conduit")) {
            if (var4.equals("minecraft:skull") && var0.method235("Owner") instanceof Class72) {
               Class72 var5 = var0.<Class72>method237("Owner");
               Class71 var6 = var5.<Class71>method237("Id");
               if (var6 != null) {
                  UUID var7 = UUID.fromString(var6.method205());
                  var5.<Class62>method236(new Class62("Id", Class4794.method14914(var7)));
               }

               Class72 var12 = new Class72("SkullOwner");

               for (Class61 var9 : var5) {
                  var12.<Class61>method236(var9);
               }

               var0.<Class72>method236(var12);
            }
         } else {
            Class61 var10 = var0.<Class61>method237("target_uuid");
            if (!(var10 instanceof Class71)) {
               return;
            }

            UUID var11 = UUID.fromString((String)var10.method205());
            var0.<Class62>method236(new Class62("Target", Class4794.method14914(var11)));
         }
      }
   }

   // $VF: synthetic method
   public static void method34751(Class72 var0) {
      method34750(var0);
   }
}
