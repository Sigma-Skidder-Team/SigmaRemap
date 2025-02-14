package mapped;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

public final class Class7003 implements Class7004 {
   @Override
   public List<InetAddress> method21719(String var1) throws UnknownHostException {
      if (var1 != null) {
         return Arrays.<InetAddress>asList(InetAddress.getAllByName(var1));
      } else {
         throw new UnknownHostException("hostname == null");
      }
   }
}
