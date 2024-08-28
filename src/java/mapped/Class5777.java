package mapped;

import com.mentalfrostbyte.jello.unmapped.Class8402;
import io.socket.emitter.Emitter;
import totalcross.json.JSONObject;

public class Class5777 implements Emitter.Listener {
   public final Class8402 field25249;

   public Class5777(Class8402 var1) {
      this.field25249 = var1;
   }

   @Override
   public void call(Object... var1) {
      JSONObject var4 = (JSONObject)var1[0];
      if (var4.has("messageId")) {
         JSONObject var5 = new JSONObject();
         var5.put("messageId", var4.method21773("messageId"));
         this.field25249.field36057.emit("message-received", var5);
         this.field25249.field36058.method32651(var4.method21773("senderId"), var4.method21773("message"), var4.method21770("timestamp"));
      }
   }
}
