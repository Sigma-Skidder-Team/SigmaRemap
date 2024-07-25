package remapped;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;

public class class_193 extends class_4833 {
   private AgoraClient field_646;

   public class_193(AgoraClient var1, String var2, HashMap<String, String> var3) throws URISyntaxException {
      super(new URI(var2), var3);
      this.field_646 = var1;
   }

   @Override
   public void method_22228(class_6999 var1) {
      this.field_646.method_3688();
   }

   @Override
   public void method_22249(String var1) {
      JSONObjectImpl var4 = new JSONObjectImpl(var1);
      if (var4.method_5850("action")) {
         switch (var4.method_5813("action")) {
            case 1:
               for (Method var8 : class_2378.field_11886.getClass().getDeclaredMethods()) {
                  if (var8.getParameterCount() == 4) {
                     var8.setAccessible(true);

                     try {
                        var8.invoke(class_2378.field_11886, false, class_1565.method_7079(String.valueOf(var4.method_5826("variation"))), true, true);
                     } catch (IllegalAccessException var10) {
                        var10.printStackTrace();
                     } catch (IllegalArgumentException var11) {
                        var11.printStackTrace();
                     } catch (InvocationTargetException var12) {
                        var12.printStackTrace();
                     }
                  }
               }
               break;
            case 2:
               this.field_646.method_3689();
         }
      }
   }

   @Override
   public void method_22245(int var1, String var2, boolean var3) {
      this.field_646.method_3691();
   }

   @Override
   public void method_22224(Exception var1) {
      var1.printStackTrace();
      this.field_646.method_3691();
   }
}
