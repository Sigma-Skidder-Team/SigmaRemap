package remapped;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class class_4123 implements class_7411 {
   private ArrayList field_20086 = new ArrayList();
   private class_7411 field_20088;

   public void method_19138(class_7411 var1) {
      this.field_20086.add(var1);
   }

   @Override
   public ByteBuffer method_33768(InputStream var1) throws IOException {
      return this.method_33770(var1, false, null);
   }

   @Override
   public ByteBuffer method_33770(InputStream var1, boolean var2, int[] var3) throws IOException {
      return this.method_33769(var1, var2, false, var3);
   }

   @Override
   public ByteBuffer method_33769(InputStream var1, boolean var2, boolean var3, int[] var4) throws IOException {
      class_9505 var7 = new class_9505();
      ByteBuffer var8 = null;
      BufferedInputStream var9 = new BufferedInputStream(var1, var1.available());
      var9.mark(var1.available());

      for (int var10 = 0; var10 < this.field_20086.size(); var10++) {
         var9.reset();

         try {
            class_7411 var11 = (class_7411)this.field_20086.get(var10);
            var8 = var11.method_33769(var9, var2, var3, var4);
            this.field_20088 = var11;
            break;
         } catch (Exception var12) {
         }
      }

      if (this.field_20088 == null) {
         throw var7;
      } else {
         return var8;
      }
   }

   private void method_19139() {
      if (this.field_20088 == null) {
         throw new RuntimeException("Attempt to make use of uninitialised or invalid composite image data");
      }
   }

   @Override
   public int method_5154() {
      this.method_19139();
      return this.field_20088.method_5154();
   }

   @Override
   public int method_5153() {
      this.method_19139();
      return this.field_20088.method_5153();
   }

   @Override
   public ByteBuffer method_5152() {
      this.method_19139();
      return this.field_20088.method_5152();
   }

   @Override
   public int method_5151() {
      this.method_19139();
      return this.field_20088.method_5151();
   }

   @Override
   public int method_5150() {
      this.method_19139();
      return this.field_20088.method_5150();
   }

   @Override
   public int method_5155() {
      this.method_19139();
      return this.field_20088.method_5155();
   }

   @Override
   public void method_33771(boolean var1) {
      for (int var4 = 0; var4 < this.field_20086.size(); var4++) {
         ((class_7411)this.field_20086.get(var4)).method_33771(var1);
      }
   }
}
