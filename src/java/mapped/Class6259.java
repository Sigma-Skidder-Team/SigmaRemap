package mapped;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Class6259 extends Class6255 {
   @Override
   public String method19220() {
      return "list";
   }

   @Override
   public String method19221() {
      return "Shows lists of the versions from logged in players";
   }

   @Override
   public String method19223() {
      return "list";
   }

   @Override
   public boolean method19222(Class9150 var1, String[] var2) {
      Map<ViaVerList, HashSet<?>> var5 = new TreeMap(new Class3594(this));

      for (Class9150 var9 : Class8042.method27613().method27358()) {
         int var10 = Class8042.method27611().method33415(var9.method34170());
         ViaVerList var11 = ViaVerList.method18569(var10);
         if (!var5.containsKey(var11)) {
            var5.put(var11, new HashSet());
         }

         ((Set)var5.get(var11)).add(var9.method34171());
      }

      for (Entry var13 : var5.entrySet()) {
         this.method19227(
            var1, "&8[&6%s&8] (&7%d&8): &b%s", ((ViaVerList)var13.getKey()).method18580(), ((Set)var13.getValue()).size(), var13.getValue());
      }

      var5.clear();
      return true;
   }
}
