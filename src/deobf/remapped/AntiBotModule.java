package remapped;

public class AntiBotModule extends Module {
   public AntiBotModule() {
      super(Category.COMBAT, "AntiBot", "Avoid the client to focus bots.");
      this.addSetting(new ModeSetting("Mode", "Mode", 0, "Advanced", "Hypixel").setModeClass(var1 -> this.initModes()));
   }

   @Override
   public void method_42012() {
      if (this.isEnabled()) {
         this.initModes();
      }
   }

   @Override
   public void onEnable() {
      this.initModes();
   }

   @Override
   public void onDisable() {
      SigmaMainClass.getInstance().method_3331().field_21538 = null;
      SigmaMainClass.getInstance().method_3331().field_21536.clear();
   }

   private void initModes() {
      SigmaMainClass.getInstance().method_3331().field_21536.clear();
      String var3 = this.getStringValueByName("Mode");
      switch (var3) {
         case "Advanced":
            SigmaMainClass.getInstance().method_3331().field_21538 = new MovementAntibot();
            break;
         case "Hypixel":
            SigmaMainClass.getInstance().method_3331().field_21538 = new HypixelAntibot();
      }
   }
}
