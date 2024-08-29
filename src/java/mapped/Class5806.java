package mapped;

import java.util.function.BiConsumer;
import java.util.function.Predicate;
import net.minecraft.util.text.ITextComponent;

public class Class5806 extends AbstractOption {
   private final Predicate<GameSettings> field25446;
   private final BiConsumer<GameSettings, Boolean> field25447;
   private final ITextComponent field25448;

   public Class5806(String var1, Predicate<GameSettings> var2, BiConsumer<GameSettings, Boolean> var3) {
      this(var1, (ITextComponent)null, var2, var3);
   }

   public Class5806(String var1, ITextComponent var2, Predicate<GameSettings> var3, BiConsumer<GameSettings, Boolean> var4) {
      super(var1);
      this.field25446 = var3;
      this.field25447 = var4;
      this.field25448 = var2;
   }

   public void method18077(GameSettings var1, String var2) {
      this.method18079(var1, "true".equals(var2));
   }

   public void method18078(GameSettings var1) {
      this.method18079(var1, !this.method18080(var1));
      var1.saveOptions();
   }

   private void method18079(GameSettings var1, boolean var2) {
      this.field25447.accept(var1, var2);
   }

   public boolean method18080(GameSettings var1) {
      return this.field25446.test(var1);
   }

   @Override
   public Class1197 method17946(GameSettings var1, int var2, int var3, int var4) {
      if (this.field25448 != null) {
         this.method17950(Minecraft.getInstance().fontRenderer.method38828(this.field25448, 200));
      }

      return new Class1228(var2, var3, var4, 20, this, this.method18081(var1), var2x -> {
         this.method18078(var1);
         var2x.method5743(this.method18081(var1));
      });
   }

   public ITextComponent method18081(GameSettings var1) {
      return DialogTexts.method22238(this.method17949(), this.method18080(var1));
   }
}
