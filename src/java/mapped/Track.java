package mapped;

import java.io.EOFException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Track {
   private final MP4InputStream field31473;
   public final TrackHeaderBox field31474;
   private final Class5035 field31475;
   private final boolean field31476;
   private final List<Frame> field31477;
   private URL field31478;
   private int field31479;
   public AudioByteManager.BinaryDataDescriptor field31480;
   public Class8307 field31481;
   public Protection field31482;

   public Track(Box var1, MP4InputStream var2) {
      this.field31473 = var2;
      this.field31474 = (TrackHeaderBox)var1.method15438(1953196132L);
      Box var5 = var1.method15438(1835297121L);
      this.field31475 = (Class5035)var5.method15438(1835296868L);
      Box var6 = var5.method15438(1835626086L);
      Box var7 = var6.method15438(1684631142L);
      Class5029 var8 = (Class5029)var7.method15438(1685218662L);
      if (var8.method15437(1970433056L)) {
         Class4999 var9 = (Class4999)var8.method15438(1970433056L);
         this.field31476 = var9.method15350();
         if (!this.field31476) {
            try {
               this.field31478 = new URL(var9.method15351());
            } catch (MalformedURLException var11) {
               Logger.getLogger("MP4 API").log(Level.WARNING, "Parsing URL-Box failed: {0}, url: {1}", new String[]{var11.toString(), var9.method15351()});
               this.field31478 = null;
            }
         }
      } else {
         this.field31476 = true;
         this.field31478 = null;
      }

      Box var12 = var6.method15438(1937007212L);
      if (var12.method15436()) {
         this.field31477 = new ArrayList<Frame>();
         this.method23307(var12);
      } else {
         this.field31477 = Collections.<Frame>emptyList();
      }

      this.field31479 = 0;
   }

   private void method23307(Box var1) {
      double var4 = (double)this.field31475.method15411();
      Type var6 = this.getType();
      long[] var7 = ((Class4996)var1.method15438(1937011578L)).method15343();
      Class5012 var8;
      if (!var1.method15437(1937007471L)) {
         var8 = (Class5012)var1.method15438(1668232756L);
      } else {
         var8 = (Class5012)var1.method15438(1937007471L);
      }

      long[] var9 = var8.method15367();
      Class5013 var10 = (Class5013)var1.method15438(1937011555L);
      long[] var11 = var10.method15368();
      long[] var12 = var10.method15369();
      Class5018 var13 = (Class5018)var1.method15438(1937011827L);
      long[] var14 = var13.method15378();
      long[] var15 = var13.method15379();
      long[] var16 = new long[var7.length];
      long var17 = 0L;
      int var19 = 0;

      for (int var20 = 0; var20 < var14.length; var20++) {
         for (int var24 = 0; (long)var24 < var14[var20]; var24++) {
            var16[var19 + var24] = var17;
            var17 += var15[var20];
         }

         var19 = (int)((long)var19 + var14[var20]);
      }

      int var29 = 0;
      long var21 = 0L;

      for (int var23 = 0; var23 < var11.length; var23++) {
         int var31;
         if (var23 >= var11.length - 1) {
            var31 = var9.length;
         } else {
            var31 = (int)var11[var23 + 1] - 1;
         }

         for (int var25 = (int)var11[var23] - 1; var25 < var31; var25++) {
            var21 = var9[var25];

            for (int var26 = 0; (long)var26 < var12[var23]; var26++) {
               double var27 = (double)var16[var29] / var4;
               this.field31477.add(new Frame(var6, var21, var7[var29], var27));
               var21 += var7[var29];
               var29++;
            }
         }
      }

      Collections.sort(this.field31477);
   }

   public void method23308(Class5086 var1) {
      AudioByteManager.TextDescriptor var4 = var1.method15544();

      for (AudioByteManager var7 : var4.getChildDescriptors()) {
         for (AudioByteManager var10 : var7.getChildDescriptors()) {
            switch (var10.getDescriptorType()) {
               case 5:
                  this.field31480 = (AudioByteManager.BinaryDataDescriptor)var10;
            }
         }
      }
   }

   public <T> void method23309(Box var1, Class<T> var2) {
      try {
         Object var5 = var2.newInstance();
         if (var1.getClass().isInstance(var5)) {
            System.out.println("true");
         }
      } catch (InstantiationException var7) {
         var7.printStackTrace();
      } catch (IllegalAccessException var8) {
         var8.printStackTrace();
      }
   }

   public abstract Type getType();

   public abstract Codec getCodec();

   public boolean method23312() {
      return this.field31474.method15560();
   }

   public boolean method23313() {
      return this.field31474.method15561();
   }

   public boolean method23314() {
      return this.field31474.method15562();
   }

   public Date method23315() {
      return Class9362.method35458(this.field31474.method15563());
   }

   public Date method23316() {
      return Class9362.method35458(this.field31474.method15564());
   }

   public Locale method23317() {
      return new Locale(this.field31475.method15413());
   }

   public boolean method23318() {
      return this.field31476;
   }

   public URL method23319() {
      return this.field31478;
   }

   public byte[] getDecoderSpecificInfo() {
      return this.field31480.getBinaryData();
   }

   public Class8307 method23321() {
      return this.field31481;
   }

   public Protection method23322() {
      return this.field31482;
   }

   public boolean hasMoreFrames() {
      return this.field31479 < this.field31477.size();
   }

   public Frame readNextFrame() throws IOException {
      Frame var3 = null;
      if (this.hasMoreFrames()) {
         var3 = this.field31477.get(this.field31479);
         if (var3.method8278() < this.field31473.getPosition()) {
            this.field31473.method31877();
         }

         long var4 = var3.method8278() - this.field31473.getPosition();
         if (var4 > 0L) {
            this.field31473.skipBytes(var4);
         } else if (var4 < 0L) {
            if (!this.field31473.method31874()) {
               Logger.getLogger("MP4 API")
                  .log(
                     Level.WARNING,
                     "readNextFrame failed: frame {0} already skipped, offset:{1}, stream:{2}",
                     new Object[]{this.field31479, var3.method8278(), this.field31473.getPosition()}
                  );
               throw new IOException("frame already skipped and no random access");
            }

            this.field31473.method31873(var3.method8278());
         }

         byte[] var6 = new byte[(int)var3.method8279()];

         try {
            this.field31473.readBytes(var6);
         } catch (EOFException var8) {
            Logger.getLogger("MP4 API")
               .log(Level.WARNING, "readNextFrame failed: tried to read {0} bytes at {1}", new Long[]{var3.method8279(), this.field31473.getPosition()});
            throw var8;
         }

         var3.method8281(var6);
         this.field31479++;
      }

      return var3;
   }

   public double seek(double var1) {
      if (var1 > this.method23326()) {
         return this.getNextTimeStamp();
      } else {
         Frame var5 = null;

         for (int var6 = 0; var6 < this.field31477.size(); var6++) {
            var5 = this.field31477.get(var6++);
            if (var5.method8280() > var1) {
               this.field31479 = var6;
               break;
            }
         }

         return var5 != null ? var5.method8280() : -1.0;
      }
   }

   public double method23326() {
      double var3 = 0.0;
      Object var5 = null;

      for (int var6 = 0; var6 < this.field31477.size(); var6++) {
         var5 = this.field31477.get(var6++);

         try {
            if (((Frame)var5).method8278() <= this.field31473.getPosition() + this.field31473.method31872()) {
               var3 = Math.max(((Frame)var5).method8280(), var3);
            }
         } catch (IOException var8) {
            var8.printStackTrace();
         }
      }

      return var3;
   }

   public double getNextTimeStamp() {
      return this.field31477.get(Math.min(this.field31479, this.field31477.size() - 1)).method8280();
   }
}
