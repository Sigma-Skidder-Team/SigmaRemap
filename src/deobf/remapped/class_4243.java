package remapped;

public class class_4243 extends SecondModule {
   public class_4243() {
      super(Category.RENDER, "ESP", "See entities anywhere anytime", new class_1370(), new class_7072(), new class_4033(), new VanillaShaderESPModule());
      this.addSetting(new BooleanSetting("Show Players", "Draws a line arround players", true));
      this.addSetting(new BooleanSetting("Show Mobs", "Draws a line arround hostile creatures", false));
      this.addSetting(new BooleanSetting("Show Passives", "Draws a line arround animals", false));
      this.addSetting(new BooleanSetting("Show Invisibles", "Shows invisible entities", true));
   }
}
