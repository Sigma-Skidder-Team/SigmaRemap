package remapped;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public final class class_5701 extends WindowAdapter {
   public class_5701(class_7990 var1, JFrame var2, class_4497 var3) {
      this.field_28851 = var1;
      this.field_28849 = var2;
      this.field_28852 = var3;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      if (!class_7990.access$000(this.field_28851).getAndSet(true)) {
         this.field_28849.setTitle("Minecraft server - shutting down!");
         this.field_28852.method_1641(true);
         class_7990.access$100(this.field_28851);
      }
   }
}
