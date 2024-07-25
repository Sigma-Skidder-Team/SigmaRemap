package remapped;

public final class WindowProvider implements AutoCloseable {
   private static String[] field_48144;
   private final MinecraftClient field_48143;
   private final class_7962 field_48145;

   public WindowProvider(MinecraftClient var1) {
      this.field_48143 = var1;
      this.field_48145 = new class_7962(Monitor::new);
   }

   public MainWindow method_43609(class_9706 var1, String var2, String var3) {
      return new MainWindow(this.field_48143, this.field_48145, var1, var2, var3);
   }

   @Override
   public void close() {
      this.field_48145.method_36025();
   }
}
