package remapped;

import com.google.common.collect.Lists;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_9656 extends class_1094 {
   private static final Logger field_49177 = LogManager.getLogger();
   private static final ITextComponent field_49185 = new TranslationTextComponent("selectWorld.world");
   private static final ITextComponent field_49174 = new TranslationTextComponent("selectWorld.conversion");
   private static final ITextComponent field_49188 = new TranslationTextComponent("mco.upload.hardcore").mergeStyle(TextFormatting.DARK_RED);
   private static final ITextComponent field_49183 = new TranslationTextComponent("selectWorld.cheats");
   private static final DateFormat field_49184 = new SimpleDateFormat();
   private final class_5824 field_49180;
   private final long field_49175;
   private final int field_49190;
   private class_9521 field_49181;
   private List<class_460> field_49187 = Lists.newArrayList();
   private int field_49189 = -1;
   private class_5118 field_49186;
   private class_8949 field_49178;
   private class_8949 field_49182;
   private class_8949 field_49176;
   private final Runnable field_49179;

   public class_9656(long var1, int var3, class_5824 var4, Runnable var5) {
      this.field_49180 = var4;
      this.field_49175 = var1;
      this.field_49190 = var3;
      this.field_49179 = var5;
   }

   private void method_44557() throws Exception {
      this.field_49187 = this.field_943.method_8591().method_44631().stream().sorted((var0, var1) -> {
         if (var0.method_2210() >= var1.method_2210()) {
            return var0.method_2210() <= var1.method_2210() ? var0.method_2203().compareTo(var1.method_2203()) : -1;
         } else {
            return 1;
         }
      }).collect(Collectors.<class_460>toList());

      for (class_460 var4 : this.field_49187) {
         this.field_49186.method_23461(var4);
      }
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      this.field_49186 = new class_5118(this);

      try {
         this.method_44557();
      } catch (Exception var4) {
         field_49177.error("Couldn't load level list", var4);
         this.field_943
            .method_8609(new class_9306(new StringTextComponent("Unable to load worlds"), ITextComponent.func_244388_a(var4.getMessage()), this.field_49180));
         return;
      }

      this.<class_5118>method_1159(this.field_49186);
      this.field_49181 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 154, this.field_940 - 32, 153, 20, new TranslationTextComponent("mco.upload.button.name"), var1 -> this.method_44567()
         )
      );
      this.field_49181.field_36675 = this.field_49189 >= 0 && this.field_49189 < this.field_49187.size();
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 6, this.field_940 - 32, 153, 20, class_1402.field_7632, var1 -> this.field_943.method_8609(this.field_49180))
      );
      this.field_49178 = this.<class_8949>method_1159(
         new class_8949(new TranslationTextComponent("mco.upload.select.world.title"), this.field_941 / 2, 13, 16777215)
      );
      this.field_49182 = this.<class_8949>method_1159(
         new class_8949(new TranslationTextComponent("mco.upload.select.world.subtitle"), this.field_941 / 2, method_4819(-1), 10526880)
      );
      if (this.field_49187.isEmpty()) {
         this.field_49176 = this.<class_8949>method_1159(
            new class_8949(new TranslationTextComponent("mco.upload.select.world.none"), this.field_941 / 2, this.field_940 / 2 - 20, 16777215)
         );
      } else {
         this.field_49176 = null;
      }

      this.method_4820();
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
   }

   private void method_44567() {
      if (this.field_49189 != -1 && !this.field_49187.get(this.field_49189).method_2197()) {
         class_460 var3 = this.field_49187.get(this.field_49189);
         this.field_943.method_8609(new class_7182(this.field_49175, this.field_49190, this.field_49180, var3, this.field_49179));
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      this.field_49186.method_6767(var1, var2, var3, var4);
      this.field_49178.method_41093(this, var1);
      this.field_49182.method_41093(this, var1);
      if (this.field_49176 != null) {
         this.field_49176.method_41093(this, var1);
      }

      super.method_6767(var1, var2, var3, var4);
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method_26946(var1, var2, var3);
      } else {
         this.field_943.method_8609(this.field_49180);
         return true;
      }
   }

   private static ITextComponent method_44559(class_460 var0) {
      return var0.method_2211().getDisplayName();
   }

   private static String method_44565(class_460 var0) {
      return field_49184.format(new Date(var0.method_2210()));
   }
}
