package com.sun.jna;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class ELFAnalyser {
   private static final byte[] ELF_MAGIC = new byte[]{127, 69, 76, 70};
   private static final int EF_ARM_ABI_FLOAT_HARD = 1024;
   private static final int EF_ARM_ABI_FLOAT_SOFT = 512;
   private static final int EI_DATA_BIG_ENDIAN = 2;
   private static final int E_MACHINE_ARM = 40;
   private static final int EI_CLASS_64BIT = 2;
   private final String filename;
   private boolean ELF = false;
   private boolean _64Bit = false;
   private boolean bigEndian = false;
   private boolean armHardFloat = false;
   private boolean armSoftFloat = false;
   private boolean arm = false;

   public static ELFAnalyser analyse(String filename) throws IOException {
      ELFAnalyser var3 = new ELFAnalyser(filename);
      var3.runDetection();
      return var3;
   }

   public boolean isELF() {
      return this.ELF;
   }

   public boolean is64Bit() {
      return this._64Bit;
   }

   public boolean isBigEndian() {
      return this.bigEndian;
   }

   public String getFilename() {
      return this.filename;
   }

   public boolean isArmHardFloat() {
      return this.armHardFloat;
   }

   public boolean isArmSoftFloat() {
      return this.armSoftFloat;
   }

   public boolean isArm() {
      return this.arm;
   }

   private ELFAnalyser(String filename) {
      this.filename = filename;
   }

   private void runDetection() throws IOException {
      RandomAccessFile sizeIndicator = new RandomAccessFile(this.filename, "r");
      if (sizeIndicator.length() > 4L) {
         byte[] headerData = new byte[4];
         sizeIndicator.seek(0L);
         sizeIndicator.read(headerData);
         if (Arrays.equals(headerData, ELF_MAGIC)) {
            this.ELF = true;
         }
      }

      if (this.ELF) {
         sizeIndicator.seek(4L);
         byte var7 = sizeIndicator.readByte();
         this._64Bit = var7 == 2;
         sizeIndicator.seek(0L);
         ByteBuffer flags = ByteBuffer.allocate(this._64Bit ? 64 : 52);
         sizeIndicator.getChannel().read(flags, 0L);
         this.bigEndian = flags.get(5) == 2;
         flags.order(this.bigEndian ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
         this.arm = flags.get(18) == 40;
         if (this.arm) {
            int var6 = flags.getInt(this._64Bit ? 48 : 36);
            this.armSoftFloat = (var6 & 512) == 512;
            this.armHardFloat = (var6 & 1024) == 1024;
         }
      }
   }
}
