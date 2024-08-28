package mapped;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class Class3368 extends Class3241 {
   public static final Class8552<Direction> field18939 = Class3433.field19198;
   public static final ResourceLocation field18940 = new ResourceLocation("contents");
   private final Class112 field18941;

   public Class3368(Class112 var1, Class7929 var2) {
      super(var2);
      this.field18941 = var1;
      this.method11578(this.field18612.method35393().method23465(field18939, Direction.field673));
   }

   @Override
   public Class944 method11646(Class1665 var1) {
      return new Class940(this.field18941);
   }

   @Override
   public Class1855 method11526(Class7380 var1) {
      return Class1855.field9886;
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      if (!var2.field9020) {
         if (!var4.method2800()) {
            Class944 var9 = var2.method6759(var3);
            if (!(var9 instanceof Class940)) {
               return Class2274.field14820;
            } else {
               Class940 var10 = (Class940)var9;
               boolean var11;
               if (var10.method3746() != Class2126.field13872) {
                  var11 = true;
               } else {
                  Direction var12 = var1.<Direction>method23463(field18939);
                  var11 = var2.method7051(Class8919.method32596(var3, var12));
               }

               if (var11) {
                  var4.method2766(var10);
                  var4.method2911(Class8876.field40163);
                  Class4388.method13832(var4, true);
               }

               return Class2274.field14819;
            }
         } else {
            return Class2274.field14819;
         }
      } else {
         return Class2274.field14818;
      }
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      return this.method11579().method23465(field18939, var1.method18354());
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field18939);
   }

   @Override
   public void method11574(Class1655 var1, BlockPos var2, Class7380 var3, PlayerEntity var4) {
      Class944 var7 = var1.method6759(var2);
      if (var7 instanceof Class940) {
         Class940 var8 = (Class940)var7;
         if (!var1.field9020 && var4.method2801() && !var8.method3617()) {
            Class8848 var9 = method11958(this.method11957());
            Class39 var10 = var8.method3754(new Class39());
            if (!var10.method134()) {
               var9.method32164("BlockEntityTag", var10);
            }

            if (var8.method3381()) {
               var9.method32150(var8.method3380());
            }

            Class1000 var11 = new Class1000(var1, (double)var2.method8304() + 0.5, (double)var2.getY() + 0.5, (double)var2.method8306() + 0.5, var9);
            var11.method4131();
            var1.method6916(var11);
         } else {
            var8.method3743(var4);
         }
      }

      super.method11574(var1, var2, var3, var4);
   }

   @Override
   public List<Class8848> method11697(Class7380 var1, Class9464 var2) {
      Class944 var5 = var2.<Class944>method36459(Class9525.field44337);
      if (var5 instanceof Class940) {
         Class940 var6 = (Class940)var5;
         var2 = var2.method36456(field18940, (var1x, var2x) -> {
            for (int var5x = 0; var5x < var6.method3629(); var5x++) {
               var2x.accept(var6.method3618(var5x));
            }
         });
      }

      return super.method11697(var1, var2);
   }

   @Override
   public void method11563(Class1655 var1, BlockPos var2, Class7380 var3, Class880 var4, Class8848 var5) {
      if (var5.method32152()) {
         Class944 var8 = var1.method6759(var2);
         if (var8 instanceof Class940) {
            ((Class940)var8).method3695(var5.method32149());
         }
      }
   }

   @Override
   public void method11513(Class7380 var1, Class1655 var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (!var1.method23448(var4.method23383())) {
         Class944 var8 = var2.method6759(var3);
         if (var8 instanceof Class940) {
            var2.method6806(var3, var1.method23383());
         }

         super.method11513(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public void method11583(Class8848 var1, Class1665 var2, List<ITextComponent> var3, Class2216 var4) {
      super.method11583(var1, var2, var3, var4);
      Class39 var7 = var1.method32145("BlockEntityTag");
      if (var7 != null) {
         if (var7.method119("LootTable", 8)) {
            var3.add(new StringTextComponent("???????"));
         }

         if (var7.method119("Items", 9)) {
            Class25<Class8848> var8 = Class25.method68(27, Class8848.field39973);
            Class7920.method26567(var7, var8);
            int var9 = 0;
            int var10 = 0;

            for (Class8848 var12 : var8) {
               if (!var12.method32105()) {
                  var10++;
                  if (var9 <= 4) {
                     var9++;
                     IFormattableTextComponent var13 = var12.method32149().deepCopy();
                     var13.appendString(" x").appendString(String.valueOf(var12.method32179()));
                     var3.add(var13);
                  }
               }
            }

            if (var10 - var9 > 0) {
               var3.add(new TranslationTextComponent("container.shulkerBox.more", var10 - var9).mergeStyle(TextFormatting.ITALIC));
            }
         }
      }
   }

   @Override
   public Class2315 method11689(Class7380 var1) {
      return Class2315.field15863;
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      Class944 var7 = var2.method6759(var3);
      return !(var7 instanceof Class940) ? Class8022.method27426() : Class8022.method27428(((Class940)var7).method3747(var1));
   }

   @Override
   public boolean method11648(Class7380 var1) {
      return true;
   }

   @Override
   public int method11649(Class7380 var1, Class1655 var2, BlockPos var3) {
      return Class5812.method18152((Class920)var2.method6759(var3));
   }

   @Override
   public Class8848 method11569(Class1665 var1, BlockPos var2, Class7380 var3) {
      Class8848 var6 = super.method11569(var1, var2, var3);
      Class940 var7 = (Class940)var1.method6759(var2);
      Class39 var8 = var7.method3754(new Class39());
      if (!var8.method134()) {
         var6.method32164("BlockEntityTag", var8);
      }

      return var6;
   }

   @Nullable
   public static Class112 method11954(Class3257 var0) {
      return method11955(Block.method11537(var0));
   }

   @Nullable
   public static Class112 method11955(Block var0) {
      return !(var0 instanceof Class3368) ? null : ((Class3368)var0).method11957();
   }

   public static Block method11956(Class112 var0) {
      if (var0 == null) {
         return Blocks.field36896;
      } else {
         switch (Class7797.field33491[var0.ordinal()]) {
            case 1:
               return Blocks.field36897;
            case 2:
               return Blocks.field36898;
            case 3:
               return Blocks.field36899;
            case 4:
               return Blocks.field36900;
            case 5:
               return Blocks.field36901;
            case 6:
               return Blocks.field36902;
            case 7:
               return Blocks.field36903;
            case 8:
               return Blocks.field36904;
            case 9:
               return Blocks.field36905;
            case 10:
               return Blocks.field36906;
            case 11:
            default:
               return Blocks.field36907;
            case 12:
               return Blocks.field36908;
            case 13:
               return Blocks.field36909;
            case 14:
               return Blocks.field36910;
            case 15:
               return Blocks.field36911;
            case 16:
               return Blocks.field36912;
         }
      }
   }

   @Nullable
   public Class112 method11957() {
      return this.field18941;
   }

   public static Class8848 method11958(Class112 var0) {
      return new Class8848(method11956(var0));
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      return var1.method23465(field18939, var2.method252(var1.<Direction>method23463(field18939)));
   }

   @Override
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field18939)));
   }
}
