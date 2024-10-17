package mapped;

import com.mentalfrostbyte.jello.gui.screens.JelloKeyboardScreen;

public class Class1376 implements Runnable {
   private static String[] field7351;
   public final JelloKeyboardScreen field7352;
   public final JelloKeyboardScreen field7353;

   public Class1376(JelloKeyboardScreen var1, JelloKeyboardScreen var2) {
      this.field7353 = var1;
      this.field7352 = var2;
   }

   @Override
   public void run() {
      this.field7353.field20957.method13242();
      this.field7352.method13244();
      this.field7353.field20961 = 0;
   }
}
