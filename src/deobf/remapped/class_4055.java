package remapped;

import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioFormat;

public class class_4055 extends class_728 {
   private static String[] field_19752;
   private final class_7094 field_19755;
   private final class_8405 field_19751;
   private final class_3885 field_19753;
   private AudioFormat field_19756 = null;
   private byte[] field_19754;

   public class_4055(InputStream var1, AudioFormat var2, long var3) throws IOException {
      super(var1, var2, var3);
      this.field_19755 = new class_7094(var1);
      this.field_19751 = new class_8405(this.field_19755.method_32606());
      this.field_19753 = new class_3885();
   }

   @Override
   public AudioFormat getFormat() {
      if (this.field_19756 == null) {
         try {
            this.field_19751.method_38703(this.field_19755.method_32608(), this.field_19753);
            this.field_19756 = new AudioFormat(
               (float)this.field_19753.method_17970(), this.field_19753.method_17969(), this.field_19753.method_17962(), true, true
            );
            this.field_19754 = this.field_19753.method_17971();
         } catch (IOException var4) {
            return null;
         }
      }

      return this.field_19756;
   }

   @Override
   public void method_11368() {
      try {
         if (this.field_19754 == null) {
            this.field_19751.method_38703(this.field_19755.method_32608(), this.field_19753);
            this.field_3984.method_4918(this.field_19753.method_17971());
         } else {
            this.field_3984.method_4918(this.field_19754);
            this.field_19754 = null;
         }
      } catch (IOException var4) {
         this.field_3984.method_4917();
      }
   }
}
