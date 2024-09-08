package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.unmapped.CombatTracker;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import io.socket.emitter.Emitter;

public class Class5752 implements Emitter.Listener {
   public final CombatTracker field25190;

   public Class5752(CombatTracker var1) {
      this.field25190 = var1;
   }

   @Override
   public void call(Object... var1) {
      System.out.println("disconnect");
      Client.getInstance().getNotificationManager().post(new Notification("Jello connect", "Connexion Failed. Try relogging.", ResourcesDecrypter.gingerbreadIconPNG));
   }
}
