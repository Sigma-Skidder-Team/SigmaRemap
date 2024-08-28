package mapped;

import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import com.mentalfrostbyte.jello.Client;
import org.apache.commons.io.IOUtils;
import totalcross.json.JSONException2;
import totalcross.json.JSONObject;

public class Config extends Command {
   private final String folder = "/configs/";
   private final String fileType = ".config";
   private final ArrayList<String> field25714 = new ArrayList<String>(Arrays.asList("add", "create", "new", "save"));
   private final ArrayList<String> field25715 = new ArrayList<String>(Arrays.asList("remove", "delete", "del", "rem"));

   public Config() {
      super("config", "Manage configs", "configs", "profiles", "profile");
      this.registerSubCommands(new String[]{"load/save/remove/list"});
   }

   @Override
   public void run(String var1, Class8623[] var2, Class6669 var3) throws CommandException {
      if (var2.length == 0) {
         throw new CommandException();
      } else if (var2.length <= 2) {
         if (var2[0].method30895() != Class2193.field14335) {
            throw new CommandException();
         } else {
            String var6 = var2[0].method30899().toLowerCase();
            if (!var6.equalsIgnoreCase("load")) {
               if (!this.field25714.contains(var6)) {
                  if (!this.field25715.contains(var6)) {
                     if (!var6.equalsIgnoreCase("list")) {
                        throw new CommandException();
                     }

                     var3.method20327("§l" + Client.getInstance().getModuleManager().method14667().method20772().size() + " " + this.method18342() + " :");

                     for (Class7286 var8 : Client.getInstance().getModuleManager().method14667().method20772()) {
                        boolean var9 = Client.getInstance().getModuleManager().method14667().method20770() == var8;
                        if (Client.getInstance().getClientMode() != ClientMode.CLASSIC || !var9) {
                           var3.method20327((!var9 ? "" : "§n") + var8.field31263);
                        }
                     }
                  } else if (var2.length != 1) {
                     String var10 = var2[1].method30899().toLowerCase();
                     if (!Client.getInstance().getModuleManager().method14667().method20765(var10)) {
                        var3.method20327(this.method18342() + " not found!");
                     } else {
                        var3.method20327("Removed " + this.method18342());
                     }
                  } else {
                     var3.method20327("Usage : .config remove <name>");
                  }
               } else if (var2.length != 1) {
                  String var11 = var2[1].method30899().toLowerCase();
                  Class7286 var13 = Client.getInstance().getModuleManager().method14667().method20770();
                  var13.field31262 = Client.getInstance().getModuleManager().method14657(new JSONObject());
                  Client.getInstance().getModuleManager().method14667().method20765(var11);
                  Client.getInstance().getModuleManager().method14667().method20763(new Class7286(var11, var13.field31262));
                  var3.method20327("Saved " + this.method18342());
               } else {
                  var3.method20327("Usage : .config save <name>");
               }
            } else if (var2.length != 1) {
               String var12 = var2[1].method30899().toLowerCase();
               Class7286 var14 = Client.getInstance().getModuleManager().method14667().method20766(var12);
               if (var14 == null) {
                  var3.method20327(this.method18342() + " not found!");
               } else {
                  Client.getInstance().getModuleManager().method14667().method20771(var14);
                  var3.method20327(this.method18342() + " was loaded!");
               }
            } else {
               var3.method20327("Usage : .config load <name>");
            }
         }
      } else {
         throw new CommandException("Too many arguments");
      }
   }

   public String method18342() {
      return Client.getInstance().getClientMode() != ClientMode.CLASSIC ? "Profile" : "Config";
   }

   public void method18343(String var1) {
      JSONObject var4 = Client.getInstance().getModuleManager().method14657(new JSONObject());
      File var5 = new File(Client.getInstance().getFile() + "/configs/");
      if (!var5.exists()) {
         var5.mkdirs();
      }

      File var6 = new File(Client.getInstance().getFile() + "/configs/" + var1 + ".config");
      if (!var6.exists()) {
         try {
            var6.createNewFile();
         } catch (IOException var9) {
            var9.printStackTrace();
         }
      }

      try {
         IOUtils.write(new JSONObject().toString(0), new FileOutputStream(var6));
      } catch (IOException | JSONException2 var8) {
         var8.printStackTrace();
      }
   }
}
