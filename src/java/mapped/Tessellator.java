package mapped;

public class Tessellator {
   private static String[] field43406;
   private final BufferBuilder field43407;
   private static final Tessellator field43408 = new Tessellator();

   public static Tessellator getInstance() {
      RenderSystem.method27808(RenderSystem::method27807);
      return field43408;
   }

   public Tessellator(int var1) {
      this.field43407 = new BufferBuilder(var1);
   }

   public Tessellator() {
      this(2097152);
   }

   public void draw() {
      if (this.field43407.field24134 != null) {
         Class4501.method14216(this.field43407.field24134);
      }

      this.field43407.method17065();
      Class4395.method13895(this.field43407);
   }

   public BufferBuilder getBuffer() {
      return this.field43407;
   }
}
