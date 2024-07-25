package remapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class class_4111 {
   private static String[] field_20038;

   public static List<class_7309> method_19098(List<class_7309> var0, class_6440 var1, String var2, String var3) {
      List var6 = method_19097(var0, var1, var2);
      var3 = var3.toLowerCase();
      if (var3.length() != 0) {
         ArrayList var7 = new ArrayList();
         Iterator var8 = var6.iterator();

         while (var8.hasNext()) {
            class_7309 var9 = (class_7309)var8.next();
            if (var9.method_33321().toLowerCase().startsWith(var3)) {
               var7.add(var9);
               var8.remove();
            }
         }

         Iterator var12 = var6.iterator();

         while (var12.hasNext()) {
            class_7309 var10 = (class_7309)var12.next();
            if (var10.method_33321().toLowerCase().contains(var3)) {
               var7.add(var10);
               var12.remove();
            }
         }

         var7.addAll(var6);
         return var7;
      } else {
         return var6;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static List<class_7309> method_19097(List<class_7309> var0, class_6440 var1, String var2) {
      ArrayList var5 = new ArrayList(var0);
      switch (var1) {
         case field_32870:
            Collections.sort(var5, new class_5558());
            break;
         case field_32874:
            Collections.sort(var5, new class_9102(var2));
            break;
         case field_32871:
            Collections.sort(var5, new class_2183());
            break;
         case field_32875:
            Collections.sort(var5, new class_3112());
            break;
         case field_32873:
            Collections.sort(var5, new class_83());
      }

      return var5;
   }
}
