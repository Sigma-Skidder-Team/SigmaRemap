package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import net.minecraft.util.text.ITextComponent;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class Class1282 extends Class1274<Class1171> {
   private static String[] field6837;
   public final List<Class49<Block>> field6838;
   public final List<Class49<Class3257>> field6839;
   private final int[] field6840;
   public int field6841;
   public final List<Class3257> field6842;
   public final Comparator<Class3257> field6843;
   public Class49<?> field6844;
   public int field6845;
   public final Class1305 field6846;

   public Class1282(Class1305 var1, Minecraft var2) {
      super(var2, var1.field4564, var1.field4565, 32, var1.field4565 - 64, 20);
      this.field6846 = var1;
      this.field6840 = new int[]{3, 4, 1, 2, 5, 6};
      this.field6841 = -1;
      this.field6843 = new Class3588(this);
      this.field6838 = Lists.newArrayList();
      this.field6838.add(Class8876.field40096);
      this.field6839 = Lists.newArrayList(
         new Class49[]{Class8876.field40099, Class8876.field40097, Class8876.field40098, Class8876.field40100, Class8876.field40101}
      );
      this.method6021(true, 20);
      Set var5 = Sets.newIdentityHashSet();

      for (Class3257 var7 : Class2348.field16075) {
         boolean var8 = false;

         for (Class49 var10 : this.field6839) {
            if (var10.method169(var7) && Class1305.method6193(var1).method28961(var10.method172(var7)) > 0) {
               var8 = true;
            }
         }

         if (var8) {
            var5.add(var7);
         }
      }

      for (Block var13 : Class2348.field16072) {
         boolean var14 = false;

         for (Class49 var16 : this.field6838) {
            if (var16.method169(var13) && Class1305.method6193(var1).method28961(var16.method172(var13)) > 0) {
               var14 = true;
            }
         }

         if (var14) {
            var5.add(var13.method11581());
         }
      }

      var5.remove(Class8514.field37222);
      this.field6842 = Lists.newArrayList(var5);

      for (int var12 = 0; var12 < this.field6842.size(); var12++) {
         this.method6030(new Class1171(this));
      }
   }

   @Override
   public void method6038(Class9332 var1, int var2, int var3, Class9352 var4) {
      if (!this.field6782.field1301.method36736()) {
         this.field6841 = -1;
      }

      for (int var7 = 0; var7 < this.field6840.length; var7++) {
         Class1305.method6195(this.field6846, var1, var2 + Class1305.method6194(this.field6846, var7) - 18, var3 + 1, 0, this.field6841 != var7 ? 18 : 0);
      }

      if (this.field6844 != null) {
         int var9 = Class1305.method6194(this.field6846, this.method6099(this.field6844)) - 36;
         int var8 = this.field6845 != 1 ? 1 : 2;
         Class1305.method6195(this.field6846, var1, var2 + var9, var3 + 1, 18 * var8, 0);
      }

      for (int var10 = 0; var10 < this.field6840.length; var10++) {
         int var11 = this.field6841 != var10 ? 0 : 1;
         Class1305.method6195(
            this.field6846, var1, var2 + Class1305.method6194(this.field6846, var10) - 18 + var11, var3 + 1 + var11, 18 * this.field6840[var10], 18
         );
      }
   }

   @Override
   public int method6022() {
      return 375;
   }

   @Override
   public int method6048() {
      return this.field6785 / 2 + 140;
   }

   @Override
   public void method6039(Class9332 var1) {
      this.field6846.method2469(var1);
   }

   @Override
   public void method6037(int var1, int var2) {
      this.field6841 = -1;

      for (int var5 = 0; var5 < this.field6840.length; var5++) {
         int var6 = var1 - Class1305.method6194(this.field6846, var5);
         if (var6 >= -36 && var6 <= 0) {
            this.field6841 = var5;
            break;
         }
      }

      if (this.field6841 >= 0) {
         this.method6102(this.method6098(this.field6841));
         this.field6782.method1546().method1000(Class6339.method19292(Class6067.field27176, 1.0F));
      }
   }

   private Class49<?> method6098(int var1) {
      return var1 >= this.field6838.size() ? this.field6839.get(var1 - this.field6838.size()) : this.field6838.get(var1);
   }

   private int method6099(Class49<?> var1) {
      int var4 = this.field6838.indexOf(var1);
      if (var4 < 0) {
         int var5 = this.field6839.indexOf(var1);
         return var5 < 0 ? -1 : var5 + this.field6838.size();
      } else {
         return var4;
      }
   }

   @Override
   public void method6040(Class9332 var1, int var2, int var3) {
      if (var3 >= this.field6787 && var3 <= this.field6788) {
         Class1171 var6 = this.method6033((double)var2, (double)var3);
         int var7 = (this.field6785 - this.method6022()) / 2;
         if (var6 == null) {
            ITextComponent var12 = null;
            int var9 = var2 - var7;

            for (int var10 = 0; var10 < this.field6840.length; var10++) {
               int var11 = Class1305.method6194(this.field6846, var10);
               if (var9 >= var11 - 18 && var9 <= var11) {
                  var12 = this.method6098(var10).method174();
                  break;
               }
            }

            this.method6100(var1, var12, var2, var3);
         } else {
            if (var2 < var7 + 40 || var2 > var7 + 40 + 20) {
               return;
            }

            Class3257 var8 = this.field6842.get(this.method2468().indexOf(var6));
            this.method6100(var1, this.method6101(var8), var2, var3);
         }
      }
   }

   public void method6100(Class9332 var1, ITextComponent var2, int var3, int var4) {
      if (var2 != null) {
         int var7 = var3 + 12;
         int var8 = var4 - 12;
         int var9 = this.field6846.field4568.method38821(var2);
         this.method5688(var1, var7 - 3, var8 - 3, var7 + var9 + 3, var8 + 8 + 3, -1073741824, -1073741824);
         RenderSystem.pushMatrix();
         RenderSystem.translatef(0.0F, 0.0F, 400.0F);
         this.field6846.field4568.method38803(var1, var2, (float)var7, (float)var8, -1);
         RenderSystem.popMatrix();
      }
   }

   public ITextComponent method6101(Class3257 var1) {
      return var1.method11717();
   }

   public void method6102(Class49<?> var1) {
      if (var1 == this.field6844) {
         if (this.field6845 != -1) {
            this.field6844 = null;
            this.field6845 = 0;
         } else {
            this.field6845 = 1;
         }
      } else {
         this.field6844 = var1;
         this.field6845 = -1;
      }

      this.field6842.sort(this.field6843);
   }
}
