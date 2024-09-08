package mapped;

public class Class1533 implements Runnable {
   public final JelloKeyboardScreen field8318;
   public final JelloKeyboardScreen field8319;

   public Class1533(JelloKeyboardScreen var1, JelloKeyboardScreen var2) {
      this.field8319 = var1;
      this.field8318 = var2;
   }

   @Override
   public void run() {
      this.field8318
         .addToList(
            this.field8319.field20960 = new Class4358(
               this.field8318, "mods", 0, 0, JelloKeyboardScreen.method13337(this.field8319), JelloKeyboardScreen.method13338(this.field8319)
            )
         );
      this.field8319.field20960.method13623((var1, var2) -> {
         if (var2 != null) {
            var2.method21598(this.field8319.field20957.field20696);
         }

         JelloKeyboardScreen.method13339(this.field8319);
      });
      this.field8319.field20960.method13292(true);
   }
}
