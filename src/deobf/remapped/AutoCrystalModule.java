package remapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import org.lwjgl.opengl.GL11;

public class AutoCrystalModule extends PremiumModule {
   private Timer field_48556 = new Timer();
   private static float field_48553;
   private static float field_48549;
   private static boolean field_48558;
   private BlockPos field_48552;
   private Entity field_48550;
   private static boolean field_48555 = false;
   private Runnable field_48554 = null;
   private int field_48557;
   private List<BlockPos> field_48551 = new ArrayList<BlockPos>();

   public AutoCrystalModule() {
      super("AutoCrystal", "Automatically detonates crystals", Category.WORLD);
      this.addSetting(new ModeSetting("Mode", "Mode", 0, "Single", "Switch"));
      this.addSetting(new FloatSetting<Float>("Range", "Range value", 4.0F, Float.class, 2.8F, 8.0F, 0.01F));
      this.addSetting(new FloatSetting<Float>("CPS", "Click per seconds", 9.0F, Float.class, 1.0F, 20.0F, 1.0F));
      this.addSetting(new BooleanSetting("Players", "Hit players", true));
      this.addSetting(new BooleanSetting("Animals/Monsters", "Hit animals and monsters", false));
      this.addSetting(new BooleanSetting("Invisible", "Hit invisible entites", true));
   }

   @Override
   public void onEnable() {
      this.field_48556.method_14773();
      this.field_48556.method_14776();
      this.field_48554 = null;
   }

   @EventListen
   public void method_44021(class_1393 var1) {
      if (!var1.method_6449()) {
         if (this.field_48554 != null) {
            this.field_48554.run();
            this.field_48554 = null;
         }
      } else {
         this.field_48557++;
         List var4 = this.method_44031(20.0F);
         if (var4 == null || var4.isEmpty()) {
            this.field_48550 = null;
            return;
         }

         this.field_48550 = (Entity)var4.get(0);
         if ((float)this.field_48557 >= 20.0F / this.getFloatValueByName("CPS")) {
            class_3577 var5 = client.theWorld
               .<Entity>method_25869(
                  Entity.class, this.field_48550.field_41712.method_18928(2.0, 4.0, 2.0).method_18928(-2.0, -3.0, -2.0), var0 -> var0 instanceof class_3577
               )
               .stream()
               .<class_3577>map(var0 -> (class_3577)var0)
               .filter(var0 -> var0.method_37175(client.thePlayer) < 6.0F)
               .filter(var1x -> (double)var1x.method_37175(this.field_48550) < 3.6)
               .min(Comparator.comparing(var1x -> method_44033(var1x.getPosX(), var1x.method_37309(), var1x.getPosZ(), this.field_48550)))
               .orElse(null);
            if (var5 != null) {
               class_1988 var9 = class_7211.method_33015(var5.field_41736);
               var1.method_6441(var9.field_10069);
               var1.method_6448(var9.field_10067);
               this.field_48557 = 0;
               this.field_48554 = new class_3255(this, var5);
               return;
            }
         }

         int var8 = this.method_44018();
         if (var8 < 0) {
            return;
         }

         this.field_48551 = this.method_44022();
         this.field_48551
            .sort(Comparator.comparing(var1x -> this.field_48550.method_37273((double)var1x.field_13231, (double)var1x.field_13230, (double)var1x.field_13229)));
         if (this.field_48551 != null && !this.field_48551.isEmpty()) {
            BlockPos var6 = this.field_48551
               .stream()
               .max(
                  Comparator.comparing(
                     var1x -> method_44033((double)var1x.getX(), (double)var1x.getY(), (double)var1x.getZ(), this.field_48550)
                  )
               )
               .orElse(null);
            if (var6 != null) {
               class_1988 var7 = class_7211.method_33015(
                  new class_1343((double)var6.field_13231 + 0.5, (double)var6.field_13230 + 0.5, (double)var6.field_13229 + 0.5)
               );
               var1.method_6441(var7.field_10069);
               var1.method_6448(var7.field_10067);
               this.field_48554 = new class_7589(this, var6, var8);
            }
         }
      }
   }

