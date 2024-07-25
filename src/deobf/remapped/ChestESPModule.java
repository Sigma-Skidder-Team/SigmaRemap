package remapped;

public class ChestESPModule extends SecondModule {
   public ChestESPModule() {
      super(Category.RENDER, "ChestESP", "Allows you to see chests through blocks", new OutlineESP(), new BoxESP());
      this.addSetting(new BooleanSetting("Show Regular Chests", "Renders the regular chest esp", true));
      this.addSetting(new ColorSetting("Regular Color", "The render color", class_1255.field_6918.field_6917));
      this.addSetting(new BooleanSetting("Show Trapped Chests", "Renders the regular chest esp", true));
      this.addSetting(new ColorSetting("Trapped Color", "The render color", -13108));
      this.addSetting(new BooleanSetting("Show Ender Chests", "Renders the regular chest esp", true));
      this.addSetting(new ColorSetting("Ender Color", "The render color", -1848065));
   }
}
