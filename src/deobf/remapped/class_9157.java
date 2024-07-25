package remapped;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public class class_9157 implements class_8147 {
   private static String[] field_46864;
   private class_7705 field_46866;
   private int field_46863;
   private int field_46865;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public class_9157(
      class_7705 var1, class_6351 var2, int var3, int var4, int var5, class_8581 var6, class_4788 var7, ByteBuffer var8, int var9, boolean var10, boolean var11
   ) {
      this.field_46866 = var1;
      this.field_46863 = var9;
      this.field_46865 = GL11.glGenTextures();
      GL11.glBindTexture(this.驋뵯鼒ኞ鄡ኞ(), this.field_46865);
      class_5525.method_25072();
      int var14 = var11 ? '脯' : 10497;
      int var15 = var10 ? 9729 : 9728;
      switch (var1) {
         case field_39094:
            GL11.glTexImage1D(3552, 0, var2.method_29091(), var3, 0, var6.method_39461(), var7.method_22082(), var8);
            GL11.glTexParameteri(3552, 10242, var14);
            GL11.glTexParameteri(3552, 10240, var15);
            GL11.glTexParameteri(3552, 10241, var15);
            break;
         case field_39095:
            GL11.glTexImage2D(3553, 0, var2.method_29091(), var3, var4, 0, var6.method_39461(), var7.method_22082(), var8);
            GL11.glTexParameteri(3553, 10242, var14);
            GL11.glTexParameteri(3553, 10243, var14);
            GL11.glTexParameteri(3553, 10240, var15);
            GL11.glTexParameteri(3553, 10241, var15);
            break;
         case field_39092:
            GL20.glTexImage3D(32879, 0, var2.method_29091(), var3, var4, var5, 0, var6.method_39461(), var7.method_22082(), var8);
            GL11.glTexParameteri(32879, 10242, var14);
            GL11.glTexParameteri(32879, 10243, var14);
            GL11.glTexParameteri(32879, 32882, var14);
            GL11.glTexParameteri(32879, 10240, var15);
            GL11.glTexParameteri(32879, 10241, var15);
            break;
         case field_39093:
            GL11.glTexImage2D(34037, 0, var2.method_29091(), var3, var4, 0, var6.method_39461(), var7.method_22082(), var8);
            GL11.glTexParameteri(34037, 10242, var14);
            GL11.glTexParameteri(34037, 10243, var14);
            GL11.glTexParameteri(34037, 10240, var15);
            GL11.glTexParameteri(34037, 10241, var15);
      }

      GL11.glBindTexture(this.驋뵯鼒ኞ鄡ኞ(), 0);
   }

   public int 驋뵯鼒ኞ鄡ኞ() {
      return this.field_46866.method_34887();
   }

   public int ಽ佉竁阢贞Ⱋ() {
      return this.field_46865;
   }

   public int 햠쇽醧쇽陬卫() {
      return this.field_46863;
   }

   public void 괠欫蛊浦室敤() {
      if (this.field_46865 > 0) {
         GL11.glDeleteTextures(this.field_46865);
         this.field_46865 = 0;
      }
   }
}
