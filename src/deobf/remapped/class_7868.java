package remapped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import org.lwjgl.opengl.GL11;

public class class_7868 extends class_1859 {
   private List<class_6220> field_40281 = new ArrayList<class_6220>();
   private final int field_40279;
   private final class_2440 field_40280;
   private boolean field_40282 = false;
   private final List<class_779> field_40283 = new ArrayList<class_779>();
   private final List<class_7996> field_40278 = new ArrayList<class_7996>();

   public class_7868(class_7038 var1, String var2, int var3, int var4, int var5, String var6) {
      super(var1, var2, var3 - 125, var4, 250, 330, class_590.field_3421, var6, false);
      if (this.field_36261 + this.field_36257 <= MinecraftClient.getInstance().window.method_43163()) {
         this.field_36261 += 10;
      } else {
         this.field_36261 -= 400;
         this.field_40282 = true;
      }

      this.field_40279 = var5;
      this.field_40280 = new class_2440(250, 0);
      this.method_32187(true);
      this.method_32105(false);
      this.method_35615();
      class_8223 var9;
      this.method_32148(
         var9 = new class_8223(
            this,
            "addButton",
            this.field_36278 - 70,
            this.field_36257 - 70,
            class_5320.field_27141.method_18547("Add"),
            70,
            class_590.field_3421,
            "Add",
            class_5320.field_27141
         )
      );
      var9.method_32100((var1x, var2x) -> this.method_35617());
   }

   public void method_35619() {
      this.method_35616();
   }

   public void method_35615() {
      int var3 = 1;
      ArrayList var4 = new ArrayList();

      for (class_7038 var6 : this.method_32134()) {
         if (var6.method_32137() != 0) {
            var4.add(var6.method_32176());
         }
      }

      this.method_32162();
      this.method_32177(true);
      this.method_32161();

      for (class_1226 var10 : class_8441.method_38833()) {
         int var7 = var10.method_5458();
         if (var7 == this.field_40279) {
            class_6738 var8;
            this.method_32148(var8 = new class_6738(this, var10.method_5460(), 0, 20 + 55 * var3, this.field_36278, 55, var10, var3++));
            var8.method_8236(var2 -> {
               var10.method_5462(0);
               this.method_8235();
            });
            if (var4.size() > 0 && !var4.contains(var10.method_5460())) {
               var8.method_30882();
            }
         }
      }
   }

   @Override
   public void method_32145(int var1, int var2) {
      HashMap var5 = new HashMap();

      for (class_7038 var7 : this.method_32134()) {
         if (var7 instanceof class_6738) {
            class_6738 var8 = (class_6738)var7;
            var5.put(var8.field_34785, var8);
         }
      }

      int var9 = 75;

      for (Entry var11 : var5.entrySet()) {
         ((class_6738)var11.getValue()).method_32117(var9);
         var9 += ((class_6738)var11.getValue()).method_32137();
      }

      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      var1 = this.field_40280.method_11123();
      float var4 = class_9556.method_44073(var1, 0.0F, 1.0F, 1.0F);
      this.method_32111(0.8F + var4 * 0.2F, 0.8F + var4 * 0.2F);
      this.method_32188((int)((float)this.field_36278 * 0.2F * (1.0F - var4)) * (!this.field_40282 ? 1 : -1));
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
      GL11.glRotatef(!this.field_40282 ? -90.0F : 90.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef((float)(-this.field_36270), (float)(-this.field_36261), 0.0F);
      class_73.method_99(
         (float)(this.field_36270 + (!this.field_40282 ? 0 : this.field_36257)),
         (float)this.field_36261 + (float)((this.field_36278 - 47) / 2) * (!this.field_40282 ? 1.0F : -1.5F),
         18.0F,
         47.0F,
         class_2209.field_11022,
         var6
      );
      GL11.glPopMatrix();
      class_73.method_87(
         class_5320.field_27141,
         (float)(this.field_36270 + 25),
         (float)(this.field_36261 + 20),
         this.field_36275 + " Key",
         class_314.method_1444(class_1255.field_6929.field_6917, 0.8F * var1)
      );
      class_73.method_94(
         (float)(this.field_36270 + 25),
         (float)(this.field_36261 + 68),
         (float)(this.field_36270 + this.field_36278 - 25),
         (float)(this.field_36261 + 69),
         class_314.method_1444(class_1255.field_6929.field_6917, 0.05F * var1)
      );
      super.method_32178(var1);
   }

   public final void method_35614(class_779 var1) {
      this.field_40283.add(var1);
   }

   public final void method_35617() {
      for (class_779 var4 : this.field_40283) {
         var4.method_3479(this);
      }
   }

   public final void method_35618(class_7996 var1) {
      this.field_40278.add(var1);
   }

   public final void method_35616() {
      for (class_7996 var4 : this.field_40278) {
         var4.method_36288(this);
      }
   }
}
