package remapped;

import java.io.IOException;

public final class class_9722 extends class_5548 {
   private final class_120 field_49423;

   public class_9722(class_1987 var1, class_120 var2) {
      super("OkHttp %s", var1.method_9163());
      this.field_49425 = var1;
      this.field_49423 = var2;
   }

   public String method_44923() {
      return this.field_49425.field_10061.method_18136().method_7449();
   }

   public class_3918 method_44922() {
      return this.field_49425.field_10061;
   }

   public class_1987 method_44924() {
      return this.field_49425;
   }

   @Override
   public void method_25227() {
      boolean var3 = false;

      try {
         class_7839 var4 = this.field_49425.method_9165();
         if (this.field_49425.field_10066.method_2508()) {
            var3 = true;
            this.field_49423.method_350(this.field_49425, new IOException("Canceled"));
         } else {
            var3 = true;
            this.field_49423.method_351(this.field_49425, var4);
         }
      } catch (IOException var8) {
         if (var3) {
            class_3307.method_15163().method_15167(4, "Callback failure for " + this.field_49425.method_9162(), var8);
         } else {
            this.field_49423.method_350(this.field_49425, var8);
         }
      } finally {
         this.field_49425.field_10062.method_36655().method_7428(this);
      }
   }
}
