package remapped;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.IDN;
import java.util.function.Predicate;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2413 extends class_266 {
   private static final ITextComponent field_12004 = new TranslationTextComponent(field_12008[1]);
   private static final ITextComponent field_12001 = new TranslationTextComponent(field_12008[2]);
   private class_9521 field_12003;
   private final BooleanConsumer field_11999;
   private final class_2560 field_12009;
   private class_1863 field_12007;
   private class_1863 field_12005;
   private class_9521 field_12006;
   private final class_266 field_12002;
   private final Predicate<String> field_12000 = var0 -> {
      if (class_6660.method_30576(var0)) {
         return true;
      } else {
         String[] var3x = var0.split(":");
         if (var3x.length == 0) {
            return true;
         } else {
            try {
               String var4 = IDN.toASCII(var3x[0]);
               return true;
            } catch (IllegalArgumentException var5) {
               return false;
            }
         }
      }
   };

   public class_2413(class_266 var1, BooleanConsumer var2, class_2560 var3) {
      super(new TranslationTextComponent("addServer.title"));
      this.field_12002 = var1;
      this.field_11999 = var2;
      this.field_12009 = var3;
   }

   @Override
   public void method_5312() {
      this.field_12005.method_8279();
      this.field_12007.method_8279();
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      this.field_12005 = new class_1863(this.field_948, this.field_941 / 2 - 100, 66, 200, 20, new TranslationTextComponent("addServer.enterName"));
      this.field_12005.method_8273(true);
      this.field_12005.method_8281(this.field_12009.field_12670);
      this.field_12005.method_8277(this::method_10981);
      this.field_942.add(this.field_12005);
      this.field_12007 = new class_1863(this.field_948, this.field_941 / 2 - 100, 106, 200, 20, new TranslationTextComponent("addServer.enterIp"));
      this.field_12007.method_8255(128);
      this.field_12007.method_8281(this.field_12009.field_12675);
      this.field_12007.method_8254(this.field_12000);
      this.field_12007.method_8277(this::method_10981);
      this.field_942.add(this.field_12007);
      this.field_12006 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 100, this.field_940 / 4 + 72, 200, 20, method_10982(this.field_12009.method_11628()), var1 -> {
            this.field_12009.method_11624(class_6931.values()[(this.field_12009.method_11628().ordinal() + 1) % class_6931.values().length]);
            this.field_12006.method_32687(method_10982(this.field_12009.method_11628()));
         })
      );
      this.field_12003 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100, this.field_940 / 4 + 96 + 18, 200, 20, new TranslationTextComponent("addServer.add"), var1 -> this.method_10980()
         )
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 100, this.field_940 / 4 + 120 + 18, 200, 20, class_1402.field_7633, var1 -> this.field_11999.accept(false))
      );
      this.method_10983();
   }

   private static ITextComponent method_10982(class_6931 var0) {
      return new TranslationTextComponent("addServer.resourcePack").appendString(": ").append(var0.method_31697());
   }

   @Override
   public void method_1191(MinecraftClient var1, int var2, int var3) {
      String var6 = this.field_12007.method_8246();
      String var7 = this.field_12005.method_8246();
      this.method_1164(var1, var2, var3);
      this.field_12007.method_8281(var6);
      this.field_12005.method_8281(var7);
   }

   private void method_10981(String var1) {
      this.method_10983();
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
   }

   private void method_10980() {
      this.field_12009.field_12670 = this.field_12005.method_8246();
      this.field_12009.field_12675 = this.field_12007.method_8246();
      this.field_11999.accept(true);
   }

   @Override
   public void method_1156() {
      this.method_10983();
      this.field_943.method_8609(this.field_12002);
   }

   private void method_10983() {
      String var3 = this.field_12007.method_8246();
      boolean var4 = !var3.isEmpty() && var3.split(":").length > 0 && var3.indexOf(32) == -1;
      this.field_12003.field_36675 = var4 && !this.field_12005.method_8246().isEmpty();
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 17, 16777215);
      method_9771(var1, this.field_948, field_12004, this.field_941 / 2 - 100, 53, 10526880);
      method_9771(var1, this.field_948, field_12001, this.field_941 / 2 - 100, 94, 10526880);
      this.field_12005.method_6767(var1, var2, var3, var4);
      this.field_12007.method_6767(var1, var2, var3, var4);
      super.method_6767(var1, var2, var3, var4);
   }
}