   @EventListen
   public void method_44030(class_3368 var1) {
      int var4 = class_314.method_1444(100000000, 0.2F);
      GL11.glPushMatrix();
      GL11.glDisable(2929);

      for (BlockPos var6 : this.field_48551) {
         double var7 = (double)var6.getX() - client.gameRenderer.method_35949().method_41627().method_61();
         double var9 = (double)var6.getY() - client.gameRenderer.method_35949().method_41627().method_60();
         double var11 = (double)var6.getZ() - client.gameRenderer.method_35949().method_41627().method_62();
         class_8194 var13 = new class_8194(var7, var9 + 1.0, var11, var7 + 1.0, var9 + 1.0, var11 + 1.0);
         FontManager.method_83(var13, var4);
      }

      var4 = class_314.method_1444(9000000, 1.0F);
      if (this.field_48550 != null) {
         double var14 = this.field_48550.getPosX() - client.gameRenderer.method_35949().method_41627().method_61();
         double var19 = this.field_48550.method_37309() - client.gameRenderer.method_35949().method_41627().method_60() + 0.5;
         double var20 = this.field_48550.getPosZ() - client.gameRenderer.method_35949().method_41627().method_62();
         float var16 = 0.3F;
         class_8194 var17 = new class_8194(var14 - (double)var16, var19 + 0.9, var20 - (double)var16, var14 + (double)var16, var19 + 1.0, var20 + (double)var16);
         FontManager.method_83(var17, var4);
      }

      GL11.glEnable(2929);
      GL11.glPopMatrix();
   }

   public static BlockPos method_44011() {
      return new BlockPos(
         Math.floor(client.thePlayer.getPosX()),
         Math.floor(client.thePlayer.method_37309()),
         Math.floor(client.thePlayer.getPosZ())
      );
   }

   private List<BlockPos> method_44022() {
      class_2831 var3 = class_2831.method_12874();
      var3.addAll(this.method_44015(method_44011(), 6.0F, 6, false, true, 0).stream().filter(this::method_44012).collect(Collectors.toList()));
      return var3;
   }

   private boolean method_44012(BlockPos var1) {
      BlockPos var4 = var1.method_6104(0, 1, 0);
      BlockPos var5 = var1.method_6104(0, 2, 0);
      return (
            client.theWorld.method_28262(var1).method_8360() == class_4783.field_23433
               || client.theWorld.method_28262(var1).method_8360() == class_4783.field_23881
         )
         && client.theWorld.method_28262(var4).method_8360() == class_4783.field_23184
         && client.theWorld.method_28262(var5).method_8360() == class_4783.field_23184
         && client.theWorld.<Entity>method_25868(Entity.class, new Box(var4)).isEmpty();
   }

   public List<BlockPos> method_44015(BlockPos var1, float var2, int var3, boolean var4, boolean var5, int var6) {
      ArrayList var9 = new ArrayList();
      int var10 = var1.getX();
      int var11 = var1.getY();
      int var12 = var1.getZ();

      for (int var13 = var10 - (int)var2; (float)var13 <= (float)var10 + var2; var13++) {
         for (int var14 = var12 - (int)var2; (float)var14 <= (float)var12 + var2; var14++) {
            for (int var15 = !var5 ? var11 : var11 - (int)var2; (float)var15 < (!var5 ? (float)(var11 + var3) : (float)var11 + var2); var15++) {
               double var16 = (double)((var10 - var13) * (var10 - var13) + (var12 - var14) * (var12 - var14) + (!var5 ? 0 : (var11 - var15) * (var11 - var15)));
               if (var16 < (double)(var2 * var2) && (!var4 || !(var16 < (double)((var2 - 1.0F) * (var2 - 1.0F))))) {
                  BlockPos var18 = new BlockPos(var13, var15 + var6, var14);
                  var9.add(var18);
               }
            }
         }
      }

      return var9;
   }

   public static float method_44033(double var0, double var2, double var4, Entity var6) {
      float var9 = 12.0F;
      double var10 = Math.sqrt(var6.method_37273(var0, var2, var4)) / (double)var9;
      class_1343 var12 = new class_1343(var0, var2, var4);
      double var13 = (double)class_2730.method_12265(var12, var6);
      double var15 = (1.0 - var10) * var13;
      float var17 = (float)((int)((var15 * var15 + var15) / 2.0 * 7.0 * (double)var9 + 1.0));
      double var18 = 1.0;
      if (var6 instanceof LivingEntity) {
         var18 = (double)method_44023(
            (LivingEntity)var6,
            method_44028(var17),
            new class_2730(client.theWorld, null, null, null, var0, var2, var4, 6.0F, false, class_7298.field_37309)
         );
      }

      return (float)var18;
   }

   private static float method_44028(float var0) {
      int var3 = client.theWorld.method_43370().method_2097();
      return var0 * (var3 != 0 ? (var3 != 2 ? (var3 != 1 ? 1.5F : 0.5F) : 1.0F) : 0.0F);
   }

