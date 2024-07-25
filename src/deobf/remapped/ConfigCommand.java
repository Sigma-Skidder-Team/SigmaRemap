package remapped;

import com.mentalfrostbyte.jello.commands.CommandException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.io.IOUtils;

public class ConfigCommand extends Command {
   private final String field_9430 = "/configs/";
   private final String field_9432 = ".config";
   private final ArrayList<String> field_9433 = new ArrayList<String>(Arrays.asList("add", "create", "new", "save"));
   private final ArrayList<String> field_9429 = new ArrayList<String>(Arrays.asList("remove", "delete", "del", "rem"));

   public ConfigCommand() {
      super("config", "Manage configs", "configs", "profiles", "profile");
      this.addArgument(new String[]{"load/save/remove/list"});
   }

   @Override
   public void run(String var1, class_5273[] var2, class_860 var3) throws CommandException {
      if (var2.length == 0) {
         throw new class_2900();
      } else if (var2.length <= 2) {
         if (var2[0].method_24063() != class_1451.field_7816) {
            throw new class_2900();
         } else {
            String var6 = var2[0].method_24060().toLowerCase();
            if (!var6.equalsIgnoreCase("load")) {
               if (!this.field_9433.contains(var6)) {
                  if (!this.field_9429.contains(var6)) {
                     if (!var6.equalsIgnoreCase("list")) {
                        throw new class_2900();
                     }

                     var3.method_3731("§l" + SigmaMainClass.getInstance().getModuleManager().method_848().method_4305().size() + " " + this.method_8240() + " :");

                     for (class_1675 var8 : SigmaMainClass.getInstance().getModuleManager().method_848().method_4305()) {
                        boolean var9 = SigmaMainClass.getInstance().getModuleManager().method_848().method_4301() == var8;
                        if (SigmaMainClass.getInstance().method_3312() != class_6015.field_30644 || !var9) {
                           var3.method_3731((!var9 ? "" : "§n") + var8.field_8677);
                        }
                     }
                  } else if (var2.length != 1) {
                     String var10 = var2[1].method_24060().toLowerCase();
                     if (!SigmaMainClass.getInstance().getModuleManager().method_848().method_4302(var10)) {
                        var3.method_3731(this.method_8240() + " not found!");
                     } else {
                        var3.method_3731("Removed " + this.method_8240());
                     }
                  } else {
                     var3.method_3731("Usage : .config remove <name>");
                  }
               } else if (var2.length != 1) {
                  String var11 = var2[1].method_24060().toLowerCase();
                  class_1675 var13 = SigmaMainClass.getInstance().getModuleManager().method_848().method_4301();
                  var13.field_8678 = SigmaMainClass.getInstance().getModuleManager().method_839(new JSONObjectImpl());
                  SigmaMainClass.getInstance().getModuleManager().method_848().method_4302(var11);
                  SigmaMainClass.getInstance().getModuleManager().method_848().method_4298(new class_1675(var11, var13.field_8678));
                  var3.method_3731("Saved " + this.method_8240());
               } else {
                  var3.method_3731("Usage : .config save <name>");
               }
            } else if (var2.length != 1) {
               String var12 = var2[1].method_24060().toLowerCase();
               class_1675 var14 = SigmaMainClass.getInstance().getModuleManager().method_848().method_4307(var12);
               if (var14 == null) {
                  var3.method_3731(this.method_8240() + " not found!");
               } else {
                  SigmaMainClass.getInstance().getModuleManager().method_848().method_4300(var14);
                  var3.method_3731(this.method_8240() + " was loaded!");
               }
            } else {
               var3.method_3731("Usage : .config load <name>");
            }
         }
      } else {
         throw new class_2900("Too many arguments");
      }
   }

   public String method_8240() {
      return SigmaMainClass.getInstance().method_3312() != class_6015.field_30644 ? "Profile" : "Config";
   }

   public void method_8239(String var1) {
      JSONObjectImpl var4 = SigmaMainClass.getInstance().getModuleManager().method_839(new JSONObjectImpl());
      File var5 = new File(SigmaMainClass.getInstance().method_3334() + "/configs/");
      if (!var5.exists()) {
         var5.mkdirs();
      }

      File var6 = new File(SigmaMainClass.getInstance().method_3334() + "/configs/" + var1 + ".config");
      if (!var6.exists()) {
         try {
            var6.createNewFile();
         } catch (IOException var9) {
            var9.printStackTrace();
         }
      }

      try {
         IOUtils.write(new JSONObjectImpl().toString(0), new FileOutputStream(var6));
      } catch (IOException | class_7584 var8) {
         var8.printStackTrace();
      }
   }
}
