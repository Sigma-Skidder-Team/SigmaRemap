package remapped;

import java.io.DataInputStream;
import java.io.IOException;

public class class_7127 {
   private static String[] field_36732;
   private boolean field_36728;
   private boolean field_36721;
   private boolean field_36725;
   private boolean field_36733;
   private boolean field_36729;
   private int field_36734;
   private int field_36735;
   private int field_36720;
   private int field_36719;
   private boolean field_36718;
   private boolean field_36731;
   private int field_36726;
   private int field_36724;
   private int field_36723;
   private int[] field_36727;
   private int field_36730;
   private byte[] field_36722;

   public class_7127(DataInputStream var1) throws IOException {
      this.method_32738(var1);
      if (!this.field_36721) {
         this.field_36730 = var1.readUnsignedShort();
      }

      if (this.field_36723 != 0) {
         if (!this.field_36721) {
            this.field_36727 = new int[this.field_36723];

            for (int var4 = 0; var4 < this.field_36723; var4++) {
               this.field_36727[var4] = var1.readUnsignedShort();
            }

            this.field_36730 = var1.readUnsignedShort();
         }

         for (int var5 = 0; var5 < this.field_36723; var5++) {
            if (!this.field_36721) {
               this.field_36730 = var1.readUnsignedShort();
            }
         }
      }
   }

   private void method_32738(DataInputStream var1) throws IOException {
      int var4 = var1.read();
      this.field_36728 = (var4 >> 3 & 1) == 1;
      this.field_36734 = var4 >> 1 & 3;
      this.field_36721 = (var4 & 1) == 1;
      var4 = var1.read();
      this.field_36735 = (var4 >> 6 & 3) + 1;
      this.field_36720 = var4 >> 2 & 15;
      this.field_36725 = (var4 >> 1 & 1) == 1;
      var4 = var4 << 8 | var1.read();
      this.field_36719 = var4 >> 6 & 7;
      this.field_36733 = (var4 >> 5 & 1) == 1;
      this.field_36729 = (var4 >> 4 & 1) == 1;
      this.field_36718 = (var4 >> 3 & 1) == 1;
      this.field_36731 = (var4 >> 2 & 1) == 1;
      var4 = var4 << 16 | var1.readUnsignedShort();
      this.field_36726 = var4 >> 5 & 8191;
      var4 = var4 << 8 | var1.read();
      this.field_36724 = var4 >> 2 & 2047;
      this.field_36723 = var4 & 3;
   }

   public int method_32741() {
      return this.field_36726 - (!this.field_36721 ? 9 : 7);
   }

   public byte[] method_32742() {
      if (this.field_36722 == null) {
         this.field_36722 = new byte[2];
         this.field_36722[0] = (byte)(this.field_36735 << 3);
         this.field_36722[0] = (byte)(this.field_36722[0] | this.field_36720 >> 1 & 7);
         this.field_36722[1] = (byte)((this.field_36720 & 1) << 7);
         this.field_36722[1] = (byte)(this.field_36722[1] | this.field_36719 << 3);
      }

      return this.field_36722;
   }

   public int method_32740() {
      return class_8965.method_41128(this.field_36720).method_41132();
   }

   public int method_32739() {
      return class_6871.method_31523(this.field_36719).method_31522();
   }
}
