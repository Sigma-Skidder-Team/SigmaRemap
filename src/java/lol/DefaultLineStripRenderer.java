package lol;

public class DefaultLineStripRenderer implements LineStripRenderer {
   private static String[] field31431;
   private SGL field31432 = Renderer.get();

   @Override
   public void method23241() {
      this.field31432.method18382();
   }

   @Override
   public void method23245(boolean var1) {
      if (!var1) {
         this.field31432.method18380(2848);
      } else {
         this.field31432.method18381(2848);
      }
   }

   @Override
   public void method23244(float var1) {
      this.field31432.method18388(var1);
   }

   @Override
   public void method23240() {
      this.field31432.method18369(3);
   }

   @Override
   public void method23242(float var1, float var2) {
      this.field31432.method18401(var1, var2);
   }

   @Override
   public void method23243(float var1, float var2, float var3, float var4) {
      this.field31432.method18376(var1, var2, var3, var4);
   }

   @Override
   public void method23246(boolean var1) {
   }

   @Override
   public boolean method23239() {
      return true;
   }
}
