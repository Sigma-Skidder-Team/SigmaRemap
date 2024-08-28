package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.unmapped.Class2314;
import com.mentalfrostbyte.jello.unmapped.Class6001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class6005 extends Class6001<String> {
   private List<String> field26187 = new ArrayList<String>();
   private List<String> field26188 = new ArrayList<String>();

   public Class6005(String var1, String var2, int var3, String... var4) {
      super(var1, var2, Class2314.field15854, var4[var3]);
      this.field26187 = Arrays.<String>asList(var4);
   }

   public Class6005(String var1, String var2, String var3, String... var4) {
      super(var1, var2, Class2314.field15854, var3);
      this.field26187 = Arrays.<String>asList(var4);
   }

   public Class6005 method18631(String... var1) {
      this.field26188.addAll(Arrays.asList(var1));
      return this;
   }

   @Override
   public boolean method18623() {
      return this.field26188.size() > 0;
   }

   @Override
   public void method18622() {
      this.field26188.clear();
   }

   public String method18619() {
      String var3 = this.field26179;
      return !this.field26188.contains(var3) ? (String)super.method18619() : this.field26180;
   }

   public int method18632() {
      int var3 = 0;

      for (String var5 : this.field26187) {
         if (var5.equals(this.field26179)) {
            return var3;
         }

         var3++;
      }

      return 0;
   }

   public void method18633(int var1) {
      if (var1 <= this.field26187.size()) {
         String var4 = this.field26187.get(var1);
         if (this.field26188.contains(var4) && Minecraft.getInstance() != null) {
            Client.getInstance().getNotificationManager().post(new Notification("Premium", "Not yet available for free version"));
         } else {
            this.method18620(this.field26187.get(var1));
         }
      }
   }

   @Override
   public JSONObject method18610(JSONObject var1) {
      this.field26179 = Class8000.method27330(var1, "value", this.method18624());
      boolean var4 = false;

      for (String var6 : this.field26187) {
         if (var6.equals(this.field26179)) {
            var4 = true;
         }
      }

      if (!var4) {
         this.field26179 = this.method18624();
      }

      return var1;
   }

   public List<String> method18634() {
      return this.field26187;
   }
}
