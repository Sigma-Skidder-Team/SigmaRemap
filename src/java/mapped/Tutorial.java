package mapped;

import com.google.common.collect.Lists;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.KeybindTextComponent;
import net.minecraft.util.text.TextFormatting;

public class Tutorial {
   private final Minecraft field44523;
   private Class6196 field44524;
   private List<Class9447> field44525 = Lists.newArrayList();

   public Tutorial(Minecraft var1) {
      this.field44523 = var1;
   }

   public void method37023(MovementInput var1) {
      if (this.field44524 != null) {
         this.field44524.method19100(var1);
      }
   }

   public void method37024(double var1, double var3) {
      if (this.field44524 != null) {
         this.field44524.method19101(var1, var3);
      }
   }

   public void onMouseHover(ClientWorld var1, RayTraceResult var2) {
      if (this.field44524 != null && var2 != null && var1 != null) {
         this.field44524.method19102(var1, var2);
      }
   }

   public void method37026(ClientWorld var1, BlockPos var2, BlockState var3, float var4) {
      if (this.field44524 != null) {
         this.field44524.method19103(var1, var2, var3, var4);
      }
   }

   public void openInventory() {
      if (this.field44524 != null) {
         this.field44524.method19099();
      }
   }

   public void method37028(ItemStack var1) {
      if (this.field44524 != null) {
         this.field44524.method19104(var1);
      }
   }

   public void method37029() {
      if (this.field44524 != null) {
         this.field44524.method19098();
         this.field44524 = null;
      }
   }

   public void method37030() {
      if (this.field44524 != null) {
         this.method37029();
      }

      this.field44524 = this.field44523.gameSettings.field44604.method8915(this);
   }

   public void func_244698_a(TutorialToast var1, int var2) {
      this.field44525.add(new Class9447(var1, var2));
      this.field44523.getToastGui().method5914(var1);
   }

   public void func_244697_a(TutorialToast var1) {
      this.field44525.removeIf(var1x -> Class9447.method36326(var1x) == var1);
      var1.method24895();
   }

   public void tick() {
      this.field44525.removeIf(var0 -> Class9447.method36325(var0));
      if (this.field44524 == null) {
         if (this.field44523.world != null) {
            this.method37030();
         }
      } else if (this.field44523.world == null) {
         this.method37029();
      } else {
         this.field44524.method19097();
      }
   }

   public void method37034(Class2200 var1) {
      this.field44523.gameSettings.field44604 = var1;
      this.field44523.gameSettings.saveOptions();
      if (this.field44524 != null) {
         this.field44524.method19098();
         this.field44524 = var1.method8915(this);
      }
   }

   public Minecraft method37035() {
      return this.field44523;
   }

   public Class1894 method37036() {
      return this.field44523.playerController != null ? this.field44523.playerController.method23157() : Class1894.field11101;
   }

   public static ITextComponent createKeybindComponent(String var0) {
      return new KeybindTextComponent("key." + var0).mergeStyle(TextFormatting.BOLD);
   }
}
