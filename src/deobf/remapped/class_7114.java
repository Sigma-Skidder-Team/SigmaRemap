package remapped;

import java.util.Objects;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public abstract class class_7114 extends class_2089 implements class_1463, class_5888 {
   public static final class_4639 field_36678 = new class_4639("textures/gui/widgets.png");
   public int field_36671;
   public int field_36681;
   public int field_36670;
   public int field_36674;
   private ITextComponent field_36672;
   private boolean field_36679;
   public boolean field_36673;
   public boolean field_36675 = true;
   public boolean field_36677 = true;
   public float field_36680 = 1.0F;
   public long field_36676 = Long.MAX_VALUE;
   private boolean field_36682;

   public class_7114(int var1, int var2, int var3, int var4, ITextComponent var5) {
      this.field_36670 = var1;
      this.field_36674 = var2;
      this.field_36671 = var3;
      this.field_36681 = var4;
      this.field_36672 = var5;
   }

   public int method_32695() {
      return this.field_36681;
   }

   public int method_32684(boolean var1) {
      byte var4 = 1;
      if (this.field_36675) {
         if (var1) {
            var4 = 2;
         }
      } else {
         var4 = 0;
      }

      return var4;
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      if (this.field_36677) {
         this.field_36673 = var2 >= this.field_36670
            && var3 >= this.field_36674
            && var2 < this.field_36670 + this.field_36671
            && var3 < this.field_36674 + this.field_36681;
         if (this.field_36679 != this.method_32703()) {
            if (!this.method_32703()) {
               this.field_36676 = Long.MAX_VALUE;
            } else if (!this.field_36682) {
               this.method_32693(750);
            } else {
               this.method_32693(200);
            }
         }

         if (this.field_36677) {
            this.method_32686(var1, var2, var3, var4);
         }

         this.method_32700();
         this.field_36679 = this.method_32703();
      }
   }

   public void method_32700() {
      if (this.field_36675 && this.method_32703() && class_9665.method_44650() > this.field_36676) {
         String var3 = this.method_32701().getString();
         if (!var3.isEmpty()) {
            class_7542.field_38482.method_34341(var3);
            this.field_36676 = Long.MAX_VALUE;
         }
      }
   }

   public IFormattableTextComponent method_32701() {
      return new TranslationTextComponent("gui.narrate.button", this.method_32685());
   }

   public void method_32686(class_7966 var1, int var2, int var3, float var4) {
      MinecraftClient var7 = MinecraftClient.method_8510();
      class_9854 var8 = var7.field_9668;
      var7.method_8577().method_35674(field_36678);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, this.field_36680);
      int var9 = this.method_32684(this.method_32703());
      class_3542.method_16488();
      class_3542.method_16437();
      class_3542.method_16428();
      this.method_9781(var1, this.field_36670, this.field_36674, 0, 46 + var9 * 20, this.field_36671 / 2, this.field_36681);
      this.method_9781(
         var1, this.field_36670 + this.field_36671 / 2, this.field_36674, 200 - this.field_36671 / 2, 46 + var9 * 20, this.field_36671 / 2, this.field_36681
      );
      this.method_32706(var1, var7, var2, var3);
      int var10 = !this.field_36675 ? 10526880 : 16777215;
      method_9788(
         var1,
         var8,
         this.method_32685(),
         this.field_36670 + this.field_36671 / 2,
         this.field_36674 + (this.field_36681 - 8) / 2,
         var10 | class_9299.method_42816(this.field_36680 * 255.0F) << 24
      );
   }

   public void method_32706(class_7966 var1, MinecraftClient var2, int var3, int var4) {
   }

   public void method_32694(double var1, double var3) {
   }

   public void method_32704(double var1, double var3) {
   }

   public void method_32697(double var1, double var3, double var5, double var7) {
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (this.field_36675 && this.field_36677) {
         if (this.method_32702(var5)) {
            boolean var8 = this.method_32696(var1, var3);
            if (var8) {
               this.method_32692(MinecraftClient.method_8510().method_8590());
               this.method_32694(var1, var3);
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public boolean method_26941(double var1, double var3, int var5) {
      if (!this.method_32702(var5)) {
         return false;
      } else {
         this.method_32704(var1, var3);
         return true;
      }
   }

   public boolean method_32702(int var1) {
      return var1 == 0;
   }

   @Override
   public boolean method_26944(double var1, double var3, int var5, double var6, double var8) {
      if (!this.method_32702(var5)) {
         return false;
      } else {
         this.method_32697(var1, var3, var6, var8);
         return true;
      }
   }

   public boolean method_32696(double var1, double var3) {
      return this.field_36675
         && this.field_36677
         && var1 >= (double)this.field_36670
         && var3 >= (double)this.field_36674
         && var1 < (double)(this.field_36670 + this.field_36671)
         && var3 < (double)(this.field_36674 + this.field_36681);
   }

   public boolean method_32703() {
      return this.field_36673 || this.field_36682;
   }

   @Override
   public boolean method_26942(boolean var1) {
      if (this.field_36675 && this.field_36677) {
         this.field_36682 = !this.field_36682;
         this.method_32690(this.field_36682);
         return this.field_36682;
      } else {
         return false;
      }
   }

   public void method_32690(boolean var1) {
   }

   @Override
   public boolean method_26937(double var1, double var3) {
      return this.field_36675
         && this.field_36677
         && var1 >= (double)this.field_36670
         && var3 >= (double)this.field_36674
         && var1 < (double)(this.field_36670 + this.field_36671)
         && var3 < (double)(this.field_36674 + this.field_36681);
   }

   public void method_32705(class_7966 var1, int var2, int var3) {
   }

   public void method_32692(class_3541 var1) {
      var1.method_16345(class_4949.method_22675(class_463.field_1995, 1.0F));
   }

   public int method_32699() {
      return this.field_36671;
   }

   public void method_32688(int var1) {
      this.field_36671 = var1;
   }

   public void method_32689(float var1) {
      this.field_36680 = var1;
   }

   public void method_32687(ITextComponent var1) {
      if (!Objects.equals(var1.getString(), this.field_36672.getString())) {
         this.method_32693(250);
      }

      this.field_36672 = var1;
   }

   public void method_32693(int var1) {
      this.field_36676 = class_9665.method_44650() + (long)var1;
   }

   public ITextComponent method_32685() {
      return this.field_36672;
   }

   public boolean method_32691() {
      return this.field_36682;
   }

   public void method_32698(boolean var1) {
      this.field_36682 = var1;
   }
}
