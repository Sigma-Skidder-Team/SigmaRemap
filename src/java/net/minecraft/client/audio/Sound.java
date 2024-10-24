package net.minecraft.client.audio;

import mapped.Class4386;
import net.minecraft.util.ResourceLocation;

public class Sound implements ISoundEventAccessor<Sound> {
   private final ResourceLocation field29211;
   private final float field29212;
   private final float field29213;
   private final int field29214;
   private final Type field29215;
   private final boolean field29216;
   private final boolean field29217;
   private final int field29218;

   public Sound(String var1, float var2, float var3, int var4, Type var5, boolean var6, boolean var7, int var8) {
      this.field29211 = new ResourceLocation(var1);
      this.field29212 = var2;
      this.field29213 = var3;
      this.field29214 = var4;
      this.field29215 = var5;
      this.field29216 = var6;
      this.field29217 = var7;
      this.field29218 = var8;
   }

   public ResourceLocation method20291() {
      return this.field29211;
   }

   public ResourceLocation method20292() {
      return new ResourceLocation(this.field29211.getNamespace(), "sounds/" + this.field29211.getPath() + ".ogg");
   }

   public float method20293() {
      return this.field29212;
   }

   public float method20294() {
      return this.field29213;
   }

   @Override
   public int method20287() {
      return this.field29214;
   }

   public Sound method20290() {
      return this;
   }

   @Override
   public void method20289(Class4386 var1) {
      if (this.field29217) {
         var1.method13772(this);
      }
   }

   public Type method20295() {
      return this.field29215;
   }

   public boolean method20296() {
      return this.field29216;
   }

   public boolean method20297() {
      return this.field29217;
   }

   public int method20298() {
      return this.field29218;
   }

   @Override
   public String toString() {
      return "Sound[" + this.field29211 + "]";
   }

   public enum Type {
      field14506("file"),
      field14507("event");

      private final String field14508;
      private static final Type[] field14509 = new Type[]{field14506, field14507};

      private Type(String var3) {
         this.field14508 = var3;
      }

      public static Type method8948(String var0) {
         for (Type var6 : values()) {
            if (var6.field14508.equals(var0)) {
               return var6;
            }
         }

         return null;
      }
   }
}
