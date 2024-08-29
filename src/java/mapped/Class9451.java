package mapped;

public class Class9451 extends MovementInput {
   private static String[] field43904;
   private final GameSettings field43905;

   public Class9451(GameSettings var1) {
      this.field43905 = var1;
   }

   @Override
   public void method36336(boolean var1) {
      this.field43909 = this.field43905.field44632.isKeyDown();
      this.field43910 = this.field43905.field44634.isKeyDown();
      this.field43911 = this.field43905.field44633.isKeyDown();
      this.field43912 = this.field43905.field44635.isKeyDown();
      this.field43908 = this.field43909 != this.field43910 ? (!this.field43909 ? -1.0F : 1.0F) : 0.0F;
      this.field43907 = this.field43911 != this.field43912 ? (!this.field43911 ? -1.0F : 1.0F) : 0.0F;
      this.field43913 = this.field43905.field44636.isKeyDown();
      this.field43914 = this.field43905.field44637.isKeyDown();
      if (var1) {
         this.field43907 = (float)((double)this.field43907 * 0.3);
         this.field43908 = (float)((double)this.field43908 * 0.3);
      }
   }
}
