package mapped;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.nio.channels.Channels;
import org.lwjgl.stb.STBIEOFCallback;
import org.lwjgl.stb.STBIIOCallbacks;
import org.lwjgl.stb.STBIReadCallback;
import org.lwjgl.stb.STBISkipCallback;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;

public class Class7756 {
   public final int field33321;
   public final int field33322;
   private static final Object field33323 = new Object();

   public Class7756(String var1, InputStream var2) throws IOException {
      synchronized (field33323) {
         MemoryStack var6 = MemoryStack.stackPush();
         Throwable var7 = null;

         try (Class1710 var8 = method25712(var2)) {
            STBIReadCallback var10 = STBIReadCallback.create(var8::method7449);
            Throwable var11 = null;

            try {
               STBISkipCallback var12 = STBISkipCallback.create(var8::method7450);
               Throwable var13 = null;

               try {
                  STBIEOFCallback var14 = STBIEOFCallback.create(var8::method7451);
                  Throwable var15 = null;

                  try {
                     STBIIOCallbacks var16 = STBIIOCallbacks.mallocStack(var6);
                     var16.read(var10);
                     var16.skip(var12);
                     var16.eof(var14);
                     IntBuffer var17 = var6.mallocInt(1);
                     IntBuffer var18 = var6.mallocInt(1);
                     IntBuffer var19 = var6.mallocInt(1);
                     if (!STBImage.stbi_info_from_callbacks(var16, 0L, var17, var18, var19)) {
                        throw new IOException("Could not read info from the PNG file " + var1 + " " + STBImage.stbi_failure_reason());
                     }

                     this.field33321 = var17.get(0);
                     this.field33322 = var18.get(0);
                  } catch (Throwable var131) {
                     var15 = var131;
                     throw var131;
                  } finally {
                     if (var14 != null) {
                        if (var15 != null) {
                           try {
                              var14.close();
                           } catch (Throwable var130) {
                              var15.addSuppressed(var130);
                           }
                        } else {
                           var14.close();
                        }
                     }
                  }
               } catch (Throwable var133) {
                  var13 = var133;
                  throw var133;
               } finally {
                  if (var12 != null) {
                     if (var13 != null) {
                        try {
                           var12.close();
                        } catch (Throwable var129) {
                           var13.addSuppressed(var129);
                        }
                     } else {
                        var12.close();
                     }
                  }
               }
            } catch (Throwable var135) {
               var11 = var135;
               throw var135;
            } finally {
               if (var10 != null) {
                  if (var11 != null) {
                     try {
                        var10.close();
                     } catch (Throwable var128) {
                        var11.addSuppressed(var128);
                     }
                  } else {
                     var10.close();
                  }
               }
            }
         } catch (Throwable var139) {
            var7 = var139;
            throw var139;
         } finally {
            if (var6 != null) {
               if (var7 != null) {
                  try {
                     var6.close();
                  } catch (Throwable var126) {
                     var7.addSuppressed(var126);
                  }
               } else {
                  var6.close();
               }
            }
         }
      }
   }

   @Override
   public String toString() {
      return "" + this.field33321 + " x " + this.field33322;
   }

   private static Class1710 method25712(InputStream var0) {
      return (Class1710)(!(var0 instanceof FileInputStream)
         ? new Class1711(Channels.newChannel(var0))
         : new Class1712(((FileInputStream)var0).getChannel()));
   }
}
