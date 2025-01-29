package org.newdawn.slick.opengl;

import mapped.Class2462;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class CompositeImageData implements LoadableImageData {
   private ArrayList field30149 = new ArrayList();
   private LoadableImageData field30150;

   public void add(LoadableImageData var1) {
      this.field30149.add(var1);
   }

   @Override
   public ByteBuffer loadImage(InputStream fis) throws IOException {
      return this.loadImage(fis, false, null);
   }

   @Override
   public ByteBuffer loadImage(InputStream fis, boolean flipped, int[] transparent) throws IOException {
      return this.loadImage(fis, flipped, false, transparent);
   }

   @Override
   public ByteBuffer loadImage(InputStream fis, boolean flipped, boolean forcedAlpha, int[] transparent) throws IOException {
      Class2462 var7 = new Class2462();
      ByteBuffer var8 = null;
      BufferedInputStream var9 = new BufferedInputStream(fis, fis.available());
      var9.mark(fis.available());

      for (int var10 = 0; var10 < this.field30149.size(); var10++) {
         var9.reset();

         try {
            LoadableImageData var11 = (LoadableImageData)this.field30149.get(var10);
            var8 = var11.loadImage(var9, flipped, forcedAlpha, transparent);
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
   public int getDepth() {
      this.method21473();
      return this.field30150.getDepth();
   }

   @Override
   public int getHeight() {
      this.method21473();
      return this.field30150.getHeight();
   }

   @Override
   public ByteBuffer getImageBufferData() {
      this.method21473();
      return this.field30150.getImageBufferData();
   }

   @Override
   public int getTexHeight() {
      this.method21473();
      return this.field30150.getTexHeight();
   }

   @Override
   public int getTexWidth() {
      this.method21473();
      return this.field30150.getTexWidth();
   }

   @Override
   public int getWidth() {
      this.method21473();
      return this.field30150.getWidth();
   }

   @Override
   public void configureEdging(boolean edging) {
      for (int var4 = 0; var4 < this.field30149.size(); var4++) {
         ((LoadableImageData)this.field30149.get(var4)).configureEdging(edging);
      }
   }
}
