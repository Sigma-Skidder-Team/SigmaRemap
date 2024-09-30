package mapped;

import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.unmapped.ClassicScreenk;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.List;

public class Class4334 extends Class4333 {
   private List<ButtonPanel> field21150 = new ArrayList<ButtonPanel>();
   public int field21151;
   public Class4255 field21152;
   public Class4255 field21153;
   public Class4255 field21154;
   public Class4255 field21155;
   public Class4255 field21156;
   public Class4255 field21157;
   public static Texture field21158;
   public static Texture field21159;
   public static Texture field21160;
   public static Texture field21161;
   public static Texture field21162;
   public static Texture field21163;
   public static Texture field21164;
   public static Texture field21165;
   public static Texture field21166;
   public static Texture field21167;
   public static Texture field21168;
   public static Texture field21169;
   public static Texture field21170;
   public static Texture field21171;
   public static Texture field21172;
   public static Texture field21173;
   public static Texture field21174;
   public static Texture field21175;
   public static Texture field21176;
   public static Texture field21177;
   public static Texture field21178;
   public static Texture field21179;
   public static Texture field21180;

   public Class4334(IconPanel var1, String var2, int var3, int var4) {
      super(var1, var2, var3 - 198, var4 - 298, 396, 596);
      method13477();
      this.addToList(this.field21152 = new Class4255(this, "combat", 24, 58, 170, 130, "Combat", field21160, field21161));
      this.addToList(this.field21153 = new Class4255(this, "movement", 24, 208, 170, 130, "Movement", field21165, field21166));
      this.addToList(this.field21157 = new Class4255(this, "world", 24, 358, 170, 130, "World", field21179, field21180));
      this.addToList(this.field21155 = new Class4255(this, "player", 201, 58, 170, 130, "Player", field21171, field21172));
      this.addToList(this.field21156 = new Class4255(this, "visuals", 201, 208, 170, 130, "Visuals", field21175, field21176));
      this.addToList(this.field21154 = new Class4255(this, "others", 201, 358, 170, 130, "Others", field21169, field21170));
      Class4361 var7;
      this.addToList(var7 = new Class4361(this, "exit", this.getWidthA() - 41, 9));
      var7.doThis((var0, var1x) -> Minecraft.getInstance().displayGuiScreen(null));
      ClassicScreenk var8 = (ClassicScreenk)this.getIcoPanel();
      this.field21152.doThis((var1x, var2x) -> var8.method13418("Combat", ModuleCategory.COMBAT));
      this.field21153.doThis((var1x, var2x) -> var8.method13418("Movement", ModuleCategory.MOVEMENT));
      this.field21157.doThis((var1x, var2x) -> var8.method13418("World", ModuleCategory.WORLD));
      this.field21155.doThis((var1x, var2x) -> var8.method13418("Player", ModuleCategory.PLAYER));
      this.field21156.doThis((var1x, var2x) -> var8.method13418("Visuals", ModuleCategory.RENDER, ModuleCategory.GUI));
      this.field21154.doThis((var1x, var2x) -> var8.method13418("Others", ModuleCategory.MISC));
      this.method13300(false);
   }

   public static void method13477() {
      if (field21158 == null) {
         field21158 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/colors.png");
         field21159 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/colors2.png");
         field21160 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/combat.png");
         field21161 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/combat2.png");
         field21162 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/downarrow.png");
         field21163 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/gear.png");
         field21164 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/gear2.png");
         field21165 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/movement.png");
         field21166 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/movement2.png");
         field21167 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/msgo.png");
         field21168 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/msgo2.png");
         field21169 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/others.png");
         field21170 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/others2.png");
         field21171 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/player.png");
         field21172 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/player2.png");
         field21173 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/uparrow.png");
         field21174 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/uparrow2.png");
         field21175 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/visuals.png");
         field21176 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/visuals2.png");
         field21177 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/xmark.png");
         field21178 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/xmark2.png");
         field21179 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/world.png");
         field21180 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/world2.png");
      }
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
   }
}
