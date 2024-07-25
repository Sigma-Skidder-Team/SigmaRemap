package remapped;

import com.mojang.brigadier.suggestion.Suggestion;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class class_5694 extends Module {
   public String field_28841 = null;
   public List<String> field_28840 = new ArrayList<String>();
   public List<String> field_28842 = new ArrayList<String>();

   public class_5694() {
      super(Category.EXPLOIT, "Dumper", "Dumps the plugins/commands from the server");
   }

   @Override
   public void method_42006() {
      this.field_28841 = null;
      this.field_28840.clear();
      this.field_28842.clear();
      class_314.method_1443("Dumping...");
      this.method_25757("");
   }

   @Override
   public void method_42020() {
      class_314.method_1443("Done.");
      class_314.method_1443("§aPlugins:");
      StringBuilder var3 = new StringBuilder();

      for (String var5 : this.field_28842) {
         var3.append(var5).append(", ");
      }

      String var10 = var3.substring(0, var3.length() - 2);
      class_314.method_1443(var10);
      class_314.method_1443("§aCommands:");
      var3 = new StringBuilder();

      for (String var6 : this.field_28840) {
         var3.append(var6).append(", ");
      }

      String var12 = var3.substring(0, var3.length() - 2);
      class_314.method_1443(var12);

      try {
         File var13 = new File(SigmaMainClass.getInstance().method_3334() + "/plugin_and_command_dump.txt");
         if (!var13.exists()) {
            var13.createNewFile();
         }

         FileWriter var7 = new FileWriter(var13);
         var7.write("Plugins: " + var10 + "\n\n");
         var7.write("Commands: " + var12 + "\n");
         var7.close();
         class_314.method_1443("§bDumped to: " + var13.getAbsolutePath());
      } catch (IOException var8) {
         var8.printStackTrace();
         class_314.method_1443("§cCould not save dump file.");
      }
   }

   private String method_25758() {
      return !this.field_28841.equals("") ? (!this.field_28841.equals("z") ? Character.toString((char)(this.field_28841.charAt(0) + 1)) : null) : "a";
   }

   @EventListen
   private void method_25759(class_139 var1) {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_2610) {
            for (Suggestion var6 : ((class_2610)var1.method_557()).method_11842().getList()) {
               String[] var7 = var6.getText().split(":");
               if (var7.length > 1) {
                  String var8 = var7[0].substring(1, var7[0].length());
                  if (!var8.equals("minecraft") && !var8.equals("bukkit") && !this.field_28842.contains(var8)) {
                     this.field_28842.add(var8);
                  }
               }

               if (!this.field_28840.contains(var6.getText())) {
                  this.field_28840.add(var6.getText());
               }
            }

            String var9 = this.method_25758();
            if (var9 == null) {
               this.method_41999();
            } else {
               this.method_25757(var9);
            }
         }
      }
   }

   private void method_25757(String var1) {
      this.field_28841 = var1;
      mcInstance.method_8614().method_4813(new class_6248(0, "/" + var1));
   }
}
