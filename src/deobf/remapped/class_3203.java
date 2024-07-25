package remapped;

import java.io.IOException;
import java.util.logging.Level;

public final class class_3203 implements class_5322 {
   private final class_8067 field_15995;
   public int field_15997;
   public byte field_15994;
   public int field_15996;
   public int field_16000;
   public short field_15998;

   public class_3203(class_8067 var1) {
      this.field_15995 = var1;
   }

   @Override
   public long method_24273(class_7059 var1, long var2) throws IOException {
      while (this.field_16000 == 0) {
         this.field_15995.method_36583((long)this.field_15998);
         this.field_15998 = 0;
         if ((this.field_15994 & 4) != 0) {
            return -1L;
         }

         this.method_14738();
      }

      long var6 = this.field_15995.method_24273(var1, Math.min(var2, (long)this.field_16000));
      if (var6 != -1L) {
         this.field_16000 = (int)((long)this.field_16000 - var6);
         return var6;
      } else {
         return -1L;
      }
   }

   @Override
   public class_245 method_19192() {
      return this.field_15995.method_19192();
   }

   @Override
   public void close() throws IOException {
   }

   private void method_14738() throws IOException {
      int var3 = this.field_15996;
      this.field_15997 = this.field_16000 = class_5487.method_24939(this.field_15995);
      byte var4 = (byte)(this.field_15995.method_36602() & 255);
      this.field_15994 = (byte)(this.field_15995.method_36602() & 255);
      if (class_5487.field_27967.isLoggable(Level.FINE)) {
         class_5487.field_27967.fine(class_2842.method_12940(true, this.field_15996, this.field_15997, var4, this.field_15994));
      }

      this.field_15996 = this.field_15995.method_36603() & 2147483647;
      if (var4 == 9) {
         if (this.field_15996 != var3) {
            throw class_2842.method_12941("TYPE_CONTINUATION streamId changed");
         }
      } else {
         throw class_2842.method_12941("%s != TYPE_CONTINUATION", var4);
      }
   }
}
