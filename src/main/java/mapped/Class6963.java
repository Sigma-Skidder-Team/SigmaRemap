package mapped;

import net.minecraft.util.ResourceLocation;

import java.util.Properties;

public class Class6963 {
   private String field30166;
   private ResourceLocation[] field30167;
   private int field30168 = 1;
   private int field30169 = 64;
   private int field30170 = 3;
   private int field30171 = 3;
   private int field30172 = -2130706433;
   private int field30173 = 16777215;
   private int field30174 = 0;
   private int field30175 = Integer.MIN_VALUE;

   public Class6963(String var1, Properties var2) {
      Class8896 var5 = new Class8896("CustomPanorama");
      this.field30166 = var1;
      this.field30167 = new ResourceLocation[6];

      for (int var6 = 0; var6 < this.field30167.length; var6++) {
         this.field30167[var6] = new ResourceLocation(var1 + "/panorama_" + var6 + ".png");
      }

      this.field30168 = var5.method32398(var2.getProperty("weight"), 1);
      this.field30169 = var5.method32398(var2.getProperty("blur1"), 64);
      this.field30170 = var5.method32398(var2.getProperty("blur2"), 3);
      this.field30171 = var5.method32398(var2.getProperty("blur3"), 3);
      this.field30172 = Class8896.method32409(var2.getProperty("overlay1.top"), -2130706433);
      this.field30173 = Class8896.method32409(var2.getProperty("overlay1.bottom"), 16777215);
      this.field30174 = Class8896.method32409(var2.getProperty("overlay2.top"), 0);
      this.field30175 = Class8896.method32409(var2.getProperty("overlay2.bottom"), Integer.MIN_VALUE);
   }

   public ResourceLocation[] method21478() {
      return this.field30167;
   }

   public int method21479() {
      return this.field30168;
   }

   public int method21480() {
      return this.field30169;
   }

   public int method21481() {
      return this.field30170;
   }

   public int method21482() {
      return this.field30171;
   }

   public int method21483() {
      return this.field30172;
   }

   public int method21484() {
      return this.field30173;
   }

   public int method21485() {
      return this.field30174;
   }

   public int method21486() {
      return this.field30175;
   }

   @Override
   public String toString() {
      return ""
         + this.field30166
         + ", weight: "
         + this.field30168
         + ", blur: "
         + this.field30169
         + " "
         + this.field30170
         + " "
         + this.field30171
         + ", overlay: "
         + this.field30172
         + " "
         + this.field30173
         + " "
         + this.field30174
         + " "
         + this.field30175;
   }
}
