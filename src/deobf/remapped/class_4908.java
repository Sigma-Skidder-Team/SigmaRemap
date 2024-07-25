package remapped;

import java.text.DateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_4908 extends class_1094 {
   private static final Logger field_25400 = LogManager.getLogger();
   private static final Identifier field_25406 = new Identifier("realms", "textures/gui/realms/plus_icon.png");
   private static final Identifier field_25395 = new Identifier("realms", "textures/gui/realms/restore_icon.png");
   private static final ITextComponent field_25398 = new TranslationTextComponent(field_25392[2]);
   private static final ITextComponent field_25409 = new TranslationTextComponent(field_25392[3]);
   private static final ITextComponent field_25405 = new TranslationTextComponent(field_25392[4]);
   private static final ITextComponent field_25396 = new TranslationTextComponent("mco.backup.nobackups");
   private static int field_25393 = -1;
   private final class_2866 field_25410;
   private List<class_8960> field_25404 = Collections.<class_8960>emptyList();
   private ITextComponent field_25408;
   private class_2813 field_25397;
   private int field_25412 = -1;
   private final int field_25407;
   private class_9521 field_25403;
   private class_9521 field_25411;
   private class_9521 field_25394;
   private Boolean field_25401 = false;
   private final class_7675 field_25399;
   private class_8949 field_25402;

   public class_4908(class_2866 var1, class_7675 var2, int var3) {
      this.field_25410 = var1;
      this.field_25399 = var2;
      this.field_25407 = var3;
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      this.field_25397 = new class_2813(this);
      if (field_25393 != -1) {
         this.field_25397.method_36222((double)field_25393);
      }

      new class_3302(this, "Realms-fetch-backups").start();
      this.field_25403 = this.<class_9521>method_1186(
         new class_9521(this.field_941 - 135, method_4819(1), 120, 20, new TranslationTextComponent("mco.backup.button.download"), var1 -> this.method_22467())
      );
      this.field_25411 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 - 135,
            method_4819(3),
            120,
            20,
            new TranslationTextComponent("mco.backup.button.restore"),
            var1 -> this.method_22466(this.field_25412)
         )
      );
      this.field_25394 = this.<class_9521>method_1186(
         new class_9521(this.field_941 - 135, method_4819(5), 120, 20, new TranslationTextComponent("mco.backup.changes.tooltip"), var1 -> {
            this.field_943.method_8609(new class_6420(this, this.field_25404.get(this.field_25412)));
            this.field_25412 = -1;
         })
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 - 100, this.field_940 - 35, 85, 20, class_1402.field_7632, var1 -> this.field_943.method_8609(this.field_25410))
      );
      this.<class_2813>method_1159(this.field_25397);
      this.field_25402 = this.<class_8949>method_1159(
         new class_8949(new TranslationTextComponent("mco.configure.world.backup"), this.field_941 / 2, 12, 16777215)
      );
      this.method_41184(this.field_25397);
      this.method_22480();
      this.method_4820();
   }

   private void method_22465() {
      if (this.field_25404.size() > 1) {
         for (int var3 = 0; var3 < this.field_25404.size() - 1; var3++) {
            class_8960 var4 = this.field_25404.get(var3);
            class_8960 var5 = this.field_25404.get(var3 + 1);
            if (!var4.field_45898.isEmpty() && !var5.field_45898.isEmpty()) {
               for (String var7 : var4.field_45898.keySet()) {
                  if (!var7.contains("Uploaded") && var5.field_45898.containsKey(var7)) {
                     if (!var4.field_45898.get(var7).equals(var5.field_45898.get(var7))) {
                        this.method_22478(var4, var7);
                     }
                  } else {
                     this.method_22478(var4, var7);
                  }
               }
            }
         }
      }
   }

   private void method_22478(class_8960 var1, String var2) {
      if (!var2.contains("Uploaded")) {
         var1.field_45903.put(var2, var1.field_45898.get(var2));
      } else {
         String var5 = DateFormat.getDateTimeInstance(3, 3).format(var1.field_45899);
         var1.field_45903.put(var2, var5);
         var1.method_41114(true);
      }
   }

   private void method_22480() {
      this.field_25411.field_36677 = this.method_22473();
      this.field_25394.field_36677 = this.method_22469();
   }

   private boolean method_22469() {
      return this.field_25412 != -1 ? !this.field_25404.get(this.field_25412).field_45903.isEmpty() : false;
   }

   private boolean method_22473() {
      return this.field_25412 != -1 ? !this.field_25399.field_39020 : false;
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method_26946(var1, var2, var3);
      } else {
         this.field_943.method_8609(this.field_25410);
         return true;
      }
   }

   private void method_22466(int var1) {
      if (var1 >= 0 && var1 < this.field_25404.size() && !this.field_25399.field_39020) {
         this.field_25412 = var1;
         Date var4 = this.field_25404.get(var1).field_45899;
         String var5 = DateFormat.getDateTimeInstance(3, 3).format(var4);
         String var6 = class_9539.method_43981(var4);
         TranslationTextComponent var7 = new TranslationTextComponent("mco.configure.world.restore.question.line1", var5, var6);
         TranslationTextComponent var8 = new TranslationTextComponent("mco.configure.world.restore.question.line2");
         this.field_943.method_8609(new class_2238(var1x -> {
            if (!var1x) {
               this.field_25412 = -1;
               this.field_943.method_8609(this);
            } else {
               this.method_22483();
            }
         }, class_1542.field_8153, var7, var8, true));
      }
   }

   private void method_22467() {
      TranslationTextComponent var3 = new TranslationTextComponent("mco.configure.world.restore.download.question.line1");
      TranslationTextComponent var4 = new TranslationTextComponent("mco.configure.world.restore.download.question.line2");
      this.field_943.method_8609(new class_2238(var1 -> {
         if (!var1) {
            this.field_943.method_8609(this);
         } else {
            this.method_22495();
         }
      }, class_1542.field_8150, var3, var4, true));
   }

   private void method_22495() {
      this.field_943
         .method_8609(
            new class_1065(
               this.field_25410.method_13136(),
               new class_5495(
                  this.field_25399.field_39016,
                  this.field_25407,
                  this.field_25399.field_39012
                     + " ("
                     + this.field_25399.field_39013.get(this.field_25399.field_39007).method_31027(this.field_25399.field_39007)
                     + ")",
                  this
               )
            )
         );
   }

   private void method_22483() {
      class_8960 var3 = this.field_25404.get(this.field_25412);
      this.field_25412 = -1;
      this.field_943.method_8609(new class_1065(this.field_25410.method_13136(), new class_9201(var3, this.field_25399.field_39016, this.field_25410)));
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.field_25408 = null;
      this.method_1183(var1);
      this.field_25397.method_6767(var1, var2, var3, var4);
      this.field_25402.method_41093(this, var1);
      this.field_948.method_45378(var1, field_25405, (float)((this.field_941 - 150) / 2 - 90), 20.0F, 10526880);
      if (this.field_25401) {
         this.field_948.method_45378(var1, field_25396, 20.0F, (float)(this.field_940 / 2 - 10), 16777215);
      }

      this.field_25403.field_36675 = !this.field_25401;
      super.method_6767(var1, var2, var3, var4);
      if (this.field_25408 != null) {
         this.method_22481(var1, this.field_25408, var2, var3);
      }
   }

   public void method_22481(class_7966 var1, ITextComponent var2, int var3, int var4) {
      if (var2 != null) {
         int var7 = var3 + 12;
         int var8 = var4 - 12;
         int var9 = this.field_948.method_45379(var2);
         this.method_9772(var1, var7 - 3, var8 - 3, var7 + var9 + 3, var8 + 8 + 3, -1073741824, -1073741824);
         this.field_948.method_45392(var1, var2, (float)var7, (float)var8, 16777215);
      }
   }
}
