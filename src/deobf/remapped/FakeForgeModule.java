package remapped;

public class FakeForgeModule extends Module {
   public FakeForgeModule() {
      super(Category.MISC, "FakeForge", "Fakes client mod type on connection");
      this.addSetting(new TextInputSetting("Client Brand", "Client brand to set", "fml,forge"));
   }
}
