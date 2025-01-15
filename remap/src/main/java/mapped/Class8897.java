// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import net.minecraft.entity.Entity;

import java.util.Random;
import java.util.Map;

public class Class8897
{
    private static final Map<Class7499<?>, Class8449> field37407;
    
    private static <T extends Class759> void method31327(final Class7499<T> class7499, final Class2194 class7500, final Class2020 class7501, final Class5762<T> class7502) {
        if (Class8897.field37407.put(class7499, new Class8449(class7501, class7500, class7502)) == null) {
            return;
        }
        throw new IllegalStateException("Duplicate registration for type " + Class90.field210.method503(class7499));
    }
    
    public static Class2194 method31328(final Class7499<?> class7499) {
        final Class8449 class7500 = Class8897.field37407.get(class7499);
        return (class7500 != null) ? Class8449.method28192(class7500) : Class2194.field13356;
    }
    
    public static Class2020 method31329(final Class7499<?> class7499) {
        final Class8449 class7500 = Class8897.field37407.get(class7499);
        return (class7500 != null) ? Class8449.method28193(class7500) : Class2020.field11526;
    }
    
    public static <T extends Entity> boolean method31330(final Class7499<T> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        final Class8449 class7503 = Class8897.field37407.get(class7499);
        return class7503 == null || Class8449.method28194(class7503).method17152(class7499, class7500, class7501, class7502, random);
    }
    
