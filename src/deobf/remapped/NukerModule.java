package remapped;

import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class NukerModule extends Module {
   private BlockPos field_48181;
   private List<BlockPos> field_48180;

   public NukerModule() {
      super(Category.WORLD, "Nuker", "Destroys blocks around you");
      this.addSetting(new FloatSetting<Float>("Range", "Range value for nuker", 6.0F, Float.class, 2.0F, 10.0F, 1.0F));
      this.addSetting(new ModeSetting("Mode", "Mode", 0, "All", "One hit", "Bed", "Egg"));
      this.addSetting(new BooleanSetting("NoSwing", "Removes the swing animation.", false));
      this.addSetting(new MultiSetting("Blocks", "Blocks to destroy", true));
      this.addSetting(new ColorSetting("Color", "The rendered block color", class_1255.field_6920.field_6917, true));
   }

   @EventListen
   private void method_43656(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         this.field_48180 = this.method_43660(this.getFloatValueByName("Range") / 2.0F);
         if (this.field_48180.isEmpty()) {
            this.field_48181 = null;
         } else if (client.playerController.getCurrentGameType() != GameType.CREATIVE) {
            if (this.field_48181 != null) {
               if (client.theWorld.method_28262(this.field_48181).method_8345()
                  || Math.sqrt(
                        client.thePlayer
                           .method_37273(
                              (double)this.field_48181.method_12173() + 0.5,
                              (double)this.field_48181.method_12165() + 0.5,
                              (double)this.field_48181.method_12185() + 0.5
                           )
                     )
                     > 6.0) {
                  this.field_48181 = this.field_48180.get(0);
               }

               float[] var4 = class_7211.method_33006(
                  (double)this.field_48181.method_12173(), (double)this.field_48181.method_12185(), (double)this.field_48181.method_12165()
               );
               var1.method_6441(var4[0]);
               var1.method_6448(var4[1]);
               class_6435 var5 = new class_6435(0, false, this.field_48181);
               SigmaMainClass.getInstance().getEventManager().call(var5);
               client.playerController.method_42163(this.field_48181, class_7494.method_34113(this.field_48181));
               if (!this.getBooleanValueByName("NoSwing")) {
                  client.thePlayer.method_26597(Hand.MAIN_HAND);
               } else {
                  client.method_8614().method_4813(new class_3195(Hand.MAIN_HAND));
               }
            } else {
               this.field_48181 = this.field_48180.get(0);
               float[] var6 = class_7211.method_33006(
                  (double)this.field_48181.method_12173() + 0.5, (double)this.field_48181.method_12185(), (double)this.field_48181.method_12165() + 0.5
               );
               var1.method_6441(var6[0]);
               var1.method_6448(var6[1]);
               class_6435 var8 = new class_6435(0, false, this.field_48181);
               SigmaMainClass.getInstance().getEventManager().call(var8);
               client.playerController.method_42163(this.field_48181, class_7494.method_34113(this.field_48181));
               if (!this.getBooleanValueByName("NoSwing")) {
                  client.thePlayer.method_26597(Hand.MAIN_HAND);
               } else {
                  client.method_8614().method_4813(new class_3195(Hand.MAIN_HAND));
               }
            }
         } else {
            for (BlockPos var9 : this.field_48180) {
               client.method_8614().method_4813(new class_1586(class_7500.field_38263, var9, class_7494.method_34113(var9)));
               if (!this.getBooleanValueByName("NoSwing")) {
                  client.thePlayer.method_26597(Hand.MAIN_HAND);
               } else {
                  client.method_8614().method_4813(new class_3195(Hand.MAIN_HAND));
               }
            }
         }
      }
   }

   @EventListen
   public void method_43659(class_3368 var1) {
      if (this.field_48181 != null && !client.theWorld.method_28262(this.field_48181).method_8345()) {
         int var4 = class_314.method_1444(this.getIntValueByName("Color"), 0.4F);
         GL11.glPushMatrix();
         GL11.glDisable(2929);
         double var5 = (double)this.field_48181.method_12173() - client.gameRenderer.method_35949().method_41627().method_61();
         double var7 = (double)this.field_48181.method_12165() - client.gameRenderer.method_35949().method_41627().method_60();
         double var9 = (double)this.field_48181.method_12185() - client.gameRenderer.method_35949().method_41627().method_62();
         class_4092 var11 = client.theWorld.method_28262(this.field_48181).method_8324(client.theWorld, this.field_48181).method_19483();
         class_8194 var12 = new class_8194(
            var5 + var11.field_19941,
            var7 + var11.field_19937,
            var9 + var11.field_19938,
            var5 + var11.field_19940,
            var7 + var11.field_19939,
            var9 + var11.field_19942
         );
         class_73.method_83(var12, var4);
         GL11.glEnable(2929);
         GL11.glPopMatrix();
      }
   }

   public static void method_43657(BlockPos var0) {
      client.method_8614().method_4813(new class_1586(class_7500.field_38263, var0, Direction.field_817));
      client.method_8614().method_4813(new class_1586(class_7500.field_38258, var0, Direction.field_817));
      client.theWorld.method_29594(var0, class_4783.field_23184.method_29260());
   }

   private boolean method_43658(BlockPos var1) {
      class_6414 var4 = client.theWorld.method_28262(var1).method_8360();
      return client.theWorld.method_28262(var1).method_8362().method_24497() || var4 instanceof class_2830;
   }

   private List<BlockPos> method_43660(float var1) {
      ArrayList var4 = new ArrayList();

      for (float var5 = var1 + 2.0F; var5 >= -var1 + 1.0F; var5--) {
         for (float var6 = -var1; var6 <= var1; var6++) {
            for (float var7 = -var1; var7 <= var1; var7++) {
               BlockPos var8 = new BlockPos(
                  client.thePlayer.method_37302() + (double)var6,
                  client.thePlayer.method_37309() + (double)var5,
                  client.thePlayer.method_37156() + (double)var7
               );
               if (!client.theWorld.method_28262(var8).method_8345()
                  && client.theWorld.method_28262(var8).method_8364().method_22001()
                  && Math.sqrt(
                        client.thePlayer
                           .method_37273((double)var8.method_12173() + 0.5, (double)var8.method_12165() + 0.5, (double)var8.method_12185() + 0.5)
                     )
                     < (double)var1) {
                  String var9 = this.getStringValueByName("Mode");
                  switch (var9) {
                     case "One hit":
                        if (!this.method_43658(var8)) {
                           continue;
                        }
                        break;
                     case "Bed":
                        if (!(client.theWorld.method_28262(var8).method_8360() instanceof class_3633)) {
                           continue;
                        }
                        break;
                     case "Egg":
                        if (!(client.theWorld.method_28262(var8).method_8360() instanceof class_5730)) {
                           continue;
                        }
                  }

                  var4.add(var8);
               }
            }
         }
      }

      return var4;
   }
}
