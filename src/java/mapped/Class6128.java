package mapped;

import com.google.common.base.Joiner;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6128 extends Class6109 {
   private static final Logger field27442 = LogManager.getLogger();
   public long field27443;
   public String field27444;
   public String field27445;
   public String field27446;
   public Class2261 field27447;
   public String field27448;
   public String field27449;
   public List<Class6114> field27450;
   public Map<Integer, Class6125> field27451;
   public boolean field27452;
   public boolean field27453;
   public int field27454;
   public Class2049 field27455;
   public int field27456;
   public String field27457;
   public int field27458;
   public String field27459;
   public Class6129 field27460 = new Class6129();

   public String method18906() {
      return this.field27446;
   }

   public String method18907() {
      return this.field27445;
   }

   public String method18908() {
      return this.field27457;
   }

   public void method18909(String var1) {
      this.field27445 = var1;
   }

   public void method18910(String var1) {
      this.field27446 = var1;
   }

   public void method18911(Class6124 var1) {
      ArrayList var4 = Lists.newArrayList();
      int var5 = 0;

      for (String var7 : var1.field27420) {
         if (!var7.equals(Minecraft.getInstance().method1533().method21525())) {
            String var8 = "";

            try {
               var8 = Class9740.method38171(var7);
            } catch (Exception var10) {
               field27442.error("Could not get name for " + var7, var10);
               continue;
            }

            var4.add(var8);
            var5++;
         }
      }

      this.field27460.field27461 = String.valueOf(var5);
      this.field27460.field27462 = Joiner.on('\n').join(var4);
   }

   public static Class6128 method18912(JsonObject var0) {
      Class6128 var3 = new Class6128();

      try {
         var3.field27443 = Class5420.method17018("id", var0, -1L);
         var3.field27444 = Class5420.method17016("remoteSubscriptionId", var0, (String)null);
         var3.field27445 = Class5420.method17016("name", var0, (String)null);
         var3.field27446 = Class5420.method17016("motd", var0, (String)null);
         var3.field27447 = method18918(Class5420.method17016("state", var0, Class2261.field14706.name()));
         var3.field27448 = Class5420.method17016("owner", var0, (String)null);
         if (var0.get("players") != null && var0.get("players").isJsonArray()) {
            var3.field27450 = method18914(var0.get("players").getAsJsonArray());
            method18913(var3);
         } else {
            var3.field27450 = Lists.newArrayList();
         }

         var3.field27454 = Class5420.method17017("daysLeft", var0, 0);
         var3.field27452 = Class5420.method17019("expired", var0, false);
         var3.field27453 = Class5420.method17019("expiredTrial", var0, false);
         var3.field27455 = method18919(Class5420.method17016("worldType", var0, Class2049.field13369.name()));
         var3.field27449 = Class5420.method17016("ownerUUID", var0, "");
         if (var0.get("slots") != null && var0.get("slots").isJsonArray()) {
            var3.field27451 = method18915(var0.get("slots").getAsJsonArray());
         } else {
            var3.field27451 = method18916();
         }

         var3.field27457 = Class5420.method17016("minigameName", var0, (String)null);
         var3.field27456 = Class5420.method17017("activeSlot", var0, -1);
         var3.field27458 = Class5420.method17017("minigameId", var0, -1);
         var3.field27459 = Class5420.method17016("minigameImage", var0, (String)null);
      } catch (Exception var5) {
         field27442.error("Could not parse McoServer: " + var5.getMessage());
      }

      return var3;
   }

   private static void method18913(Class6128 var0) {
      var0.field27450
         .sort(
            (var0x, var1) -> ComparisonChain.start()
                  .compareFalseFirst(var1.method18881(), var0x.method18881())
                  .compare(var0x.method18875().toLowerCase(Locale.ROOT), var1.method18875().toLowerCase(Locale.ROOT))
                  .result()
         );
   }

   private static List<Class6114> method18914(JsonArray var0) {
      ArrayList var3 = Lists.newArrayList();

      for (JsonElement var5 : var0) {
         try {
            JsonObject var6 = var5.getAsJsonObject();
            Class6114 var7 = new Class6114();
            var7.method18876(Class5420.method17016("name", var6, (String)null));
            var7.method18878(Class5420.method17016("uuid", var6, (String)null));
            var7.method18880(Class5420.method17019("operator", var6, false));
            var7.method18882(Class5420.method17019("accepted", var6, false));
            var7.method18884(Class5420.method17019("online", var6, false));
            var3.add(var7);
         } catch (Exception var8) {
         }
      }

      return var3;
   }

   private static Map<Integer, Class6125> method18915(JsonArray var0) {
      HashMap var3 = Maps.newHashMap();

      for (JsonElement var5 : var0) {
         try {
            JsonObject var6 = var5.getAsJsonObject();
            JsonParser var7 = new JsonParser();
            JsonElement var8 = var7.parse(var6.get("options").getAsString());
            Class6125 var9;
            if (var8 == null) {
               var9 = Class6125.method18897();
            } else {
               var9 = Class6125.method18900(var8.getAsJsonObject());
            }

            int var10 = Class5420.method17017("slotId", var6, -1);
            var3.put(var10, var9);
         } catch (Exception var11) {
         }
      }

      for (int var12 = 1; var12 <= 3; var12++) {
         if (!var3.containsKey(var12)) {
            var3.put(var12, Class6125.method18898());
         }
      }

      return var3;
   }

   private static Map<Integer, Class6125> method18916() {
      HashMap var2 = Maps.newHashMap();
      var2.put(1, Class6125.method18898());
      var2.put(2, Class6125.method18898());
      var2.put(3, Class6125.method18898());
      return var2;
   }

   public static Class6128 method18917(String var0) {
      try {
         return method18912(new JsonParser().parse(var0).getAsJsonObject());
      } catch (Exception var4) {
         field27442.error("Could not parse McoServer: " + var4.getMessage());
         return new Class6128();
      }
   }

   private static Class2261 method18918(String var0) {
      try {
         return Class2261.valueOf(var0);
      } catch (Exception var4) {
         return Class2261.field14706;
      }
   }

   private static Class2049 method18919(String var0) {
      try {
         return Class2049.valueOf(var0);
      } catch (Exception var4) {
         return Class2049.field13369;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field27443, this.field27445, this.field27446, this.field27447, this.field27448, this.field27452);
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != null) {
         if (var1 != this) {
            if (var1.getClass() == this.getClass()) {
               Class6128 var4 = (Class6128)var1;
               return new EqualsBuilder()
                  .append(this.field27443, var4.field27443)
                  .append(this.field27445, var4.field27445)
                  .append(this.field27446, var4.field27446)
                  .append(this.field27447, var4.field27447)
                  .append(this.field27448, var4.field27448)
                  .append(this.field27452, var4.field27452)
                  .append(this.field27455, this.field27455)
                  .isEquals();
            } else {
               return false;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public Class6128 clone() {
      Class6128 var3 = new Class6128();
      var3.field27443 = this.field27443;
      var3.field27444 = this.field27444;
      var3.field27445 = this.field27445;
      var3.field27446 = this.field27446;
      var3.field27447 = this.field27447;
      var3.field27448 = this.field27448;
      var3.field27450 = this.field27450;
      var3.field27451 = this.method18920(this.field27451);
      var3.field27452 = this.field27452;
      var3.field27453 = this.field27453;
      var3.field27454 = this.field27454;
      var3.field27460 = new Class6129();
      var3.field27460.field27461 = this.field27460.field27461;
      var3.field27460.field27462 = this.field27460.field27462;
      var3.field27455 = this.field27455;
      var3.field27449 = this.field27449;
      var3.field27457 = this.field27457;
      var3.field27456 = this.field27456;
      var3.field27458 = this.field27458;
      var3.field27459 = this.field27459;
      return var3;
   }

   public Map<Integer, Class6125> method18920(Map<Integer, Class6125> var1) {
      HashMap var4 = Maps.newHashMap();

      for (Entry var6 : var1.entrySet()) {
         var4.put(var6.getKey(), ((Class6125)var6.getValue()).clone());
      }

      return var4;
   }

   public String method18921(int var1) {
      return this.field27445 + " (" + this.field27451.get(var1).method18901(var1) + ")";
   }

   public Class7730 method18922(String var1) {
      return new Class7730(this.field27445, var1, false);
   }
}
