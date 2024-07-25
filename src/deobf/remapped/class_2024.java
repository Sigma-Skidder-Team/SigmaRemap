package remapped;

import com.google.common.collect.ForwardingList;
import java.util.List;

public class class_2024 extends ForwardingList<class_6098> {
   private static String[] field_10259;
   private final class_2831<class_6098> field_10260 = class_2831.<class_6098>method_12872(class_7051.method_32422(), class_6098.field_31203);

   public List<class_6098> delegate() {
      return this.field_10260;
   }

   public class_3416 method_9442() {
      class_3416 var3 = new class_3416();

      for (class_6098 var5 : this.delegate()) {
         var3.add(var5.method_27998(new class_5734()));
      }

      return var3;
   }

   public void method_9444(class_3416 var1) {
      List var4 = this.delegate();

      for (int var5 = 0; var5 < var4.size(); var5++) {
         var4.set(var5, class_6098.method_28015(var1.method_15764(var5)));
      }
   }

   public boolean isEmpty() {
      for (class_6098 var4 : this.delegate()) {
         if (!var4.method_28022()) {
            return false;
         }
      }

      return true;
   }
}
