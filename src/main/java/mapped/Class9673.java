package mapped;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import java.util.stream.Stream;

public class Class9673 {
   private static final Set<Class9673> field45165 = new ObjectArraySet();
   public static final Class9673 field45166 = method37735(new Class9673("oak"));
   public static final Class9673 field45167 = method37735(new Class9673("spruce"));
   public static final Class9673 field45168 = method37735(new Class9673("birch"));
   public static final Class9673 field45169 = method37735(new Class9673("acacia"));
   public static final Class9673 field45170 = method37735(new Class9673("jungle"));
   public static final Class9673 field45171 = method37735(new Class9673("dark_oak"));
   public static final Class9673 field45172 = method37735(new Class9673("crimson"));
   public static final Class9673 field45173 = method37735(new Class9673("warped"));
   private final String field45174;

   public Class9673(String var1) {
      this.field45174 = var1;
   }

   private static Class9673 method37735(Class9673 var0) {
      field45165.add(var0);
      return var0;
   }

   public static Stream<Class9673> method37736() {
      return field45165.stream();
   }

   public String method37737() {
      return this.field45174;
   }
}
