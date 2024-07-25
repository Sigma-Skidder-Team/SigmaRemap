package remapped;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import java.util.stream.Stream;

public class class_9271 {
   private static final Set<class_9271> field_47297 = new ObjectArraySet();
   public static final class_9271 field_47294 = method_42718(new class_9271("oak"));
   public static final class_9271 field_47303 = method_42718(new class_9271("spruce"));
   public static final class_9271 field_47302 = method_42718(new class_9271("birch"));
   public static final class_9271 field_47293 = method_42718(new class_9271("acacia"));
   public static final class_9271 field_47296 = method_42718(new class_9271("jungle"));
   public static final class_9271 field_47295 = method_42718(new class_9271("dark_oak"));
   public static final class_9271 field_47301 = method_42718(new class_9271("crimson"));
   public static final class_9271 field_47299 = method_42718(new class_9271("warped"));
   private final String field_47300;

   public class_9271(String var1) {
      this.field_47300 = var1;
   }

   private static class_9271 method_42718(class_9271 var0) {
      field_47297.add(var0);
      return var0;
   }

   public static Stream<class_9271> method_42720() {
      return field_47297.stream();
   }

   public String method_42719() {
      return this.field_47300;
   }
}
