package remapped;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class class_1880 extends class_4403 {
   @Override
   public String method_20527() {
      return "list";
   }

   @Override
   public String method_20529() {
      return "Shows lists of the versions from logged in players";
   }

   @Override
   public String method_20524() {
      return "list";
   }

   @Override
   public boolean method_20525(class_7235 var1, String[] var2) {
      TreeMap var5 = new TreeMap(new class_6176(this));

      for (class_7235 var9 : class_3446.method_15886().method_34618()) {
         int var10 = class_3446.method_15885().method_38378(var9.method_33104());
         class_412 var11 = class_412.method_2051(var10);
         if (!var5.containsKey(var11)) {
            var5.put(var11, new HashSet());
         }

         ((Set)var5.get(var11)).add(var9.method_33106());
      }

      for (Entry var13 : var5.entrySet()) {
         this.method_20528(
            var1, "&8[&6%s&8] (&7%d&8): &b%s", new Object[]{((class_412)var13.getKey()).method_2045(), ((Set)var13.getValue()).size(), var13.getValue()}
         );
      }

      var5.clear();
      return true;
   }
}
