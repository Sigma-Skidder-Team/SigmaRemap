package remapped;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class class_9093 extends Module {
   private List<class_7606> field_46576;
   private class_6009 field_46580;
   private BlockPos field_46570;
   private BlockPos field_46573;
   private class_6414 field_46571;
   private class_7606 field_46577;
   private boolean field_46575;
   private boolean field_46578 = true;
   private final int field_46579 = 0;
   private List<String> field_46568 = new ArrayList<String>();
   private int field_46572;
   private int field_46569;

   public class_9093() {
      super(Category.WORLD, "JelloEdit", "Client side world edit");
      File var3 = new File(SigmaMainClass.getInstance().method_3334() + "/shematics");
      if (var3.exists()) {
         this.field_46568 = new ArrayList<String>(Arrays.asList(var3.list()));

         for (int var4 = 0; var4 < this.field_46568.size(); var4++) {
            if (this.field_46568.get(var4).startsWith(".")) {
               this.field_46568.remove(var4);
               break;
            }
         }

         String[] var5 = new String[this.field_46568.size()];
         var5 = this.field_46568.<String>toArray(var5);
         this.addSetting(new ModeSetting("Shematics", "shematics", 0, var5));
      }
   }

   private BlockPos method_41923(int var1) {
      return new BlockPos(
         this.field_46570.getX() + this.field_46580.method_27432().get(var1).method_1250().method_19587(),
         this.field_46570.getY() + this.field_46580.method_27432().get(var1).method_1250().method_19639(),
         this.field_46570.getZ() + this.field_46580.method_27432().get(var1).method_1250().method_19638()
      );
   }

   private class_6414 method_41926(int var1) {
      return class_6414.method_29293(this.field_46580.method_27432().get(var1).method_1251()).method_8360();
   }

   private BlockPos method_41925() {
      this.field_46571 = this.method_41926(this.field_46569);
      this.field_46573 = this.method_41923(this.field_46569++);
      return this.field_46573;
   }

   private class_7606 method_41922() {
      return this.field_46577 = this.field_46576.get(this.field_46572++);
   }

   @Override
   public void onEnable() {
      File var3 = new File(SigmaMainClass.getInstance().method_3334() + "/shematics/" + (String)this.getSettingValueByName("Shematics"));
      if (var3.exists()) {
         this.field_46580 = new class_6009(var3);
         if (this.field_46580.method_27431() && this.field_46580.method_27432().size() > 0) {
            class_314.method_1443(this.field_46580.method_27432().size() + " blocks loaded from schematic");
            this.field_46570 = new BlockPos(
               client.thePlayer.getPosX() + this.field_46580.method_27435().method_19594() * 0.0,
               client.thePlayer.method_37309() + this.field_46580.method_27435().method_19634() * 0.0,
               client.thePlayer.getPosZ() + this.field_46580.method_27435().method_19612() * 0.0
            );
            this.method_41925();
         } else {
            class_314.method_1443("Unable to load schematic");
            this.method_41999();
         }
      } else {
         class_314.method_1443("Schematic does not exist");
         this.method_41999();
      }
   }

   @EventListen
   private void method_41924(class_3368 var1) {
      if (this.method_42015()) {
         GL11.glAlphaFunc(516, 0.0F);

         for (class_278 var5 : this.field_46580.method_27432()) {
            BlockPos var6 = new BlockPos(
               (double)this.field_46570.getX() + var5.method_1250().method_19594(),
               (double)this.field_46570.getY() + var5.method_1250().method_19634(),
               (double)this.field_46570.getZ() + var5.method_1250().method_19612()
            );
            if (class_7494.method_34120(var6) == class_4783.field_23184) {
               double var7 = (double)var6.getX() - client.gameRenderer.method_35949().method_41627().method_61();
               double var9 = (double)var6.getY() - client.gameRenderer.method_35949().method_41627().method_60();
               double var11 = (double)var6.getZ() - client.gameRenderer.method_35949().method_41627().method_62();
               class_8194 var13 = new class_8194(var7, var9, var11, var7 + 1.0, var9 + 1.0, var11 + 1.0);
               class_73.method_83(var13, class_314.method_1444(class_1255.field_6922.field_6917, 0.02F));
               GL11.glEnable(2848);
               class_73.method_131(var13, class_314.method_1444(class_1255.field_6922.field_6917, 0.03F));
               GL11.glColor3f(1.0F, 1.0F, 1.0F);
            }
         }

         for (class_7606 var15 : this.field_46576) {
            BlockPos var16 = var15.field_38725;
            double var17 = (double)var16.getX() - client.gameRenderer.method_35949().method_41627().method_61();
            double var18 = (double)var16.getY() - client.gameRenderer.method_35949().method_41627().method_60();
            double var19 = (double)var16.getZ() - client.gameRenderer.method_35949().method_41627().method_62();
            class_8194 var20 = new class_8194(var17, var18, var19, var17 + 1.0, var18 + 1.0, var19 + 1.0);
            class_73.method_83(var20, class_314.method_1444(class_1255.field_6925.field_6917, 0.1F));
            class_73.method_131(var20, class_314.method_1444(class_1255.field_6925.field_6917, 0.2F));
            GL11.glColor3f(1.0F, 1.0F, 1.0F);
         }
      }
   }
}
