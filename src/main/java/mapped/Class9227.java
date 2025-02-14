package mapped;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Class9227 {
   private static String[] field42468;
   public Socket field42469;
   public String field42470;
   public Class1735 field42471;
   public Class1733 field42472;
   public Class7264 field42473 = Class7264.field31168;
   public Class8824 field42474 = Class8824.field39787;
   public boolean field42475;

   public Class9227(boolean var1) {
      this.field42475 = var1;
   }

   public Class9227 method34706(Socket var1) throws IOException {
      return this.method34707(
         var1,
         ((InetSocketAddress)var1.getRemoteSocketAddress()).getHostName(),
         Class7001.method21696(Class7001.method21709(var1)),
         Class7001.method21697(Class7001.method21700(var1))
      );
   }

   public Class9227 method34707(Socket var1, String var2, Class1735 var3, Class1733 var4) {
      this.field42469 = var1;
      this.field42470 = var2;
      this.field42471 = var3;
      this.field42472 = var4;
      return this;
   }

   public Class9227 method34708(Class7264 var1) {
      this.field42473 = var1;
      return this;
   }

   public Class9227 method34709(Class8824 var1) {
      this.field42474 = var1;
      return this;
   }

   public FramedConnection method34710() throws IOException {
      return new FramedConnection(this);
   }
}
