package mapped;

public class Class4507 extends Class4505 {
   public Class4507(boolean var1) {
      super("cull", () -> {
         if (!var1) {
            RenderSystem.method27850();
         }
      }, () -> {
         if (!var1) {
            RenderSystem.enableCull();
         }
      }, var1);
   }
}
