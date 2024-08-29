package mapped;

import net.minecraft.util.math.BlockPos;

public class Class196 implements Class197 {
   private final Class200<?, ?> field741;
   private final Class200<?, ?> field742;

   public Class196(Class1704 var1, boolean var2, boolean var3) {
      this.field741 = !var2 ? null : new Class201(var1);
      this.field742 = !var3 ? null : new Class212(var1);
   }

   public void checkBlock(BlockPos var1) {
      if (this.field741 != null) {
         this.field741.method660(var1);
      }

      if (this.field742 != null) {
         this.field742.method660(var1);
      }
   }

   public void method601(BlockPos var1, int var2) {
      if (this.field741 != null) {
         this.field741.method661(var1, var2);
      }
   }

   public boolean method637() {
      return this.field742 != null && this.field742.method656() ? true : this.field741 != null && this.field741.method656();
   }

   public int method600(int var1, boolean var2, boolean var3) {
      if (this.field741 != null && this.field742 != null) {
         int var6 = var1 / 2;
         int var7 = this.field741.method657(var6, var2, var3);
         int var8 = var1 - var6 + var7;
         int var9 = this.field742.method657(var8, var2, var3);
         return var7 == 0 && var9 > 0 ? this.field741.method657(var9, var2, var3) : var9;
      } else if (this.field741 == null) {
         return this.field742 == null ? var1 : this.field742.method657(var1, var2, var3);
      } else {
         return this.field741.method657(var1, var2, var3);
      }
   }

   @Override
   public void method604(Class2002 var1, boolean var2) {
      if (this.field741 != null) {
         this.field741.method604(var1, var2);
      }

      if (this.field742 != null) {
         this.field742.method604(var1, var2);
      }
   }

   public void method605(Class7481 var1, boolean var2) {
      if (this.field741 != null) {
         this.field741.method662(var1, var2);
      }

      if (this.field742 != null) {
         this.field742.method662(var1, var2);
      }
   }

   public Class198 method638(Class1977 var1) {
      if (var1 != Class1977.field12882) {
         return (Class198)(this.field742 != null ? this.field742 : Class199.field743);
      } else {
         return (Class198)(this.field741 != null ? this.field741 : Class199.field743);
      }
   }

   public String method639(Class1977 var1, Class2002 var2) {
      if (var1 != Class1977.field12882) {
         if (this.field742 != null) {
            return this.field742.method659(var2.method8425());
         }
      } else if (this.field741 != null) {
         return this.field741.method659(var2.method8425());
      }

      return "n/a";
   }

   public void method606(Class1977 var1, Class2002 var2, Class6785 var3, boolean var4) {
      if (var1 != Class1977.field12882) {
         if (this.field742 != null) {
            this.field742.method658(var2.method8425(), var3, var4);
         }
      } else if (this.field741 != null) {
         this.field741.method658(var2.method8425(), var3, var4);
      }
   }

   public void method609(Class7481 var1, boolean var2) {
      if (this.field741 != null) {
         this.field741.method663(var1, var2);
      }

      if (this.field742 != null) {
         this.field742.method663(var1, var2);
      }
   }

   public int method640(BlockPos var1, int var2) {
      int var5 = this.field742 != null ? this.field742.method643(var1) - var2 : 0;
      int var6 = this.field741 != null ? this.field741.method643(var1) : 0;
      return Math.max(var6, var5);
   }
}
