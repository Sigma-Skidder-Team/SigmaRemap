package mapped;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.KeybindTextComponent;
import net.minecraft.util.text.TextFormatting;

public class Class9557 {
   private final Minecraft field44523;
   private Class6196 field44524;
   private List<Class9447> field44525 = Lists.newArrayList();

   public Class9557(Minecraft var1) {
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

   public void method37025(Class1656 var1, Class8710 var2) {
      if (this.field44524 != null && var2 != null && var1 != null) {
         this.field44524.method19102(var1, var2);
      }
   }

   public void method37026(Class1656 var1, BlockPos var2, Class7380 var3, float var4) {
      if (this.field44524 != null) {
         this.field44524.method19103(var1, var2, var3, var4);
      }
   }

   public void method37027() {
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

   public void method37031(Class7600 var1, int var2) {
      this.field44525.add(new Class9447(var1, var2));
      this.field44523.method1566().method5914(var1);
   }

   public void method37032(Class7600 var1) {
      this.field44525.removeIf(var1x -> Class9447.method36326(var1x) == var1);
      var1.method24895();
   }

   public void method37033() {
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
      this.field44523.gameSettings.method37146();
      if (this.field44524 != null) {
         this.field44524.method19098();
         this.field44524 = var1.method8915(this);
      }
   }

   public Minecraft method37035() {
      return this.field44523;
   }

   public Class1894 method37036() {
      return this.field44523.field1337 != null ? this.field44523.field1337.method23157() : Class1894.field11101;
   }

   public static ITextComponent method37037(String var0) {
      return new KeybindTextComponent("key." + var0).mergeStyle(TextFormatting.BOLD);
   }
}
