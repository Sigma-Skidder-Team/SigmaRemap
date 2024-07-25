package remapped;

import com.google.gson.JsonObject;
import io.netty.channel.ChannelInitializer;
import java.lang.reflect.Method;

public class class_9879 implements class_907 {
   public static Method field_49940;

   private ChannelInitializer method_45523() throws Exception {
      return null;
   }

   @Override
   public void method_3878() throws Exception {
   }

   @Override
   public void method_3879() {
   }

   @Override
   public int method_3880() throws Exception {
      return method_45521();
   }

   public static int method_45521() {
      return class_3347.method_15349();
   }

   @Override
   public String method_3876() {
      return "via-encoder";
   }

   @Override
   public String method_3875() {
      return "via-decoder";
   }

   @Override
   public JsonObject method_3877() {
      JsonObject var3 = new JsonObject();

      try {
         var3.addProperty("currentInitializer", this.method_45523().getClass().getName());
      } catch (Exception var5) {
      }

      return var3;
   }
}
