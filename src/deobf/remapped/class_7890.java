package remapped;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class class_7890 extends class_9263 {
   private static String[] field_40367;

   public class_7890(class_916 var1, Executor var2, Executor var3) {
      super(var2, var3);
      this.field_40368 = var1;
   }

   @Override
   public boolean method_42695(long var1) {
      return class_916.method_3998(this.field_40368).contains(var1);
   }

   @Nullable
   @Override
   public class_5344 method_42678(long var1) {
      return this.field_40368.method_3995(var1);
   }

   @Nullable
   @Override
   public class_5344 method_42682(long var1, int var3, class_5344 var4, int var5) {
      return class_916.method_4003(this.field_40368, var1, var3, var4, var5);
   }
}
