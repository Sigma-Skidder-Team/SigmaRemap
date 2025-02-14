package mapped;

import net.minecraft.server.dedicated.ServerHangWatchdog;

import java.util.TimerTask;

public class Class1616 extends TimerTask {
   private static String[] field8756;
   public final ServerHangWatchdog field8757;

   public Class1616(ServerHangWatchdog var1) {
      this.field8757 = var1;
   }

   @Override
   public void run() {
      Runtime.getRuntime().halt(1);
   }
}