   public static float method_44023(LivingEntity var0, float var1, class_2730 var2) {
      if (!(var0 instanceof PlayerEntity)) {
         return class_6357.method_29129(var1, (float)var0.method_26565(), (float)var0.method_26575(Attributes.field_37472));
      } else {
         PlayerEntity var5 = (PlayerEntity)var0;
         DamageSource var6 = DamageSource.method_28350(var2);
         var1 = class_6357.method_29129(var1, (float)var5.method_26565(), (float)var5.method_26575(Attributes.field_37472));
         int var7 = class_2931.method_13427(var5.method_37262(), var6);
         float var8 = MathHelper.clamp((float)var7, 0.0F, 20.0F);
         var1 *= 1.0F - var8 / 25.0F;
         if (var0.isPotionActive(class_1425.method_6538(11))) {
            var1 -= var1 / 4.0F;
         }

         return Math.max(var1 - var5.method_26493(), 0.0F);
      }
   }

   private static void method_44027() {
      if (field_48558) {
         field_48553 = client.thePlayer.rotationYaw;
         field_48549 = client.thePlayer.rotationPitch;
         field_48558 = false;
      }
   }

   private void method_44017(class_1343 var1) {
      class_1988 var4 = class_7211.method_33015(var1);
      field_48553 = var4.field_10069;
      field_48549 = var4.field_10067;
      field_48558 = true;
   }

   public List<Entity> method_44031(float var1) {
      List var4 = class_314.method_1440();
      Iterator var5 = var4.iterator();

      while (var5.hasNext()) {
         Entity var6 = (Entity)var5.next();
         if (var6 != client.thePlayer) {
            if (!SigmaMainClass.getInstance().method_3307().method_14460(var6)) {
               if (var6 instanceof LivingEntity) {
                  if (((LivingEntity)var6).method_26551() != 0.0F) {
                     if (!(client.thePlayer.method_37175(var6) > var1)) {
                        if (client.thePlayer.method_26608((LivingEntity)var6)) {
                           if (!(var6 instanceof class_9399)) {
                              if (!this.getBooleanValueByName("Players") && var6 instanceof PlayerEntity) {
                                 var5.remove();
                              } else if (var6 instanceof PlayerEntity && SigmaMainClass.getInstance().method_3331().method_20495(var6)) {
                                 var5.remove();
                              } else if (!this.getBooleanValueByName("Invisible") && var6.method_37109()) {
                                 var5.remove();
                              } else if (!this.getBooleanValueByName("Animals/Monsters") && !(var6 instanceof PlayerEntity)) {
                                 var5.remove();
                              } else if (client.thePlayer.getRidingEntity() != null && client.thePlayer.getRidingEntity().equals(var6)) {
                                 var5.remove();
                              } else if (!var6.method_37367()) {
                                 if (var6 instanceof PlayerEntity
                                    && class_5876.method_26760((PlayerEntity)var6)
                                    && SigmaMainClass.getInstance().getModuleManager().getModuleByClass(TeamsModule.class).method_42015()) {
                                    var5.remove();
                                 }
                              } else {
                                 var5.remove();
                              }
                           } else {
                              var5.remove();
                           }
                        } else {
                           var5.remove();
                        }
                     } else {
                        var5.remove();
                     }
                  } else {
                     var5.remove();
                  }
               } else {
                  var5.remove();
               }
            } else {
               var5.remove();
            }
         } else {
            var5.remove();
         }
      }

      Collections.sort(var4, new class_401(this));
      return var4;
   }

   public int method_44018() {
      for (int var3 = 36; var3 < 45; var3++) {
         if (client.thePlayer.field_3869.method_18878(var3).method_35884()) {
            ItemStack var4 = client.thePlayer.field_3869.method_18878(var3).method_35898();
            if (var4.method_27960() == class_4897.field_24665) {
               return var3 - 36;
            }
         }
      }

      for (int var5 = 9; var5 < 36; var5++) {
         if (client.thePlayer.field_3869.method_18878(var5).method_35884()) {
            ItemStack var6 = client.thePlayer.field_3869.method_18878(var5).method_35898();
            if (var6.method_27960() == class_4897.field_24665) {
               if (class_3347.method_15349() <= class_412.field_1752.method_2055()) {
                  client.method_8614().sendPacket(new class_8559(class_2105.field_10551));
               }

               class_2740.method_12312(var5, 8);
               client.method_8614().sendPacket(new class_1194(-1));
               return 5;
            }
         }
      }

      return -1;
   }
}
