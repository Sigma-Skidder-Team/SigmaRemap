package remapped;

import java.io.OutputStream;

public class class_5868 extends class_1032 {
   public class_5868(String var1, OutputStream var2) {
      super(var1, var2);
   }

   @Override
   public void method_4562(String var1) {
      StackTraceElement[] var4 = Thread.currentThread().getStackTrace();
      StackTraceElement var5 = var4[Math.min(3, var4.length)];
      field_5712.info("[{}]@.({}:{}): {}", this.field_5713, var5.getFileName(), var5.getLineNumber(), var1);
   }
}
