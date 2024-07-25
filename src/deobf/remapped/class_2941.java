package remapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class class_2941 extends Module {
   private List<Entity> field_14300 = new ArrayList<Entity>();

   public class_2941() {
      super(Category.COMBAT, "BowAimbot", "Automatically aims at players while using a bow");
      this.addSetting(new ModeSetting("Sort mode", "Sort mode", 0, "Angle", "Range"));
      this.addSetting(new FloatSetting<Float>("Range", "Range value", 70.0F, Float.class, 10.0F, 100.0F, 1.0F));
      this.addSetting(new BooleanSetting("Silent", "Server-sided rotations.", false));
      this.addSetting(new BooleanSetting("Teams", "Target team", true));
      this.addSetting(new BooleanSetting("Players", "Target players", true));
      this.addSetting(new BooleanSetting("Animals/Monsters", "Target animals and monsters", false));
      this.addSetting(new BooleanSetting("Anti-Bot", "Doesn't target bots", true));
      this.addSetting(new BooleanSetting("Invisible", "Target invisible entites", true));
   }

   @Override
   public void onDisable() {
      this.field_14300.clear();
   }

   @EventListen
   private void method_13455(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         if (!(mc.field_9632.method_26576().method_27960() instanceof class_2100)) {
            this.field_14300.clear();
         } else {
            this.field_14300 = this.method_13451(this.method_42017().getFloatValueByName("Range"));
         }

         if (!this.field_14300.isEmpty() && this.getBooleanValueByName("Silent")) {
            float[] var4 = class_7211.method_33005((class_5834)this.field_14300.get(0));
            var1.method_6441(var4[0]);
            var1.method_6448(var4[1]);
         }
      }
   }

   @EventListen
   private void method_13456(class_3278 var1) {
      if (this.method_42015() && !this.getBooleanValueByName("Silent")) {
         if (!this.field_14300.isEmpty()) {
            float[] var4 = class_7211.method_33005((class_5834)this.field_14300.get(0));
            mc.field_9632.field_41701 = var4[0];
            mc.field_9632.field_41755 = var4[1];
         }
      }
   }

   public List<Entity> method_13451(float var1) {
      List var4 = class_314.method_1440();
      Iterator var5 = var4.iterator();

      while (var5.hasNext()) {
         Entity var6 = (Entity)var5.next();
         if (var6 == mc.field_9632) {
            var5.remove();
         } else if (SigmaMainClass.getInstance().method_3307().method_14460(var6)) {
            var5.remove();
         } else if (!(var6 instanceof class_5834)) {
            var5.remove();
         } else if (((class_5834)var6).method_26551() == 0.0F) {
            var5.remove();
         } else if (mc.field_9632.method_37175(var6) > var1) {
            var5.remove();
         } else if (!mc.field_9632.method_26608((class_5834)var6)) {
            var5.remove();
         } else if (var6 instanceof class_9399) {
            var5.remove();
         } else if (!this.getBooleanValueByName("Players") && var6 instanceof class_704) {
            var5.remove();
         } else if (this.getBooleanValueByName("Anti-Bot") && var6 instanceof class_704 && SigmaMainClass.getInstance().method_3331().method_20495(var6)) {
            var5.remove();
         } else if (!this.getBooleanValueByName("Invisible") && var6.method_37109()) {
            var5.remove();
         } else if (!this.getBooleanValueByName("Animals/Monsters") && !(var6 instanceof class_704)) {
            var5.remove();
         } else if (mc.field_9632.method_37243() != null && mc.field_9632.method_37243().equals(var6)) {
            var5.remove();
         } else if (var6.method_37367()) {
            var5.remove();
         } else if (var6 instanceof class_704 && class_5876.method_26760((class_704)var6) && !this.getBooleanValueByName("Teams")) {
            var5.remove();
         }
      }

      String var8 = this.getStringValueByName("Sort mode");
      switch (var8) {
         case "Range":
            Collections.sort(var4, new class_202(this));
            break;
         case "Angle":
            Collections.sort(var4, new class_4878(this));
      }

      return var4;
   }
}
