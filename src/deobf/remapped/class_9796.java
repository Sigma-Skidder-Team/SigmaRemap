package remapped;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.io.output.CountingOutputStream;

public class class_9796 extends CountingOutputStream {
   private static String[] field_49688;
   private ActionListener field_49686;

   public class_9796(class_8531 var1, OutputStream var2) {
      super(var2);
      this.field_49687 = var1;
   }

   public void method_45198(ActionListener var1) {
      this.field_49686 = var1;
   }

   public void afterWrite(int var1) throws IOException {
      super.afterWrite(var1);
      if (this.field_49686 != null) {
         this.field_49686.actionPerformed(new ActionEvent(this, 0, (String)null));
      }
   }
}
