package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class class_4471 extends class_367 {
   public ArrayList<Thread> field_21797 = new ArrayList<Thread>();
   public class_8145 field_21799;
   public class_1343 field_21798;

   public class_4471(String var1, String var2, class_5664 var3) {
      super("FightBot", "Jello AI Fight Bot", class_5664.field_28718);
   }

   @class_9148
   public void method_20753(class_5596 var1) {
      if (!this.method_42015()) {
         ;
      }
   }

   public List<class_8145> method_20752() {
      ArrayList var3 = Lists.newArrayList(field_46692.field_9601.method_736());
      var3.remove(field_46692.field_9632);
      Iterator var4 = var3.iterator();

      while (var4.hasNext()) {
         class_8145 var5 = (class_8145)var4.next();
         if (!(var5 instanceof class_704) || SigmaMainClass.method_3328().method_3331().method_20495(var5)) {
            var4.remove();
         }
      }

      List var6 = class_7494.method_34096(var3);
      return var6.size() <= 1 ? var6 : var6.subList(0, Math.min(3, var6.size() - 1));
   }
}
