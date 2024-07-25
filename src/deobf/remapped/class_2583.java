package remapped;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.UUID;

public class class_2583 extends class_1174 {
   private ClientPlayerEntity field_12785;
   private String field_12784;
   private List<UUID> field_12786;
   private static Method field_12790;
   private static Class<?> field_12789;
   private static Method field_12788;

   public class_2583(class_1455 var1, ClientPlayerEntity var2) {
      super(var1);
      this.field_12785 = var2;
      this.field_12784 = "";
   }

   public List<UUID> method_11752() {
      if (this.field_12786 == null) {
         if (field_12789 == null) {
            return null;
         }

         if (field_12790 == null) {
            return null;
         }

         if (field_12788 == null) {
            return null;
         }

         try {
            Object var3 = field_12788.invoke(this.field_12785);
            Object var4 = class_8232.method_37707(var3, "getSessionHandler");
            if (field_12789.isInstance(var4)) {
               this.field_12786 = (List<UUID>)field_12790.invoke(var4);
            }
         } catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException var5) {
            var5.printStackTrace();
         }
      }

      return this.field_12786;
   }

   static {
      try {
         field_12789 = Class.forName("com.velocitypowered.proxy.connection.client.ClientPlaySessionHandler");
         field_12790 = field_12789.getDeclaredMethod("getServerBossBars");
         field_12788 = Class.forName("com.velocitypowered.proxy.connection.client.ConnectedPlayer").getDeclaredMethod("getMinecraftConnection");
      } catch (ClassNotFoundException | NoSuchMethodException var7) {
         var7.printStackTrace();
      }
   }
}
