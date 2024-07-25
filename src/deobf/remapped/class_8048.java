package remapped;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SocketChannel;

@Deprecated
public class class_8048 implements class_3775 {
   private static String[] field_41212;
   private final ByteChannel field_41213;

   @Deprecated
   public class_8048(ByteChannel var1) {
      this.field_41213 = var1;
   }

   @Deprecated
   public class_8048(class_3775 var1) {
      this.field_41213 = var1;
   }

   @Override
   public int read(ByteBuffer var1) throws IOException {
      return this.field_41213.read(var1);
   }

   @Override
   public boolean isOpen() {
      return this.field_41213.isOpen();
   }

   @Override
   public void close() throws IOException {
      this.field_41213.close();
   }

   @Override
   public int write(ByteBuffer var1) throws IOException {
      return this.field_41213.write(var1);
   }

   @Override
   public boolean method_17469() {
      return this.field_41213 instanceof class_3775 && ((class_3775)this.field_41213).method_17469();
   }

   @Override
   public void method_17471() throws IOException {
      if (this.field_41213 instanceof class_3775) {
         ((class_3775)this.field_41213).method_17471();
      }
   }

   @Override
   public boolean method_17472() {
      return this.field_41213 instanceof class_3775 && ((class_3775)this.field_41213).method_17472();
   }

   @Override
   public int method_17470(ByteBuffer var1) throws IOException {
      return !(this.field_41213 instanceof class_3775) ? 0 : ((class_3775)this.field_41213).method_17470(var1);
   }

   @Override
   public boolean method_17473() {
      if (!(this.field_41213 instanceof SocketChannel)) {
         return !(this.field_41213 instanceof class_3775) ? false : ((class_3775)this.field_41213).method_17473();
      } else {
         return ((SocketChannel)this.field_41213).isBlocking();
      }
   }
}
