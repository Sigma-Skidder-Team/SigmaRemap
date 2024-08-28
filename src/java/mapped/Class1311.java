package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class1311 extends Screen {
   private static String[] field6917;
   private final Runnable field6918;
   public final ITextComponent field6919;
   private Class5991 field6920 = Class5991.field26162;
   public final ITextComponent field6921;
   private int field6922;

   public Class1311(Runnable var1, ITextComponent var2, ITextComponent var3) {
      this(var1, var2, var3, Class7127.field30663);
   }

   public Class1311(Runnable var1, ITextComponent var2, ITextComponent var3, ITextComponent var4) {
      super(var2);
      this.field6918 = var1;
      this.field6919 = var3;
      this.field6921 = var4;
   }

   @Override
   public void method1921() {
      super.method1921();
      this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 100, this.field4565 / 6 + 168, 200, 20, this.field6921, var1 -> this.field6918.run()));
      this.field6920 = Class5991.method18584(this.field4568, this.field6919, this.field4564 - 50);
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5691(var1, this.field4568, this.field4560, this.field4564 / 2, 70, 16777215);
      this.field6920.method18588(var1, this.field4564 / 2, 90);
      super.method1923(var1, var2, var3, var4);
   }

   @Override
   public void method1919() {
      super.method1919();
      if (--this.field6922 == 0) {
         for (Class1197 var4 : this.field4566) {
            var4.field6482 = true;
         }
      }
   }
}
