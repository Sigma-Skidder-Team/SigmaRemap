package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.Random;

public class Class971 extends Class939 {
   private static final Random field5435 = new Random();
   private Class25<Class8848> field5436 = Class25.<Class8848>method68(9, Class8848.field39973);

   public Class971(Class4387<?> var1) {
      super(var1);
   }

   public Class971() {
      this(Class4387.field21426);
   }

   @Override
   public int method3629() {
      return 9;
   }

   public int method4022() {
      this.method3743((PlayerEntity)null);
      int var3 = -1;
      int var4 = 1;

      for (int var5 = 0; var5 < this.field5436.size(); var5++) {
         if (!this.field5436.get(var5).method32105() && field5435.nextInt(var4++) == 0) {
            var3 = var5;
         }
      }

      return var3;
   }

   public int method4023(Class8848 var1) {
      for (int var4 = 0; var4 < this.field5436.size(); var4++) {
         if (this.field5436.get(var4).method32105()) {
            this.method3621(var4, var1);
            return var4;
         }
      }

      return -1;
   }

   @Override
   public ITextComponent method3686() {
      return new TranslationTextComponent("container.dispenser");
   }

   @Override
   public void method3645(Class7380 var1, Class39 var2) {
      super.method3645(var1, var2);
      this.field5436 = Class25.<Class8848>method68(this.method3629(), Class8848.field39973);
      if (!this.method3741(var2)) {
         Class7920.method26567(var2, this.field5436);
      }
   }

   @Override
   public Class39 method3646(Class39 var1) {
      super.method3646(var1);
      if (!this.method3742(var1)) {
         Class7920.method26565(var1, this.field5436);
      }

      return var1;
   }

   @Override
   public Class25<Class8848> method3724() {
      return this.field5436;
   }

   @Override
   public void method3725(Class25<Class8848> var1) {
      this.field5436 = var1;
   }

   @Override
   public Class5812 method3690(int var1, Class974 var2) {
      return new Class5817(var1, var2, this);
   }
}
