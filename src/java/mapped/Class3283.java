package mapped;

import com.google.common.collect.Maps;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public class Class3283 extends Class3257 {
   private static final Map<Class9455, Class3283> field18793 = Maps.newHashMap();
   private final int field18794;
   private final Class9455 field18795;

   public Class3283(int var1, Class9455 var2, Class5643 var3) {
      super(var3);
      this.field18794 = var1;
      this.field18795 = var2;
      field18793.put(this.field18795, this);
   }

   @Override
   public ActionResultType method11707(Class5911 var1) {
      World var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      Class7380 var6 = var4.method6738(var5);
      if (var6.method23448(Blocks.JUKEBOX) && !var6.<Boolean>method23463(Class3364.field18931)) {
         ItemStack var7 = var1.method18357();
         if (!var4.field9020) {
            ((Class3364) Blocks.JUKEBOX).method11941(var4, var5, var6, var7);
            var4.method6869((PlayerEntity)null, 1010, var5, Class3257.method11701(this));
            var7.method32182(1);
            PlayerEntity var8 = var1.method18358();
            if (var8 != null) {
               var8.method2911(Class8876.field40158);
            }
         }

         return ActionResultType.method9002(var4.field9020);
      } else {
         return ActionResultType.field14820;
      }
   }

   public int method11812() {
      return this.field18794;
   }

   @Override
   public void method11730(ItemStack var1, World var2, List<ITextComponent> var3, Class2216 var4) {
      var3.add(this.method11813().mergeStyle(TextFormatting.GRAY));
   }

   public IFormattableTextComponent method11813() {
      return new TranslationTextComponent(this.method11719() + ".desc");
   }

   @Nullable
   public static Class3283 method11814(Class9455 var0) {
      return field18793.get(var0);
   }

   public Class9455 method11815() {
      return this.field18795;
   }
}