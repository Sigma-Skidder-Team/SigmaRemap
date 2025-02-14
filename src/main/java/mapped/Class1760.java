package mapped;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.io.output.CountingOutputStream;

public class Class1760 extends CountingOutputStream {
   private static String[] field9539;
   private ActionListener field9540;
   public final Class9478 field9541;

   public Class1760(Class9478 var1, OutputStream var2) {
      super(var2);
      this.field9541 = var1;
   }

   public void method7701(ActionListener var1) {
      this.field9540 = var1;
   }

   public void afterWrite(int var1) throws IOException {
      super.afterWrite(var1);
      if (this.field9540 != null) {
         this.field9540.actionPerformed(new ActionEvent(this, 0, (String)null));
      }
   }
}
