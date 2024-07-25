package remapped;

import java.io.IOException;
import java.util.Collection;

public class class_1053 implements Packet<class_392> {
   private int field_5783;
   private byte field_5790;
   private boolean field_5786;
   private boolean field_5782;
   private class_3245[] field_5780;
   private int field_5785;
   private int field_5784;
   private int field_5787;
   private int field_5788;
   private byte[] field_5789;

   public class_1053() {
   }

   public class_1053(int var1, byte var2, boolean var3, boolean var4, Collection<class_3245> var5, byte[] var6, int var7, int var8, int var9, int var10) {
      this.field_5783 = var1;
      this.field_5790 = var2;
      this.field_5786 = var3;
      this.field_5782 = var4;
      this.field_5780 = var5.<class_3245>toArray(new class_3245[var5.size()]);
      this.field_5785 = var7;
      this.field_5784 = var8;
      this.field_5787 = var9;
      this.field_5788 = var10;
      this.field_5789 = new byte[var9 * var10];

      for (int var13 = 0; var13 < var9; var13++) {
         for (int var14 = 0; var14 < var10; var14++) {
            this.field_5789[var13 + var14 * var9] = var6[var7 + var13 + (var8 + var14) * 128];
         }
      }
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_5783 = var1.method_37778();
      this.field_5790 = var1.readByte();
      this.field_5786 = var1.readBoolean();
      this.field_5782 = var1.readBoolean();
      this.field_5780 = new class_3245[var1.method_37778()];

      for (int var4 = 0; var4 < this.field_5780.length; var4++) {
         class_8086 var5 = var1.<class_8086>method_37787(class_8086.class);
         this.field_5780[var4] = new class_3245(
            var5, var1.readByte(), var1.readByte(), (byte)(var1.readByte() & 15), !var1.readBoolean() ? null : var1.method_37776()
         );
      }

      this.field_5787 = var1.readUnsignedByte();
      if (this.field_5787 > 0) {
         this.field_5788 = var1.readUnsignedByte();
         this.field_5785 = var1.readUnsignedByte();
         this.field_5784 = var1.readUnsignedByte();
         this.field_5789 = var1.method_37757();
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_5783);
      var1.writeByte(this.field_5790);
      var1.writeBoolean(this.field_5786);
      var1.writeBoolean(this.field_5782);
      var1.method_37743(this.field_5780.length);

      for (class_3245 var7 : this.field_5780) {
         var1.method_37750(var7.method_14848());
         var1.writeByte(var7.method_14846());
         var1.writeByte(var7.method_14850());
         var1.writeByte(var7.method_14844() & 15);
         if (var7.method_14847() == null) {
            var1.writeBoolean(false);
         } else {
            var1.writeBoolean(true);
            var1.method_37779(var7.method_14847());
         }
      }

      var1.writeByte(this.field_5787);
      if (this.field_5787 > 0) {
         var1.writeByte(this.field_5788);
         var1.writeByte(this.field_5785);
         var1.writeByte(this.field_5784);
         var1.method_37767(this.field_5789);
      }
   }

   public void method_4634(class_392 var1) {
      var1.method_1963(this);
   }

   public int method_4633() {
      return this.field_5783;
   }

   public void method_4632(class_2134 var1) {
      var1.field_10678 = this.field_5790;
      var1.field_10681 = this.field_5786;
      var1.field_10686 = this.field_5782;
      var1.field_10683.clear();

      for (int var4 = 0; var4 < this.field_5780.length; var4++) {
         class_3245 var5 = this.field_5780[var4];
         var1.field_10683.put("icon-" + var4, var5);
      }

      for (int var6 = 0; var6 < this.field_5787; var6++) {
         for (int var7 = 0; var7 < this.field_5788; var7++) {
            var1.field_10691[this.field_5785 + var6 + (this.field_5784 + var7) * 128] = this.field_5789[var6 + var7 * this.field_5787];
         }
      }
   }
}
