package remapped;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class class_556 extends class_1859 {
   private List<class_6220> field_3308 = new ArrayList<class_6220>();
   private final Date field_3300;
   private boolean field_3305 = false;
   private Date field_3302;
   public Vector3i field_3301;
   public class_3004 field_3304;
   public class_3004 field_3307;
   public class_9350 field_3306;
   private final List<class_6915> field_3303 = new ArrayList<class_6915>();

   public class_556(class_7038 var1, String var2, int var3, int var4, Vector3i var5) {
      super(var1, var2, var3 - 107, var4 + 10, 214, 170, class_590.field_3421, "", false);
      this.field_3301 = var5;
      if (this.field_36261 + this.field_36257 <= MinecraftClient.getInstance().window.method_43163()) {
         this.field_36261 += 10;
      } else {
         this.field_36261 = this.field_36261 - (this.field_36257 + 27);
         this.field_3305 = true;
      }

      this.field_3300 = new Date();
      this.method_32187(true);
      this.method_32105(false);
      class_8223 var8;
      this.method_32148(
         var8 = new class_8223(
            this,
            "addButton",
            this.field_36278 - 66,
            this.field_36257 - 60,
            class_5320.field_27141.method_18547("Add"),
            50,
            class_590.field_3421,
            "Add",
            class_5320.field_27141
         )
      );
      var8.method_32100((var1x, var2x) -> this.method_2666(this.field_3307.method_32165(), this.method_2665(), this.field_3306.field_47709));
      this.method_32148(this.field_3307 = new class_3004(this, "Name", 20, 7, this.field_36278 - 40, 60, class_3004.field_14738, "My waypoint", "My waypoint"));
      this.field_3307.method_13720();
      this.field_3307.method_13724(false);
      this.method_32148(this.field_3306 = new class_9350(this, "badgeSelect", 0, 86));
      this.method_32148(
         this.field_3304 = new class_3004(
            this,
            "Cords",
            20,
            this.field_36257 - 44,
            this.field_36278 - 100,
            20,
            class_3004.field_14738,
            var5.getX() + " " + var5.getZ(),
            var5.getX() + " " + var5.getZ()
         )
      );
      this.field_3304.method_13724(false);
      this.field_3304.method_32144(class_5320.field_27139);
   }

   public Vector3i method_2665() {
      if (this.field_3304.method_32165() != null && this.field_3304.method_32165().contains(" ")) {
         String[] var3 = this.field_3304.method_32165().split(" ");
         if (var3.length == 2 && var3[0].matches("-?\\d+") && var3[1].matches("-?\\d+")) {
            int var4 = Integer.valueOf(var3[0]);
            int var5 = Integer.valueOf(var3[1]);
            return new Vector3i(var4, 0, var5);
         }
      }

      return this.field_3301;
   }

   @Override
   public void method_32178(float var1) {
      var1 = class_2440.method_11126(this.field_3300, this.field_3302, 250.0F, 120.0F);
      float var4 = class_9556.method_44073(var1, 0.0F, 1.0F, 1.0F);
      this.method_32111(0.8F + var4 * 0.2F, 0.8F + var4 * 0.2F);
      this.method_32188((int)((float)this.field_36278 * 0.2F * (1.0F - var4)) * (!this.field_3305 ? 1 : -1));
      super.method_32190();
      byte var5 = 10;
      int var6 = class_314.method_1444(-723724, class_9681.method_44756(var1, 0.0F, 1.0F, 1.0F));
      class_73.method_128(
         (float)(this.field_36270 + var5 / 2),
         (float)(this.field_36261 + var5 / 2),
         (float)(this.field_36278 - var5),
         (float)(this.field_36257 - var5),
         35.0F,
         var1
      );
      class_73.method_94(
         (float)(this.field_36270 + var5 / 2),
         (float)(this.field_36261 + var5 / 2),
         (float)(this.field_36270 - var5 / 2 + this.field_36278),
         (float)(this.field_36261 - var5 / 2 + this.field_36257),
         class_314.method_1444(class_1255.field_6929.field_6917, var1 * 0.25F)
      );
      class_73.method_108((float)this.field_36270, (float)this.field_36261, (float)this.field_36278, (float)this.field_36257, (float)var5, var6);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)this.field_36270, (float)this.field_36261, 0.0F);
      GL11.glRotatef(!this.field_3305 ? -90.0F : 90.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef((float)(-this.field_36270), (float)(-this.field_36261), 0.0F);
      class_73.method_99(
         (float)(this.field_36270 + (!this.field_3305 ? 0 : this.field_36257)),
         (float)this.field_36261 + (float)((this.field_36278 - 47) / 2) * (!this.field_3305 ? 1.0F : -1.58F),
         18.0F,
         47.0F,
         NotificationIcons.altselect,
         var6
      );
      GL11.glPopMatrix();
      class_73.method_94(
         (float)(this.field_36270 + 25),
         (float)(this.field_36261 + 68),
         (float)(this.field_36270 + this.field_36278 - 25),
         (float)(this.field_36261 + 69),
         class_314.method_1444(class_1255.field_6929.field_6917, 0.05F * var1)
      );
      super.method_32178(var1);
   }

   public final void method_2667(class_6915 var1) {
      this.field_3303.add(var1);
   }

   public final void method_2666(String var1, Vector3i var2, int var3) {
      for (class_6915 var7 : this.field_3303) {
         var7.method_31670(this, var1, var2, var3);
      }
   }
}
