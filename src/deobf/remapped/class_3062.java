package remapped;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TextProcessing;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.StringUtils;

public class class_3062 extends class_2089 {
   private static final class_4639 field_15059 = new class_4639("textures/misc/vignette.png");
   private static final class_4639 field_15056 = new class_4639("textures/gui/widgets.png");
   private static final class_4639 field_15038 = new class_4639("textures/misc/pumpkinblur.png");
   private static final ITextComponent field_15033 = new TranslationTextComponent("demo.demoExpired");
   private final Random field_15058 = new Random();
   private final MinecraftClient field_15040;
   private final class_8765 field_15030;
   private final class_4049 field_15054;
   private int field_15042;
   private ITextComponent field_15031;
   private int field_15051;
   private boolean field_15034;
   public float field_15036 = 1.0F;
   private int field_15047;
   private class_6098 field_15039 = class_6098.field_31203;
   public final class_3888 field_15026;
   private final class_4381 field_15045;
   private final class_8368 field_15032;
   private final class_2130 field_15053;
   private final class_4736 field_15044;
   private int field_15029;
   private ITextComponent field_15050;
   private ITextComponent field_15043;
   private int field_15055;
   private int field_15057;
   private int field_15052;
   private int field_15035;
   private int field_15037;
   private long field_15041;
   private long field_15046;
   private int field_15028;
   private int field_15049;
   private final Map<ChatType, List<class_9720>> field_15048 = Maps.newHashMap();

   public class_3062(MinecraftClient var1) {
      this.field_15040 = var1;
      this.field_15030 = var1.method_8511();
      this.field_15026 = new class_3888(var1);
      this.field_15032 = new class_8368(var1);
      this.field_15054 = new class_4049(var1);
      this.field_15053 = new class_2130(var1, this);
      this.field_15044 = new class_4736(var1);
      this.field_15045 = new class_4381(var1);

      for (ChatType var7 : ChatType.values()) {
         this.field_15048.put(var7, Lists.newArrayList());
      }

      class_7542 var8 = class_7542.field_38482;
      this.field_15048.get(ChatType.CHAT).add(new class_874(var1));
      this.field_15048.get(ChatType.CHAT).add(var8);
      this.field_15048.get(ChatType.SYSTEM).add(new class_874(var1));
      this.field_15048.get(ChatType.SYSTEM).add(var8);
      this.field_15048.get(ChatType.GAME_INFO).add(new class_6932(var1));
      this.method_13987();
   }

   public void method_13987() {
      this.field_15055 = 10;
      this.field_15057 = 70;
      this.field_15052 = 20;
   }

