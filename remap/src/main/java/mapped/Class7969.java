// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;

import java.util.Map;

public class Class7969
{
    private static String[] field32746;
    private static final Map<Class3833, Class6332> field32747;
    private static final Map<Class7255, Class6332> field32748;
    private static boolean field32749;
    
    public static Class6332 method25824(final Class7096 class7096) {
        final Class3833 method21696 = class7096.method21696();
        if (!(method21696 instanceof Class3972)) {
            final Class6332 class7097 = Class7969.field32747.get(method21696);
            return (class7097 == null) ? Class6332.method18761() : class7097;
        }
        return Class7969.field32749 ? Class6332.method18762() : Class6332.method18761();
    }
    
    public static Class6332 method25825(final Class7096 class7096) {
        return (method25824(class7096) != Class6332.method18765()) ? Class8752.method30264() : Class8752.method30265();
    }
    
    public static Class6332 method25826(final ItemStack class8321) {
        final Class3820 method27622 = class8321.method27622();
        if (!(method27622 instanceof Class4036)) {
            return Class8752.method30265();
        }
        return method25825(((Class4036)method27622).method12240().method11878());
    }
    
    public static Class6332 method25827(final Class7099 class7099) {
        final Class6332 class7100 = Class7969.field32748.get(class7099.method21779());
        return (class7100 == null) ? Class6332.method18761() : class7100;
    }
    
    public static void method25828(final boolean field32749) {
        Class7969.field32749 = field32749;
    }
    
