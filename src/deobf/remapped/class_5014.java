package remapped;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.UUID;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

public class class_5014 {
   public HttpClient field_25928;
   public class_8646 field_25936;
   public class_4042 field_25940;
   public String field_25931 = "https://jelloprg.sigmaclient.info/";
   public String field_25932 = this.field_25931 + "/login";
   public String field_25934 = this.field_25931 + "/register";
   public String field_25941 = this.field_25931 + "/claim_premium";
   public String field_25935 = this.field_25931 + "/challenge";
   public String field_25929;
   public String field_25939 = UUID.randomUUID().toString().replaceAll("-", "");
   public static boolean field_25938 = false;
   public static boolean field_25930 = false;
   public class_4489 field_25933;

   public class_5014() {
      this.field_25928 = HttpClients.createDefault();
      if (!field_25938) {
      }
   }

   public void method_23087() {
      SigmaMainClass.method_3328().method_3302().method_7908(this);
      this.field_25933 = new class_4489(this);
   }

   public String method_23079(String var1, String var2, class_8646 var3) {
      String var6 = "Unexpected error";

      try {
         HttpPost var7 = new HttpPost(this.field_25932);
         ArrayList var8 = new ArrayList();
         var8.add(new BasicNameValuePair("username", var1));
         var8.add(new BasicNameValuePair("password", var2));
         var8.add(new BasicNameValuePair("challengeUid", var3.method_39657()));
         var8.add(new BasicNameValuePair("challengeAnswer", var3.method_39660()));
         var8.add(new BasicNameValuePair("token", this.field_25939));
         var3.method_39655(false);
         var7.setEntity(new UrlEncodedFormEntity(var8, "UTF-8"));
         HttpResponse var9 = this.field_25928.execute(var7);
         HttpEntity var10 = var9.getEntity();
         if (var10 != null) {
            String var15;
            try (InputStream var11 = var10.getContent()) {
               String var13 = IOUtils.toString(var11, "UTF-8");
               class_3559 var14 = new class_3559(var13);
               if (var14.method_5826("success")) {
                  if (var14.method_5850("premium")) {
                     new Thread(new class_5569(var14.method_5826("premium"))).start();
                  }

                  this.method_23091(var14);
                  return null;
               }

               if (var14.method_5850("error")) {
                  var6 = var14.method_5861("error");
               }

               var15 = var6;
            }

            return var15;
         }
      } catch (IOException var28) {
         var6 = var28.getMessage();
         var28.printStackTrace();
      }

      return var6;
   }

   public String method_23082(String var1, String var2, String var3, class_8646 var4) {
      if (var3 == null) {
         var3 = "";
      }

      String var7 = "Unexpected error";

      try {
         HttpPost var8 = new HttpPost(this.field_25934);
         ArrayList var9 = new ArrayList();
         var9.add(new BasicNameValuePair("username", var1));
         var9.add(new BasicNameValuePair("password", var2));
         var9.add(new BasicNameValuePair("email", var3));
         var9.add(new BasicNameValuePair("challengeUid", var4.method_39657()));
         var9.add(new BasicNameValuePair("challengeAnswer", var4.method_39660()));
         var9.add(new BasicNameValuePair("token", this.field_25939));
         var4.method_39655(false);
         var8.setEntity(new UrlEncodedFormEntity(var9, "UTF-8"));
         HttpResponse var10 = this.field_25928.execute(var8);
         HttpEntity var11 = var10.getEntity();
         if (var11 != null) {
            String var16;
            try (InputStream var12 = var11.getContent()) {
               String var14 = IOUtils.toString(var12, "UTF-8");
               class_3559 var15 = new class_3559(var14);
               if (var15.method_5826("success")) {
                  this.method_23091(var15);
                  return null;
               }

               if (var15.method_5850("error")) {
                  var7 = var15.method_5861("error");
               }

               var16 = var7;
            }

            return var16;
         }
      } catch (IOException var29) {
         var7 = var29.getMessage();
         var29.printStackTrace();
      }

      return var7;
   }

   public String method_23078() {
      String var3 = "Unexpected error";

      try {
         HttpPost var4 = new HttpPost(this.field_25932);
         ArrayList var5 = new ArrayList();
         var5.add(new BasicNameValuePair("auth_token", this.field_25940.field_19613));
         var5.add(new BasicNameValuePair("token", this.field_25939));
         var4.setEntity(new UrlEncodedFormEntity(var5, "UTF-8"));
         HttpResponse var6 = this.field_25928.execute(var4);
         HttpEntity var7 = var6.getEntity();
         if (var7 != null) {
            String var12;
            try (InputStream var8 = var7.getContent()) {
               String var10 = IOUtils.toString(var8, "UTF-8");
               class_3559 var11 = new class_3559(var10);
               if (var11.method_5826("success")) {
                  if (var11.method_5850("premium")) {
                     new Thread(new class_5569(var11.method_5826("premium"))).start();
                  }

                  this.method_23091(var11);
                  return null;
               }

               if (var11.method_5850("error")) {
                  var3 = var11.method_5861("error");
               }

               var12 = var3;
            }

            return var12;
         }
      } catch (IOException var25) {
         var3 = var25.getMessage();
         var25.printStackTrace();
      }

      return var3;
   }

