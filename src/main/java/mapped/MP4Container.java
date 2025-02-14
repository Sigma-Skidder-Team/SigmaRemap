package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MP4Container {
   private final MP4InputStream in;
   private final List<Box> field37153;
   private Class2036 field37154;
   private Class2036 field37155;
   private Class2036[] field37156;
   private Class5070 field37157;
   private Class5006 field37158;
   private Box moov;
   private Movie movie;

   public MP4Container(InputStream var1) throws IOException {
      this.in = new MP4InputStream(var1);
      this.field37153 = new ArrayList<Box>();
      this.readContent();
   }

   public MP4Container(RandomAccessFile var1) throws IOException {
      this.in = new MP4InputStream(var1);
      this.field37153 = new ArrayList<Box>();
      this.readContent();
   }

   private void readContent() throws IOException {
      Box var3 = null;
      boolean var4 = false;

      while (this.in.method31875()) {
         var3 = Class6412.method19535(null, this.in);
         if (this.field37153.isEmpty() && var3.method15431() != 1718909296L) {
            throw new Class2454("no MP4 signature found");
         }

         this.field37153.add(var3);
         long var5 = var3.method15431();
         if (var5 != 1718909296L) {
            if (var5 != 1836019574L) {
               if (var5 != 1885628782L) {
                  if (var5 == 1835295092L) {
                     if (var4) {
                        break;
                     }

                     if (!this.in.method31874()) {
                        throw new Class2454("movie box at end of file, need random access");
                     }
                  }
               } else if (this.field37158 == null) {
                  this.field37158 = (Class5006)var3;
               }
            } else {
               if (this.movie == null) {
                  this.moov = var3;
               }

               var4 = true;
            }
         } else if (this.field37157 == null) {
            this.field37157 = (Class5070)var3;
         }
      }
   }

   public Class2036 method30070() {
      if (this.field37154 == null) {
         this.field37154 = Class2036.method8679(this.field37157.method15504());
      }

      return this.field37154;
   }

   public Class2036 method30071() {
      if (this.field37155 == null) {
         this.field37155 = Class2036.method8679(this.field37157.method15504());
      }

      return this.field37155;
   }

   public Class2036[] method30072() {
      if (this.field37156 == null) {
         String[] var3 = this.field37157.method15506();
         this.field37156 = new Class2036[var3.length];

         for (int var4 = 0; var4 < var3.length; var4++) {
            this.field37156[var4] = Class2036.method8679(var3[var4]);
         }
      }

      return this.field37156;
   }

   public Movie getMovie() {
      if (this.moov != null) {
         if (this.movie == null) {
            this.movie = new Movie(this.moov, this.in);
         }

         return this.movie;
      } else {
         return null;
      }
   }

   public List<Box> method30074() {
      return Collections.<Box>unmodifiableList(this.field37153);
   }

   static {
      Logger var4 = Logger.getLogger("MP4 API");

      for (Handler var10 : var4.getHandlers()) {
         var4.removeHandler(var10);
      }

      var4.setLevel(Level.WARNING);
      ConsoleHandler var11 = new ConsoleHandler();
      var11.setLevel(Level.ALL);
      var4.addHandler(var11);
   }
}
