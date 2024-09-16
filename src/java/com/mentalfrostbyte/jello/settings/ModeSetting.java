package com.mentalfrostbyte.jello.settings;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.unmapped.SettingType;
import mapped.Class8000;
import net.minecraft.client.Minecraft;
import totalcross.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModeSetting extends Setting<String> {
   private List<String> modes = new ArrayList<String>();
   private List<String> field26188 = new ArrayList<String>();

   public ModeSetting(String name, String defaultValue, int index, String... modes) {
      super(name, defaultValue, SettingType.MODE, modes[index]);
      this.modes = Arrays.<String>asList(modes);
   }

   public ModeSetting(String var1, String var2, String var3, String... var4) {
      super(var1, var2, SettingType.MODE, var3);
      this.modes = Arrays.<String>asList(var4);
   }

   public ModeSetting setModeAsPremium(String... var1) {
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

   public String getCurrentValue() {
      String var3 = this.currentValue;
      return !this.field26188.contains(var3) ? (String)super.getCurrentValue() : this.field26180;
   }

   public int method18632() {
      int var3 = 0;

      for (String var5 : this.modes) {
         if (var5.equals(this.currentValue)) {
            return var3;
         }

         var3++;
      }

      return 0;
   }

   public void method18633(int var1) {
      if (var1 <= this.modes.size()) {
         String var4 = this.modes.get(var1);
         if (this.field26188.contains(var4) && Minecraft.getInstance() != null) {
            Client.getInstance().getNotificationManager().post(new Notification("Premium", "Not yet available for free version"));
         } else {
            this.method18620(this.modes.get(var1));
         }
      }
   }

   @Override
   public JSONObject method18610(JSONObject var1) {
      this.currentValue = Class8000.method27330(var1, "value", this.method18624());
      boolean var4 = false;

      for (String var6 : this.modes) {
         if (var6.equals(this.currentValue)) {
            var4 = true;
         }
      }

      if (!var4) {
         this.currentValue = this.method18624();
      }

      return var1;
   }

   public List<String> method18634() {
      return this.modes;
   }
}
