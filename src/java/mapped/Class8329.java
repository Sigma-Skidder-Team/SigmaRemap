// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import com.google.common.base.Optional;
import java.util.Map;

public class Class8329
{
    private static String[] field34208;
    private static Map<Integer, Integer> field34209;
    
    private static void method27765(final int i, final int j) {
        Class8329.field34209.put(i, j);
    }
    
    public static Optional<Integer> method27766(final int i) {
        return (Optional<Integer>)Optional.fromNullable((Object)Class8329.field34209.get(i));
    }
    
    static {
        Class8329.field34209 = new HashMap<Integer, Integer>();
        method27765(6, 7);
        method27765(7, 8);
        method27765(8, 9);
        method27765(9, 10);
        method27765(10, 11);
        method27765(11, 12);
        method27765(12, 13);
        method27765(13, 14);
        method27765(14, 15);
        method27765(15, 16);
        method27765(16, 17);
        method27765(17, 18);
        method27765(18, 19);
        method27765(19, 20);
        method27765(20, 21);
        method27765(21, 22);
        method27765(22, 23);
        method27765(23, 24);
        method27765(24, 25);
        method27765(25, 26);
        method27765(26, 28);
        method27765(27, 29);
        method27765(28, 30);
        method27765(29, 31);
        method27765(30, 32);
        method27765(31, 33);
        method27765(32, 34);
        method27765(33, 35);
        method27765(34, 36);
        method27765(35, 37);
        method27765(36, 38);
        method27765(37, 39);
        method27765(38, 40);
        method27765(39, 41);
        method27765(40, 42);
        method27765(41, 43);
        method27765(42, 44);
        method27765(43, 45);
        method27765(44, 46);
        method27765(45, 47);
        method27765(46, 48);
        method27765(47, 49);
        method27765(48, 6);
        method27765(49, 51);
        method27765(50, 53);
        method27765(51, 54);
        method27765(52, 55);
        method27765(53, 56);
        method27765(54, 57);
        method27765(55, 58);
        method27765(56, 59);
        method27765(57, 60);
        method27765(58, 61);
        method27765(59, 62);
        method27765(60, 63);
        method27765(61, 64);
        method27765(62, 65);
        method27765(63, 66);
        method27765(64, 67);
        method27765(65, 68);
        method27765(66, 69);
        method27765(67, 70);
        method27765(68, 71);
        method27765(69, 72);
        method27765(70, 73);
        method27765(71, 74);
        method27765(72, 76);
        method27765(73, 77);
        method27765(74, 78);
        method27765(75, 79);
        method27765(76, 80);
        method27765(77, 81);
        method27765(78, 83);
        method27765(79, 84);
        method27765(80, 85);
        method27765(81, 86);
        method27765(82, 89);
        method27765(83, 90);
        method27765(84, 91);
        method27765(85, 92);
        method27765(86, 93);
        method27765(87, 94);
        method27765(88, 95);
        method27765(89, 96);
        method27765(90, 97);
        method27765(91, 99);
        method27765(92, 100);
        method27765(93, 101);
        method27765(94, 82);
    }
}
