/* Class202 - Decompiled by JODE
 * 
 */

public class Class202
{
	static int anInt2447;
	static int[] anIntArray2448 = new int[200];
	
	public static void method2026(int i) {
		anIntArray2448 = null;
		if (i != 200) {
			anIntArray2448 = null;
		}
	}
	
	static final void method2027(int i) {
		if (i != 200) {
			anIntArray2448 = null;
		}
		Class214.anInt2513++;
		anInt2447++;
		OutgoingPacketBuffer node_sub13 = PacketParser.createOutgoingPacket(i + -586, Class312.aClass318_3976, Class218.aClass123_2566.issacKeys);
		node_sub13.currentOutgoingPacket.writeByte(Class188_Sub2_Sub1.getDisplayMode(3));
		node_sub13.currentOutgoingPacket.writeShort(Class360.screenWidth);
		node_sub13.currentOutgoingPacket.writeShort(Class205.screenHeight);
		node_sub13.currentOutgoingPacket.writeByte(Class213.aNode_Sub27_2512.aClass320_Sub13_7283.method3734(false));
		Class218.aClass123_2566.sendPacket(i ^ 0xb7, node_sub13);
	}
}
