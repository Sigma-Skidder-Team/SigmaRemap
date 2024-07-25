package remapped;

public class class_2228 extends class_4403 {
   @Override
   public String method_20527() {
      return "autoteam";
   }

   @Override
   public String method_20529() {
      return "Toggle automatically teaming to prevent colliding.";
   }

   @Override
   public boolean method_20525(class_7235 var1, String[] var2) {
      class_5283 var5 = class_3446.method_15886().method_34621();
      boolean var6 = !class_3446.method_15884().method_25815();
      var5.method_24116("auto-team", var6);
      var5.method_24118();
      this.method_20528(var1, "&6We will %s", new Object[]{!var6 ? "&cno longer auto team players" : "&aautomatically team players"});
      this.method_20528(var1, "&6All players will need to re-login for the change to take place.", new Object[0]);
      return true;
   }
}