   public void method_23092() {
      if (this.field_25940 == null) {
         File var3 = new File("jello/jello.lic");
         if (var3.exists()) {
            try {
               byte[] var4 = Files.readAllBytes(var3.toPath());
               this.field_25940 = new class_4042(var4);
               if (this.field_25940.field_19615 == null || this.field_25940.field_19615.length() == 0) {
                  this.field_25940 = null;
               }

               if (this.method_23078() != null) {
                  this.field_25940 = null;
               }
            } catch (IOException var5) {
            }
         }
      }
   }

   public String method_23085(String var1, class_8646 var2) {
      String var5 = "Unexpected error";

      try {
         HttpPost var6 = new HttpPost(this.field_25941);
         ArrayList var7 = new ArrayList();
         var7.add(new BasicNameValuePair("key", var1));
         var7.add(new BasicNameValuePair("challengeUid", var2.method_39657()));
         var7.add(new BasicNameValuePair("challengeAnswer", var2.method_39660()));
         var7.add(new BasicNameValuePair("token", this.field_25939));
         var2.method_39655(false);
         var6.setEntity(new UrlEncodedFormEntity(var7, "UTF-8"));
         HttpResponse var8 = this.field_25928.execute(var6);
         HttpEntity var9 = var8.getEntity();
         if (var9 != null) {
            String var14;
            try (InputStream var10 = var9.getContent()) {
               String var12 = IOUtils.toString(var10, "UTF-8");
               class_3559 var13 = new class_3559(var12);
               if (var13.method_5826("success")) {
                  this.method_23091(var13);
                  return null;
               }

               if (var13.method_5850("error")) {
                  var5 = var13.method_5861("error");
               }

               var14 = var5;
            }

            return var14;
         }
      } catch (IOException var27) {
         var5 = var27.getMessage();
         var27.printStackTrace();
      }

      return var5;
   }

   public class_8646 method_23083() {
      if (this.field_25936 != null && this.field_25936.method_39658()) {
         return this.field_25936;
      } else {
         try {
            HttpPost var3 = new HttpPost(this.field_25935);
            ArrayList var4 = new ArrayList();
            var4.add(new BasicNameValuePair("token", this.field_25939));
            var3.setEntity(new UrlEncodedFormEntity(var4, "UTF-8"));
            HttpResponse var5 = this.field_25928.execute(var3);
            HttpEntity var6 = var5.getEntity();
            if (var6 != null) {
               class_8646 var13;
               try (InputStream var7 = var6.getContent()) {
                  String var9 = IOUtils.toString(var7, "UTF-8");
                  class_3559 var10 = new class_3559(var9);
                  if (!var10.method_5826("success")) {
                     return null;
                  }

                  String var11 = var10.method_5861("uid");
                  boolean var12 = false;
                  if (var10.method_5850("captcha")) {
                     var12 = var10.method_5826("captcha");
                  }

                  this.field_25936 = new class_8646(var11, var12);
                  var13 = this.field_25936;
               }

               return var13;
            }
         } catch (IOException var26) {
            var26.printStackTrace();
         }

         return null;
      }
   }

   public void method_23091(class_1293 var1) {
      String var4 = null;
      String var5 = null;
      String var6 = null;
      if (var1.method_5850("username")) {
         var5 = var1.method_5861("username");
      }

      if (var1.method_5850("auth_token")) {
         var4 = var1.method_5861("auth_token");
      }

      if (var1.method_5850("agora_token")) {
         var6 = var1.method_5861("agora_token");
      }

      if (var4 != null && var5 != null && var6 != null) {
         try {
            this.field_25940 = new class_4042(var5, var4, var6);
            FileUtils.writeByteArrayToFile(new File("jello/jello.lic"), this.field_25940.method_18607());
         } catch (IOException var8) {
         }
      }

      if (var1.method_5850("session")) {
         this.method_23090(var1.method_5861("session"));
      }
   }

   public void method_23090(String var1) {
      if (!var1.equals("error")) {
         this.field_25929 = var1;
      } else {
         this.field_25929 = null;
      }
   }

   public class_4042 method_23081() {
      return this.field_25940;
   }

   public void method_23089() {
      this.field_25929 = null;
      this.field_25940 = null;
      field_25938 = false;
      File var3 = new File("jello/jello.lic");
      if (var3.exists()) {
         var3.delete();
      }
   }

   public String method_23080() {
      return this.field_25929;
   }

   public String method_23086() {
      return "User";
   }

   public String method_23077() {
      return this.field_25939;
   }

   public boolean method_23084() {
      return field_25938;
   }
}
