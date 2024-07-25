package remapped;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.TreeSet;

public class class_6266 implements class_3155 {
   private boolean field_32016;

   public class_6266(class_4979 var1, boolean var2) {
      this.field_32014 = var1;
      this.field_32016 = var2;
   }

   @Override
   public void method_14555() throws IOException {
      if (!(class_4979.method_22929(this.field_32014) instanceof class_922)) {
         if (!(class_4979.method_22929(this.field_32014) instanceof class_2946)) {
            throw new class_5633("expected DocumentStartEvent, but got " + class_4979.method_22929(this.field_32014));
         }

         this.field_32014.method_22923();
         class_4979.method_22893(this.field_32014, new class_5285(this.field_32014, null));
      } else {
         class_922 var3 = (class_922)class_4979.method_22929(this.field_32014);
         if ((var3.method_4041() != null || var3.method_4042() != null) && class_4979.method_22877(this.field_32014)) {
            this.field_32014.method_22895("...", true, false, false);
            this.field_32014.method_22883();
         }

         if (var3.method_4041() != null) {
            String var4 = class_4979.method_22882(this.field_32014, var3.method_4041());
            this.field_32014.method_22938(var4);
         }

         class_4979.method_22932(this.field_32014, new LinkedHashMap(class_4979.method_22906()));
         if (var3.method_4042() != null) {
            for (String var6 : new TreeSet<String>(var3.method_4042().keySet())) {
               String var7 = var3.method_4042().get(var6);
               class_4979.method_22926(this.field_32014).put(var7, var6);
               String var8 = class_4979.method_22880(this.field_32014, var6);
               String var9 = class_4979.method_22920(this.field_32014, var7);
               this.field_32014.method_22935(var8, var9);
            }
         }

         boolean var11 = this.field_32016
            && !var3.method_4040()
            && !class_4979.method_22915(this.field_32014)
            && var3.method_4041() == null
            && (var3.method_4042() == null || var3.method_4042().isEmpty())
            && !class_4979.method_22885(this.field_32014);
         if (!var11) {
            this.field_32014.method_22883();
            this.field_32014.method_22895("---", true, false, false);
            if (class_4979.method_22915(this.field_32014)) {
               this.field_32014.method_22883();
            }
         }

         class_4979.method_22893(this.field_32014, new class_3250(this.field_32014, null));
      }
   }
}
