package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.GameType;

import java.util.Optional;

public enum Class2150 {
   field14055(new TranslationTextComponent("gameMode.creative"), "/gamemode creative", new ItemStack(Blocks.field36395)),
   field14056(new TranslationTextComponent("gameMode.survival"), "/gamemode survival", new ItemStack(Items.field37820)),
   field14057(new TranslationTextComponent("gameMode.adventure"), "/gamemode adventure", new ItemStack(Items.field38056)),
   field14058(new TranslationTextComponent("gameMode.spectator"), "/gamemode spectator", new ItemStack(Items.field37979));

   public static final Class2150[] field14059 = values();
   public final ITextComponent field14060;
   public final String field14061;
   public final ItemStack field14062;
   private static final Class2150[] field14063 = new Class2150[]{field14055, field14056, field14057, field14058};

   private Class2150(ITextComponent var3, String var4, ItemStack var5) {
      this.field14060 = var3;
      this.field14061 = var4;
      this.field14062 = var5;
   }

   private void method8855(ItemRenderer var1, int var2, int var3) {
      var1.method793(this.field14062, var2, var3);
   }

   private ITextComponent method8856() {
      return this.field14060;
   }

   private String method8857() {
      return this.field14061;
   }

   private Optional<Class2150> method8858() {
      switch (Class9243.field42531[this.ordinal()]) {
         case 1:
            return Optional.<Class2150>of(field14056);
         case 2:
            return Optional.<Class2150>of(field14057);
         case 3:
            return Optional.<Class2150>of(field14058);
         default:
            return Optional.<Class2150>of(field14055);
      }
   }

   private static Optional<Class2150> method8859(GameType var0) {
      switch (Class9243.field42532[var0.ordinal()]) {
         case 1:
            return Optional.<Class2150>of(field14058);
         case 2:
            return Optional.<Class2150>of(field14056);
         case 3:
            return Optional.<Class2150>of(field14055);
         case 4:
            return Optional.<Class2150>of(field14057);
         default:
            return Optional.<Class2150>empty();
      }
   }

   // $VF: synthetic method
   public static Optional method8860(GameType var0) {
      return method8859(var0);
   }

   // $VF: synthetic method
   public static String method8861(Class2150 var0) {
      return var0.method8857();
   }

   // $VF: synthetic method
   public static Optional method8862(Class2150 var0) {
      return var0.method8858();
   }

   // $VF: synthetic method
   public static ITextComponent method8863(Class2150 var0) {
      return var0.method8856();
   }

   // $VF: synthetic method
   public static void method8864(Class2150 var0, ItemRenderer var1, int var2, int var3) {
      var0.method8855(var1, var2, var3);
   }
}
