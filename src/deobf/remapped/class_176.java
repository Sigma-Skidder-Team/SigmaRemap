package remapped;

import com.mojang.realmsclient.exception.RealmsServiceException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_176 {
   public static class_4494 field_588 = class_4494.field_21970;
   private static boolean field_585;
   private static final Logger field_584 = LogManager.getLogger();
   private final String field_587;
   private final String field_589;
   private final MinecraftClient field_582;
   private static final class_5380 field_586 = new class_5380();

   public static class_176 method_777() {
      MinecraftClient var2 = MinecraftClient.method_8510();
      String var3 = var2.method_8502().method_5366();
      String var4 = var2.method_8502().method_5369();
      if (!field_585) {
         field_585 = true;
         String var5 = System.getenv("realms.environment");
         if (var5 == null) {
            var5 = System.getProperty("realms.environment");
         }

         if (var5 != null) {
            if (!"LOCAL".equals(var5)) {
               if ("STAGE".equals(var5)) {
                  method_772();
               }
            } else {
               method_798();
            }
         }
      }

      return new class_176(var4, var3, var2);
   }

   public static void method_772() {
      field_588 = class_4494.field_21972;
   }

   public static void method_781() {
      field_588 = class_4494.field_21970;
   }

   public static void method_798() {
      field_588 = class_4494.field_21974;
   }

   public class_176(String var1, String var2, MinecraftClient var3) {
      this.field_587 = var1;
      this.field_589 = var2;
      this.field_582 = var3;
      class_6982.method_31934(var3.method_8607());
   }

   public class_9752 method_803() throws RealmsServiceException {
      String var3 = this.method_802("worlds");
      String var4 = this.method_779(class_8894.method_40943(var3));
      return class_9752.method_45025(var4);
   }

   public class_7675 method_770(long var1) throws RealmsServiceException {
      String var5 = this.method_802("worlds" + "/$ID".replace("$ID", String.valueOf(var1)));
      String var6 = this.method_779(class_8894.method_40943(var5));
      return class_7675.method_34779(var6);
   }

   public class_8793 method_800() throws RealmsServiceException {
      String var3 = this.method_802("activities/liveplayerlist");
      String var4 = this.method_779(class_8894.method_40943(var3));
      return class_8793.method_40392(var4);
   }

   public class_7798 method_788(long var1) throws RealmsServiceException {
      String var5 = this.method_802("worlds" + "/v1/$ID/join/pc".replace("$ID", "" + var1));
      String var6 = this.method_779(class_8894.method_40933(var5, 5000, 30000));
      return class_7798.method_35372(var6);
   }

   public void method_771(long var1, String var3, String var4) throws RealmsServiceException {
      class_1115 var7 = new class_1115(var3, var4);
      String var8 = this.method_802("worlds" + "/$WORLD_ID/initialize".replace("$WORLD_ID", String.valueOf(var1)));
      String var9 = field_586.method_24512(var7);
      this.method_779(class_8894.method_40942(var8, var9, 5000, 10000));
   }

   public Boolean method_780() throws RealmsServiceException {
      String var3 = this.method_802("mco/available");
      String var4 = this.method_779(class_8894.method_40943(var3));
      return Boolean.valueOf(var4);
   }

   public Boolean method_782() throws RealmsServiceException {
      String var3 = this.method_802("mco/stageAvailable");
      String var4 = this.method_779(class_8894.method_40943(var3));
      return Boolean.valueOf(var4);
   }

   public class_2529 method_778() throws RealmsServiceException {
      String var3 = this.method_802("mco/client/compatible");
      String var4 = this.method_779(class_8894.method_40943(var3));

      try {
         return class_2529.valueOf(var4);
      } catch (IllegalArgumentException var6) {
         throw new class_3900(500, "Could not check compatible version, got response: " + var4, -1, "");
      }
   }

   public void method_785(long var1, String var3) throws RealmsServiceException {
      String var6 = this.method_802("invites" + "/$WORLD_ID/invite/$UUID".replace("$WORLD_ID", String.valueOf(var1)).replace("$UUID", var3));
      this.method_779(class_8894.method_40934(var6));
   }

   public void method_807(long var1) throws RealmsServiceException {
      String var5 = this.method_802("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(var1)));
      this.method_779(class_8894.method_40934(var5));
   }

   public class_7675 method_805(long var1, String var3) throws RealmsServiceException {
      class_7407 var6 = new class_7407();
      var6.method_33754(var3);
      String var7 = this.method_802("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(var1)));
      String var8 = this.method_779(class_8894.method_40930(var7, field_586.method_24512(var6)));
      return class_7675.method_34779(var8);
   }

   public class_1669 method_794(long var1) throws RealmsServiceException {
      String var5 = this.method_802("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf(var1)));
      String var6 = this.method_779(class_8894.method_40943(var5));
      return class_1669.method_7442(var6);
   }

   public void method_769(long var1, String var3, String var4) throws RealmsServiceException {
      class_1115 var7 = new class_1115(var3, var4);
      String var8 = this.method_802("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(var1)));
      this.method_779(class_8894.method_40930(var8, field_586.method_24512(var7)));
   }

   public void method_792(long var1, int var3, class_6768 var4) throws RealmsServiceException {
      String var7 = this.method_802("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf(var1)).replace("$SLOT_ID", String.valueOf(var3)));
      String var8 = var4.method_31028();
      this.method_779(class_8894.method_40930(var7, var8));
   }

   public boolean method_806(long var1, int var3) throws RealmsServiceException {
      String var6 = this.method_802("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf(var1)).replace("$SLOT_ID", String.valueOf(var3)));
      String var7 = this.method_779(class_8894.method_40931(var6, ""));
      return Boolean.valueOf(var7);
   }

   public void method_764(long var1, String var3) throws RealmsServiceException {
      String var6 = this.method_767("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf(var1)), "backupId=" + var3);
      this.method_779(class_8894.method_40940(var6, "", 40000, 600000));
   }

   public class_480 method_796(int var1, int var2, class_8840 var3) throws RealmsServiceException {
      String var6 = this.method_767(
         "worlds" + "/templates/$WORLD_TYPE".replace("$WORLD_TYPE", var3.toString()), String.format("page=%d&pageSize=%d", var1, var2)
      );
      String var7 = this.method_779(class_8894.method_40943(var6));
      return class_480.method_2272(var7);
   }

   public Boolean method_786(long var1, String var3) throws RealmsServiceException {
      String var6 = "/minigames/$MINIGAME_ID/$WORLD_ID".replace("$MINIGAME_ID", var3).replace("$WORLD_ID", String.valueOf(var1));
      String var7 = this.method_802("worlds" + var6);
      return Boolean.valueOf(this.method_779(class_8894.method_40931(var7, "")));
   }

   public class_3746 method_765(long var1, String var3) throws RealmsServiceException {
      String var6 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf(var1)).replace("$PROFILE_UUID", var3);
      String var7 = this.method_802("ops" + var6);
      return class_3746.method_17354(this.method_779(class_8894.method_40930(var7, "")));
   }

   public class_3746 method_790(long var1, String var3) throws RealmsServiceException {
      String var6 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf(var1)).replace("$PROFILE_UUID", var3);
      String var7 = this.method_802("ops" + var6);
      return class_3746.method_17354(this.method_779(class_8894.method_40934(var7)));
   }

   public Boolean method_795(long var1) throws RealmsServiceException {
      String var5 = this.method_802("worlds" + "/$WORLD_ID/open".replace("$WORLD_ID", String.valueOf(var1)));
      String var6 = this.method_779(class_8894.method_40931(var5, ""));
      return Boolean.valueOf(var6);
   }

   public Boolean method_799(long var1) throws RealmsServiceException {
      String var5 = this.method_802("worlds" + "/$WORLD_ID/close".replace("$WORLD_ID", String.valueOf(var1)));
      String var6 = this.method_779(class_8894.method_40931(var5, ""));
      return Boolean.valueOf(var6);
   }

   public Boolean method_783(long var1, String var3, Integer var4, boolean var5) throws RealmsServiceException {
      class_3782 var8 = new class_3782(var3, -1L, var4, var5);
      String var9 = this.method_802("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf(var1)));
      String var10 = this.method_779(class_8894.method_40942(var9, field_586.method_24512(var8), 30000, 80000));
      return Boolean.valueOf(var10);
   }

   public Boolean method_789(long var1, String var3) throws RealmsServiceException {
      class_3782 var6 = new class_3782((String)null, Long.valueOf(var3), -1, false);
      String var7 = this.method_802("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf(var1)));
      String var8 = this.method_779(class_8894.method_40942(var7, field_586.method_24512(var6), 30000, 80000));
      return Boolean.valueOf(var8);
   }

   public class_8018 method_793(long var1) throws RealmsServiceException {
      String var5 = this.method_802("subscriptions" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(var1)));
      String var6 = this.method_779(class_8894.method_40943(var5));
      return class_8018.method_36392(var6);
   }

   public int method_773() throws RealmsServiceException {
      return this.method_797().field_34591.size();
   }

   public class_6696 method_797() throws RealmsServiceException {
      String var3 = this.method_802("invites/pending");
      String var4 = this.method_779(class_8894.method_40943(var3));
      class_6696 var5 = class_6696.method_30693(var4);
      var5.field_34591.removeIf(this::method_791);
      return var5;
   }

   private boolean method_791(class_2926 var1) {
      try {
         UUID var4 = UUID.fromString(var1.field_14260);
         return this.field_582.method_8586().method_42336(var4);
      } catch (IllegalArgumentException var5) {
         return false;
      }
   }

   public void method_776(String var1) throws RealmsServiceException {
      String var4 = this.method_802("invites" + "/accept/$INVITATION_ID".replace("$INVITATION_ID", var1));
      this.method_779(class_8894.method_40931(var4, ""));
   }

   public class_8105 method_784(long var1, int var3) throws RealmsServiceException {
      String var6 = this.method_802(
         "worlds" + "/$WORLD_ID/slot/$SLOT_ID/download".replace("$WORLD_ID", String.valueOf(var1)).replace("$SLOT_ID", String.valueOf(var3))
      );
      String var7 = this.method_779(class_8894.method_40943(var6));
      return class_8105.method_36794(var7);
   }

   @Nullable
   public class_7219 method_775(long var1, String var3) throws RealmsServiceException {
      String var6 = this.method_802("worlds" + "/$WORLD_ID/backups/upload".replace("$WORLD_ID", String.valueOf(var1)));
      return class_7219.method_33063(this.method_779(class_8894.method_40931(var6, class_7219.method_33068(var3))));
   }

   public void method_768(String var1) throws RealmsServiceException {
      String var4 = this.method_802("invites" + "/reject/$INVITATION_ID".replace("$INVITATION_ID", var1));
      this.method_779(class_8894.method_40931(var4, ""));
   }

   public void method_763() throws RealmsServiceException {
      String var3 = this.method_802("mco/tos/agreed");
      this.method_779(class_8894.method_40930(var3, ""));
   }

   public class_7788 method_774() throws RealmsServiceException {
      String var3 = this.method_802("mco/v1/news");
      String var4 = this.method_779(class_8894.method_40933(var3, 5000, 10000));
      return class_7788.method_35343(var4);
   }

   public void method_787(class_9292 var1) throws RealmsServiceException {
      String var4 = this.method_802("regions/ping/stat");
      this.method_779(class_8894.method_40930(var4, field_586.method_24512(var1)));
   }

   public Boolean method_766() throws RealmsServiceException {
      String var3 = this.method_802("trial");
      String var4 = this.method_779(class_8894.method_40943(var3));
      return Boolean.valueOf(var4);
   }

   public void method_804(long var1) throws RealmsServiceException {
      String var5 = this.method_802("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(var1)));
      this.method_779(class_8894.method_40934(var5));
   }

   @Nullable
   private String method_802(String var1) {
      return this.method_767(var1, (String)null);
   }

   @Nullable
   private String method_767(String var1, String var2) {
      try {
         return new URI(field_588.field_21968, field_588.field_21971, "/" + var1, var2, (String)null).toASCIIString();
      } catch (URISyntaxException var6) {
         var6.printStackTrace();
         return null;
      }
   }

   private String method_779(class_8894<?> var1) throws RealmsServiceException {
      var1.method_40937("sid", this.field_587);
      var1.method_40937("user", this.field_589);
      var1.method_40937("version", class_7665.method_34674().getName());

      try {
         int var4 = var1.method_40944();
         if (var4 != 503 && var4 != 277) {
            String var8 = var1.method_40946();
            if (var4 >= 200 && var4 < 300) {
               return var8;
            } else if (var4 == 401) {
               String var9 = var1.method_40939("WWW-Authenticate");
               field_584.info("Could not authorize you against Realms server: " + var9);
               throw new class_3900(var4, var9, -1, var9);
            } else if (var8 != null && var8.length() != 0) {
               class_9131 var6 = class_9131.method_42028(var8);
               field_584.error(
                  "Realms http code: " + var4 + " -  error code: " + var6.method_42031() + " -  message: " + var6.method_42029() + " - raw body: " + var8
               );
               throw new class_3900(var4, var8, var6);
            } else {
               field_584.error("Realms error code: " + var4 + " message: " + var8);
               throw new class_3900(var4, var8, var4, "");
            }
         } else {
            int var5 = var1.method_40935();
            throw new class_5954(var5, var4);
         }
      } catch (class_8647 var7) {
         throw new class_3900(500, "Could not connect to Realms: " + var7.getMessage(), -1, "");
      }
   }
}
