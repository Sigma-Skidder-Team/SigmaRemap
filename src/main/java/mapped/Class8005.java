// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ConcurrentHashMap;
import com.google.common.base.Optional;
import java.util.Map;

public class Class8005
{
    private static String[] field32967;
    private static Map<Integer, Integer> field32968;
    
    private static void method26201(final int i, final int j) {
        Class8005.field32968.put(i, j);
    }
    
    public static Optional<Integer> method26202(final int i) {
        return (Optional<Integer>)Optional.fromNullable((Object)Class8005.field32968.get(i));
    }
    
    static {
        Class8005.field32968 = new ConcurrentHashMap<Integer, Integer>();
        method26201(1, 32);
        method26201(2, 22);
        method26201(3, 0);
        method26201(4, 15);
        method26201(5, 84);
        method26201(6, 71);
        method26201(7, 74);
        method26201(8, 35);
        method26201(9, 49);
        method26201(10, 2);
        method26201(11, 67);
        method26201(12, 34);
        method26201(13, 65);
        method26201(14, 75);
        method26201(15, 23);
        method26201(16, 77);
        method26201(17, 76);
        method26201(18, 33);
        method26201(19, 85);
        method26201(20, 55);
        method26201(21, 24);
        method26201(22, 25);
        method26201(23, 30);
        method26201(24, 68);
        method26201(25, 60);
        method26201(26, 13);
        method26201(27, 89);
        method26201(28, 63);
        method26201(29, 88);
        method26201(30, 1);
        method26201(31, 11);
        method26201(32, 46);
        method26201(33, 20);
        method26201(34, 21);
        method26201(35, 78);
        method26201(36, 81);
        method26201(37, 31);
        method26201(40, 41);
        method26201(41, 5);
        method26201(42, 39);
        method26201(43, 40);
        method26201(44, 42);
        method26201(45, 45);
        method26201(46, 43);
        method26201(47, 44);
        method26201(50, 10);
        method26201(51, 62);
        method26201(52, 69);
        method26201(53, 27);
        method26201(54, 87);
        method26201(55, 64);
        method26201(56, 26);
        method26201(57, 53);
        method26201(58, 18);
        method26201(59, 6);
        method26201(60, 61);
        method26201(61, 4);
        method26201(62, 38);
        method26201(63, 17);
        method26201(64, 83);
        method26201(65, 3);
        method26201(66, 82);
        method26201(67, 19);
        method26201(68, 28);
        method26201(69, 59);
        method26201(200, 16);
        method26201(90, 51);
        method26201(91, 58);
        method26201(92, 9);
        method26201(93, 7);
        method26201(94, 70);
        method26201(95, 86);
        method26201(96, 47);
        method26201(97, 66);
        method26201(98, 48);
        method26201(99, 80);
        method26201(100, 29);
        method26201(101, 56);
        method26201(102, 54);
        method26201(103, 36);
        method26201(104, 37);
        method26201(105, 50);
        method26201(120, 79);
    }
}
