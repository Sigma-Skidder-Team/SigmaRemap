package remapped;

public class class_736 extends class_4403 {
   @Override
   public String method_20527() {
      return "dontbugme";
   }

   @Override
   public String method_20529() {
      return "Toggle checking for updates";
   }

   @Override
   public boolean method_20525(class_7235 var1, String[] var2) {
      class_5283 var5 = class_3446.method_15886().method_34621();
      boolean var6 = !class_3446.method_15884().method_25841();
      class_3446.method_15884().method_25814(var6);
      var5.method_24118();
      this.method_20528(var1, "&6We will %snotify you about updates.", new Object[]{!var6 ? "&cnot " : "&a"});
      return true;
   }
}
