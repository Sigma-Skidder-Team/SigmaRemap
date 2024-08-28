package mapped;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public final class Class5441 extends Class5436 {
   private static String[] field24187;
   public final float field24188;
   public final float field24189;
   public final float field24190;
   public final String field24191;

   public Class5441(String var1, String var2, float var3, float var4, float var5, String var6) {
      super(var1, var2);
      this.field24188 = var3;
      this.field24189 = var4;
      this.field24190 = var5;
      this.field24191 = var6;
   }

   @Override
   public void method17099() {
      JSpinner var3 = new JSpinner(new SpinnerNumberModel((double)this.field24188, (double)this.field24189, (double)this.field24190, 0.1F));
      if (this.method17104(var3, this.field24191)) {
         this.field24179 = String.valueOf(((Double)var3.getValue()).floatValue());
      }
   }

   @Override
   public Object method17100() {
      return Float.valueOf(this.field24179);
   }
}
