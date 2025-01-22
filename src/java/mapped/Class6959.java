package mapped;

import lol.LoadableImageData;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class Class6959 implements LoadableImageData {
   private ArrayList field30149 = new ArrayList();
   private LoadableImageData field30150;

   public void method21472(LoadableImageData var1) {
      this.field30149.add(var1);
   }

   @Override
   public ByteBuffer method21467(InputStream var1) throws IOException {
      return this.method21468(var1, false, null);
   }

   @Override
   public ByteBuffer method21468(InputStream var1, boolean var2, int[] var3) throws IOException {
      return this.loadImage(var1, var2, false, var3);
   }

   @Override
   public ByteBuffer loadImage(InputStream var1, boolean var2, boolean var3, int[] var4) throws IOException {
      Class2462 var7 = new Class2462();
      ByteBuffer var8 = null;
      BufferedInputStream var9 = new BufferedInputStream(var1, var1.available());
      var9.mark(var1.available());

      for (int var10 = 0; var10 < this.field30149.size(); var10++) {
         var9.reset();

         try {
            LoadableImageData var11 = (LoadableImageData)this.field30149.get(var10);
            var8 = var11.loadImage(var9, var2, var3, var4);
            this.field30150 = var11;
            break;
         } catch (Exception ignored) {
         }
      }

      if (this.field30150 == null) {
         throw var7;
      } else {
         return var8;
      }
   }

   private void method21473() {
      if (this.field30150 == null) {
         throw new RuntimeException("Attempt to make use of uninitialised or invalid composite image data");
      }
   }

   @Override
   public int method21455() {
      this.method21473();
      return this.field30150.method21455();
   }

   @Override
   public int getHeight() {
      this.method21473();
      return this.field30150.getHeight();
   }

   @Override
   public ByteBuffer method21460() {
      this.method21473();
      return this.field30150.method21460();
   }

   @Override
   public int method21459() {
      this.method21473();
      return this.field30150.method21459();
   }

   @Override
   public int method21458() {
      this.method21473();
      return this.field30150.method21458();
   }

   @Override
   public int getWidth() {
      this.method21473();
      return this.field30150.getWidth();
   }

   @Override
   public void method21466(boolean var1) {
      for (int var4 = 0; var4 < this.field30149.size(); var4++) {
         ((LoadableImageData)this.field30149.get(var4)).method21466(var1);
      }
   }
}
