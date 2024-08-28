package mapped;

import com.mentalfrostbyte.jello.unmapped.Class8402;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.notification.Notification;
import io.socket.emitter.Emitter;
import totalcross.json.JSONException2;
import totalcross.json.JSONObject;

import java.io.IOException;

public class Class5766 implements Emitter.Listener {
   public final Class8402 field25222;

   public Class5766(Class8402 var1) {
      this.field25222 = var1;
   }

   @Override
   public void call(Object... objects) {
      JSONObject var4 = (JSONObject)objects[0];
      System.out.println(var4);
      if (Class8402.method29522(this.field25222).session != null && Class8402.method29522(this.field25222).session.getProfile() != null) {
         try {
            Class8402.method29523(this.field25222, Class8402.method29522(this.field25222).session.getProfile(), var4.method21773("serverHash"));
            System.out.println("s");
            JSONObject var5 = new JSONObject();
            var5.put("username", Class8402.method29522(this.field25222).session.getUsername());
            this.field25222.field36057.emit("server-auth", var5);
         } catch (AuthenticationException | IOException | JSONException2 var6) {
            var6.printStackTrace();
         }

         Client.getInstance().getNotificationManager().post(new Notification("Jello connect", "Connected!", ResourcesDecrypter.gingerbreadIconPNG));
      }
   }
}
