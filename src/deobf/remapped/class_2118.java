package remapped;

public final class class_2118 extends Thread {
   public class_2118(String var1) {
      super(var1);
   }

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(2147483647L);
         } catch (InterruptedException var4) {
            Util.method_44663().warn("Timer hack thread interrupted, that really should not happen");
            return;
         }
      }
   }
}
