package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_9898 extends class_4098 {
   private List<class_6220> field_50204 = new ArrayList<class_6220>();
   public int field_50191;
   public class_629 field_50202;
   public class_629 field_50178;
   public class_629 field_50179;
   public class_629 field_50184;
   public class_629 field_50198;
   public class_629 field_50186;
   public static class_8343 field_50193;
   public static class_8343 field_50194;
   public static class_8343 field_50206;
   public static class_8343 field_50196;
   public static class_8343 field_50205;
   public static class_8343 field_50208;
   public static class_8343 field_50189;
   public static class_8343 field_50188;
   public static class_8343 field_50182;
   public static class_8343 field_50183;
   public static class_8343 field_50180;
   public static class_8343 field_50197;
   public static class_8343 field_50187;
   public static class_8343 field_50177;
   public static class_8343 field_50201;
   public static class_8343 field_50181;
   public static class_8343 field_50192;
   public static class_8343 field_50203;
   public static class_8343 field_50190;
   public static class_8343 field_50195;
   public static class_8343 field_50185;
   public static class_8343 field_50199;
   public static class_8343 field_50207;

   public class_9898(class_7038 var1, String var2, int var3, int var4) {
      super(var1, var2, var3 - 198, var4 - 298, 396, 596);
      method_45592();
      this.method_32148(this.field_50202 = new class_629(this, "combat", 24, 58, 170, 130, "Combat", field_50206, field_50196));
      this.method_32148(this.field_50178 = new class_629(this, "movement", 24, 208, 170, 130, "Movement", field_50188, field_50182));
      this.method_32148(this.field_50186 = new class_629(this, "world", 24, 358, 170, 130, "World", field_50199, field_50207));
      this.method_32148(this.field_50184 = new class_629(this, "player", 201, 58, 170, 130, "Player", field_50177, field_50201));
      this.method_32148(this.field_50198 = new class_629(this, "visuals", 201, 208, 170, 130, "Visuals", field_50203, field_50190));
      this.method_32148(this.field_50179 = new class_629(this, "other", 201, 358, 170, 130, "Others", field_50197, field_50187));
      class_4980 var7;
      this.method_32148(var7 = new class_4980(this, "exit", this.method_32109() - 41, 9));
      var7.method_32100((var0, var1x) -> class_1893.method_8510().method_8609(null));
      class_4647 var8 = (class_4647)this.method_32167();
      this.field_50202.method_32100((var1x, var2x) -> var8.method_21497("Combat", class_5664.field_28714));
      this.field_50178.method_32100((var1x, var2x) -> var8.method_21497("Movement", class_5664.field_28716));
      this.field_50186.method_32100((var1x, var2x) -> var8.method_21497("World", class_5664.field_28718));
      this.field_50184.method_32100((var1x, var2x) -> var8.method_21497("Player", class_5664.field_28710));
      this.field_50198.method_32100((var1x, var2x) -> var8.method_21497("Visuals", class_5664.field_28709, class_5664.field_28708));
      this.field_50179.method_32100((var1x, var2x) -> var8.method_21497("Others", class_5664.field_28711));
      this.method_32105(false);
   }

   public static void method_45592() {
      if (field_50193 == null) {
         field_50193 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/uglygui/colors.png");
         field_50194 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/uglygui/colors2.png");
         field_50206 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/uglygui/combat.png");
         field_50196 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/uglygui/combat2.png");
         field_50205 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/uglygui/downarrow.png");
         field_50208 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/uglygui/gear.png");
         field_50189 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/uglygui/gear2.png");
         field_50188 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/uglygui/movement.png");
         field_50182 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/uglygui/movement2.png");
         field_50183 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/uglygui/msgo.png");
         field_50180 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/uglygui/msgo2.png");
         field_50197 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/uglygui/others.png");
         field_50187 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/uglygui/others2.png");
         field_50177 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/uglygui/player.png");
         field_50201 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/uglygui/player2.png");
         field_50181 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/uglygui/uparrow.png");
         field_50192 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/uglygui/uparrow2.png");
         field_50203 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/uglygui/visuals.png");
         field_50190 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/uglygui/visuals2.png");
         field_50195 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/uglygui/xmark.png");
         field_50185 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/uglygui/xmark2.png");
         field_50199 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/uglygui/world.png");
         field_50207 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/uglygui/world2.png");
      }
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
   }
}
