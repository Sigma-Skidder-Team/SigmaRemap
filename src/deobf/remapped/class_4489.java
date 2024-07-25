package remapped;

import com.google.gson.JsonArray;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService;
import java.io.IOException;
import java.math.BigInteger;
import java.net.Proxy;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;

public class class_4489 {
   private MinecraftClient field_21934 = MinecraftClient.getInstance();
   private String field_21935;
   public Thread field_21932;
   private List<UUID> field_21928 = new ArrayList<UUID>();
   public HashMap<UUID, class_4567> field_21927 = new HashMap<UUID, class_4567>();
   public HttpClient field_21931;
   private class_5014 field_21930;
   public class_3484 field_21933;
   public class_6427 field_21936;

   public class_4489(class_5014 var1) {
      SigmaMainClass.method_3328().method_3302().method_7908(this);
      this.field_21931 = HttpClients.createDefault();
      this.field_21930 = var1;
      this.field_21936 = new class_6427(this);
      class_1235.field_6811 = class_1235.field_6811 | SigmaMainClass.method_3328().method_3332().field_25929 != null;
   }

   public HashMap<UUID, class_4567> method_20859() {
      return this.field_21927;
   }

   public boolean method_20846(Entity var1) {
      return var1 != null && this.field_21927.containsKey(var1.method_37328());
   }

   public class_4567 method_20845(Entity var1) {
      return this.field_21927.get(var1.method_37328());
   }

   @class_9148
   private void method_20858(class_5596 var1) {
      if (this.field_21934.field_9632.field_41697 % 100 == 0) {
         this.method_20857();
         List var4 = this.field_21934.field_9601.method_25873();
         Iterator var5 = var4.iterator();

         while (var5.hasNext()) {
            class_9716 var6 = (class_9716)var5.next();
            if (this.field_21928.contains(var6.method_37328())
               || SigmaMainClass.method_3328().method_3331().method_20495(var6)
               || var6.method_45509().getUnformattedComponentText().equals("")) {
               var5.remove();
            }
         }

         if (var4.size() != 0) {
            Iterator var10 = var4.iterator();
            int var7 = 0;
            JsonArray var8 = new JsonArray();

            while (var10.hasNext() && var7++ < 70) {
               Entity var9 = (Entity)var10.next();
               var8.add(var9.method_45509().getUnformattedComponentText());
               this.field_21928.add(var9.method_37328());
            }

            if (this.field_21933 != null && this.field_21933.method_16015()) {
               this.field_21933.method_19325("fetch", var8);
            }
         }
      }
   }

   private void method_20857() {
      Iterator var3 = this.field_21928.iterator();

      while (var3.hasNext()) {
         if (this.field_21934.field_9601.method_25862((UUID)var3.next()) == null) {
            var3.remove();
         }
      }

      Iterator var4 = this.field_21927.keySet().iterator();

      while (var3.hasNext()) {
         if (this.field_21934.field_9601.method_25862((UUID)var4.next()) == null) {
            var4.remove();
         }
      }
   }

   public void method_20856(String var1, String var2) {
      class_1293 var5 = new class_1293();
      var5.method_5820("target", var1);
      var5.method_5820("message", var2);
      if (this.field_21933 != null) {
         this.field_21933.method_19325("message", var5);
      }
   }

   @class_9148
   private void method_20855(class_139 var1) {
      if (var1.method_557() instanceof class_1490) {
         class_1490 var4 = (class_1490)var1.method_557();
         SigmaMainClass.method_3306().method_12863("Connecting...");

         try {
            this.field_21933 = class_6508.method_29656("http://localhost:3000");
         } catch (URISyntaxException var6) {
            var6.printStackTrace();
         }

         this.field_21933
            .method_19329("connect", new class_2011(this))
            .method_19329("login-successful", new class_1804(this))
            .method_19329("jello-user", new class_3448(this))
            .method_19329("chat-message", new class_1333(this))
            .method_19329("disconnect", new class_328(this));
         this.field_21933.method_15999();
      }
   }

   public static void method_20850() {
      SigmaMainClass.method_3328().method_3332().method_23092();
   }

   public static String method_20853(String var0) {
      try {
         byte[] var3 = method_20852(var0, "SHA-1");
         return new BigInteger(var3).toString(16).replace("-", "");
      } catch (NoSuchAlgorithmException var4) {
         throw new RuntimeException(var4);
      }
   }

   private static byte[] method_20852(String var0, String var1) throws NoSuchAlgorithmException {
      MessageDigest var4 = MessageDigest.getInstance(var1);
      byte[] var5 = var0.getBytes(StandardCharsets.UTF_8);
      return var4.digest(var5);
   }

   private void method_20854(GameProfile var1, String var2) throws AuthenticationException, IOException {
      String var5 = this.field_21934.session.method_5365();
      YggdrasilAuthenticationService var6 = new YggdrasilAuthenticationService(Proxy.NO_PROXY, var5);
      YggdrasilMinecraftSessionService var7 = (YggdrasilMinecraftSessionService)var6.createMinecraftSessionService();
      var7.joinServer(var1, var5, var2);
      SigmaMainClass.method_3328();
      SigmaMainClass.method_3306().method_12863("Jello Connect: successfully reached out mojangs servers " + var2);
      System.out
         .println("https://sessionserver.mojang.com/session/minecraft/hasJoined?serverId=" + var2 + "&username=" + this.field_21934.session.method_5366());
   }

   private String method_20851(String var1) {
      try {
         MessageDigest var4 = MessageDigest.getInstance("MD5");
         byte[] var5 = var4.digest(var1.getBytes());
         StringBuffer var6 = new StringBuffer();

         for (int var7 = 0; var7 < var5.length; var7++) {
            var6.append(Integer.toHexString(var5[var7] & 255 | 256).substring(1, 3));
         }

         return var6.toString();
      } catch (NoSuchAlgorithmException var8) {
         return null;
      }
   }
}
