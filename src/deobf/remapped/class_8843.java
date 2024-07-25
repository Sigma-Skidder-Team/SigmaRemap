package remapped;

import com.google.common.collect.Lists;
import java.util.List;

public class class_8843 implements class_5481<class_8843> {
   private static String[] field_45225;
   private final List<class_6282> field_45226 = Lists.newArrayList();
   private final List<class_2913> field_45223 = Lists.newArrayList();
   private class_2144 field_45224 = class_1758.field_9026;

   public class_8843 method_40676(class_349 var1) {
      this.field_45226.add(var1.method_1775());
      return this;
   }

   public class_8843 method_40681(class_2144 var1) {
      this.field_45224 = var1;
      return this;
   }

   public class_8843 method_40680(class_1925 var1) {
      this.field_45223.add(var1.method_8947());
      return this;
   }

   public class_8843 method_40677() {
      return this;
   }

   public class_1758 method_40679() {
      return new class_1758(
         this.field_45224, this.field_45226.<class_6282>toArray(new class_6282[0]), this.field_45223.<class_2913>toArray(new class_2913[0]), null
      );
   }
}
