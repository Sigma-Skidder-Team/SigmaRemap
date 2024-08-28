package mapped;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.UUID;

public class Class6050 extends Class6037 {
   private ClientPlayerEntity field26269;
   private String field26270;
   private List<UUID> field26271;
   private static Method field26272;
   private static Class<?> field26273;
   private static Method field26274;

   public Class6050(Class7161 var1, ClientPlayerEntity var2) {
      super(var1);
      this.field26269 = var2;
      this.field26270 = "";
   }

   public List<UUID> method18735() {
      if (this.field26271 == null) {
         if (field26273 == null) {
            return null;
         }

         if (field26272 == null) {
            return null;
         }

         if (field26274 == null) {
            return null;
         }

         try {
            Object var3 = field26274.invoke(this.field26269);
            Object var4 = Class9396.method35678(var3, "getSessionHandler");
            if (field26273.isInstance(var4)) {
               this.field26271 = (List<UUID>)field26272.invoke(var4);
            }
         } catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException var5) {
            var5.printStackTrace();
         }
      }

      return this.field26271;
   }

   static {
      try {
         field26273 = Class.forName("com.velocitypowered.proxy.connection.client.ClientPlaySessionHandler");
         field26272 = field26273.getDeclaredMethod("getServerBossBars");
         field26274 = Class.forName("com.velocitypowered.proxy.connection.client.ConnectedPlayer").getDeclaredMethod("getMinecraftConnection");
      } catch (ClassNotFoundException | NoSuchMethodException var7) {
         var7.printStackTrace();
      }
   }
}
