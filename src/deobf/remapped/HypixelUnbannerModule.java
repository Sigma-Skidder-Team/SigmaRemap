package remapped;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

public class HypixelUnbannerModule extends Module {
   public HttpClient field_28593 = null;
   public CookieStore field_28591 = new BasicCookieStore();
   public HttpClientBuilder field_28594 = HttpClientBuilder.create().setDefaultCookieStore(this.field_28591);
   public String field_28592 = "";

   public HypixelUnbannerModule() {
      super(Category.EXPLOIT, "Hypixel Unbanner", "Force unbans you from hypixel xD");
      this.field_28593 = this.field_28594.build();
   }

   @Override
   public void onEnable() {
      try {
         String var3 = "D8374378";
         String var4 = client.session.method_5366();
         String var5 = client.session.method_5367().replaceAll("-", "");
         if (this.method_25528() && this.method_25530("CREEPAKILLER987@S0NY.IGG.BIZ", "3Qs-Cnt-Dec-Tee")) {
            this.method_25533();
            JSONObjectImpl var6 = this.method_25532(var3, var5);
            System.out.println(var6);
            var6.method_5820("duration", "Permanent");
            var6.method_5820("subType", "COMPROMISED_ACCOUNT");
            var6.method_5820("reason", "Account Security Alert");
            var6.method_5820("tags", new JSONArray().method_6159("FI"));
            var6.method_5820("type", "0");
            if (this.method_25531(var6, var4.toLowerCase())) {
               this.method_25533();
            }

            this.method_25533();
         }
      } catch (IOException var7) {
         var7.printStackTrace();
      }
   }

   private boolean method_25528() throws IOException {
      HttpPost var3 = new HttpPost("https://hypixel.net/forums");
      HttpResponse var4 = this.field_28593.execute(var3);
      HttpEntity var5 = var4.getEntity();
      if (var5 == null) {
         return false;
      } else {
         InputStream var6 = var5.getContent();
         var6.close();
         System.out.println(this.field_28591.getCookies());
         return true;
      }
   }

   private boolean method_25531(JSONObjectImpl var1, String var2) throws IOException {
      HttpPost var5 = new HttpPost("https://hypixel.net/appeals/api/submit");
      ArrayList var6 = new ArrayList(2);
      var5.setHeader(":authority", "hypixel.net");
      var5.setHeader("accept", "application/json, text/plain, */*");
      var5.setHeader("x-requested-with", "XMLHttpRequest");
      var5.setHeader("referer", "https://hypixel.net/appeals/create");
      if (!var1.method_5850("punishment_type")) {
         return false;
      } else {
         var6.add(new BasicNameValuePair("punishment_type", var1.method_5861("punishment_type")));
         var6.add(new BasicNameValuePair("attachment_hash", "ecdfa37933135aa9c4cd995b98e25f83"));
         var6.add(new BasicNameValuePair("player[name]", var2));
         var6.add(new BasicNameValuePair("player[uuid]", var1.method_5861("uuid")));
         var6.add(new BasicNameValuePair("punishment_id", var1.method_5861("partialId")));
         Iterator var7 = var1.method_5841();

         while (var7.hasNext()) {
            String var8 = (String)var7.next();
            if (!var8.equals("tags")) {
               if (!var8.equals("date") && !var8.equals("type")) {
                  var6.add(new BasicNameValuePair("punishment[" + var8 + "]", var1.method_5861(var8)));
               } else {
                  var6.add(new BasicNameValuePair("punishment[" + var8 + "]", String.valueOf(var1.method_5840(var8))));
               }
            } else {
               var6.add(new BasicNameValuePair("punishment[" + var8 + "][]", var1.method_5849(var8).method_6133(0)));
            }
         }

         var6.add(new BasicNameValuePair("appeal_justification", ""));
         var6.add(new BasicNameValuePair("server_rules_acknowledgement", ""));
         var6.add(new BasicNameValuePair("_xfToken", this.field_28592));
         var6.add(new BasicNameValuePair("ban_category", "account_security_alert"));
         var6.add(new BasicNameValuePair("hacks_used", ""));
         var6.add(new BasicNameValuePair("hack_removal_acknowledgement", ""));
         var6.add(new BasicNameValuePair("comp_account_acknowledgement", ""));
         var6.add(new BasicNameValuePair("minecraft_password_change_acknowledgement", "Yes"));
         var6.add(new BasicNameValuePair("previous_ban_acknowledgement", "No"));
         var6.add(new BasicNameValuePair("account_security_alert_acknowledgement", "Yes"));
         var5.setEntity(new UrlEncodedFormEntity(var6, "UTF-8"));
         HttpResponse var11 = this.field_28593.execute(var5);
         HttpEntity var9 = var11.getEntity();
         if (var9 == null) {
            return false;
         } else {
            InputStream var10 = var9.getContent();
            System.out.println(IOUtils.toString(var10, "UTF-8"));
            var10.close();
            return true;
         }
      }
   }