   public void method_13997(class_7966 var1, float var2) {
      this.field_15028 = this.field_15040.method_8552().method_43165();
      this.field_15049 = this.field_15040.method_8552().method_43177();
      TextRenderer var5 = this.method_13975();
      class_3542.method_16488();
      if (!class_3111.method_14292()) {
         class_3542.method_16428();
         class_3542.method_16437();
      } else {
         this.method_13996(this.field_15040.method_8516());
      }

      SigmaMainClass.method_3328().method_3333();
      class_6098 var6 = this.field_15040.field_9632.field_3853.method_32416(3);
      if (this.field_15040.field_9577.method_40867().method_42383() && var6.method_27960() == class_4783.field_23281.method_10803()) {
         this.method_13979();
      }

      float var7 = class_9299.method_42795(var2, this.field_15040.field_9632.field_30505, this.field_15040.field_9632.field_30510);
      if (var7 > 0.0F && !this.field_15040.field_9632.method_26480(class_4054.field_19732)) {
         this.method_13973(var7);
      }

      if (this.field_15040.field_9647.method_42158() != class_4666.field_22756) {
         if (!this.field_15040.field_9577.field_45567) {
            this.method_13998(var2, var1);
         }
      } else {
         this.field_15032.method_38558(var1, var2);
      }

      if (!this.field_15040.field_9577.field_45567) {
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         this.field_15040.method_8577().method_35674(field_10507);
         class_3542.method_16488();
         class_3542.method_16374();
         this.method_13989(var1);
         class_1920.method_8741();
         class_3542.method_16437();
         this.field_15040.method_8562().method_16056("bossHealth");
         this.field_15044.method_21875(var1);
         this.field_15040.method_8562().method_16054();
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         this.field_15040.method_8577().method_35674(field_10507);
         if (this.field_15040.field_9647.method_42162()) {
            this.method_13994(var1);
         }

         this.method_14000(var1);
         class_3542.method_16448();
         int var8 = this.field_15028 / 2 - 91;
         if (!this.field_15040.field_9632.method_27317()) {
            if (this.field_15040.field_9647.method_42133()) {
               this.method_14003(var1, var8);
            }
         } else {
            this.method_13999(var1, var8);
         }

         if (this.field_15040.field_9577.field_45477 && this.field_15040.field_9647.method_42158() != class_4666.field_22756) {
            this.method_13993(var1);
         } else if (this.field_15040.field_9632.method_37221()) {
            this.field_15032.method_38563(var1);
         }
      }

      if (this.field_15040.field_9632.method_3202() > 0) {
         this.field_15040.method_8562().method_16056("sleep");
         class_3542.method_16491();
         class_3542.method_16458();
         float var14 = (float)this.field_15040.field_9632.method_3202();
         float var9 = var14 / 100.0F;
         if (var9 > 1.0F) {
            var9 = 1.0F - (var14 - 100.0F) / 10.0F;
         }

         int var10 = (int)(220.0F * var9) << 24 | 1052704;
         method_9774(var1, 0, 0, this.field_15028, this.field_15049, var10);
         class_3542.method_16374();
         class_3542.method_16428();
         this.field_15040.method_8562().method_16054();
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      }

      if (this.field_15040.method_8493()) {
         this.method_13971(var1);
      }

      this.method_13983(var1);
      if (this.field_15040.field_9577.field_45470) {
         this.field_15026.method_17982(var1);
      }

      if (!this.field_15040.field_9577.field_45567) {
         if (this.field_15031 != null && this.field_15051 > 0) {
            this.field_15040.method_8562().method_16056("overlayMessage");
            float var15 = (float)this.field_15051 - var2;
            int var18 = (int)(var15 * 255.0F / 20.0F);
            if (var18 > 255) {
               var18 = 255;
            }

            if (var18 > 8) {
               class_3542.method_16438();
               class_3542.method_16413((float)(this.field_15028 / 2), (float)(this.field_15049 - 68), 0.0F);
               class_3542.method_16488();
               class_3542.method_16437();
               int var22 = 16777215;
               if (this.field_15034) {
                  var22 = class_9299.method_42792(var15 / 50.0F, 0.7F, 0.6F) & 16777215;
               }

               int var11 = var18 << 24 & 0xFF000000;
               int var12 = var5.method_45379(this.field_15031);
               this.method_14005(var1, var5, -4, var12, 16777215 | var11);
               var5.method_45378(var1, this.field_15031, (float)(-var12 / 2), -4.0F, var22 | var11);
               class_3542.method_16448();
               class_3542.method_16489();
            }

            this.field_15040.method_8562().method_16054();
         }

         if (this.field_15050 != null && this.field_15029 > 0) {
            this.field_15040.method_8562().method_16056("titleAndSubtitle");
            float var16 = (float)this.field_15029 - var2;
            int var19 = 255;
            if (this.field_15029 > this.field_15052 + this.field_15057) {
               float var23 = (float)(this.field_15055 + this.field_15057 + this.field_15052) - var16;
               var19 = (int)(var23 * 255.0F / (float)this.field_15055);
            }

            if (this.field_15029 <= this.field_15052) {
               var19 = (int)(var16 * 255.0F / (float)this.field_15052);
            }

            var19 = class_9299.method_42829(var19, 0, 255);
            if (var19 > 8) {
               class_3542.method_16438();
               class_3542.method_16413((float)(this.field_15028 / 2), (float)(this.field_15049 / 2), 0.0F);
               class_3542.method_16488();
               class_3542.method_16437();
               class_3542.method_16438();
               class_3542.method_16403(4.0F, 4.0F, 4.0F);
               int var24 = var19 << 24 & 0xFF000000;
               int var26 = var5.method_45379(this.field_15050);
               this.method_14005(var1, var5, -10, var26, 16777215 | var24);
               var5.method_45392(var1, this.field_15050, (float)(-var26 / 2), -10.0F, 16777215 | var24);
               class_3542.method_16489();
               if (this.field_15043 != null) {
                  class_3542.method_16438();
                  class_3542.method_16403(2.0F, 2.0F, 2.0F);
                  int var30 = var5.method_45379(this.field_15043);
                  this.method_14005(var1, var5, 5, var30, 16777215 | var24);
                  var5.method_45392(var1, this.field_15043, (float)(-var30 / 2), 5.0F, 16777215 | var24);
                  class_3542.method_16489();
               }

               class_3542.method_16448();
               class_3542.method_16489();
            }

            this.field_15040.method_8562().method_16054();
         }

         this.field_15045.method_20416(var1);
         class_1097 var17 = this.field_15040.field_9601.method_29562();
         class_4399 var21 = null;
         class_3903 var25 = var17.method_4848(this.field_15040.field_9632.method_37206());
         if (var25 != null) {
            int var27 = var25.method_23381().getColorIndex();
            if (var27 >= 0) {
               var21 = var17.method_4833(3 + var27);
            }
         }

         class_4399 var28 = var21 == null ? var17.method_4833(1) : var21;
         if (var28 != null) {
            class_4459 var31 = new class_4459(true);
            SigmaMainClass.method_3328().method_3302().method_7914(var31);
            if (var31.method_29716()) {
               return;
            }

            this.method_13977(var1, var28);
            class_4459 var13 = new class_4459(false);
            SigmaMainClass.method_3328().method_3302().method_7914(var13);
         }

         class_3542.method_16488();
         class_3542.method_16437();
         class_3542.method_16458();
         class_3542.method_16438();
         class_3542.method_16413(0.0F, (float)(this.field_15049 - 48), 0.0F);
         this.field_15040.method_8562().method_16056("chat");
         this.field_15054.method_18678(var1, this.field_15042);
         this.field_15040.method_8562().method_16054();
         class_3542.method_16489();
         var28 = var17.method_4833(0);
         if (this.field_15040.field_9577.field_45564.method_27060()
            && (!this.field_15040.method_8566() || this.field_15040.field_9632.field_30532.method_4798().size() > 1 || var28 != null)) {
            this.field_15053.method_9944(true);
            this.field_15053.method_9940(var1, this.field_15028, var17, var28);
         } else {
            this.field_15053.method_9944(false);
         }
      }

      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      class_3542.method_16374();
   }

   private void method_14005(class_7966 var1, TextRenderer var2, int var3, int var4, int var5) {
      int var8 = this.field_15040.field_9577.method_40888(0.0F);
      if (var8 != 0) {
         int var9 = -var4 / 2;
         method_9774(var1, var9 - 2, var3 - 2, var9 + var4 + 2, var3 + 9 + 2, class_8496.method_39155(var8, var5));
      }
   }

