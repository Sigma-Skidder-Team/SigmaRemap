package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.unmapped.Class2314;
import com.mentalfrostbyte.jello.unmapped.Class6001;

public class Class6004 extends Class6001<Boolean> {
   public boolean field26186 = false;

   public Class6004(String var1, String var2, boolean var3) {
      super(var1, var2, Class2314.field15851, var3);
   }

   public Class6004 method18630() {
      this.field26186 = true;
      return this;
   }

   @Override
   public void method18622() {
      this.field26186 = false;
   }

   @Override
   public boolean method18623() {
      return this.field26186;
   }

   public void method18621(Boolean var1, boolean var2) {
      if (this.field26186 && var2) {
         Client.getInstance().getNotificationManager().post(new Notification("Premium", "Not yet available for free version"));
      }

      super.method18621(var1, var2);
   }

   public Boolean method18619() {
      return !this.field26186 ? this.field26179 : this.field26180;
   }

   @Override
   public JSONObject method18610(JSONObject var1) {
      this.field26179 = Class8000.method27324(var1, "value", this.method18624());
      return var1;
   }
}
