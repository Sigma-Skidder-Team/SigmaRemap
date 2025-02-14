package net.minecraft.client.renderer.model;

import com.google.gson.*;
import mapped.ItemCameraTransformsTransformType;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.math.vector.Vector3f;

import java.lang.reflect.Type;

public class ItemCameraTransforms {
   public static final ItemCameraTransforms DEFAULT = new ItemCameraTransforms();
   public final ItemTransformVec3f thirdperson_left;
   public final ItemTransformVec3f thirdperson_right;
   public final ItemTransformVec3f firstperson_left;
   public final ItemTransformVec3f firstperson_right;
   public final ItemTransformVec3f head;
   public final ItemTransformVec3f gui;
   public final ItemTransformVec3f ground;
   public final ItemTransformVec3f fixed;

   private ItemCameraTransforms() {
      this(
         ItemTransformVec3f.DEFAULT,
         ItemTransformVec3f.DEFAULT,
         ItemTransformVec3f.DEFAULT,
         ItemTransformVec3f.DEFAULT,
         ItemTransformVec3f.DEFAULT,
         ItemTransformVec3f.DEFAULT,
         ItemTransformVec3f.DEFAULT,
         ItemTransformVec3f.DEFAULT
      );
   }

   public ItemCameraTransforms(ItemCameraTransforms var1) {
      this.thirdperson_left = var1.thirdperson_left;
      this.thirdperson_right = var1.thirdperson_right;
      this.firstperson_left = var1.firstperson_left;
      this.firstperson_right = var1.firstperson_right;
      this.head = var1.head;
      this.gui = var1.gui;
      this.ground = var1.ground;
      this.fixed = var1.fixed;
   }

   public ItemCameraTransforms(ItemTransformVec3f var1, ItemTransformVec3f var2, ItemTransformVec3f var3, ItemTransformVec3f var4, ItemTransformVec3f var5, ItemTransformVec3f var6, ItemTransformVec3f var7, ItemTransformVec3f var8) {
      this.thirdperson_left = var1;
      this.thirdperson_right = var2;
      this.firstperson_left = var3;
      this.firstperson_right = var4;
      this.head = var5;
      this.gui = var6;
      this.ground = var7;
      this.fixed = var8;
   }

   public ItemTransformVec3f getTransform(ItemCameraTransformsTransformType type) {
      switch (type)
      {
         case THIRD_PERSON_LEFT_HAND:
            return this.thirdperson_left;

         case THIRD_PERSON_RIGHT_HAND:
            return this.thirdperson_right;

         case FIRST_PERSON_LEFT_HAND:
            return this.firstperson_left;

         case FIRST_PERSON_RIGHT_HAND:
            return this.firstperson_right;

         case HEAD:
            return this.head;

         case GUI:
            return this.gui;

         case GROUND:
            return this.ground;

         case FIXED:
            return this.fixed;

         default:
            return ItemTransformVec3f.DEFAULT;
      }
   }

   public boolean hasCustomTransform(ItemCameraTransformsTransformType var1) {
      return this.getTransform(var1) != ItemTransformVec3f.DEFAULT;
   }

   public static class Deserializer implements JsonDeserializer<ItemTransformVec3f> {
      private static final Vector3f field16787 = new Vector3f(0.0F, 0.0F, 0.0F);
      private static final Vector3f field16788 = new Vector3f(0.0F, 0.0F, 0.0F);
      private static final Vector3f field16789 = new Vector3f(1.0F, 1.0F, 1.0F);

      public ItemTransformVec3f deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         JsonObject var6 = var1.getAsJsonObject();
         Vector3f var7 = this.method10757(var6, "rotation", field16787);
         Vector3f var8 = this.method10757(var6, "translation", field16788);
         var8.method25272(0.0625F);
         var8.method25274(-5.0F, 5.0F);
         Vector3f var9 = this.method10757(var6, "scale", field16789);
         var9.method25274(-4.0F, 4.0F);
         return new ItemTransformVec3f(var7, var8, var9);
      }

      private Vector3f method10757(JsonObject var1, String var2, Vector3f var3) {
         if (!var1.has(var2)) {
            return var3;
         } else {
            JsonArray var6 = JSONUtils.method32785(var1, var2);
            if (var6.size() != 3) {
               throw new JsonParseException("Expected 3 " + var2 + " values, found: " + var6.size());
            } else {
               float[] var7 = new float[3];

               for (int var8 = 0; var8 < var7.length; var8++) {
                  var7[var8] = JSONUtils.method32770(var6.get(var8), var2 + "[" + var8 + "]");
               }

               return new Vector3f(var7[0], var7[1], var7[2]);
            }
         }
      }
   }

   public static class Class2566 implements JsonDeserializer<ItemCameraTransforms> {
      public ItemCameraTransforms deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         JsonObject var6 = var1.getAsJsonObject();
         ItemTransformVec3f var7 = this.method10758(var3, var6, "thirdperson_righthand");
         ItemTransformVec3f var8 = this.method10758(var3, var6, "thirdperson_lefthand");
         if (var8 == ItemTransformVec3f.DEFAULT) {
            var8 = var7;
         }

         ItemTransformVec3f var9 = this.method10758(var3, var6, "firstperson_righthand");
         ItemTransformVec3f var10 = this.method10758(var3, var6, "firstperson_lefthand");
         if (var10 == ItemTransformVec3f.DEFAULT) {
            var10 = var9;
         }

         ItemTransformVec3f var11 = this.method10758(var3, var6, "head");
         ItemTransformVec3f var12 = this.method10758(var3, var6, "gui");
         ItemTransformVec3f var13 = this.method10758(var3, var6, "ground");
         ItemTransformVec3f var14 = this.method10758(var3, var6, "fixed");
         return new ItemCameraTransforms(var8, var7, var10, var9, var11, var12, var13, var14);
      }

      private ItemTransformVec3f method10758(JsonDeserializationContext var1, JsonObject var2, String var3) {
         return !var2.has(var3) ? ItemTransformVec3f.DEFAULT : (ItemTransformVec3f)var1.deserialize(var2.get(var3), ItemTransformVec3f.class);
      }
   }
}
