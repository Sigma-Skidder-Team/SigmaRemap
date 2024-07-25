package remapped;

public class class_6489 {
   public static String method_29605() {
      return SigmaMainClass.getInstance().getModuleManager() != null && SigmaMainClass.getInstance().getModuleManager().getModuleByClass(FakeForgeModule.class).method_42015()
         ? SigmaMainClass.getInstance().getModuleManager().getModuleByClass(FakeForgeModule.class).getStringValueByName("Client Brand")
         : "vanilla";
   }
}
