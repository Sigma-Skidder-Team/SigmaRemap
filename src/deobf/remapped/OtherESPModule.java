package remapped;

public class OtherESPModule extends SecondModule {
   public OtherESPModule() {
      super(Category.RENDER, "ESP", "See entities anywhere anytime", new class_6467(), new class_9468(), new BoxOutlineESP(), new ShaderESP());
      this.addSetting(new BooleanSetting("Show Players", "Draws a line arround players", true));
      this.addSetting(new BooleanSetting("Show Mobs", "Draws a line arround hostile creatures", false));
      this.addSetting(new BooleanSetting("Show Passives", "Draws a line arround animals", false));
      this.addSetting(new BooleanSetting("Show Invisibles", "Shows invisible entities", true));
   }
}
