package remapped;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.sound.sampled.AudioFormat;

public class class_5069 extends class_728 {
   private final class_5043 field_26199;
   private final class_8405 field_26198;
   private final class_3885 field_26197;
   private AudioFormat field_26194;
   private byte[] field_26195;

   public class_5069(InputStream var1, AudioFormat var2, long var3) throws IOException {
      super(var1, var2, var3);
      class_4791 var7 = new class_4791(var1);
      class_5111 var8 = var7.method_22093();
      List var9 = var8.method_23447(class_3040.field_14907);
      if (!var9.isEmpty()) {
         this.field_26199 = (class_5043)var9.get(0);
         this.field_26198 = new class_8405(this.field_26199.method_8200());
         this.field_26197 = new class_3885();
      } else {
         throw new IOException("movie does not contain any AAC track");
      }
   }

   @Override
   public AudioFormat getFormat() {
      if (this.field_26194 == null) {
         this.method_23332();
         this.field_26194 = new AudioFormat(
            (float)this.field_26197.method_17970(), this.field_26197.method_17969(), this.field_26197.method_17962(), true, true
         );
         this.field_26195 = this.field_26197.method_17971();
      }

      return this.field_26194;
   }

   @Override
   public void method_11368() {
      if (this.field_26195 != null) {
         this.field_3984.method_4918(this.field_26195);
         this.field_26195 = null;
      } else {
         this.method_23332();
         if (this.field_3984.method_4916()) {
            this.field_3984.method_4918(this.field_26197.method_17971());
         }
      }
   }

   private void method_23332() {
      if (!this.field_26199.method_8219()) {
         this.field_3984.method_4917();
      } else {
         try {
            class_7553 var3 = this.field_26199.method_8199();
            if (var3 == null) {
               this.field_3984.method_4917();
            } else {
               this.field_26198.method_38703(var3.method_34368(), this.field_26197);
            }
         } catch (IOException var4) {
            this.field_3984.method_4917();
         }
      }
   }
}
