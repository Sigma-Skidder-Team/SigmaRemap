package mapped;

import com.mentalfrostbyte.jello.unmapped.CombatTracker;
import io.socket.emitter.Emitter;
import totalcross.json.JSONObject;

public class Class5767 implements Emitter.Listener {
   private static String[] field25223;
   public final CombatTracker field25224;

   public Class5767(CombatTracker var1) {
      this.field25224 = var1;
   }

   @Override
   public void call(Object... var1) {
      JSONObject var4 = (JSONObject)var1[0];
      System.out.println(var4);
   }
}
