package net.minecraft.client.renderer.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class ItemCameraTransforms
{
    public static final ItemCameraTransforms DEFAULT = new ItemCameraTransforms();
    public final ItemTransformVec3f thirdperson_left;
    public final ItemTransformVec3f thirdperson_right;
    public final ItemTransformVec3f firstperson_left;
    public final ItemTransformVec3f firstperson_right;
    public final ItemTransformVec3f head;
    public final ItemTransformVec3f gui;
    public final ItemTransformVec3f ground;
    public final ItemTransformVec3f fixed;

    private ItemCameraTransforms()
    {
        this(ItemTransformVec3f.DEFAULT, ItemTransformVec3f.DEFAULT, ItemTransformVec3f.DEFAULT, ItemTransformVec3f.DEFAULT, ItemTransformVec3f.DEFAULT, ItemTransformVec3f.DEFAULT, ItemTransformVec3f.DEFAULT, ItemTransformVec3f.DEFAULT);
    }

    public ItemCameraTransforms(ItemCameraTransforms playerIn)
    {
        this.thirdperson_left = playerIn.thirdperson_left;
        this.thirdperson_right = playerIn.thirdperson_right;
        this.firstperson_left = playerIn.firstperson_left;
        this.firstperson_right = playerIn.firstperson_right;
        this.head = playerIn.head;
        this.gui = playerIn.gui;
        this.ground = playerIn.ground;
        this.fixed = playerIn.fixed;
    }

    public ItemCameraTransforms(ItemTransformVec3f p_i1751_1_, ItemTransformVec3f p_i1751_2_, ItemTransformVec3f p_i1751_3_, ItemTransformVec3f p_i1751_4_, ItemTransformVec3f p_i1751_5_, ItemTransformVec3f p_i1751_6_, ItemTransformVec3f p_i1751_7_, ItemTransformVec3f p_i1751_8_)
    {
        this.thirdperson_left = p_i1751_1_;
        this.thirdperson_right = p_i1751_2_;
        this.firstperson_left = p_i1751_3_;
        this.firstperson_right = p_i1751_4_;
        this.head = p_i1751_5_;
        this.gui = p_i1751_6_;
        this.ground = p_i1751_7_;
        this.fixed = p_i1751_8_;
    }

    public ItemTransformVec3f getTransform(ItemCameraTransforms.TransformType type)
    {
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

    public boolean hasCustomTransform(ItemCameraTransforms.TransformType type)
    {
        return this.getTransform(type) != ItemTransformVec3f.DEFAULT;
    }

    public static class Deserializer implements JsonDeserializer<ItemCameraTransforms>
    {
        protected Deserializer()
        {
        }

        public ItemCameraTransforms deserialize(JsonElement p_deserialize_1_, Type p_deserialize_2_, JsonDeserializationContext p_deserialize_3_) throws JsonParseException
        {
            JsonObject jsonobject = p_deserialize_1_.getAsJsonObject();
            ItemTransformVec3f itemtransformvec3f = this.getTransform(p_deserialize_3_, jsonobject, "thirdperson_righthand");
            ItemTransformVec3f itemtransformvec3f1 = this.getTransform(p_deserialize_3_, jsonobject, "thirdperson_lefthand");

            if (itemtransformvec3f1 == ItemTransformVec3f.DEFAULT)
            {
                itemtransformvec3f1 = itemtransformvec3f;
            }

            ItemTransformVec3f itemtransformvec3f2 = this.getTransform(p_deserialize_3_, jsonobject, "firstperson_righthand");
            ItemTransformVec3f itemtransformvec3f3 = this.getTransform(p_deserialize_3_, jsonobject, "firstperson_lefthand");

            if (itemtransformvec3f3 == ItemTransformVec3f.DEFAULT)
            {
                itemtransformvec3f3 = itemtransformvec3f2;
            }

            ItemTransformVec3f itemtransformvec3f4 = this.getTransform(p_deserialize_3_, jsonobject, "head");
            ItemTransformVec3f itemtransformvec3f5 = this.getTransform(p_deserialize_3_, jsonobject, "gui");
            ItemTransformVec3f itemtransformvec3f6 = this.getTransform(p_deserialize_3_, jsonobject, "ground");
            ItemTransformVec3f itemtransformvec3f7 = this.getTransform(p_deserialize_3_, jsonobject, "fixed");
            return new ItemCameraTransforms(itemtransformvec3f1, itemtransformvec3f, itemtransformvec3f3, itemtransformvec3f2, itemtransformvec3f4, itemtransformvec3f5, itemtransformvec3f6, itemtransformvec3f7);
        }

        private ItemTransformVec3f getTransform(JsonDeserializationContext p_181683_1_, JsonObject p_181683_2_, String p_181683_3_)
        {
            return p_181683_2_.has(p_181683_3_) ? p_181683_1_.deserialize(p_181683_2_.get(p_181683_3_), ItemTransformVec3f.class) : ItemTransformVec3f.DEFAULT;
        }
    }

    public static enum TransformType
    {
        NONE,
        THIRD_PERSON_LEFT_HAND,
        THIRD_PERSON_RIGHT_HAND,
        FIRST_PERSON_LEFT_HAND,
        FIRST_PERSON_RIGHT_HAND,
        HEAD,
        GUI,
        GROUND,
        FIXED;
    }
}
