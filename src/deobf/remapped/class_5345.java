package remapped;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class class_5345 extends class_4403 {
   @Override
   public String method_20527() {
      return "pps";
   }

   @Override
   public String method_20529() {
      return "Shows the packets per second of online players";
   }

   @Override
   public String method_20524() {
      return "pps";
   }

   @Override
   public boolean method_20525(class_7235 var1, String[] var2) {
      HashMap var5 = new HashMap();
      int var6 = 0;
      int var7 = 0;
      long var8 = 0L;

      for (class_7235 var13 : class_3446.method_15886().method_34618()) {
         int var14 = class_3446.method_15885().method_38378(var13.method_33104());
         if (!var5.containsKey(var14)) {
            var5.put(var14, new HashSet());
         }

         class_1455 var15 = class_3446.method_15883().method_33736(var13.method_33104());
         if (var15 != null && var15.method_6711() > -1L) {
            ((Set)var5.get(var14)).add(var13.method_33106() + " (" + var15.method_6711() + " PPS)");
            var6 = (int)((long)var6 + var15.method_6711());
            if (var15.method_6711() > var8) {
               var8 = var15.method_6711();
            }

            var7++;
         }
      }

      TreeMap var16 = new TreeMap(var5);
      this.method_20528(var1, "&4Live Packets Per Second", new Object[0]);
      if (var7 > 1) {
         this.method_20528(var1, "&cAverage: &f" + var6 / var7, new Object[0]);
         this.method_20528(var1, "&cHighest: &f" + var8, new Object[0]);
      }

      if (var7 == 0) {
         this.method_20528(var1, "&cNo clients to display.", new Object[0]);
      }

      for (Entry var18 : var16.entrySet()) {
         this.method_20528(var1, "&8[&6%s&8]: &b%s", new Object[]{class_412.method_2051((Integer)var18.getKey()).method_2045(), var18.getValue()});
      }

      var16.clear();
      return true;
   }
}
