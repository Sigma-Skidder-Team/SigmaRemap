package mapped;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Class798 extends Screen {
   public Class798() {
      super(NarratorChatListener.field29300);
   }

   public static int method1929(int var0) {
      return 40 + var0 * 13;
   }

   @Override
   public void method1919() {
      for (Class1197 var4 : this.field4566) {
         if (var4 instanceof Class1219) {
            ((Class1219)var4).method1919();
         }
      }
   }

   public void method1930() {
      List var3 = this.field4561
         .stream()
         .filter(Class1153.class::isInstance)
         .<Class1153>map(Class1153.class::cast)
         .<String>map(Class1153::method5543)
         .collect(Collectors.toList());
      Class9229.method34714(var3);
   }
}
