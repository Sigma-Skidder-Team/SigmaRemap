package mapped;

import com.mentalfrostbyte.jello.viaversion.data.PlayerData;

import java.util.*;
import java.util.Map.Entry;

public class Class6260 extends Class6255 {
   @Override
   public String method19220() {
      return "pps";
   }

   @Override
   public String method19221() {
      return "Shows the packets per second of online players";
   }

   @Override
   public String method19223() {
      return "pps";
   }

   @Override
   public boolean method19222(PlayerData var1, String[] var2) {
      Map<Integer, Set<String>> var5 = new HashMap<>();
      int var6 = 0;
      int var7 = 0;
      long var8 = 0L;

      for (PlayerData var13 : ViaVersion3.method27613().getPlayerData()) {
         int var14 = ViaVersion3.method27611().method33415(var13.method34170());
         if (!var5.containsKey(var14)) {
            var5.put(var14, new HashSet<>());
         }

         Class7161 var15 = ViaVersion3.getInstance().method34431(var13.method34170());
         if (var15 != null && var15.method22482() > -1L) {
            var5.get(var14).add(var13.method34171() + " (" + var15.method22482() + " PPS)");
            var6 = (int)((long)var6 + var15.method22482());
            if (var15.method22482() > var8) {
               var8 = var15.method22482();
            }

            var7++;
         }
      }

      Map<Integer, Set<String>> var16 = new TreeMap<>(var5);
      this.method19227(var1, "&4Live Packets Per Second", new Object[0]);
      if (var7 > 1) {
         this.method19227(var1, "&cAverage: &f" + var6 / var7, new Object[0]);
         this.method19227(var1, "&cHighest: &f" + var8, new Object[0]);
      }

      if (var7 == 0) {
         this.method19227(var1, "&cNo clients to display.", new Object[0]);
      }

      for (Entry<Integer, Set<String>> var18 : var16.entrySet()) {
         this.method19227(var1, "&8[&6%s&8]: &b%s", new Object[]{ViaVerList.method18569(var18.getKey()).method18580(), var18.getValue()});
      }

      var16.clear();
      return true;
   }
}
