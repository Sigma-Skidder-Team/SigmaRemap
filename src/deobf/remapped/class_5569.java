package remapped;

public class class_5569 implements Runnable {
   private static String[] field_28297;
   private final boolean field_28296;

   public class_5569(boolean var1) {
      this.field_28296 = var1;
   }

   @Override
   public void run() {
      while (!Thread.interrupted()) {
         if (SigmaMainClass.getInstance().method_3312() == class_6015.field_30640) {
            try {
               Thread.sleep(200L);
            } catch (InterruptedException var4) {
               break;
            }
         } else {
            AccountManager.field_25938 = this.field_28296;
            break;
         }
      }
   }
}
