// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;

public class Class8970
{
    public static final Class7113 field37719;
    public static final Class7113 field37720;
    public static final Class7113 field37721;
    public static final Class7113 field37722;
    public static final Class7113 field37723;
    public static final Class7113 field37724;
    public static final Class7113 field37725;
    public static final Class7113 field37726;
    public static final Class7113 field37727;
    public static final Class7113 field37728;
    public static final Class7113 field37729;
    public static final Class7113 field37730;
    public static final Class7113 field37731;
    public static final Class7113 field37732;
    public static final Class7113 field37733;
    public static final Class7113 field37734;
    public static final Class7113 field37735;
    public static final Class7113 field37736;
    public static final Class7113 field37737;
    public static final Class7113 field37738;
    public static final Class7113 field37739;
    public static final Class7113 field37740;
    public static final Class7113 field37741;
    public static final Class7113 field37742;
    public static final Class7113 field37743;
    public static final Class7113 field37744;
    public static final Class7113 field37745;
    public static final Class7113 field37746;
    public static final Class7113 field37747;
    public static final Class7114<Class111> field37748;
    public static final Class7114<Class111> field37749;
    public static final Class7113 field37750;
    public static final Class7113 field37751;
    public static final Class7113 field37752;
    public static final Class7113 field37753;
    public static final Class7113 field37754;
    public static final Class7113 field37755;
    public static final Class7115 field37756;
    public static final Class7115 field37757;
    public static final Class7115 field37758;
    public static final Class7114<Class107> field37759;
    public static final Class7114<Class108> field37760;
    public static final Class7114<Class106> field37761;
    public static final Class7114<Class106> field37762;
    public static final Class7114<Class106> field37763;
    public static final Class7114<Class106> field37764;
    public static final Class7114<Class182> field37765;
    public static final Class7114<Class109> field37766;
    public static final Class7114<Class104> field37767;
    public static final Class7114<Class104> field37768;
    public static final Class7112 field37769;
    public static final Class7112 field37770;
    public static final Class7112 field37771;
    public static final Class7112 field37772;
    public static final Class7112 field37773;
    public static final Class7112 field37774;
    public static final Class7112 field37775;
    public static final Class7112 field37776;
    public static final Class7112 field37777;
    public static final Class7112 field37778;
    public static final Class7112 field37779;
    public static final Class7112 field37780;
    public static final Class7112 field37781;
    public static final Class7112 field37782;
    public static final Class7112 field37783;
    public static final Class7112 field37784;
    public static final Class7112 field37785;
    public static final Class7112 field37786;
    public static final Class7112 field37787;
    public static final Class7112 field37788;
    public static final Class7112 field37789;
    public static final Class7112 field37790;
    public static final Class7112 field37791;
    public static final Class7112 field37792;
    public static final Class7112 field37793;
    public static final Class7114<Class105> field37794;
    public static final Class7114<Class180> field37795;
    public static final Class7114<Class110> field37796;
    public static final Class7114<Class187> field37797;
    public static final Class7114<Class185> field37798;
    public static final Class7114<Class178> field37799;
    public static final Class7114<Class186> field37800;
    public static final Class7114<Class183> field37801;
    public static final Class7114<Class102> field37802;
    public static final Class7114<Class184> field37803;
    
