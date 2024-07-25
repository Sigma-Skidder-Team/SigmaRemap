package remapped;

import java.util.Collection;
import java.util.function.Consumer;

public class class_4350 {
   private final String field_21318;
   private final Collection<class_226> field_21317;
   private final Consumer<class_6331> field_21315;

   public class_4350(String var1, Collection<class_226> var2, Consumer<class_6331> var3) {
      if (!var2.isEmpty()) {
         this.field_21318 = var1;
         this.field_21317 = var2;
         this.field_21315 = var3;
      } else {
         throw new IllegalArgumentException("A GameTestBatch must include at least one TestFunction!");
      }
   }

   public String method_20202() {
      return this.field_21318;
   }

   public Collection<class_226> method_20204() {
      return this.field_21317;
   }

   public void method_20205(class_6331 var1) {
      if (this.field_21315 != null) {
         this.field_21315.accept(var1);
      }
   }
}
