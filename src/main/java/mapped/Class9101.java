package mapped;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringEscapeUtils;

public class Class9101 {
   private final Writer field41629;
   private final int field41630;

   public Class9101(Writer var1, List<String> var2) throws IOException {
      this.field41629 = var1;
      this.field41630 = var2.size();
      this.method33939(var2.stream());
   }

   public static Class9553 method33937() {
      return new Class9553();
   }

   public void method33938(Object... var1) throws IOException {
      if (var1.length == this.field41630) {
         this.method33939(Stream.<Object>of(var1));
      } else {
         throw new IllegalArgumentException("Invalid number of columns, expected " + this.field41630 + ", but got " + var1.length);
      }
   }

   private void method33939(Stream<?> var1) throws IOException {
      this.field41629.write(var1.<CharSequence>map(Class9101::method33940).collect(Collectors.joining(",")) + "\r\n");
   }

   private static String method33940(Object var0) {
      return StringEscapeUtils.escapeCsv(var0 == null ? "[null]" : var0.toString());
   }
}
