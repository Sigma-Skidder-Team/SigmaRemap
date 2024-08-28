package mapped;

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

public class Class8799 {
   public static Class39 method31765(File var0) throws IOException {
      Class39 var5;
      try (FileInputStream var3 = new FileInputStream(var0)) {
         var5 = method31766(var3);
      }

      return var5;
   }

   public static Class39 method31766(InputStream var0) throws IOException {
      Class39 var5;
      try (DataInputStream var3 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(var0)))) {
         var5 = method31772(var3, Class8465.field36284);
      }

      return var5;
   }

   public static void method31767(Class39 var0, File var1) throws IOException {
      try (FileOutputStream var4 = new FileOutputStream(var1)) {
         method31768(var0, var4);
      }
   }

   public static void method31768(Class39 var0, OutputStream var1) throws IOException {
      try (DataOutputStream var4 = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(var1)))) {
         method31773(var0, var4);
      }
   }

   public static void method31769(Class39 var0, File var1) throws IOException {
      try (
         FileOutputStream var4 = new FileOutputStream(var1);
         DataOutputStream var6 = new DataOutputStream(var4);
      ) {
         method31773(var0, var6);
      }
   }

   @Nullable
   public static Class39 method31770(File var0) throws IOException {
      if (!var0.exists()) {
         return null;
      } else {
         Class39 var7;
         try (
            FileInputStream var3 = new FileInputStream(var0);
            DataInputStream var5 = new DataInputStream(var3);
         ) {
            var7 = method31772(var5, Class8465.field36284);
         }

         return var7;
      }
   }

   public static Class39 method31771(DataInput var0) throws IOException {
      return method31772(var0, Class8465.field36284);
   }

   public static Class39 method31772(DataInput var0, Class8465 var1) throws IOException {
      Class30 var4 = method31775(var0, 0, var1);
      if (!(var4 instanceof Class39)) {
         throw new IOException("Root tag must be a named compound tag");
      } else {
         return (Class39)var4;
      }
   }

   public static void method31773(Class39 var0, DataOutput var1) throws IOException {
      method31774(var0, var1);
   }

   private static void method31774(Class30 var0, DataOutput var1) throws IOException {
      var1.writeByte(var0.method74());
      if (var0.method74() != 0) {
         var1.writeUTF("");
         var0.method73(var1);
      }
   }

   private static Class30 method31775(DataInput var0, int var1, Class8465 var2) throws IOException {
      byte var5 = var0.readByte();
      if (var5 == 0) {
         return Class38.field78;
      } else {
         var0.readUTF();

         try {
            return Class3571.method12200(var5).method21978(var0, var1, var2);
         } catch (IOException var9) {
            Class4526 var7 = Class4526.method14413(var9, "Loading NBT data");
            Class8965 var8 = var7.method14410("NBT Tag");
            var8.method32807("Tag type", var5);
            throw new Class2506(var7);
         }
      }
   }
}
