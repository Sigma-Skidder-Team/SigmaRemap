package remapped;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import org.lwjgl.opengl.GL11;

public class OtherNameTagsModule extends Module {
   private HashMap<PlayerEntity, class_4895> field_15013 = new HashMap<PlayerEntity, class_4895>();
   public static OtherNameTagsModule field_15012;

   public OtherNameTagsModule() {
      super(Category.RENDER, "NameTags", "Render better name tags");
      field_15012 = this;
   }

   @EventListen
   public void method_13955(class_7285 var1) {
      if (this.method_42015()) {
         byte var4 = 20;
         byte var5 = 32;

         for (Entry var7 : this.field_15013.entrySet()) {
            PlayerEntity var8 = (PlayerEntity)var7.getKey();
            if (!var8.method_37109()) {
               class_4895 var9 = (class_4895)var7.getValue();
               String var10 = var8.method_45509().getUnformattedComponentText();
               int var11 = class_3054.field_14990.method_18547(var10) + 8;
               int var12 = Math.round(var9.field_24326);
               int var13 = Math.round(var9.field_24329);
               GL11.glPushMatrix();
               GL11.glTranslatef((float)(-var11 / 2), (float)(-var4), 0.0F);
               class_73.method_103((float)var12, (float)var13, (float)var11, 20.0F, class_314.method_1444(class_1255.field_6929.field_6917, 0.5F));
               class_73.method_87(
                  class_3054.field_14990, (float)(var12 + 3), (float)var13, var10, class_314.method_1444(class_1255.field_6929.field_6917, 0.5F)
               );
               class_73.method_87(class_3054.field_14990, (float)(var12 + 3), (float)(var13 - 1), var10, class_1255.field_6918.field_6917);
               GL11.glPopMatrix();
               List var14 = class_2740.method_12340(var8);
               if (var14.size() != 0) {
                  int var15 = var5 * var14.size();
                  GL11.glPushMatrix();
                  GL11.glTranslatef((float)(-var15 / 2), (float)(-var4 - var5 - 2), 0.0F);

                  for (int var16 = 0; var16 < var14.size(); var16++) {
                     int var17 = var12 + var16 * var5;
                     ItemStack var18 = (ItemStack)var14.get(var16);
                     int var19 = var17 + 6;
                     class_3416 var20 = var18.method_27983();
                     int var21 = var13 - Math.max(0, var20.size() - 4) * 8 - 2;

                     for (int var22 = 0; var22 < var20.size(); var22++) {
                        CompoundNBT var23 = var20.method_15764(var22);
                        int var24 = var22 * 8 + 10;
                        class_8669.field_44445.method_39794(Identifier.method_21455(var23.method_25965("id"))).ifPresent(var1x -> {
                           String var4x = var1x.method_20423(1).getUnformattedComponentText();
                           String var5x = "§f" + var4x.substring(0, Math.min(2, var4x.length()));
                           int var6 = 0;
                           if (var23.method_25938("lvl")) {
                              var6 = var23.method_25947("lvl");
                           }

                           String var7x = "§a";
                           if (var6 <= 3) {
                              if (var6 > 2) {
                                 var7x = "§6";
                              }
                           } else {
                              var7x = "§c";
                           }

                           String var8x = var5x + var7x + var6;
                        });
                     }

                     int var25 = !var18.method_27995() ? var18.method_27957() : var18.method_27957() - var18.method_28026();
                     String var26 = "§a";
                     if (!((float)var25 / (float)var18.method_27957() < 0.2F)) {
                        if ((float)var25 / (float)var18.method_27957() < 0.5F) {
                           var26 = "§6";
                        }
                     } else {
                        var26 = "§c";
                     }
                  }

                  GL11.glPopMatrix();
               }
            }
         }
      }
   }

   @EventListen
   public void method_13953(class_3368 var1) {
      if (this.method_42015()) {
         this.field_15013.clear();

         for (Entity var5 : client.theWorld.method_736()) {
            if (var5 instanceof PlayerEntity && !(var5 instanceof ClientPlayerEntity)) {
               PlayerEntity var6 = (PlayerEntity)var5;
               class_8328 var7 = class_9189.method_42353(var6);
               double[] var8 = class_73.method_143(var7.field_42648, var7.field_42646 + (double)var6.method_37074() + 0.3F, var7.field_42649);
               if (var8 != null && var8[2] >= 0.0 && var8[2] < 1.0) {
                  this.field_15013.put(var6, new class_4895((float)var8[0], (float)var8[1]));
               }
            }
         }
      }
   }

   @EventListen
   public void method_13954(class_2563 var1) {
      if (this.method_42015() && var1.method_11643() instanceof PlayerEntity) {
         var1.method_29715(true);
      }
   }
}
