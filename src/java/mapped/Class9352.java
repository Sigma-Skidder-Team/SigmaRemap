package mapped;

public class Class9352 {
   private static String[] field43406;
   private final Class5425 field43407;
   private static final Class9352 field43408 = new Class9352();

   public static Class9352 method35409() {
      RenderSystem.method27808(RenderSystem::method27807);
      return field43408;
   }

   public Class9352(int var1) {
      this.field43407 = new Class5425(var1);
   }

   public Class9352() {
      this(2097152);
   }

   public void method35410() {
      if (this.field43407.field24134 != null) {
         Class4501.method14216(this.field43407.field24134);
      }

      this.field43407.method17065();
      Class4395.method13895(this.field43407);
   }

   public Class5425 method35411() {
      return this.field43407;
   }
}