    static {
        field37719 = Class7113.method21834("attached");
        field37720 = Class7113.method21834("bottom");
        field37721 = Class7113.method21834("conditional");
        field37722 = Class7113.method21834("disarmed");
        field37723 = Class7113.method21834("drag");
        field37724 = Class7113.method21834("enabled");
        field37725 = Class7113.method21834("extended");
        field37726 = Class7113.method21834("eye");
        field37727 = Class7113.method21834("falling");
        field37728 = Class7113.method21834("hanging");
        field37729 = Class7113.method21834("has_bottle_0");
        field37730 = Class7113.method21834("has_bottle_1");
        field37731 = Class7113.method21834("has_bottle_2");
        field37732 = Class7113.method21834("has_record");
        field37733 = Class7113.method21834("has_book");
        field37734 = Class7113.method21834("inverted");
        field37735 = Class7113.method21834("in_wall");
        field37736 = Class7113.method21834("lit");
        field37737 = Class7113.method21834("locked");
        field37738 = Class7113.method21834("occupied");
        field37739 = Class7113.method21834("open");
        field37740 = Class7113.method21834("persistent");
        field37741 = Class7113.method21834("powered");
        field37742 = Class7113.method21834("short");
        field37743 = Class7113.method21834("signal_fire");
        field37744 = Class7113.method21834("snowy");
        field37745 = Class7113.method21834("triggered");
        field37746 = Class7113.method21834("unstable");
        field37747 = Class7113.method21834("waterlogged");
        field37748 = Class7114.method21839("axis", Class111.class, Class111.field351, Class111.field353);
        field37749 = Class7114.method21837("axis", Class111.class);
        field37750 = Class7113.method21834("up");
        field37751 = Class7113.method21834("down");
        field37752 = Class7113.method21834("north");
        field37753 = Class7113.method21834("east");
        field37754 = Class7113.method21834("south");
        field37755 = Class7113.method21834("west");
        field37756 = Class7115.method21842("facing", Class179.field513, Class179.field516, Class179.field514, Class179.field515, Class179.field512, Class179.field511);
        field37757 = Class7115.method21841("facing", class179 -> class179 != Class179.field512);
        field37758 = Class7115.method21841("facing", Class98.field268);
        field37759 = Class7114.method21837("face", Class107.class);
        field37760 = Class7114.method21837("attachment", Class108.class);
        field37761 = Class7114.method21837("east", Class106.class);
        field37762 = Class7114.method21837("north", Class106.class);
        field37763 = Class7114.method21837("south", Class106.class);
        field37764 = Class7114.method21837("west", Class106.class);
        field37765 = Class7114.method21837("half", Class182.class);
        field37766 = Class7114.method21837("half", Class109.class);
        field37767 = Class7114.method21837("shape", Class104.class);
        field37768 = Class7114.method21838("shape", Class104.class, class180 -> {
            final boolean b;
            if (class180 != Class104.field320) {
                if (class180 != Class104.field319) {
                    if (class180 != Class104.field317) {
                        if (class180 != Class104.field318) {
                            return b;
                        }
                    }
                }
            }
            return b;
        });
        field37769 = Class7112.method21832("age", 0, 1);
        field37770 = Class7112.method21832("age", 0, 2);
        field37771 = Class7112.method21832("age", 0, 3);
        field37772 = Class7112.method21832("age", 0, 5);
        field37773 = Class7112.method21832("age", 0, 7);
        field37774 = Class7112.method21832("age", 0, 15);
        field37775 = Class7112.method21832("age", 0, 25);
        field37776 = Class7112.method21832("bites", 0, 6);
        field37777 = Class7112.method21832("delay", 1, 4);
        field37778 = Class7112.method21832("distance", 1, 7);
        field37779 = Class7112.method21832("eggs", 1, 4);
        field37780 = Class7112.method21832("hatch", 0, 2);
        field37781 = Class7112.method21832("layers", 1, 8);
        field37782 = Class7112.method21832("level", 0, 3);
        field37783 = Class7112.method21832("level", 0, 8);
        field37784 = Class7112.method21832("level", 1, 8);
        field37785 = Class7112.method21832("honey_level", 0, 5);
        field37786 = Class7112.method21832("level", 0, 15);
        field37787 = Class7112.method21832("moisture", 0, 7);
        field37788 = Class7112.method21832("note", 0, 24);
        field37789 = Class7112.method21832("pickles", 1, 4);
        field37790 = Class7112.method21832("power", 0, 15);
        field37791 = Class7112.method21832("stage", 0, 1);
        field37792 = Class7112.method21832("distance", 0, 7);
        field37793 = Class7112.method21832("rotation", 0, 15);
        field37794 = Class7114.method21837("part", Class105.class);
        field37795 = Class7114.method21837("type", Class180.class);
        field37796 = Class7114.method21837("mode", Class110.class);
        field37797 = Class7114.method21837("hinge", Class187.class);
        field37798 = Class7114.method21837("instrument", Class185.class);
        field37799 = Class7114.method21837("type", Class178.class);
        field37800 = Class7114.method21837("type", Class186.class);
        field37801 = Class7114.method21837("shape", Class183.class);
        field37802 = Class7114.method21837("mode", Class102.class);
        field37803 = Class7114.method21837("leaves", Class184.class);
    }
}
