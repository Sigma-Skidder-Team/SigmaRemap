package mapped;

import net.minecraft.util.math.MathHelper;

public interface Class5426 extends IVertexBuilder {
   Class8209 method17073();

   void method17069();

   void method17066(int var1, byte var2);

   void method17067(int var1, short var2);

   void method17068(int var1, float var2);

   @Override
   default IVertexBuilder pos(double var1, double var3, double var5) {
      if (this.method17073().method28516() == Class2061.field13430) {
         this.method17068(0, (float)var1);
         this.method17068(4, (float)var3);
         this.method17068(8, (float)var5);
         this.method17069();
         return this;
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   default IVertexBuilder color(int var1, int var2, int var3, int var4) {
      Class8209 var7 = this.method17073();
      if (var7.method28517() == Class2142.field14020) {
         if (var7.method28516() == Class2061.field13431) {
            this.method17066(0, (byte)var1);
            this.method17066(1, (byte)var2);
            this.method17066(2, (byte)var3);
            this.method17066(3, (byte)var4);
            this.method17069();
            return this;
         } else {
            throw new IllegalStateException();
         }
      } else {
         return this;
      }
   }

   @Override
   default IVertexBuilder tex(float var1, float var2) {
      Class8209 var5 = this.method17073();
      if (var5.method28517() == Class2142.field14021 && var5.method28518() == 0) {
         if (var5.method28516() == Class2061.field13430) {
            this.method17068(0, var1);
            this.method17068(4, var2);
            this.method17069();
            return this;
         } else {
            throw new IllegalStateException();
         }
      } else {
         return this;
      }
   }

   @Override
   default IVertexBuilder method17028(int var1, int var2) {
      return this.method17093((short)var1, (short)var2, 1);
   }

   @Override
   default IVertexBuilder method17029(int var1, int var2) {
      return this.method17093((short)var1, (short)var2, 2);
   }

   default IVertexBuilder method17093(short var1, short var2, int var3) {
      Class8209 var6 = this.method17073();
      if (var6.method28517() != Class2142.field14021 || var6.method28518() != var3) {
         return this;
      } else if (var6.method28516() == Class2061.field13434) {
         this.method17067(0, var1);
         this.method17067(2, var2);
         this.method17069();
         return this;
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   default IVertexBuilder method17030(float var1, float var2, float var3) {
      Class8209 var6 = this.method17073();
      if (var6.method28517() == Class2142.field14019) {
         if (var6.method28516() == Class2061.field13432) {
            this.method17066(0, method17094(var1));
            this.method17066(1, method17094(var2));
            this.method17066(2, method17094(var3));
            this.method17069();
            return this;
         } else {
            throw new IllegalStateException();
         }
      } else {
         return this;
      }
   }

   static byte method17094(float var0) {
      return (byte)((int)(MathHelper.clamp(var0, -1.0F, 1.0F) * 127.0F) & 0xFF);
   }
}
