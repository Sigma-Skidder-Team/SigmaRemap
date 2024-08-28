package mapped;

import java.util.Arrays;
import java.util.Comparator;

public enum Class2153 {
   field14075(0, "options.chat.visibility.full"),
   field14076(1, "options.chat.visibility.system"),
   field14077(2, "options.chat.visibility.hidden");

   private static final Class2153[] field14078 = Arrays.<Class2153>stream(values())
      .sorted(Comparator.comparingInt(Class2153::method8865))
      .<Class2153>toArray(Class2153[]::new);
   private final int field14079;
   private final String field14080;
   private static final Class2153[] field14081 = new Class2153[]{field14075, field14076, field14077};

   private Class2153(int var3, String var4) {
      this.field14079 = var3;
      this.field14080 = var4;
   }

   public int method8865() {
      return this.field14079;
   }

   public String method8866() {
      return this.field14080;
   }

   public static Class2153 method8867(int var0) {
      return field14078[Class9679.method37788(var0, field14078.length)];
   }
}
