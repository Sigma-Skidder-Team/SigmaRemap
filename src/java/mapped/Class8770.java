package mapped;

import com.google.common.collect.Sets;
import java.util.Set;

public class Class8770 {
   private static final String field39466 = "ViaVersion|" + Class6371.class.getSimpleName();
   private static final Set<String> field39467 = Sets.newHashSet("crafting_special_banneraddpattern", "crafting_special_repairitem");
   private static final Class7080 field39468 = new Class7084();

   public static void method31634(ViaVersion7 var0) {
      Class8123 var3 = new Class8123(var0, Class8770::method31635, Class8770::method31636);
      var3.method28132(Class1932.field12206);
      var3.method28134(Class1932.field12263, Class4750.field22569);
      var0.method19361(Class1932.field12202, null, new Class3813());
      var3.method28126(Class1932.field12203, Class4750.field22571);
      var3.method28127(Class1932.field12205, Class4750.field22569);
      var0.method19360(Class1932.field12207, new Class3980());
      var3.method28128(Class1932.field12248, Class4750.field22569);
      Class4661 var4 = new Class4661(var0, Class8770::method31635);
      var0.method19360(Class1932.field12266, new Class3812(var4));
      var3.method28131(Class1922.field11826, Class4750.field22569);
      var0.method19364(Class1922.field11850, new Class3945());
      var3.method28130(Class1922.field11855, Class4750.field22569);
      var3.method28135(Class1932.field12218, Class4750.field22569, Class4750.field22532);
   }

   public static void method31635(Class9738 var0) {
      if (var0 != null) {
         var0.method38162(Class6371.field27938.method18530(var0.method38161()));
         if (var0.method38167() != null) {
            Class61 var3 = var0.method38167().<Class61>method235("display");
            if (var3 instanceof Class72) {
               Class72 var4 = (Class72)var3;
               Class61 var5 = var4.<Class61>method235("Lore");
               if (var5 instanceof Class60) {
                  Class60 var6 = (Class60)var5;
                  var4.<Class60>method236(new Class60(field39466 + "|Lore", var6.clone().method205()));

                  for (Class61 var8 : var6) {
                     if (var8 instanceof Class71) {
                        String var9 = Class2980.method11392(((Class71)var8).method205(), Class2307.field15782, true);
                        ((Class71)var8).method231(var9);
                     }
                  }
               }
            }
         }
      }
   }

   public static void method31636(Class9738 var0) {
      if (var0 != null) {
         var0.method38162(Class6371.field27938.method18531(var0.method38161()));
         if (var0.method38167() != null) {
            Class61 var3 = var0.method38167().<Class61>method235("display");
            if (var3 instanceof Class72) {
               Class72 var4 = (Class72)var3;
               Class61 var5 = var4.<Class61>method235("Lore");
               if (var5 instanceof Class60) {
                  Class60 var6 = (Class60)var5;
                  Class60 var7 = var4.<Class60>method237(field39466 + "|Lore");
                  if (var7 == null) {
                     for (Class61 var9 : var6) {
                        if (var9 instanceof Class71) {
                           ((Class71)var9).method231(Class2980.method11396(((Class71)var9).method205()));
                        }
                     }
                  } else {
                     var4.<Class60>method236(new Class60("Lore", var7.method205()));
                  }
               }
            }
         }
      }
   }

   // $VF: synthetic method
   public static Class7080 method31637() {
      return field39468;
   }

   // $VF: synthetic method
   public static Set method31638() {
      return field39467;
   }
}
