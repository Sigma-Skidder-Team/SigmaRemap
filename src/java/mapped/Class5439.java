package mapped;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public final class Class5439 extends Class5436 {
   public final String[][] field24184;
   public final String field24185;
   public final String field24186;

   public Class5439(String var1, String var2, String[][] var3, String var4, String var5) {
      super(var1, var2);
      this.field24184 = var3;
      this.field24185 = var4;
      this.field24186 = var5;
   }

   @Override
   public void method17099() {
      int var3 = -1;
      DefaultComboBoxModel var4 = new DefaultComboBoxModel();

      for (int var5 = 0; var5 < this.field24184.length; var5++) {
         var4.addElement(this.field24184[var5][0]);
         if (this.method17105(var5).equals(this.field24185)) {
            var3 = var5;
         }
      }

      JComboBox var6 = new JComboBox(var4);
      var6.setSelectedIndex(var3);
      if (this.method17104(var6, this.field24186)) {
         this.field24179 = this.method17105(var6.getSelectedIndex());
      }
   }

   private String method17105(int var1) {
      return this.field24184[var1].length != 1 ? this.field24184[var1][1] : this.field24184[var1][0];
   }

   @Override
   public String toString() {
      for (int var3 = 0; var3 < this.field24184.length; var3++) {
         if (this.method17105(var3).equals(this.field24179)) {
            return this.field24184[var3][0].toString();
         }
      }

      return "";
   }

   @Override
   public Object method17100() {
      return this.field24179;
   }
}
