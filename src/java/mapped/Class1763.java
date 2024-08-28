package mapped;

import java.io.OutputStream;

public class Class1763 extends Class1762 {
   public Class1763(String var1, OutputStream var2) {
      super(var1, var2);
   }

   @Override
   public void method7703(String var1) {
      StackTraceElement[] var4 = Thread.currentThread().getStackTrace();
      StackTraceElement var5 = var4[Math.min(3, var4.length)];
      field9546.info("[{}]@.({}:{}): {}", this.field9547, var5.getFileName(), var5.getLineNumber(), var1);
   }
}
