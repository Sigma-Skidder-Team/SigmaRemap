package mapped;

public class Class7132<T extends Throwable> {
   private static String[] field30669;
   private T field30670;

   public void method22240(T var1) {
      if (this.field30670 != null) {
         this.field30670.addSuppressed(var1);
      } else {
         this.field30670 = (T)var1;
      }
   }

   public void method22241() throws T {
      if (this.field30670 != null) {
         throw this.field30670;
      }
   }
}
