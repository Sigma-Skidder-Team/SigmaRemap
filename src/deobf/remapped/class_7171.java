package remapped;

import java.util.function.Consumer;

public final class class_7171 implements class_8816<Msg> {
   private static String[] field_36896;

   public class_7171(String var1, Consumer var2) {
      this.field_36897 = var1;
      this.field_36898 = var2;
   }

   @Override
   public String method_40492() {
      return this.field_36897;
   }

   @Override
   public void method_40495(Msg var1) {
      this.field_36898.accept(var1);
   }

   @Override
   public String toString() {
      return this.field_36897;
   }
}
