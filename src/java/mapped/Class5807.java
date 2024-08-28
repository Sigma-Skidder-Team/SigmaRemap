package mapped;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import net.minecraft.util.text.ITextComponent;

public class Class5807 extends Class5805 {
   public final float field25449;
   public final double field25450;
   public double field25451;
   public Function<Class9574, Double> field25452;
   public BiConsumer<Class9574, Double> field25453;
   public BiFunction<Class9574, Class5807, ITextComponent> field25454;

   public Class5807(
      String var1,
      double var2,
      double var4,
      float var6,
      Function<Class9574, Double> var7,
      BiConsumer<Class9574, Double> var8,
      BiFunction<Class9574, Class5807, ITextComponent> var9
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
   public Class1197 method17946(Class9574 var1, int var2, int var3, int var4) {
      return new Class1232(var1, var2, var3, var4, 20, this);
   }

   public double method18083(double var1) {
      return MathHelper.method37778((this.method18085(var1) - this.field25450) / (this.field25451 - this.field25450), 0.0, 1.0);
   }

   public double method18084(double var1) {
      return this.method18085(MathHelper.method37822(MathHelper.method37778(var1, 0.0, 1.0), this.field25450, this.field25451));
   }

   private double method18085(double var1) {
      if (this.field25449 > 0.0F) {
         var1 = (double)(this.field25449 * (float)Math.round(var1 / (double)this.field25449));
      }

      return MathHelper.method37778(var1, this.field25450, this.field25451);
   }

   public double method18086() {
      return this.field25450;
   }

   public double method18087() {
      return this.field25451;
   }

   public void method18088(float var1) {
      this.field25451 = (double)var1;
   }

   public void method18089(Class9574 var1, double var2) {
      this.field25453.accept(var1, var2);
   }

   public double method18090(Class9574 var1) {
      return this.field25452.apply(var1);
   }

   public ITextComponent method18091(Class9574 var1) {
      return this.field25454.apply(var1, this);
   }
}
