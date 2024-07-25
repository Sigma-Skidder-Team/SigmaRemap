package remapped;

import java.net.URL;

public enum class_9738 {
   @Override
   public String[] method_37580(URL var1) {
      return new String[]{"rundll32", "url.dll,FileProtocolHandler", var1.toString()};
   }
}
