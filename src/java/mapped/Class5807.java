package mapped;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import net.minecraft.client.AbstractOption;
import net.minecraft.client.GameSettings;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.util.text.ITextComponent;

public class Class5807 extends AbstractOption {
   public final float field25449;
   public final double field25450;
   public double field25451;
   public Function<GameSettings, Double> field25452;
   public BiConsumer<GameSettings, Double> field25453;
   public BiFunction<GameSettings, Class5807, ITextComponent> field25454;

   public Class5807(
      String var1,
      double var2,
      double var4,
      float var6,
      Function<GameSettings, Double> var7,
      BiConsumer<GameSettings, Double> var8,
      BiFunction<GameSettings, Class5807, ITextComponent> var9
   ) {
      super(var1);
      this.field25450 = var2;
      this.field25451 = var4;
      this.field25449 = var6;
      this.field25452 = var7;
      this.field25453 = var8;
      this.field25454 = var9;
   }

   @Override
   public Widget createWidget(GameSettings var1, int var2, int var3, int var4) {
      return new Class1232(var1, var2, var3, var4, 20, this);
   }

   public double method18083(double var1) {
      return MathHelper.clamp((this.method18085(var1) - this.field25450) / (this.field25451 - this.field25450), 0.0, 1.0);
   }

   public double method18084(double var1) {
      return this.method18085(MathHelper.lerp(MathHelper.clamp(var1, 0.0, 1.0), this.field25450, this.field25451));
   }

   private double method18085(double var1) {
      if (this.field25449 > 0.0F) {
         var1 = (double)(this.field25449 * (float)Math.round(var1 / (double)this.field25449));
      }

      return MathHelper.clamp(var1, this.field25450, this.field25451);
   }

   public double method18086() {
      return this.field25450;
   }

   public double getMaxValue() {
      return this.field25451;
   }

   public void method18088(float var1) {
      this.field25451 = (double)var1;
   }

   public void method18089(GameSettings var1, double var2) {
      this.field25453.accept(var1, var2);
   }

   public double method18090(GameSettings var1) {
      return this.field25452.apply(var1);
   }

   public ITextComponent method18091(GameSettings var1) {
      return this.field25454.apply(var1, this);
   }
}