   private void method_13989(class_7966 var1) {
      class_8881 var4 = this.field_15040.field_9577;
      if (var4.method_40867().method_42383()
         && (this.field_15040.field_9647.method_42158() != class_4666.field_22756 || this.method_14001(this.field_15040.field_9587))) {
         if (var4.field_45470 && !var4.field_45567 && !this.field_15040.field_9632.method_3179() && !var4.field_45500) {
            class_3542.method_16438();
            class_3542.method_16413((float)(this.field_15028 / 2), (float)(this.field_15049 / 2), (float)this.method_9777());
            class_9071 var11 = this.field_15040.gameRenderer.method_35949();
            class_3542.method_16410(var11.method_41638(), -1.0F, 0.0F, 0.0F);
            class_3542.method_16410(var11.method_41640(), 0.0F, 1.0F, 0.0F);
            class_3542.method_16403(-1.0F, -1.0F, -1.0F);
            class_3542.method_16412(10);
            class_3542.method_16489();
         } else {
            class_3542.method_16425(class_5033.field_26037, class_8535.field_43686, class_5033.field_26047, class_8535.field_43699);
            byte var5 = 15;
            this.method_9781(var1, (this.field_15028 - 15) / 2, (this.field_15049 - 15) / 2, 0, 0, 15, 15);
            if (this.field_15040.field_9577.field_45555 == class_8846.field_45243) {
               float var6 = this.field_15040.field_9632.method_3203(0.0F);
               boolean var7 = false;
               if (this.field_15040.field_9662 != null && this.field_15040.field_9662 instanceof class_5834 && var6 >= 1.0F) {
                  var7 = this.field_15040.field_9632.method_3163() > 5.0F;
                  var7 &= this.field_15040.field_9662.method_37330();
               }

               int var8 = this.field_15049 / 2 - 7 + 16;
               int var9 = this.field_15028 / 2 - 8;
               if (!var7) {
                  if (var6 < 1.0F) {
                     int var10 = (int)(var6 * 17.0F);
                     this.method_9781(var1, var9, var8, 36, 94, 16, 4);
                     this.method_9781(var1, var9, var8, 52, 94, var10, 4);
                  }
               } else {
                  this.method_9781(var1, var9, var8, 68, 94, 16, 16);
               }
            }
         }
      }
   }

   private boolean method_14001(class_7474 var1) {
      if (var1 != null) {
         if (var1.method_33990() != class_1430.field_7718) {
            if (var1.method_33990() != class_1430.field_7717) {
               return false;
            } else {
               class_1331 var4 = ((class_9529)var1).method_43955();
               class_174 var5 = this.field_15040.field_9601;
               return var5.method_28262(var4).method_8317(var5, var4) != null;
            }
         } else {
            return ((class_5631)var1).method_25524() instanceof class_4259;
         }
      } else {
         return false;
      }
   }

