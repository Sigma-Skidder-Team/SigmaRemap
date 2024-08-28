package mapped;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SocketChannel;

@Deprecated
public class Class1789 implements Class1788 {
   private static String[] field9644;
   private final ByteChannel field9645;

   @Deprecated
   public Class1789(ByteChannel var1) {
      this.field9645 = var1;
   }

   @Deprecated
   public Class1789(Class1788 var1) {
      this.field9645 = var1;
   }

   @Override
   public int read(ByteBuffer var1) throws IOException {
      return this.field9645.read(var1);
   }

   @Override
   public boolean isOpen() {
      return this.field9645.isOpen();
   }

   @Override
   public void close() throws IOException {
      this.field9645.close();
   }

   @Override
   public int write(ByteBuffer var1) throws IOException {
      return this.field9645.write(var1);
   }

   @Override
   public boolean method7793() {
      return this.field9645 instanceof Class1788 && ((Class1788)this.field9645).method7793();
   }

   @Override
   public void method7794() throws IOException {
      if (this.field9645 instanceof Class1788) {
         ((Class1788)this.field9645).method7794();
      }
   }

   @Override
   public boolean method7795() {
      return this.field9645 instanceof Class1788 && ((Class1788)this.field9645).method7795();
   }

   @Override
   public int method7796(ByteBuffer var1) throws IOException {
      return !(this.field9645 instanceof Class1788) ? 0 : ((Class1788)this.field9645).method7796(var1);
   }

   @Override
   public boolean method7797() {
      if (!(this.field9645 instanceof SocketChannel)) {
         return !(this.field9645 instanceof Class1788) ? false : ((Class1788)this.field9645).method7797();
      } else {
         return ((SocketChannel)this.field9645).isBlocking();
      }
   }
}
