package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class6927 implements Class6926<Class60, List> {
   public List method21342(Class60 var1) {
      ArrayList var4 = new ArrayList();

      for (Class61 var7 : var1.method205()) {
         var4.add(Class8742.method31540(var7));
      }

      return var4;
   }

   @Override
   public Class60 method21341(String var1, List var2) {
      ArrayList var5 = new ArrayList();

      for (Object var7 : var2) {
         var5.add(Class8742.<Object, Class61>method31541("", var7));
      }

      return new Class60(var1, var5);
   }
}
