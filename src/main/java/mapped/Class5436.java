package mapped;

import java.awt.EventQueue;
import javax.swing.JComponent;

public abstract class Class5436 implements Class5438 {
   public String field24179;
   public String field24180;

   public Class5436(String var1, String var2) {
      this.field24179 = var2;
      this.field24180 = var1;
   }

   @Override
   public void method17101(String var1) {
      this.field24179 = var1;
   }

   @Override
   public String method17102() {
      return this.field24179;
   }

   @Override
   public String method17103() {
      return this.field24180;
   }

   @Override
   public String toString() {
      return this.field24179 != null ? this.field24179.toString() : "";
   }

   public boolean method17104(JComponent var1, String var2) {
      Class2516 var5 = new Class2516(var1, this.field24180, var2);
      var5.setTitle(this.field24180);
      var5.setLocationRelativeTo(null);
      EventQueue.invokeLater(new Class1460(this, var1));
      var5.setVisible(true);
      return var5.field16650;
   }
}
