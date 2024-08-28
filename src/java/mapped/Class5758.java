package mapped;

import com.mentalfrostbyte.jello.unmapped.Class8402;
import io.socket.emitter.Emitter;
import totalcross.json.JSONObject;

public class Class5758 implements Emitter.Listener {
   public final Class8402 field25206;

   public Class5758(Class8402 var1) {
      this.field25206 = var1;
   }

   @Override
   public void call(Object... objects) {
      this.field25206.field36057.emit("my other event", "hi");
      JSONObject var4 = new JSONObject();
      var4.put("session", "TOMYGAMESTESTINGID");
      this.field25206.field36057.emit("login", var4);
      System.out.println("hey");
   }
}
