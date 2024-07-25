package remapped;

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

public class class_7675 extends class_8958 {
   private static final Logger field_39009 = LogManager.getLogger();
   public long field_39016;
   public String field_39001;
   public String field_39012;
   public String field_39010;
   public class_6804 field_39004;
   public String field_39006;
   public String field_39014;
   public List<class_7407> field_39019;
   public Map<Integer, class_6768> field_39013;
   public boolean field_39020;
   public boolean field_39005;
   public int field_39008;
   public class_8840 field_39015;
   public int field_39007;
   public String field_39018;
   public int field_39017;
   public String field_39003;
   public class_4771 field_39002 = new class_4771();

   public String method_34769() {
      return this.field_39010;
   }

   public String method_34772() {
      return this.field_39012;
   }

   public String method_34783() {
      return this.field_39018;
   }

   public void method_34778(String var1) {
      this.field_39012 = var1;
   }

   public void method_34774(String var1) {
      this.field_39010 = var1;
   }

   public void method_34782(class_8434 var1) {
      ArrayList var4 = Lists.newArrayList();
      int var5 = 0;

      for (String var7 : var1.field_43159) {
         if (!var7.equals(MinecraftClient.method_8510().method_8502().method_5367())) {
            String var8 = "";

            try {
               var8 = class_9539.method_43982(var7);
            } catch (Exception var10) {
               field_39009.error("Could not get name for " + var7, var10);
               continue;
            }

            var4.add(var8);
            var5++;
         }
      }

      this.field_39002.field_23123 = String.valueOf(var5);
      this.field_39002.field_23125 = Joiner.on('\n').join(var4);
   }

   public static class_7675 method_34775(JsonObject var0) {
      class_7675 var3 = new class_7675();

      try {
         var3.field_39016 = class_274.method_1244("id", var0, -1L);
         var3.field_39001 = class_274.method_1243("remoteSubscriptionId", var0, (String)null);
         var3.field_39012 = class_274.method_1243("name", var0, (String)null);
         var3.field_39010 = class_274.method_1243("motd", var0, (String)null);
         var3.field_39004 = method_34777(class_274.method_1243("state", var0, class_6804.field_35064.name()));
         var3.field_39006 = class_274.method_1243("owner", var0, (String)null);
         if (var0.get("players") != null && var0.get("players").isJsonArray()) {
            var3.field_39019 = method_34773(var0.get("players").getAsJsonArray());
            method_34767(var3);
         } else {
            var3.field_39019 = Lists.newArrayList();
         }

         var3.field_39008 = class_274.method_1245("daysLeft", var0, 0);
         var3.field_39020 = class_274.method_1246("expired", var0, false);
         var3.field_39005 = class_274.method_1246("expiredTrial", var0, false);
         var3.field_39015 = method_34770(class_274.method_1243("worldType", var0, class_8840.field_45205.name()));
         var3.field_39014 = class_274.method_1243("ownerUUID", var0, "");
         if (var0.get("slots") != null && var0.get("slots").isJsonArray()) {
            var3.field_39013 = method_34768(var0.get("slots").getAsJsonArray());
         } else {
            var3.field_39013 = method_34776();
         }

         var3.field_39018 = class_274.method_1243("minigameName", var0, (String)null);
         var3.field_39007 = class_274.method_1245("activeSlot", var0, -1);
         var3.field_39017 = class_274.method_1245("minigameId", var0, -1);
         var3.field_39003 = class_274.method_1243("minigameImage", var0, (String)null);
      } catch (Exception var5) {
         field_39009.error("Could not parse McoServer: " + var5.getMessage());
      }

      return var3;
   }

   private static void method_34767(class_7675 var0) {
      var0.field_39019
         .sort(
            (var0x, var1) -> ComparisonChain.start()
                  .compareFalseFirst(var1.method_33749(), var0x.method_33749())
                  .compare(var0x.method_33746().toLowerCase(Locale.ROOT), var1.method_33746().toLowerCase(Locale.ROOT))
                  .result()
         );
   }

   private static List<class_7407> method_34773(JsonArray var0) {
      ArrayList var3 = Lists.newArrayList();

      for (JsonElement var5 : var0) {
         try {
            JsonObject var6 = var5.getAsJsonObject();
            class_7407 var7 = new class_7407();
            var7.method_33754(class_274.method_1243("name", var6, (String)null));
            var7.method_33750(class_274.method_1243("uuid", var6, (String)null));
            var7.method_33752(class_274.method_1246("operator", var6, false));
            var7.method_33751(class_274.method_1246("accepted", var6, false));
            var7.method_33745(class_274.method_1246("online", var6, false));
            var3.add(var7);
         } catch (Exception var8) {
         }
      }

      return var3;
   }