   public void method_13983(class_7966 var1) {
      Collection var4 = this.field_15040.field_9632.method_26503();
      if (!var4.isEmpty()) {
         class_3542.method_16488();
         int var5 = 0;
         int var6 = 0;
         class_3944 var7 = this.field_15040.method_8551();
         ArrayList var8 = Lists.newArrayListWithExpectedSize(var4.size());
         this.field_15040.method_8577().method_35674(class_2208.field_10969);

         for (class_2250 var10 : Ordering.natural().reverse().sortedCopy(var4)) {
            class_1425 var11 = var10.method_10339();
            if (class_7860.field_40209.method_3596()) {
               if (!class_7860.method_35565(var10, class_7860.field_40209)) {
                  continue;
               }

               this.field_15040.method_8577().method_35674(class_2208.field_10969);
            }

            if (var10.method_10342()) {
               int var12 = this.field_15028;
               byte var13 = 1;
               if (this.field_15040.method_8493()) {
                  var13 += 15;
               }

               if (!var11.method_6542()) {
                  var6++;
                  var12 -= 25 * var6;
                  var13 += 26;
               } else {
                  var5++;
                  var12 -= 25 * var5;
               }

               class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
               float var14 = 1.0F;
               if (!var10.method_10338()) {
                  this.method_9781(var1, var12, var13, 141, 166, 24, 24);
                  if (var10.method_10347() <= 200) {
                     int var15 = 10 - var10.method_10347() / 20;
                     var14 = class_9299.method_42828((float)var10.method_10347() / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                        + class_9299.method_42840((float)var10.method_10347() * (float) Math.PI / 5.0F)
                           * class_9299.method_42828((float)var15 / 10.0F * 0.25F, 0.0F, 0.25F);
                  }
               } else {
                  this.method_9781(var1, var12, var13, 165, 166, 24, 24);
               }

               class_5155 var20 = var7.method_18228(var11);
               int var16 = var12;
               byte var17 = var13;
               float var18 = var14;
               var8.add(() -> {
                  this.field_15040.method_8577().method_35674(var20.method_23608().method_38519());
                  class_3542.method_16480(1.0F, 1.0F, 1.0F, var18);
                  method_9782(var1, var16 + 3, var17 + 3, this.method_9777(), 18, 18, var20);
               });
               if (class_7860.field_39873.method_3596()) {
                  class_7860.method_35555(var10, class_7860.field_39873, this, var1, var12, Integer.valueOf(var13), this.method_9777(), var14);
               }
            }
         }

         var8.forEach(Runnable::run);
      }
   }

   public void method_13998(float var1, class_7966 var2) {
      class_704 var5 = this.method_13976();
      if (var5 != null) {
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         this.field_15040.method_8577().method_35674(field_15056);
         class_6098 var6 = var5.method_26568();
         class_1736 var7 = var5.method_26432().method_7745();
         int var8 = this.field_15028 / 2;
         int var9 = this.method_9777();
         short var10 = 182;
         byte var11 = 91;
         this.method_9776(-90);
         this.method_9781(var2, var8 - 91, this.field_15049 - 22, 0, 0, 182, 22);
         this.method_9781(var2, var8 - 91 - 1 + var5.field_3853.field_36404 * 20, this.field_15049 - 22 - 1, 0, 22, 24, 22);
         if (!var6.method_28022()) {
            if (var7 != class_1736.field_8940) {
               this.method_9781(var2, var8 + 91, this.field_15049 - 23, 53, 22, 29, 24);
            } else {
               this.method_9781(var2, var8 - 91 - 29, this.field_15049 - 23, 24, 22, 29, 24);
            }
         }

         this.method_9776(var9);
         class_3542.method_16381();
         class_3542.method_16488();
         class_3542.method_16437();
         class_3290.method_15104(false);

         for (int var12 = 0; var12 < 9; var12++) {
            int var13 = var8 - 90 + var12 * 20 + 2;
            int var14 = this.field_15049 - 16 - 3;
            this.method_13984(var13, var14, var1, var5, var5.field_3853.field_36401.get(var12));
         }

         if (!var6.method_28022()) {
            class_3290.method_15104(true);
            int var16 = this.field_15049 - 16 - 3;
            if (var7 != class_1736.field_8940) {
               this.method_13984(var8 + 91 + 10, var16, var1, var5, var6);
            } else {
               this.method_13984(var8 - 91 - 26, var16, var1, var5, var6);
            }

            class_3290.method_15104(false);
         }

         if (this.field_15040.field_9577.field_45555 == class_8846.field_45241) {
            float var17 = this.field_15040.field_9632.method_3203(0.0F);
            if (var17 < 1.0F) {
               int var18 = this.field_15049 - 20;
               int var19 = var8 + 91 + 6;
               if (var7 == class_1736.field_8943) {
                  var19 = var8 - 91 - 22;
               }

               this.field_15040.method_8577().method_35674(class_2089.field_10507);
               int var15 = (int)(var17 * 19.0F);
               class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
               this.method_9781(var2, var19, var18, 0, 94, 18, 18);
               this.method_9781(var2, var19, var18 + 18 - var15, 18, 112 - var15, 18, var15);
            }
         }

         class_3542.method_16443();
         class_3542.method_16448();
      }
   }

   public void method_13999(class_7966 var1, int var2) {
      this.field_15040.method_8562().method_16056("jumpBar");
      this.field_15040.method_8577().method_35674(class_2089.field_10507);
      float var5 = this.field_15040.field_9632.method_27313();
      short var6 = 182;
      int var7 = (int)(var5 * 183.0F);
      int var8 = this.field_15049 - 32 + 3;
      this.method_9781(var1, var2, var8, 0, 84, 182, 5);
      if (var7 > 0) {
         this.method_9781(var1, var2, var8, 0, 89, var7, 5);
      }

      this.field_15040.method_8562().method_16054();
   }

   public void method_14003(class_7966 var1, int var2) {
      this.field_15040.method_8562().method_16056("expBar");
      this.field_15040.method_8577().method_35674(class_2089.field_10507);
      int var5 = this.field_15040.field_9632.method_3194();
      if (var5 > 0) {
         short var6 = 182;
         int var7 = (int)(this.field_15040.field_9632.field_3842 * 183.0F);
         int var8 = this.field_15049 - 32 + 3;
         this.method_9781(var1, var2, var8, 0, 64, 182, 5);
         if (var7 > 0) {
            this.method_9781(var1, var2, var8, 0, 69, var7, 5);
         }
      }

      this.field_15040.method_8562().method_16054();
      if (this.field_15040.field_9632.field_3840 > 0) {
         this.field_15040.method_8562().method_16056("expLevel");
         int var10 = 8453920;
         if (class_3111.method_14438()) {
            var10 = class_9300.method_42858(var10);
         }

         String var11 = "" + this.field_15040.field_9632.field_3840;
         int var12 = (this.field_15028 - this.method_13975().method_45395(var11)) / 2;
         int var9 = this.field_15049 - 31 - 4;
         this.method_13975().method_45385(var1, var11, (float)(var12 + 1), (float)var9, 0);
         this.method_13975().method_45385(var1, var11, (float)(var12 - 1), (float)var9, 0);
         this.method_13975().method_45385(var1, var11, (float)var12, (float)(var9 + 1), 0);
         this.method_13975().method_45385(var1, var11, (float)var12, (float)(var9 - 1), 0);
         this.method_13975().method_45385(var1, var11, (float)var12, (float)var9, var10);
         this.field_15040.method_8562().method_16054();
      }
   }

   public void method_13993(class_7966 var1) {
      this.field_15040.method_8562().method_16056("selectedItemName");
      if (this.field_15047 > 0 && !this.field_15039.method_28022()) {
         IFormattableTextComponent var4 = new StringTextComponent("")
            .append(this.field_15039.method_28008())
            .mergeStyle(this.field_15039.method_28010().field_26118);
         if (this.field_15039.method_28018()) {
            var4.mergeStyle(TextFormatting.ITALIC);
         }

         Object var5 = var4;
         if (class_7860.field_40201.method_3596()) {
            var5 = (ITextComponent)class_7860.method_35555(this.field_15039, class_7860.field_40201, var4);
         }

         int var6 = this.method_13975().method_45379((ITextProperties)var5);
         int var7 = (this.field_15028 - var6) / 2;
         int var8 = this.field_15049 - 59;
         if (!this.field_15040.field_9647.method_42162()) {
            var8 += 14;
         }

         int var9 = (int)((float)this.field_15047 * 256.0F / 10.0F);
         if (var9 > 255) {
            var9 = 255;
         }

         if (var9 > 0) {
            class_3542.method_16438();
            class_3542.method_16488();
            class_3542.method_16437();
            method_9774(var1, var7 - 2, var8 - 2, var7 + var6 + 2, var8 + 9 + 2, this.field_15040.field_9577.method_40881(0));
            TextRenderer var10 = null;
            if (class_7860.field_40211.method_3596()) {
               var10 = (TextRenderer)class_7860.method_35555(this.field_15039.method_27960(), class_7860.field_40211, this.field_15039);
            }

            if (var10 == null) {
               this.method_13975().method_45392(var1, (ITextComponent)var5, (float)var7, (float)var8, 16777215 + (var9 << 24));
            } else {
               var6 = (this.field_15028 - var10.method_45379((ITextProperties)var5)) / 2;
               var10.method_45382(var1, ((ITextComponent)var5).func_241878_f(), (float)var7, (float)var8, 16777215 + (var9 << 24));
            }

            class_3542.method_16448();
            class_3542.method_16489();
         }
      }

      this.field_15040.method_8562().method_16054();
   }

   public void method_13971(class_7966 var1) {
      this.field_15040.method_8562().method_16056("demo");
      Object var4;
      if (this.field_15040.field_9601.method_29546() < 120500L) {
         var4 = new TranslationTextComponent("demo.remainingTime", class_6660.method_30575((int)(120500L - this.field_15040.field_9601.method_29546())));
      } else {
         var4 = field_15033;
      }

      int var5 = this.method_13975().method_45379((ITextProperties)var4);
      this.method_13975().method_45392(var1, (ITextComponent)var4, (float)(this.field_15028 - var5 - 10), 5.0F, 16777215);
      this.field_15040.method_8562().method_16054();
   }

   private void method_13977(class_7966 var1, class_4399 var2) {
      class_1097 var5 = var2.method_20486();
      Collection var6 = var5.method_4863(var2);
      List var7 = var6.stream().filter(var0 -> var0.method_38147() != null && !var0.method_38147().startsWith("#")).collect(Collectors.toList());
      if (var7.size() <= 15) {
         var6 = var7;
      } else {
         var6 = Lists.newArrayList(Iterables.skip(var7, var6.size() - 15));
      }

      ArrayList var8 = Lists.newArrayListWithCapacity(var6.size());
      ITextComponent var9 = var2.method_20488();
      int var10 = this.method_13975().method_45379(var9);
      int var11 = var10;
      int var12 = this.method_13975().method_45395(": ");

      for (class_8274 var14 : var6) {
         class_3903 var15 = var5.method_4848(var14.method_38147());
         IFormattableTextComponent var16 = class_3903.method_18063(var15, new StringTextComponent(var14.method_38147()));
         var8.add(Pair.of(var14, var16));
         var11 = Math.max(var11, this.method_13975().method_45379(var16) + var12 + this.method_13975().method_45395(Integer.toString(var14.method_38146())));
      }

      int var28 = var6.size() * 9;
      int var29 = this.field_15049 / 2 + var28 / 3;
      byte var30 = 3;
      int var31 = this.field_15028 - var11 - 3;
      int var17 = 0;
      int var18 = this.field_15040.field_9577.method_40888(0.3F);
      int var19 = this.field_15040.field_9577.method_40888(0.4F);

      for (Pair var21 : var8) {
         var17++;
         class_8274 var22 = (class_8274)var21.getFirst();
         ITextComponent var23 = (ITextComponent)var21.getSecond();
         String var24 = TextFormatting.RED + "" + var22.method_38146();
         int var25 = var29 - var17 * 9;
         int var26 = this.field_15028 - 3 + 2;
         method_9774(var1, var31 - 2, var25, var26, var25 + 9, var18);
         this.method_13975().method_45378(var1, var23, (float)var31, (float)var25, -1);
         this.method_13975().method_45385(var1, var24, (float)(var26 - this.method_13975().method_45395(var24)), (float)var25, -1);
         if (var17 == var6.size()) {
            method_9774(var1, var31 - 2, var25 - 9 - 1, var26, var25 - 1, var19);
            method_9774(var1, var31 - 2, var25 - 1, var26, var25, var18);
            this.method_13975().method_45378(var1, var9, (float)(var31 + var11 / 2 - var10 / 2), (float)(var25 - 9), -1);
         }
      }
   }

   private class_704 method_13976() {
      return this.field_15040.method_8516() instanceof class_704 ? (class_704)this.field_15040.method_8516() : null;
   }

   private class_5834 method_13981() {
      class_704 var3 = this.method_13976();
      if (var3 != null) {
         class_8145 var4 = var3.method_37243();
         if (var4 == null) {
            return null;
         }

         if (var4 instanceof class_5834) {
            return (class_5834)var4;
         }
      }

      return null;
   }

   private int method_13980(class_5834 var1) {
      if (var1 != null && var1.method_37359()) {
         float var4 = var1.method_26465();
         int var5 = (int)(var4 + 0.5F) / 2;
         if (var5 > 30) {
            var5 = 30;
         }

         return var5;
      } else {
         return 0;
      }
   }

   private int method_13970(int var1) {
      return (int)Math.ceil((double)var1 / 10.0);
   }

   private void method_13994(class_7966 var1) {
      class_704 var4 = this.method_13976();
      if (var4 != null) {
         int var5 = class_9299.method_42816(var4.method_26551());
         boolean var6 = this.field_15046 > (long)this.field_15042 && (this.field_15046 - (long)this.field_15042) / 3L % 2L == 1L;
         long var7 = class_9665.method_44650();
         if (var5 < this.field_15035 && var4.field_41749 > 0) {
            this.field_15041 = var7;
            this.field_15046 = (long)(this.field_15042 + 20);
         } else if (var5 > this.field_15035 && var4.field_41749 > 0) {
            this.field_15041 = var7;
            this.field_15046 = (long)(this.field_15042 + 10);
         }

         if (var7 - this.field_15041 > 1000L) {
            this.field_15035 = var5;
            this.field_15037 = var5;
            this.field_15041 = var7;
         }

         this.field_15035 = var5;
         int var9 = this.field_15037;
         this.field_15058.setSeed((long)(this.field_15042 * 312871));
         class_9163 var10 = var4.method_3161();
         int var11 = var10.method_42238();
         int var12 = this.field_15028 / 2 - 91;
         int var13 = this.field_15028 / 2 + 91;
         int var14 = this.field_15049 - 39;
         float var15 = (float)var4.method_26575(class_7331.field_37468);
         int var16 = class_9299.method_42816(var4.method_26493());
         int var17 = class_9299.method_42816((var15 + (float)var16) / 2.0F / 10.0F);
         int var18 = Math.max(10 - (var17 - 2), 3);
         int var19 = var14 - (var17 - 1) * var18 - 10;
         int var20 = var14 - 10;
         int var21 = var16;
         int var22 = var4.method_26565();
         int var23 = -1;
         if (var4.method_26480(class_4054.field_19742)) {
            var23 = this.field_15042 % class_9299.method_42816(var15 + 5.0F);
         }

         this.field_15040.method_8562().method_16056("armor");

         for (int var24 = 0; var24 < 10; var24++) {
            if (var22 > 0) {
               int var25 = var12 + var24 * 8;
               if (var24 * 2 + 1 < var22) {
                  this.method_9781(var1, var25, var19, 34, 9, 9, 9);
               }

               if (var24 * 2 + 1 == var22) {
                  this.method_9781(var1, var25, var19, 25, 9, 9, 9);
               }

               if (var24 * 2 + 1 > var22) {
                  this.method_9781(var1, var25, var19, 16, 9, 9, 9);
               }
            }
         }

         this.field_15040.method_8562().method_16050("health");

         for (int var33 = class_9299.method_42816((var15 + (float)var16) / 2.0F) - 1; var33 >= 0; var33--) {
            byte var35 = 16;
            if (!var4.method_26480(class_4054.field_19718)) {
               if (var4.method_26480(class_4054.field_19725)) {
                  var35 += 72;
               }
            } else {
               var35 += 36;
            }

            byte var26 = 0;
            if (var6) {
               var26 = 1;
            }

            int var27 = class_9299.method_42816((float)(var33 + 1) / 10.0F) - 1;
            int var28 = var12 + var33 % 10 * 8;
            int var29 = var14 - var27 * var18;
            if (var5 <= 4) {
               var29 += this.field_15058.nextInt(2);
            }

            if (var21 <= 0 && var33 == var23) {
               var29 -= 2;
            }

            byte var30 = 0;
            if (var4.field_41768.method_43366().method_8659()) {
               var30 = 5;
            }

            this.method_9781(var1, var28, var29, 16 + var26 * 9, 9 * var30, 9, 9);
            if (var6) {
               if (var33 * 2 + 1 < var9) {
                  this.method_9781(var1, var28, var29, var35 + 54, 9 * var30, 9, 9);
               }

               if (var33 * 2 + 1 == var9) {
                  this.method_9781(var1, var28, var29, var35 + 63, 9 * var30, 9, 9);
               }
            }

            if (var21 <= 0) {
               if (var33 * 2 + 1 < var5) {
                  this.method_9781(var1, var28, var29, var35 + 36, 9 * var30, 9, 9);
               }

               if (var33 * 2 + 1 == var5) {
                  this.method_9781(var1, var28, var29, var35 + 45, 9 * var30, 9, 9);
               }
            } else if (var21 == var16 && var16 % 2 == 1) {
               this.method_9781(var1, var28, var29, var35 + 153, 9 * var30, 9, 9);
               var21--;
            } else {
               this.method_9781(var1, var28, var29, var35 + 144, 9 * var30, 9, 9);
               var21 -= 2;
            }
         }

         class_5834 var34 = this.method_13981();
         int var36 = this.method_13980(var34);
         if (var36 == 0) {
            this.field_15040.method_8562().method_16050("food");

            for (int var37 = 0; var37 < 10; var37++) {
               int var39 = var14;
               byte var41 = 16;
               byte var43 = 0;
               if (var4.method_26480(class_4054.field_19747)) {
                  var41 += 36;
                  var43 = 13;
               }

               if (var4.method_3161().method_42237() <= 0.0F && this.field_15042 % (var11 * 3 + 1) == 0) {
                  var39 = var14 + (this.field_15058.nextInt(3) - 1);
               }

               int var45 = var13 - var37 * 8 - 9;
               this.method_9781(var1, var45, var39, 16 + var43 * 9, 27, 9, 9);
               if (var37 * 2 + 1 < var11) {
                  this.method_9781(var1, var45, var39, var41 + 36, 27, 9, 9);
               }

               if (var37 * 2 + 1 == var11) {
                  this.method_9781(var1, var45, var39, var41 + 45, 27, 9, 9);
               }
            }

            var20 -= 10;
         }

         this.field_15040.method_8562().method_16050("air");
         int var38 = var4.method_37099();
         int var40 = Math.min(var4.method_37229(), var38);
         if (var4.method_37261(class_6503.field_33094) || var40 < var38) {
            int var42 = this.method_13970(var36) - 1;
            var20 -= var42 * 10;
            int var44 = class_9299.method_42815((double)(var40 - 2) * 10.0 / (double)var38);
            int var46 = class_9299.method_42815((double)var40 * 10.0 / (double)var38) - var44;

            for (int var31 = 0; var31 < var44 + var46; var31++) {
               if (var31 >= var44) {
                  this.method_9781(var1, var13 - var31 * 8 - 9, var20, 25, 18, 9, 9);
               } else {
                  this.method_9781(var1, var13 - var31 * 8 - 9, var20, 16, 18, 9, 9);
               }
            }
         }

         this.field_15040.method_8562().method_16054();
      }
   }

   private void method_14000(class_7966 var1) {
      class_5834 var4 = this.method_13981();
      if (var4 != null) {
         int var5 = this.method_13980(var4);
         if (var5 != 0) {
            int var6 = (int)Math.ceil((double)var4.method_26551());
            this.field_15040.method_8562().method_16050("mountHealth");
            int var7 = this.field_15049 - 39;
            int var8 = this.field_15028 / 2 + 91;
            int var9 = var7;
            byte var10 = 0;

            for (boolean var11 = false; var5 > 0; var10 += 20) {
               int var12 = Math.min(var5, 10);
               var5 -= var12;

               for (int var13 = 0; var13 < var12; var13++) {
                  byte var14 = 52;
                  byte var15 = 0;
                  int var16 = var8 - var13 * 8 - 9;
                  this.method_9781(var1, var16, var9, 52 + var15 * 9, 9, 9, 9);
                  if (var13 * 2 + 1 + var10 < var6) {
                     this.method_9781(var1, var16, var9, 88, 9, 9, 9);
                  }

                  if (var13 * 2 + 1 + var10 == var6) {
                     this.method_9781(var1, var16, var9, 97, 9, 9, 9);
                  }
               }

               var9 -= 10;
            }
         }
      }
   }

   private void method_13979() {
      class_3542.method_16491();
      class_3542.method_16387(false);
      class_3542.method_16437();
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      class_3542.method_16458();
      this.field_15040.method_8577().method_35674(field_15038);
      class_8042 var3 = class_8042.method_36499();
      class_9633 var4 = var3.method_36501();
      var4.method_44471(7, class_7985.field_40912);
      var4.method_35761(0.0, (double)this.field_15049, -90.0).method_35745(0.0F, 1.0F).method_35735();
      var4.method_35761((double)this.field_15028, (double)this.field_15049, -90.0).method_35745(1.0F, 1.0F).method_35735();
      var4.method_35761((double)this.field_15028, 0.0, -90.0).method_35745(1.0F, 0.0F).method_35735();
      var4.method_35761(0.0, 0.0, -90.0).method_35745(0.0F, 0.0F).method_35735();
      var3.method_36500();
      class_3542.method_16387(true);
      class_3542.method_16428();
      class_3542.method_16374();
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void method_14006(class_8145 var1) {
      if (var1 != null) {
         float var4 = class_9299.method_42828(1.0F - var1.method_37193(), 0.0F, 1.0F);
         this.field_15036 = (float)((double)this.field_15036 + (double)(var4 - this.field_15036) * 0.01);
      }
   }

   private void method_13996(class_8145 var1) {
      if (class_3111.method_14292()) {
         class_2098 var4 = this.field_15040.field_9601.method_6673();
         float var5 = (float)var4.method_9809(var1);
         double var6 = Math.min(var4.method_9806() * (double)var4.method_9812() * 1000.0, Math.abs(var4.method_9817() - var4.method_9824()));
         double var8 = Math.max((double)var4.method_9819(), var6);
         if (!((double)var5 < var8)) {
            var5 = 0.0F;
         } else {
            var5 = 1.0F - (float)((double)var5 / var8);
         }

         class_3542.method_16491();
         class_3542.method_16387(false);
         class_3542.method_16425(class_5033.field_26048, class_8535.field_43686, class_5033.field_26047, class_8535.field_43699);
         if (!(var5 > 0.0F)) {
            class_3542.method_16480(this.field_15036, this.field_15036, this.field_15036, 1.0F);
         } else {
            class_3542.method_16480(0.0F, var5, var5, 1.0F);
         }

         this.field_15040.method_8577().method_35674(field_15059);
         class_8042 var10 = class_8042.method_36499();
         class_9633 var11 = var10.method_36501();
         var11.method_44471(7, class_7985.field_40912);
         var11.method_35761(0.0, (double)this.field_15049, -90.0).method_35745(0.0F, 1.0F).method_35735();
         var11.method_35761((double)this.field_15028, (double)this.field_15049, -90.0).method_35745(1.0F, 1.0F).method_35735();
         var11.method_35761((double)this.field_15028, 0.0, -90.0).method_35745(1.0F, 0.0F).method_35735();
         var11.method_35761(0.0, 0.0, -90.0).method_35745(0.0F, 0.0F).method_35735();
         var10.method_36500();
         class_3542.method_16387(true);
         class_3542.method_16428();
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         class_3542.method_16437();
      } else {
         class_3542.method_16428();
         class_3542.method_16425(class_5033.field_26042, class_8535.field_43697, class_5033.field_26047, class_8535.field_43699);
      }
   }

   private void method_13973(float var1) {
      if (var1 < 1.0F) {
         var1 *= var1;
         var1 *= var1;
         var1 = var1 * 0.8F + 0.2F;
      }

      class_3542.method_16458();
      class_3542.method_16491();
      class_3542.method_16387(false);
      class_3542.method_16437();
      class_3542.method_16480(1.0F, 1.0F, 1.0F, var1);
      this.field_15040.method_8577().method_35674(class_8359.field_42824);
      class_5155 var4 = this.field_15040.method_8505().method_3716().method_43938(class_4783.field_23588.method_29260());
      float var5 = var4.method_23630();
      float var6 = var4.method_23642();
      float var7 = var4.method_23619();
      float var8 = var4.method_23640();
      class_8042 var9 = class_8042.method_36499();
      class_9633 var10 = var9.method_36501();
      var10.method_44471(7, class_7985.field_40912);
      var10.method_35761(0.0, (double)this.field_15049, -90.0).method_35745(var5, var8).method_35735();
      var10.method_35761((double)this.field_15028, (double)this.field_15049, -90.0).method_35745(var7, var8).method_35735();
      var10.method_35761((double)this.field_15028, 0.0, -90.0).method_35745(var7, var6).method_35735();
      var10.method_35761(0.0, 0.0, -90.0).method_35745(var5, var6).method_35735();
      var9.method_36500();
      class_3542.method_16387(true);
      class_3542.method_16428();
      class_3542.method_16374();
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void method_13984(int var1, int var2, float var3, class_704 var4, class_6098 var5) {
      if (!var5.method_28022()) {
         float var8 = (float)var5.method_27975() - var3;
         if (var8 > 0.0F) {
            class_3542.method_16438();
            float var9 = 1.0F + var8 / 5.0F;
            class_3542.method_16413((float)(var1 + 8), (float)(var2 + 12), 0.0F);
            class_3542.method_16403(1.0F / var9, (var9 + 1.0F) / 2.0F, 1.0F);
            class_3542.method_16413((float)(-(var1 + 8)), (float)(-(var2 + 12)), 0.0F);
         }

         this.field_15030.method_40273(var4, var5, var1, var2);
         if (var8 > 0.0F) {
            class_3542.method_16489();
         }

         this.field_15030.method_40281(this.field_15040.textRenderer, var5, var1, var2);
      }
   }

   public void method_13990() {
      if (this.field_15040.field_9601 == null) {
         class_4454.method_20652();
      }

      if (this.field_15051 > 0) {
         this.field_15051--;
      }

      if (this.field_15029 > 0) {
         this.field_15029--;
         if (this.field_15029 <= 0) {
            this.field_15050 = null;
            this.field_15043 = null;
         }
      }

      this.field_15042++;
      class_8145 var3 = this.field_15040.method_8516();
      if (var3 != null) {
         this.method_14006(var3);
      }

      if (this.field_15040.field_9632 != null) {
         class_6098 var4 = this.field_15040.field_9632.field_3853.method_32403();
         boolean var5 = true;
         if (class_7860.field_40201.method_3596()) {
            ITextComponent var6 = (ITextComponent)class_7860.method_35555(var4, class_7860.field_40201, var4.method_28008());
            ITextComponent var7 = (ITextComponent)class_7860.method_35555(this.field_15039, class_7860.field_40201, this.field_15039.method_28008());
            var5 = class_3111.equals(var6, var7);
         }

         if (!var4.method_28022()) {
            if (this.field_15039.method_28022()
               || var4.method_27960() != this.field_15039.method_27960()
               || !var4.method_28008().equals(this.field_15039.method_28008())
               || !var5) {
               this.field_15047 = 40;
            } else if (this.field_15047 > 0) {
               this.field_15047--;
            }
         } else {
            this.field_15047 = 0;
         }

         this.field_15039 = var4;
      }
   }

   public void method_13974(ITextComponent var1) {
      this.method_13982(new TranslationTextComponent("record.nowPlaying", var1), true);
   }

   public void method_13982(ITextComponent var1, boolean var2) {
      this.field_15031 = var1;
      this.field_15051 = 60;
      this.field_15034 = var2;
   }

   public void method_14002(ITextComponent var1, ITextComponent var2, int var3, int var4, int var5) {
      if (var1 == null && var2 == null && var3 < 0 && var4 < 0 && var5 < 0) {
         this.field_15050 = null;
         this.field_15043 = null;
         this.field_15029 = 0;
      } else if (var1 == null) {
         if (var2 == null) {
            if (var3 >= 0) {
               this.field_15055 = var3;
            }

            if (var4 >= 0) {
               this.field_15057 = var4;
            }

            if (var5 >= 0) {
               this.field_15052 = var5;
            }

            if (this.field_15029 > 0) {
               this.field_15029 = this.field_15055 + this.field_15057 + this.field_15052;
            }
         } else {
            this.field_15043 = var2;
         }
      } else {
         this.field_15050 = var1;
         this.field_15029 = this.field_15055 + this.field_15057 + this.field_15052;
      }
   }

   public UUID method_13986(ITextComponent var1) {
      String var4 = TextProcessing.func_244782_a(var1);
      String var5 = StringUtils.substringBetween(var4, "<", ">");
      return var5 != null ? this.field_15040.method_8586().method_42342(var5) : class_9665.field_49232;
   }

   public void method_13992(ChatType var1, ITextComponent var2, UUID var3) {
      if (!this.field_15040.method_8526(var3) && (!this.field_15040.field_9577.field_45405 || !this.field_15040.method_8526(this.method_13986(var2)))) {
         for (class_9720 var7 : this.field_15048.get(var1)) {
            var7.method_44914(var1, var2, var3);
         }
      }
   }

   public class_4049 method_13991() {
      return this.field_15054;
   }

   public int method_13995() {
      return this.field_15042;
   }

   public TextRenderer method_13975() {
      return this.field_15040.textRenderer;
   }

   public class_8368 method_14004() {
      return this.field_15032;
   }

   public class_2130 method_13985() {
      return this.field_15053;
   }

   public void method_13988() {
      this.field_15053.method_9937();
      this.field_15044.method_21873();
      this.field_15040.method_8519().method_42332();
   }

   public class_4736 method_13972() {
      return this.field_15044;
   }

   public void method_13978() {
      this.field_15026.method_17995();
   }
}
