package com.mojang.realmsclient.client;

import com.mojang.realmsclient.dto.RealmsServer;
import com.mojang.realmsclient.exception.RealmsServiceException;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.util.SharedConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.UUID;

public class RealmsClient {
   public static Class2174 field22142 = Class2174.field14271;
   private static boolean field22143;
   private static final Logger field22144 = LogManager.getLogger();
   private final String field22145;
   private final String field22146;
   private final Minecraft field22147;
   private static final Class8650 field22148 = new Class8650();

   public static RealmsClient method14543() {
      Minecraft var2 = Minecraft.getInstance();
      String var3 = var2.getSession().getUsername();
      String var4 = var2.getSession().toString();
      if (!field22143) {
         field22143 = true;
         String var5 = System.getenv("realms.environment");
         if (var5 == null) {
            var5 = System.getProperty("realms.environment");
         }

         if (var5 != null) {
            if (!"LOCAL".equals(var5)) {
               if ("STAGE".equals(var5)) {
                  method14544();
               }
            } else {
               method14546();
            }
         }
      }

      return new RealmsClient(var4, var3, var2);
   }

   public static void method14544() {
      field22142 = Class2174.field14272;
   }

   public static void method14545() {
      field22142 = Class2174.field14271;
   }

   public static void method14546() {
      field22142 = Class2174.field14273;
   }

   public RealmsClient(String var1, String var2, Minecraft var3) {
      this.field22145 = var1;
      this.field22146 = var2;
      this.field22147 = var3;
      Class9094.method33922(var3.getProxy());
   }

   public Class6118 method14547() throws RealmsServiceException {
      String var3 = this.method14584("worlds");
      String var4 = this.method14586(Class6754.method20599(var3));
      return Class6118.method18885(var4);
   }

   public RealmsServer method14548(long var1) throws RealmsServiceException {
      String var5 = this.method14584("worlds" + "/$ID".replace("$ID", String.valueOf(var1)));
      String var6 = this.method14586(Class6754.method20599(var5));
      return RealmsServer.method18917(var6);
   }

   public Class6119 method14549() throws RealmsServiceException {
      String var3 = this.method14584("activities/liveplayerlist");
      String var4 = this.method14586(Class6754.method20599(var3));
      return Class6119.method18886(var4);
   }

   public Class6127 method14550(long var1) throws RealmsServiceException {
      String var5 = this.method14584("worlds" + "/v1/$ID/join/pc".replace("$ID", "" + var1));
      String var6 = this.method14586(Class6754.method20600(var5, 5000, 30000));
      return Class6127.method18905(var6);
   }

   public void method14551(long var1, String var3, String var4) throws RealmsServiceException {
      Class6115 var7 = new Class6115(var3, var4);
      String var8 = this.method14584("worlds" + "/$WORLD_ID/initialize".replace("$WORLD_ID", String.valueOf(var1)));
      String var9 = field22148.method31093(var7);
      this.method14586(Class6754.method20602(var8, var9, 5000, 10000));
   }

   public Boolean method14552() throws RealmsServiceException {
      String var3 = this.method14584("mco/available");
      String var4 = this.method14586(Class6754.method20599(var3));
      return Boolean.valueOf(var4);
   }

   public Boolean method14553() throws RealmsServiceException {
      String var3 = this.method14584("mco/stageAvailable");
      String var4 = this.method14586(Class6754.method20599(var3));
      return Boolean.valueOf(var4);
   }

   public Class1992 method14554() throws RealmsServiceException {
      String var3 = this.method14584("mco/client/compatible");
      String var4 = "COMPATIBLE";

      try {
         return Class1992.valueOf(var4);
      } catch (IllegalArgumentException var6) {
         throw new RealmsServiceException(500, "Could not check compatible version, got response: " + var4, -1, "");
      }
   }

   public void method14555(long var1, String var3) throws RealmsServiceException {
      String var6 = this.method14584("invites" + "/$WORLD_ID/invite/$UUID".replace("$WORLD_ID", String.valueOf(var1)).replace("$UUID", var3));
      this.method14586(Class6754.method20603(var6));
   }

