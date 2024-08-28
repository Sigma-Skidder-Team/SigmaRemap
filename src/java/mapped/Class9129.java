package mapped;

import java.io.DataInputStream;
import java.io.IOException;

public class Class9129 {
   private static String[] field41941;
   private boolean field41942;
   private boolean field41943;
   private boolean field41944;
   private boolean field41945;
   private boolean field41946;
   private int field41947;
   private int field41948;
   private int field41949;
   private int field41950;
   private boolean field41951;
   private boolean field41952;
   private int field41953;
   private int field41954;
   private int field41955;
   private int[] field41956;
   private int field41957;
   private byte[] field41958;

   public Class9129(DataInputStream var1) throws IOException {
      this.method34062(var1);
      if (!this.field41943) {
         this.field41957 = var1.readUnsignedShort();
      }

      if (this.field41955 != 0) {
         if (!this.field41943) {
            this.field41956 = new int[this.field41955];

            for (int var4 = 0; var4 < this.field41955; var4++) {
               this.field41956[var4] = var1.readUnsignedShort();
            }

            this.field41957 = var1.readUnsignedShort();
         }

         for (int var5 = 0; var5 < this.field41955; var5++) {
            if (!this.field41943) {
               this.field41957 = var1.readUnsignedShort();
            }
         }
      }
   }

   private void method34062(DataInputStream var1) throws IOException {
      int var4 = var1.read();
      this.field41942 = (var4 >> 3 & 1) == 1;
      this.field41947 = var4 >> 1 & 3;
      this.field41943 = (var4 & 1) == 1;
      var4 = var1.read();
      this.field41948 = (var4 >> 6 & 3) + 1;
      this.field41949 = var4 >> 2 & 15;
      this.field41944 = (var4 >> 1 & 1) == 1;
      var4 = var4 << 8 | var1.read();
      this.field41950 = var4 >> 6 & 7;
      this.field41945 = (var4 >> 5 & 1) == 1;
      this.field41946 = (var4 >> 4 & 1) == 1;
      this.field41951 = (var4 >> 3 & 1) == 1;
      this.field41952 = (var4 >> 2 & 1) == 1;
      var4 = var4 << 16 | var1.readUnsignedShort();
      this.field41953 = var4 >> 5 & 8191;
      var4 = var4 << 8 | var1.read();
      this.field41954 = var4 >> 2 & 2047;
      this.field41955 = var4 & 3;
   }

   public int method34063() {
      return this.field41953 - (!this.field41943 ? 9 : 7);
   }

   public byte[] method34064() {
      if (this.field41958 == null) {
         this.field41958 = new byte[2];
         this.field41958[0] = (byte)(this.field41948 << 3);
         this.field41958[0] = (byte)(this.field41958[0] | this.field41949 >> 1 & 7);
         this.field41958[1] = (byte)((this.field41949 & 1) << 7);
         this.field41958[1] = (byte)(this.field41958[1] | this.field41950 << 3);
      }

      return this.field41958;
   }

   public int method34065() {
      return Class2288.method9030(this.field41949).method9033();
   }

   public int method34066() {
      return Class188.method574(this.field41950).method575();
   }
}