   private static Map<Integer, class_6768> method_34768(JsonArray var0) {
      HashMap var3 = Maps.newHashMap();

      for (JsonElement var5 : var0) {
         try {
            JsonObject var6 = var5.getAsJsonObject();
            JsonParser var7 = new JsonParser();
            JsonElement var8 = var7.parse(var6.get("options").getAsString());
            class_6768 var9;
            if (var8 == null) {
               var9 = class_6768.method_31026();
            } else {
               var9 = class_6768.method_31025(var8.getAsJsonObject());
            }

            int var10 = class_274.method_1245("slotId", var6, -1);
            var3.put(var10, var9);
         } catch (Exception var11) {
         }
      }

      for (int var12 = 1; var12 <= 3; var12++) {
         if (!var3.containsKey(var12)) {
            var3.put(var12, class_6768.method_31024());
         }
      }

      return var3;
   }

   private static Map<Integer, class_6768> method_34776() {
      HashMap var2 = Maps.newHashMap();
      var2.put(1, class_6768.method_31024());
      var2.put(2, class_6768.method_31024());
      var2.put(3, class_6768.method_31024());
      return var2;
   }

   public static class_7675 method_34779(String var0) {
      try {
         return method_34775(new JsonParser().parse(var0).getAsJsonObject());
      } catch (Exception var4) {
         field_39009.error("Could not parse McoServer: " + var4.getMessage());
         return new class_7675();
      }
   }

   private static class_6804 method_34777(String var0) {
      try {
         return class_6804.valueOf(var0);
      } catch (Exception var4) {
         return class_6804.field_35064;
      }
   }

   private static class_8840 method_34770(String var0) {
      try {
         return class_8840.valueOf(var0);
      } catch (Exception var4) {
         return class_8840.field_45205;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field_39016, this.field_39012, this.field_39010, this.field_39004, this.field_39006, this.field_39020);
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != null) {
         if (var1 != this) {
            if (var1.getClass() == this.getClass()) {
               class_7675 var4 = (class_7675)var1;
               return new EqualsBuilder()
                  .append(this.field_39016, var4.field_39016)
                  .append(this.field_39012, var4.field_39012)
                  .append(this.field_39010, var4.field_39010)
                  .append(this.field_39004, var4.field_39004)
                  .append(this.field_39006, var4.field_39006)
                  .append(this.field_39020, var4.field_39020)
                  .append(this.field_39015, this.field_39015)
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

   public class_7675 clone() {
      class_7675 var3 = new class_7675();
      var3.field_39016 = this.field_39016;
      var3.field_39001 = this.field_39001;
      var3.field_39012 = this.field_39012;
      var3.field_39010 = this.field_39010;
      var3.field_39004 = this.field_39004;
      var3.field_39006 = this.field_39006;
      var3.field_39019 = this.field_39019;
      var3.field_39013 = this.method_34771(this.field_39013);
      var3.field_39020 = this.field_39020;
      var3.field_39005 = this.field_39005;
      var3.field_39008 = this.field_39008;
      var3.field_39002 = new class_4771();
      var3.field_39002.field_23123 = this.field_39002.field_23123;
      var3.field_39002.field_23125 = this.field_39002.field_23125;
      var3.field_39015 = this.field_39015;
      var3.field_39014 = this.field_39014;
      var3.field_39018 = this.field_39018;
      var3.field_39007 = this.field_39007;
      var3.field_39017 = this.field_39017;
      var3.field_39003 = this.field_39003;
      return var3;
   }

   public Map<Integer, class_6768> method_34771(Map<Integer, class_6768> var1) {
      HashMap var4 = Maps.newHashMap();

      for (Entry var6 : var1.entrySet()) {
         var4.put(var6.getKey(), ((class_6768)var6.getValue()).clone());
      }

      return var4;
   }

   public String method_34781(int var1) {
      return this.field_39012 + " (" + this.field_39013.get(var1).method_31027(var1) + ")";
   }

   public class_2560 method_34780(String var1) {
      return new class_2560(this.field_39012, var1, false);
   }
}