   public void method14556(long var1) throws RealmsServiceException {
      String var5 = this.method14584("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(var1)));
      this.method14586(Class6754.method20603(var5));
   }

   public RealmsServer method14557(long var1, String var3) throws RealmsServiceException {
      Class6114 var6 = new Class6114();
      var6.method18876(var3);
      String var7 = this.method14584("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(var1)));
      String var8 = this.method14586(Class6754.method20601(var7, field22148.method31093(var6)));
      return RealmsServer.method18917(var8);
   }

   public Class6126 method14558(long var1) throws RealmsServiceException {
      String var5 = this.method14584("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf(var1)));
      String var6 = this.method14586(Class6754.method20599(var5));
      return Class6126.method18904(var6);
   }

   public void method14559(long var1, String var3, String var4) throws RealmsServiceException {
      Class6115 var7 = new Class6115(var3, var4);
      String var8 = this.method14584("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(var1)));
      this.method14586(Class6754.method20601(var8, field22148.method31093(var7)));
   }

   public void method14560(long var1, int var3, Class6125 var4) throws RealmsServiceException {
      String var7 = this.method14584("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf(var1)).replace("$SLOT_ID", String.valueOf(var3)));
      String var8 = var4.method18903();
      this.method14586(Class6754.method20601(var7, var8));
   }

   public boolean method14561(long var1, int var3) throws RealmsServiceException {
      String var6 = this.method14584("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf(var1)).replace("$SLOT_ID", String.valueOf(var3)));
      String var7 = this.method14586(Class6754.method20604(var6, ""));
      return Boolean.valueOf(var7);
   }

   public void method14562(long var1, String var3) throws RealmsServiceException {
      String var6 = this.method14585("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf(var1)), "backupId=" + var3);
      this.method14586(Class6754.method20605(var6, "", 40000, 600000));
   }

   public Class6108 method14563(int var1, int var2, Class2049 var3) throws RealmsServiceException {
      String var6 = this.method14585(
         "worlds" + "/templates/$WORLD_TYPE".replace("$WORLD_TYPE", var3.toString()), String.format("page=%d&pageSize=%d", var1, var2)
      );
      String var7 = this.method14586(Class6754.method20599(var6));
      return Class6108.method18870(var7);
   }

   public Boolean method14564(long var1, String var3) throws RealmsServiceException {
      String var6 = "/minigames/$MINIGAME_ID/$WORLD_ID".replace("$MINIGAME_ID", var3).replace("$WORLD_ID", String.valueOf(var1));
      String var7 = this.method14584("worlds" + var6);
      return Boolean.valueOf(this.method14586(Class6754.method20604(var7, "")));
   }

   public Class6123 method14565(long var1, String var3) throws RealmsServiceException {
      String var6 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf(var1)).replace("$PROFILE_UUID", var3);
      String var7 = this.method14584("ops" + var6);
      return Class6123.method18894(this.method14586(Class6754.method20601(var7, "")));
   }

   public Class6123 method14566(long var1, String var3) throws RealmsServiceException {
      String var6 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf(var1)).replace("$PROFILE_UUID", var3);
      String var7 = this.method14584("ops" + var6);
      return Class6123.method18894(this.method14586(Class6754.method20603(var7)));
   }

   public Boolean method14567(long var1) throws RealmsServiceException {
      String var5 = this.method14584("worlds" + "/$WORLD_ID/open".replace("$WORLD_ID", String.valueOf(var1)));
      String var6 = this.method14586(Class6754.method20604(var5, ""));
      return Boolean.valueOf(var6);
   }

   public Boolean method14568(long var1) throws RealmsServiceException {
      String var5 = this.method14584("worlds" + "/$WORLD_ID/close".replace("$WORLD_ID", String.valueOf(var1)));
      String var6 = this.method14586(Class6754.method20604(var5, ""));
      return Boolean.valueOf(var6);
   }

   public Boolean method14569(long var1, String var3, Integer var4, boolean var5) throws RealmsServiceException {
      Class6117 var8 = new Class6117(var3, -1L, var4, var5);
      String var9 = this.method14584("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf(var1)));
      String var10 = this.method14586(Class6754.method20602(var9, field22148.method31093(var8), 30000, 80000));
      return Boolean.valueOf(var10);
   }

   public Boolean method14570(long var1, String var3) throws RealmsServiceException {
      Class6117 var6 = new Class6117((String)null, Long.valueOf(var3), -1, false);
      String var7 = this.method14584("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf(var1)));
      String var8 = this.method14586(Class6754.method20602(var7, field22148.method31093(var6), 30000, 80000));
      return Boolean.valueOf(var8);
   }

   public Class6121 method14571(long var1) throws RealmsServiceException {
      String var5 = this.method14584("subscriptions" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(var1)));
      String var6 = this.method14586(Class6754.method20599(var5));
      return Class6121.method18888(var6);
   }

   public int method14572() throws RealmsServiceException {
      return this.method14573().field27476.size();
   }

   public Class6132 method14573() throws RealmsServiceException {
      String var3 = this.method14584("invites/pending");
      String var4 = this.method14586(Class6754.method20599(var3));
      Class6132 var5 = Class6132.method18926(var4);
      var5.field27476.removeIf(this::method14574);
      return var5;
   }

   private boolean method14574(Class6110 var1) {
      try {
         UUID var4 = UUID.fromString(var1.field27373);
         return this.field22147.func_244599_aA().method37608(var4);
      } catch (IllegalArgumentException var5) {
         return false;
      }
   }

   public void method14575(String var1) throws RealmsServiceException {
      String var4 = this.method14584("invites" + "/accept/$INVITATION_ID".replace("$INVITATION_ID", var1));
      this.method14586(Class6754.method20604(var4, ""));
   }

   public Class6120 method14576(long var1, int var3) throws RealmsServiceException {
      String var6 = this.method14584(
         "worlds" + "/$WORLD_ID/slot/$SLOT_ID/download".replace("$WORLD_ID", String.valueOf(var1)).replace("$SLOT_ID", String.valueOf(var3))
      );
      String var7 = this.method14586(Class6754.method20599(var6));
      return Class6120.method18887(var7);
   }

   @Nullable
   public Class6133 method14577(long var1, String var3) throws RealmsServiceException {
      String var6 = this.method14584("worlds" + "/$WORLD_ID/backups/upload".replace("$WORLD_ID", String.valueOf(var1)));
      return Class6133.method18927(this.method14586(Class6754.method20604(var6, Class6133.method18931(var3))));
   }

   public void method14578(String var1) throws RealmsServiceException {
      String var4 = this.method14584("invites" + "/reject/$INVITATION_ID".replace("$INVITATION_ID", var1));
      this.method14586(Class6754.method20604(var4, ""));
   }

   public void method14579() throws RealmsServiceException {
      String var3 = this.method14584("mco/tos/agreed");
      this.method14586(Class6754.method20601(var3, ""));
   }

   public Class6131 method14580() throws RealmsServiceException {
      String var3 = this.method14584("mco/v1/news");
      String var4 = this.method14586(Class6754.method20600(var3, 5000, 10000));
      return Class6131.method18925(var4);
   }

   public void method14581(Class6116 var1) throws RealmsServiceException {
      String var4 = this.method14584("regions/ping/stat");
      this.method14586(Class6754.method20601(var4, field22148.method31093(var1)));
   }

   public Boolean method14582() throws RealmsServiceException {
      String var3 = this.method14584("trial");
      String var4 = this.method14586(Class6754.method20599(var3));
      return Boolean.valueOf(var4);
   }

   public void method14583(long var1) throws RealmsServiceException {
      String var5 = this.method14584("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(var1)));
      this.method14586(Class6754.method20603(var5));
   }

   @Nullable
   private String method14584(String var1) {
      return this.method14585(var1, (String)null);
   }

   @Nullable
   private String method14585(String var1, String var2) {
      try {
         return new URI(field22142.field14275, field22142.field14274, "/" + var1, var2, (String)null).toASCIIString();
      } catch (URISyntaxException var6) {
         var6.printStackTrace();
         return null;
      }
   }

   private String method14586(Class6754<?> var1) throws RealmsServiceException {
      var1.method20590("sid", this.field22145);
      var1.method20590("user", this.field22146);
      var1.method20590("version", SharedConstants.getVersion().getName());

      try {
         int var4 = var1.method20594();
         if (var4 != 503 && var4 != 277) {
            String var8 = var1.method20595();
            if (var4 >= 200 && var4 < 300) {
               return var8;
            } else if (var4 == 401) {
               String var9 = var1.method20606("WWW-Authenticate");
               field22144.info("Could not authorize you against Realms server: " + var9);
               return "";
            } else if (var8 != null && var8.length() != 0) {
               Class9636 var6 = Class9636.method37559(var8);
               field22144.error(
                  "Realms http code: " + var4 + " -  error code: " + var6.method37561() + " -  message: " + var6.method37560() + " - raw body: " + var8
               );
               return "";
            } else {
               field22144.error("Realms error code: " + var4 + " message: " + var8);
               return "";
            }
         } else {
            int var5 = var1.method20592();
            return "";
         }
      } catch (Class2505 var7) {
         return "";
      }
   }
}
