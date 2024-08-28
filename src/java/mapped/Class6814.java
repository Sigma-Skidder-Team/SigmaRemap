package mapped;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.unmapped.Class1537;
import org.apache.commons.io.IOUtils;

public class Class6814 {
   private List<Class7286> field29667 = new ArrayList<Class7286>();
   private Class7286 field29668;
   private Class7286 field29669;
   public static final String field29670 = ".profile";
   public static final String field29671 = "/profiles/";
   public static final String field29672 = "Default";

   public void method20763(Class7286 var1) {
      this.field29667.add(0, var1);
   }

   public boolean method20764(Class7286 var1) {
      if (Client.getInstance().getClientMode() == ClientMode.CLASSIC && var1.field31263.equals("Classic")) {
         return false;
      } else if (this.field29667.size() <= 1) {
         return false;
      } else {
         this.field29667.remove(var1);
         if (var1 == this.field29668) {
            this.method20771(this.field29667.get(0));
         }

         return true;
      }
   }

   public boolean method20765(String var1) {
      for (Class7286 var5 : this.field29667) {
         if (var5.field31263.equals(var1) && this.method20764(var5)) {
            return true;
         }
      }

      return false;
   }

   public Class7286 method20766(String var1) {
      for (Class7286 var5 : this.field29667) {
         if (var5.field31263.toLowerCase().equals(var1.toLowerCase())) {
            return var5;
         }
      }

      return null;
   }

   public void method20767(String var1) throws IOException {
      File var4 = new File(Client.getInstance().getFile() + "/profiles/");
      if (!var4.exists()) {
         var4.mkdirs();
      }

      File[] var5 = var4.listFiles((var0, var1x) -> var1x.toLowerCase().endsWith(".profile"));

      for (File var9 : var5) {
         try {
            JSONObject var10 = new JSONObject(IOUtils.toString(new FileInputStream(var9)));
            Class7286 var11 = new Class7286().method22984(var10);
            var11.field31263 = var9.getName().substring(0, var9.getName().length() - ".profile".length());
            this.field29667.add(var11);
            if (var1 != null && var11.field31263.toLowerCase().equals(var1.toLowerCase())) {
               this.field29668 = var11;
            }
         } catch (Class2499 var12) {
            Client.getInstance().getLogger().method20357("Unable to load profile from " + var9.getName());
         }
      }

      if (this.field29667.size() == 0 || this.field29668 == null) {
         if (var1 == null || var1.length() == 0) {
            var1 = "Default";
         }

         this.field29667.add(this.field29668 = new Class7286(var1, new JSONObject()));
      }

      Client.getInstance().getModuleManager().method14656(this.field29668.field31262);
   }

   public boolean method20768(String var1) {
      for (Class7286 var5 : this.field29667) {
         if (var5.field31263.toLowerCase().equals(var1.toLowerCase())) {
            return true;
         }
      }

      return false;
   }

   public void method20769() throws IOException {
      this.field29668.field31262 = Client.getInstance().getModuleManager().method14657(new JSONObject());
      File var3 = new File(Client.getInstance().getFile() + "/profiles/");
      if (!var3.exists()) {
         var3.mkdirs();
      }

      File[] var4 = var3.listFiles((var0, var1) -> var1.toLowerCase().endsWith(".profile"));

      for (File var8 : var4) {
         var8.delete();
      }

      for (Class7286 var10 : this.field29667) {
         File var11 = new File(Client.getInstance().getFile() + "/profiles/" + var10.field31263 + ".profile");
         if (!var11.exists()) {
            var11.createNewFile();
         }

         IOUtils.write(var10.method22985(new JSONObject()).toString(0), new FileOutputStream(var11));
      }
   }

   public Class7286 method20770() {
      return this.field29668;
   }

   public void method20771(Class7286 var1) {
      Client.getInstance().method19924();
      Class1537.field8343 = new HashMap<Object, Integer>();
      if (Client.getInstance().getClientMode() != ClientMode.CLASSIC) {
         this.field29668.field31262 = Client.getInstance().getModuleManager().method14657(new JSONObject());
         this.field29668 = var1;
         Client.getInstance().getConfig().method21806("profile", var1.field31263);
         Client.getInstance().getModuleManager().method14656(var1.field31262);
         Client.getInstance().method19924();
      } else {
         this.field29668.field31262 = var1.method22986();
         Client.getInstance().getConfig().method21806("profile", "Classic");
         Client.getInstance().getModuleManager().method14656(var1.field31262);
         Client.getInstance().method19924();
      }
   }

   public List<Class7286> method20772() {
      return this.field29667;
   }
}
