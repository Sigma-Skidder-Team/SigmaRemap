package remapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_3129 extends Screen {
   private static final Logger field_15534 = LogManager.getLogger();
   private static final Identifier field_15538 = new Identifier("textures/gui/title/minecraft.png");
   private static final Identifier field_15531 = new Identifier("textures/gui/title/edition.png");
   private static final Identifier field_15542 = new Identifier("textures/misc/vignette.png");
   private static final String field_15539 = "" + TextFormatting.WHITE + TextFormatting.OBFUSCATED + TextFormatting.GREEN + TextFormatting.AQUA;
   private final boolean field_15530;
   private final Runnable field_15541;
   private float field_15540;
   private List<class_7107> field_15535;
   private IntSet field_15532;
   private int field_15536;
   private float field_15533 = 0.5F;

   public class_3129(boolean var1, Runnable var2) {
      super(class_7542.field_38486);
      this.field_15530 = var1;
      this.field_15541 = var2;
      if (!var1) {
         this.field_15533 = 0.75F;
      }
   }

   @Override
   public void method_5312() {
      this.field_943.method_8575().method_31309();
      this.field_943.method_8590().method_16330(false);
      float var3 = (float)(this.field_15536 + this.field_940 + this.field_940 + 24) / this.field_15533;
      if (this.field_15540 > var3) {
         this.method_14490();
      }
   }

   @Override
   public void method_1156() {
      this.method_14490();
   }

   private void method_14490() {
      this.field_15541.run();
      this.field_943.method_8609((Screen)null);
   }

   @Override
   public void method_1163() {
      if (this.field_15535 == null) {
         this.field_15535 = Lists.newArrayList();
         this.field_15532 = new IntOpenHashSet();
         class_4038 var3 = null;

         try {
            short var4 = 274;
            if (this.field_15530) {
               var3 = this.field_943.method_8498().method_35458(new Identifier("texts/end.txt"));
               InputStream var5 = var3.method_18576();
               BufferedReader var6 = new BufferedReader(new InputStreamReader(var5, StandardCharsets.UTF_8));
               Random var7 = new Random(8124371L);

               String var8;
               while ((var8 = var6.readLine()) != null) {
                  var8 = var8.replaceAll("PLAYERNAME", this.field_943.method_8502().method_5366());

                  int var9;
                  while ((var9 = var8.indexOf(field_15539)) != -1) {
                     Object var10 = var8.substring(0, var9);
                     String var11 = var8.substring(var9 + field_15539.length());
                     var8 = var10 + TextFormatting.WHITE + TextFormatting.OBFUSCATED + "XXXXXXXX".substring(0, var7.nextInt(4) + 3) + var11;
                  }

                  this.field_15535.addAll(this.field_943.textRenderer.method_45391(new StringTextComponent(var8), 274));
                  this.field_15535.add(class_7107.field_36653);
               }

               var5.close();

               for (int var24 = 0; var24 < 8; var24++) {
                  this.field_15535.add(class_7107.field_36653);
               }
            }

            InputStream var17 = this.field_943.method_8498().method_35458(new Identifier("texts/credits.txt")).method_18576();
            BufferedReader var18 = new BufferedReader(new InputStreamReader(var17, StandardCharsets.UTF_8));

            String var19;
            while ((var19 = var18.readLine()) != null) {
               var19 = var19.replaceAll("PLAYERNAME", this.field_943.method_8502().method_5366());
               var19 = var19.replaceAll("\t", "    ");
               boolean var23;
               if (var19.startsWith("[C]")) {
                  var19 = var19.substring(3);
                  var23 = true;
               } else {
                  var23 = false;
               }

               for (class_7107 var26 : this.field_943.textRenderer.method_45391(new StringTextComponent(var19), 274)) {
                  if (var23) {
                     this.field_15532.add(this.field_15535.size());
                  }

                  this.field_15535.add(var26);
               }

               this.field_15535.add(class_7107.field_36653);
            }

            var17.close();
            this.field_15536 = this.field_15535.size() * 12;
         } catch (Exception var15) {
            field_15534.error("Couldn't load credits", var15);
         } finally {
            IOUtils.closeQuietly(var3);
         }
      }
   }

   private void method_14491(int var1, int var2, float var3) {
      this.field_943.method_8577().method_35674(class_2089.field_10505);
      int var6 = this.field_941;
      float var7 = -this.field_15540 * 0.5F * this.field_15533;
      float var8 = (float)this.field_940 - this.field_15540 * 0.5F * this.field_15533;
      float var9 = 0.015625F;
      float var10 = this.field_15540 * 0.02F;
      float var11 = (float)(this.field_15536 + this.field_940 + this.field_940 + 24) / this.field_15533;
      float var12 = (var11 - 20.0F - this.field_15540) * 0.005F;
      if (var12 < var10) {
         var10 = var12;
      }

      if (var10 > 1.0F) {
         var10 = 1.0F;
      }

      var10 *= var10;
      var10 = var10 * 96.0F / 255.0F;
      class_8042 var13 = class_8042.method_36499();
      class_9633 var14 = var13.method_36501();
      var14.method_44471(7, class_7985.field_40905);
      var14.method_35761(0.0, (double)this.field_940, (double)this.method_9777())
         .method_35745(0.0F, var7 * 0.015625F)
         .method_35742(var10, var10, var10, 1.0F)
         .method_35735();
      var14.method_35761((double)var6, (double)this.field_940, (double)this.method_9777())
         .method_35745((float)var6 * 0.015625F, var7 * 0.015625F)
         .method_35742(var10, var10, var10, 1.0F)
         .method_35735();
      var14.method_35761((double)var6, 0.0, (double)this.method_9777())
         .method_35745((float)var6 * 0.015625F, var8 * 0.015625F)
         .method_35742(var10, var10, var10, 1.0F)
         .method_35735();
      var14.method_35761(0.0, 0.0, (double)this.method_9777()).method_35745(0.0F, var8 * 0.015625F).method_35742(var10, var10, var10, 1.0F).method_35735();
      var13.method_36500();
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_14491(var2, var3, var4);
      short var7 = 274;
      int var8 = this.field_941 / 2 - 137;
      int var9 = this.field_940 + 50;
      this.field_15540 += var4;
      float var10 = -this.field_15540 * this.field_15533;
      class_3542.method_16438();
      class_3542.method_16413(0.0F, var10, 0.0F);
      this.field_943.method_8577().method_35674(field_15538);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      class_3542.method_16374();
      class_3542.method_16488();
      this.method_9784(var8, var9, (var2x, var3x) -> {
         this.method_9781(var1, var2x + 0, var3x, 0, 0, 155, 44);
         this.method_9781(var1, var2x + 155, var3x, 0, 45, 155, 44);
      });
      class_3542.method_16448();
      this.field_943.method_8577().method_35674(field_15531);
      method_9778(var1, var8 + 88, var9 + 37, 0.0F, 0.0F, 98, 14, 128, 16);
      class_3542.method_16458();
      int var11 = var9 + 100;

      for (int var12 = 0; var12 < this.field_15535.size(); var12++) {
         if (var12 == this.field_15535.size() - 1) {
            float var13 = (float)var11 + var10 - (float)(this.field_940 / 2 - 6);
            if (var13 < 0.0F) {
               class_3542.method_16413(0.0F, -var13, 0.0F);
            }
         }

         if ((float)var11 + var10 + 12.0F + 8.0F > 0.0F && (float)var11 + var10 < (float)this.field_940) {
            class_7107 var17 = this.field_15535.get(var12);
            if (!this.field_15532.contains(var12)) {
               this.field_948.field_49887.setSeed((long)((float)((long)var12 * 4238972211L) + this.field_15540 / 4.0F));
               this.field_948.method_45402(var1, var17, (float)var8, (float)var11, 16777215);
            } else {
               this.field_948.method_45402(var1, var17, (float)(var8 + (274 - this.field_948.method_45400(var17)) / 2), (float)var11, 16777215);
            }
         }

         var11 += 12;
      }

      class_3542.method_16489();
      this.field_943.method_8577().method_35674(field_15542);
      class_3542.method_16488();
      class_3542.method_16398(class_5033.field_26048, class_8535.field_43686);
      int var16 = this.field_941;
      int var18 = this.field_940;
      class_8042 var14 = class_8042.method_36499();
      class_9633 var15 = var14.method_36501();
      var15.method_44471(7, class_7985.field_40905);
      var15.method_35761(0.0, (double)var18, (double)this.method_9777()).method_35745(0.0F, 1.0F).method_35742(1.0F, 1.0F, 1.0F, 1.0F).method_35735();
      var15.method_35761((double)var16, (double)var18, (double)this.method_9777()).method_35745(1.0F, 1.0F).method_35742(1.0F, 1.0F, 1.0F, 1.0F).method_35735();
      var15.method_35761((double)var16, 0.0, (double)this.method_9777()).method_35745(1.0F, 0.0F).method_35742(1.0F, 1.0F, 1.0F, 1.0F).method_35735();
      var15.method_35761(0.0, 0.0, (double)this.method_9777()).method_35745(0.0F, 0.0F).method_35742(1.0F, 1.0F, 1.0F, 1.0F).method_35735();
      var14.method_36500();
      class_3542.method_16448();
      super.method_6767(var1, var2, var3, var4);
   }
}
