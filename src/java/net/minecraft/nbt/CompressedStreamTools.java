package net.minecraft.nbt;

import mapped.*;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.annotation.Nullable;

public class CompressedStreamTools {
   public static CompoundNBT readCompressed(File var0) throws IOException {
      CompoundNBT var5;
      try (FileInputStream var3 = new FileInputStream(var0)) {
         var5 = readCompressed(var3);
      }

      return var5;
   }

   public static CompoundNBT readCompressed(InputStream var0) throws IOException {
      CompoundNBT var5;
      try (DataInputStream var3 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(var0)))) {
         var5 = read(var3, NBTSizeTracker.INFINITE);
      }

      return var5;
   }

   public static void writeCompressed(CompoundNBT var0, File var1) throws IOException {
      try (FileOutputStream var4 = new FileOutputStream(var1)) {
         writeCompressed(var0, var4);
      }
   }

   public static void writeCompressed(CompoundNBT var0, OutputStream var1) throws IOException {
      try (DataOutputStream var4 = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(var1)))) {
         method31773(var0, var4);
      }
   }

   public static void write(CompoundNBT var0, File var1) throws IOException {
      try (
         FileOutputStream var4 = new FileOutputStream(var1);
         DataOutputStream var6 = new DataOutputStream(var4);
      ) {
         method31773(var0, var6);
      }
   }

   @Nullable
   public static CompoundNBT method31770(File var0) throws IOException {
      if (!var0.exists()) {
         return null;
      } else {
         CompoundNBT var7;
         try (
            FileInputStream var3 = new FileInputStream(var0);
            DataInputStream var5 = new DataInputStream(var3);
         ) {
            var7 = read(var5, NBTSizeTracker.INFINITE);
         }

         return var7;
      }
   }

   public static CompoundNBT read(DataInput var0) throws IOException {
      return read(var0, NBTSizeTracker.INFINITE);
   }

   public static CompoundNBT read(DataInput var0, NBTSizeTracker var1) throws IOException {
      INBT var4 = read(var0, 0, var1);
      if (!(var4 instanceof CompoundNBT)) {
         throw new IOException("Root tag must be a named compound tag");
      } else {
         return (CompoundNBT)var4;
      }
   }

   public static void method31773(CompoundNBT var0, DataOutput var1) throws IOException {
      writeTag(var0, var1);
   }

   private static void writeTag(INBT var0, DataOutput var1) throws IOException {
      var1.writeByte(var0.getId());
      if (var0.getId() != 0) {
         var1.writeUTF("");
         var0.write(var1);
      }
   }

   private static INBT read(DataInput var0, int var1, NBTSizeTracker var2) throws IOException {
      byte var5 = var0.readByte();
      if (var5 == 0) {
         return EndNBT.INSTANCE;
      } else {
         var0.readUTF();

         try {
            return NBTTypes.getGetTypeByID(var5).readNBT(var0, var1, var2);
         } catch (IOException var9) {
            CrashReport var7 = CrashReport.makeCrashReport(var9, "Loading NBT data");
            CrashReportCategory var8 = var7.makeCategory("NBT Tag");
            var8.addDetail("Tag type", var5);
            throw new ReportedException(var7);
         }
      }
   }
}
