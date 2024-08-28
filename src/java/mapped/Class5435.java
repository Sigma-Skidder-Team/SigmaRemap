package mapped;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public final class Class5435 extends Class5436 {
   private static String[] field24176;
   public final int field24177;
   public final String field24178;

   public Class5435(String var1, String var2, int var3, String var4) {
      super(var1, var2);
      this.field24177 = var3;
      this.field24178 = var4;
   }

   @Override
   public void method17099() {
      JSpinner var3 = new JSpinner(new SpinnerNumberModel(this.field24177, -32768, 32767, 1));
      if (this.method17104(var3, this.field24178)) {
         this.field24179 = String.valueOf(var3.getValue());
      }
   }

   @Override
   public Object method17100() {
      return Integer.valueOf(this.field24179);
   }
}
