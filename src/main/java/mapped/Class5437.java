package mapped;

import javax.swing.JCheckBox;

public final class Class5437 extends Class5436 {
   private static String[] field24181;
   public final boolean field24182;
   public final String field24183;

   public Class5437(String var1, String var2, boolean var3, String var4) {
      super(var1, var2);
      this.field24182 = var3;
      this.field24183 = var4;
   }

   @Override
   public void method17099() {
      JCheckBox var3 = new JCheckBox();
      var3.setSelected(this.field24182);
      if (this.method17104(var3, this.field24183)) {
         this.field24179 = String.valueOf(var3.isSelected());
      }
   }

   @Override
   public Object method17100() {
      return Boolean.valueOf(this.field24179);
   }
}
