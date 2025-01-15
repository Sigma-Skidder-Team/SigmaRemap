package net.minecraft.util.datafix.versions;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;
import net.minecraft.util.datafix.TypeReferences;

public class V0703 extends Schema
{
    public V0703(int p_i1032_1_, Schema p_i1032_2_)
    {
        super(p_i1032_1_, p_i1032_2_);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema p_registerEntities_1_)
    {
        Map<String, Supplier<TypeTemplate>> map = super.registerEntities(p_registerEntities_1_);
        map.remove("EntityHorse");
        p_registerEntities_1_.register(map, "Horse", () ->
        {
            return DSL.optionalFields("ArmorItem", TypeReferences.ITEM_STACK.in(p_registerEntities_1_), "SaddleItem", TypeReferences.ITEM_STACK.in(p_registerEntities_1_), V0100.equipment(p_registerEntities_1_));
        });
        p_registerEntities_1_.register(map, "Donkey", () ->
        {
            return DSL.optionalFields("Items", DSL.list(TypeReferences.ITEM_STACK.in(p_registerEntities_1_)), "SaddleItem", TypeReferences.ITEM_STACK.in(p_registerEntities_1_), V0100.equipment(p_registerEntities_1_));
        });
        p_registerEntities_1_.register(map, "Mule", () ->
        {
            return DSL.optionalFields("Items", DSL.list(TypeReferences.ITEM_STACK.in(p_registerEntities_1_)), "SaddleItem", TypeReferences.ITEM_STACK.in(p_registerEntities_1_), V0100.equipment(p_registerEntities_1_));
        });
        p_registerEntities_1_.register(map, "ZombieHorse", () ->
        {
            return DSL.optionalFields("SaddleItem", TypeReferences.ITEM_STACK.in(p_registerEntities_1_), V0100.equipment(p_registerEntities_1_));
        });
        p_registerEntities_1_.register(map, "SkeletonHorse", () ->
        {
            return DSL.optionalFields("SaddleItem", TypeReferences.ITEM_STACK.in(p_registerEntities_1_), V0100.equipment(p_registerEntities_1_));
        });
        return map;
    }
}
