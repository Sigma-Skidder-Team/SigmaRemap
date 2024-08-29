package mapped;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public final class Class6307 extends WindowAdapter {
   public final Class2517 field27791;
   public final JFrame field27792;
   public final Class1645 field27793;

   public Class6307(Class2517 var1, JFrame var2, Class1645 var3) {
      this.field27791 = var1;
      this.field27792 = var2;
      this.field27793 = var3;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      if (!Class2517.access$000(this.field27791).getAndSet(true)) {
         this.field27792.setTitle("Minecraft server - shutting down!");
         this.field27793.initiateShutdown(true);
         Class2517.access$100(this.field27791);
      }
   }
}