    static {
        field32747 = Class8349.method27851(Maps.newHashMap(), hashMap -> {
            Class6332.method18762();
            final Class6332 value;
            hashMap.put(Class7521.field29155, value);
            hashMap.put(Class7521.field29381, value);
            hashMap.put(Class7521.field29382, value);
            hashMap.put(Class7521.field29410, value);
            hashMap.put(Class7521.field29475, value);
            hashMap.put(Class7521.field29208, value);
            hashMap.put(Class7521.field29205, value);
            hashMap.put(Class7521.field29206, value);
            hashMap.put(Class7521.field29209, value);
            hashMap.put(Class7521.field29207, value);
            hashMap.put(Class7521.field29210, value);
            Class6332.method18763();
            final Class6332 value2;
            hashMap.put(Class7521.field29166, value2);
            hashMap.put(Class7521.field29167, value2);
            hashMap.put(Class7521.field29168, value2);
            hashMap.put(Class7521.field29169, value2);
            hashMap.put(Class7521.field29170, value2);
            hashMap.put(Class7521.field29171, value2);
            hashMap.put(Class7521.field29213, value2);
            hashMap.put(Class7521.field29221, value2);
            hashMap.put(Class7521.field29222, value2);
            hashMap.put(Class7521.field29223, value2);
            hashMap.put(Class7521.field29224, value2);
            hashMap.put(Class7521.field29225, value2);
            hashMap.put(Class7521.field29226, value2);
            hashMap.put(Class7521.field29227, value2);
            hashMap.put(Class7521.field29228, value2);
            hashMap.put(Class7521.field29229, value2);
            hashMap.put(Class7521.field29230, value2);
            hashMap.put(Class7521.field29231, value2);
            hashMap.put(Class7521.field29232, value2);
            hashMap.put(Class7521.field29233, value2);
            hashMap.put(Class7521.field29234, value2);
            hashMap.put(Class7521.field29235, value2);
            hashMap.put(Class7521.field29236, value2);
            hashMap.put(Class7521.field29237, value2);
            hashMap.put(Class7521.field29238, value2);
            hashMap.put(Class7521.field29240, value2);
            hashMap.put(Class7521.field29241, value2);
            hashMap.put(Class7521.field29242, value2);
            hashMap.put(Class7521.field29243, value2);
            hashMap.put(Class7521.field29244, value2);
            hashMap.put(Class7521.field29245, value2);
            hashMap.put(Class7521.field29265, value2);
            hashMap.put(Class7521.field29266, value2);
            hashMap.put(Class7521.field29267, value2);
            hashMap.put(Class7521.field29268, value2);
            hashMap.put(Class7521.field29269, value2);
            hashMap.put(Class7521.field29270, value2);
            hashMap.put(Class7521.field29271, value2);
            hashMap.put(Class7521.field29272, value2);
            hashMap.put(Class7521.field29273, value2);
            hashMap.put(Class7521.field29274, value2);
            hashMap.put(Class7521.field29275, value2);
            hashMap.put(Class7521.field29276, value2);
            hashMap.put(Class7521.field29277, value2);
            hashMap.put(Class7521.field29278, value2);
            hashMap.put(Class7521.field29279, value2);
            hashMap.put(Class7521.field29287, value2);
            hashMap.put(Class7521.field29288, value2);
            hashMap.put(Class7521.field29289, value2);
            hashMap.put(Class7521.field29290, value2);
            hashMap.put(Class7521.field29293, value2);
            hashMap.put(Class7521.field29297, value2);
            hashMap.put(Class7521.field29306, value2);
            hashMap.put(Class7521.field29307, value2);
            hashMap.put(Class7521.field29308, value2);
            hashMap.put(Class7521.field29318, value2);
            hashMap.put(Class7521.field29326, value2);
            hashMap.put(Class7521.field29327, value2);
            hashMap.put(Class7521.field29332, value2);
            hashMap.put(Class7521.field29334, value2);
            hashMap.put(Class7521.field29345, value2);
            hashMap.put(Class7521.field29362, value2);
            hashMap.put(Class7521.field29363, value2);
            hashMap.put(Class7521.field29364, value2);
            hashMap.put(Class7521.field29365, value2);
            hashMap.put(Class7521.field29366, value2);
            hashMap.put(Class7521.field29367, value2);
            hashMap.put(Class7521.field29384, value2);
            hashMap.put(Class7521.field29385, value2);
            hashMap.put(Class7521.field29386, value2);
            hashMap.put(Class7521.field29387, value2);
            hashMap.put(Class7521.field29388, value2);
            hashMap.put(Class7521.field29393, value2);
            hashMap.put(Class7521.field29397, value2);
            hashMap.put(Class7521.field29399, value2);
            hashMap.put(Class7521.field29406, value2);
            hashMap.put(Class7521.field29417, value2);
            hashMap.put(Class7521.field29420, value2);
            hashMap.put(Class7521.field29421, value2);
            hashMap.put(Class7521.field29422, value2);
            hashMap.put(Class7521.field29423, value2);
            hashMap.put(Class7521.field29424, value2);
            hashMap.put(Class7521.field29425, value2);
            hashMap.put(Class7521.field29426, value2);
            hashMap.put(Class7521.field29427, value2);
            hashMap.put(Class7521.field29428, value2);
            hashMap.put(Class7521.field29429, value2);
            hashMap.put(Class7521.field29430, value2);
            hashMap.put(Class7521.field29431, value2);
            hashMap.put(Class7521.field29432, value2);
            hashMap.put(Class7521.field29433, value2);
            hashMap.put(Class7521.field29434, value2);
            hashMap.put(Class7521.field29435, value2);
            hashMap.put(Class7521.field29436, value2);
            hashMap.put(Class7521.field29437, value2);
            hashMap.put(Class7521.field29438, value2);
            hashMap.put(Class7521.field29439, value2);
            hashMap.put(Class7521.field29440, value2);
            hashMap.put(Class7521.field29441, value2);
            hashMap.put(Class7521.field29442, value2);
            hashMap.put(Class7521.field29443, value2);
            hashMap.put(Class7521.field29444, value2);
            hashMap.put(Class7521.field29445, value2);
            hashMap.put(Class7521.field29446, value2);
            hashMap.put(Class7521.field29471, value2);
            hashMap.put(Class7521.field29480, value2);
            hashMap.put(Class7521.field29518, value2);
            hashMap.put(Class7521.field29549, value2);
            hashMap.put(Class7521.field29550, value2);
            hashMap.put(Class7521.field29551, value2);
            hashMap.put(Class7521.field29552, value2);
            hashMap.put(Class7521.field29553, value2);
            hashMap.put(Class7521.field29554, value2);
            hashMap.put(Class7521.field29624, value2);
            hashMap.put(Class7521.field29625, value2);
            hashMap.put(Class7521.field29626, value2);
            hashMap.put(Class7521.field29627, value2);
            hashMap.put(Class7521.field29628, value2);
            hashMap.put(Class7521.field29629, value2);
            hashMap.put(Class7521.field29630, value2);
            hashMap.put(Class7521.field29631, value2);
            hashMap.put(Class7521.field29636, value2);
            hashMap.put(Class7521.field29713, value2);
            hashMap.put(Class7521.field29714, value2);
            hashMap.put(Class7521.field29716, value2);
            hashMap.put(Class7521.field29727, value2);
            hashMap.put(Class7521.field29728, value2);
            hashMap.put(Class7521.field29729, value2);
            hashMap.put(Class7521.field29730, value2);
            hashMap.put(Class7521.field29731, value2);
            hashMap.put(Class7521.field29732, value2);
            hashMap.put(Class7521.field29733, value2);
            hashMap.put(Class7521.field29734, value2);
            hashMap.put(Class7521.field29735, value2);
            hashMap.put(Class7521.field29736, value2);
            hashMap.put(Class7521.field29737, value2);
            hashMap.put(Class7521.field29738, value2);
            hashMap.put(Class7521.field29739, value2);
            hashMap.put(Class7521.field29740, value2);
            hashMap.put(Class7521.field29741, value2);
            hashMap.put(Class7521.field29742, value2);
            hashMap.put(Class7521.field29743, value2);
            hashMap.put(Class7521.field29744, value2);
            hashMap.put(Class7521.field29745, value2);
            hashMap.put(Class7521.field29746, value2);
            hashMap.put(Class7521.field29747, value2);
            hashMap.put(Class7521.field29748, value2);
            hashMap.put(Class7521.field29749, value2);
            hashMap.put(Class7521.field29750, value2);
            hashMap.put(Class7521.field29751, value2);
            hashMap.put(Class7521.field29752, value2);
            hashMap.put(Class7521.field29753, value2);
            hashMap.put(Class7521.field29754, value2);
            hashMap.put(Class7521.field29755, value2);
            hashMap.put(Class7521.field29756, value2);
            hashMap.put(Class7521.field29757, value2);
            hashMap.put(Class7521.field29759, value2);
            hashMap.put(Class7521.field29760, value2);
            hashMap.put(Class7521.field29761, value2);
            hashMap.put(Class7521.field29762, value2);
            hashMap.put(Class7521.field29805, value2);
            hashMap.put(Class7521.field29815, value2);
            hashMap.put(Class7521.field29817, value2);
            hashMap.put(Class7521.field29818, value2);
            hashMap.put(Class7521.field29819, value2);
            Class6332.method18765();
            final Class6332 value3;
            hashMap.put(Class7521.field29330, value3);
            hashMap.put(Class7521.field29341, value3);
            hashMap.put(Class7521.field29346, value3);
            hashMap.put(Class7521.field29347, value3);
            hashMap.put(Class7521.field29348, value3);
            hashMap.put(Class7521.field29349, value3);
            hashMap.put(Class7521.field29350, value3);
            hashMap.put(Class7521.field29351, value3);
            hashMap.put(Class7521.field29352, value3);
            hashMap.put(Class7521.field29353, value3);
            hashMap.put(Class7521.field29354, value3);
            hashMap.put(Class7521.field29355, value3);
            hashMap.put(Class7521.field29356, value3);
            hashMap.put(Class7521.field29357, value3);
            hashMap.put(Class7521.field29358, value3);
            hashMap.put(Class7521.field29359, value3);
            hashMap.put(Class7521.field29360, value3);
            hashMap.put(Class7521.field29361, value3);
            hashMap.put(Class7521.field29411, value3);
            hashMap.put(Class7521.field29498, value3);
            hashMap.put(Class7521.field29499, value3);
            hashMap.put(Class7521.field29500, value3);
            hashMap.put(Class7521.field29501, value3);
            hashMap.put(Class7521.field29502, value3);
            hashMap.put(Class7521.field29503, value3);
            hashMap.put(Class7521.field29504, value3);
            hashMap.put(Class7521.field29505, value3);
            hashMap.put(Class7521.field29506, value3);
            hashMap.put(Class7521.field29507, value3);
            hashMap.put(Class7521.field29508, value3);
            hashMap.put(Class7521.field29509, value3);
            hashMap.put(Class7521.field29510, value3);
            hashMap.put(Class7521.field29511, value3);
            hashMap.put(Class7521.field29512, value3);
            hashMap.put(Class7521.field29513, value3);
            hashMap.put(Class7521.field29516, value3);
            hashMap.put(Class7521.field29825, value3);
            hashMap.put(Class7521.field29641, value3);
            hashMap.put(Class7521.field29765, value3);
            return;
        });
        field32748 = Class8349.method27851(Maps.newHashMap(), hashMap2 -> {
            Class6332.method18765();
            final Class6332 class6332;
            hashMap2.put(Class7558.field29975, class6332);
            hashMap2.put(Class7558.field29976, class6332);
        });
    }
}