    static {
        field37407 = Maps.newHashMap();
        method31327(Class7499.field28967, Class2194.field13355, Class2020.field11526, Class833::method4952);
        method31327(Class7499.field28971, Class2194.field13355, Class2020.field11526, Class840::method5009);
        method31327(Class7499.field28973, Class2194.field13355, Class2020.field11526, Class830::method4942);
        method31327(Class7499.field28988, Class2194.field13355, Class2020.field11526, Class844::method5064);
        method31327(Class7499.field29013, Class2194.field13355, Class2020.field11526, Class833::method4952);
        method31327(Class7499.field29018, Class2194.field13355, Class2020.field11526, Class833::method4952);
        method31327(Class7499.field29031, Class2194.field13355, Class2020.field11526, Class839::method4998);
        method31327(Class7499.field29034, Class2194.field13355, Class2020.field11526, Class833::method4952);
        method31327(Class7499.field28960, Class2194.field13354, Class2020.field11526, Class856::method5146);
        method31327(Class7499.field28962, Class2194.field13354, Class2020.field11526, Class763::method4231);
        method31327(Class7499.field28965, Class2194.field13354, Class2020.field11526, Class763::method4230);
        method31327(Class7499.field28966, Class2194.field13354, Class2020.field11526, Class789::method4356);
        method31327(Class7499.field28968, Class2194.field13354, Class2020.field11526, Class789::method4356);
        method31327(Class7499.field28969, Class2194.field13354, Class2020.field11526, Class763::method4230);
        method31327(Class7499.field28970, Class2194.field13354, Class2020.field11526, Class789::method4356);
        method31327(Class7499.field28977, Class2194.field13354, Class2020.field11526, Class763::method4230);
        method31327(Class7499.field28978, Class2194.field13354, Class2020.field11526, Class842::method5035);
        method31327(Class7499.field28976, Class2194.field13354, Class2020.field11526, Class759::method4178);
        method31327(Class7499.field28986, Class2194.field13354, Class2020.field11526, Class761::method4225);
        method31327(Class7499.field28987, Class2194.field13354, Class2020.field11526, Class763::method4230);
        method31327(Class7499.field28989, Class2194.field13354, Class2020.field11526, Class789::method4356);
        method31327(Class7499.field28990, Class2194.field13354, Class2020.field11526, Class829::method4941);
        method31327(Class7499.field29043, Class2194.field13354, Class2020.field11526, Class759::method4178);
        method31327(Class7499.field28996, Class2194.field13354, Class2020.field11526, Class789::method4356);
        method31327(Class7499.field28998, Class2194.field13354, Class2020.field11526, Class854::method5143);
        method31327(Class7499.field29007, Class2194.field13354, Class2020.field11526, Class805::method4705);
        method31327(Class7499.field29006, Class2194.field13354, Class2020.field11526, Class789::method4356);
        method31327(Class7499.field29008, Class2194.field13354, Class2020.field11525, Class817::method4814);
        method31327(Class7499.field29011, Class2194.field13354, Class2020.field11525, Class796::method4497);
        method31327(Class7499.field29012, Class2194.field13354, Class2020.field11526, Class789::method4356);
        method31327(Class7499.field29045, Class2194.field13354, Class2020.field11526, Class777::method4309);
        method31327(Class7499.field29015, Class2194.field13354, Class2020.field11526, Class790::method4366);
        method31327(Class7499.field29017, Class2194.field13354, Class2020.field11526, Class792::method4447);
        method31327(Class7499.field29019, Class2194.field13354, Class2020.field11526, Class789::method4356);
        method31327(Class7499.field29022, Class2194.field13354, Class2020.field11526, Class848::method5070);
        method31327(Class7499.field29023, Class2194.field13354, Class2020.field11526, Class763::method4230);
        method31327(Class7499.field29024, Class2194.field13354, Class2020.field11526, Class789::method4356);
        method31327(Class7499.field29025, Class2194.field13354, Class2020.field11526, Class853::method5139);
        method31327(Class7499.field29027, Class2194.field13354, Class2020.field11526, Class759::method4178);
        method31327(Class7499.field29030, Class2194.field13354, Class2020.field11526, Class763::method4230);
        method31327(Class7499.field29032, Class2194.field13354, Class2020.field11526, Class783::method4331);
        method31327(Class7499.field29035, Class2194.field13354, Class2020.field11526, Class793::method4464);
        method31327(Class7499.field29042, Class2194.field13354, Class2020.field11526, Class759::method4178);
        method31327(Class7499.field29047, Class2194.field13354, Class2020.field11526, Class763::method4230);
        method31327(Class7499.field29048, Class2194.field13354, Class2020.field11526, Class763::method4230);
        method31327(Class7499.field29049, Class2194.field13354, Class2020.field11526, Class763::method4230);
        method31327(Class7499.field29051, Class2194.field13354, Class2020.field11526, Class789::method4356);
        method31327(Class7499.field29052, Class2194.field13354, Class2020.field11526, Class763::method4230);
        method31327(Class7499.field29053, Class2194.field13354, Class2020.field11526, Class789::method4356);
        method31327(Class7499.field29014, Class2194.field13354, Class2020.field11526, Class828::method4935);
        method31327(Class7499.field29054, Class2194.field13354, Class2020.field11526, Class763::method4230);
        method31327(Class7499.field28964, Class2194.field13354, Class2020.field11526, Class789::method4356);
        method31327(Class7499.field28974, Class2194.field13355, Class2020.field11526, Class844::method5064);
        method31327(Class7499.field28980, Class2194.field13356, Class2020.field11526, Class763::method4230);
        method31327(Class7499.field28985, Class2194.field13356, Class2020.field11526, Class789::method4356);
        method31327(Class7499.field28991, Class2194.field13356, Class2020.field11526, Class763::method4230);
        method31327(Class7499.field29010, Class2194.field13356, Class2020.field11526, Class789::method4356);
        method31327(Class7499.field29055, Class2194.field13356, Class2020.field11526, Class759::method4178);
        method31327(Class7499.field29056, Class2194.field13356, Class2020.field11526, Class763::method4230);
        method31327(Class7499.field29020, Class2194.field13356, Class2020.field11526, Class759::method4178);
        method31327(Class7499.field29033, Class2194.field13356, Class2020.field11526, Class789::method4356);
        method31327(Class7499.field29041, Class2194.field13356, Class2020.field11526, Class763::method4230);
        method31327(Class7499.field29044, Class2194.field13356, Class2020.field11526, Class763::method4230);
        method31327(Class7499.field29046, Class2194.field13356, Class2020.field11526, Class759::method4178);
    }
}
