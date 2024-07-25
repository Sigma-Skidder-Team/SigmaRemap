package remapped;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public final class class_1139 extends class_8064 {
   public class_1139(String var1, String var2, String[][] var3, String var4, String var5) {
      super(var1, var2);
      this.field_6458 = var3;
      this.field_6461 = var4;
      this.field_6460 = var5;
   }

   @Override
   public void method_10499() {
      int var3 = -1;
      DefaultComboBoxModel var4 = new DefaultComboBoxModel();

      for (int var5 = 0; var5 < this.field_6458.length; var5++) {
         var4.addElement(this.field_6458[var5][0]);
         if (this.method_4994(var5).equals(this.field_6461)) {
            var3 = var5;
         }
      }

      JComboBox var6 = new JComboBox(var4);
      var6.setSelectedIndex(var3);
      if (this.method_36570(var6, this.field_6460)) {
         this.field_41269 = this.method_4994(var6.getSelectedIndex());
      }
   }

   private String method_4994(int var1) {
      return this.field_6458[var1].length != 1 ? this.field_6458[var1][1] : this.field_6458[var1][0];
   }

   @Override
   public String toString() {
      for (int var3 = 0; var3 < this.field_6458.length; var3++) {
         if (this.method_4994(var3).equals(this.field_41269)) {
            return this.field_6458[var3][0].toString();
         }
      }

      return "";
   }

   @Override
   public Object method_10500() {
      return this.field_41269;
   }
}
