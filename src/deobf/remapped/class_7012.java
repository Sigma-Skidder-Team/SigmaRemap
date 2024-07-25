package remapped;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringEscapeUtils;

public class class_7012 {
   private final Writer field_35955;
   private final int field_35954;

   private class_7012(Writer var1, List<String> var2) throws IOException {
      this.field_35955 = var1;
      this.field_35954 = var2.size();
      this.method_32023(var2.stream());
   }

   public static class_8818 method_32026() {
      return new class_8818();
   }

   public void method_32024(Object... var1) throws IOException {
      if (var1.length == this.field_35954) {
         this.method_32023(Stream.<Object>of(var1));
      } else {
         throw new IllegalArgumentException("Invalid number of columns, expected " + this.field_35954 + ", but got " + var1.length);
      }
   }

   private void method_32023(Stream<?> var1) throws IOException {
      this.field_35955.write(var1.<CharSequence>map(class_7012::method_32022).collect(Collectors.joining(",")) + "\r\n");
   }

   private static String method_32022(Object var0) {
      return StringEscapeUtils.escapeCsv(var0 == null ? "[null]" : var0.toString());
   }
}
