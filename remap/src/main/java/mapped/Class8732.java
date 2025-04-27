// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import javax.annotation.Nullable;
import java.util.Random;

public class Class8732
{
    private final Class6213 field36679;
    private final Class6213 field36680;
    private final BlockState field36681;
    private final CompoundNBT field36682;
    
    public Class8732(final Class6213 class6213, final Class6213 class6214, final BlockState class6215) {
        this(class6213, class6214, class6215, null);
    }
    
    public Class8732(final Class6213 field36679, final Class6213 field36680, final BlockState field36681, final CompoundNBT field36682) {
        this.field36679 = field36679;
        this.field36680 = field36680;
        this.field36681 = field36681;
        this.field36682 = field36682;
    }
    
    public boolean method30162(final BlockState class7096, final BlockState class7097, final Random random) {
        return this.field36679.method18485(class7096, random) && this.field36680.method18485(class7097, random);
    }
    
    public BlockState method30163() {
        return this.field36681;
    }
    
    @Nullable
    public CompoundNBT method30164() {
        return this.field36682;
    }
    
    public <T> Dynamic<T> method30165(final DynamicOps<T> dynamicOps) {
        final Object map = dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("input_predicate"), this.field36679.method18488((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps).getValue(), dynamicOps.createString("location_predicate"), this.field36680.method18488((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps).getValue(), dynamicOps.createString("output_state"), BlockState.serialize((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps, this.field36681).getValue()));
        return (Dynamic<T>)((this.field36682 != null) ? new Dynamic(dynamicOps, dynamicOps.mergeInto(map, dynamicOps.createString("output_nbt"), new Dynamic(Class8453.field34721, this.field36682).convert(dynamicOps).getValue())) : new Dynamic(dynamicOps, map));
    }
    
    public static <T> Class8732 method30166(final Dynamic<T> dynamic) {
        return new Class8732(Class7754.method24753((com.mojang.datafixers.Dynamic<Object>)dynamic.get("input_predicate").orElseEmptyMap(), Registry.field232, "predicate_type", Class6215.field25064), Class7754.method24753((com.mojang.datafixers.Dynamic<Object>)dynamic.get("location_predicate").orElseEmptyMap(), Registry.field232, "predicate_type", Class6215.field25064), BlockState.deserialize((com.mojang.datafixers.Dynamic<Object>)dynamic.get("output_state").orElseEmptyMap()), dynamic.get("output_nbt").map(dynamic2 -> dynamic2.convert((DynamicOps)Class8453.field34721).getValue()).orElse(null));
    }
}
