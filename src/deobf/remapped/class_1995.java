package remapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class class_1995 extends class_7164<class_4393, class_2611<class_4393>> {
   private static final Map<class_2066, Identifier> field_10139 = Util.<Map<class_2066, Identifier>>method_44659(Maps.newHashMap(), var0 -> {
      var0.put(class_2066.field_10428, new Identifier("textures/entity/cow/brown_mooshroom.png"));
      var0.put(class_2066.field_10427, new Identifier("textures/entity/cow/red_mooshroom.png"));
   });

   public class_1995(class_6122 var1) {
      super(var1, new class_2611<class_4393>(), 0.7F);
      this.method_29100(new class_7416<class_4393>(this));
   }

   public Identifier method_9263(class_4393 var1) {
      return field_10139.get(var1.method_20463());
   }
}
