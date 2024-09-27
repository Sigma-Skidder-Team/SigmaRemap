package mapped;

import java.util.UUID;

public class Class8121 {
   public static void method28119(Class6356 var0) {
      BitchNiggerOffPlane var3 = new BitchNiggerOffPlane(var0, Class8121::method28120, Class8121::method28121);
      var0.method19360(Class1916.field11580, new Class3829());
      var0.method19360(Class1916.field11553, new Class3792());
      var0.method19360(Class1916.field11555, new Class3883());
      var3.method28132(Class1916.field11557);
      var3.method28126(Class1916.field11554, BruhMotha.field22571);
      var3.method28133(Class1916.field11573, BruhMotha.field22569);
      var3.method28127(Class1916.field11556, BruhMotha.field22569);
      var3.method28134(Class1916.field11621, BruhMotha.field22569);
      var0.method19360(Class1916.field11604, new Class3943());
      new Class4660(var0, Class8121::method28120).method14631(Class1916.field11624);
      var3.method28131(Class1926.field11963, BruhMotha.field22569);
      var3.method28130(Class1926.field11993, BruhMotha.field22569);
      var0.method19364(Class1926.field11964, new Class3957());
      var0.method19364(Class1926.field11966, new Class3942());
      var3.method28135(Class1916.field11569, BruhMotha.field22569, BruhMotha.field22528);
   }

   public static void method28120(Class9738 var0) {
      if (var0 != null) {
         if (var0.method38161() == 771 && var0.method38167() != null) {
            Class72 var3 = var0.method38167();
            Class61 var4 = var3.<Class61>method235("SkullOwner");
            if (var4 instanceof Class72) {
               Class72 var5 = (Class72)var4;
               Class61 var6 = var5.<Class61>method235("Id");
               if (var6 instanceof Class71) {
                  UUID var7 = UUID.fromString((String)var6.method205());
                  var5.<Class62>method236(new Class62("Id", Class4794.method14914(var7)));
               }
            }
         }

         method28122(var0);
         var0.method38162(Class6356.field27918.method18530(var0.method38161()));
      }
   }

   public static void method28121(Class9738 var0) {
      if (var0 != null) {
         var0.method38162(Class6356.field27918.method18531(var0.method38161()));
         if (var0.method38161() == 771 && var0.method38167() != null) {
            Class72 var3 = var0.method38167();
            Class61 var4 = var3.<Class61>method235("SkullOwner");
            if (var4 instanceof Class72) {
               Class72 var5 = (Class72)var4;
               Class61 var6 = var5.<Class61>method235("Id");
               if (var6 instanceof Class62) {
                  UUID var7 = Class4794.method14913((int[])var6.method205());
                  var5.<Class71>method236(new Class71("Id", var7.toString()));
               }
            }
         }

         method28123(var0);
      }
   }

   public static void method28122(Class9738 var0) {
      if (var0.method38167() != null) {
         Class60 var3 = var0.method38167().<Class60>method235("AttributeModifiers");
         if (var3 != null) {
            for (Class61 var5 : var3) {
               Class72 var6 = (Class72)var5;
               method28124(var6, "AttributeName", false);
               method28124(var6, "Name", false);
               Class61 var7 = var6.<Class61>method235("UUIDLeast");
               if (var7 != null) {
                  Class61 var8 = var6.<Class61>method235("UUIDMost");
                  int[] var9 = Class4794.method14915(((Number)var7.method205()).longValue(), ((Number)var8.method205()).longValue());
                  var6.<Class62>method236(new Class62("UUID", var9));
               }
            }
         }
      }
   }

   public static void method28123(Class9738 var0) {
      if (var0.method38167() != null) {
         Class60 var3 = var0.method38167().<Class60>method235("AttributeModifiers");
         if (var3 != null) {
            for (Class61 var5 : var3) {
               Class72 var6 = (Class72)var5;
               method28124(var6, "AttributeName", true);
               method28124(var6, "Name", true);
               Class62 var7 = var6.<Class62>method235("UUID");
               if (var7 != null) {
                  UUID var8 = Class4794.method14913(var7.method205());
                  var6.<Class75>method236(new Class75("UUIDLeast", var8.getLeastSignificantBits()));
                  var6.<Class75>method236(new Class75("UUIDMost", var8.getMostSignificantBits()));
               }
            }
         }
      }
   }

   public static void method28124(Class72 var0, String var1, boolean var2) {
      Class71 var5 = var0.<Class71>method235(var1);
      if (var5 != null) {
         String var6 = var5.method205();
         if (var2 && !var6.startsWith("minecraft:")) {
            var6 = "minecraft:" + var6;
         }

         String var7 = (String)(!var2 ? Class6356.field27918.method18555() : Class6356.field27918.method18555().inverse()).get(var6);
         if (var7 != null) {
            var5.method231(var7);
         }
      }
   }
}
