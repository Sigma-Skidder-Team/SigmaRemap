package net.minecraft.advancements.criterion;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.server.ServerWorld;

public class NetherTravelTrigger extends AbstractCriterionTrigger<NetherTravelTrigger.Instance>
{
    private static final ResourceLocation ID = new ResourceLocation("nether_travel");

    public ResourceLocation getId()
    {
        return ID;
    }

    public NetherTravelTrigger.Instance deserializeInstance(JsonObject json, JsonDeserializationContext context)
    {
        LocationPredicate locationpredicate = LocationPredicate.deserialize(json.get("entered"));
        LocationPredicate locationpredicate1 = LocationPredicate.deserialize(json.get("exited"));
        DistancePredicate distancepredicate = DistancePredicate.deserialize(json.get("distance"));
        return new NetherTravelTrigger.Instance(locationpredicate, locationpredicate1, distancepredicate);
    }

    public void trigger(ServerPlayerEntity player, Vec3d enteredNetherPosition)
    {
        this.func_227070_a_(player.getAdvancements(), (p_226945_2_) ->
        {
            return p_226945_2_.test(player.getServerWorld(), enteredNetherPosition, player.getPosX(), player.getPosY(), player.getPosZ());
        });
    }

    public static class Instance extends CriterionInstance
    {
        private final LocationPredicate entered;
        private final LocationPredicate exited;
        private final DistancePredicate distance;

        public Instance(LocationPredicate p_i2864_1_, LocationPredicate p_i2864_2_, DistancePredicate p_i2864_3_)
        {
            super(NetherTravelTrigger.ID);
            this.entered = p_i2864_1_;
            this.exited = p_i2864_2_;
            this.distance = p_i2864_3_;
        }

        public static NetherTravelTrigger.Instance forDistance(DistancePredicate p_203933_0_)
        {
            return new NetherTravelTrigger.Instance(LocationPredicate.ANY, LocationPredicate.ANY, p_203933_0_);
        }

        public boolean test(ServerWorld world, Vec3d enteredNetherPosition, double x, double y, double z)
        {
            if (!this.entered.test(world, enteredNetherPosition.x, enteredNetherPosition.y, enteredNetherPosition.z))
            {
                return false;
            }
            else if (!this.exited.test(world, x, y, z))
            {
                return false;
            }
            else
            {
                return this.distance.test(enteredNetherPosition.x, enteredNetherPosition.y, enteredNetherPosition.z, x, y, z);
            }
        }

        public JsonElement serialize()
        {
            JsonObject jsonobject = new JsonObject();
            jsonobject.add("entered", this.entered.serialize());
            jsonobject.add("exited", this.exited.serialize());
            jsonobject.add("distance", this.distance.serialize());
            return jsonobject;
        }
    }
}
