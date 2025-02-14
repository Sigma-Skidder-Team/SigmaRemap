package mapped;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

public abstract class Class8261 {
   private static final CharsetDecoder field35506 = Charset.forName("UTF-8").newDecoder().onMalformedInput(CodingErrorAction.REPORT);
   private static final String field35507 = "-_.!~*'()@:$&,;=[]/";
   private static final Class7581 field35508 = new Class7580("-_.!~*'()@:$&,;=[]/", false);

   public static String method28799(String var0) {
      return field35508.method24808(var0);
   }

   public static String method28800(ByteBuffer var0) throws CharacterCodingException {
      CharBuffer var3 = field35506.decode(var0);
      return var3.toString();
   }

   public static String method28801(String var0) {
      try {
         return URLDecoder.decode(var0, "UTF-8");
      } catch (UnsupportedEncodingException var4) {
         throw new Class2478(var4);
      }
   }
}
