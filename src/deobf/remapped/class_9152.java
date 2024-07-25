package remapped;

import com.mojang.brigadier.context.CommandContext;

public abstract class class_9152<T extends class_9152<T>> {
   public final class_3275<T> field_46823;

   public class_9152(class_3275<T> var1) {
      this.field_46823 = var1;
   }

   public abstract void method_42120(CommandContext<class_9155> var1, String var2);

   public void method_42117(CommandContext<class_9155> var1, String var2) {
      this.method_42120(var1, var2);
      this.method_42125(((class_9155)var1.getSource()).method_42177());
   }

   public void method_42125(class_341 var1) {
      if (var1 != null) {
         class_3275.method_14952(this.field_46823).accept(var1, this.method_42116());
      }
   }

   public abstract void method_42118(String var1);

   public abstract String method_42124();

   @Override
   public String toString() {
      return this.method_42124();
   }

   public abstract int method_42122();

   public abstract T method_42116();

   public abstract T method_42119();

   public abstract void method_42123(T var1, class_341 var2);
}
