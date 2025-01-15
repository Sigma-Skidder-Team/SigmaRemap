package net.minecraft.entity.ai.attributes;

import io.netty.util.internal.ThreadLocalRandom;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Supplier;
import net.minecraft.util.math.MathHelper;

public class AttributeModifier
{
    private final double amount;
    private final AttributeModifier.Operation operation;
    private final Supplier<String> name;
    private final UUID id;
    private boolean isSaved = true;

    public AttributeModifier(String p_i664_1_, double p_i664_2_, AttributeModifier.Operation p_i664_4_)
    {
        this(MathHelper.getRandomUUID(ThreadLocalRandom.current()), () ->
        {
            return p_i664_1_;
        }, p_i664_2_, p_i664_4_);
    }

    public AttributeModifier(UUID p_i665_1_, String p_i665_2_, double p_i665_3_, AttributeModifier.Operation p_i665_5_)
    {
        this(p_i665_1_, () ->
        {
            return p_i665_2_;
        }, p_i665_3_, p_i665_5_);
    }

    public AttributeModifier(UUID p_i666_1_, Supplier<String> p_i666_2_, double p_i666_3_, AttributeModifier.Operation p_i666_5_)
    {
        this.id = p_i666_1_;
        this.name = p_i666_2_;
        this.amount = p_i666_3_;
        this.operation = p_i666_5_;
    }

    public UUID getID()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name.get();
    }

    public AttributeModifier.Operation getOperation()
    {
        return this.operation;
    }

    public double getAmount()
    {
        return this.amount;
    }

    public boolean isSaved()
    {
        return this.isSaved;
    }

    public AttributeModifier setSaved(boolean saved)
    {
        this.isSaved = saved;
        return this;
    }

    public boolean equals(Object p_equals_1_)
    {
        if (this == p_equals_1_)
        {
            return true;
        }
        else if (p_equals_1_ != null && this.getClass() == p_equals_1_.getClass())
        {
            AttributeModifier attributemodifier = (AttributeModifier)p_equals_1_;
            return Objects.equals(this.id, attributemodifier.id);
        }
        else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return this.id != null ? this.id.hashCode() : 0;
    }

    public String toString()
    {
        return "AttributeModifier{amount=" + this.amount + ", operation=" + this.operation + ", name='" + (String)this.name.get() + '\'' + ", id=" + this.id + ", serialize=" + this.isSaved + '}';
    }

    public static enum Operation
    {
        ADDITION(0),
        MULTIPLY_BASE(1),
        MULTIPLY_TOTAL(2);

        private static final AttributeModifier.Operation[] VALUES = new AttributeModifier.Operation[]{ADDITION, MULTIPLY_BASE, MULTIPLY_TOTAL};
        private final int id;

        private Operation(int p_i1779_3_)
        {
            this.id = p_i1779_3_;
        }

        public int getId()
        {
            return this.id;
        }

        public static AttributeModifier.Operation byId(int id)
        {
            if (id >= 0 && id < VALUES.length)
            {
                return VALUES[id];
            }
            else
            {
                throw new IllegalArgumentException("No operation with value " + id);
            }
        }
    }
}
