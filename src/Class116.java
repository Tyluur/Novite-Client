/* Class116 - Decompiled by JODE
 * 
 */

public class Class116 implements Interface7
{
	protected int anInt5071;
	static boolean aBoolean5072 = false;
	static OutgoingPacket grandexchangeSelection = new OutgoingPacket(13, 2);
	static int anInt5074;
	static Class94 aClass94_5075 = new Class94();
	static float aFloat5076;
	static int anInt5077;
	
	public final Class170 method20(int i) {
		anInt5074++;
		if (i < 81) {
			grandexchangeSelection = null;
		}
		return Node_Sub40.aClass170_7508;
	}
	
	public static void method1162(int i) {
		grandexchangeSelection = null;
		if (i >= 44) {
			aClass94_5075 = null;
		}
	}
	
	static final void method1163(int i) {
		GameStub.anInt49 = (int) (34.46 * (double) Node_Sub54.GAME_SCENE_WDITH);
		Class22.anInt430 = 200;
		anInt5077++;
		GameStub.anInt49 <<= i;
		if (Class93.aGraphicsToolkit1241.p()) {
			GameStub.anInt49 += 512;
		}
		Class377_Sub1.method4130(false, -10385);
	}
	
	Class116(int i) {
		anInt5071 = i;
	}
}
