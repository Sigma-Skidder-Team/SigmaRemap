package remapped;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

public final class class_1263 implements class_7251 {
   @Override
   public List<InetAddress> method_33145(String var1) throws UnknownHostException {
      if (var1 != null) {
         return Arrays.<InetAddress>asList(InetAddress.getAllByName(var1));
      } else {
         throw new UnknownHostException("hostname == null");
      }
   }
}
