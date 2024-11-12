package org.newdawn.slick;

public interface Font {
   int getWidth(String var1);

   int getHeight(String var1);

   int getLineHeight();

   void drawString(float var1, float var2, String var3);

   void drawString(float var1, float var2, String var3, Color var4);

   void drawString(float var1, float var2, String var3, Color var4, int var5, int var6);
}
