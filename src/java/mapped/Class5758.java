package mapped;

import com.mentalfrostbyte.jello.util.tracker.CombatTracker;
import io.socket.emitter.Emitter;
import totalcross.json.JSONObject;

public class Class5758 implements Emitter.Listener {
   public final CombatTracker field25206;

   public Class5758(CombatTracker var1) {
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
