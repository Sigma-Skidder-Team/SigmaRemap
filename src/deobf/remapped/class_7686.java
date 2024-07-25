package remapped;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class class_7686 implements class_4038 {
   @Override
   public void close() throws IOException {
   }

   @Override
   public class_4639 method_18578() {
      return null;
   }

   @Override
   public InputStream method_18576() {
      String var3 = "{\"targets\":[\"jelloswap\",\"jello\"],\"passes\":[{\"name\":\"blur\",\"intarget\":\"minecraft:main\",\"outtarget\":\"jelloswap\",\"uniforms\":[{\"name\":\"BlurDir\",\"values\":[1,0]},{\"name\":\"Radius\",\"values\":[20]}]},{\"name\":\"blur\",\"intarget\":\"jelloswap\",\"outtarget\":\"jello\",\"uniforms\":[{\"name\":\"BlurDir\",\"values\":[0,1]},{\"name\":\"Radius\",\"values\":[20]}]}]}";
      return new ByteArrayInputStream(var3.getBytes());
   }

   @Override
   public <T> T method_18577(class_6146<T> var1) {
      return null;
   }

   @Override
   public String method_18579() {
      return null;
   }
}
