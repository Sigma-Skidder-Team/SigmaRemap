package remapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.DataFixer;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
import javax.annotation.Nullable;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2387 extends class_266 {
   private static final Logger field_11903 = LogManager.getLogger();
   private static final Object2IntMap<class_5621<class_6486>> field_11904 = Util.<Object2IntMap<class_5621<class_6486>>>method_44659(
      new Object2IntOpenCustomHashMap(Util.method_44698()), var0 -> {
         var0.put(class_6486.field_33048, -13408734);
         var0.put(class_6486.field_33029, -10075085);
         var0.put(class_6486.field_33038, -8943531);
         var0.defaultReturnValue(-2236963);
      }
   );
   private final BooleanConsumer field_11906;
   private final class_3160 field_11905;

   @Nullable
   public static class_2387 method_10892(MinecraftClient var0, BooleanConsumer var1, DataFixer var2, class_3676 var3, boolean var4) {
      class_7522 var7 = class_6322.method_28810();

      try (class_4266 var8 = var0.method_8572(var7, MinecraftClient::method_8582, MinecraftClient::method_8527, false, var3)) {
         class_5684 var10 = var8.method_19864();
         var3.method_17065(var7, var10);
         ImmutableSet var11 = var10.method_25703().method_13297();
         return new class_2387(var1, var2, var3, var10.method_25699(), var4, var11);
      } catch (Exception var24) {
         field_11903.warn("Failed to load datapacks, can't optimize world", var24);
         return null;
      }
   }

   private class_2387(BooleanConsumer var1, DataFixer var2, class_3676 var3, class_6292 var4, boolean var5, ImmutableSet<class_5621<class_6486>> var6) {
      super(new TranslationTextComponent("optimizeWorld.title", var4.method_28716()));
      this.field_11906 = var1;
      this.field_11905 = new class_3160(var3, var2, var6, var5);
   }

   @Override
   public void method_1163() {
      super.method_1163();
      this.<class_9521>method_1186(new class_9521(this.field_941 / 2 - 100, this.field_940 / 4 + 150, 200, 20, class_1402.field_7633, var1 -> {
         this.field_11905.method_14575();
         this.field_11906.accept(false);
      }));
   }

   @Override
   public void method_5312() {
      if (this.field_11905.method_14582()) {
         this.field_11906.accept(true);
      }
   }

   @Override
   public void method_1156() {
      this.field_11906.accept(false);
   }

   @Override
   public void method_1162() {
      this.field_11905.method_14575();
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 20, 16777215);
      int var7 = this.field_941 / 2 - 150;
      int var8 = this.field_941 / 2 + 150;
      int var9 = this.field_940 / 4 + 100;
      int var10 = var9 + 10;
      method_9788(var1, this.field_948, this.field_11905.method_14581(), this.field_941 / 2, var9 - 9 - 2, 10526880);
      if (this.field_11905.method_14576() > 0) {
         method_9774(var1, var7 - 1, var9 - 1, var8 + 1, var10 + 1, -16777216);
         method_9771(var1, this.field_948, new TranslationTextComponent("optimizeWorld.info.converted", this.field_11905.method_14580()), var7, 40, 10526880);
         method_9771(var1, this.field_948, new TranslationTextComponent("optimizeWorld.info.skipped", this.field_11905.method_14574()), var7, 52, 10526880);
         method_9771(var1, this.field_948, new TranslationTextComponent("optimizeWorld.info.total", this.field_11905.method_14576()), var7, 64, 10526880);
         int var11 = 0;
         UnmodifiableIterator var12 = this.field_11905.method_14573().iterator();

         while (var12.hasNext()) {
            class_5621 var13 = (class_5621)var12.next();
            int var14 = class_9299.method_42848(this.field_11905.method_14577(var13) * (float)(var8 - var7));
            method_9774(var1, var7 + var11, var9, var7 + var11 + var14, var10, field_11904.getInt(var13));
            var11 += var14;
         }

         int var15 = this.field_11905.method_14580() + this.field_11905.method_14574();
         method_9787(var1, this.field_948, var15 + " / " + this.field_11905.method_14576(), this.field_941 / 2, var9 + 18 + 2, 10526880);
         method_9787(
            var1,
            this.field_948,
            class_9299.method_42848(this.field_11905.method_14572() * 100.0F) + "%",
            this.field_941 / 2,
            var9 + (var10 - var9) / 2 - 4,
            10526880
         );
      }

      super.method_6767(var1, var2, var3, var4);
   }
}