   private JSONObjectImpl method_25532(String var1, String var2) throws IOException {
      HttpGet var5 = new HttpGet("https://hypixel.net/api/account/punishment?type=ban&id=" + var1 + "&player_uuid=" + var2.replaceAll("-", ""));
      var5.setHeader(":authority", "hypixel.net");
      var5.setHeader("accept", "application/json, text/plain, */*");
      var5.setHeader("x-requested-with", "XMLHttpRequest");
      var5.setHeader("referer", "https://hypixel.net/appeals/create");
      HttpResponse var6 = this.field_28593.execute(var5);
      HttpEntity var7 = var6.getEntity();
      if (var7 == null) {
         return null;
      } else {
         InputStream var8 = var7.getContent();
         String var9 = IOUtils.toString(var8, "UTF-8");
         System.out.println(var9);
         var8.close();
         return new JSONObjectImpl(var9);
      }
   }

   private boolean method_25533() throws IOException {
      HttpGet var3 = new HttpGet("https://hypixel.net/account/unlink-minecraft");
      var3.setHeader(":authority", "hypixel.net");
      var3.setHeader("accept", "application/json, text/plain, */*");
      var3.setHeader("x-requested-with", "XMLHttpRequest");
      var3.setHeader("referer", "https://hypixel.net/account/minecraft");
      HttpResponse var4 = this.field_28593.execute(var3);
      HttpEntity var5 = var4.getEntity();
      if (var5 == null) {
         return false;
      } else {
         InputStream var6 = var5.getContent();
         var6.close();
         return true;
      }
   }

   private boolean method_25529() throws IOException {
      HttpGet var3 = new HttpGet("https://hypixel.net/account/unlink-minecraft");
      var3.setHeader(":authority", "hypixel.net");
      var3.setHeader("accept", "application/json, text/plain, */*");
      var3.setHeader("x-requested-with", "XMLHttpRequest");
      var3.setHeader("referer", "https://hypixel.net/account/minecraft");
      HttpResponse var4 = this.field_28593.execute(var3);
      HttpEntity var5 = var4.getEntity();
      if (var5 == null) {
         return false;
      } else {
         InputStream var6 = var5.getContent();
         var6.close();
         return true;
      }
   }

   private boolean method_25530(String var1, String var2) throws IOException {
      HttpPost var5 = new HttpPost("https://hypixel.net/login/login");
      ArrayList var6 = new ArrayList(2);
      var6.add(new BasicNameValuePair("login", var1));
      var6.add(new BasicNameValuePair("register", "0"));
      var6.add(new BasicNameValuePair("password", var2));
      var6.add(new BasicNameValuePair("cookie_check", "1"));
      var6.add(new BasicNameValuePair("_xfToken", this.field_28592));
      var6.add(new BasicNameValuePair("redirect", "https://hypixel.net/forums/"));
      var5.setEntity(new UrlEncodedFormEntity(var6, "UTF-8"));
      HttpResponse var7 = this.field_28593.execute(var5);
      HttpEntity var8 = var7.getEntity();
      if (var8 == null) {
         return false;
      } else {
         InputStream var9 = var8.getContent();
         String var10 = "<input type=\"hidden\" name=\"_xfToken\" value=\"([^\\n]+)\" \\/>";
         String var11 = IOUtils.toString(var9, "UTF-8");
         Pattern var12 = Pattern.compile("<input type=\"hidden\" name=\"_xfToken\" value=\"([^\\n]+)\" \\/>", 8);
         Matcher var13 = var12.matcher(var11);
         if (var13.find()) {
            this.field_28592 = var13.group(1);
         }

         var9.close();
         return true;
      }
   }
}
