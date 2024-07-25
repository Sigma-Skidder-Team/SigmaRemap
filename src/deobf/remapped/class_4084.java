package remapped;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

public abstract class class_4084 {
   private static final CharsetDecoder field_19869 = Charset.forName("UTF-8").newDecoder().onMalformedInput(CodingErrorAction.REPORT);
   private static final String field_19867 = "-_.!~*'()@:$&,;=[]/";
   private static final class_5352 field_19868 = new class_7254("-_.!~*'()@:$&,;=[]/", false);

   public static String method_18819(String var0) {
      return field_19868.method_24434(var0);
   }

   public static String method_18821(ByteBuffer var0) throws CharacterCodingException {
      CharBuffer var3 = field_19869.decode(var0);
      return var3.toString();
   }

   public static String method_18820(String var0) {
      try {
         return URLDecoder.decode(var0, "UTF-8");
      } catch (UnsupportedEncodingException var4) {
         throw new class_5251(var4);
      }
   }
}
