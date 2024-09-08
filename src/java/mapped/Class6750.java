package mapped;

import com.google.gson.JsonObject;
import com.mentalfrostbyte.jello.unmapped.JelloPortal;
import io.netty.channel.ChannelInitializer;
import java.lang.reflect.Method;

public class Class6750 implements Class6749 {
   public static Method field29458;

   private ChannelInitializer method20578() throws Exception {
      return null;
   }

   @Override
   public void method20572() throws Exception {
   }

   @Override
   public void method20573() {
   }

   @Override
   public int method20574() throws Exception {
      return method20579();
   }

   public static int method20579() {
      return JelloPortal.method27349();
   }

   @Override
   public String method20575() {
      return "via-encoder";
   }

   @Override
   public String method20576() {
      return "via-decoder";
   }

   @Override
   public JsonObject method20577() {
      JsonObject var3 = new JsonObject();

      try {
         var3.addProperty("currentInitializer", this.method20578().getClass().getName());
      } catch (Exception var5) {
      }

      return var3;
   }
}
