package remapped;

import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;

public class class_7291 extends class_1174 {
   private static String[] field_37294;
   private final Set<Long> field_37292 = Sets.newConcurrentHashSet();
   private final Set<Long> field_37293 = Sets.newConcurrentHashSet();

   public class_7291(class_1455 var1) {
      super(var1);
   }

   public static long method_33287(int var0, int var1) {
      return ((long)var0 << 32) + (long)var1 - -2147483648L;
   }

   public List<Object> method_33288(Object var1) throws Exception {
      return class_3446.method_15883().method_33743().<class_7627>method_24490(class_7627.class).method_34575(var1, this);
   }

   public Set<Long> method_33286() {
      return this.field_37292;
   }

   public Set<Long> method_33285() {
      return this.field_37293;
   }
}
