package org.newdawn.slick.opengl.renderer;

import lol.*;

public class Renderer {
   public static final int field35354 = 1;
   public static final int field35355 = 2;
   public static final int field35356 = 3;
   public static final int field35357 = 4;
   private static SGL field35358 = new ImmediateModeOGLRenderer();
   private static LineStripRenderer field35359 = new DefaultLineStripRenderer();

   public static void method28666(int var0) {
      switch (var0) {
         case 1:
            method28669(new ImmediateModeOGLRenderer());
            return;
         case 2:
            method28669(new VAOGLRenderer());
            return;
         default:
            throw new RuntimeException("Unknown renderer type: " + var0);
      }
   }

   public static void method28667(int var0) {
      switch (var0) {
         case 3:
            method28668(new DefaultLineStripRenderer());
            return;
         case 4:
            method28668(new QuadBasedLineStripRenderer());
            return;
         default:
            throw new RuntimeException("Unknown line strip renderer type: " + var0);
      }
   }

   public static void method28668(LineStripRenderer var0) {
      field35359 = var0;
   }

   public static void method28669(SGL var0) {
      field35358 = var0;
   }

   public static SGL get() {
      return field35358;
   }

   public static LineStripRenderer method28671() {
      return field35359;
   }
}
