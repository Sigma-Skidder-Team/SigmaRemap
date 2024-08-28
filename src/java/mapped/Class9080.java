package mapped;

import net.minecraft.util.text.TranslationTextComponent;

public class Class9080 extends Class9081 {
   private boolean field41565;
   private boolean field41566;
   private int field41567;
   private int field41568;

   public Class9080(ServerWorld var1) {
      super(var1);
   }

   @Override
   public void method33856() {
      super.method33856();
      this.field41568++;
      long var3 = this.field41570.method6783();
      long var5 = var3 / 24000L + 1L;
      if (!this.field41565 && this.field41568 > 20) {
         this.field41565 = true;
         this.field41571.field4855.sendPacket(new Class5534(Class5534.field24565, 0.0F));
      }

      this.field41566 = var3 > 120500L;
      if (this.field41566) {
         this.field41567++;
      }

      if (var3 % 24000L != 500L) {
         if (var5 != 1L) {
            if (var5 == 5L && var3 % 24000L == 22000L) {
               this.field41571.method1328(new TranslationTextComponent("demo.day.warning"), Util.field45724);
            }
         } else if (var3 != 100L) {
            if (var3 != 175L) {
               if (var3 == 250L) {
                  this.field41571.field4855.sendPacket(new Class5534(Class5534.field24565, 103.0F));
               }
            } else {
               this.field41571.field4855.sendPacket(new Class5534(Class5534.field24565, 102.0F));
            }
         } else {
            this.field41571.field4855.sendPacket(new Class5534(Class5534.field24565, 101.0F));
         }
      } else if (var5 <= 6L) {
         if (var5 != 6L) {
            this.field41571.method1328(new TranslationTextComponent("demo.day." + var5), Util.field45724);
         } else {
            this.field41571.field4855.sendPacket(new Class5534(Class5534.field24565, 104.0F));
         }
      }
   }

   private void method33857() {
      if (this.field41567 > 100) {
         this.field41571.method1328(new TranslationTextComponent("demo.reminder"), Util.field45724);
         this.field41567 = 0;
      }
   }

   @Override
   public void method33858(BlockPos var1, Class2070 var2, Direction var3, int var4) {
      if (!this.field41566) {
         super.method33858(var1, var2, var3, var4);
      } else {
         this.method33857();
      }
   }

   @Override
   public Class2274 method33859(Class878 var1, Class1655 var2, ItemStack var3, Hand var4) {
      if (!this.field41566) {
         return super.method33859(var1, var2, var3, var4);
      } else {
         this.method33857();
         return Class2274.field14820;
      }
   }

   @Override
   public Class2274 method33860(Class878 var1, Class1655 var2, ItemStack var3, Hand var4, Class8711 var5) {
      if (!this.field41566) {
         return super.method33860(var1, var2, var3, var4, var5);
      } else {
         this.method33857();
         return Class2274.field14820;
      }
   }
}
