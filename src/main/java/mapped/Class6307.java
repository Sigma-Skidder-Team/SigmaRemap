package mapped;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public final class Class6307 extends WindowAdapter {
   public final MinecraftServerGui field27791;
   public final JFrame field27792;
   public final DedicatedServer field27793;

   public Class6307(MinecraftServerGui var1, JFrame var2, DedicatedServer var3) {
      this.field27791 = var1;
      this.field27792 = var2;
      this.field27793 = var3;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      if (!MinecraftServerGui.access$000(this.field27791).getAndSet(true)) {
         this.field27792.setTitle("Minecraft server - shutting down!");
         this.field27793.initiateShutdown(true);
         MinecraftServerGui.access$100(this.field27791);
      }
   }
}
