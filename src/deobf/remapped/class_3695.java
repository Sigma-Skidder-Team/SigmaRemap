package remapped;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class class_3695 implements ActionListener {
   private final String field_18098;
   private final File field_18101;
   private final class_9663 field_18103;
   private final class_1432 field_18102;

   private class_3695(class_8531 var1, String var2, File var3, class_9663 var4, class_1432 var5) {
      this.field_18100 = var1;
      this.field_18098 = var2;
      this.field_18101 = var3;
      this.field_18103 = var4;
      this.field_18102 = var5;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.field_18102.field_7734 = ((class_9796)var1.getSource()).getByteCount();
      if (this.field_18102.field_7734 >= this.field_18102.field_7732
         && !class_8531.method_39273(this.field_18100)
         && !class_8531.method_39270(this.field_18100)) {
         try {
            class_8531.method_39266(this.field_18100, true);
            class_8531.method_39279(this.field_18100, this.field_18098, this.field_18101, this.field_18103);
         } catch (IOException var5) {
            class_8531.method_39275().error("Error extracting archive", var5);
            class_8531.method_39263(this.field_18100, true);
         }
      }
   }
}
